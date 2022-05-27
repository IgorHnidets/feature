
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Device device = new Device(123456, "LG", "Television M156", 800);
        Device device1 = new Device(759603, "Apple", "iPhone 11 Pro Max", 1200);
        Device device2 = new Device(756662, "Samsung", "A50 smartphone", 450);
        Device device3 = new Device(523680, "Tefal", "Opti Grill 125N", 300);

        List<Device> devices = new ArrayList<>(Arrays.asList(device, device1, device2, device3));

//        Task 1
//        List<Device> devices = new ArrayList<>(Arrays.asList(device, device1, device2, device3));
//        System.out.println(devices);

//        Task 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter serial number: ");
//        String input = scanner.nextLine();
//
//        if (input.equals("123456")) {
//            System.out.println(device);
//        } else if (input.equals("759603")) {
//            System.out.println(device1);
//        } else if (input.equals("756662")) {
//            System.out.println(device2);
//        } else if (input.equals("523680")) {
//            System.out.println(device3);
//        } else System.out.println("Error number");

//        Task 3
//        System.out.println("Sorted by name: ");
//        Collections.sort(devices);
//        show(devices);

//         Task 4
        devices.stream().filter(deviceX -> deviceX.getPrice()>=400).forEach(System.out::println);

//         Task 5 Ne znav yak nayty 0 in Serial Number
//        devices.stream().filter(deviceX -> deviceX.getPrice()<=800).filter(devicex->devicex.getSerialNumber()).

//         Task 6
//        Device max = devices.stream().max(Comparator.comparing(Device::getPrice)).orElseThrow(NullPointerException::new);
//        System.out.println(max);
    }
//    For 3 task
//    private static void show(List<Device> devices) {
//        for (Device device4 : devices) {
//            System.out.println(device4);
//        }
//    }
}
