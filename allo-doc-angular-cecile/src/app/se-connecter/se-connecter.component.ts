import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {PraticienService} from '../praticien/praticien.service';
import {Utilisateur} from '../model/utilisateur';
import {SeConnecterService} from './se-connecter.service';
import {ActivatedRoute} from '@angular/router';
import {CommonService} from '../common.service';
import {Praticien} from '../model/praticien';

@Component({
  selector: 'app-se-connecter',
  templateUrl: './se-connecter.component.html',
  styleUrls: ['./se-connecter.component.scss']
})
export class SeConnecterComponent implements OnInit {

  identifiant: string;
  mdp: string;
  private utilisateurs: Array<Utilisateur> = new Array<Utilisateur>();
  civilites: Array<string> = new Array<string>();

  constructor(private http: HttpClient, private seCoService: SeConnecterService, private route: ActivatedRoute, private commonService: CommonService) {
    this.route.params.subscribe(params => {
      this.identifiant = params.identifiant;
      this.seCoService.findByIdentifiant(params.identifiant).subscribe(resp => this.utilisateurs = resp, error => console.log(error)); });
  }


  ngOnInit(): void {
    this.commonService.findAllCivilites().subscribe(resp => this.civilites = resp, err => console.log(err));
  }

  list(): Array<Utilisateur> {
    return this.seCoService.findAll();
  }

  creation() {
    window.location.href = 'creation-perso';
  }

  connexion() {
    window.location.href = 'espace-patient';
  }

}
