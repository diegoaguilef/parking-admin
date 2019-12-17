/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingadministrator.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import parkingadministrator.connection.DBConnection;
import parkingadministrator.models.Car;

/**
 *
 * @author Diego Aguilef
 */
public class CarsDAO {

    private static ArrayList<Car> cars = new ArrayList<>();
    private static Connection conn;
    private static Statement st;
    private static String query;
    
    private static void connect() throws SQLException {
        conn = new DBConnection().getConnection();
        st = conn.createStatement();
    }

    /**
     *
     * @param car
     * @return
     * @throws SQLException
     */
    public static boolean create(Car car) throws SQLException {
        connect();
        query = "INSERT INTO cars values ("
                + "\'" + car.getPatent() + "\'" + ","
                + "\'" + car.getBrand() + "\'" + ","
                + "\'" + car.getColor() + "\'" + ","
                + car.getMotorNumber() + ","
                + car.getFuelType() + ","
                + car.getManufacturingYear() + ","
                + "\'" + car.getOwnerRut() + "\'" + ","
                + "\'" + car.getOwnerName() + "\'" + ");";

        return st.executeUpdate(query) == 1;
    }

    /**
     *
     * @param car
     * @return
     * @throws SQLException
     */
    public static boolean edit(Car car) throws SQLException {
        connect();
        return (st.execute("UPDATE cars "
                + "SET brand='" + car.getBrand() + "\' "
                + ", color='" + car.getColor() + "\' "
                + ", motorNumber=" + car.getMotorNumber() + " "
                + ", fuelType=" + car.getFuelType() + " "
                + ", manufacturingYear=" + car.getManufacturingYear() + " "
                + ", ownerRut='" + car.getOwnerRut() + "\' "
                + ", ownerName='" + car.getOwnerName() + "\' "
                + "WHERE patent = '" + car.getPatent() + "';"));
    }

    /**
     *
     * @param patent
     * @return
     * @throws SQLException
     */
    public static Car search(String patent) throws SQLException {
        connect();
        Car c = null;
        ResultSet rs = st.executeQuery("SELECT * FROM cars where patent = '" + patent + "';");
        while (rs.next()) {
            c = new Car();
            c.setPatent(rs.getString("patent"));
            c.setBrand(rs.getString("brand"));
            c.setColor(rs.getString("color"));
            c.setMotorNumber(Integer.parseInt(rs.getString("motorNumber")));
            c.setFuelType(Byte.parseByte(rs.getString("fuelType")));
            c.setManufacturingYear(Integer.parseInt(rs.getString("manufacturingYear")));
            c.setOwnerRut(rs.getString("ownerRut"));
            c.setOwnerName(rs.getString("ownerName"));
        }
        return c;
    }

    /**
     *
     * @param patent
     * @return
     * @throws SQLException
     */
    public static boolean delete(String patent) throws SQLException {
        connect();
        return st.executeUpdate("DELETE FROM cars WHERE patent='" + patent + "';") == 1;
    }

    /**
     *
     * @return
     * @throws SQLException
     */
    public static ArrayList<Car> all() throws SQLException {
        connect();
        cars = new ArrayList<>();
        Car car = null;
        ResultSet rs = st.executeQuery("SELECT * FROM cars;");
        while (rs.next()) {
            car = new Car();
            car.setPatent(rs.getString("patent"));
            car.setBrand(rs.getString("brand"));
            car.setColor(rs.getString("color"));
            car.setMotorNumber(Integer.parseInt(rs.getString("motorNumber")));
            car.setFuelType(Byte.parseByte(rs.getString("fuelType")));
            car.setManufacturingYear(Integer.parseInt(rs.getString("manufacturingYear")));
            car.setOwnerRut(rs.getString("ownerRut"));
            car.setOwnerName(rs.getString("ownerName"));

            cars.add(car);
        }
        conn.close();
        return cars;
    }

    /**
     *
     * @param brand
     * @return
     * @throws SQLException
     */
    public static ArrayList<Car> search_by_brand(String brand) throws SQLException {
        connect();
        cars = new ArrayList<>();
        Car car = null;
        ResultSet rs = st.executeQuery("SELECT * FROM cars WHERE brand ='" + brand + "';");
        while (rs.next()) {
            car = new Car();
            car.setPatent(rs.getString("patent"));
            car.setBrand(rs.getString("brand"));
            car.setColor(rs.getString("color"));
            car.setMotorNumber(Integer.parseInt(rs.getString("motorNumber")));
            car.setFuelType(Byte.parseByte(rs.getString("fuelType")));
            car.setManufacturingYear(Integer.parseInt(rs.getString("manufacturingYear")));
            car.setOwnerRut(rs.getString("ownerRut"));
            car.setOwnerName(rs.getString("ownerName"));

            cars.add(car);
        }
        conn.close();
        return cars;
    }
    
    /**
     *
     * @param motorNum
     * @return
     * @throws SQLException
     */
    public static ArrayList<Car> search_by_motor(int motorNum) throws SQLException {
        connect();
        cars = new ArrayList<>();
        Car car = null;
        ResultSet rs = st.executeQuery("SELECT * FROM cars WHERE motorNumber ='" + motorNum + "';");
        while (rs.next()) {
            car = new Car();
            car.setPatent(rs.getString("patent"));
            car.setBrand(rs.getString("brand"));
            car.setColor(rs.getString("color"));
            car.setMotorNumber(Integer.parseInt(rs.getString("motorNumber")));
            car.setFuelType(Byte.parseByte(rs.getString("fuelType")));
            car.setManufacturingYear(Integer.parseInt(rs.getString("manufacturingYear")));
            car.setOwnerRut(rs.getString("ownerRut"));
            car.setOwnerName(rs.getString("ownerName"));

            cars.add(car);
        }
        conn.close();
        return cars;
    }
    
