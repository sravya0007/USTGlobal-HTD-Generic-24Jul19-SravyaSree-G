import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-fruitsdetails',
  templateUrl: './fruitsdetails.component.html',
  styleUrls: ['./fruitsdetails.component.css']
})
export class FruitsdetailsComponent implements OnInit {

  @Input() fruitsDetails:any='';
  constructor() { }

  ngOnInit() {
  }

}
