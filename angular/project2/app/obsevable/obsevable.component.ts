import { Component, OnInit } from '@angular/core';
import { Userservice } from '../user.service';
import { Subscription } from 'rxjs';
import { map } from 'rxjs/Operators';

@Component({
  selector: 'app-obsevable',
  templateUrl: './obsevable.component.html',
  styleUrls: ['./obsevable.component.css']
})
export class ObsevableComponent implements OnInit,OnDestroy {
mySubscription:Subscription;
  constructor(userService: Userservice) { }

  ngOnInit(){ 
       this.mySubscription = interval(1000).pipe(map(data =>{ return data*10;
      })).subscribe(data=>{
    console.log(data);
  }, err=> {
    console.log(err);
  }, ()=>{
    console.log('subscription complete');
   });
  }
  ngOnDestroy(){
    this.mySubscription.unsubscribe();

  }

}
