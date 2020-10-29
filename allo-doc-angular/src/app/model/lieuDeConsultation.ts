import {Adresse} from './adresse';

export class LieuDeConsultation {
  id: number;
  version: number;
  nom: string;
  adresse: Adresse;


  constructor(id: number, version: number, nom: string, adresse: Adresse) {
    this.id = id;
    this.version = version;
    this.nom = nom;
    this.adresse = adresse;
  }
}
