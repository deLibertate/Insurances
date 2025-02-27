package data;

import dict.Type;
import service.Contract;

import java.io.*;


/**
 * This class is used to contain the main info about Client that initiate the contract: type of person, FIO(first,
 * middle, last name), address
 *
 * @author Daryna
 */

public class Client implements Serializable {

    private int id;
    private Type person;
    private String name;
    private String middleName;
    private String surname;
    private String city;
    private String street;
    private String building;
    private Contract contract;


    public Client(Type pers, String name, String middleName, String surname, String city, String street, String building, int id) {
        this.setId(id);
        this.setPerson(pers);
        this.setName(name);
        this.setMiddleName(middleName);
        this.setSurname(surname);
        this.setCity(city);
        this.setStreet(street);
        this.setBuilding(building);
        contract=new Contract();

    }

    public Client(Type pers, String name, String middleName, String surname, String city, String street,
                  String building, int id, Contract contract1) {
        this.setId(id);
        this.setPerson(pers);
        this.setName(name);
        this.setMiddleName(middleName);
        this.setSurname(surname);
        this.setCity(city);
        this.setStreet(street);
        this.setBuilding(building);
        contract=contract1;

    }


    /**
     * @param pers  enum that specify one of types of person ENTITY or NATURAL
     * @param names FIO(first, middle, last name)(for NATURAL person)/name of the organization(for ENTITY person)
     * @param id id
     */
    public Client(Type pers, String names, String city, String street, String building, int id) {
        this.setId(id);
        this.setPerson(pers);
        this.setName(names);
        this.setCity(city);
        this.setStreet(street);
        this.setBuilding(building);

    }

    /**
     * Constructs a new Client with the default parameters
     * Used for avoiding NullPointerExeption
     */
    public Client() {
        this.id = 0;
        this.setPerson(Type.NATURAL);
        this.setName("Noname Nonamov Nonam");
        city="";
        street="";
        building="";
        //contract.setMan(this);
       // contract.setMan(new Client());
    }

    @Override
    public String toString() {
        return "Person:" + this.getPerson() + "\tName:" + this.getName() + " " + this.getMiddleName()
                + " " + this.getSurname() +"\tAdress:" + this.getCity()+", st. "+
                this.getStreet()+", "+this.getBuilding();
    }


    public String localDateAsString() {


        return middleName;
    }
    @Override
    public boolean equals(Object o) {   // Необходима перегрузка метода!!!
        if (!(o instanceof Client))
        return false;
        return ((Client)o).getId() == this.id;
    }
    @Override
    public int hashCode() {// Необходима перегрузка метода!!!
        return id;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getPerson() {
        return person;
    }

    public void setPerson(Type person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }


    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}



