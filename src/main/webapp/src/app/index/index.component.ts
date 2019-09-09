import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: [ './index.component.scss' ]
})
export class IndexComponent implements OnInit {
  result = '';

  constructor(private client: HttpClient) { }

  ngOnInit() { }


  sayHello(): void {
    this.result = 'loading...';
    this.client.get('/api/hello-world').subscribe(response => this.result = response as string);
  }
}
