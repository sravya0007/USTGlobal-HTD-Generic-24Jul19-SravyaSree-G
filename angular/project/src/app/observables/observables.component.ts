import { Component, OnInit, OnDestroy } from '@angular/core';
import {UserService} from '../user.service';
import { provideRoutes } from '@angular/router';
import { interval } from 'rxjs';
// import {  Injectable } from '@angular/core';
// import { map} from '@rxjs/operators';



@Component({
  selector: 'app-observables',
  templateUrl: './observables.component.html',
  styleUrls: ['./observables.component.css']
})
export class ObservablesComponent implements OnInit {
mySubscription
  constructor(private userService: UserService) {
    
   }

  ngOnInit() {
    this.mySubscription= interval(1000).subscribe(data=>{
console.log(data);
    },err=>{
      console.log(err);
    },()=>{
      console.log('subscription complete');
    
    }
    )
    
  }


ngDestroy(){
  this.mySubscription.unsubscribe();

}
}
