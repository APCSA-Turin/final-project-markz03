## **1\. Project Overview \- Arcade**

This project aims to restore interest in retro arcade games. Promoting simple retro arcade games compared to newer complex video games. Overall, this project's purpose is to entertain its users and allow them to sit back and enjoy playing laid back games.

## **2\. Code Breakdown**

\- **App.java** – Creates a Gui object  
\- **Ball.java** – Creates a Ball object (rectangle), modifies speed/direction of the ball's velocity, moves the ball object, and draws it on the gui  
\- **Gui.java** – Creates the main frame of the project (JFrame), has a play button that opens a Selection Gui if clicked  
\- **Paddle.java** – Creates a Paddle object (rectangle) with its own unique id (1/2), movement of paddle via W & S or Up arrow key & Down arrow key on the y axis, draws the paddle on the gui with a color based on its id (blue/red)  
\- **Pong.java** – The Gui for the Pong game, adds PongPanel onto its Gui, a background/blank template   
\- **PongPanel.java** – Handles all the functionality of the pong game, creates ball & paddle objects with set dimensions, collisions between ball and paddle & its effects, uses threads in order to simulate the game in real time  
\- **PongScore.java** – Records the score of each player and draws it on the gui  
\- **SelectionGui.java** – Creates a gui with 3 JButtons (Whack-A-Mole, Pong, and Snake), opens the respective game when clicked  
\- **Snake.java** – The Gui for the snake game, adds SnakePanel onto its Gui, a background/blank template  
\- **SnakePanel.java** – Handles all the functionality of the snake game, new apple location each time the snake eats it, draws the snake movement on the gui, moves the snake via arrow keys or wasd, increases snake size everytime an apple is eaten.  
\- **Wakamo.java** – Includes everything needed for Whack-A-Mole, JFrame uses BorderLayout, 9 buttons (8 of hole and 1 with a mole), timer and score on panel, actionListener for increasing score everytime a mole is whacked, 30 second timer & mole moves every 750 milliseconds

## **3\. Features Implemented**

✔ **Base Project (88%)**  
\- 3 games (Whack-A-Mole, Pong, and Snake)  
\- Includes several Java classes   
\- Provides interactive user experience via GUI  
✔ **GUI (Java Swing) (+2%)**  
\- JFrame displays the main menu, selectionGui, and the 3 games  
\- JButtons that record user interaction  
\- JPanels where all functionality are put on  
\- JLabel which displays text

**Total \= 90% B+**

## **4\. Screenshots or Outputs**

![][image1]![][image2]

![][image3]![][image4]![][image5]

## **5\. What I Learned**

\- Learned how to create Guis using Java Swing  
\- Learned about graphics to draw components onto the guis  
\- Learned how to use Threads in order to simulate code in real time  
\- Learned about actionListeners and KeyAdapter

## **6\. Bonus** 

![][image6]  
\- Whack-A-Mole had an issue where the mole could be clicked several times in a row which led to higher scores than usual, it was intended to only be clicked once. Fixed it by turning the mole icon to a hole icon when clicked  
![][image7]  
\- Pong had a collision issue, as it registered several collisions when only one collision had occurred. This, termed as a power shot, led to the ball ramping up in speed when it shouldn't have. Sometimes the ball even glitched through the paddle with how fast it was going. Fixed it by displacing the ball 1 unit to the left/right of the spot it collided with the moment the collision occurs. 

