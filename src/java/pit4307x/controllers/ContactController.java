package pit4307x.controllers;

import pit4307x.services.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import pit4307x.models.Contact;

/**
 *
 * @author leslietsang
 */
@ManagedBean
@RequestScoped
public class ContactController {
    @ManagedProperty(value="#{contact}")
    private Contact contact;

    @ManagedProperty(value="#{contactService}")
    private ContactService contactService;
    
    public String addContactSubmit() {
        contactService.addContact(contact);
        return "addContactSuccess";
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public ContactService getContactService() {
        return contactService;
    }

    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }
}
