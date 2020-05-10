import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SketchpadComponent } from './components/sketchpad/sketchpad.component';
import { AppComponent } from './app.component';

const routes: Routes = [
  {
    path: 'sketchpad', component: SketchpadComponent
    
},
{
  path: '', component: AppComponent
},
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { useHash: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
