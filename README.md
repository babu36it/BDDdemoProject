# BDDdemoProject
----------------------------------------------------------------------------------------------
Day - 1-7 : 
---------------------------------------------------------------------------------------------

**Framework**

4)	Feature File ( Cucumber )
5)	Scenario ( Scenario states the general point of test in more abstract way.)
a)	Given – pre-Condition
b)	When – All Conditions
c)	And : addition Conditions
d)	Then – Post - Conditions- Conditions
6)	Scenario Outline ( The Scenario Outline keyword can be used to run the same Scenario multiple times, with different combinations of values. )
a)	Given – pre-Condition
b)	When – All Conditions
c)	And : addition Conditions
d)	Then – Post - Conditions- Conditions
e)	Examples ( Provide the Multiple data) 
7)	Background ( execute before each and every scenario) 
8)	Hooks ( it executes before and after the every scenario ) 
9)	Step Definition ( Naming convention – As per the feature name ) 
10)	@Given(“^ Step $”){
public 
11)	PageClass - package
a)	We maintain the all the pages related actions  and this classes we extended to the step Definitions classes
b)	For example ( LoginPage , HomePage ) 
12)	PageObject - package
a)	All the Webdriver Objects 
b)	FindBy() – all the locator of elements ( name,xPath , Id ,css,linkText., partialLinkText, className, tagName.etc ) 
c)	FindAll() – multiple locator of the element ( if any one locator is matched – it locates the element ) . OR 
d)	FindBys () -multiple locator of the elements ( only if both should match than it locates the element)  AND

13)	RunnerClass – Package ( Never code any thing in this class ) 
a)	@RunWith(Cucumber.class) 
@CucumberOptions) {
//  features=”path of Features file” // it will run all the features files
 features=”path of HomePage Features file”, // it will run only Homepage feature file/
glue= { ”StepDefinition path” } ,  // we need to provide the StepDefinition Path 
tags=”@someSuite”,  // only one Tag we can run
plugin={}
}

b)	Glue - Option helps Cucumber to locate the step definition file. 
-	We specify the package to load glue code (step definitions or hooks) in the glue option.
-	When no glue is provided, Cucumber will use the package of the annotated class.
c)	tags - In Cucumber, tags are used to associate a test like smoke, regression etc.
example : @smokeSuite , @regressionSuite , @functionalSuite
d)	plugin  - produce reports that contain information about what scenarios have passed or failed. ( reports can be generated in html,json,xml formats )
e)	
14)	Utilities -Package 
a)	BaseClass – driver initialization 

----------------------------------------------------------------------------------------------
Day - 7: June 27 - 2022
---------------------------------------------------------------------------------------------
1) Reading the testData from the properties files and sending the data to the testbox 

----------------------------------------------------------------------------------------------
Day - 8:June 28 - 2022
---------------------------------------------------------------------------------------------


----------------------------------------------------------------------------------------------
Day - 9:June 29 - 2022
---------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------
Day - 10:June 30 - 2022
---------------------------------------------------------------------------------------------

----------------------------------------------------------------------------------------------
Day - 11:July 01 - 2022
---------------------------------------------------------------------------------------------

