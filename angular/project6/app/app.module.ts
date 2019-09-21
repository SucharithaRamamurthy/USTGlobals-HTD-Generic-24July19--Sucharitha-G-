import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { GithubComponent } from './github/github.component';
import { JsonplaceComponent } from './jsonplace/jsonplace.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    GithubComponent,
    JsonplaceComponent,
   
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
            { path: 'github ',component:GithubComponent},
            
           { path: 'jsonplace',component:JsonplaceComponent},
          // { path:'header',component:HeaderComponent}
    ]),
      HttpClientModule,
      FormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
