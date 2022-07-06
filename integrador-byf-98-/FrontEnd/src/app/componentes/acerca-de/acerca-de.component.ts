import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/model/persona.model';
import { PortfolioService } from 'src/app/servicios/portfolio.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {


  persona: persona = new persona("","","");


  constructor(public personaService: PortfolioService)  {}


  ngOnInit(): void {

    this.personaService.getPersona().subscribe(data =>{this.persona = data})
 
    } ;

  }





  //miPortfolio:any;
  //miPortfolio.position:any;

  //constructor(private datosPortfolio: PortfolioService) { }

 // ngOnInit(): void {

   // this.datosPortfolio.obtenerDatos().subscribe(data =>{
     // console.log(data);
      //this.miPortfolio=data;

     // this.miPortfolio.position: any;
  //  } );

  //}


//}
