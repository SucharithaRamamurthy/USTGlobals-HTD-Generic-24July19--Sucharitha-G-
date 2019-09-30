import { Component, OnInit , Input} from '@angular/core';

@Component({
  selector: 'app-cardeateils',
  templateUrl: './cardeateils.component.html',
  styleUrls: ['./cardeateils.component.css']
})
export class CardeateilsComponent implements OnInit {

  constructor() { }
  @Input() carDetails : any = ' ';
  
  ngOnInit() {
  }


}
