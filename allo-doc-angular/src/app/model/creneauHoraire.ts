export class CreneauHoraire {
  id: number;
  version: number;
  dtDebut: Date;


  constructor(id: number, version: number, dtDebut: Date) {
    this.id = id;
    this.version = version;
    this.dtDebut = dtDebut;
  }
}
