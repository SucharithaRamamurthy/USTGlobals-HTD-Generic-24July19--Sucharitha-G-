import { Component} from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent  {
  name = 'bhavana';
  textClasses = 'bg-success text-black';
imgURL = 'https://cdn.pixabay.com/photo/2019/08/06/12/15/panama-4388225__340.jpg'
  constructor() { }

 

}
