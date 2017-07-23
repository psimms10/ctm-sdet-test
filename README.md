# ctm-sdet-test
Technical test for BGL
The test project was writtent in Java, utilising Cucumber for defining the features and scenarios, and Selenium to interact with the website.

It was created on Windows 8 within the Eclipse IDE. There is a pom.xml file included that should create the dependencies when loaded.

Currently it is set up to run with Chrome as there are some version incompatibilities with Firefox and Selenium.

The chromedriver.exe needs placing in C:\Develop\ directory as it is invoked from there.

To run the tests choose Simms.bgl.RunCukeTestsIT.java and run as JUnit TEsts in Eclipse.

Unfortunately due to time constraints in preparing this test, and other commitments there are a few things missing, but most notably:
1) I haven't been able to test running this on a clean machine in case any problem in building and running.
2) The first test (as defined in resources\Simms\bgl\EnergyComparison.feature) is the one that has been coded. The other two are just outline suggestions as to the set of 3 tests requested. The snippets from Cucumber run have been added into the step file (stepDefinitions.EnergyComparisonTestSteps) but not implemented.
3) Currently there are a couple of timing issues regarding the navigation button being active. I have added sleeps here, but should look more into a safer option.
4) Given more time would think that Protractor may be a better solution, but I am just starting to look around this interesting technology.
5) Code is structured so there is a class for each page (Page object) to minimise maintenance. The main step definition groups aspects from each page to avoid too much detail at the test definition stage (cucumber). Asserts happen at the step definition level.
6) Currently for ease and speed to create it is all using static. Probably would need to instantiate classes in a fuller solution.

Please contact me should you require any further information. Should there be problems running, but you can review the tests and are happy, I am happy to bring my laptop to an interview if required to ensure smooth running.
