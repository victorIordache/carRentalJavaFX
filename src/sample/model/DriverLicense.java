package sample.model;

import java.util.Date;
import java.util.List;

public class DriverLicense {

    private String firstName;
    private String lastName;
    private Date birthday;
    private Date validityStart;
    private Date validityEnd;
    private String CNP;
    private String licenseNumber; // might contain letters.
    private List<LicenseCategories> categories;

    public DriverLicense(User user, Date validityStart, Date validityEnd, String licenseNumber, List<LicenseCategories> categories) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.birthday = user.getBirthday();
        this.validityStart = validityStart;
        this.validityEnd = validityEnd;
        this.CNP = user.getCNP();
        this.licenseNumber = licenseNumber;
        this.categories = categories;
    }
}
