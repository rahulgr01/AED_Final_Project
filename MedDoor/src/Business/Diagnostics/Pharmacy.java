
package Business.Diagnostics;

import Business.Role.DiagnosticAdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Dell
 */
public class Pharmacy extends UserAccount {
    private String orderId;
    private SystemAdminRole sysAdmin;
    private DiagnosticAdminRole dadmin;
    private String pharmacyName;
    private MedicineInventory menu;
    private CategoryInventory cmenu;
    private String address;
//    private Community community;
    private String contact;

    public SystemAdminRole getSysAdmin() {
        return sysAdmin;
    }

    public void setSysAdmin(SystemAdminRole sysAdmin) {
        this.sysAdmin = sysAdmin;
    }

    public DiagnosticAdminRole getDadmin() {
        return dadmin;
    }

    public void setDadmin(DiagnosticAdminRole dadmin) {
        this.dadmin = dadmin;
    }

    public CategoryInventory getCmenu() {
        return cmenu;
    }

    public void setCmenu(CategoryInventory cmenu) {
        this.cmenu = cmenu;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

//    public Community getCommunity() {
//        return community;
//    }
//
//    public void setCommunity(Community community) {
//        this.community = community;
//    }
    


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
 

    public MedicineInventory getMenu() {
        return menu;
    }

    public void setMenu(MedicineInventory menu) {
        this.menu = menu;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    @Override
    public String toString() {
        return pharmacyName;
    }
}

