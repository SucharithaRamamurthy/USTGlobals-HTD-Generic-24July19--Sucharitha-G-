import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {
  carData:any='';
  cars=[
    {
      brand:'audi',
      img:'https://cdn.pixabay.com/photo/2016/12/07/21/50/audi-1890494__340.jpg',
      description:'Audi is a member of the Volkswagen Group and has its roots at Ingolstadt, Bavaria, Germany'
    },
    {
      brand:'BMW',
      img:'https://cdn.pixabay.com/photo/2018/02/21/03/15/bmw-m4-3169357__340.jpg',
      description:'Automobiles are marketed under the brands BMW, Mini and Rolls-Royce, and motorcycles are marketed under the brand BMW Motorrad.'
    },
    {
      brand:'Suzuki',
      img:'https://cdn.pixabay.com/photo/2019/06/29/09/51/suzuki-sx4-4305877__340.jpg',
      description:'its swift car of new edition'
    },
    
    {
      brand:'Mercedes',
      img:'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg',
      description:'mercedes benz provides this edition with high features'
    },
    
    {
      brand:'Maruti',
      img:'https://image.shutterstock.com/image-photo/blue-compact-suv-car-sport-260nw-764866978.jpg',
      description:'every time any where old is gold maruti'
    },
    {
      brand:'Toyato',
      img:'https://cdn.pixabay.com/photo/2017/11/12/16/32/toyota-land-cruiser-2943058__340.jpg',
      description:'having the best selling and comfortable ratings'
    },
    {
      brand:'Ferari',
      img:'https://cdn.pixabay.com/photo/2012/04/12/23/48/car-30990__340.png',
      description:'Its an foreign car,which is now importing to india'
    }
  ];
  constructor() { }
  sendCar(car){
    this.carData=car;
  }
  ngOnInit() {
  }

}
