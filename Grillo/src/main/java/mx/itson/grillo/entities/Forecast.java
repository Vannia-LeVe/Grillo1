/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.grillo.entities;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import mx.itson.grillo.enums.WeatherStatus;

/**
 *
 * @author alumnog
 */
public class Forecast {

    /**
     * @return the day
     */
    public Date getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(Date day) {
        this.day = day;
    }

    /**
     * @return the maxTemperature
     */
    public int getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * @param maxTemperature the maxTemperature to set
     */
    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    /**
     * @return the minTemperature
     */
    public int getMinTemperature() {
        return minTemperature;
    }

    /**
     * @param minTemperature the minTemperature to set
     */
    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    /**
     * @return the status
     */
    public WeatherStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(WeatherStatus status) {
        this.status = status;
    }
    private Date day;
    @SerializedName("min temperature")
    private int maxTemperature;
    private int minTemperature;
   
    private WeatherStatus status;

    
    public static double convertirFarenheit(int temp){
        return ((temp *1.8 ) +32);
    }
    
    
}
