package com.gokhan.daikichipath;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")

public class Controller {
  @RequestMapping("")
  public String index(){
    return "Welcome";
  }

  @RequestMapping("/today")
  public String today(){
    return "Today you will find luck in all your endeavors";
  }

  @RequestMapping("/tomorrow")
  public String tomorrow(){
    return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
  }

  @RequestMapping("/travel/{city}")
  public String travel(@PathVariable("city") String city){
    return "Congrats you will soon travel to " + city;
  }
  @RequestMapping("/lotto/{number}")
  public String lotto(@PathVariable("lotto") int number){
    if (number%2 ==0){
      return "You will take grand journey in the future, but be aware of Gokhan";
    }else{
      return "You have enjoyed the fruits of your labor but now is a great time to spend with your fam and friends";
    }
    
  }

}
