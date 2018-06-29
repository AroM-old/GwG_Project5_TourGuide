package com.example.android.gwg_project5_tourguide;

/**
* {@link Info} Represent information about places to visit on
* Dominican Republic, contains image, name, description, location,
* contact and website data to display.
* */
public class Info {

    /** Default image for place*/
    private int resourceID = IMAGE_NOT_PROVIDED;

    /** Constant value that represent that not image was provide for this place*/
    private static final int IMAGE_NOT_PROVIDED = -1;

    /** Default place name */
    private String name;

    /** More detail information about place */
    private String description;

    /** Default place location or address */
    private String location;

    /** Default place contact phone number */
    private String contact;

    /** Default place official website */
    private String website;

    /**
     *
     * Create a new Info object
     * @param ResourceID is the drawable resource image associated with the place
     * @param Name is the default place name
     * @param Description is detail information about the place
     * @param Location is the address or location
     * @param Contact is the phone number for contact
     * @param Website is the official website of the place
     *
     * */
    public Info(int ResourceID, String Name, String Description, String Location, String Contact, String Website){
        resourceID = ResourceID;
        name = Name;
        description = Description;
        location = Location;
        contact = Contact;
        website = Website;
    }

    /**
     * Returns the image resource ID of the place
     * */
    public int getResourceID() {
        return resourceID;
    }

    /**
     * Returns the name
     * */
    public String getName() {
        return name;
    }

    /**
     * Returns a description
     * */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the location or address
     * */
    public String getLocation() {
        return location;
    }

    /**
     * Returns the phone number
     * */
    public String getContact() {
        return contact;
    }

    /**
     * Returns the official website
     * */
    public String getWebsite() {
        return website;
    }


}
