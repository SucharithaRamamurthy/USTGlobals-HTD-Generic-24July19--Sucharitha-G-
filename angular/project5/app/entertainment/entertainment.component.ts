import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-entertainment',
  templateUrl: './entertainment.component.html',
  styleUrls: ['./entertainment.component.css']
})
export class EntertainmentComponent implements OnInit {

  entertainmentNews:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?category=entertainment&apiKey=59b5d9f15cdc4e849364ae924e2baa1c')
    .subscribe(resData => {
      this.entertainmentNews = resData.articles;
    })
  }

  ngOnInit() {
  }

}
