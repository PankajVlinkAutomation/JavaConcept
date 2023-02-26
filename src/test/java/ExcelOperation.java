import lombok.extern.log4j.Log4j2;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.*;

@Log4j2
public class ExcelOperation extends pojo{
      File file;
      FileInputStream inputStream;
      Workbook workbook;
      Sheet sheet;
      Row row;
      int rowCount;

    public ExcelOperation(String name, String address, String language, String hobby) {
        super(name, address, language, hobby);
    }

    public void fileBookSheetPreparation(String filePath) throws IOException {
        file=new File(filePath);
        inputStream=new FileInputStream(filePath);
          workbook=new HSSFWorkbook(inputStream);
          sheet= workbook.getSheetAt(0);
      }
      public void closeFile() throws IOException {
          inputStream.close();
          FileOutputStream outputStream=new FileOutputStream(file);
          workbook.write(outputStream);
          outputStream.close();
      }
    public void getDataFromExcel(String filePath) throws IOException {
       fileBookSheetPreparation(filePath);
        rowCount= sheet.getLastRowNum()- sheet.getFirstRowNum();
        for(int i=0;i<rowCount+1;i++){
            row=sheet.getRow(i);
            for(int j=0;j<row.getLastCellNum();j++){
                System.out.print(row.getCell(j).getStringCellValue()+" || ");
            }
            System.out.println();
        }
    }
    public void writeDateInExcel(String filePath,String [] dataToWrite) throws IOException {

        fileBookSheetPreparation(filePath);
        rowCount= sheet.getLastRowNum()-sheet.getFirstRowNum();
        row= sheet.getRow(0);
        Row newRow= sheet.createRow(rowCount+1);
        for(int j=0;j<row.getLastCellNum();j++){
            Cell cell=newRow.createCell(j);
            cell.setCellValue(dataToWrite[j]);
        }
        closeFile();
    }
    public static void main(String[] args) throws IOException {
        String filePath=System.getProperty("user.home")+"\\Documents\\Hello1.xls";
        ExcelOperation excelOperation =new ExcelOperation("ValueName1","ValueAddress","ValueLanguage","ValueHobby");
        String[] dataToWrite={excelOperation.getName(), excelOperation.getAddress(), excelOperation.getLanguage(), excelOperation.getHobby()};
        excelOperation.writeDateInExcel(filePath,dataToWrite);
        excelOperation.getDataFromExcel(filePath);
    }
}
