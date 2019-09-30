import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {

  carData : any ='';
  cars =
  [
    {
      brand: 'Inovo ' ,
      img : `https://media5.picsearch.com/is?i8N-2KAOM8occfqrbWM3AKB0WqJshwHBUCcnPjN1_Lo&height=191 `,
      description : 'A car is a wheeled motor vehicle used for transportation. Most definitions of car say they run primarily on roads, seat one to eight people, have four tires, and mainly transport people rather than goods'
    },
    {
      brand: ' sports' ,
      img : 'https://media5.picsearch.com/is?l6Bj_lUZGrKz29lBdjn1DM_DxQmqzTHBs0zSKg9N3bs&height=236 ',
      description : 'A car is a wheeled motor vehicle used for transportation. Most definitions of car say they run primarily on roads, seat one to eight people, have four tires, and mainly transport people rather than goods'
    },
    {
      brand: ' Nano' ,
      img : 'https://media2.picsearch.com/is?fKWP1aUDL-tojM40avANfQJQGv4B9Dk01C8vZfliHi0&height=255 ',
      description : 'A car is a wheeled motor vehicle used for transportation. Most definitions of car say they run primarily on roads, seat one to eight people, have four tires, and mainly transport people rather than goods'
    },
     {
       brand: 'sujuki ' ,
       img : 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg ',
       description : 'A car is a wheeled motor vehicle used for transportation. Most definitions of car say they run primarily on roads, seat one to eight people, have four tires, and mainly transport people rather than goods'
     },
    {
      brand: 'Inovo ' ,
      img : 'https://media5.picsearch.com/is?i8N-2KAOM8occfqrbWM3AKB0WqJshwHBUCcnPjN1_Lo&height=191 ',
      description : 'A car is a wheeled motor vehicle used for transportation. Most definitions of car say they run primarily on roads, seat one to eight people, have four tires, and mainly transport people rather than goods'
    }
    
  
  

  ]
  
  constructor() { }
  sendData(car){
    this.carData=car;
    
  }
  
  


  ngOnInit() {
  }

}



