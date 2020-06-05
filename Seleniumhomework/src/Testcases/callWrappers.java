package Testcases;

public class callWrappers {

	public static void main(String[] args) throws Exception {
        LoginOrange l1=new LoginOrange();
		//launch the browser
        l1.insertapp("https://opensource-demo.orangehrmlive.com/");
        
        //enter the correct username and password
        l1.enterbyid("txtUsername", "Admin");
        l1.enterbyid("txtPassword", "admin123");
        
        //taking screenshot for login
        l1.takeScreenshot("C://CaptureScreenShot//orangehrm.jpg");

        l1.clickbyxpath("//*[@id='btnLogin']");
        
        //enter the incorrect username and passwword
        //l1.enterbyid("txtPassword", "admin12");
        //l1.clickbyxpath("//*[@id=\'forgotPasswordLink\']/a");
        

		//using xpath  with contains for ADMIN 
        l1.clickbyxpath("//*[@id=\'menu_admin_viewAdminModule\']");
        
		//using xpath for UserMangament under admin
        l1.clickbyxpath("//*[@id=\'menu_admin_UserManagement\']");
        
       //using relativexpath for users under USERmanagemnt under Admin
        l1.clickbyxpath("//*[@id=\'menu_admin_viewSystemUsers\']");
        
		//using xpath for username under Usermanagement in ADMIN
        l1.enterbyid("searchSystemUser_userName", "thomas fleming");
        
        //using xpath for userrole under usermangament in ADMIN
        l1.selectbydropdown("//select[@id='searchSystemUser_userType']", 1);
        l1.selectbydropdown("//select[@id='searchSystemUser_userType']", 0);
        l1.selectbydropdown("//select[@id='searchSystemUser_userType']", 2);
        
		//using xpath for employee name under ADMIN
        l1.enterbyid("searchSystemUser_employeeName_empName", "Thomas Fleming");
        
		//using xpath for Status under ADMIN
        l1.selectbydropdown("//select[@id='searchSystemUser_status']", 1);
        l1.selectbydropdown("//select[@id='searchSystemUser_status']", 2);
        l1.selectbydropdown("//select[@id='searchSystemUser_status']", 0);
        
        //screen shot for admin
        //l1.takeScreenshot("C://CaptureScreenShot//orangehrm.jpg");
        
        //click on the search button to search a record
        l1.clickbyxpath("//input[@id='searchBtn']");

        //click on the reset button
        l1.clickbyxpath("//input[@id='resetBtn']");
        
        //screen shot of admin
        //l1.takeScreenshot("C://CaptureScreenShot//orangehrm.jpg");

        l1.closeapp();





	}

}
