
public class QuestionTwo {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\sharm\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.weightwatchers.com/us/");

		String actualTitle = driver.getTitle();

		driver.manage().window().maximize();

		String expectedTitle = " WW (Weight Watchers): Weight Loss & Wellness Help";

		if (actualTitle.equalsIgnoreCase(expectedTitle))

		System.out.println("Title Matched");

		else

		System.out.println("Title didn't match");

		driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");

		String actualTitle1 = driver.getTitle();
		System.out.println("actualTitle1 is : "+actualTitle1);

		String expectedTitle1 = "Find WW Studios & Meetings Near You | WW USA";

		Assert.assertEquals(actualTitle1, expectedTitle1);

		if (actualTitle1.equalsIgnoreCase(expectedTitle1))

		System.out.println("Title1 Matched");

		else

		System.out.println("Title1 didn't match");

		driver.findElement(By.id("location-search")).sendKeys("10011");

		driver.findElement(By.className("rightArrow-daPRP")).click();

		// Print the title of first result and distance
		String firstResult = driver.findElement(By.className("linkUnderline-1_h4g")).getText();
		System.out.println("firstResult is: " + firstResult);
		String firstDistance = driver.findElement(By.className("distance-OhP63")).getText();
		System.out.println("firstDistance is: " + firstDistance);
		driver.findElement(By.className("linkUnderline-1_h4g")).click();
		Thread.sleep(2000);

		// 7. Click on the first search result and then, verify displayed
		// location name/title matches with the name of the first searched
		// result that was clicked.
		String firstResultAfterClickNextPage = driver.findElement(By.className("locationName-1jro_")).getText();
		Assert.assertEquals(firstResultAfterClickNextPage, firstResult);

		//8. From this location page, print TODAY’s hours of operation (located towards the bottom of the page)
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		     int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		     System.out.println("dayOfWeek is: "+dayOfWeek);
		     String Friday  = driver.findElement(By.xpath("//div[@class='day-NhBOb'][6]")).getText();
		if (dayOfWeek==5){
		System.out.println("Hours of operation are: "+Friday);
		}


		driver.close();

		driver.quit();

		}

}
