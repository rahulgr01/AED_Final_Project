
package UI.DiagnosticAdmin;

import Business.Community.Community;
import Business.Pharmacy.Pharmacy;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.DiagnosticsEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Pharmacy.Medicine;
import Business.Pharmacy.MedicineInventory;
import Business.Pharmacy.PharmacyDirectory;
import Business.Role.LabAssistantRole;
import Business.Role.Pharmacist;
import Business.UserAccount.UserAccount;
import UI.Components.TableCustom;
import UI.Login.MainLoginPage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class DiagnosticAdmin extends javax.swing.JFrame {

    boolean a = true;
    static boolean maximized = true;
    private DefaultTableModel dtm;
    DiagnosticsEnterprise dEnterprise;
    Pharmacy ph;
    Medicine med;
    EcoSystem business;
    Network network;
    Organization organization;
    UserAccount account;
    JFrame parentFrame;
    
    public DiagnosticAdmin(UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,JFrame parentFrame) {
        initComponents();
//        initListners();

       this.business = business;
        this.account = account;
        this.organization=organization;
         this.parentFrame = parentFrame;
         populateCommunity();
         dEnterprise = (DiagnosticsEnterprise) enterprise;
           TableCustom.apply(jScrollPane2, TableCustom.TableType.DEFAULT);
//           dtm = (DefaultTableModel) categoryTable.getModel();
//          populateCategory();
    }
    //Method to change panel color on hover
    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }

    //Method to change Background color of the panel 
    public void clickmenu(JPanel h1, JPanel h2, int numberbool) {
        if (numberbool == 1) {
            h1.setBackground(new Color(42,58,73));
            h2.setBackground(new Color(4,16,20));

        } else {
            h1.setBackground(new Color(4,16,20));
            h2.setBackground(new Color(42,58,73));
        }
    }
    //Method to change icon 
    public void changeImage(JLabel button, String rsimage) {
        ImageIcon aimg = new ImageIcon(getClass().getResource(rsimage));
        button.setIcon(aimg);
    }

    //Method to hide and expand menu button
    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button) {
        if (dashboard == true) {
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeImage(button, "/com/vcare/icon/menu_32px.png"); 
        } else {
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            changeImage(button, "/com/vcare/icon/back_32px.png"); 
        }
    }
    
    private void populateCategory() {
//        CategoryInventory cmenu = ph.getCmenu();
//        DefaultTableModel model = (DefaultTableModel) categoryTable.getModel();
//        model.setRowCount(0);
//        if(cmenu != null){
//        for (Category item : cmenu.getCategoryList()) {
//
//            Object[] row = new Object[3];
//            row[0] = item.getCategoryID();
//            row[1] = item.getCategoryName();
//            row[2] = item.getCategoryDescription();
//            model.addRow(row);
//        }
//        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        iconmaxclose = new javax.swing.JPanel();
        buttonClose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        buttonMax = new javax.swing.JPanel();
        max = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        linehidemenu = new javax.swing.JPanel();
        hidemenu = new javax.swing.JPanel();
        buttonhidemenu = new javax.swing.JLabel();
        lineSetting = new javax.swing.JPanel();
        setting = new javax.swing.JPanel();
        buttonLogout = new javax.swing.JLabel();
        menuhide = new javax.swing.JPanel();
        menuhide1 = new javax.swing.JPanel();
        pharmacyStaistics = new javax.swing.JPanel();
        side1 = new javax.swing.JPanel();
        statisticslbl = new javax.swing.JLabel();
        statisticsimg = new javax.swing.JLabel();
        managePharmacy = new javax.swing.JPanel();
        side2 = new javax.swing.JPanel();
        managePharmacylbl = new javax.swing.JLabel();
        managePharmacyIcon = new javax.swing.JLabel();
        manageMedicine = new javax.swing.JPanel();
        side4 = new javax.swing.JPanel();
        manageMedicinelbl = new javax.swing.JLabel();
        manageMedicineIcon = new javax.swing.JLabel();
        manageMedicine1 = new javax.swing.JPanel();
        side5 = new javax.swing.JPanel();
        manageMedicinelbl1 = new javax.swing.JLabel();
        manageMedicineIcon1 = new javax.swing.JLabel();
        diagnosticAdmin = new javax.swing.JTabbedPane();
        dashboard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        addEmployee = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        dOrganizationsCombo = new UI.Components.Combobox();
        employeeUsername = new UI.Components.MyTextFieldLogin();
        employeeName = new UI.Components.MyTextFieldLogin();
        createEmployee = new UI.Components.Button();
        employeePassword = new UI.Components.MyPasswordFieldLogin();
        pharmacy = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pharmacyName = new UI.Components.MyTextFieldLogin();
        pharmacyAddress = new UI.Components.MyTextFieldLogin();
        phComCombo = new UI.Components.Combobox();
        pharmacyContact = new UI.Components.MyTextFieldLogin();
        addPharmacybtn = new UI.Components.Button();
        medicine = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        medicineTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        searchMedicine = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        medicineName = new UI.Components.TextField();
        jPanel9 = new javax.swing.JPanel();
        deleteMedicine = new UI.Components.Button();
        clearMedicine = new UI.Components.Button();
        updateMedicine = new UI.Components.Button();
        addMedicine = new UI.Components.Button();
        displayPharmacy = new UI.Components.Combobox();
        category = new UI.Components.TextField();
        medicinePrice = new UI.Components.TextField();
        medicineQuantity = new UI.Components.TextField();

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        header.setBackground(new java.awt.Color(27, 152, 245));
        header.setPreferredSize(new java.awt.Dimension(800, 50));
        header.setLayout(new java.awt.BorderLayout());

        iconmaxclose.setBackground(new java.awt.Color(22, 116, 66));

        buttonClose.setBackground(new java.awt.Color(27, 152, 245));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/delete_32px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonCloseLayout = new javax.swing.GroupLayout(buttonClose);
        buttonClose.setLayout(buttonCloseLayout);
        buttonCloseLayout.setHorizontalGroup(
            buttonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonCloseLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );
        buttonCloseLayout.setVerticalGroup(
            buttonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        buttonMax.setBackground(new java.awt.Color(27, 152, 245));

        max.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/full_screen_32px.png"))); // NOI18N
        max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maxMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonMaxLayout = new javax.swing.GroupLayout(buttonMax);
        buttonMax.setLayout(buttonMaxLayout);
        buttonMaxLayout.setHorizontalGroup(
            buttonMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonMaxLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(max, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );
        buttonMaxLayout.setVerticalGroup(
            buttonMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonMaxLayout.createSequentialGroup()
                .addComponent(max, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout iconmaxcloseLayout = new javax.swing.GroupLayout(iconmaxclose);
        iconmaxclose.setLayout(iconmaxcloseLayout);
        iconmaxcloseLayout.setHorizontalGroup(
            iconmaxcloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconmaxcloseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        iconmaxcloseLayout.setVerticalGroup(
            iconmaxcloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconmaxcloseLayout.createSequentialGroup()
                .addGroup(iconmaxcloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        header.add(iconmaxclose, java.awt.BorderLayout.LINE_END);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setPreferredSize(new java.awt.Dimension(270, 450));
        menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(4, 16, 20));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 450));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linehidemenu.setBackground(new java.awt.Color(0, 0, 0));
        linehidemenu.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linehidemenuLayout = new javax.swing.GroupLayout(linehidemenu);
        linehidemenu.setLayout(linehidemenuLayout);
        linehidemenuLayout.setHorizontalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linehidemenuLayout.setVerticalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(linehidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 5));

        hidemenu.setBackground(new java.awt.Color(4, 16, 20));
        hidemenu.setPreferredSize(new java.awt.Dimension(50, 50));
        hidemenu.setLayout(new java.awt.BorderLayout());

        buttonhidemenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonhidemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/back_32px.png"))); // NOI18N
        buttonhidemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseExited(evt);
            }
        });
        hidemenu.add(buttonhidemenu, java.awt.BorderLayout.CENTER);

        MenuIcon.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, 50));

        lineSetting.setBackground(new java.awt.Color(0, 0, 0));
        lineSetting.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout lineSettingLayout = new javax.swing.GroupLayout(lineSetting);
        lineSetting.setLayout(lineSettingLayout);
        lineSettingLayout.setHorizontalGroup(
            lineSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        lineSettingLayout.setVerticalGroup(
            lineSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(lineSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, 5));

        setting.setBackground(new java.awt.Color(4, 16, 20));
        setting.setPreferredSize(new java.awt.Dimension(50, 50));
        setting.setLayout(new java.awt.BorderLayout());

        buttonLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/logout_30px.png"))); // NOI18N
        buttonLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLogoutMouseExited(evt);
            }
        });
        setting.add(buttonLogout, java.awt.BorderLayout.CENTER);

        MenuIcon.add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, 50));

        menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        menuhide.setBackground(new java.awt.Color(51, 51, 51));
        menuhide.setLayout(new java.awt.BorderLayout());

        menuhide1.setBackground(new java.awt.Color(0, 91, 149));

        pharmacyStaistics.setBackground(new java.awt.Color(0, 91, 149));
        pharmacyStaistics.setPreferredSize(new java.awt.Dimension(220, 50));
        pharmacyStaistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pharmacyStaisticsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pharmacyStaisticsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pharmacyStaisticsMouseExited(evt);
            }
        });

        side1.setBackground(new java.awt.Color(0, 91, 149));
        side1.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout side1Layout = new javax.swing.GroupLayout(side1);
        side1.setLayout(side1Layout);
        side1Layout.setHorizontalGroup(
            side1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        side1Layout.setVerticalGroup(
            side1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        statisticslbl.setBackground(new java.awt.Color(51, 51, 51));
        statisticslbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statisticslbl.setForeground(new java.awt.Color(255, 255, 255));
        statisticslbl.setText("Pharmacy Statistics");

        statisticsimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statisticsimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/statisticsW_40px.png"))); // NOI18N

        javax.swing.GroupLayout pharmacyStaisticsLayout = new javax.swing.GroupLayout(pharmacyStaistics);
        pharmacyStaistics.setLayout(pharmacyStaisticsLayout);
        pharmacyStaisticsLayout.setHorizontalGroup(
            pharmacyStaisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pharmacyStaisticsLayout.createSequentialGroup()
                .addComponent(side1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statisticsimg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statisticslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pharmacyStaisticsLayout.setVerticalGroup(
            pharmacyStaisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pharmacyStaisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statisticslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(statisticsimg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        managePharmacy.setBackground(new java.awt.Color(0, 91, 149));
        managePharmacy.setPreferredSize(new java.awt.Dimension(220, 50));
        managePharmacy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managePharmacyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                managePharmacyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                managePharmacyMouseExited(evt);
            }
        });

        side2.setBackground(new java.awt.Color(0, 91, 149));
        side2.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout side2Layout = new javax.swing.GroupLayout(side2);
        side2.setLayout(side2Layout);
        side2Layout.setHorizontalGroup(
            side2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        side2Layout.setVerticalGroup(
            side2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        managePharmacylbl.setBackground(new java.awt.Color(51, 51, 51));
        managePharmacylbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        managePharmacylbl.setForeground(new java.awt.Color(255, 255, 255));
        managePharmacylbl.setText("Add Employee");

        managePharmacyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managePharmacyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/management_40px.png"))); // NOI18N

        javax.swing.GroupLayout managePharmacyLayout = new javax.swing.GroupLayout(managePharmacy);
        managePharmacy.setLayout(managePharmacyLayout);
        managePharmacyLayout.setHorizontalGroup(
            managePharmacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managePharmacyLayout.createSequentialGroup()
                .addComponent(side2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(managePharmacyIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(managePharmacylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        managePharmacyLayout.setVerticalGroup(
            managePharmacyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managePharmacyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managePharmacylbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(managePharmacyIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        manageMedicine.setBackground(new java.awt.Color(0, 91, 149));
        manageMedicine.setPreferredSize(new java.awt.Dimension(220, 50));
        manageMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageMedicineMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageMedicineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageMedicineMouseExited(evt);
            }
        });

        side4.setBackground(new java.awt.Color(0, 91, 149));
        side4.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout side4Layout = new javax.swing.GroupLayout(side4);
        side4.setLayout(side4Layout);
        side4Layout.setHorizontalGroup(
            side4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        side4Layout.setVerticalGroup(
            side4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        manageMedicinelbl.setBackground(new java.awt.Color(51, 51, 51));
        manageMedicinelbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageMedicinelbl.setForeground(new java.awt.Color(255, 255, 255));
        manageMedicinelbl.setText("Add Pharmacy");

        manageMedicineIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageMedicineIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/pharmacy_shop_40px.png"))); // NOI18N

        javax.swing.GroupLayout manageMedicineLayout = new javax.swing.GroupLayout(manageMedicine);
        manageMedicine.setLayout(manageMedicineLayout);
        manageMedicineLayout.setHorizontalGroup(
            manageMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageMedicineLayout.createSequentialGroup()
                .addComponent(side4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageMedicineIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageMedicinelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageMedicineLayout.setVerticalGroup(
            manageMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageMedicineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageMedicinelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(manageMedicineIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        manageMedicine1.setBackground(new java.awt.Color(0, 91, 149));
        manageMedicine1.setPreferredSize(new java.awt.Dimension(220, 50));
        manageMedicine1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageMedicine1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageMedicine1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageMedicine1MouseExited(evt);
            }
        });

        side5.setBackground(new java.awt.Color(0, 91, 149));
        side5.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout side5Layout = new javax.swing.GroupLayout(side5);
        side5.setLayout(side5Layout);
        side5Layout.setHorizontalGroup(
            side5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        side5Layout.setVerticalGroup(
            side5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        manageMedicinelbl1.setBackground(new java.awt.Color(51, 51, 51));
        manageMedicinelbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageMedicinelbl1.setForeground(new java.awt.Color(255, 255, 255));
        manageMedicinelbl1.setText("Manage Medicine");

        manageMedicineIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageMedicineIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/Medicine_40px.png"))); // NOI18N

        javax.swing.GroupLayout manageMedicine1Layout = new javax.swing.GroupLayout(manageMedicine1);
        manageMedicine1.setLayout(manageMedicine1Layout);
        manageMedicine1Layout.setHorizontalGroup(
            manageMedicine1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageMedicine1Layout.createSequentialGroup()
                .addComponent(side5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageMedicineIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageMedicinelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageMedicine1Layout.setVerticalGroup(
            manageMedicine1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageMedicine1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageMedicinelbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(manageMedicineIcon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout menuhide1Layout = new javax.swing.GroupLayout(menuhide1);
        menuhide1.setLayout(menuhide1Layout);
        menuhide1Layout.setHorizontalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pharmacyStaistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(managePharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(manageMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(manageMedicine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuhide1Layout.setVerticalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhide1Layout.createSequentialGroup()
                .addComponent(pharmacyStaistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(managePharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageMedicine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        menuhide.add(menuhide1, java.awt.BorderLayout.CENTER);

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        diagnosticAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diagnosticAdminMouseClicked(evt);
            }
        });

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );

        dashboard.add(jPanel1, java.awt.BorderLayout.CENTER);

        diagnosticAdmin.addTab("Dashboard", dashboard);

        jPanel16.setBackground(new java.awt.Color(217, 241, 255));

        dOrganizationsCombo.setLabeText("Organization");

        employeeUsername.setLabelText("Username");

        employeeName.setLabelText("Name");
        employeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNameActionPerformed(evt);
            }
        });

        createEmployee.setBackground(new java.awt.Color(0, 91, 149));
        createEmployee.setForeground(new java.awt.Color(255, 255, 255));
        createEmployee.setText("Create Employee");
        createEmployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createEmployeeMouseExited(evt);
            }
        });
        createEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEmployeeActionPerformed(evt);
            }
        });

        employeePassword.setLabelText("Password");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dOrganizationsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(employeePassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(employeeUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(createEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addGap(147, 147, 147))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(dOrganizationsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(employeeUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employeePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(createEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addEmployeeLayout = new javax.swing.GroupLayout(addEmployee);
        addEmployee.setLayout(addEmployeeLayout);
        addEmployeeLayout.setHorizontalGroup(
            addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addEmployeeLayout.setVerticalGroup(
            addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        diagnosticAdmin.addTab("Add Employee", addEmployee);

        pharmacy.setBackground(new java.awt.Color(255, 255, 255));
        pharmacy.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(217, 241, 255));

        pharmacyName.setLabelText("Pharmacy Name");

        pharmacyAddress.setLabelText("Pharmacy Address");

        phComCombo.setLabeText("Community");
        phComCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phComComboActionPerformed(evt);
            }
        });

        pharmacyContact.setLabelText("Pharmacy Contact");

        addPharmacybtn.setBackground(new java.awt.Color(0, 91, 149));
        addPharmacybtn.setForeground(new java.awt.Color(255, 255, 255));
        addPharmacybtn.setText("Add Pharmacy");
        addPharmacybtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addPharmacybtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPharmacybtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPharmacybtnMouseExited(evt);
            }
        });
        addPharmacybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPharmacybtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pharmacyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pharmacyAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phComCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pharmacyContact, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(addPharmacybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(151, 151, 151))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(pharmacyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pharmacyAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phComCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pharmacyContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addPharmacybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        pharmacy.add(jPanel2, java.awt.BorderLayout.CENTER);

        diagnosticAdmin.addTab("Pharmacy", pharmacy);

        medicine.setBackground(new java.awt.Color(255, 255, 255));
        medicine.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        medicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Pharmacy ", "Category Name", "Medicine Price", "Medicine Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(medicineTable);

        jPanel8.setBackground(new java.awt.Color(217, 241, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/search_30px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/print_30px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout searchMedicineLayout = new javax.swing.GroupLayout(searchMedicine);
        searchMedicine.setLayout(searchMedicineLayout);
        searchMedicineLayout.setHorizontalGroup(
            searchMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchMedicineLayout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 40, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        searchMedicineLayout.setVerticalGroup(
            searchMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchMedicineLayout.createSequentialGroup()
                .addGroup(searchMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(217, 241, 255));

        medicineName.setLabelText("Medicine Name");

        jPanel9.setBackground(new java.awt.Color(217, 241, 255));

        deleteMedicine.setBackground(new java.awt.Color(0, 91, 149));
        deleteMedicine.setForeground(new java.awt.Color(255, 255, 255));
        deleteMedicine.setText("DELETE");
        deleteMedicine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMedicineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMedicineMouseExited(evt);
            }
        });
        deleteMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMedicineActionPerformed(evt);
            }
        });

        clearMedicine.setBackground(new java.awt.Color(0, 91, 149));
        clearMedicine.setForeground(new java.awt.Color(255, 255, 255));
        clearMedicine.setText("CLEAR");
        clearMedicine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMedicineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMedicineMouseExited(evt);
            }
        });

        updateMedicine.setBackground(new java.awt.Color(0, 91, 149));
        updateMedicine.setForeground(new java.awt.Color(255, 255, 255));
        updateMedicine.setText("UPDATE");
        updateMedicine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMedicineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMedicineMouseExited(evt);
            }
        });
        updateMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMedicineActionPerformed(evt);
            }
        });

        addMedicine.setBackground(new java.awt.Color(0, 91, 149));
        addMedicine.setForeground(new java.awt.Color(255, 255, 255));
        addMedicine.setText("ADD");
        addMedicine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMedicineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMedicineMouseExited(evt);
            }
        });
        addMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        displayPharmacy.setLabeText("Pharmacy");

        category.setLabelText("Category");

        medicinePrice.setLabelText("Medicine Price");

        medicineQuantity.setLabelText("Medicine Quantity");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(category, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(medicinePrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medicineQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayPharmacy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medicineName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(medicineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(displayPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(medicinePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(medicineQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(searchMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        medicine.add(jPanel7, java.awt.BorderLayout.CENTER);

        diagnosticAdmin.addTab("Medicine", medicine);

        getContentPane().add(diagnosticAdmin, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseClicked
        if (maximized) {
            DiagnosticAdmin.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            DiagnosticAdmin.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        } else {
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }
    }//GEN-LAST:event_maxMouseClicked

    private void maxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseEntered
        changecolor(buttonMax, new Color(3,138,255));
    }//GEN-LAST:event_maxMouseEntered

    private void maxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseExited
        changecolor(buttonMax, new Color(27,152,245));
    }//GEN-LAST:event_maxMouseExited

    private void buttonhidemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseClicked
        clickmenu(hidemenu, setting, 1);
        if (a == true) {
            hideshow(menu, a, buttonhidemenu);
            SwingUtilities.updateComponentTreeUI(this);
            a = false;
        } else {
            hideshow(menu, a, buttonhidemenu);
            SwingUtilities.updateComponentTreeUI(this);
            a = true;
        }
//        pharmacyAdmin.setSelectedIndex(0);
    }//GEN-LAST:event_buttonhidemenuMouseClicked

    private void buttonhidemenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseEntered
        changecolor(linehidemenu, new Color(190,224,236));
         
    }//GEN-LAST:event_buttonhidemenuMouseEntered

    private void buttonhidemenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseExited
        changecolor(linehidemenu, new Color(4,16,20));
    }//GEN-LAST:event_buttonhidemenuMouseExited

    private void buttonLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogoutMouseClicked
       clickmenu(setting, hidemenu, 1);
        int a = JOptionPane.showConfirmDialog(this, "Do you want to logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
           this.setVisible(false);
           parentFrame.setVisible(true);
        }
    }//GEN-LAST:event_buttonLogoutMouseClicked

    private void buttonLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogoutMouseEntered
        changecolor(lineSetting, new Color(190,224,236));
    }//GEN-LAST:event_buttonLogoutMouseEntered

    private void buttonLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogoutMouseExited
        changecolor(lineSetting, new Color(4,16,20));
    }//GEN-LAST:event_buttonLogoutMouseExited

    private void pharmacyStaisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacyStaisticsMouseClicked
         diagnosticAdmin.setSelectedIndex(0);
         changecolor(pharmacyStaistics, new Color(3,138,255));
        changecolor(side1, new Color(190, 224, 236));
    }//GEN-LAST:event_pharmacyStaisticsMouseClicked

    private void pharmacyStaisticsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacyStaisticsMouseEntered
        changecolor(pharmacyStaistics, new Color(3,138,255));
        changecolor(side1, new Color(190, 224, 236));
    }//GEN-LAST:event_pharmacyStaisticsMouseEntered

    private void pharmacyStaisticsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacyStaisticsMouseExited
        changecolor(pharmacyStaistics, new Color(0,91,149));
        changecolor(side1, new Color(0,91,149));
    }//GEN-LAST:event_pharmacyStaisticsMouseExited

    private void managePharmacyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePharmacyMouseClicked
        diagnosticAdmin.setSelectedIndex(1);
        changecolor(managePharmacy, new Color(3,138,255));
        changecolor(side2, new Color(190, 224, 236));
    }//GEN-LAST:event_managePharmacyMouseClicked

    private void managePharmacyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePharmacyMouseEntered
        changecolor(managePharmacy, new Color(3,138,255));
        changecolor(side2, new Color(190, 224, 236));
    }//GEN-LAST:event_managePharmacyMouseEntered

    private void managePharmacyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePharmacyMouseExited
       changecolor(managePharmacy, new Color(0,91,149));
        changecolor(side2, new Color(0,91,149));
    }//GEN-LAST:event_managePharmacyMouseExited

    private void manageMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMedicineMouseClicked
       diagnosticAdmin.setSelectedIndex(3);
       changecolor(manageMedicine, new Color(3,138,255));
        changecolor(side4, new Color(190, 224, 236));
    }//GEN-LAST:event_manageMedicineMouseClicked

    private void manageMedicineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMedicineMouseEntered
      changecolor(manageMedicine, new Color(3,138,255));
        changecolor(side4, new Color(190, 224, 236));
    }//GEN-LAST:event_manageMedicineMouseEntered

    private void manageMedicineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMedicineMouseExited
        changecolor(manageMedicine, new Color(0,91,149));
        changecolor(side4, new Color(0,91,149));
    }//GEN-LAST:event_manageMedicineMouseExited

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        changecolor(buttonClose, new Color(27,152,245));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        changecolor(buttonClose, new Color(3,138,255));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.setVisible(false);
           parentFrame.setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

    private void diagnosticAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagnosticAdminMouseClicked
        int index = diagnosticAdmin.getSelectedIndex();

        System.out.print(index);
        switch (index) {
            case 0:
            break;
            case 1:
            populateEmployeeEnterpriseOrganizations();
            break;
            case 2:
            break;
            case 3:
            break;
            default:
            throw new AssertionError();
        }
    }//GEN-LAST:event_diagnosticAdminMouseClicked

    private void addPharmacybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPharmacybtnActionPerformed
        //        Pharmacy ph = new Pharmacy();
        if(pharmacyName.getText().isEmpty()||pharmacyAddress.getText().isEmpty()||pharmacyContact.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "All the fields are Mandatory!");
        }
        String phName=pharmacyName.getText();
        String phAdd=pharmacyAddress.getText();
        Community selectedCommunity = (Community) phComCombo.getSelectedItem();
        String phCont=pharmacyContact.getText();
        Pharmacy ph = new Pharmacy(phName,phAdd,phCont);

        for(Organization org : dEnterprise.getOrganizationDirectory().getOrganizationList()) {
            if(org.getName() == Organization.Type.Pharmacy.getValue()) {
                ((PharmacyOrganization)(org)).getPd().addPharmacy(ph);
                JOptionPane.showMessageDialog(this, "Pharmacy Added!");
                clearPharmacy();
            }
        }
    }//GEN-LAST:event_addPharmacybtnActionPerformed

    private void addPharmacybtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPharmacybtnMouseExited
        changecolorB(addPharmacybtn, new Color(0,91,149));
    }//GEN-LAST:event_addPharmacybtnMouseExited

    private void addPharmacybtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPharmacybtnMouseEntered
        changecolorB(addPharmacybtn, new Color(3,138,255));
    }//GEN-LAST:event_addPharmacybtnMouseEntered

    private void phComComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phComComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phComComboActionPerformed

    private void createEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEmployeeActionPerformed
        Organization org = (Organization) dOrganizationsCombo.getSelectedItem();

        String username = employeeUsername.getText();
        char[] passwordCharArray = employeePassword.getPassword();

        String password = String.valueOf(passwordCharArray);
        String name = employeeName.getText();

        Employee employee = org.getEmployeeDirectory().createEmployee(name);
        if (EcoSystem.isUserUnique(username)) {
            if (org.toString() == Organization.Type.Pharmacy.toString())
            {
                org.getUserAccountDirectory().createUserAccount(username, password, employee, new Pharmacist());

            } else if (org.toString() == Organization.Type.LabService.toString()) {
                org.getUserAccountDirectory().createUserAccount(username, password, employee, new LabAssistantRole());

            }

        }
    }//GEN-LAST:event_createEmployeeActionPerformed

    private void createEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createEmployeeMouseExited
        changecolorB(createEmployee, new Color(0,91,149));
    }//GEN-LAST:event_createEmployeeMouseExited

    private void createEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createEmployeeMouseEntered
        changecolorB(createEmployee, new Color(3,138,255));
    }//GEN-LAST:event_createEmployeeMouseEntered

    private void employeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNameActionPerformed

    private void manageMedicine1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMedicine1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_manageMedicine1MouseExited

    private void manageMedicine1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMedicine1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_manageMedicine1MouseEntered

    private void manageMedicine1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMedicine1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_manageMedicine1MouseClicked

    private void addMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineActionPerformed
        if(medicineName.getText().isEmpty()||category.getText().isEmpty()||medicinePrice.getText().isEmpty()||medicineQuantity.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "All the fields are Mandatory!");
        }
        String medName=medicineName.getText();
        String medCat=category.getText();
        Pharmacy phar=(Pharmacy)displayPharmacy.getSelectedItem();
        String medPrice=medicinePrice.getText();
        String medQuant=medicineQuantity.getText();
        Medicine med = new Medicine(medName,medCat,medPrice,medQuant);

        for(Organization org : dEnterprise.getOrganizationDirectory().getOrganizationList()) {
            if(org.getName() == Organization.Type.Pharmacy.getValue())
            {

                ((PharmacyOrganization)(org)).getPd().addPharmacy(ph);

                JOptionPane.showMessageDialog(this, "Medicine Added!");
                populateMedicineTable();
                clearMedicine();
            }
        }
    }//GEN-LAST:event_addMedicineActionPerformed

    private void addMedicineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMedicineMouseExited
        changecolorB(addMedicine, new Color(0,91,149));
    }//GEN-LAST:event_addMedicineMouseExited

    private void addMedicineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMedicineMouseEntered
        changecolorB(addMedicine, new Color(3,138,255));
    }//GEN-LAST:event_addMedicineMouseEntered

    private void updateMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMedicineActionPerformed

    private void updateMedicineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMedicineMouseExited
        changecolorB(updateMedicine, new Color(0,91,149));
    }//GEN-LAST:event_updateMedicineMouseExited

    private void updateMedicineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMedicineMouseEntered
        changecolorB(updateMedicine, new Color(3,138,255));
    }//GEN-LAST:event_updateMedicineMouseEntered

    private void clearMedicineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMedicineMouseExited
        changecolorB(clearMedicine, new Color(0,91,149));
    }//GEN-LAST:event_clearMedicineMouseExited

    private void clearMedicineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMedicineMouseEntered
        changecolorB(clearMedicine, new Color(3,138,255));
    }//GEN-LAST:event_clearMedicineMouseEntered

    private void deleteMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMedicineActionPerformed

    private void deleteMedicineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMedicineMouseExited
        changecolorB(deleteMedicine, new Color(0,91,149));
    }//GEN-LAST:event_deleteMedicineMouseExited

    private void deleteMedicineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMedicineMouseEntered
        changecolorB(deleteMedicine, new Color(3,138,255));
    }//GEN-LAST:event_deleteMedicineMouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        MessageFormat header = new MessageFormat("MedDoor Pharmacy Medicine Report");
        MessageFormat footer = new MessageFormat("Northeastern University");
        try{
            medicineTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Cannot be print");
        }
    }//GEN-LAST:event_jLabel3MouseClicked
 public void populateEmployeeEnterpriseOrganizations() {
         dOrganizationsCombo.removeAllItems();
        
        for (Organization org : dEnterprise.getOrganizationDirectory().getOrganizationList()){
            dOrganizationsCombo.addItem(org);
        }
    }private void clearPharmacy() {
        //clear TextField values
        pharmacyName.setText(null);
       pharmacyAddress.setText(null);
       pharmacyContact.setText(null);
}

