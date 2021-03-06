import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { AboutComponent } from './about/about.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { ObservablesComponent } from './observables/observables.component';
import { ObsevableComponent } from './obsevable/obsevable.component';
import { Userservice } from './user.service';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    RegisterComponent,
    LoginComponent,
    AboutComponent,
    PageNotFoundComponent,
    ObservablesComponent,
    ObsevableComponent
   
  ],
  imports: [
     BrowserModule, RouterModule.forRoot([
      { path: '',component: HomeComponent },
      { path: 'about',component: AboutComponent },
      { path: 'login',component: LoginComponent },
       { path: 'register',component: RegisterComponent},
       { path: '**',component:PageNotFoundComponent},
       { path: 'observables',component:ObservablesComponent}
 ]),
 FormsModule,
 ReactiveFormsModule
],
  providers: [Userservice],
  bootstrap: [AppComponent]
})
export class AppModule { }
