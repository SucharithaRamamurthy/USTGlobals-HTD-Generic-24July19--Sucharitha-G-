import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-technology',
  templateUrl: './technology.component.html',
  styleUrls: ['./technology.component.css']
})
export class TechnologyComponent implements OnInit {

  technologyNews:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?category=technology&apiKey=59b5d9f15cdc4e849364ae924e2baa1c')
    .subscribe(resData =>{
      this.technologyNews = resData.articles;
    })
  }

  ngOnInit() {
  }

}
