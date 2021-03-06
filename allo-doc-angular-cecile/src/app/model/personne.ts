import {Adresse} from './adresse';

export class Personne {
  id: number;
  version: number;
  civilite: string;
  nom: string;
  prenom: string;
  telephone: string;
  adresse: Adresse;


  constructor(id?: number, version?: number, civilite?: string, nom?: string, prenom?: string, telephone?: string, adresse?: Adresse) {
    this.id = id;
    this.version = version;
    this.civilite = civilite;
    this.nom = nom;
    this.prenom = prenom;
    this.telephone = telephone;
    this.adresse = adresse;
  }
}
