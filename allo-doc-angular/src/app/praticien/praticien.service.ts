import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Praticien} from "../model/praticien";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class PraticienService {

  private praticiens: Array<Praticien> = new Array<Praticien>();


  constructor(private http: HttpClient) {
    this.load();
  }

  findAll(): Array<Praticien> {
    return this.praticiens;
  }

  findById(id: number): Observable<Praticien> {
    return this.http.get<Praticien>("http://localhost:8080/praticien/" + id);
  }

  load() {
    this.http.get<Array<Praticien>>("http://localhost:8080/praticien").subscribe(resp => {
      this.praticiens = resp;
    }, error => console.log(error))
  }

  findAllByNom(nom): Observable<Array<Praticien>>{
    return this.http.get<Array<Praticien>>('http://localhost:8080/praticien/par-nom/' + nom)
  }

  findAllByNomOuSpe(nom): Observable<Array<Praticien>>{
    return this.http.get<Array<Praticien>>('http://localhost:8080/praticien/par-nom-ou-spe/' + nom)
  }

  findAllByVille (ville): Observable<Array<Praticien>>{
    return this.http.get<Array<Praticien>>('http://localhost:8080/praticien/par-ville/' + ville)
  }

  findAllByNomOuSpeOuVille(nom, ville): Observable<Array<Praticien>>{
    return this.http.get<Array<Praticien>>('http://localhost:8080/praticien/par-nom-ou-spe/' + nom +'par-ville/' + ville)
  }

}
