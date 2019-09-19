import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-way',
  templateUrl: './two-way.component.html',
  styleUrls: ['./two-way.component.css']
})
export class TwoWayComponent implements OnInit {

  ngOnInit() : void{
    console.log('ngOnInit implemented');
  }

  backgroundColor='red';
  constructor() {
console.log('constructor implemented');
   }
  colorChange(){
if(this.backgroundColor=== 'red'){
    this.backgroundColor='blue';}
    else
     {
      this.backgroundColor="grey";
     }
   }
   buttonEvent(data){
     console.log(data);
   }
  //  clrChange(data){
  //    this.backgroundColor=data;
  //  }


}
