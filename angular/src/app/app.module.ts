import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { SampleComponent } from './sample.component';
import { PComponent } from './p.component';
import { HeaderComponent } from './header/header.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { TwoWayComponent } from './two-way/two-way.component';
import { DirectivesComponent } from './directives/directives.component';
import { IfSwitchComponent } from './if-switch/if-switch.component';
import { AttributeDirectivesComponent } from './attribute-directives/attribute-directives.component';
import { MyDirectiveDirective } from './my-directive.directive';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { KtmComponent } from './ktm/ktm.component';
import { KtmDetailsComponent } from './ktm-details/ktm-details.component';

@NgModule({
  declarations: [
    AppComponent,
    SampleComponent,
    PComponent,
    HeaderComponent,
    DataBindingComponent,
    TwoWayComponent,
    DirectivesComponent,
    IfSwitchComponent,
    AttributeDirectivesComponent,
    MyDirectiveDirective,
    ParentComponent,
    ChildComponent,
    KtmComponent,
    KtmDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
