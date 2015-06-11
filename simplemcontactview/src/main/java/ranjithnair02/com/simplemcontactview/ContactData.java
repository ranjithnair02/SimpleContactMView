package ranjithnair02.com.simplemcontactview;

/*
 * Copyright 2015 Ranjith
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.*
 */

/**
 * Creates a Contact object<br>
 * There are 2 constructors
 * <ul>
 * <li>ContactData(Name,Phone_number,timeofcall)</li>
 * <li>ContactData(Name,Phone_number)</li>
 * </ul>
 */
public class ContactData {
    private String contact_name, ph_no, time_call;

    /**
     * Use this class to insert the Contact Name, Phone Number and
     * time of last call
     * There is another class @ContactData(contactname,phoneno,timeofcall)
     * for displaying name and phone number.
     *
     * @param contact_name Contact Name
     * @param ph_no        Phone number
     * @param time_call    Time of last call
     */
    public ContactData(String contact_name, String ph_no, String time_call) {
        this.contact_name = contact_name;
        this.ph_no = ph_no;
        this.time_call = time_call;
    }

    /**
     * Use this class to insert the Contact Name and Phone Number.
     * There is another class @ContactData(contactname,phoneno,timeofcall)
     * for displaying name, phone number and time of last call.
     *
     * @param contact_name Contact Name
     * @param ph_no        Phone number
     */
    public ContactData(String contact_name, String ph_no) {
        this.contact_name = contact_name;
        this.ph_no = ph_no;
    }

    public String getContactname() {
        return contact_name;

    }

    public String getContactNo() {
        return ph_no;

    }

    public String getTimecall() {
        return time_call;
    }

    public void setContactname(String name) {
        this.contact_name = name;
    }

    public void setPhno(String no) {
        this.ph_no = no;
    }

    public void setTimeCall(String time) {
        this.time_call = time;
    }
}
