import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
ngOnInit() {
  }

  indianNews: any[] = [];
  constructor(private http: HttpClient) {
  //   http.get<any>('https://newsapi.org/v2/top-headlines?category=general&country=in&apiKey=6b7ed17d4c5d442abeb992bd5eea6677')
  //   .subscribe(resData => {
  //     this.indianNews = resData.articles;
  //     console.log(this.indianNews);
  //   });
  // 
}
  
}
