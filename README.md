# (sw_pjv) Semester work on the subject of programming in Java
## Semester work

Part of the student's assessment can be semester work. Students should start thinking up assignments as early as the second week of the semester. Consult the assignment right from the end of the semester with your trainer.

## Requisites of work
The thesis should demonstrate, in addition to the creativity of the student, his ability to object design and the use of at least three of these technological units:

<ol>
  <li>graphical user interface (Java FX),</li>
  <li>database,</li>
  <li>collection,</li>
  <li>networking,</li>
  <li>multithreaded applications,</li>
  <li>AI.</li>
</ol>

An example would be a space shooter for two players with aliens controlled by artificial intelligence.

# Project Name: Email Client Service

## Objective of the project:
The goal of the project is to develop an email client that allows the user to manage their email messages, send and receive emails, view folders, and display and read the contents of emails.

## Project structure:
The project consists of several classes and services, each of which performs a specific function in the email client. Here is a list of files sent earlier, by priority:

### 1. EmailAccount.java:

- Description: A class that represents an email account.
- Functionality: Stores account information, including email address, password, and connection properties. Provides methods for getting and setting field values.

#### An example of using the EmailAccount class:

```
import com.model.EmailAccount;

// Create an instance of an email account
EmailAccount emailAccount = new EmailAccount("user@example.com", "password");

// Getting and setting field values
String address = emailAccount.getAddress();
emailAccount.setAddress("newuser@example.com");

String password = emailAccount.getPassword();
emailAccount.setPassword("newpassword");
```

### 2. ViewFactory.java:

- Description: The class responsible for creating and managing graphical user interface components.
- Functionality: Creates instances of graphical components such as windows, dialog boxes, panels, and controls. Provides methods for displaying and manipulating the user interface.

#### An example of using the ViewFactory class:

```
import com.controller.services.ViewFactory;

// Instantiating a view factory
ViewFactory viewFactory = new ViewFactory();

// Creating and displaying a new window
viewFactory.createWindow("New window", 800, 600);
```

### 3. EmailManager.java:

- Description: A class that manages email operations such as sending, receiving, and displaying emails.
- Functionality: Stores a list of email accounts, manages the process of sending and receiving emails. Provides methods for adding and removing accounts, sending and receiving emails.

#### An example of using the EmailManager class:

```
import com.controller.EmailManager;

// Create an email manager instance
EmailManager emailManager = new EmailManager();

// Adding an email account to the manager
emailManager.addAccount(emailAccount);

// Sending an email
emailManager.sendEmail(emailAccount, "recipient@example.com", "Letter subject", "Email content");
```

### 4. BaseController.java:

- Description: An abstract base class for user interface controllers.
- Functionality: Provides common fields and methods used in controllers, such as access to the email manager and view factory.

#### An example of using the BaseController class:

```
import com.controller.BaseController;

// Instantiating the UI Controller
BaseController controller = new BaseController();

// Access to the email manager
EmailManager emailManager = controller.getEmailManager();
```

### 5. MessageRendererService.java:

- Description: Service for displaying the content of an email message.
- Functionality: Downloads and displays the contents of an email message, including text and HTML formatting.

#### An example of using the MessageRendererService class:

```
import com.controller.services.MessageRendererService;

// Create an instance of the message display service
MessageRendererService messageRendererService = new MessageRendererService();

// Loading and displaying message content
String messageContent = messageRendererService.renderMessageContent(message);
```

### 6. LoginService.java:

- Description: Service for the process of authentication and connection to e-mail.
- Functionality: Checks the user's credentials, establishes a connection to the mail server, adds an email account to the manager.

#### An example of using the LoginService class:

```
import com.controller.services.LoginService;

// Creating an Authentication and Connection Service Instance
LoginService loginService = new LoginService();

// Verifying User Credentials and Establishing a Connection
boolean loginSuccessful = loginService.login(emailAccount);
```

### 7. FolderUpdaterService.java:

- Description: Service for updating information about email folders.
- Functionality: Periodically updates information about folders, gets the number of messages in each folder and updates their status.

#### An example of using the FolderUpdaterService class:

```
import com.controller.services.FolderUpdaterService;

// Create an Instance of the Folder Update Service
FolderUpdaterService folderUpdaterService = new FolderUpdaterService();

// Launching a service to periodically update folders
folderUpdaterService.start();
```

### 8. FetchFoldersService.java:

- Description: Service for getting and displaying a list of email folders.
- Functionality: Loads a list of folders from the mail server, displays them in a hierarchical form, adds event listeners for changing the number of messages in folders.

#### An example of using the FetchFoldersService class:

```
import com.controller.services.FetchFoldersService;

// Instantiate the Get and Display Folder Service
FetchFoldersService fetchFoldersService = new FetchFoldersService();

// Loading and displaying the list of folders
fetchFoldersService.fetchFolders();
```

### 9. EmailSenderService.java:

- Description: Service for sending emails.
- Functionality: Creates and sends an email, sets the sender, recipient, subject and content of the letter.

#### An example of using the EmailSenderService class:

```
import com.controller.services.EmailSenderService;

// Create an instance of the mail service
EmailSenderService emailSenderService = new EmailSenderService(emailAccount, "Тема письма", "recipient@example.com", "Содержимое письма");

// Sending letter
emailSenderService.start();
```

#### Each of these files plays a specific role in the functionality of the email client and interacts with other classes and services to complete the application.

### Launch of the project:

1. Make sure you have Java Development Kit (JDK) version 8 or higher installed on your computer.
2. Do a git clone <repository link> on your computer's desktop.
3. Open your development environment (such as IntelliJ IDEA or Eclipse).
4. Import the "Email Client Service" project into the development environment as a Java project.
5. Install all the necessary dependencies and libraries (IDE will tell you exactly what you need to install to successfully launch the project :).
6. Locate and open the Launcher.java class, which contains the main() method, which will be the entry point to the application.
7. Run the application by clicking the "Run" button or using the appropriate command in the development environment.
Note: Depending on the development environment used and the project configuration, the startup procedure may vary slightly. Make sure you follow the instructions that are appropriate for your development environment and project.

### After successfully launching the "Email Client Service" project, you will be able to use the functionality of the email client, including sending and receiving emails, viewing folders, and reading the contents of emails. Manage your email accounts and enjoy a user-friendly email interface.

## Evaluation  
  
<img width="287" alt="Screenshot 2023-05-31 at 12 24 04" src="https://github.com/mikezigberman/sw_pjv/assets/30218257/0c4ffc4a-96d9-4b8a-ab87-56ed885351d8">
