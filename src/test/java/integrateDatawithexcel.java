import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class integrateDatawithexcel {

    @Test(dataProvider = "CredentialsSupplier")
    public void loginTest(String username, String password){
        System.out.println(username+"----------"+password);
    }
// gives data in form od 2D array
    @DataProvider(name="CredentialsSupplier")
    public Object[][] dataSupplier() throws IOException, FileNotFoundException{
        // Creates a new, Empty excel workbook in memory
        //making a file object that points to file TestData inside the current project folder
        File excelFile=new File(System.getProperty("user.dir")+"\\TestData.xlsx");

        //FileInputStream-> A stream that opens the file for reading bytes.
        //Open the TestData.xlsx file so we can read its contents.
        FileInputStream fis=new FileInputStream(excelFile);

        //XSSFWorkBook: Apache POI class to work with .xlsx Excel files
        // convert the file we opened into a real Excel workbook object that we can read cells from.
        //XSSFWorkbook is a class from Apache POI library (not built-in Java).
        //It is used to work with .xlsx Excel files.
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet=workbook.getSheet("login");
        int rowCount=sheet.getLastRowNum();
        int columnCount= sheet.getRow(0).getLastCellNum();
        //Why Object[][] ?
        //Because Excel can contain:String,Number.Boolean
        //So Object can store any type
        Object[][] data= new Object[rowCount][columnCount];
        //r+1= data from second row
        for(int r=0;r<rowCount;r++){
            XSSFRow row= sheet.getRow(r+1);
            for(int c=0;c<columnCount;c++){
                XSSFCell cell=row.getCell(c);
                CellType cellType=cell.getCellType();
                switch(cellType){
                    case STRING:
                        data[r][c]=cell.getStringCellValue();
                        break;
                    case NUMERIC:
                        data[r][c]=Integer.toString((int)cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        data[r][c]=cell.getBooleanCellValue();
                        break;
                }
            }
        }
        return data;


    }

}
