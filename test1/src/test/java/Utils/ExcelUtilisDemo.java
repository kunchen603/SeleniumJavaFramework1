package Utils;

public class ExcelUtilisDemo {
	public static void main(String[] args) {
		String projectPath=  System.getProperty("user.dir");
		ExcelUtilis excel = new ExcelUtilis
				(projectPath +"/excel/data.xlsx", "sheet1");
		excel.getRowCount();
		excel.getCellDataString(0,0);
		excel.getCellDataNumber(1,1);
	}

}
