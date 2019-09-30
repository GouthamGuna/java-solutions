package leetcode.easy;

import java.time.LocalDate;

/**
 * Created by nikoo28 on 2019-08-10 19:33
 */

public class DayOfTheYear {

  public int dayOfYear(String date) {

    int dayOfYear = LocalDate.parse(date).getDayOfYear();
    return dayOfYear;
  }

  public static void main(String[] args) {
    DayOfTheYear dayOfTheYear = new DayOfTheYear();
    System.out.println(dayOfTheYear.dayOfYear("2004-03-01"));
  }

}