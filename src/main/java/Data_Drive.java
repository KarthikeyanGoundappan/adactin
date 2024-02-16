
import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	//import com.microsoft.schemas.office.visio.x2012.main.CellType;
public class Data_Drive {
	
	
	

		private void Dataread() throws IOException {
			File f = new File("C:\\Users\\GIRIMAHI\\eclipse-workspace\\Maven_Intro\\Data_excel\\Test case 1.xlsx");
			FileInputStream fi =new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fi);
			Sheet sheetat= wb.getSheetAt(0);
			Row rw= sheetat.getRow(0);
			
			Cell cell1= rw.getCell(0);
			CellType cell2 = cell1.getCellType();
			
			
			
			if(cell2.equals(CellType.STRING)) {
				String val= cell1.getStringCellValue();
				System.out.println(val);
			}
			else if (cell2.equals(CellType.NUMERIC))
					{
				double val2= cell1.getNumericCellValue();
				System.out.println(val2);
			}
		}
	public static void main(String[] args) throws IOException {
		Data_Drive n= new Data_Drive();
		n.Dataread();
	}
	}
		
	


