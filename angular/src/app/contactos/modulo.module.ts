import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { MyCoreModule } from 'src/lib/my-core';
import { CONTACTOS_COMPONENTES } from './componente.component';
import { CommonServicesModule } from '../common-services';



@NgModule({
  declarations: [
    CONTACTOS_COMPONENTES
  ],
  imports: [
    CommonModule, FormsModule, RouterModule.forChild([]),
    MyCoreModule, CommonServicesModule,

  ],
  exports: [ CONTACTOS_COMPONENTES ]
})
export class ContactosModule { }
