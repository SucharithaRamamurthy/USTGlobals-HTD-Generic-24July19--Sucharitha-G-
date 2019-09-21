import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-health',
  templateUrl: './health.component.html',
  styleUrls: ['./health.component.css']
})
export class HealthComponent implements OnInit {

  healthNews:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?category=health&apiKey=59b5d9f15cdc4e849364ae924e2baa1c')
    .subscribe(resData => {
      this.healthNews = resData.articles;
    })
  }
  

  ngOnInit() {
  }

}
