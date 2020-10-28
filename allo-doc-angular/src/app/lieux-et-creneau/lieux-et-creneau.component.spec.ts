import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LieuxEtCreneauComponent } from './lieux-et-creneau.component';

describe('LieuxEtCreneauComponent', () => {
  let component: LieuxEtCreneauComponent;
  let fixture: ComponentFixture<LieuxEtCreneauComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LieuxEtCreneauComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LieuxEtCreneauComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
