
public class Main {
    public static void main(String[] args) {

        try {
            Manager manager = new Manager("Trevor", "Bacrit", 465, 956);
            Employee employee = new Employee("Eduard", "Hovart", 0);

            Registry registry = Registry.getRegistry();
            registry.addWorker(manager);
            registry.addWorker(employee);
            registry.printList();
            registry.addWorker(employee); // Error(Такий працівник вже є в реєстрі)

        } catch (FieldLengthLimitException | IncorrectSalaryException | EmployeeInRegistryException e) {
            e.printStackTrace();
        }
    }
}