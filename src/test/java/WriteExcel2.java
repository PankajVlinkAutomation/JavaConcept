import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.*;
public class WriteExcel2 {
    Workbook workbook;
    FileInputStream inputStream;
    Sheet sheet ;
    public void insertDataInExcel(String filePath,String[] dataToWrite) throws IOException {
        File file=new File(filePath);
          inputStream  = new FileInputStream(file);
          workbook=new HSSFWorkbook(inputStream);
            sheet=workbook.getSheetAt(0);
            int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
            Row row = sheet.getRow(0);
            Row rowNew = sheet.createRow(rowCount);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                Cell cell = rowNew.createCell(j);
                cell.setCellValue(dataToWrite[j]);
            }
            inputStream.close();
        FileOutputStream outputStream=new FileOutputStream(file);
        workbook.write(outputStream);
        outputStream.close();
    }
    public static void main(String[] args) throws IOException {
        WriteExcel2 writeExcel2=new WriteExcel2();
        String[] inputData={"AAA","BBB","CCC","DDD"};
        String filePath=System.getProperty("user.home","//Documents//Hello1.xls//");
        writeExcel2.insertDataInExcel(filePath,inputData);
    }
}










