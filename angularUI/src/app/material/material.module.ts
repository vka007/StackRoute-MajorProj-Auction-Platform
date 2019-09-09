import {
  MatButtonModule,
  MatIconModule,
  MatToolbarModule,
  MatChipsModule,
  MatCardModule,
  MatGridListModule,
  MatTableModule,
  MatTooltipModule,
} from '@angular/material';

import { NgModule } from '@angular/core';
import {MatMenuModule} from '@angular/material/menu';
import { MatDialogModule } from '@angular/material/dialog';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatRadioModule} from '@angular/material/radio';
import {MatCheckboxModule} from '@angular/material/checkbox';


@NgModule({
 
  imports: [
    MatButtonModule,
    MatCheckboxModule,
    MatIconModule,
    MatToolbarModule,
    MatChipsModule,
    MatCardModule,
    MatGridListModule,
    MatTableModule,
    MatTooltipModule,
    MatInputModule,
    MatMenuModule, 
    MatDialogModule,
    MatFormFieldModule,
    MatRadioModule
  ],
  exports: [MatButtonModule,
    MatCheckboxModule,
    MatIconModule,
    MatToolbarModule,
    MatChipsModule,
    MatCardModule,
    MatGridListModule,
    MatTableModule,
    MatTooltipModule,
    MatInputModule,
  MatMenuModule, 
  MatDialogModule,
  MatFormFieldModule,
    MatRadioModule
]
})
export class MaterialModule { }
