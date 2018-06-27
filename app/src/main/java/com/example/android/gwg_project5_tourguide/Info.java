package com.example.android.gwg_project5_tourguide;

public class Info {

    private int resourceID = IMAGE_NOT_PROVIDED;
    private static final int IMAGE_NOT_PROVIDED = -1;
    private String name;
    private String description;
    private String location;
    private String contact;
    private String website;

    public Info(int ResourceID, String Name, String Description, String Location, String Contact, String Website){
        resourceID = ResourceID;
        name = Name;
        description = Description;
        location = Location;
        contact = Contact;
        website = Website;
    }

    public int getResourceID() {
        return resourceID;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getContact() {
        return contact;
    }

    public String getWebsite() {
        return website;
    }


}
