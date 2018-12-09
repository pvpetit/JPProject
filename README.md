# JP Project

 * Philemon Petit-Frere
 * 12/5/2018
 * COP 3003 - OOP
 * Project: JPProject
 * Purpose of Project: design a template in Java for creating and recording all future
 * production line items. Also also allow easy modification to handle different products
 *Sources for help: Stackexchange, Garrett Graber, Nathalie Crespo, github.com, http://tutorials.jenkov.com/java-regex/pattern.html, geeksforgeeks,https://www.tutorialspoint.com/, 
 
 <img src="https://img.shields.io/badge/release-v1.1.0-blue.svg" />
<img src="https://img.shields.io/badge/package-v2.0.0-orange.svg" />

## Table of Contents
- [Goal](#Goal)
- [OverView](#OverView)
- [Techniques](#Techniques)
- [Images](#Images)
- [Demo](#Demo)
- [Credits](#Credits)
 
<h3>Goal</h4>
<p>Create a production plant for any type of product ranging from a simple packaging system to a variety of electronic devices.
create a production line for multimedia devices which include music and movie players.
<br>Design a template in Java for creating and recording all future production line items.  
<br>For this particular production facility you will only implement a concrete class for music and movie players.</p>

<h3>OverView</h3>
This is a Java GUI project, that is designed to allow the user to create Audio Players and Movie Player products of thier choice. They will be able to input their specificaitions of the products, and the products will be displayed on the Home Window in a table View. The user can also see the statitics of the movie Player, such as total number of products, how many are movie players and how many are unique.

<h3>Techniques</h3>
 <p>Program demostrates <hr> 
 **Polymorphism**: is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.

Any Java object that can pass more than one IS-A test is considered to be polymorphic. In Java, all Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object.

<h3>Images</h3>

![Gui Picture](https://github.com/dekum/JPProject/blob/master/images/HomeScreen.png)<br>
<p>The HomeScreen is the screen the user sees when they open the GUI. On the left is a Table with the list of products. The program starts with its own default example list. The table displays the name of the product and whether it is a Movie player or Audio Player. <br>The table updates as the user adds more products. <br> On the right the user can click 3 buttons to open the other 3 windows listed
 If the User wished to know more information about a certain product they can click the product and press the "More Information" button</p><br>
![Gui Picture](https://github.com/dekum/JPProject/blob/master/images/HomeScreenMoreInfo.png)<br>
 <p> This alert box popups, when a product is clicked on and the "More Info" button is pressed. The alert display the product's toString method which contains it's name, type, date of manufactured serial number, amongst other things.
  
![Gui Picture](https://github.com/dekum/JPProject/blob/master/images/AddAudioPlayerWindow.png)<br>
<p> This window is displayed when User wants to add a Audio Player. The textfields have default inputsfor user-easiness. The user enters the name, audio Specification, and how many copies of this product they want. If successfully an alert will signal success. However if there is bad inputs, an error alert will tell the user whats wrong.<br>
  
![Gui Picture](https://github.com/dekum/JPProject/blob/master/images/AddAudioPlayerSuccess.png)<br>
<p> This is the alert that will pop up if the User successfully creates a Audio Player. The number of copies and product name is shown. The Movie Player window has a similiar pop up. </p><br>

 ![Gui Picture](https://github.com/dekum/JPProject/blob/master/images/AddMoviePlayerWindowEx.png)<br>
 <p> This window is displayed when user selected "Add Movie Player". Just like the Audio Player window, default data is already filled in textfields. Movie Player has a choice of Monitor Type, which is displayed in a drop down choice box element. The data is this picture has an invalid # of copies to demostrate the error message shown in the next picture
</p> <br>
  
![Gui Picture](https://github.com/dekum/JPProject/blob/master/images/AddMoviePlayerError.png)<br>
<p> This is the popup Alert the user sees if they enter 0 or a negative number in the number of Copies textfield.

</p> <br>
![Gui Picture](https://github.com/dekum/JPProject/blob/master/images/StatsWindow.png)<br>
<p> This window has a table of Stats that shows analysises the product List the user created. The Statistics automatically update as new products are created. <br>The Stats described here:<br>
 
 | Stat Name | Description |
| --- | --- |
| Total Products | The count of audio players and Movie Players |
| Total Unique | The count of products there are, minus the duplicates,using Sets. |
| Total Duplicates | The count of products subtracted by the total unique. |
| Total Audio Players | The count of Audio Players.  |
| Total Movie Players | The count of Movie Players.  |
| Total LCDs | The count of Movie players with LCD Monitor Type.  |
| Total LEDs| The count of Movie players with LED Monitor Type.  |
 
 Duplicates are calcucated by creating a Set, with the elements of the productList. Set will autmotically remove any duplicates uing's Product class's equals method. If two products have the same class and same name, they are considered to be the same product.

<h3> Bug / Feature Request</h3>
<p>If you find a bug, please report it by opening an issue.

If you'd like to request a new function, feel free to do so by opening an issue [here](https://github.com/dekum/JPProject/issues).</p>

<h4>Credits</h4>
 JP Project is a scenario created by Oracle Academy for the purpose of teaching Java.
 
This program is authored by Philemon Petit-Frere

This project is supported by:
<a href="https://www.jetbrains.com/idea/">
    <img src="https://github.com/Hexworks/zircon/blob/master/images/idea_logo.png" width="40" height="40" />
</a>

## License

JP Project is released under the [GNU GPLv3](https://choosealicense.com/licenses/gpl-3.0/) lincense.
