import {Personne} from './personne';
import {Adresse} from "./adresse";

export class Patient extends Personne {
  numSS: string;
  email: string;
  dtNaissance: Date;

  constructor(id: number, version: number, civilite: string, nom: string, prenom: string, telephone: string, adresse: Adresse, numSS: string) {
    super(id, version, civilite, nom, prenom, telephone, adresse);
    this.numSS = numSS;
  }
}
