import { Component, OnInit ,Input} from '@angular/core';

@Component({
  selector: 'app-ktm-details',
  templateUrl: './ktm-details.component.html',
  styleUrls: ['./ktm-details.component.css']
})
export class KtmDetailsComponent implements OnInit {

  @Input() bikeDetails:any='';
  constructor() { }

  ngOnInit() {
  }

}
