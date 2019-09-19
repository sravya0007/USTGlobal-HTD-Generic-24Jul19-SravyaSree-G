import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-assign2',
  templateUrl: './assign2.component.html',
  styleUrls: ['./assign2.component.css']
})
export class Assign2Component implements OnInit {

  s: any[] = [];
  
  constructor(private http: HttpClient) {
    http.get<any>('http://jsonplaceholder.typicode.com/posts')
    .subscribe(resData => {
      this.s = resData;
      //console.log(this.s);

     
    });
  }
  ngOnInit() {
  }
}
