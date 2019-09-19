import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
//to get method
import { map } from 'rxjs/operators';
import { cars } from './cars/cars';

@Injectable({
  providedIn: 'root'
})
export class CarbaseService {
 
  url="https://nani-89d2f.firebaseio.com/";
  cars=[];
  selectedCars = {
    brand: null,
    model: null,
    yor: null,
    cost: null,
    units_sold:null
  }
  constructor(private http: HttpClient) {}

  postData(data){
    return this.http.post(`${this.url}/cars.json`, data);
   }
   getData(){
    //to get the data
    this.http.get<any>(`${this.url}cars.json`).pipe(map(resData=>{
    let carsArray=[];
    for(let key in resData){
      carsArray.push({...resData[key],id: key});
    }

    return carsArray;
 
  })).subscribe(data=>{
    this.cars=data;
    console.log(data);
  },err=>{
console.log(err);
  });
 }
 updateData(data){
   return this.http.put(`${this.url}cars/${data.id}.json`,data);}
  deleteData(data){
   return this.http.delete(`${this.url}cars/${data.id}.json`);
  }



}