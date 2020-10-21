package SDET.AutomationPractice;

import org.testng.annotations.DataProvider;

public class TestData {
	
	public static String filePath="C:\\Work Space\\AutomationPractice\\resources";
	public static String fileName="sdet practice.xlsx";

	@DataProvider (name = "Sheet1")
	public static Object[][] getExpData() throws Exception	{
		String sheetName="Sheet1";
		String testCaseName=null;
		String title=null;
		String firstName=null;
		String lastName=null;
		String passWd=null;
		String dob=null;
		String newsLetter=null;
		String offers=null;
		String company=null;
		String address1=null;
		String address2=null;
		String city=null;
		String state=null;
		String zip=null;
		String country=null;
		String addInfo=null;
		String phone=null;
		String mobile=null;
		String alias=null;
	

		Object[][] inputData = null;		
		
		
		ExcelReader excelReader = new ExcelReader(filePath,fileName);
		int rows = excelReader.getRowCount(sheetName);
		inputData = new Object[rows-1][];
		for(int i=1;i<rows;i++)
		{
			testCaseName = excelReader.getData(sheetName, i, 0);
			System.out.println(testCaseName);
			title = excelReader.getData(sheetName, i, 1);
			System.out.println(title);
			firstName = excelReader.getData(sheetName, i, 2);
			System.out.println(firstName);
			lastName= excelReader.getData(sheetName, i, 3);
			System.out.println(lastName);
			passWd = excelReader.getData(sheetName, i, 4);
			System.out.println(passWd);
			dob = excelReader.getData(sheetName, i, 5);
			System.out.println(dob);
			newsLetter = excelReader.getData(sheetName, i, 6);
			System.out.println(newsLetter);
			offers= excelReader.getData(sheetName, i, 7);
			System.out.println(offers);			
			company = excelReader.getData(sheetName, i, 8);
			System.out.println(company);
			address1 = excelReader.getData(sheetName, i, 9);
			System.out.println(address1);
			address2 = excelReader.getData(sheetName, i, 10);
			System.out.println(address2);
			city= excelReader.getData(sheetName, i, 11);
			System.out.println(city);
			state= excelReader.getData(sheetName, i, 12);
			System.out.println(state);
			zip = excelReader.getData(sheetName, i, 13);
			System.out.println(zip);
			country = excelReader.getData(sheetName, i, 14);
			System.out.println(country);
			addInfo = excelReader.getData(sheetName, i, 15);
			System.out.println(addInfo);
			phone= excelReader.getData(sheetName, i, 16);
			System.out.println(phone);
			mobile = excelReader.getData(sheetName, i, 17);
			System.out.println(mobile);
			alias= excelReader.getData(sheetName, i, 18);
			System.out.println(alias);
			
			inputData[i - 1] = new Object[] { testCaseName,title,firstName,lastName,passWd,dob,newsLetter,offers,company,address1,address2,city,
					state,zip,country,addInfo,phone,mobile,alias};
			
		}
		return inputData;
	}

}
