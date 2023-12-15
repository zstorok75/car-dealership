import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormBuilder, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';

@Component({
    selector: 'app-customer-details',
    standalone: true,
    imports: [
        CommonModule,
        ReactiveFormsModule,
        MatInputModule,
        MatFormFieldModule,
    ],
    templateUrl: './customer-details.component.html',
    styleUrl: './customer-details.component.css'
})
export class CustomerDetailsComponent implements OnInit {

    form: any;

    constructor(
        private formBuilder: FormBuilder,
    ) { }

    ngOnInit(): void {
        this.form = this.formBuilder.group(this.initForm());
    }

    private initForm(): Record<string, unknown> {
        return {
            customerId: [''],
            customerType: ['', Validators.required],
            customerName: ['', [Validators.required, Validators.maxLength(255)]],
            telephone_1: ['', Validators.required],
            telephone_2: [''],
            email_1: ['', [Validators.required, Validators.email]],
            email_2: ['', Validators.email],
            notes: ['', Validators.maxLength(255)],
            address: {
                addressId: [''],
                country: ['', Validators.required],
                city: ['', Validators.required],
                streetName: ['', Validators.required],
                streetType: ['', Validators.required],
                streetNumber: ['', Validators.required],
                addressNotes: ['', Validators.maxLength(255)],
            }
        }
    }



}