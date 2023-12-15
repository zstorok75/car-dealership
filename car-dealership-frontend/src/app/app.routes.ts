import { Routes } from '@angular/router';
import { WorksheetComponent } from './component/worksheet/worksheet.component';
import { CustomerDetailsComponent } from './component/customer/customer-details/customer-details.component';

export const routes: Routes = [
    { path: '', component: WorksheetComponent },
    { path: 'worksheet', component: WorksheetComponent },
    { path: 'customer', component: CustomerDetailsComponent },
];
