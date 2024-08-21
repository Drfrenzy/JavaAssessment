import java.util.Scanner;
public class Nokia3310{
public static void main(String [] args) {
	
String Menu = """
	1 >> PhoneBook
	2 >> Messages
	3 >> Chat
	4 >> Call
	5 >> Tones
	6 >> Settings
	7 >> Call Divert
	8 >> Games
	9 >> Calculator
	10 >> Reminders
	11 >> Clock
	12 >> Profiles
	13 >> SIM Services
	""";
	System.out.println(Menu);

	Scanner menu = new Scanner(System.in);
	System.out.println("Select an option:");
	int option = menu.nextInt();
	

	switch(option){
		case 1:
		System.out.println("PhoneBook");
		String subMenu = """
		1>> Search
		2>> Service Nos
		3>> Add Name
		4>> Erase
		5>> Edit
		6>> Assign Tone
		7>>  Send b'card
		8>> Options
		9>> Speed Dials
		10>> Voice Tags
		""";
		System.out.println(subMenu);

		Scanner newMenu = new Scanner(System.in);
		System.out.println("Select an option:");
		int option1 = newMenu.nextInt();
		switch(option1){
			case 1:
			System.out.println("Search"); break;
			case 2:
			System.out.println("Service Nos"); break;
			case 3:
			System.out.println("Add Name"); break;
			case 4:
			System.out.println("Erase"); break;
			case 5:
			System.out.println("Edit"); break;
			case 6:
			System.out.println("Assign Tone"); break;
			case 7:
			System.out.println("Send b'card"); break;
			case 8:
                    System.out.println("""
                            select from the menu below to continue:
                            ---------------------------------------
                            1 >>> Type Of Views
                            2 >>> Memory Status
                            ---------------------------------------
                            """);
                    break;

					}
		
                 break;
	
		case 2:
		System.out.println("Messages");

		String subMenuTwo = """

		1>> Write Messages
		2>> Inbox
		3>> Outbox
		4>> Picture messages
		5>> Templates
		6>> Smileys
		7>> Message settings
		8>> Info Service
		9>> Voice Mailbox Number
		10. Service Command

		""";
		System.out.println(subMenuTwo);

		Scanner newMenu2 = new Scanner(System.in);
		System.out.println("Select an option:");
		int option2 = newMenu2.nextInt();
		switch(option2){
			case 1:
			System.out.println("Write Message"); break;

			case 2:
			System.out.println("Inbox"); break;

			case 3:
			System.out.println("Outbox"); break;

			case 4:
			System.out.println("Picture Message"); break;

			case 5:
			System.out.println("Template"); break;
			
			case 6:
			System.out.println("Smileys"); break;

			case 7:
			//System.out.println("Message Settings"); 
			System.out.println("Please Enter Sub Option:");
			System.out.println("    1. Set");
			System.out.println("    2. Common");
			Scanner subMenuFor7 = new Scanner(System.in);
			int numberOneSubSection7 = subMenuFor7.nextInt();
			switch(numberOneSubSection7){
				case 1:
				System.out.println("Please Select The Options:");
				System.out.println("     1.Message Centre Number");
				System.out.println("     2.Message Sent As");
				System.out.println("     3.Message Validity");
				Scanner subInput = new Scanner(System.in);
				int num1 = subInput.nextInt();
				switch(num1){
					case 1:	
					System.out.println("Message Centre Number"); break;
					case 2:
					System.out.println("Message Sent As"); break;
					case 3:
					System.out.println("Message Validity"); break;
				}
				break;
				case 2:
				System.out.println("Common");
				System.out.println("Please Select The Options:");
				System.out.println("     1.Delivery Reports");
				System.out.println("     2.Reply Via Same Centre");
				System.out.println("     3.Character Support");
				Scanner newSubInput = new Scanner(System.in);
				int num2 = newSubInput.nextInt();
				switch(num2){
					case 1:	
					System.out.println("Delivery Reports"); break;
					case 2:
					System.out.println("Reply Via Same Centre"); break;
					case 3:
					System.out.println("Character Support"); break;
				}

				break;
			} break;

			case 8:
			System.out.println("Info Service"); 
			break;

			case 9:
			System.out.println("Voice Maiilbox Number");break;

			case 10:
			System.out.println("Service Command");break;

	                   } break;
		case 3:
		System.out.println("Chat"); break;

		case 4:
		System.out.println("Call Register");
		String CallFour = """
			1>> Missed Calls
			2>> Received Calls
			3>> Dialled Numbers
			4>> Erase Recent Call Lists
			5>> Show Call Duration
			6>> Show call costs
			7>> Call cost settings
			8>> Prepaid credit
		""";
		System.out.println(CallFour);
		
		Scanner newMenu4 = new Scanner(System.in);
		System.out.println("Select an option:");
		int optionFour = newMenu4.nextInt();

		switch(optionFour){
			case 1:
			System.out.println("Missed Calls"); break;
			case 2:
			System.out.println("Received Calls"); break;
			case 3:
			System.out.println("Dialled Number"); break;

			case 4:
			System.out.println("Erase Recent Call Lists"); break;

			case 5:
			System.out.println("Show Call Duration"); 
				System.out.println(" 1>> Last Call Duration");
				System.out.println(" 2>> All Calls Duration");
				System.out.println(" 3>> Received Calls' Duration");
				System.out.println(" 4>> Dialled Calls' Duration");
				System.out.println(" 5>> Clear Timer");
				Scanner newSubInput5 = new Scanner(System.in);
				System.out.println("Enter An Option:");
				int num4 = newSubInput5.nextInt();
				switch(num4){
					case 1:System.out.println("Last Call Duration"); break;

					case 2:System.out.println("All Calls Duration"); break;

					case 3: System.out.println("Received Calls' Duration"); break;
					case 4: System.out.println("Dialled Calls' Duration"); break;
					case 5: System.out.println("Clear Timer"); break;
				}

			break;

		case 6:
		System.out.println("Show call costs"); 
			System.out.println("     1.Last Call Cost");
			System.out.println("     2.All calls cost");
			System.out.println("     3.Clear counters");

			Scanner newSubInput6 = new Scanner(System.in);
			System.out.println("Select An Option:");
			int optionFive = newSubInput6.nextInt();
			switch(optionFive){
					case 1:System.out.println("Last Call Cost"); break;

					case 2:System.out.println("All Calls Cost"); break;

					case 3: System.out.println("Clear Counter"); break;
			} break;

		case 7:
		System.out.println("Call Cost Setting");
			System.out.println("1>> Call cost limit");
			System.out.println("2>> Show costs in");

			Scanner newSubInput7 = new Scanner(System.in);
			System.out.println("Select An Option:");
			int optionSix = newSubInput7.nextInt();
			switch(optionSix){
					case 1:System.out.println("Call cost limit"); break;

					case 2:System.out.println("Show costs in"); break;
			} break;
} break;
		case 5:
			System.out.println("Tone Settings");
			String toneFive = """
			1>> Ringing tone
			2>> Ringing volume
			3>> Incoming call alert
			4>> Composer
			5>> Message alert tone
			6>> Keypad tones
			7>> Warning and game tones
			8>> Vibrating alert
			9>> Screen saver
			""";
			System.out.println(toneFive);
		
		System.out.println("Select an option:");
		Scanner sc = new Scanner(System.in);
		int Tonenumber = sc.nextInt();
		switch(Tonenumber){
		case 1: System.out.println("Ringing tone"); break;

		case 2: System.out.println("Ringing volume"); break;

		case 3: System.out.println("Incoming Call Alert"); break;

		case 4: System.out.println("Composer"); break;

		case 5: System.out.println("Message Alert Tone"); break;

		case 6: System.out.println("Keypad Tones"); break;

		case 7: System.out.println("Warning And Game Tones"); break;

		case 8: System.out.println("Vibrating Alert"); break;

		case 9: System.out.println("Screen Saver"); break;
		}break;
		
		case 6:
			System.out.println(" Settings");

			String menuSix = """

			1>> Call settings

			2>> Phone settings

			3>> Security settings

			4>> Restore factory settings
					""";
			System.out.println(menuSix);

			Scanner newMenu6 = new Scanner(System.in);
			System.out.println("Select an option:");
			int option6 = newMenu6.nextInt();
		
			switch(option6){

			case 1: System.out.println("Call Settings:");
			String subMenuSix = """
			1>> Automatic redial

			2>> Speed dialling

			3>> Call waiting options

			4>> Own number sending

			5>> Phone line in use

			6>> Automatic answer
					""";
			System.out.println(subMenuSix);

			Scanner case6Number6 = new Scanner(System.in);
			System.out.println("Select an option");
			int optionNumber6 = case6Number6.nextInt();
			switch(optionNumber6){
				case 1: System.out.println("Automatic redial"); break;

				case 2: System.out.println("Speed dialling"); break;

				case 3: System.out.println("Call waiting options"); break;

				case 4: System.out.println("Own number sending"); break;

				case 5 : System.out.println("Phone line in use"); break;

				case 6: System.out.println("Automatic answer"); break;
			}
			case 2:System.out.println("Phone Settings");
			String subMenuSix2 = """ 
			1>> Language

			2>>  Cell info display

			3>> Welcome note

			4>> Network selection

			5>> Lights

			6>> Confirm SIM service actions
			""";
			System.out.println(subMenuSix2);
			Scanner case6Number7 = new Scanner(System.in);
			System.out.println("Select an option");
			int optionNumber6p = case6Number7.nextInt();
			switch(optionNumber6p){
                        case 1: System.out.println("Language"); break;

			case 2: System.out.println("Cell Info Display"); break;
 
			case 3: System.out.println("Welcome note"); break;
 
			case 4: System.out.println("Network selection"); break;
 
			case 5: System.out.println("Lights"); break;
 
			case 6: System.out.println("Confirm SIM service actions"); break;
			} break;

			case 3:System.out.println("Security settings");
			String subMenuSix3 = """
			1>> PIN code request
			2>> Call barring service
			3>> Fixed dialling
			4>> Closed user group
			5>> Phone security
			6>> Change access codes
			""";
			System.out.println(subMenuSix3);
			Scanner case6Number8 = new Scanner(System.in);
			System.out.println("Select an option");
			int optionNumber6SubSetting3 = case6Number8.nextInt();
			switch(optionNumber6SubSetting3){
                        case 1: System.out.println("PIN code request"); break;
   
			case 2:  System.out.println("Call barring service"); break;

			case 3: System.out.println("Fixed dialling"); break;

			case 4: System.out.println("Closed user group"); break;

			case 5: System.out.println("Phone security"); break;

			case 6: System.out.println("Change access codes"); break;
			} break;
			
			case 4:System.out.println("Restore Factory settings"); break;

	} 
	break;
			case 7: System.out.println("Call Divert"); break;
			case 8: System.out.println("Games"); break;
			case 9: System.out.println("Calculator"); break;
			case 10: System.out.println("Reminder"); break;
			case 11: System.out.println("Clock"); 
			String FinalSubMenu11= """ 
			1. Alarm clock
			2. Clock settings
			3. Date setting
			4. Stopwatch
			5. Countdown timer
			6. Auto update of date and time
			""";
			System.out.println(FinalSubMenu11);
			System.out.println("Select an option:");
			Scanner subMenu11 = new Scanner(System.in);
			int optionNumber11 = subMenu11.nextInt();
			switch(optionNumber11){
				case 1: System.out.println("Alarm Clock"); break;

				case 2: System.out.println("Clock Setting"); break;

				case 3: System.out.println("Date Setting"); break;

				case 4: System.out.println("Stopwatch"); break;

				case 5: System.out.println("Countdown Timer"); break;

				case 6: System.out.println("Auto update of date and time"); break;
			} break;
			case 12: System.out.println("Profiles"); break;

			case 13: System.out.println("SIM Services"); break;

}

}
}