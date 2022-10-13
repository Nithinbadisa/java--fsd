import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppService } from './myaadhar/myaadhar.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MyAadharComponent } from './myaadhar/myaadhar.component';
import { AdminComponent } from './admin/admin.component';
import { HomeComponent } from './home/home.component';
import { UserComponent } from './user/user.component';
import { RouterModule, Routes } from '@angular/router';
import { MyAadhar2Component } from './myaadhar2/myaadhar2.component';

const appRoutes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'user', component: UserComponent },
  { path: 'myaadhar', component: MyAadharComponent },
  { path: 'myaadhar2', component: MyAadhar2Component },


];

@NgModule({
  declarations: [
    AppComponent,
    MyAadharComponent,
    AdminComponent,
    HomeComponent,
    UserComponent,
    MyAadhar2Component
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [AppService],
  bootstrap: [AppComponent]
})
export class AppModule { }
