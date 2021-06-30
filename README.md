# Appium
    This framework consists of page object model(page wise element located ),TestNG for execution of testes,Extent reports for Reporting purpose and also
it will capture screenshot on failure of teste cases .
       Here created one base class  in which all desired capabilties are mentioned. for every test case execution will extends base class. the one global  file 
created in this all app version and device information is stored . then one Utiility class is created here commmon method such as to start and stop the appium server 
is mentioned also  one Listner class is mention whenever test fails to capture a screenshot . Also one Test data class is created (parameterizing concept is 
implemented) in that.Also test execution of this testng xml file try through CI integrssion tools like jenkins by creating a seprate new job and triggring the build. 
