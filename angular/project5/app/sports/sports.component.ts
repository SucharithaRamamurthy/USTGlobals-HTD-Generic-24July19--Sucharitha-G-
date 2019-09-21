import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sports',
  templateUrl: './sports.component.html',
  styleUrls: ['./sports.component.css']
})
export class SportsComponent implements OnInit {

  sportsNews:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?category=sports&apiKey=59b5d9f15cdc4e849364ae924e2baa1c')
    .subscribe(resData => {
      this.sportsNews = resData.articles;
    })
  }

  ngOnInit() {
  }

}
