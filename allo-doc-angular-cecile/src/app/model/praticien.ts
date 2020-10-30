import {Personne} from "./personne";
import {Adresse} from "./adresse";

export class Praticien extends Personne {
  numActivite: number;
  specialitePrincipale: string;
  specialiteSecondaire: string;
  email: string;


  constructor(id?: number, version?: number, civilite?: string, nom?: string, prenom?: string, telephone?: string, adresse?: Adresse, specialitePrincipale?: string,
              specialiteSecondaire?: string, email?: string) {
    super(id, version, civilite, nom, prenom, telephone, adresse);
    this.specialitePrincipale = specialitePrincipale;
    this.specialiteSecondaire = specialiteSecondaire;
    this.email = email;
  }
}
