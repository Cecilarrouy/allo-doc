import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MesRdvPassesComponent } from './mes-rdv-passes.component';

describe('MesRdvPassesComponent', () => {
  let component: MesRdvPassesComponent;
  let fixture: ComponentFixture<MesRdvPassesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MesRdvPassesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MesRdvPassesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
