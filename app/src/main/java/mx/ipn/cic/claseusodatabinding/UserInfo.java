package mx.ipn.cic.claseusodatabinding;


/*
public class UserInfo {
    public String firstName;
    public String lastName;

    /*
    public String firstName;
    public String lastName;
    public Date birthDate;
    public String address;
    public String state;
    public String country;
    public String email;
    public String phone;
    public String facebook;


    public UserInfo(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
*/

import android.graphics.Color;

// Usando Beans.
public class UserInfo
{
    private String firstName;
    private String lastName;
    private Color color;

    UserInfo(String firstName, String lastName, Color color)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.color = color;
    }

    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public Color getColor() { return this.color;}
}

