import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Praticien} from '../model/praticien';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RecherchePraticienService {

  private praticiens: Array<Praticien> = new Array<Praticien>();

  constructor(private http: HttpClient) {
    this.load();
  }

  load() {
    this.http.get<Array<Praticien>>("http://localhost:8080/praticien").subscribe(resp => {
      this.praticiens = resp;
    }, error => console.log(error))
  }

  recherchePraticien(nom:string ,ville:string):Observable<Praticien>{
    return this.http.get<Praticien>('http://localhost:8080/api/praticien/' + nom+"|"+ville);
  }

  findAllByNomOuSpeOuVille(nom, ville): Observable<Array<Praticien>>{
    return this.http.get<Array<Praticien>>('http://localhost:8080/praticien/par-nom-ou-spe-ou-ville/' + nom +'|' + ville)
  }
}
