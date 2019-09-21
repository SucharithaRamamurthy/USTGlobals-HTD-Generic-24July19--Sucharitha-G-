import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-general',
  templateUrl: './general.component.html',
  styleUrls: ['./general.component.css']
})
export class GeneralComponent implements OnInit {
  generalNews:any[]=[];
  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?category=general&apiKey=59b5d9f15cdc4e849364ae924e2baa1c')
    .subscribe(resData => {
      this.generalNews = resData.articles;
    })
  }
  

  ngOnInit() {
  }

}