    /**
     *
     * @param color
     * @return
     * @throws SQLException
     */
    public static ArrayList<Car> search_by_color(String color) throws SQLException {
        connect();
        cars = new ArrayList<>();
        Car car = null;
        ResultSet rs = st.executeQuery("SELECT * FROM cars WHERE color ='" + color + "';");
        while (rs.next()) {
            car = new Car();
            car.setPatent(rs.getString("patent"));
            car.setBrand(rs.getString("brand"));
            car.setColor(rs.getString("color"));
            car.setMotorNumber(Integer.parseInt(rs.getString("motorNumber")));
            car.setFuelType(Byte.parseByte(rs.getString("fuelType")));
            car.setManufacturingYear(Integer.parseInt(rs.getString("manufacturingYear")));
            car.setOwnerRut(rs.getString("ownerRut"));
            car.setOwnerName(rs.getString("ownerName"));

            cars.add(car);
        }
        conn.close();
        return cars;
    }
    
    /**
     *
     * @param fuelType
     * @return
     * @throws SQLException
     */
    public static ArrayList<Car> search_by_fuel_type(byte fuelType) throws SQLException {
        connect();
        cars = new ArrayList<>();
        Car car = null;
        ResultSet rs = st.executeQuery("SELECT * FROM cars WHERE fuelType =" + fuelType + ";");
        while (rs.next()) {
            car = new Car();
            car.setPatent(rs.getString("patent"));
            car.setBrand(rs.getString("brand"));
            car.setColor(rs.getString("color"));
            car.setMotorNumber(Integer.parseInt(rs.getString("motorNumber")));
            car.setFuelType(Byte.parseByte(rs.getString("fuelType")));
            car.setManufacturingYear(Integer.parseInt(rs.getString("manufacturingYear")));
            car.setOwnerRut(rs.getString("ownerRut"));
            car.setOwnerName(rs.getString("ownerName"));

            cars.add(car);
        }
        conn.close();
        return cars;
    }
    
    /**
     *
     * @param year
     * @return
     * @throws SQLException
     */
    public static ArrayList<Car> search_by_manufacturing_year(int year) throws SQLException {
        connect();
        cars = new ArrayList<>();
        Car car = null;
        ResultSet rs = st.executeQuery("SELECT * FROM cars WHERE manufacturingYear ='" + year + "';");
        while (rs.next()) {
            car = new Car();
            car.setPatent(rs.getString("patent"));
            car.setBrand(rs.getString("brand"));
            car.setColor(rs.getString("color"));
            car.setMotorNumber(Integer.parseInt(rs.getString("motorNumber")));
            car.setFuelType(Byte.parseByte(rs.getString("fuelType")));
            car.setManufacturingYear(Integer.parseInt(rs.getString("manufacturingYear")));
            car.setOwnerRut(rs.getString("ownerRut"));
            car.setOwnerName(rs.getString("ownerName"));

            cars.add(car);
        }
        conn.close();
        return cars;
    }
    
    /**
     *
     * @param rut
     * @return
     * @throws SQLException
     */
    public static ArrayList<Car> search_by_owner_rut(String rut) throws SQLException {
        connect();
        cars = new ArrayList<>();
        Car car = null;
        ResultSet rs = st.executeQuery("SELECT * FROM cars WHERE ownerRut ='" + rut + "';");
        while (rs.next()) {
            car = new Car();
            car.setPatent(rs.getString("patent"));
            car.setBrand(rs.getString("brand"));
            car.setColor(rs.getString("color"));
            car.setMotorNumber(Integer.parseInt(rs.getString("motorNumber")));
            car.setFuelType(Byte.parseByte(rs.getString("fuelType")));
            car.setManufacturingYear(Integer.parseInt(rs.getString("manufacturingYear")));
            car.setOwnerRut(rs.getString("ownerRut"));
            car.setOwnerName(rs.getString("ownerName"));

            cars.add(car);
        }
        conn.close();
        return cars;
    }
    
    /**
     *
     * @param name
     * @return
     * @throws SQLException
     */
    public static ArrayList<Car> search_by_owner_name(String name) throws SQLException {
        connect();
        cars = new ArrayList<>();
        Car car = null;
        ResultSet rs = st.executeQuery("SELECT * FROM cars WHERE ownerName ='" + name + "';");
        while (rs.next()) {
            car = new Car();
            car.setPatent(rs.getString("patent"));
            car.setBrand(rs.getString("brand"));
            car.setColor(rs.getString("color"));
            car.setMotorNumber(Integer.parseInt(rs.getString("motorNumber")));
            car.setFuelType(Byte.parseByte(rs.getString("fuelType")));
            car.setManufacturingYear(Integer.parseInt(rs.getString("manufacturingYear")));
            car.setOwnerRut(rs.getString("ownerRut"));
            car.setOwnerName(rs.getString("ownerName"));

            cars.add(car);
        }
        conn.close();
        return cars;
    }
}
