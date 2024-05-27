import codeSmells.lab5.part1.NewUserListProcessor;
import codeSmells.lab5.part1.User;
import codeSmells.lab5.part2.Item;
import codeSmells.lab5.part2.Order;
import codeSmells.lab5.part2.OrderProcessor;
import codeSmells.lab5.part3.Person;
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