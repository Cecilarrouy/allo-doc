import {Personne} from './personne';
import {Adresse} from "./adresse";

export class Patient extends Personne {
  nom: string;
  
  constructor(id: number, version: number, civilite: string, nom: string, prenom: string, telephone: string, adresse: Adresse) {
    super(id, version, civilite, nom, prenom, telephone, adresse);
    this.nom = nom;
  }
}
