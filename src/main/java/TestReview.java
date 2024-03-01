/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class TestReview
{
    public static void main(String[] args)
    {
        //Test the sentimentVal method here!
        //double num = Review.sentimentVal("Gabriel");
        //System.out.println(num);
      System.out.println(Review.totalSentiment("SimpleReview.txt")); 
      //The above line prints -2.9200000000000004
      
      System.out.println(Review.starRating("SimpleReview.txt")); 
      //The above line prints 1
      
      //System.out.println(Review.totalSentiment2("SimpleReview.txt"));
      //The above line prints -0.13904761904761906
      
      System.out.println(Review.totalSentiment("26WestReview.txt")); 
      //The above line prints 29.04999999999999
      
      System.out.println(Review.starRating("26WestReview.txt")); 
      //The above line prints 4
    }
}
