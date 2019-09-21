import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Component({
  selector: 'app-science',
  templateUrl: './science.component.html',
  styleUrls: ['./science.component.css']
})
export class ScienceComponent implements OnInit {

  scienceNews:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?category=science&apiKey=59b5d9f15cdc4e849364ae924e2baa1c')
    .subscribe(resData => {
      this.scienceNews = resData.articles;
    })
  }
  

  ngOnInit() {
  }

}
