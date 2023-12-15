import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatTabsModule } from '@angular/material/tabs';
import { MatIconModule } from '@angular/material/icon';
import { CustomerDetailsComponent } from '../customer/customer-details/customer-details.component';

@Component({
    selector: 'app-worksheet',
    standalone: true,
    imports: [
        CommonModule,
        MatTabsModule,
        MatIconModule,
        CustomerDetailsComponent,
    ],
    templateUrl: './worksheet.component.html',
    styleUrl: './worksheet.component.css'
})
export class WorksheetComponent {

}
