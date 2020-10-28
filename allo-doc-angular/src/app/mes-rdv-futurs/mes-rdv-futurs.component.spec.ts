import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MesRdvFutursComponent } from './mes-rdv-futurs.component';

describe('MesRdvFutursComponent', () => {
  let component: MesRdvFutursComponent;
  let fixture: ComponentFixture<MesRdvFutursComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MesRdvFutursComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MesRdvFutursComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
