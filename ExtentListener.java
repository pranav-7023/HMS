package Testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentListener implements ITestListener {                     ////implements interface ie itestlistener //under interface there is abstract method means no body provided//click on extentlistener and unimplement method

	ExtentSparkReporter htmlReporter;                 //declare 3objects          //to generate extendsreport we have to add dependency//
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeClass                                           //1st want to report generate either pass or fail thats why associate with before annotation
	public void  configureReport()                          // declare method ie configurereport
	{
		htmlReporter = new ExtentSparkReporter("Extent Report.html");              //declare variable ie htmlreporter under this call object and write report name which we have to create
		reports = new ExtentReports();                                         //initilize 3methods here 
		reports.attachReporter(htmlReporter);                                // to attach first 2object create attachreporter
		
		
		// add system information                              //simply to provide system information
		
		reports.setSystemInfo("Machine", "Linux");            //call method setsysteminfo and set the data in key value pair
		reports.setSystemInfo("Name","Aman");
		
		// change the look and field
		
		htmlReporter.config().setDocumentTitle("Extent Reports");   //set document title 
		htmlReporter.config().setTheme(Theme.DARK);                     //st theme 
	}
	
	

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test = reports.createTest(result.getName());                   //call create test method inside this method pass parameter result.get name and return in test class which is already declare
		test.log(Status.PASS,MarkupHelper.createLabel("Name of method pass"+result.getName(),ExtentColor.GREEN));     //
		
	}

	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test = reports.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel("Name of method pass"+result.getName(),ExtentColor.RED));

		
	}

	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		configureReport();
	}


	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		reports.flush();

	}
}




                                // its method execution depends on hms class //before execution configure both class then only report generated 
	        //at last adding some parameters in testing.xml and now generated extent report.html