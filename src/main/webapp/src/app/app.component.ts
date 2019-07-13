import { Component } from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'webapp';
  result = '';

  constructor(private client: HttpClient) {

  }

  sayHello(): void {
    this.result = 'loading...';
    this.client.get('/api/hello-world').subscribe(response => this.result = response as string);
  }
}
