package tescases.com;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ALL_CODE {
 
		
		public static void main(String args[]) throws Exception{/*throws Exception Meaning:- all the 
			error messages are available under the class*/	
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();//Create an Object
			//Actions ac = new Actions(driver);
			driver.navigate().to("https://angolazone-admin.herokuapp.com/login");// Enter any website URL
	        System.out.println("Application Opened");
	        
	        driver.manage().window().maximize(); 
			System.out.println("Window shows in full view");
			Thread.sleep(5000);
	        
	        driver.findElement(By.name("email")).sendKeys("bhupinder.singh@ideausher.com");
	        System.out.println("Entered E-mail Id");
	        Thread.sleep(3000);
	        
	        driver.findElement(By.name("password")).sendKeys("123456");
	        System.out.println("Password Entered");
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/form/button")).click();
	        System.out.println("Login Successful");
		    Thread.sleep(8000);
		    
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[2]")).click();
		    System.out.println("Click on categories option");
		    Thread.sleep(8000);
		    
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys("Books");
		    System.out.println("Click On Search Categories option & Enter Books");
		    Thread.sleep(6000);
		    
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);

		    
		    
		    System.out.println("Backspace operation successfull");
	        Thread.sleep(5000);
	        
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys("Services");
		    Thread.sleep(5000);
		    System.out.println("Entered Data Services");
		    
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/div/input")).sendKeys(Keys.BACK_SPACE);
		    

		    
		    System.out.println("Backspace operation successfull");
	        Thread.sleep(5000);
	        
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[1]/div/a/button")).click();
		    System.out.println("Click On Add Categories Button");
		    Thread.sleep(6000);
	/*
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[3]/div/div/img")).sendKeys("C:\\Users\\saura\\A.PNG");
		    Thread.sleep(3000);
		    System.out.println("Click on Upload Image Option");
		    
	*/	    
		    
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);

		    
		    
	/*    
		    
		    driver.navigate().back();
		    Thread.sleep(3000);
		    
	 */  
		    
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
	        Thread.sleep(3000);
		    
		    driver.findElement(By.name("categoryName")).sendKeys("Pots");
		    Thread.sleep(3000);
		    System.out.println("Category Name Entered Successfully");
		    
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[3]/form/div[2]/textarea")).sendKeys("This Category is used only for Used Pots");
		    Thread.sleep(3000);
		    System.out.println("Category Description Entered Successfully");
		    
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[3]/form/div[3]/button[1]")).click();
		 Thread.sleep(6000);
		 System.out.println("Click on Save Button");
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[3]/form/div[3]/button[2]")).click();
		 Thread.sleep(8000);
		 System.out.println("Click on cancel button");
		 
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
	    	driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);

		    Thread.sleep(3000);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);

	        
		    
		 /*   driver.navigate().back();
		    Thread.sleep(3000);
		    */
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP); 
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[3]/table/tbody/tr[1]/td[6]/div/button[1]/img")).click();
		    Thread.sleep(3000);
		    System.out.println("Click on Edit Category");
		    
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
	        Thread.sleep(5000);
	        
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[3]/form/div[3]/button[1]")).click();
			Thread.sleep(3000);
			System.out.println("Click on Update Button");
			
			/*
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[3]/form/div[3]/button[2]")).click();
			Thread.sleep(4000);
			System.out.println("Click on Cancel Button");
			
			*/
			
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
	        Thread.sleep(4000);
		    
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[3]")).click();
		    System.out.println("Click on User Option");
		    Thread.sleep(4000);
		    
		    
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);

		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/a[1]")).click();
		    System.out.println("Clicked on Active User option");
		    Thread.sleep(4000);
		    
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);

		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);

		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/a[2]")).click();
		    System.out.println("Click on blocked Users option");
		    Thread.sleep(4000);
		    
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);

		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);

			Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[4]")).click();
		    System.out.println("Click on Ad Listing option");
		    Thread.sleep(5000);
		    
		    
		    
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);

		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/a[1]")).click();
		    System.out.println("Click on New Ads Option");
		    Thread.sleep(3000);
		    
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);

		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
	        Thread.sleep(5000);
	       
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/table/tbody/tr[1]/td[3]/button")).click();
		    Thread.sleep(4000);
		    System.out.println("Click on Final check1 Ad  option ");
		    
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
	        Thread.sleep(4000);
	        
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[2]/div[3]/div[3]/button[1]")).click();
	        Thread.sleep(4000);
	        System.out.println("Click On Approve Ad Button");
	        
	        driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/button[2]")).click();
	        Thread.sleep(4000);
	        System.out.println("Click On Cancel Button");
	        
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[2]/div[3]/div[3]/button[2]")).click();
	        Thread.sleep(4000);
	        System.out.println("Click on Reject Ad Button");
	        
	        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/button[2]")).click();
	        Thread.sleep(4000);
	        System.out.println("Click On Cancel Button");
	        
	        driver.navigate().back();
		    Thread.sleep(3000);
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/table/tbody/tr[1]/td[8]/div/button[2]/img")).click();
	        Thread.sleep(4000);
	        System.out.println("Click on Delete Ad Option");
	        
	        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[2]")).click();
	        Thread.sleep(4000);
	        System.out.println("Click on Cancel Button");
		    
		    
		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			
			
		    
		    

		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/a[2]")).click();
		    System.out.println("Click on Active ads option");
		    Thread.sleep(3000);
		    
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);

		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			Thread.sleep(5000);
		    
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/table/tbody/tr[1]/td[3]/button")).click();
			Thread.sleep(6000);
			System.out.println("Click on Books & Toys Add");
			
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[2]/div[3]/div[3]/button[1]/img")).click();
			Thread.sleep(4000);
			System.out.println("Click on Deactivate button");
			
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/textarea")).sendKeys("Seller Image, Description & Location Not shows Properly");
			Thread.sleep(4000);
			System.out.println("Text is entered in the Remark Box");
			
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[2]")).click();
			Thread.sleep(4000);
			System.out.println("Click On Cancel Button");
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div/div[2]/div[2]/div[3]/div[3]/button[2]/img")).click();
			Thread.sleep(4000);
			System.out.println("Click on Remove Ad button");
			
			driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/button[2]")).click();
			Thread.sleep(4000);
			System.out.println("Click on Cancel button");
			
			 driver.navigate().back();
			    Thread.sleep(3000);
			    System.out.println("Back To Active Ads page");
			

		/*    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/a[3]")).click();
		    Thread.sleep(3000);
		  */  
		    
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_UP);

		    driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("/html")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(6000);
		    

		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[5]")).click();
		    System.out.println("Click on Banners Option");
		    Thread.sleep(6000);
		    

		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/a[6]")).click();
		    System.out.println("Click on Push Notification Button");
		    Thread.sleep(5000);
		    

		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/button/p")).click();
		    System.out.println("Click on Logout Button");
		    Thread.sleep(4000);
		    
	/*
		    driver.findElement(By.xpath("//*[@id="root"]/div/div[2]/main/div/div[1]/div/a/button")).click();
		    System.out.println("Click On Add Categories Button");
		    Thread.sleep(3000);
		    

		    driver.findElement(By.xpath("")).click();
		    System.out.println("");
		    Thread.sleep(3000);
		    
		 */   
		    
		    
		    
		    
		    
		    driver.close();
		    Thread.sleep(3000);
		    System.out.println("Application Closed");
		
		
		
		
		
		
		
	}
		
	}