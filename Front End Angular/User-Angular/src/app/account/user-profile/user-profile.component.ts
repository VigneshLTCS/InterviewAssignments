import { Component, OnInit } from '@angular/core';
import { AccountService } from '@app/_services';

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
})
export class UserProfileComponent implements OnInit {
  user: any
  firstName: any;
  lastName: any;
  userDetailResponse: any
  constructor(private accountService: AccountService) { 
    
  }

  ngOnInit(): void {
    this.user = localStorage.getItem('user');
    if(this.user === null){
      this.logout();
    } 
    
  }

  logout() {
    this.accountService.logout();
  }

}
