import { Component, OnInit } from '@angular/core';
import { CarbaseService } from '../carbase.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cardel',
  templateUrl: './cardel.component.html',
  styleUrls: ['./cardel.component.css']
})
export class CardelComponent implements OnInit {

  constructor(private carBase: CarbaseService, private router: Router) { }
  ngOnInit() {
     this.carBase.getData();
     console.log(this.carBase.cars);
    }
     deleteCar(car) {
      this.carBase.deleteData(car).subscribe((data) => {
     console.log(data);
     this.carBase.getData();
      });
     }
 }
   
  