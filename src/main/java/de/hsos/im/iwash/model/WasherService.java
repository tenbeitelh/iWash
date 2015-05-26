/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.im.iwash.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Ace
 */
@ManagedBean(name = "washerService")
@ApplicationScoped
public class WasherService {
    private final static String[] colors;
     
    private final static String[] brands;
     
    static {
        colors = new String[10];
        colors[0] = "Black";
        colors[1] = "White";
        colors[2] = "Green";
        colors[3] = "Red";
        colors[4] = "Blue";
        colors[5] = "Orange";
        colors[6] = "Silver";
        colors[7] = "Yellow";
        colors[8] = "Brown";
        colors[9] = "Maroon";
         
        brands = new String[10];
        brands[0] = "BMW";
        brands[1] = "Mercedes";
        brands[2] = "Volvo";
        brands[3] = "Audi";
        brands[4] = "Renault";
        brands[5] = "Fiat";
        brands[6] = "Volkswagen";
        brands[7] = "Honda";
        brands[8] = "Jaguar";
        brands[9] = "Ford";
    }
    
    public List<WashProcess> createWashProcess(int size) {
        List<WashProcess> list = new ArrayList<WashProcess>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new WashProcess(getRandomId(), getRandomDate(), getRandomColor(), getRandomPrice(), getRandomQuality()));
        }
        return list;
    }
    
    private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
     
    private int getRandomYear() {
        return (int) (Math.random() * 50 + 1960);
    }
     
    private String getRandomColor() {
        return colors[(int) (Math.random() * 10)];
    }
     
    private String getRandomBrand() {
        return brands[(int) (Math.random() * 10)];
    }
     
    public String getRandomPrice() {
        return brands[(int) (Math.random() * 10)];
    }
     
    public double getRandomQuality() {
        double start = 400;
        double end = 410;
        double random = new Random().nextDouble();
        double result = start + (random * (end - start));
        return result;
    }
 
    public List<String> getColors() {
        return Arrays.asList(colors);
    }
     
    public List<String> getBrands() {
        return Arrays.asList(brands);
    }
    
    public Date getRandomDate()
    {
        int yyyy = random(1900, 2013);
    int mm = random(1, 12);
    int dd = 0; // will set it later depending on year and month

    switch(mm) {
      case 2:
        if (isLeapYear(yyyy)) {
          dd = random(1, 29);
        } else {
          dd = random(1, 28);
        }
        break;

      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        dd = random(1, 31);
        break;

      default:
        dd = random(1, 30);
      break;
    }

    String year = Integer.toString(yyyy);
    String month = Integer.toString(mm);
    String day = Integer.toString(dd);

    if (mm < 10) {
        month = "0" + mm;
    }

    if (dd < 10) {
        day = "0" + dd;
    }
    
    Date date = new Date(yyyy, mm, dd);
    return date;
  }

  public static int random(int lowerBound, int upperBound) {
    return (lowerBound + (int) Math.round(Math.random()
            * (upperBound - lowerBound)));
  }

  public static boolean isLeapYear(int year) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, year);
    int noOfDays = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);

    if (noOfDays > 365) {
        return true;
    }

    return false;
  }
    
}
