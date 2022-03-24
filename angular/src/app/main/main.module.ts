import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Optional } from '@angular/core';
import { SkipSelf } from '@angular/core';
import { NotificationComponent } from './notification/notification.component';
import { HomeComponent } from './home/home.component';


@NgModule({
  declarations: [
    NotificationComponent, HomeComponent,
  ],
  exports: [NotificationComponent, HomeComponent],
  imports: [
    CommonModule,
  ]
})
export class MainModule {
    constructor( @Optional() @SkipSelf() parentModule: MainModule) {
      if (parentModule) {
        const msg = `MainModule has already been loaded.
          Import  MainModule once, only, in the root AppModule.`;
        throw new Error(msg);
      }
    }
 }
