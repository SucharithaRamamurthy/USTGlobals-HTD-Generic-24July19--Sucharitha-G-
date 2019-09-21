import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  indianNews: any[] =[];

  constructor(private http: HttpClient) { 
    http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=59b5d9f15cdc4e849364ae924e2baa1c')
    .subscribe(resData =>{
      this.indianNews = resData.articles;
     console.log(this.indianNews);
    })
  }

  ngOnInit() {
  }

}
