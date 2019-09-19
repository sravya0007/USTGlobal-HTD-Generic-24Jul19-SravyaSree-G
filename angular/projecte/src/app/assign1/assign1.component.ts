import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-assign1',
  templateUrl: './assign1.component.html',
  styleUrls: ['./assign1.component.css']
})
export class Assign1Component implements OnInit {

  
ws: any[] = [];
  
  constructor(private http: HttpClient) {
    http.get<any>('https://api.github.com/users')
    .subscribe(resData => {
      this.ws = resData;
      

     
    });
  }
  ngOnInit() {
  }

  
}
