import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { product} from './productdetails/product';
import { map } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class ProductService {
  
  url="https://product-e6613.firebaseio.com/";
  product= [];
  selectedProduct={
    name: null,
    image: null,
        
    desc: null

  }

  constructor(private http:HttpClient) { }
  postProduct(data){
    return this.http.post(`${this.url}/product.json`, data);
   }
   //to get the data
  getData() {
    this.http.get<any>(`${this.url}/product.json`).pipe(map(resData=>{
      let productArray=[];
      for(let key in resData){
        productArray.push({...resData[key],id: key});
      }
  
      return productArray;
   
    })).subscribe(data=>{
      this.product=data;
      console.log(data);
    },err=>{
  console.log(err);
    });
    }
    updateData(data){
      return this.http.put(`${this.url}product/${data.id}.json`,data);}
     // tslint:disable-next-line: adjacent-overload-signatures
     deleteData(data){
      return this.http.delete(`${this.url}product/${data.id}.json`);
     }
   
  
}
