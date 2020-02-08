# Java_YBSDirectory v1.0
 
Java 8, MySQL 5.0
IDE used (Eclipse LUNA, NetBeans 8.2 (for UI Development), backend - MySQL Administrator, MySQLQueryBrowser)
 
This is a Group project for Myanmar DCR where I have to work as a main Lead Developer which is developed back in April, 2019. The project is about managing Bus Line in Myanmar and also can search which bus goes which bus routes. This project is developed within two weeks so the data used in there is dummy. This was developed back in my fresher days where I didn't think much about Maintainable, so I apologize for not making strong documentation. But if you have questions, contact me at myoukgyi72@gmail.com.

You can clone and download repo for study purpose, but DID NOT USE FOR COMMERCIAL PURPOSE.

- how to use -
#1 First clone and download this repository.
#2 You can see [ybsDirectory_DB 20200208 1214.sql] inside the folder.
#3 Restore the file from #2 in MySQLAdministrator.
#4 Open (Import) the project folder in your IDE.
#5 Change Database connection in [(your path)//Java_YBSDirectory/src/ybsDirectory/DBConnection.java] of getDBConnection() method to your DB localhost, user name and password.
#6 Run [UserLogIn.java] file and Boom! Enjoy.

Functions Include
#1 Login to the system.
#2 In MainMenu, there include 2 parts
     +1 Information Search
     +2 Information Management
#3 Add Data from [Information Management].
(In Route Management, there are 3 parts.
     +1 Bus Stop - created bus-stop can be selected from [Bus Route]. But first, you must choose Bus Number if you are going to create new route.
     +2 Bus Line - created bus line can be selected from [Bus Route].
     +3 Bus Route - you can create new or update existing routes. If it is more than 16 bus-stops, don't worry, just click [Continue] until you don't need to add anymore. Once you finished, click [Finish]. In Update, you can update 16 bus stops Firstly, extra bus-stop will be inside [Bus Routes::] fields, click [Next] if you want to update later parts. I used Pipe Line Data Logic here but there is not previous function (as time was limited back in the development days), so if you want to update last parts, Click [Finish] and choose [Bus Number] again and repeat the process. Sorry for inconvenience. ## You cannot add or update Same Bus-stop adjacently!
#4 In [Bus-Stop Search], you can choose Bus Number and click [Search]. I used Pipe Line Processing Logic here too, so you can see Extra bus-stop that don't display by clicking [Next] button. If you want to go back and see previous bus-stop, click [Previous] button.

Note :: Do not use maximize button and close button, as I haven't disabled maximize button and I didn't scale the form for full-screen Display mode. For close button, I haven't developed Form_closing event. I will make changes once I am back to develop this project for further updates, but I have no plan for this project right now.

This is it. Feel free to contact me anytime if you have further questions or want to contribute to this projects at myoukgyi72@gmail.com.
