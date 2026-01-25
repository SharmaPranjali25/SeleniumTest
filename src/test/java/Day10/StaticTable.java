package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable {
    public static void main(String[] args){
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //1) Find total rows in table
        //1.0) find number of <tr> show the count for rows in the table
       int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //multiple tables use xpath
       System.out.println("Number of Rows: "+rows);

       // 1.1) Instead of xpath use Tag Name : no recommended for multiple tables
        /*
        int rowtagname=driver.findElements(By.tagName("tr")).size(); //when have single table in webpage then use this
        System.out.println("Numbere of Rows by TagName- "+ rowtagname);
         */

        //2) Number of Columns
        int colcount=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of Columns or th tags: "+ colcount);
        // another way : by tag name : not recommended for multiple tables
        /*
       int cols= driver.findElements(By.tagName("th")).size();
       System.out.println("Number of Columns: "+ cols);
         */

        //3) Read Data from Specific Row and column
        // 5: row, 1:column
        String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println("Data in 5th Row and 1st Column:: "+data);

        //4) Read Data from all rows and columns
        // pass the values dynamically : 2D array , nested loop
        // outer for loop for repeating the rows
        // inner for loop for repeating the columns in every row
        // to include header put r=1, but in some table they use tr not td for data
        /*
        System.out.println("========================================");
        for(int r=2;r<=rows;r++){
            for(int c=1;c<colcount;c++){
                // cannot pass the variables directly
               String alldata= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
               System.out.print(alldata+"\t");
            }
            System.out.println("--------------------------------");
        }
         */
        System.out.println("-------------------------------------------------------");

        //5) Print BookNames whose Author is Mukesh: Conditional Based
        for(int r=2;r<rows;r++){
            String authorname= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
            // System.out.println(authorname);
            if(authorname.equals("Mukesh")){
                String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                System.out.println(bookname+"\t"+authorname);

            }

        }
        System.out.println("-------------------------------------------------------");
        // tr: row , td: column
        int total=0;
        //6) Capture all prices and then total of all prices
        for (int r=2;r<=rows;r++){
            String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            // System.out.println(price); as it is in string so we cannot perform arithmetic opertaions
            // we need to convert this price into integer
            total=total+ Integer.parseInt(price);

        }
        System.out.println("Total Price of all Books: "+total);








    }
}
