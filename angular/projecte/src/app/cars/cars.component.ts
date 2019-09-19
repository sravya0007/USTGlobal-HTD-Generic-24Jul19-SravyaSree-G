import { Component, OnInit } from '@angular/core';
import {CarbaseService} from '../carbase.service';
import { Router} from '@angular/router';


@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {

  constructor(private carBase: CarbaseService, private router: Router) { }
  ngOnInit() {
     this.carBase.getData();
     console.log(this.carBase.cars);
  
   }
    updateCarr(car) {
      this.carBase.selectedCars = car;
      this.router.navigateByUrl('/carbase');
    }
    deleteCar(car) {
       this.carBase.deleteData(car).subscribe((data) => {
      console.log(data);
      this.carBase.getData();
       });
      }
  }