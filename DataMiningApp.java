/*
Omar Saraj
Data Mining Educational App
This app has 3 main sections: Learn, Observe, and Play. Users start by learning about data mining, then view an animation, and play a sorting game as a way to test their knowledge.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DataMiningApp {
    public DataMiningApp() {
        // Set up the main frame
        JFrame frame = new JFrame("Data Mining App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700);
        frame.setResizable(false);
        
        // Create the tabbed pane with sections: Welcome, Learn, Observe, and Play
        JTabbedPane tabbedPane = new JTabbedPane();
        
        
        // Set up the Welcome page
        JPanel welcomePage = new JPanel();
        welcomePage.setLayout(new BoxLayout(welcomePage, BoxLayout.Y_AXIS));
        
        // Create the welcome page title, image, and instructions
        JLabel welcomeText = createLabel("Welcome to the Data Mining Educational App!", 30, "Courier New"); 
        JLabel welcomeImageLabel = createImage("welcomeImage.jpeg"); 
        JLabel instructionText = createLabel("To begin, go to the Learn tab as you will learn about data mining.", 22, "Courier New"); 

        // Add components to the Welcome page
        welcomePage.add(Box.createRigidArea(new Dimension(0, 40))); // Vertical spacing
        welcomePage.add(welcomeText);
        welcomePage.add(Box.createRigidArea(new Dimension(0, 50)));
        welcomePage.add(welcomeImageLabel);
        welcomePage.add(Box.createRigidArea(new Dimension(0, 50)));
        welcomePage.add(instructionText);


        // Set up the Learn page
        JPanel learnPage = new JPanel(new BorderLayout());
        JPanel learnPageContent = new JPanel();
        learnPageContent.setLayout(new BoxLayout(learnPageContent, BoxLayout.Y_AXIS));
        
        // Create the Learn page introduction 
        JLabel learnPageIntroduction = createLabel("<html>Welcome to the Learn page! Scroll through the gallery and<br>"
        + "click on the buttons to begin learning about data mining.</html>", 24, "Courier New");
        
        // Set up the first separator  
        JSeparator separator1 = new JSeparator();

        // Create the data mining introduction image and button that opens the frame with specific information and another image
        JLabel introImageLabel = createImage("dataMiningIntroImage.png");
        JButton introButton = createButton("Data Mining Introduction", 18, "Courier New", 600, 100, 200, 200, 200);
        openFrame(introButton, "Introduction to Data Mining", 
        "<html>- Data mining is the process of sorting and studying large amounts of raw data.<br>"
        + "- This data is analyzed to identify any patterns that may prove useful.<br>"
        + "- Identifying patterns lets businesses know what to do with data and how to sort it.<br>"
        + "- Data mining aids in extracting relevant data in an efficient way.</html>", 
        16, 625, 280, "banner1.jpg");

        // Set up the second separator
        JSeparator separator2 = new JSeparator();
        
        // Create the data mining stages image and button that opens the frame with specific information and another image
        JLabel stagesImageLabel = createImage("dataMiningStagesImage.png");
        JButton stagesButton = createButton("Data Mining Stages", 18, "Courier New", 600, 100, 200, 200, 200);
        openFrame(stagesButton, "Data Mining Stages", 
        "<html>- Data mining stages are key steps involved in the data mining process.<br>"
        + "- The number of steps changes based on the specific problem.<br>"
        +"- Generally the process includes identifying the problem, data pre-processing, data modeling, data evaluation, and implementation.<br>"
        +"- View the corresponding image in the gallery to see an example process in more detail.</html>",
        16, 625, 280, "banner2.jpg");
        
        // Set up the third separator
        JSeparator separator3 = new JSeparator();
        
        // Create the data mining techniques image and button that opens the frame with specific information and another image
        JLabel techniquesImageLabel = createImage("dataMiningTechniquesImage.jpg");
        JButton techniquesButton = createButton("Data Mining Techniques", 18, "Courier New", 600, 100, 200, 200, 200);
        openFrame(techniquesButton, "Data Mining Techniques", 
        "<html>- Data mining techniques are methods used to analyze datasets. Here are some common techniques:<br>"
        +"- Pattern tracking involves monitoring and recognizing data trends to improve business outcomes.<br>"
        +"- Association finds relationships between data, like customers buying certain items together.<br>"
        +"- Classification is the process of splitting datasets into target categories based on certain attributes.</html>",
        16, 625, 280, "banner3.png");
        
        // Set up the fourth separator
        JSeparator separator4 = new JSeparator();
        
        // Create the data mining benefits image and button that opens the frame with specific information and another image
        JLabel benefitsImageLabel = createImage("dataMiningBenefitsImage.png");
        JButton benefitsButton = createButton("Data Mining Benefits", 18, "Courier New", 600, 100, 200, 200, 200);
        openFrame(benefitsButton, "Data Mining Benefits", 
        "<html>- There are many benefits that can come from data mining, which include:<br>"
        +"- Recognizing customer habits or business needs, which allows businesses to make more informed decisions.<br>"
        +"- Businesses being able to understand their demographic and create personalized ads and offers to interest this demographic.<br>"
        +"- Being able to use data mining in many industries like marketing, banking, healthcare, retail, and more.</html>",
        16, 625, 295, "banner4.jpg");
        
        // Set up the fifth separator
        JSeparator separator5 = new JSeparator();
        
        // Create the data mining risks image and button that opens the frame with specific information and another image
        JLabel risksImageLabel = createImage("dataMiningRisksImage.jpg");
        JButton risksButton = createButton("Data Mining Risks", 18, "Courier New", 600, 100, 200, 200, 200);
        openFrame(risksButton, "Data Mining Risks", 
        "<html>- While data mining is great, many risks can come from it, so here are some examples:<br>"
        +"- Since data mining may use personal data, privacy breaches pose a security risk for confidential information.<br>"
        +"- If the data being mined is outdated or incorrect, inaccurate analysis results may be produced, leading to poor decisions.<br>"
        +"- If data mining is not properly managed, the significant investment required may outweigh its benefits.</html>",
        16, 625, 295, "banner5.png");
        
        // Set up the sixth separator
        JSeparator separator6 = new JSeparator(); 
        
        // Create the data mining tools image and button that opens the frame with specific information and another image
        JLabel toolsImageLabel = createImage("dataMiningSoftwaresImage.jpg");
        JButton toolsButton = createButton("Data Mining Softwares", 18, "Courier New", 600, 100, 200, 200, 200);
        openFrame(toolsButton, "Data Mining Softwares", 
        "<html>- There are many software tools used for data mining on the corresponding picture in the gallery, but here are some common software tools:<br>"
        +"- Python, a prerequisite tool for data analysts, helps you create scripts from scratch to automate data mining tasks.<br>"
        +"- RapidMiner, a proprietary data mining tool, combines everything from data mining into one software. Its learning curve is lower compared to other software due to the process-focused design.<br>"
        +"- Orange, an open-source toolkit, uses data mining libraries in Python to carry out data mining. You can use python scripts or its GUI, making Orange more accessible.</html>",
        16, 625, 350, "banner6.png");
        
        // Set up the seventh separator
        JSeparator separator7 = new JSeparator();
        
        // Create the text at the bottom of the learn page
        JLabel endOfLearnPage = createLabel("<html>You have reached the end of the Learn page, great job! Go to<br>"
        +"the animation tab to view a data mining animation.</html>", 24, "Courier New"); 
        
        // Add a scroll pane to the Learn page
        JScrollPane scrollPane = new JScrollPane(learnPageContent);
        
        // Add components to the Learn page
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 20))); // Vertical spacing
        learnPageContent.add(learnPageIntroduction);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPageContent.add(separator1);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 60)));
        learnPageContent.add(introImageLabel);
        learnPageContent.add(introButton);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPageContent.add(separator2);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPageContent.add(stagesImageLabel);
        learnPageContent.add(stagesButton);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPageContent.add(separator3);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPageContent.add(techniquesImageLabel);
        learnPageContent.add(techniquesButton);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPageContent.add(separator4);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPageContent.add(benefitsImageLabel);
        learnPageContent.add(benefitsButton);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPageContent.add(separator5);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPageContent.add(risksImageLabel);
        learnPageContent.add(risksButton);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPageContent.add(separator6);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPageContent.add(toolsImageLabel);
        learnPageContent.add(toolsButton);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPageContent.add(separator7);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPageContent.add(endOfLearnPage);
        learnPageContent.add(Box.createRigidArea(new Dimension(0, 40)));
        learnPage.add(scrollPane, BorderLayout.CENTER);     


        // Set up the Observe page
        JPanel observePage = new JPanel();
        observePage.setLayout(new BoxLayout(observePage, BoxLayout.Y_AXIS));
        
        // Create the observe page introduction, animation instructions and image  
        JLabel observePageIntroduction = createLabel("<html>Welcome to the Observe page! Click on the Start Animation<br>"
        + "button to start the data mining animation on a new frame.<br>", 
        25, "Courier New");
        JLabel observePageInstructions = createLabel("<html>You can click the space key to stop the animation and the <br>"
        + "enter key to resume the animation at any time. Head to the<br>"
        + "Play page when you are done viewing the animation.</html>", 
        25, "Courier New");
        JLabel processImageLabel = createImage("dataMiningProcessImage.png");

        // Create the button to start the animation 
        JButton animationStartButton = createButton("Start Animation", 60, "Courier New", 600, 100, 200, 200, 200);
        animationStartButton.addActionListener(new ActionListener () { 
            @Override
            public void actionPerformed(ActionEvent e) { // This is called when the Start Animation button is clicked
                // Inform the user about the animation meaning with an option pane 
                int response = JOptionPane.showConfirmDialog(null, "<html>This animation is an analogy for data mining. The house represents a source of raw data. <br>"
                + "The individual trash items represent unprocessed data. The sorting process into cans <br>"
                + "shows data classification where different items are sorted into categories based on their <br>"
                + "attributes. The sorted cans represent organized data, and the truck driving away with the <br>"
                + "correct cans illustrates  informed and proper decision-making based on organized data.</html>", 
                "Animation Explanation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                
                // Proceed to the animation if the user clicks OK (not cancel or 'X' on the option pane)
                if (response == JOptionPane.OK_OPTION) {
                    // Set up the animation frame and panel (panel needed for Java graphics)
                    JFrame animationFrame = new JFrame("Data Mining Animation");
                    animationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    animationFrame.setSize(1000, 700);
                    animationFrame.setResizable(false);
                    AnimationPanel animationPanel = new AnimationPanel(animationFrame);
                    animationFrame.add(animationPanel);
                    animationFrame.setVisible(true);
                }               
            }      
        });
        
        // Add components to the Observe page
        observePage.add(Box.createRigidArea(new Dimension(0, 20)));
        observePage.add(observePageIntroduction);
        observePage.add(Box.createRigidArea(new Dimension(0, 40)));
        observePage.add(animationStartButton);
        observePage.add(Box.createRigidArea(new Dimension(0, 40)));
        observePage.add(observePageInstructions);
        observePage.add(Box.createRigidArea(new Dimension(0, 40)));
        observePage.add(processImageLabel);

        
        // Set up the Play page
        JPanel playPage = new JPanel();
        playPage.setLayout(new BoxLayout(playPage, BoxLayout.Y_AXIS));
        
        // Create the play page introduction, game instructions and image  
        JLabel playPageIntroduction = createLabel("<html>Welcome to the Play page! Read the instructions below and<br>"
        + "click the start game button when you are ready.</html>", 
        25, "Courier New");
        JLabel playPageInstructions = createLabel("<html>You are the manager at a local Best Buy. Your job is to<br>"
        + "determine what items are bought with a phone, computer, <br>"
        + "and camera. You will use association, so make sure your<br>"
        + "data mining knowledge is ready!</html>", 
        25, "Courier New");
        JLabel bestbuyImageLabel = createImage("bestbuy.jpg");
        
        // Create the button to start the game
        JButton gameStartButton = createButton("Start Game", 60, "Courier New", 600, 100, 200, 200, 200);
        gameStartButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) { // This is called when the Game Start button is clicked
                int timeGiven = 0; // The time that will be given to the user for the game
                
                // Have the user choose a difficulty corresponding to different times
                String[] options = {"Store (75s)", "District (60s)", "Regional (45s)", "Corporate (30s)"}; // Options for different times
                int choice = JOptionPane.showOptionDialog(null, "Which manager position would you like to take? (This will affect the time you have)", "Option Dialog", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                // Proceed to the game if the user selects one of the options and not 'X'
                if (choice >= 0) { 
                    // Depending on the users choice, assign a certain value to the timeGiven variable
                    if(choice == 0) {
                        timeGiven = 75;
                    }
                    else if(choice ==1) {
                        timeGiven = 60;
                    }
                    else if(choice == 2) {
                        timeGiven = 45;
                    }
                    else if(choice == 3) {
                        timeGiven = 30;
                    }
                    // Set up the game frame and panel (panel needed for Java graphics)
                    JFrame gameFrame = new JFrame("Data Mining Game");
                    gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    gameFrame.setSize(1000, 700);
                    gameFrame.setResizable(false);
                    GamePanel gamePanel = new GamePanel(gameFrame, timeGiven);
                    gameFrame.add(gamePanel);
                    gameFrame.setVisible(true);
                } 
            }
        });
        
        // Add components to the Play page
        playPage.add(Box.createRigidArea(new Dimension(0, 20)));
        playPage.add(playPageIntroduction);
        playPage.add(Box.createRigidArea(new Dimension(0, 40)));
        playPage.add(gameStartButton);
        playPage.add(Box.createRigidArea(new Dimension(0, 40)));
        playPage.add(playPageInstructions);
        playPage.add(Box.createRigidArea(new Dimension(0, 40)));
        playPage.add(bestbuyImageLabel);
        
        
        // Add tabs to the tabbed pane 
        tabbedPane.addTab("Welcome", welcomePage);
        tabbedPane.addTab("Learn", learnPage);
        tabbedPane.addTab("Observe", observePage);
        tabbedPane.addTab("Play", playPage);
        tabbedPane.setFont(new Font("Courier New", Font.BOLD, 17)); // Customize the font of the tabs
        
        // Add the tabbed pane to the main frame and set it visible        
        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    
    // Create a method for creating labels
    static JLabel createLabel(String text, int fontSize, String fontStyle) {
        JLabel label = new JLabel(text); // Create a label with the text passed into the method
        label.setFont(new Font(fontStyle, Font.PLAIN, fontSize)); // Set the font of the label using the style and size passed into the method
        label.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the label horizontally
        return label; // Return the finished label
        }
        
    // Create a method for creating images
    static JLabel createImage(String fileName) {
        JLabel imageLabel = new JLabel(); // Create a label to display the image 
        ImageIcon image = new ImageIcon(fileName); // Load the image file passed into the method to an ImageIcon
        imageLabel.setIcon(image); // Set the ImageIcon (image) as the icon of the created image label
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the image label horizontally
        return imageLabel; // Return the finished image
        }
        
    // Create a method for creating buttons
    static JButton createButton(String text, int fontSize, String fontStyle, int width, int height, int r, int g, int b) {
        JButton button = new JButton(text); // Create a button with the text that is passed into the method
        button.setFont(new Font(fontStyle, Font.BOLD, fontSize)); // Set the font of the button using the style and size passed into the method
        button.setBackground(new Color(r, g, b)); // Set the color of the button using the rgb values passed into the method
        button.setPreferredSize(new Dimension(width, height)); // Adjust the size of the button using the width and height passed into the method
        button.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the button horizontally
        return button; // Return the finished button
        }

    // Create a method for creating new frames (for the Learn page)
    static void openFrame(JButton button, String title, String information, int fontSize, int width, int height, String bannerName) {
        button.addActionListener(new ActionListener () { 
            @Override
            public void actionPerformed (ActionEvent e) { // This is called when an information button is clicked
                JFrame newFrame = new JFrame(title); // Create a new frame using the title passed into the method
                newFrame.setLayout(new BorderLayout());
                JLabel label = new JLabel(information); // Create a label with the information passed into the method
                label.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the information label horizontally
                label.setFont(new Font("Courier New", Font.PLAIN, fontSize)); // Set the font of the information label using the size passed into the method (the style is consistent for all the information labels)
                
                JLabel bannerLabel = new JLabel(); // Create a label to display the banner 
                ImageIcon bannerImage = new ImageIcon(bannerName); // Load the banner image file passed into the method to an ImageIcon
                bannerLabel.setIcon(bannerImage); // Set the ImageIcon (banner image) as the icon of the created banner label
                bannerLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the banner label horizontally             
                
                // Add the information label and banner (image) to the new frame
                newFrame.add(label, BorderLayout.CENTER);  
                newFrame.add(bannerLabel, BorderLayout.NORTH);
                newFrame.setSize(width, height); // Resize the new frame using the width and height passed into the method
                newFrame.setResizable(false); 
                newFrame.setVisible(true);
            }
        });
        }
        
    // Create the class for the animation panel
    public static class AnimationPanel extends JPanel {
        // Load all of the images for objects in the animation
        private final Image animationBackground = new ImageIcon("animationBackground.jpg").getImage();
        private final Image house = new ImageIcon("house.png").getImage();
        private final Image garbage = new ImageIcon("garbage.png").getImage();
        private final Image recycle = new ImageIcon("recycle.png").getImage();
        private final Image compost = new ImageIcon("compost.png").getImage();
        private final Image bag1 = new ImageIcon("bag1.png").getImage();
        private final Image bag2 = new ImageIcon("bag2.png").getImage();
        private final Image bottle = new ImageIcon("bottle.png").getImage();
        private final Image can1 = new ImageIcon("can1.png").getImage();
        private final Image can2 = new ImageIcon("can2.png").getImage();
        private final Image apple = new ImageIcon("apple.png").getImage();
        private final Image banana = new ImageIcon("banana.png").getImage();
        private final Image truck = new ImageIcon("truck.png").getImage();
        
        // Set the initial coordinates for all objects
        private int houseX = 0, houseY = 180;
        private int garbageX = 350, garbageY = 10;
        private int recycleX = 350, recycleY = 250;
        private int compostX = 350, compostY = 450;
        private int bag1X = houseX + 60, bag1Y = houseY + 110;  
        private int bag2X = houseX + 60, bag2Y = houseY + 70;
        private int bottleX = houseX + 130, bottleY = houseY + 100;
        private int can1X = houseX + 100, can1Y = houseY + 100;
        private int can2X = houseX + 100, can2Y = houseY + 100;
        private int appleX = houseX + 70, appleY = houseY + 80;
        private int bananaX = houseX + 40, bananaY = houseY + 120;
        private int truckX = 570, truckY = 320;
        
        // Define the initial speeds for animated objects (objects that will move)
        private int speedBag1X = 3, speedBag1Y = -2;
        private int speedBag2X = 2, speedBag2Y = -1;      
        private int speedBottleX = 1, speedBottleY = 0;
        private int speedCan1X = 2, speedCan1Y = 0;
        private int speedCan2X = 3, speedCan2Y = 0;
        private int speedAppleX = 3, speedAppleY = 2;
        private int speedBananaX = 2, speedBananaY = 1;
        private int speedCompostX = 3, speedCompostY = 0;
        private int speedTruckX = 3, speedTruckY = 0;

        // Initially have all animated objects as visible by using booleans (static objects are always visible)
        private boolean showBag1 = true;
        private boolean showBag2 = true;
        private boolean showBottle = true;
        private boolean showCan1 = true;
        private boolean showCan2 = true;
        private boolean showApple = true;
        private boolean showBanana = true;
        private boolean showCompost = true;
        private boolean showTruck = true;
        
        // Set up the constructor for the animation panel
        public AnimationPanel(JFrame animationFrame) {
            // Allow for the space and enter keys to be clicked
            setFocusable(true);
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    // Stop all of the animated objects if the space key is clicked by setting their speeds to 0
                    if (e.getKeyCode() == KeyEvent.VK_SPACE){
                        speedBag1X = 0;
                        speedBag1Y = 0;
                        
                        speedBag2X = 0;
                        speedBag2Y = 0; 
                        
                        speedBottleX = 0;
                        speedBottleY = 0; 
                        
                        speedCan1X = 0;
                        speedCan1Y = 0;   
                        
                        speedCan2X = 0;
                        speedCan2Y = 0; 
                        
                        speedAppleX = 0;
                        speedAppleY = 0; 
                        
                        speedBananaX = 0;
                        speedBananaY = 0;   
                        
                        speedCompostX = 0;
                        speedCompostY = 0; 
                        
                        speedTruckX = 0;
                        speedTruckY = 0;
                    }
                    // Reset the speed of the animated objects to their initial values if the enter key is clicked
                    else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        speedBag1X = 3;
                        speedBag1Y = -2; 
                        
                        speedBag2X = 2;
                        speedBag2Y = -1; 
                        
                        speedBottleX = 1;
                        speedBottleY = 0;   
                        
                        speedCan1X = 2;
                        speedCan1Y = 0;   
                        
                        speedCan2X = 3;
                        speedCan2Y = 0;  
                        
                        speedAppleX = 3;
                        speedAppleY = 2;  
                        
                        speedBananaX = 2;
                        speedBananaY = 1;  
                        
                        speedCompostX = 3;
                        speedCompostY = 0; 
                        
                        speedTruckX = 3;
                        speedTruckY = 0;
                    }
                }
            });
            
            // Create a timer to move the animated objects every 10 milliseconds
            Timer timer = new Timer(10, e -> {
                // Update the positions of the animated objects based on their corresponding speeds
                bag1X += speedBag1X; 
                bag1Y += speedBag1Y;
                
                bag2X += speedBag2X;
                bag2Y += speedBag2Y;
                
                bottleX += speedBottleX;
                bottleY += speedBottleY;
                
                can1X += speedCan1X;
                can1Y += speedCan1Y;
                
                can2X += speedCan2X;
                can2Y += speedCan2Y;
                
                appleX += speedAppleX;
                appleY += speedAppleY;
                
                bananaX += speedBananaX;
                bananaY += speedBananaY;
                
                // When a waste item reaches its corresponding bin, hide the waste item to indicate it has been sorted
                if (Math.abs(bag1X - garbageX) <= 55 && Math.abs(bag1Y - garbageY) <= 55) {
                    showBag1 = false; // Set the items boolean to false so it is no longer drawn on the screen
                }
                
                if (Math.abs(bag2X - garbageX) <= 70 && Math.abs(bag2Y - garbageY) <= 70) {
                    showBag2 = false;
                }
                
                if (Math.abs(bottleX + recycleX) >= 750 && Math.abs(bottleY - recycleY) <= 30) {
                    showBottle = false;
                    
                    // Move the compost bin to continue the animation (done here because the bottle takes the longest to reach its bin) 
                    compostX += speedCompostX;
                    compostY += speedCompostY;
                    
                    // When the compost bin reaches the truck, hide the compost bin to indicate it has been sorted and continue the animation
                    if (Math.abs(compostX + truckX) >= 1000 && Math.abs(compostX + truckY) >= 1000) {
                        showCompost = false;
                        
                        // Move the truck by incrementing its position by its corresponding speed
                        truckX += speedTruckX;
                        truckY += speedTruckY;
                        
                        // Stop the truck and close the animation frame when the truck moves off-screen
                        if (truckX >= 1100){
                            showTruck = false; 
                            animationFrame.dispose(); 
                        }
                    }  
                }
                
                if (Math.abs(can1X + recycleX) >= 760 && Math.abs(can1Y - recycleY ) <= 30) {
                    showCan1 = false;
                }
                
                if (Math.abs(can2X + recycleX) >= 760 && Math.abs(can2Y - recycleY ) <= 30) {
                    showCan2 = false;
                }
                
                if (Math.abs(appleX + compostX) >= 750 && Math.abs(appleY + compostY) >= 750) {
                    showApple = false;
                }
                
                 if (Math.abs(bananaX + compostX) >= 745 && Math.abs(bananaY + compostY) >= 745) {
                    showBanana = false;
                }
                
                repaint(); // Request a redraw 
            });
        
            timer.start(); // Start the animation
        }
    
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f)); //  Set the transparency level to 0.5f     
            g2d.drawImage(animationBackground, 0, 0, getWidth(), getHeight(), this); // Draw just the background image with the modified transparency level
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f)); // Reset the transparency level back to 1.0f
            
            // Draw the animated object if its corresponding boolean is true
            if(showBag1 == true) g.drawImage(bag1, bag1X, bag1Y, this); 
            if (showBag2 == true) g.drawImage(bag2, bag2X, bag2Y, this);
            if (showBottle == true) g.drawImage(bottle, bottleX, bottleY, this);
            if (showCan1 == true) g.drawImage(can1, can1X, can1Y, this);
            if (showCan2 == true) g.drawImage(can2, can2X, can2Y, this);
            if (showApple == true) g.drawImage(apple, appleX, appleY, this);
            if (showBanana == true) g.drawImage(banana, bananaX, bananaY, this);
            if (showCompost == true) g.drawImage(compost, compostX, compostY, this);
            if (showTruck == true) g.drawImage(truck, truckX, truckY, this);

            // Always draw objects that do not move
            g.drawImage(garbage, garbageX, garbageY, this);
            g.drawImage(recycle, recycleX, recycleY, this);
            g.drawImage(house, houseX, houseY, this);
        }
    }
    
    // Create the class for the game panel
    public static class GamePanel extends JPanel {
        // Load the images for all of the items in the game
        private final Image backgroundImage = new ImageIcon("backgroundImage.png").getImage();
        private final ImageIcon phone = new ImageIcon("phone.png");
        private final ImageIcon computer = new ImageIcon("computer.png");
        private final ImageIcon camera = new ImageIcon("camera.png");
        private final ImageIcon phoneCase = new ImageIcon("phoneCase.png");
        private final ImageIcon screenProtector = new ImageIcon("screenProtector.png");
        private final ImageIcon mouse = new ImageIcon("mouse.png");
        private final ImageIcon keyboard = new ImageIcon("keyboard.png");
        private final ImageIcon lens = new ImageIcon("lens.png");
        private final ImageIcon tripod = new ImageIcon("tripod.png");
        
        // Initially have all items as visible by using booleans
        private boolean showPhone = true;
        private boolean showComputer = true;
        private boolean showCamera = true;
        private boolean showPhoneCase = true;
        private boolean showScreenProtector = true;
        private boolean showMouse = true;
        private boolean showKeyboard = true;
        private boolean showLens = true;
        private boolean showTripod = true;
        private boolean showTimer = true;
        private boolean showGameOverScreen = false;

        // Store the width and height of draggable objects in a final variable
        private final int WIDTH_PHONECASE= phoneCase.getIconWidth();
        private final int HEIGHT_PHONECASE = phoneCase.getIconHeight();
        
        private final int WIDTH_SCREENPROTECTOR = screenProtector.getIconWidth();
        private final int HEIGHT_SCREENPROTECTOR = screenProtector.getIconHeight();
        
        private final int WIDTH_MOUSE = mouse.getIconWidth();
        private final int HEIGHT_MOUSE = mouse.getIconHeight();
        
        private final int WIDTH_KEYBOARD = keyboard.getIconWidth();
        private final int HEIGHT_KEYBOARD = keyboard.getIconHeight();
        
        private final int WIDTH_LENS = lens.getIconWidth();
        private final int HEIGHT_LENS = lens.getIconHeight();
        
        private final int WIDTH_TRIPOD = tripod.getIconWidth();
        private final int HEIGHT_TRIPOD = tripod.getIconHeight(); 
        
        // Set the original position of the target items (does not move)
        private final Point phonePoint = new Point(30, 50);
        private final Point computerPoint = new Point(350, 50);
        private final Point cameraPoint = new Point(700, 70);

        // Set the original position of the draggable items
        private final Point originalPhoneCaseLocation = new Point(530,450);   
        private final Point originalScreenProtectorLocation = new Point(190,400);
        private final Point originalMouseLocation = new Point(690,395);   
        private final Point originalKeyboardLocation = new Point(30, 400);  
        private final Point originalLensLocation = new Point(360, 450);
        private final Point originalTripodLocation = new Point(830, 418);
        
        // Set the position of the corners of the draggable items (these will change)
        private Point phoneCaseCorner = new Point(530,450);
        private Point screenProtectorCorner = new Point(190,400);
        private Point mouseCorner = new Point(690,395);
        private Point keyboardCorner = new Point(30, 400);
        private Point lensCorner = new Point(360, 450);
        private Point tripodCorner = new Point(830, 418);
        
        // Store the position of the mouse at different times
        private Point previousPoint;
        private Point currentPoint;
        
        // Define variables needed for score and time
        private int score = 0; // Initially have the score as 0
        private Timer timer; // Create the timer 
        private int timeLeft; // Create the variable for the time left in the game, which depends on the difficulty selected
        private int timeUsed = 0; // Initially have the time used as 0

        // Set up the constructor for the game panel
        public GamePanel(JFrame gameFrame, int timeGiven) {
            timeLeft = timeGiven; // Set the timeLeft variable equal to the timeGiven variable passed into the method (15s, 30s, 45s, or 60s)
            // Have the timer change every 1000 milliseconds (1 second)
            timer = new Timer(1000, e -> {
                // If there is still time left, remove 1 second from the time left variable and add 1 second to the time used variable
                if (timeLeft > 0) {
                        timeLeft--; // Subtract 1 second 
                        timeUsed++; // Add 1 second
                        repaint(); // Request a redraw
                } 
                // When there is no time left, stop the timer and display final results
                else {
                    timer.stop(); 
                    showPhoneCase = false; // Set the items boolean to false so it is no longer drawn on the screen
                    showScreenProtector = false;                
                    showMouse = false;
                    showKeyboard = false;
                    showLens = false;
                    showTripod = false;
                    showPhone = false;
                    showComputer = false;
                    showCamera = false;
                        
                    showTimer = false; // Hide the timer
                        
                    showGameOverScreen = true; // Show results like the score and time taken
                        
                    repaint(); // Request a redraw
                }            
            });

            timer.start(); 

            // Create and add a ClickListener to handle mouse click events
            ClickListener clickListener = new ClickListener();
            this.addMouseListener(clickListener);
            
            // Create and add a DragListener to handle mouse drag events
            DragListener dragListener = new DragListener();
            this.addMouseMotionListener(dragListener);
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.6f)); //  Set the transparency level to 0.6f     
            g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this); // Draw just the background image with the modified transparency level
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f)); // Reset the transparency level back to 1.0f
            
            // Draw the different items only if their boolean is true
            if (showPhoneCase == true) phoneCase.paintIcon(this, g, (int)phoneCaseCorner.getX(), (int)phoneCaseCorner.getY());
            if (showScreenProtector == true) screenProtector.paintIcon(this, g, (int)screenProtectorCorner.getX(), (int)screenProtectorCorner.getY());
            if (showMouse == true) mouse.paintIcon(this, g, (int)mouseCorner.getX(), (int)mouseCorner.getY());
            if (showKeyboard == true) keyboard.paintIcon(this, g, (int) keyboardCorner.getX(), (int) keyboardCorner.getY());
            if (showLens == true) lens.paintIcon(this, g, (int) lensCorner.getX(), (int) lensCorner.getY());
            if (showTripod == true) tripod.paintIcon(this, g, (int) tripodCorner.getX(), (int) tripodCorner.getY());
            if (showPhone == true) phone.paintIcon(this, g, (int) phonePoint.getX(), (int) phonePoint.getY());
            if (showComputer == true) computer.paintIcon(this, g, (int) computerPoint.getX(), (int) computerPoint.getY());
            if (showCamera == true) camera.paintIcon(this, g, (int) cameraPoint.getX(), (int) cameraPoint.getY());
            
            // Draw the timer on the game screen
            g.setFont(new Font("Courier New", Font.BOLD, 26)); 
            if (showTimer == true) g.drawString("Time Left: " + timeLeft + "s", 10, 20);
            
            // Draw the game over screen only if the game over screen boolean is true
            g.setFont(new Font("Courier New", Font.BOLD, 60));
            if (showGameOverScreen == true) g.drawString("Game Over!", 300, 150);
            if (showGameOverScreen == true) g.drawString("Score: " + score, 330, 300);
            if (showGameOverScreen == true) g.drawString("Time Used: " + timeUsed + "s", 270, 450);
        } 
        
        private class ClickListener extends MouseAdapter {
            public void mousePressed(MouseEvent evt){ // This is called when the mouse is pressed
                previousPoint = evt.getPoint(); // Store the point where the mouse is initially clicked
            }
        }
        
        private class DragListener extends MouseMotionAdapter {
            public void mouseDragged(MouseEvent evt){ // This is called when the mouse is dragged
                currentPoint = evt.getPoint(); // Update and store the point where the mouse is dragged
                
                // Phone case
                Point phoneCaseMiddle = getItemMiddle(WIDTH_PHONECASE, HEIGHT_PHONECASE, phoneCaseCorner); // Get the middle point of the phonce case
                double distancePhoneCase = previousPoint.distance(phoneCaseMiddle); // Determine the distance between the phone case and the initial mouse click
                 if (distancePhoneCase <= 80) {
                    // Calculate the new position by adding the distance the mouse has moved to the phone case's original position for both X and Y
                    int xTranslated = (int) (phoneCaseCorner.x + (currentPoint.getX() - previousPoint.getX()));
                    int yTranslated = (int) (phoneCaseCorner.y + (currentPoint.getY() - previousPoint.getY()));
                    
                    // Only move the phone case if it is within the bounds of the screen
                    if (xTranslated >= 0 && xTranslated <= getWidth() - WIDTH_PHONECASE && yTranslated >= 0 && yTranslated <= getHeight() - HEIGHT_PHONECASE) {
                        phoneCaseCorner.setLocation(xTranslated, yTranslated); // Set the location of the phone case to the updated X and Y positions
                    }
                }
                // Calculate the distance between the phone case and different target items
                double distanceCaseToPhone = phoneCaseCorner.distance(phonePoint);
                double distanceCaseToComputer = phoneCaseCorner.distance(computerPoint);
                double distanceCaseToCamera = phoneCaseCorner.distance(cameraPoint);
                
                // If the phone case is near a target item, either show a question or show an incorrect message (depending on if it is dragged to a correct section or not)
                if(distanceCaseToPhone <= 120 && showPhoneCase == true) {
                    // Correct section, so show the question
                    showQuestion("phoneCase", "What is the main purpose of data mining?", 
                                "To retrieve and set aside data", 
                                "To create visual representations of data", 
                                "To sort and analyze large amounts of raw data for identifying patterns", 
                                "To replace manual data entry with artificial intelligence", 
                                "To sort and analyze large amounts of raw data for identifying patterns");
                }
                else if(distanceCaseToComputer <= 120 && showPhoneCase == true) {
                    // Incorrect section, so show the incorrect message and reset the phone case location
                    JOptionPane.showMessageDialog(null, "Incorrect section, try again!", "Incorrect section", JOptionPane.INFORMATION_MESSAGE);
                    phoneCaseCorner.setLocation(originalPhoneCaseLocation);
                }
                else if(distanceCaseToCamera <= 85 && showPhoneCase == true) {
                    // Incorrect section, so show the incorrect message and reset the phone case location
                    JOptionPane.showMessageDialog(null, "Incorrect section, try again!", "Incorrect section", JOptionPane.INFORMATION_MESSAGE);
                    phoneCaseCorner.setLocation(originalPhoneCaseLocation);
                }
                
                // Screen protector
                Point screenProtectorMiddle = getItemMiddle(WIDTH_SCREENPROTECTOR, HEIGHT_SCREENPROTECTOR, screenProtectorCorner); // Get the middle point of the screen protector
                double distanceScreenProtector = previousPoint.distance(screenProtectorMiddle); // Determine the distance between the screen protector and the initial mouse click
                if (distanceScreenProtector <= 80) {
                    // Calculate the new position by adding the distance the mouse has moved to the screen protector's original position for both X and Y
                    int xTranslated = (int) (screenProtectorCorner.x + currentPoint.getX() - previousPoint.getX());
                    int yTranslated = (int) (screenProtectorCorner.y + currentPoint.getY() - previousPoint.getY());
                    
                    // Only move the screen protector if it is within the bounds of the screen
                    if (xTranslated >= 0 && xTranslated <= getWidth() - WIDTH_SCREENPROTECTOR && 
                        yTranslated >= 0 && yTranslated <= getHeight() - HEIGHT_SCREENPROTECTOR) {
                        screenProtectorCorner.setLocation(xTranslated, yTranslated); // Set the location of the screen protector to the updated X and Y positions
                    }
                }
                // Calculate the distance between the screen protector and different target items
                double distanceScreenProtectorToPhone = screenProtectorCorner.distance(phonePoint);
                double distanceScreenProtectorToComputer = screenProtectorCorner.distance(computerPoint);
                double distanceScreenProtectorToCamera = screenProtectorCorner.distance(cameraPoint);
                
                if(distanceScreenProtectorToPhone <= 130 && showScreenProtector == true) {
                    // Correct section, so show the question
                    showQuestion("screenProtector", 
                    "Which data mining technique involves monitoring and recognizing trends to improve business outcomes?", 
                    "Clustering", 
                    "Pattern tracking", 
                    "Classification", 
                    "Association", 
                    "Pattern tracking");
                }
                else if(distanceScreenProtectorToComputer <= 120 && showScreenProtector == true) {
                    // Incorrect section, so show the incorrect message and reset the screen protector location
                    JOptionPane.showMessageDialog(null, "Incorrect section, try again!", "Incorrect section", JOptionPane.INFORMATION_MESSAGE);
                    screenProtectorCorner.setLocation(originalScreenProtectorLocation);
                }
                else if(distanceScreenProtectorToCamera <= 110 && showScreenProtector == true) {
                    // Incorrect section, so show the incorrect message and reset the screen protector location
                    JOptionPane.showMessageDialog(null, "Incorrect section, try again!", "Incorrect section", JOptionPane.INFORMATION_MESSAGE);
                    screenProtectorCorner.setLocation(originalScreenProtectorLocation);
                }
                
                // Mouse
                Point mouseMiddle = getItemMiddle(WIDTH_MOUSE, HEIGHT_MOUSE, mouseCorner); // Get the middle point of the mouse
                double distanceMouse = previousPoint.distance(mouseMiddle); // Determine the distance between the mouse and the initial mouse click
                if (distanceMouse <= 80) {
                    // Calculate the new position by adding the distance the mouse has moved to the mouse's original position for both X and Y
                    int xTranslated = (int) (mouseCorner.x + currentPoint.getX() - previousPoint.getX());
                    int yTranslated = (int) (mouseCorner.y + currentPoint.getY() - previousPoint.getY());
                    
                    // Only move the mouse if it is within the bounds of the screen
                    if (xTranslated >= 0 && xTranslated <= getWidth() - WIDTH_MOUSE && 
                        yTranslated >= 0 && yTranslated <= getHeight() - HEIGHT_MOUSE) {
                        mouseCorner.setLocation(xTranslated, yTranslated); // Set the location of the mouse to the updated X and Y positions
                    }
                }
                // Calculate the distance between the mouse and different target items
                double distanceMouseToPhone = mouseCorner.distance(phonePoint);
                double distanceMouseToComputer = mouseCorner.distance(computerPoint);
                double distanceMouseToCamera = mouseCorner.distance(cameraPoint);
                
                if(distanceMouseToPhone <= 130 && showMouse == true) {
                    // Incorrect section, so show the incorrect message and reset the mouse location
                    JOptionPane.showMessageDialog(null, "Incorrect section, try again!", "Incorrect section", JOptionPane.INFORMATION_MESSAGE);
                    mouseCorner.setLocation(originalMouseLocation);
                }
                else if(distanceMouseToComputer <= 130 && showMouse == true) {
                    // Correct section, so show the question
                    showQuestion("mouse", 
                    "Which of the following is not a common stage in data mining?", 
                    "Data pre-processing", 
                    "Data modeling", 
                    "Data evaluation", 
                    "Data visualization", 
                    "Data visualization");
                }
                else if(distanceMouseToCamera <= 105 && showMouse == true) {
                    // Incorrect section, so show the incorrect message and reset the mouse location
                    JOptionPane.showMessageDialog(null, "Incorrect section, try again!", "Incorrect section", JOptionPane.INFORMATION_MESSAGE);
                    mouseCorner.setLocation(originalMouseLocation);
                }
                
                // Keyboard
                Point keyboardMiddle = getItemMiddle(WIDTH_KEYBOARD, HEIGHT_KEYBOARD, keyboardCorner); // Get the middle point of the keyboard
                double distanceKeyboard = previousPoint.distance(keyboardMiddle); // Determine the distance between the keyboard and the initial mouse click
                if (distanceKeyboard <= 80) {
                    // Calculate the new position by adding the distance the mouse has moved to the keyboard's original position for both X and Y
                    int xTranslated = (int) (keyboardCorner.x + currentPoint.getX() - previousPoint.getX());
                    int yTranslated = (int) (keyboardCorner.y + currentPoint.getY() - previousPoint.getY());
                    
                    // Only move the keyboard if it is within the bounds of the screen
                    if (xTranslated >= 0 && xTranslated <= getWidth() - WIDTH_KEYBOARD && yTranslated >= 0 && yTranslated <= getHeight() - HEIGHT_KEYBOARD) {
                        keyboardCorner.setLocation(xTranslated, yTranslated); // Set the location of the keyboard to the updated X and Y positions
                    }
                }
                // Calculate the distance between the keyboard and different target items
                double distanceKeyboardToPhone = keyboardCorner.distance(phonePoint);
                double distanceKeyboardToComputer = keyboardCorner.distance(computerPoint);
                double distanceKeyboardToCamera = keyboardCorner.distance(cameraPoint);
                
                if (distanceKeyboardToPhone <= 130 && showKeyboard) {
                    // Incorrect section, so show the incorrect message and reset the keyboard location
                    JOptionPane.showMessageDialog(null, "Incorrect section, try again!", "Incorrect section", JOptionPane.INFORMATION_MESSAGE);
                    keyboardCorner.setLocation(originalKeyboardLocation);
                } 
                else if (distanceKeyboardToComputer <= 130 && showKeyboard) {
                    // Correct section, so show the question
                    showQuestion("keyboard", 
                    "What is the best data mining tool for creating scripts from scratch", 
                    "RapidMiner", 
                    "Orange", 
                    "Python", 
                    "Rattle", 
                    "Python");
                } 
                else if (distanceKeyboardToCamera <= 105 && showKeyboard) {
                    // Incorrect section, so show the incorrect message and reset the keyboard location
                    JOptionPane.showMessageDialog(null, "Incorrect section, try again!", "Incorrect section", JOptionPane.INFORMATION_MESSAGE);
                    keyboardCorner.setLocation(originalKeyboardLocation);
                }
                
                // Lens
                Point lensMiddle = getItemMiddle(WIDTH_LENS, HEIGHT_LENS, lensCorner); // Get the middle point of the lens
                double distanceLens = previousPoint.distance(lensMiddle); // Determine the distance between the lens and the initial mouse click
                if (distanceLens <= 80) {
                    // Calculate the new position by adding the distance the mouse has moved to the lens's original position for both X and Y
                    int xTranslated = (int) (lensCorner.x + currentPoint.getX() - previousPoint.getX());
                    int yTranslated = (int) (lensCorner.y + currentPoint.getY() - previousPoint.getY());
                    
                    // Only move the lens if it is within the bounds of the screen
                    if (xTranslated >= 0 && xTranslated <= getWidth() - WIDTH_LENS && yTranslated >= 0 && yTranslated <= getHeight() - HEIGHT_LENS) {
                        lensCorner.setLocation(xTranslated, yTranslated); // Set the location of the lens to the updated X and Y positions
                    }
                }
                // Calculate the distance between the lens and different target items
                double distanceLensToPhone = lensCorner.distance(phonePoint);
                double distanceLensToComputer = lensCorner.distance(computerPoint);
                double distanceLensToCamera = lensCorner.distance(cameraPoint);
                
                if (distanceLensToPhone <= 130 && showLens) {
                    // Incorrect section, so show the incorrect message and reset the lens location
                    JOptionPane.showMessageDialog(null, "Incorrect section, try again!", "Incorrect section", JOptionPane.INFORMATION_MESSAGE);
                    lensCorner.setLocation(originalLensLocation);
                } 
                else if (distanceLensToComputer <= 160 && showLens) {
                    // Incorrect section, so show the incorrect message and reset the lens location
                    JOptionPane.showMessageDialog(null, "Incorrect section, try again!", "Incorrect section", JOptionPane.INFORMATION_MESSAGE);
                    lensCorner.setLocation(originalLensLocation);
                } 
                else if (distanceLensToCamera <= 105 && showLens) {
                    // Correct section, so show the question
                    showQuestion("lens", 
                    "What statement is true if personal data is used in data mining?", 
                    "The data mining process is slower", 
                    "The analysis results are inaccurate", 
                    "Storage requirements are greater", 
                    "Data breaches pose a greater security risk", 
                    "Data breaches pose a greater security risk");
                }
                
                // Tripod
                Point tripodMiddle = getItemMiddle(WIDTH_TRIPOD, HEIGHT_TRIPOD, tripodCorner); // Get the middle point of the tripod
                double distanceTripod = previousPoint.distance(tripodMiddle); // Determine the distance between the tripod and the initial mouse click
                if (distanceTripod <= 80) {
                    // Calculate the new position by adding the distance the mouse has moved to the tripod's original position for both X and Y
                    int xTranslated = (int) (tripodCorner.x + currentPoint.getX() - previousPoint.getX());
                    int yTranslated = (int) (tripodCorner.y + currentPoint.getY() - previousPoint.getY());
                    
                    // Only move the tripod if it is within the bounds of the screen
                    if (xTranslated >= 0 && xTranslated <= getWidth() - WIDTH_TRIPOD && 
                        yTranslated >= 0 && yTranslated <= getHeight() - HEIGHT_TRIPOD) {
                        tripodCorner.setLocation(xTranslated, yTranslated); // Set the location of the tripod to the updated X and Y positions
                    }
                }
                // Calculate the distance between the tripod and different target items
                double distanceTripodToPhone = tripodCorner.distance(phonePoint);
                double distanceTripodToComputer = tripodCorner.distance(computerPoint);
                double distanceTripodToCamera = tripodCorner.distance(cameraPoint);
                
                if (distanceTripodToPhone <= 130 && showTripod) {
                    // Incorrect section, so show the incorrect message and reset the tripod location
                    JOptionPane.showMessageDialog(null, "Incorrect section, try again!", "Incorrect section", JOptionPane.INFORMATION_MESSAGE);
                    tripodCorner.setLocation(originalTripodLocation);
                } 
                else if (distanceTripodToComputer <= 130 && showTripod) {
                    // Incorrect section, so show the incorrect message and reset the tripod location
                    JOptionPane.showMessageDialog(null, "Incorrect section, try again!", "Incorrect section", JOptionPane.INFORMATION_MESSAGE);
                    tripodCorner.setLocation(originalTripodLocation);
                } 
                else if (distanceTripodToCamera <= 105 && showTripod) {
                    // Correct section, so show the question
                    showQuestion("tripod", 
                    "What is the main reason businesses use data mining to better understand their demographic?", 
                    "To have AI make their advertisements", 
                    "To create personalized advertisements and offers", 
                    "To analyze competitors strategies", 
                    "To track customer complaints over time", 
                    "To create personalized advertisements and offers");
                }
        
                previousPoint = currentPoint; // Update the previous point 
                repaint(); // Request a redraw
        }
        
        // Create a method for getting the middle point of an item
        public static Point getItemMiddle(int width, int height, Point itemCorner) {
            // Get the middle of the item that is passed in using its corner coordinate, and its width and height
            int middlePositionX = (int) (itemCorner.getX() + width / 2);
            int middlePositionY = (int) (itemCorner.getY() + height / 2);
            
            // Store and return the X and Y points of the middle position
            Point middlePosition = new Point(middlePositionX, middlePositionY);
            return middlePosition;
        }
        
        // Create a method for showing questions 
        private void showQuestion(String itemName, String question, String option1, String option2, String option3, String option4, String correctOption) {
            String[] options = {option1, option2, option3, option4}; // Store the options passed into the method in a list            
            String userChoice = (String) JOptionPane.showInputDialog(null, question, "Question", JOptionPane.QUESTION_MESSAGE, null, options, options[0]); // Display the option pane to the user and store their input in a variable
            
            if (userChoice == null) {
                JOptionPane.showMessageDialog(null, "No answer selected!", "No Answer", JOptionPane.INFORMATION_MESSAGE); // Inform the user
                if (itemName == "phoneCase") {
                    phoneCaseCorner.setLocation(originalPhoneCaseLocation); // Move the dragged item back to where it originally was
                }
                else if (itemName == "screenProtector") {
                    screenProtectorCorner.setLocation(originalScreenProtectorLocation);
                }
                else if (itemName == "mouse") {
                    mouseCorner.setLocation(originalMouseLocation);
                }
                else if (itemName == "keyboard") {
                    keyboardCorner.setLocation(originalKeyboardLocation);                    
                }
                else if (itemName == "lens") {
                    lensCorner.setLocation(originalLensLocation);
                }
                else if (itemName == "tripod") {
                    tripodCorner.setLocation(originalTripodLocation);
                }
            }
            
            // If the user selects the correct option, add 1 to their score
            else if (userChoice.equals(correctOption)) {
                score++; // Increment the score by 1
                JOptionPane.showMessageDialog(null, "Correct! Score: " + score); // Display the score to the user on an option pane
                
                // Depending on the item passed into the method, set its boolean to false so it is no longer displayed on the screen.
                if (itemName == "phoneCase") {
                    showPhoneCase = false; // Set the items boolean to false
                }
                else if (itemName == "screenProtector") {
                    showScreenProtector = false;
                }
                else if (itemName == "mouse") {
                    showMouse = false;
                }
                else if (itemName == "keyboard") {
                    showKeyboard = false;
                }
                else if (itemName == "lens") {
                    showLens = false;
                }
                else if (itemName == "tripod") {
                    showTripod = false;
                }
            
                // If all items are hidden (which means they are all sorted), stop the game
                if (showPhoneCase == false && showScreenProtector == false && showMouse == false && showKeyboard == false && showLens == false && showTripod == false) {
                    timer.stop(); // Stop the timer
                    
                    // Hide the target items and timer
                    showPhone = false; 
                    showComputer = false;
                    showCamera = false;
                    showTimer = false;
                    
                    showGameOverScreen = true; // Display the game over screen
                    repaint(); // Request a redraw
                }
            }
            
            // If the user selects the incorrect option, inform them with an option pane and reset the position of the item
            else {
                JOptionPane.showMessageDialog(null, "Incorrect answer, try again!", "Incorrect Answer", JOptionPane.INFORMATION_MESSAGE); // Show an option pane informing the user of their incorrect choice
                
                // Depending on the item passed into the method, reset its position back to its original location
                if (itemName == "phoneCase") {
                    phoneCaseCorner.setLocation(originalPhoneCaseLocation); // Move the dragged item back to where it originally was
                }
                else if (itemName == "screenProtector") {
                    screenProtectorCorner.setLocation(originalScreenProtectorLocation);
                }
                else if (itemName == "mouse") {
                    mouseCorner.setLocation(originalMouseLocation);
                }
                else if (itemName == "keyboard") {
                    keyboardCorner.setLocation(originalKeyboardLocation);                    
                }
                else if (itemName == "lens") {
                    lensCorner.setLocation(originalLensLocation);
                }
                else if (itemName == "tripod") {
                    tripodCorner.setLocation(originalTripodLocation);
                }
            }          
        }
        }
    }
    
    // Starts the DataMiningApp method by creating an instance of it 
    public static void main(String[] args) {
        new DataMiningApp();
    }
}

