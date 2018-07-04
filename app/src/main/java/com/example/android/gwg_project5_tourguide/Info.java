/*
 * MIT License
 *
 * Copyright (c) 2018 Algenis Romero<algenisromero@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.example.android.gwg_project5_tourguide;

/**
 * {@link Info} Represent information about places to visit on
 * Dominican Republic, contains image, name, description, location,
 * contact and website data to display.
 */
public class Info {

    /**
     * Constant value that represent that not image was provide for this place
     */
    private static final int IMAGE_NOT_PROVIDED = -1;
    /**
     * Default image for place
     */
    private int resourceID = IMAGE_NOT_PROVIDED;
    /**
     * Default place name
     */
    private String name;

    /**
     * More detail information about place
     */
    private String description;

    /**
     * Default place location or address
     */
    private String location;

    /**
     * Default place contact phone number
     */
    private String contact;

    /**
     * Default place official website
     */
    private String website;

    /**
     * Create a new Info object
     *
     * @param ResourceID  is the drawable resource image associated with the place
     * @param Name        is the default place name
     * @param Description is detail information about the place
     * @param Location    is the address or location
     * @param Contact     is the phone number for contact
     * @param Website     is the official website of the place
     */
    public Info(int ResourceID, String Name, String Description, String Location, String Contact, String Website) {
        resourceID = ResourceID;
        name = Name;
        description = Description;
        location = Location;
        contact = Contact;
        website = Website;
    }

    /**
     * Returns the image resource ID of the place
     */
    public int getResourceID() {
        return resourceID;
    }

    /**
     * Returns the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the location or address
     */
    public String getLocation() {
        return location;
    }

    /**
     * Returns the phone number
     */
    public String getContact() {
        return contact;
    }

    /**
     * Returns the official website
     */
    public String getWebsite() {
        return website;
    }


}
