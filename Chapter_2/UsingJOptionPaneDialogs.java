import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
public static void main(String[] args) {
// Loop to allow multiple attempts for input if user chooses not to show name
while (true) {
// Prompt user to enter their name
String name = JOptionPane.showInputDialog(null, "Please enter your name:");

// If the user clicks Cancel or closes the dialog
if (name == null || name.trim().isEmpty()) {
break; // Exit the program if no name was entered (Cancel or empty input)
}

// Show a confirmation dialog to ask if they want to display the name
int response = JOptionPane.showConfirmDialog(null,
"Do you want to display your name: " + name + "?",
"Confirm Name",
JOptionPane.YES_NO_CANCEL_OPTION); // Added CANCEL_OPTION

// Handle the user's response
if (response == JOptionPane.YES_OPTION) {
JOptionPane.showMessageDialog(null, "Your name is: " + name);
break; // Exit after displaying the name
} else if (response == JOptionPane.NO_OPTION) {
continue; // Start over, allowing the user to input a new name
} else if (response == JOptionPane.CANCEL_OPTION) {
break; // Exit if the user clicks "Cancel"
}
}
}
}


if (response == JOptionPane.YES_OPTION) {
JOptionPane.showMessageDialog(null, "Your name is: " + name);
break;
}

else if (response == JOptionPane.NO_OPTION) {
continue;
}
}
}
}
