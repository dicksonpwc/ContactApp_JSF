package pit4307x.services;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pit4307x.models.Contact;

/**
 *
 * @author leslietsang
 */
@ManagedBean
@SessionScoped
public class ContactService {
    private final List<Contact> contacts;

    public ContactService() {
        contacts = new ArrayList();
    }
    
    public List<Contact> getContacts() {
        return contacts;
    }
    
    public void addContact(Contact contact) {
        contacts.add(contact);
    }
}
