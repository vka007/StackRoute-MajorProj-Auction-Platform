import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BiddingpageComponent } from './biddingpage.component';

describe('BiddingpageComponent', () => {
  let component: BiddingpageComponent;
  let fixture: ComponentFixture<BiddingpageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BiddingpageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BiddingpageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
