package com.ju_lawverse.demo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

   @Autowired
   private LoginRepo rep;

   public Login log(String username, String password) {
       Login user = rep.findByUsernameAndPassword(username, password);
       return user;
   }
}

//click bulb and import stuff