import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeDashboardComponent } from './employee-dashboard/employee-dashboard.component';
import { SigninComponent } from './signin/signin.component';

const routes: Routes = [ 
  {path: "",component:SigninComponent},
{path: "dashboard",component:EmployeeDashboardComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }