import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-pracdetails',
  templateUrl: './pracdetails.component.html',
  styleUrls: ['./pracdetails.component.css']
})
export class PracdetailsComponent implements OnInit {
@Input() 
pracDetails:any='';
  constructor() { }

  ngOnInit() {
  }

}
