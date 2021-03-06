/**
 * Created by johnclayton on 07/10/2017.
 * Program will calculate the distance to a target using specified values
 * entered by a user via a GUI interface
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DecimalFormat;

public class Gui extends JFrame implements ActionListener { //, WindowListener {

    //Height and weight for the JFrame
    private static final int WIDTH = 765;
    private static final int HEIGHT = 250;

    //Button to perform the distance calculation
    private static JButton withdrawButton;
    private static JButton depositButton;
    private static JButton transferButton;
    private static JButton balanceButton;

    private static JOptionPane insufficientFunds;
    private static JOptionPane increments;
    private static JOptionPane balance;
    private static JOptionPane withdraw;
    private static JOptionPane deposit;
    private static JOptionPane transfer;

    //Creation of the text fields for input/output
    private static JTextField withdrawAmountTxt;
    private static JTextField depositAmountTxt;
    private static JTextField transferAmountTxt;
    private static JTextField userInput;
    
//    //Creation of the label names
    private static JLabel userInputLabel;
//    private static JLabel depositLabel;
//    private static JLabel transferLabel;
//    private static JLabel balanceLabel;
    
    //Creating Radio buttons names
    private static JRadioButton checkingRadButt;
    private static JRadioButton savingsRadButt;

    //constructor
    public Gui() {
        super("ATM Machine");

        //Specifies the layout of the frame
        setFrame(WIDTH, HEIGHT);
        setLayout(new BorderLayout());
        setBackground(Color.lightGray);

        //Creation of a JPanel
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        add(panel, BorderLayout.NORTH);
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        add(panel2, BorderLayout.CENTER);


        //Creating textPanels to be used
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(4, 2));
        add(textPanel, BorderLayout.SOUTH);

        //Creating a results Text/Label to display the calculated distance information
        userInputLabel = new JLabel("");
        textPanel.add(userInputLabel);
        userInput = new JTextField(15);
        textPanel.add(userInput);
        userInput.setFont(new Font("Arial", Font.ITALIC | Font.BOLD, 15));
        userInput.setForeground(Color.RED);
        userInput.setEditable(false);

        //Creating a JButton so user can perform the calculation
        withdrawButton = new JButton("Withdraw");
        panel.add(withdrawButton);
        //addWindowListener(this);
        //withdrawButton.addActionListener(this);
        //User can hover their mouse over this field to get an explanation of what action needs to be performed
        withdrawButton.setToolTipText("Button must be clicked to calculate the distance");

        depositButton = new JButton("Deposit");
        panel.add(depositButton);
        depositButton.setToolTipText("Button will display your check/cash deposit options");

        transferButton = new JButton("Transfer");
        panel.add(transferButton);
        transferButton.setToolTipText("Transfer button will display your checking/savings account transfer options");

        balanceButton = new JButton("Balance");
        panel.add(balanceButton);
        balanceButton.setToolTipText("Balance button will display your checking/savings account balance");

        //Creating the various JOption Panes to be displayed
        JOptionPane insufficientFunds = new JOptionPane();
        insufficientFunds.setLayout(new FlowLayout(FlowLayout.CENTER));
        //insufficientFunds.showMessageDialog(null,"Insufficient Funds in Account");

        JOptionPane increments = new JOptionPane();
        increments.setLayout(new FlowLayout(FlowLayout.CENTER));

        JOptionPane balance = new JOptionPane();
        balance.setLayout(new FlowLayout(FlowLayout.CENTER));



        //Creating the JRadioButtons to be used by user
        JRadioButton checkingRad = new JRadioButton("Checking", true);
        panel2.add(checkingRad);
        add(panel2, BorderLayout.CENTER);
        checkingRad.setActionCommand("Checking");
        
        JRadioButton savingsRad = new JRadioButton("Savings", true );
        panel2.add(savingsRad);
        add(panel2, BorderLayout.CENTER);
        savingsRad.setActionCommand("Savings");
        
        //Grouping of the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(checkingRad);
        group.add(savingsRad);

    }

    //Creation of an ActionListener
    public void actionPerformed(ActionEvent arg0) {
    }

    
    private void setFrame(int width, int height) {
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Displays the GUI
    private void display() {
        setVisible(true);
    }

    //Try/Catch clause to ensure correct values are entered
    public static boolean number(String input) {

        boolean number = false;
        try {
            Double.parseDouble(input);
            number = true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Incorrect value entered, please, enter a number");
        }
        return number;
    }


    //Method to calculate the distance in yards
    private static void calcYards(double value, double mils) {
        double yards = (27.8 * value / mils);
        DecimalFormat df = new DecimalFormat("###.##");

      //  userInput.setText(df.format(yards));
    }


    //Start of Main Method
    public static void main(String[] args) {
        Gui calc = new Gui();

        calc.display();


        //Action Listener for the Calc Button

//        withdrawButton.addActionListener ((ActionEvent e) ->  {
//
//            if (number(withdrawAmountTxt.getText()) )
//                    { calcYards (Double.parseDouble(sizeNumberTxt.getText()), Double.parseDouble(milNumberTxt.getText())); }
//        } );

    }//End of Main

//    @Override
//    public void windowOpened(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowClosing(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowClosed(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowIconified(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowDeiconified(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowActivated(WindowEvent e) {
//
//    }
//
//    @Override
//    public void windowDeactivated(WindowEvent e) {
//
//    }
}//End of Class
