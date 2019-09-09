import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HelpdeskComponent } from './helpdesk.component';

describe('HelpdeskComponent', () => {
  let component: HelpdeskComponent;
  let fixture: ComponentFixture<HelpdeskComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HelpdeskComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HelpdeskComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
