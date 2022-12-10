
package UI.SystemAdmin;


import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.VolunteerAdminRole;
import Business.UserAccount.UserAccount;
import UI.Components.TableCustom;
import UI.Login.MainLoginPage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SystemAdmin extends javax.swing.JFrame {

    boolean a = true;
    static boolean maximized = true;
    private EcoSystem system;
    private UserAccount userAccount;
    Enterprise enterprise;
    Network network;
    public SystemAdmin(UserAccount account, 
            Enterprise enterprise, 
            EcoSystem system) {
        initComponents();
        this.system = system; 
        sysAdminTab.setSelectedIndex(0);
        network = system.getNetworkList().get(0);
    }
    //Method to change panel color on hover
    public void populateEnterprise() {
        System.out.print("inside populate");
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            createEnterpriseType.addItem(type);
        }
    }
    
    private void populateEnterpriseName(Network network){
        cEntName.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            cEntName.addItem(enterprise);
        }
        
    }
    
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        createEnterpriseAdmin = new javax.swing.JPanel();
        side3 = new javax.swing.JPanel();
        manageCategorylbl = new javax.swing.JLabel();
        manageCategoryIcon = new javax.swing.JLabel();
        manageMedicine = new javax.swing.JPanel();
        side4 = new javax.swing.JPanel();
        manageMedicinelbl = new javax.swing.JLabel();
        manageMedicineIcon = new javax.swing.JLabel();
        manageSupplier = new javax.swing.JPanel();
        side5 = new javax.swing.JPanel();
        manageSupplierlbl = new javax.swing.JLabel();
        manageSupplierIcon = new javax.swing.JLabel();
        sysAdminTab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        combobox1 = new UI.Components.Combobox();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        button1 = new UI.Components.Button();
        jPanel4 = new javax.swing.JPanel();
        myTextFieldLogin1 = new UI.Components.MyTextFieldLogin();
        myTextFieldLogin2 = new UI.Components.MyTextFieldLogin();
        button2 = new UI.Components.Button();
        jPanel5 = new javax.swing.JPanel();
        myTextFieldLogin4 = new UI.Components.MyTextFieldLogin();
        myTextFieldLogin5 = new UI.Components.MyTextFieldLogin();
        myTextFieldLogin6 = new UI.Components.MyTextFieldLogin();
        myTextFieldLogin7 = new UI.Components.MyTextFieldLogin();
        combobox2 = new UI.Components.Combobox();
        button3 = new UI.Components.Button();
        createEnt = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        createEnterpriseName = new UI.Components.MyTextFieldLogin();
        createEnterpriseType = new UI.Components.Combobox();
        createEnterpriseButton = new UI.Components.Button();
        createEntAdminTab = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        cEntPassword = new UI.Components.MyTextFieldLogin();
        cEntUsername = new UI.Components.MyTextFieldLogin();
        cEntName = new UI.Components.Combobox();
        cEntCreateButton = new UI.Components.Button();
        cEntEEname = new UI.Components.MyTextFieldLogin();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        combobox4 = new UI.Components.Combobox();
        combobox5 = new UI.Components.Combobox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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
        statisticslbl.setText("Manage Network");

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
        managePharmacylbl.setText("Manage Enterprise");

        managePharmacyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managePharmacyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/earth_care_40px.png"))); // NOI18N

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

        createEnterpriseAdmin.setBackground(new java.awt.Color(0, 91, 149));
        createEnterpriseAdmin.setPreferredSize(new java.awt.Dimension(220, 50));
        createEnterpriseAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createEnterpriseAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createEnterpriseAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createEnterpriseAdminMouseExited(evt);
            }
        });

        side3.setBackground(new java.awt.Color(0, 91, 149));
        side3.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout side3Layout = new javax.swing.GroupLayout(side3);
        side3.setLayout(side3Layout);
        side3Layout.setHorizontalGroup(
            side3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        side3Layout.setVerticalGroup(
            side3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        manageCategorylbl.setBackground(new java.awt.Color(51, 51, 51));
        manageCategorylbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageCategorylbl.setForeground(new java.awt.Color(255, 255, 255));
        manageCategorylbl.setText("Manage Enterprise Admin");

        manageCategoryIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageCategoryIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/Hospital Bed_40px.png"))); // NOI18N

        javax.swing.GroupLayout createEnterpriseAdminLayout = new javax.swing.GroupLayout(createEnterpriseAdmin);
        createEnterpriseAdmin.setLayout(createEnterpriseAdminLayout);
        createEnterpriseAdminLayout.setHorizontalGroup(
            createEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createEnterpriseAdminLayout.createSequentialGroup()
                .addComponent(side3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageCategoryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageCategorylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        createEnterpriseAdminLayout.setVerticalGroup(
            createEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createEnterpriseAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageCategorylbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(manageCategoryIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        manageMedicinelbl.setText("View System");

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

        manageSupplier.setBackground(new java.awt.Color(0, 91, 149));
        manageSupplier.setPreferredSize(new java.awt.Dimension(220, 50));
        manageSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageSupplierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageSupplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageSupplierMouseExited(evt);
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

        manageSupplierlbl.setBackground(new java.awt.Color(51, 51, 51));
        manageSupplierlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageSupplierlbl.setForeground(new java.awt.Color(255, 255, 255));
        manageSupplierlbl.setText("Manage Insurance");

        manageSupplierIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageSupplierIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/insurance_agent_40px.png"))); // NOI18N

        javax.swing.GroupLayout manageSupplierLayout = new javax.swing.GroupLayout(manageSupplier);
        manageSupplier.setLayout(manageSupplierLayout);
        manageSupplierLayout.setHorizontalGroup(
            manageSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSupplierLayout.createSequentialGroup()
                .addComponent(side5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageSupplierIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageSupplierlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageSupplierLayout.setVerticalGroup(
            manageSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageSupplierlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(manageSupplierIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout menuhide1Layout = new javax.swing.GroupLayout(menuhide1);
        menuhide1.setLayout(menuhide1Layout);
        menuhide1Layout.setHorizontalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pharmacyStaistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(managePharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(createEnterpriseAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(manageMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(manageSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuhide1Layout.setVerticalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhide1Layout.createSequentialGroup()
                .addComponent(pharmacyStaistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(managePharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(createEnterpriseAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuhide.add(menuhide1, java.awt.BorderLayout.CENTER);

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        sysAdminTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sysAdminTabMouseClicked(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(217, 241, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOSTON CITY SERVICE");

        combobox1.setLabeText("Community");

        jTabbedPane2.setBackground(new java.awt.Color(96, 130, 182));
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        button1.setText("Add Tenant");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTabbedPane2.addTab("List Houses", jPanel3);

        myTextFieldLogin1.setLabelText("Apartment Number");
        myTextFieldLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myTextFieldLogin1ActionPerformed(evt);
            }
        });

        myTextFieldLogin2.setLabelText("House Address");

        button2.setText("Add House");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 129, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myTextFieldLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 129, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myTextFieldLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {myTextFieldLogin1, myTextFieldLogin2});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(myTextFieldLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(myTextFieldLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(249, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Add House", jPanel4);

        myTextFieldLogin4.setLabelText("Phone Number");

        myTextFieldLogin5.setLabelText("Email");

        myTextFieldLogin6.setLabelText("Name");

        myTextFieldLogin7.setLabelText("Age");
        myTextFieldLogin7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myTextFieldLogin7ActionPerformed(evt);
            }
        });

        combobox2.setLabeText("Select Gender");

        button3.setText("Add Tenant");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myTextFieldLogin6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(myTextFieldLogin7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combobox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myTextFieldLogin5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myTextFieldLogin4, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 158, Short.MAX_VALUE)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 158, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myTextFieldLogin4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myTextFieldLogin6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myTextFieldLogin5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myTextFieldLogin7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jTabbedPane2.addTab("Add Tenant", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jTabbedPane2))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        sysAdminTab.addTab("Manage Network", jPanel1);

        createEnterpriseName.setBackground(new java.awt.Color(245, 245, 245));
        createEnterpriseName.setLabelText("Enterprise Name");
        createEnterpriseName.setLineColor(new java.awt.Color(27, 152, 245));

        createEnterpriseType.setLabeText("Enterprise Type");

        createEnterpriseButton.setText("Create Admin");
        createEnterpriseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEnterpriseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createEnterpriseType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createEnterpriseName, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                .addGap(89, 89, 89))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(createEnterpriseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(createEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createEnterpriseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout createEntLayout = new javax.swing.GroupLayout(createEnt);
        createEnt.setLayout(createEntLayout);
        createEntLayout.setHorizontalGroup(
            createEntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        createEntLayout.setVerticalGroup(
            createEntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sysAdminTab.addTab("Create Enterprise", createEnt);

        cEntPassword.setBackground(new java.awt.Color(245, 245, 245));
        cEntPassword.setLabelText("Password");
        cEntPassword.setLineColor(new java.awt.Color(27, 152, 245));

        cEntUsername.setBackground(new java.awt.Color(245, 245, 245));
        cEntUsername.setLabelText("Username");
        cEntUsername.setLineColor(new java.awt.Color(27, 152, 245));

        cEntName.setLabeText("Enterprise");

        cEntCreateButton.setText("Create Admin");
        cEntCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEntCreateButtonActionPerformed(evt);
            }
        });

        cEntEEname.setBackground(new java.awt.Color(245, 245, 245));
        cEntEEname.setLabelText("Name");
        cEntEEname.setLineColor(new java.awt.Color(27, 152, 245));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cEntName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cEntUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cEntPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(cEntEEname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
                .addGap(89, 89, 89))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(cEntCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(cEntName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cEntUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cEntPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cEntEEname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(cEntCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout createEntAdminTabLayout = new javax.swing.GroupLayout(createEntAdminTab);
        createEntAdminTab.setLayout(createEntAdminTabLayout);
        createEntAdminTabLayout.setHorizontalGroup(
            createEntAdminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        createEntAdminTabLayout.setVerticalGroup(
            createEntAdminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sysAdminTab.addTab("Create Enterprise Admin", createEntAdminTab);

        combobox4.setLabeText("Enterprise");

        combobox5.setLabeText("Organizations");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combobox5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(combobox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(combobox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sysAdminTab.addTab("View System", jPanel7);

        getContentPane().add(sysAdminTab, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseClicked
        if (maximized) {
            SystemAdmin.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            SystemAdmin.this.setMaximizedBounds(env.getMaximumWindowBounds());
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
            this.dispose();
            MainLoginPage x = new MainLoginPage();
        x.show(); //display View LoginPage Form
        //dispose(); //Close SystemAdmin Form
        x.setVisible(true);
        }
    }//GEN-LAST:event_buttonLogoutMouseClicked

    private void buttonLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogoutMouseEntered
        changecolor(lineSetting, new Color(190,224,236));
    }//GEN-LAST:event_buttonLogoutMouseEntered

    private void buttonLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogoutMouseExited
        changecolor(lineSetting, new Color(4,16,20));
    }//GEN-LAST:event_buttonLogoutMouseExited

    private void pharmacyStaisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacyStaisticsMouseClicked
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_managePharmacyMouseClicked

    private void managePharmacyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePharmacyMouseEntered
        changecolor(managePharmacy, new Color(3,138,255));
        changecolor(side2, new Color(190, 224, 236));
    }//GEN-LAST:event_managePharmacyMouseEntered

    private void managePharmacyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePharmacyMouseExited
       changecolor(managePharmacy, new Color(0,91,149));
        changecolor(side2, new Color(0,91,149));
    }//GEN-LAST:event_managePharmacyMouseExited

    private void createEnterpriseAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createEnterpriseAdminMouseClicked
        // TODO add your handling code here:
       // 
        sysAdminTab.setSelectedIndex(2);
        
    }//GEN-LAST:event_createEnterpriseAdminMouseClicked

    private void createEnterpriseAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createEnterpriseAdminMouseEntered
      changecolor(createEnterpriseAdmin, new Color(3,138,255));
        changecolor(side3, new Color(190, 224, 236));
    }//GEN-LAST:event_createEnterpriseAdminMouseEntered

    private void createEnterpriseAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createEnterpriseAdminMouseExited
       changecolor(createEnterpriseAdmin, new Color(0,91,149));
        changecolor(side3, new Color(0,91,149));
    }//GEN-LAST:event_createEnterpriseAdminMouseExited

    private void manageMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMedicineMouseClicked
        // TODO add your handling code here:
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
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void manageSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSupplierMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_manageSupplierMouseClicked

    private void manageSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSupplierMouseEntered
        changecolor(manageMedicine, new Color(3,138,255));
        changecolor(side5, new Color(190, 224, 236));
    }//GEN-LAST:event_manageSupplierMouseEntered

    private void manageSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSupplierMouseExited
        changecolor(manageMedicine, new Color(0,91,149));
        changecolor(side5, new Color(0,91,149));
    }//GEN-LAST:event_manageSupplierMouseExited

    private void myTextFieldLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myTextFieldLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myTextFieldLogin1ActionPerformed

    private void myTextFieldLogin7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myTextFieldLogin7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myTextFieldLogin7ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void createEnterpriseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEnterpriseButtonActionPerformed
        // TODO add your handling code here:
        
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) createEnterpriseType.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        
        String name = createEnterpriseName.getText();
        System.out.println(name);
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
        
    }//GEN-LAST:event_createEnterpriseButtonActionPerformed

    private void cEntCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEntCreateButtonActionPerformed
        // TODO add your handling code here:
         Enterprise enterprise = (Enterprise) cEntName.getSelectedItem();

        String username = cEntUsername.getText();
        String password = cEntPassword.getText();
        String name = cEntEEname.getText();

        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        if (EcoSystem.isUserUnique(username)) {
            UserAccount account = null;
            if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Volunteer) {
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new VolunteerAdminRole());
            } 
            
//            else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Diagnostics) {
//                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new GovernmentAdmin());
//            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Hospital) {
//                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalAdmin());
//            } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Insurance) {
//                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new InsuranceAdminRole());
//      
        }
    }//GEN-LAST:event_cEntCreateButtonActionPerformed

    private void sysAdminTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sysAdminTabMouseClicked
        // TODO add your handling code here:
        int index = sysAdminTab.getSelectedIndex();
       
        System.out.print(index);
        switch (index) {
            case 0:
                break;
            case 1:
                populateEnterprise();
                break;
            case 2:
                populateEnterpriseName(network);
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_sysAdminTabMouseClicked

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
//            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SystemAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SystemAdmin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuIcon;
    private UI.Components.Button button1;
    private UI.Components.Button button2;
    private UI.Components.Button button3;
    private javax.swing.JPanel buttonClose;
    private javax.swing.JLabel buttonLogout;
    private javax.swing.JPanel buttonMax;
    private javax.swing.JLabel buttonhidemenu;
    private UI.Components.Button cEntCreateButton;
    private UI.Components.MyTextFieldLogin cEntEEname;
    private UI.Components.Combobox cEntName;
    private UI.Components.MyTextFieldLogin cEntPassword;
    private UI.Components.MyTextFieldLogin cEntUsername;
    private javax.swing.JLabel close;
    private UI.Components.Combobox combobox1;
    private UI.Components.Combobox combobox2;
    private UI.Components.Combobox combobox4;
    private UI.Components.Combobox combobox5;
    private javax.swing.JPanel createEnt;
    private javax.swing.JPanel createEntAdminTab;
    private javax.swing.JPanel createEnterpriseAdmin;
    private UI.Components.Button createEnterpriseButton;
    private UI.Components.MyTextFieldLogin createEnterpriseName;
    private UI.Components.Combobox createEnterpriseType;
    private javax.swing.JPanel header;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JPanel iconmaxclose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel lineSetting;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JLabel manageCategoryIcon;
    private javax.swing.JLabel manageCategorylbl;
    private javax.swing.JPanel manageMedicine;
    private javax.swing.JLabel manageMedicineIcon;
    private javax.swing.JLabel manageMedicinelbl;
    private javax.swing.JPanel managePharmacy;
    private javax.swing.JLabel managePharmacyIcon;
    private javax.swing.JLabel managePharmacylbl;
    private javax.swing.JPanel manageSupplier;
    private javax.swing.JLabel manageSupplierIcon;
    private javax.swing.JLabel manageSupplierlbl;
    private javax.swing.JLabel max;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel menuhide1;
    private UI.Components.MyTextFieldLogin myTextFieldLogin1;
    private UI.Components.MyTextFieldLogin myTextFieldLogin2;
    private UI.Components.MyTextFieldLogin myTextFieldLogin4;
    private UI.Components.MyTextFieldLogin myTextFieldLogin5;
    private UI.Components.MyTextFieldLogin myTextFieldLogin6;
    private UI.Components.MyTextFieldLogin myTextFieldLogin7;
    private javax.swing.JPanel pharmacyStaistics;
    private javax.swing.JPanel setting;
    private javax.swing.JPanel side1;
    private javax.swing.JPanel side2;
    private javax.swing.JPanel side3;
    private javax.swing.JPanel side4;
    private javax.swing.JPanel side5;
    private javax.swing.JLabel statisticsimg;
    private javax.swing.JLabel statisticslbl;
    private javax.swing.JTabbedPane sysAdminTab;
    // End of variables declaration//GEN-END:variables
}
