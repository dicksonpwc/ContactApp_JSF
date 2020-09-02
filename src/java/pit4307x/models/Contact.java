package pit4307x.models;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;

/**
 *
 * @author leslietsang
 */
@ManagedBean
@RequestScoped
public class Contact implements Serializable {
    @Size(min=3, message="First name must be at least 3 characters")
    private String firstname;

    @Size(min=2, message="Last name must be at least 2 characters")
    private String lastname;
    
    @Size(min=8, max=8, message="Phone must be 8 digits")
    private String phone;
    
    @Range(min=10, max=99, message="Age must be between 10 and 99")
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
