package daseulpractice.team;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class teamProject {
    public static void main(String[] args) throws FileNotFoundException {
        HSSFWorkbook wb = new HSSFWorkbook();
        Sheet sheet1 = wb.createSheet("시트 1");

        int rowcount = 0;
        int cellcount = 0;

        Row row = sheet1.createRow(rowcount++);
        Cell cell = row.createCell(cellcount++);
        cell.setCellValue("번호");
        cell = row.createCell(cellcount++);
        cell.setCellValue("이름");
        cell = row.createCell(cellcount++);
        cell.setCellValue("전화번호");
        cell = row.createCell(cellcount++);
        cell.setCellValue("이메일");

        for(int i = 0; i < 5; i++) {
            cellcount =0;

            row =sheet1.createRow(rowcount++);
            cell = row.createCell(cellcount++);
            cell.setCellValue(i+1);
            cell = row.createCell(cellcount++);
            cell.setCellValue(i);
            cell = row.createCell(cellcount++);
            cell.setCellValue(i);
            cell = row.createCell(cellcount++);
            cell.setCellValue(i);

        }

        try (FileOutputStream fileOutput = new FileOutputStream("/home/pc15/test.xls")) {
            wb.write(fileOutput);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

