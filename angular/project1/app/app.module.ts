import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { SampleComponent } from './sample.component';
import { HeaderComponent } from './header/header.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { BikesComponent } from './bikes/bikes.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { ChildComponent } from './child/child.component';
import { AttributeDirectivesComponent } from './attribute-directives/attribute-directives.component';
import { IfSwitchComponent } from './if-switch/if-switch.component';
import { ParentComponent } from './parent/parent.component';
import { TwoWayComponent } from './two-way/two-way.component'


@NgModule({
  declarations: [
    AppComponent,SampleComponent, HeaderComponent, DataBindingComponent, BikesComponent, BikeDetailsComponent,ChildComponent,AttributeDirectivesComponent,
    IfSwitchComponent,ParentComponent,TwoWayComponent,
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
