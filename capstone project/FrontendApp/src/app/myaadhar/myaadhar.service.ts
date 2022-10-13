
import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { environment } from "src/environments/environment";
import { myaadhar } from "./myaadhar";

@Injectable({
    providedIn: 'root'
})

export class AppService{
    private apiServerUrl = environment.apiBaseUrl;

    constructor(private http: HttpClient){ }

   public get():Observable<myaadhar[]>{
    return this.http.get<myaadhar[]>(`${this.apiServerUrl}/aadhar/all`);
   } 

    public findmyaadharById(id:number): Observable<myaadhar>{
        return this.http.get<myaadhar>(`${this.apiServerUrl}/aadhar/find/${id}`);
    }

    public add(x:myaadhar): Observable<myaadhar>{
        return this.http.post<myaadhar>(`${this.apiServerUrl}/aadhar/add`,x);
    }

    public update(x:myaadhar): Observable<myaadhar>{
        return this.http.put<myaadhar>(`${this.apiServerUrl}/aadhar/update`,x);
    }

    public delete(id:number): Observable<void>{
        return this.http.delete<void>(`${this.apiServerUrl}/aadhar/delete/${id}`);
    }


}