export class RendezVous {

  id: number;
  version: number;
  dtRendezVous: Date;
  conclusion: string;
  statut: string;

  constructor(id: number, version: number, dtRendezVous: Date, conclusion: string, statut: string) {
    this.id = id;
    this.version = version;
    this.dtRendezVous = dtRendezVous;
    this.conclusion = conclusion;
    this.statut = statut;
  }


}
