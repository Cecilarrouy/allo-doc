import { Injectable } from '@angular/core';
import {Praticien} from '../model/praticien';
import {Utilisateur} from '../model/utilisateur';
import {Personne} from '../model/personne';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SeConnecterService {

  private utilisateurs: Array<Utilisateur> = new Array<Utilisateur>();
  private personnes: Array<Personne> = new Array<Personne>();

  constructor(private http: HttpClient) {
    this.load();
  }

  load() {
    this.http.get<Array<Utilisateur>>("http://localhost:8080/user").subscribe(resp => {
      this.utilisateurs = resp;
    }, error => console.log(error));
  }

  findAll(): Array<Utilisateur> {
    return this.utilisateurs;
  }

  findByIdentifiant(identifiant): Observable <Array<Utilisateur>> {
    return this.http.get<Array<Utilisateur>>('http://localhost:8080/user/se-connecter/' + identifiant);
  }

}
