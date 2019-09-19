import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
  router: any;


  constructor(private product:ProductService) { }

  postProduct(form: NgForm){
    if(form.value.id){
    this.product.postProduct(form.value).subscribe((resData)=>{
      console.log(resData);
      form.reset();
    },err=>{
      console.log(err);
    })
  } else{
    this.product.postProduct(form.value).subscribe((data)=>{
        console.log(data);
        this.product.getData();
        form.reset();
        this.router.navigateByUrl('/product');

   },(err) =>{
     console.log(err);
   })
 }
 
 }
 } 

