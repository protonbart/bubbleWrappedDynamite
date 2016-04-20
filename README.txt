BubbleWrappedDynamite Project

README.txt
===============================

Rest Service that will manage a Work order Queue. 

To Build the project with Maven:

To build projet with tests in the command line, navigate to the top level dir of the repo and run:
mvn clean install

to build without running tests:
mvn clean install -DskipTests

Maven will builid the project by:
a) clean the project by deleting the target directory
b) recreate the target directory with all the files and the war file.

Mvn builds the WAR to: %directory_path% / target

Please see Design Document for dependencies, technologies used, instructions to test and limitations. 

IMPORTANT: Please read limitations in Design Doc.

