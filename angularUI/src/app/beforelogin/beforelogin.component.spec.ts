import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BeforeloginComponent } from './beforelogin.component';

describe('BeforeloginComponent', () => {
  let component: BeforeloginComponent;
  let fixture: ComponentFixture<BeforeloginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BeforeloginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BeforeloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
