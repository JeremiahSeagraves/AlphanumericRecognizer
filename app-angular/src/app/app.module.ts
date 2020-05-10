import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { SignaturePadModule } from 'angular2-signaturepad';
import { SketchpadComponent } from './components/sketchpad/sketchpad.component';

@NgModule({
  declarations: [
    AppComponent,
    SketchpadComponent
    ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SignaturePadModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
