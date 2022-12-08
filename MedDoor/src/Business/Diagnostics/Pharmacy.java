
package Business.Diagnostics;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Dell
 */
public class Pharmacy extends UserAccount {
    private String orderId;
//    private SystemAdminRole systemAdmin;
//    private DeliveryRole delivery;
    private String pharmacyName;
    private PharmacyInventory menu;
    private String address;
//    private Community community;
    private String contact;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
//
//    public DeliveryRole getDelivery() {
//        return delivery;
//    }
//
//    public void setDelivery(DeliveryRole delivery) {
//        this.delivery = delivery;
//    }
//
//    public Community getCommunity() {
//        return community;
//    }
//
//    public void setCommunity(Community community) {
//        this.community = community;
//    }
    
//    public SystemAdminRole getSystemAdmin() {
//        return systemAdmin;
//    }
//
//    public void setSystemAdmin(SystemAdminRole systemAdmin) {
//        this.systemAdmin = systemAdmin;
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
 

    public PharmacyInventory getMenu() {
        return menu;
    }

    public void setMenu(PharmacyInventory menu) {
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

