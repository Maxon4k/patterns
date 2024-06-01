import codeSmells.lab5.part1.NewUserListProcessor;
import codeSmells.lab5.part1.User;
import codeSmells.lab5.part2.Item;
import codeSmells.lab5.part2.Order;
import codeSmells.lab5.part2.OrderProcessor;
import codeSmells.lab5.part3.Person;
import patterns.behavioral.ChainOFresponsibilities.*;
import patterns.behavioral.Command.Command;
import patterns.behavioral.Command.Light;
import patterns.behavioral.Command.LightOffCommand;
import patterns.behavioral.Command.LightOnCommand;
import patterns.behavioral.Mediator.*;
import patterns.behavioral.Iterator.DinnerMenu;
import patterns.behavioral.Iterator.Waitress;
import patterns.behavioral.Memento.Caretaker;
import patterns.behavioral.Memento.Originator;
import patterns.behavioral.Observer.CurrentConditionsDisplay;
import patterns.behavioral.Observer.WeatherData;
import patterns.behavioral.State.MusicPlayer;
import patterns.behavioral.Strategy.BankTransferPayment;
import patterns.behavioral.Strategy.CreditCardPayment;
import patterns.behavioral.Strategy.PayPalPayment;
import patterns.behavioral.Strategy.ShoppingCart;
import patterns.behavioral.TemplateMethod.CustomerReport;
import patterns.behavioral.TemplateMethod.FinancialReport;
import patterns.behavioral.TemplateMethod.Report;
import patterns.behavioral.TemplateMethod.SalesReport;
import patterns.behavioral.Visitor.Directory;
import patterns.behavioral.Visitor.File;
import patterns.behavioral.Visitor.NamePrinterVisitor;
import patterns.behavioral.Visitor.SizeCalculatorVisitor;
import patterns.creational.abstractFactory.*;
import patterns.creational.builder.Computer;
import patterns.creational.factory.*;
import patterns.creational.factory.Character;
import patterns.creational.prototype.AdvancedRobot;
import patterns.creational.prototype.BasicRobot;
import patterns.creational.prototype.Robot;
import patterns.creational.prototype.RobotRegistry;
import patterns.creational.singleton.Logger;
import patterns.structural.adapter.EuropeanSocket;
import patterns.structural.adapter.Socket;
import patterns.structural.adapter.SocketAdapter;
import patterns.structural.bridge.*;
import patterns.structural.composer.Department;
import patterns.structural.composer.Employee;
import patterns.structural.composer.EmployeeComponent;
import patterns.structural.decorator.BakeryItem;
import patterns.structural.decorator.Cake;
import patterns.structural.decorator.CookiesDecorator;
import patterns.structural.decorator.PastriesDecorator;
import patterns.structural.facade.OnlineShoppingFacade;
import patterns.structural.lightweight.TextEditor;
import patterns.structural.substitute.DefaultFile;
import patterns.structural.substitute.FileSystem;
import patterns.structural.substitute.NullFile;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("lab1");
        System.out.println("____________________________________________________");
        System.out.println("Factory");
        CharacterFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter();
        System.out.println(warrior.attack());
        System.out.println(warrior.defend());

        CharacterFactory mageFactory = new MageFactory();
        Character mage = mageFactory.createCharacter();
        System.out.println(mage.attack());
        System.out.println(mage.defend());

        CharacterFactory archerFactory = new ArcherFactory();
        Character archer = archerFactory.createCharacter();
        System.out.println(archer.attack());
        System.out.println(archer.defend());


        System.out.println("____________________________________________________");
        System.out.println("builder");
        // Creating a gaming computer
        Computer gamingComputer = new Computer.ComputerBuilder("2TB", "32GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
        // Creating a standard computer
        Computer standardComputer = new Computer.ComputerBuilder("1TB", "16GB")
                .setGraphicsCardEnabled(false)
                .setBluetoothEnabled(false)
                .build();
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Standard Computer: " + standardComputer);


        System.out.println("____________________________________________________");
        System.out.println("prototype");
        Robot basicRobotPrototype = new BasicRobot("ModelX", "Red");
        Robot advancedRobotPrototype = new AdvancedRobot("ModelY", "Blue", "Laser");
        RobotRegistry robotRegistry = new RobotRegistry();
        robotRegistry.addPrototype("basic", basicRobotPrototype);
        robotRegistry.addPrototype("advanced", advancedRobotPrototype);
        Robot clonedBasicRobot = robotRegistry.getRobot("basic");
        Robot clonedAdvancedRobot = robotRegistry.getRobot("advanced");
        clonedBasicRobot.showDetails();    // Outputs: BasicRobot [Model: ModelX, Color: Red]
        clonedAdvancedRobot.showDetails(); // Outputs: AdvancedRobot [Model: ModelY, Color: Blue, Weapon: Laser]


        System.out.println("____________________________________________________");
        System.out.println("singleton");
        Logger logger = Logger.getInstance();
        logger.log("Application started");
        logger.log("An error occurred");
        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("This will also use the same logger instance");
        System.out.println(logger == anotherLogger);


        System.out.println("____________________________________________________");
        System.out.println("abstractFactory");
        String vehicleType = "car";
        VehicleApplication app = configureApplication(vehicleType);
        app.manufacture();
        System.out.println("lab2");


        System.out.println("____________________________________________________");
        System.out.println("adapter");
        EuropeanSocket europeanSocket = new EuropeanSocket();
        Socket adapter = new SocketAdapter(europeanSocket);
        adapter.plugIn();


        System.out.println("____________________________________________________");
        System.out.println("bridge");
        Device tv = new TV();
        RemoteControl remote = new BasicRemote(tv);
        remote.powerOn();
        remote.setChannel(5);
        remote.powerOff();
        Device radio = new Radio();
        remote = new BasicRemote(radio);
        remote.powerOn();
        remote.setChannel(101);
        remote.powerOff();


        System.out.println("____________________________________________________");
        System.out.println("composer");
        EmployeeComponent ceo = new Employee("John Doe", "CEO");
        EmployeeComponent manager1 = new Employee("Alice Smith", "Manager");
        EmployeeComponent manager2 = new Employee("Bob Johnson", "Manager");
        EmployeeComponent staff1 = new Employee("Eva Brown", "Staff");
        EmployeeComponent staff2 = new Employee("Max Wilson", "Staff");
        EmployeeComponent staff3 = new Employee("Sophia Miller", "Staff");
        Department salesDepartment = new Department("Sales");
        salesDepartment.addEmployee(manager1);
        salesDepartment.addEmployee(staff1);
        salesDepartment.addEmployee(staff2);
        Department marketingDepartment = new Department("Marketing");
        marketingDepartment.addEmployee(manager2);
        marketingDepartment.addEmployee(staff3);
        Department company = new Department("Company");
        company.addEmployee(ceo);
        company.addEmployee(salesDepartment);
        company.addEmployee(marketingDepartment);
        company.showDetails();


        System.out.println("____________________________________________________");
        System.out.println("decorator");
        BakeryItem cake = new Cake();
        System.out.println("Description: " + cake.getDescription() + ", Cost: $" + cake.cost());
        BakeryItem cakeWithPastries = new PastriesDecorator(new Cake());
        System.out.println("Description: " + cakeWithPastries.getDescription() + ", Cost: $" + cakeWithPastries.cost());
        BakeryItem cakeWithPastriesAndCookies = new CookiesDecorator(new PastriesDecorator(new Cake()));
        System.out.println("Description: " + cakeWithPastriesAndCookies.getDescription() + ", Cost: $" + cakeWithPastriesAndCookies.cost());


        System.out.println("____________________________________________________");
        System.out.println("facade");
        OnlineShoppingFacade onlineShopping = new OnlineShoppingFacade();
        onlineShopping.addToCart("ABC123", 2);
        onlineShopping.addToCart("XYZ456", 1);
        onlineShopping.checkout("Credit Card");


        System.out.println("____________________________________________________");
        System.out.println("lightweight");
        TextEditor editor = new TextEditor();
        editor.applyStyle("bold", "This is bold text.");
        editor.applyStyle("italic", "This is italic text.");
        editor.applyStyle("underline", "This is underlined text.");
        editor.applyStyle("bold", "This is another bold text.");


        System.out.println("____________________________________________________");
        System.out.println("substitute");
        FileSystem defaultFileSystem = new FileSystem(new DefaultFile());
        defaultFileSystem.readFile(); // Outputs: Reading file content
        defaultFileSystem.writeFile("Some data"); // Outputs: Writing data to file: Some data
        FileSystem nullFileSystem = new FileSystem(new NullFile());
        nullFileSystem.readFile(); // Outputs: No file found.
        nullFileSystem.writeFile("Some data"); // Outputs: Cannot write to null file.


        System.out.println("____________________________________________________");
        System.out.println("codeSmells");
        System.out.println("lab5");
        System.out.println("part1");
        User user = new User("Mav3r1ck", "!", "!", "!");
        User user2 = new User("admin", "!", "!", "!");
        ArrayList<User> userList = new ArrayList<>();
        userList.add(user);
        NewUserListProcessor newUserListProcessor = new NewUserListProcessor(userList);
        newUserListProcessor.addUser(user2);
        newUserListProcessor.sendEmailToUser(user);
        newUserListProcessor.processUserList();
        newUserListProcessor.adminCount();


        System.out.println("____________________________________________________");
        System.out.println("part2");
        Item item1 = new Item("Apple", 1.0);
        Item item2 = new Item("Banana", 2.0);
        Order order = new Order("John Doe", Arrays.asList(item1, item2));
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(order);


        System.out.println("____________________________________________________");
        System.out.println("part3");
        Person person = new Person("Alice", 25, "Female");
        person.addFriend("Bob");
        person.addEnemy("Charlie");
        person.addTask("Buy groceries");
        person.displayInfo();


        System.out.println("____________________________________________________");
        System.out.println("behavioral");
        System.out.println("ChainOFresponsibilities");
            Handler level1Support = new Level1Support();
            Handler level2Support = new Level2Support();
            Handler level3Support = new Level3Support();
            level1Support.setNextHandler(level2Support);
            level2Support.setNextHandler(level3Support);
            SupportRequest request1 = new SupportRequest("Password reset", 1);
            SupportRequest request2 = new SupportRequest("Software installation", 2);
            SupportRequest request3 = new SupportRequest("Network issue", 3);
            level1Support.handleRequest(request1);
            level1Support.handleRequest(request2);
            level1Support.handleRequest(request3);


        System.out.println("____________________________________________________");
        System.out.println("Commands");
        {
            Light livingRoomLight = new Light();
            Command lightOn = new LightOnCommand(livingRoomLight);
            Command lightOff = new LightOffCommand(livingRoomLight);
            patterns.behavioral.Command.RemoteControl remote1 = new patterns.behavioral.Command.RemoteControl();
            remote1.setCommand(lightOn);
            remote1.pressButton();
            remote1.setCommand(lightOff);
            remote1.pressButton();
            remote1.pressUndo();
        }


        System.out.println("____________________________________________________");
        System.out.println("Iterator");
        DinnerMenu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(dinnerMenu);
        waitress.printMenu();


        System.out.println("____________________________________________________");
        System.out.println("Mediator");
        Mediator mediator = new HomeAutomationMediator();
        SmartDevice light1 = new patterns.behavioral.Mediator.Light(mediator, "Living Room Light");
        SmartDevice thermostat = new Thermostat(mediator, "Living Room Thermostat");
        SmartDevice camera = new SecurityCamera(mediator, "Front Door Camera");
        mediator.addDevice(light1);
        mediator.addDevice(thermostat);
        mediator.addDevice(camera);
        light1.sendMessage("Light turned on");
        thermostat.sendMessage("Temperature set to 22°C");
        camera.sendMessage("Motion detected at the front door");


        System.out.println("____________________________________________________");
        System.out.println("Memento");
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("State #1");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento());
        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(caretaker.undo());
        System.out.println("Undo: " + originator.getState());
        originator.getStateFromMemento(caretaker.undo());
        System.out.println("Undo: " + originator.getState());
        originator.getStateFromMemento(caretaker.redo());
        System.out.println("Redo: " + originator.getState());
        originator.getStateFromMemento(caretaker.redo());
        System.out.println("Redo: " + originator.getState());


        System.out.println("____________________________________________________");
        System.out.println("Observer");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);


        System.out.println("____________________________________________________");
        System.out.println("State");
        MusicPlayer player = new MusicPlayer();
        player.pressPlay();
        player.pressPause();
        player.pressPlay();
        player.pressStop();
        player.pressPause();


        System.out.println("____________________________________________________");
        System.out.println("Strategy");
        ShoppingCart cart = new ShoppingCart();
        patterns.behavioral.Strategy.Item item11 = new  patterns.behavioral.Strategy.Item("Book", 500);
        patterns.behavioral.Strategy.Item item22 = new  patterns.behavioral.Strategy.Item("Pen", 100);
        cart.addItem(item11);
        cart.addItem(item22);
        cart.pay(new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23"));
        cart.pay(new PayPalPayment("john.doe@example.com", "password"));
        cart.pay(new BankTransferPayment("9876543210", "ABC Bank"));


        System.out.println("____________________________________________________");
        System.out.println("Template Method");
        Report financialReport = new FinancialReport();
        financialReport.generateReport();
        Report salesReport = new SalesReport();
        salesReport.generateReport();
        Report customerReport = new CustomerReport();
        customerReport.generateReport();


        System.out.println("____________________________________________________");
        System.out.println("Visitor");
        Directory root = new Directory("root");
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);
        Directory subDir = new Directory("subDir");
        File file3 = new File("file3.txt", 300);
        root.addElement(file1);
        root.addElement(file2);
        root.addElement(subDir);
        subDir.addElement(file3);
        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        root.accept(sizeCalculator);
        System.out.println("Total size: " + sizeCalculator.getTotalSize());
        NamePrinterVisitor namePrinter = new NamePrinterVisitor();
        root.accept(namePrinter);

    }
    private static VehicleApplication configureApplication(String vehicleType) {
        VehicleApplication app;
        VehicleFactory factory;
        switch (vehicleType.toLowerCase()) {
            case "car":
                factory = new CarFactory();
                break;
            case "bike":
                factory = new BikeFactory();
                break;
            case "truck":
                factory = new TruckFactory();
                break;
            default:
                throw new IllegalArgumentException("Unknown vehicle type.");
        }
        app = new VehicleApplication(factory);
        return app;
    }
}