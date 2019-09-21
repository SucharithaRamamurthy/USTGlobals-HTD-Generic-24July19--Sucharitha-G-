import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http'

import { AppComponent } from './app.component';
import { BusinessComponent } from './business/business.component';
import { EntertainmentComponent } from './entertainment/entertainment.component';
import { HealthComponent } from './health/health.component';
import { GeneralComponent } from './general/general.component';
import { ScienceComponent } from './science/science.component';
import { SportsComponent } from './sports/sports.component';
import { TechnologyComponent } from './technology/technology.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    BusinessComponent,
    EntertainmentComponent,
    HealthComponent,
    GeneralComponent,
    ScienceComponent,
    SportsComponent,
    TechnologyComponent,
    HeaderComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      
      {path: 'business',component:BusinessComponent},
      {path: 'entertainment',component:EntertainmentComponent},
      {path: 'health',component:HealthComponent},
      {path: 'general',component:GeneralComponent},
      {path: 'science',component:ScienceComponent},
      {path: 'sports',component:SportsComponent},
      {path: 'technology',component:TechnologyComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
