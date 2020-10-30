import { Component, OnInit } from '@angular/core';
import {Praticien} from '../model/praticien';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {PraticienService} from '../praticien/praticien.service';
import {ActivatedRoute} from '@angular/router';
import {CommonService} from '../common.service';
import {RecherchePraticienNomSpeService} from '../recherche-par-nom-ou-specialite/recherche-par-nom-ou-specialite.service';
import {RechercheMultiCriteresService} from './recherche-multi-criteres.service';

@Component({
  selector: 'app-recherche-multi-criteres',
  templateUrl: './recherche-multi-criteres.component.html',
  styleUrls: ['./recherche-multi-criteres.component.scss']
})
export class RechercheMultiCriteresComponent implements OnInit {

  praticienList: Array<Praticien> = new Array<Praticien>();
  civilites: Array<string> = new Array<string>();


  constructor(private praticienService: PraticienService, private route: ActivatedRoute, private commonService: CommonService, private multiService: RechercheMultiCriteresService) {
    this.route.params.subscribe(params => {
      this.multiService.findAllBySpecialiteOuNomOuVille(params.nom, params.ville).subscribe(resp => this.praticienList = resp, error => console.log(error)); });
  }


  ngOnInit(): void {
    this.commonService.findAllCivilites().subscribe(resp => this.civilites = resp, err => console.log(err));
  }

  list(): Array<Praticien> {
    return this.praticienService.findAll();
  }

}
