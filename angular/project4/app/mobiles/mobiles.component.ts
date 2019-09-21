import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {
  mobileData:any='';
  mobiles=[
    {
      brand:'HTC',
      img:'https://cdn.pixabay.com/photo/2015/08/07/00/35/htc-878839__340.jpg',
      description:'had good features but sale is down'
    },
    {
      brand:'Nokia',
      img:'https://cdn.pixabay.com/photo/2013/07/12/16/01/smartphone-150753__340.png',
      description:'well known brand for battery mode popular'
    },
    {
      brand:'oppo',
      img:'https://image.shutterstock.com/image-vector/smartphone-mobile-phone-isolated-realistic-260nw-703670326.jpg',
      description:'company where design of phones is not appreciable by customers but features do'
    },
    {
      brand:'one-plus',
      img:'https://cdn.pixabay.com/photo/2018/08/02/00/02/oneplus-3578574__340.jpg',
      description:'having most picture clarity as featured in iphone'
    },
    {
      brand:'motorola',
      img:'https://cdn.pixabay.com/photo/2015/09/21/01/03/smartphone-949123__340.jpg',
      description:'A first company to built smart phone'
    },
    {
      brand:'Samsung',
      img:'https://cdn.pixabay.com/photo/2016/03/27/19/43/smartphone-1283938__340.jpg',
      description:'A leading phone brand'
    },
    {
      brand:'IphoneX',
      img:'https://cdn.pixabay.com/photo/2017/12/25/20/14/iphone-3039062__340.jpg',
      description:'Its an IOS version from Apple trending in market'
    }
  ]
  constructor() { }
  sendMobile(mobile){
    this.mobileData=mobile;
  }
  ngOnInit() {
  }

}
