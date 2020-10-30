import { Component, OnInit } from '@angular/core';
import {Utilisateur} from '../model/utilisateur';
import {HttpClient} from '@angular/common/http';
import {SeConnecterService} from '../se-connecter/se-connecter.service';
import {ActivatedRoute} from '@angular/router';
import {CommonService} from '../common.service';
import {SeConnecterProService} from './se-connecter-pro.service';

@Component({
  selector: 'app-se-connecter-pro',
  templateUrl: './se-connecter-pro.component.html',
  styleUrls: ['./se-connecter-pro.component.scss']
})
export class SeConnecterProComponent implements OnInit {

  identifiant: string;
  mdp: string;
  private utilisateurs: Array<Utilisateur> = new Array<Utilisateur>();
  civilites: Array<string> = new Array<string>();

  constructor(private http: HttpClient, private seCoProService: SeConnecterProService, private route: ActivatedRoute, private commonService: CommonService) { }

  ngOnInit(): void {
    this.commonService.findAllCivilites().subscribe(resp => this.civilites = resp, err => console.log(err));
  }

  creation() {
    window.location.href = 'creation-pro';
  }

  connexion() {
    window.location.href = 'espace-professionnel';
  }

}
