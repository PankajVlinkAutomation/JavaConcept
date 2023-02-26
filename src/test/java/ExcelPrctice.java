import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelPrctice {

    public static File file;
    public static FileInputStream inputStream;
    public static Workbook workbook;

    public static Sheet sheet;


    public static void main(String[] args) throws IOException {

        ExcelPrctice excelPrctice=new ExcelPrctice();
        String[] data={"Apple","Boy","Cat","Dog"};
        String filePath=System.getProperty("user.home","C:\\CryptoCarolina\\AA\\src\\main\\resources\\Folder\\Pro.xls");
        excelPrctice.writeExcel(filePath,data);

    }
    public void writeExcel(String filePath,String [] datas) throws IOException {
        file=new File(filePath);
        inputStream=new FileInputStream(file);
        workbook=new HSSFWorkbook(inputStream);
        sheet= workbook.getSheetAt(0);
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        Row row=sheet.getRow(0);
        Row newRow= sheet.createRow(rowCount);
        for(int i=0;i<row.getLastCellNum();i++){
            Cell cell= newRow.createCell(i);
            cell.setCellValue(datas[i]);
        }
        inputStream.close();
        FileOutputStream outputStream=new FileOutputStream(file);
        workbook.write(outputStream);
        workbook.close();
    }

}
