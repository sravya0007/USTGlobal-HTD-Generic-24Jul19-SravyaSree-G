import { Component, OnInit } from '@angular/core';
import { CarbaseService } from '../carbase.service';
import { NgForm } from '@angular/forms';

import { from } from 'rxjs';
import {Router} from '@angular/router';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';


@Component({
  selector: 'app-carbase',
  templateUrl: './carbase.component.html',
  styleUrls: ['./carbase.component.css']
})
export class CarbaseComponent {
  router: any;

  constructor(private carbase: CarbaseService) { }

  postCar(form: NgForm){
    if(form.value.id){
    this.carbase.postData(form.value).subscribe((resData)=>{
      console.log(resData);
      form.reset();
    },err=>{
      console.log(err);
    })
  } else{
    this.carbase.postData(form.value).subscribe((data)=>{
        console.log(data);
        this.carbase.getData();
        form.reset();
        this.router.navigateByUrl('/cars');

   },(err) =>{
     console.log(err);
   })
 }
 
 }
 } 