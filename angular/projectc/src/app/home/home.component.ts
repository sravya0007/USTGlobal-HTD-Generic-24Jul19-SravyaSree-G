import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { map } from 'rxjs/operators';
import {HttpClient} from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
//2 to get
users:any=[];
url="https://product-e6613.firebaseio.com/";
  constructor(private product:ProductService) {
    //this.getData();
   }

  ngOnInit() {
  }
  // getData() {
  //   this.http.get<any>(`${this.url}/product.json`).pipe(map(resData=>{
  //     let productArray=[];
  //     for(let key in resData){
  //       productArray.push({...resData[key],id: key});
  //     }
  
  //     return productArray;
   
  //   })).subscribe(data=>{
  //     this.product=data;
  //     console.log(data);
  //   },err=>{
  // console.log(err);
  //   });
  //   }
   //              getData()
  // {
  //   this.product.getData().subscribe(data=>{
  //     this.users=data;

  //   });
  // }

}
