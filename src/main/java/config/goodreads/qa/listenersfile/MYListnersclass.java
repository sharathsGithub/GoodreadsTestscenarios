package config.goodreads.qa.listenersfile;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import config.goodreads.qa.Utilities.Extentreportfile;

public class MYListnersclass implements ITestListener{


	public ExtentReports reportfile= Extentreportfile.generateExtentReport(); 
	 public ExtentTest extentestreport;
public void onStart(ITestContext context) {
	 System.out.println("The Execution has started");
}

public void onTestStart(ITestResult result) {
System.out.println("ON Testmethod has started");
	String testname=result.getName();
extentestreport = reportfile.createTest(testname);
extentestreport.log(Status.INFO, MarkupHelper.createLabel(testname, ExtentColor.BLUE));

}


public void onTestSuccess(ITestResult result) {
	System.out.println("On Test is susccesss");
	String testname=result.getName();
	 extentestreport = reportfile.createTest(testname);
	extentestreport.log(Status.PASS, MarkupHelper.createLabel("Name of the passed test"+testname, ExtentColor.ORANGE));
}

public void onTestFailure(ITestResult result) {
	
	System.out.println("On Test is failed");
	String testname=result.getName();
	 extentestreport = reportfile.createTest(testname);
	 extentestreport.log(Status.INFO, MarkupHelper.createLabel("Name of the failed test"+testname, ExtentColor.BLUE));
	extentestreport.log(Status.FAIL, MarkupHelper.createLabel(testname, ExtentColor.RED));
String screenshotpath=System.getProperty("user.dir")+"\\Screenshot\\"+testname+".png";
File screenshotFile=new File(screenshotpath);
if(screenshotFile.exists())
{
	extentestreport.fail("CAptured screenshot is below: "+extentestreport.addScreenCaptureFromPath(screenshotpath));
}
}

public void onTestSkipped(ITestResult result) {

	String testname=result.getName();
	 extentestreport = reportfile.createTest(testname);
	extentestreport.log(Status.SKIP, MarkupHelper.createLabel(testname, ExtentColor.PINK));
	System.out.println("On test method is skipped");
}

public void onFinish(ITestContext context) {

reportfile.flush();

}


}
