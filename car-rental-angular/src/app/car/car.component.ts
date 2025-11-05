import {Component, OnInit, inject} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RentalService} from '../rental.service';
import { Subscription } from 'rxjs';
import {CarDetailComponent} from '../car-detail/car-detail.component';
import {Cardetail} from '../cardetail';

@Component({
  selector: 'app-car',
  standalone: true,
  imports: [CommonModule, CarDetailComponent],
  template: `
    <section>
          <form>
            <input type="text" placeholder="Filter by brand" #filter>
            <button class="primary" type="button" (click)="filterResults(filter.value)">Search</button>
          </form>
        </section>
        <section class="results">
        <app-car-detail *ngFor="let cardetail of filteredCarList" [cardetail]="cardetail"></app-car-detail>
    </section>
      `,
      styleUrls: ['./car.component.css'],
})
export class CarComponent implements OnInit {
  readonly baseUrl = 'https://angular.dev/assets/images/tutorials/common';
  cardetailList: Cardetail[] = [];
  filteredCarList: Cardetail[] = [];
  rentalService: RentalService = inject(RentalService);
  private subscription!: Subscription;

  ngOnInit() {
    this.subscription = this.rentalService.getAllCars().subscribe(cars => { this.cardetailList = cars; this.filteredCarList = cars; });
    }
  
  filterResults(text: string) {
    console.log(text);
    if (!text) {
      this.filteredCarList = this.cardetailList;
      return;
    }
    this.filteredCarList = this.cardetailList.filter(
      cardetail => cardetail?.brand.toLowerCase().includes(text.toLowerCase())
    );
  }

  ngOnDestroy(): void {
    this.subscription?.unsubscribe();
  }
}