public void populateCommunity() {
       phComCombo.removeAll();
       for (Community type : network.getCommunityDirectory().getCommunityList()) {
            phComCombo.addItem(type);
        } 
} private void populateMedicineTable() {
         Pharmacy pha=new Pharmacy();
        MedicineInventory mi = pha.getMenu();
        DefaultTableModel model = (DefaultTableModel) medicineTable.getModel();
        model.setRowCount(0);
        if(mi != null){
        for (Medicine item : mi.getMedicineList()) {
            Object[] row = new Object[5];
            row[0] = item.getName();
            row[1] = item.getCategory();
            row[2]= item.getPrice();
            row[3]= item.getQty();
            row[4]=pha.getPharmacyName();
            model.addRow(row);
        }
        }
    }

    public void changecolorB(JButton hover, Color rand) {
        hover.setBackground(rand);
}
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PharmacyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PharmacyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PharmacyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PharmacyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PharmacyAdmin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JPanel addEmployee;
    private UI.Components.Button addMedicine;
    private UI.Components.Button addPharmacybtn;
    private javax.swing.JPanel buttonClose;
    private javax.swing.JLabel buttonLogout;
    private javax.swing.JPanel buttonMax;
    private javax.swing.JLabel buttonhidemenu;
    private UI.Components.TextField category;
    private UI.Components.Button clearMedicine;
    private javax.swing.JLabel close;
    private UI.Components.Button createEmployee;
    private UI.Components.Combobox dOrganizationsCombo;
    private javax.swing.JPanel dashboard;
    private UI.Components.Button deleteMedicine;
    private javax.swing.JTabbedPane diagnosticAdmin;
    private UI.Components.Combobox displayPharmacy;
    private UI.Components.MyTextFieldLogin employeeName;
    private UI.Components.MyPasswordFieldLogin employeePassword;
    private UI.Components.MyTextFieldLogin employeeUsername;
    private javax.swing.JPanel header;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JPanel iconmaxclose;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel lineSetting;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel manageMedicine;
    private javax.swing.JPanel manageMedicine1;
    private javax.swing.JLabel manageMedicineIcon;
    private javax.swing.JLabel manageMedicineIcon1;
    private javax.swing.JLabel manageMedicinelbl;
    private javax.swing.JLabel manageMedicinelbl1;
    private javax.swing.JPanel managePharmacy;
    private javax.swing.JLabel managePharmacyIcon;
    private javax.swing.JLabel managePharmacylbl;
    private javax.swing.JLabel max;
    private javax.swing.JPanel medicine;
    private UI.Components.TextField medicineName;
    private UI.Components.TextField medicinePrice;
    private UI.Components.TextField medicineQuantity;
    private javax.swing.JTable medicineTable;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel menuhide1;
    private UI.Components.Combobox phComCombo;
    private javax.swing.JPanel pharmacy;
    private UI.Components.MyTextFieldLogin pharmacyAddress;
    private UI.Components.MyTextFieldLogin pharmacyContact;
    private UI.Components.MyTextFieldLogin pharmacyName;
    private javax.swing.JPanel pharmacyStaistics;
    private javax.swing.JPanel searchMedicine;
    private javax.swing.JPanel setting;
    private javax.swing.JPanel side1;
    private javax.swing.JPanel side2;
    private javax.swing.JPanel side4;
    private javax.swing.JPanel side5;
    private javax.swing.JLabel statisticsimg;
    private javax.swing.JLabel statisticslbl;
    private UI.Components.Button updateMedicine;
    // End of variables declaration//GEN-END:variables
}
