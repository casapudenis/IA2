import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tatiana",new Address("Rovinari",4));
        System.out.println("Initial address:");
        person.personAddress();
        person.setAddress(new Address("Vantului",13));
        person.personAddress();
        City first_city = new City("Craiova");
        City second_city = new City("Bucuresti");
        Hotel first_hotel = new Hotel("Ramada Plaza",new Address("Calea Bucuresti",1),first_city);
        Hotel second_hotel = new Hotel("Intercontinental",new Address("Nicolae Balcescu",4),second_city);
        Hotel third_hotel = new Hotel("Parc",new Address("Bibescu",12),first_city);
        ArrayList <Hotel> hotels=new ArrayList<>();
        hotels.add(first_hotel);
        hotels.add(second_hotel);
        hotels.add(third_hotel);
        Tourist first_tourist = new Tourist("Ionut",new Address("Vantului",13));
        Tourist second_tourist = new Tourist("Mihai",new Address("Rovinari",4));
        System.out.println();
        System.out.println("Tourists at Ramada Plaza");
        first_hotel.addTourist(first_tourist);
        first_hotel.addTourist(second_tourist);
        first_hotel.printTourists();
        System.out.println("Tourists at Intercontinental after moves");
        second_hotel.printTourists();
        second_hotel.moveTourist(first_hotel,first_tourist);
        second_hotel.printTourists();
        System.out.println();
        System.out.println("Hotels situated in Craiova");
        for(int i=0;i<hotels.size();i++)
        {
            if(hotels.get(i).getCity()==first_city)
                hotels.get(i).printHotelName();
        }
    }
}