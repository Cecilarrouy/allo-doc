export class MotifsConsultations {
  id: number;
  version: number;
  nom: string;
  nombreCreneau: number;
  tarif: string;


  constructor(id: number, version: number, nom: string, nombreCreneau: number, tarif: string) {
    this.id = id;
    this.version = version;
    this.nom = nom;
    this.nombreCreneau = nombreCreneau;
    this.tarif = tarif;
  }
}
