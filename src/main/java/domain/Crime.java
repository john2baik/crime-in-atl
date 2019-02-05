package domain;

import java.sql.Time;
import java.util.Date;

public class Crime {

    private String reportNumber; // 1
    private Date reportedDate; //2
    private Date occurDate; //3
    private Time occurTime; //4
    private Date possibleDate; //5
    private Date possibleTime; //6

    private String location; //10
    private String shift; //15
    private String day; //16
    private String crimeType; //18
    private String neighborhood; //19


    public Crime(String reportNumber, Date reportedDate, Date occurDate, Time occurTime, Date possibleDate, Date possibleTime, String location, String shift, String day, String crimeType, String neighborhood) {
        this.reportNumber = reportNumber;
        this.reportedDate = reportedDate;
        this.occurDate = occurDate;
        this.occurTime = occurTime;
        this.possibleDate = possibleDate;
        this.possibleTime = possibleTime;
        this.location = location;
        this.shift = shift;
        this.day = day;
        this.crimeType = crimeType;
        this.neighborhood = neighborhood;
    }


    public String getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    public Date getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(Date reportedDate) {
        this.reportedDate = reportedDate;
    }

    public Date getOccurDate() {
        return occurDate;
    }

    public void setOccurDate(Date occurDate) {
        this.occurDate = occurDate;
    }

    public Time getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Time occurTime) {
        this.occurTime = occurTime;
    }

    public Date getPossibleDate() {
        return possibleDate;
    }

    public void setPossibleDate(Date possibleDate) {
        this.possibleDate = possibleDate;
    }

    public Date getPossibleTime() {
        return possibleTime;
    }

    public void setPossibleTime(Date possibleTime) {
        this.possibleTime = possibleTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }



}
