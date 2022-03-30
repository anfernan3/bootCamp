import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CalculadoraComponent } from './calculadora/calculadora.component';
import {
  ContactosListComponent,
  ContactosAddComponent,
  ContactosEditComponent,
  ContactosViewComponent,
} from './contactos/componente.component';
import { DemosComponent } from './demos/demos.component';
import { HomeComponent, PageNotFoundComponent } from './main';

const routes: Routes = [
  { path: '', pathMatch: 'full', component: HomeComponent },
  { path: 'inicio', component: HomeComponent },
  { path: 'demos', component: DemosComponent },
  { path: 'chisme/de/hacer/numeros', component: CalculadoraComponent },
  { path: 'contactos', component: ContactosViewComponent },
  { path: 'contactos/:id', component: ContactosViewComponent },
  { path: 'contactos/:id:k', component: ContactosViewComponent },
  { path: 'contactos/:id/edit', component: ContactosEditComponent },
  { path: 'contactos/:id/add', component: ContactosAddComponent },
  {
    path: 'config',
    loadChildren: () =>
      import('./config/config.module').then((mod) => mod.ConfigModule),
  },
  { path: '404.html', component: PageNotFoundComponent },
  { path: '**', component: PageNotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
