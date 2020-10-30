import { Component, OnInit } from '@angular/core';
import {Praticien} from '../model/praticien';
import {HttpClient} from '@angular/common/http';
import {PraticienService} from '../praticien/praticien.service';
import {RecherchePraticienService} from './recherche-praticien.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-recherche-praticien',
  templateUrl: './recherche-praticien.component.html',
  styleUrls: ['./recherche-praticien.component.scss']
})
export class RecherchePraticienComponent implements OnInit {

  nom: string;
  ville: string;
  nomReset: string;
  villeReset: string;
  url: string;
  civilites: Array<string> = new Array<string>();

  constructor(private http: HttpClient, private praticienService: PraticienService, private recherchePraticienService: RecherchePraticienService) {
  }

  ngOnInit(): void {
    this.nomReset = '';
    this.villeReset = '';
  }


  search() {
    this.nomReset = this.nom;
    this.villeReset = this.ville;

    console.log(this.nom);
    console.log(this.ville);

    if (this.nomReset === undefined && this.villeReset === undefined) {
      window.location.href = 'praticien';
    }
    else if (this.nomReset === undefined && this.villeReset !== null) {
      window.location.href = 'praticien/recherche-par-ville/' + this.villeReset;
    }
    else if (this.nomReset !== null && this.villeReset === undefined) {
      window.location.href = 'praticien/recherche-par-nom-ou-specialite/' + this.nomReset;
    }
    else if (this.nomReset !== null && this.villeReset !== null) {
      window.location.href = 'praticien/recherche-multi-criteres/' + this.nomReset + '/' + this.villeReset;
    }
    else {
      window.location.href = 'praticien';
    }


  }
}


