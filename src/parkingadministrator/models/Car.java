/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingadministrator.models;

/**
 *
 * @author Diego Aguilef
 */
public class Car {
//     create table cars(
//       patent varchar(8), 
//       brand varchar(20), 
//       color varchar(15), 
//       motorNumber int(11),
//       fuelType bit(1), 
//       manufacturingYear varchar(4),
//       ownerRut varchar(10),
//       ownerName varchar(20)
//     );
    
    private String patent;
    private String brand;
    private String color;
    private int motorNumber;
    private byte fuelType;
    private int manufacturingYear;
    private String ownerRut;
    private String ownerName;

    /**
     *
     */
    public Car() {
    }

    /**
     *
     * @param patent
     * @param brand
     * @param color
     * @param motorNumber
     * @param fuelType
     * @param manufacturingYear
     * @param ownerRut
     * @param ownerName
     */
    public Car(String patent, String brand, String color, int motorNumber, byte fuelType, int manufacturingYear, String ownerRut, String ownerName) {
        this.patent = patent;
        this.brand = brand;
        this.color = color;
        this.motorNumber = motorNumber;
        this.fuelType = fuelType;
        this.manufacturingYear = manufacturingYear;
        this.ownerRut = ownerRut;
        this.ownerName = ownerName;
    }

    /**
     *
     * @return
     */
    public String getPatent() {
        return patent;
    }

    /**
     *
     * @param patent
     */
    public void setPatent(String patent) {
        this.patent = patent;
    }

    /**
     *
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public int getMotorNumber() {
        return motorNumber;
    }

    /**
     *
     * @param motorNumber
     */
    public void setMotorNumber(int motorNumber) {
        this.motorNumber = motorNumber;
    }

    /**
     *
     * @return
     */
    public byte getFuelType() {
        return fuelType;
    }

    /**
     *
     * @param fuelType
     */
    public void setFuelType(byte fuelType) {
        this.fuelType = fuelType;
    }
    
    /**
     *
     * @return
     */
    public String getFuelTypeAsText(){
        return getFuelType() == 0 ? "Bencina" : "Petroleo";
    }

    /**
     *
     * @return
     */
    public int getManufacturingYear() {
        return manufacturingYear;
    }

    /**
     *
     * @param manufacturingYear
     */
    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    /**
     *
     * @return
     */
    public String getOwnerRut() {
        return ownerRut;
    }

    /**
     *
     * @param ownerRut
     */
    public void setOwnerRut(String ownerRut) {
        this.ownerRut = ownerRut;
    }

    /**
     *
     * @return
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     *
     * @param ownerName
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Auto{" + 
                "Patente=" + patent + 
                ", Marca=" + brand + 
                ", Color=" + color + 
                ", N° Motor=" + motorNumber + 
                ", Tipo Combustible=" + getFuelTypeAsText() + 
                ", Año Fabricación=" + manufacturingYear + 
                ", Rut Dueño=" + ownerRut + 
                ", Nombre Dueño=" + ownerName + '}';
    }
    
    
    
}
