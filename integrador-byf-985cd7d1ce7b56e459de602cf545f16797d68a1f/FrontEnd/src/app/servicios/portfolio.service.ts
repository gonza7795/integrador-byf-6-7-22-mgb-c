import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { persona } from '../model/persona.model';


@Injectable({
  providedIn: 'root'
})
export class PortfolioService {


  URL ='http://localhost:8080/personas/' ;






  constructor(private http:HttpClient) { }


  public getPersona(): Observable<persona> {

     return this.http.get<persona>(this.URL+'traer/perfil');





  }

 //obtenerDatos():Observable<any> {
   // return this.http.get('./assets/data/data.json');


    //console.log("el servicio de obtener datos esta funcionando");
  //}
}
