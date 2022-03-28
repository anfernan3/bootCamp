import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactosListComponent, ContactosAddComponent, ContactosEditComponent, ContactosViewComponent } from './contactos/componente.component';

const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
