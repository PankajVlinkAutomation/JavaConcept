import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.*;

public class WriteExcel {
    public void writeDataInExcel(String filePath,String [] dataToWrite) throws IOException {
        File file=new File(filePath);
        FileInputStream inputStream=new FileInputStream(file);
        Workbook workbook;
         workbook = new HSSFWorkbook(inputStream);
        Sheet sheet= workbook.getSheetAt(0);
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        Row row= sheet.getRow(0); //get first row of sheet
        Row newRow= sheet.createRow(rowCount+1);//create a new row & append it in last of sheet
        for(int j=0;j<row.getLastCellNum();j++){
            Cell cell=newRow.createCell(j);
            cell.setCellValue(dataToWrite[j]);
        }
        inputStream.close();
        FileOutputStream outputStream=new FileOutputStream(file);
        workbook.write(outputStream);
        outputStream.close();
    }
    public static void main(String[] args) throws IOException {
        String[] valueToWrite={"Suresh","up","MangoDB","Coding"};
        String filePath=System.getProperty("user.home","Documents/Hello1.xls");
        WriteExcel writeExcel=new WriteExcel();
        writeExcel.writeDataInExcel(filePath,valueToWrite);
    }
}
