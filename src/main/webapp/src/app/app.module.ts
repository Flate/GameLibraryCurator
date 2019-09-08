import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from "@angular/forms";
import { IndexComponent } from './index/index.component';
import { HttpClientModule } from "@angular/common/http";
import { AppRoutingModule } from "./app-routing.module";
import { TopBarComponent } from './top-bar/top-bar.component';
import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './errors/page-not-found/page-not-found.component';


@NgModule({
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ], declarations: [
    AppComponent,
    IndexComponent,
    TopBarComponent,
    LoginComponent,
    PageNotFoundComponent,
  ],
  providers: [],
  bootstrap: [ AppComponent ]
})
export class AppModule {
}
