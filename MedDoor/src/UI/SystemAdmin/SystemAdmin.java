
package UI.SystemAdmin;


import Business.Community.Community;
import Business.Community.House;
import Business.Community.HouseList;
import Business.Community.Tenant;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.DiagnosticAdminRole;
import Business.Role.HospitalAdminRole;
import Business.Role.InsuranceAdminRole;
import Business.Role.VolunteerAdminRole;
import Business.UserAccount.UserAccount;
import UI.Components.Combobox;
import UI.Components.TableCustom;
import UI.Login.MainLoginPage;
import com.model.Validation;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class SystemAdmin extends javax.swing.JFrame {

    boolean a = true;
    static boolean maximized = true;
    private EcoSystem system;
    private UserAccount userAccount;
    Enterprise enterprise;
    Network network;
    JFrame parentFrame;
    Validation fieldValidation;
    int xx, xy;

    public SystemAdmin(JFrame parentFrame, UserAccount account, 
            Enterprise enterprise, 
            EcoSystem system) {
        initComponents();
        this.system = system; 
        this.parentFrame = parentFrame;
        sysAdminTab.setSelectedIndex(0);
        network = system.getNetworkList().get(0);
        fieldValidation = new Validation();
        TableCustom.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
        TableCustom.apply(jScrollPane4, TableCustom.TableType.DEFAULT);
        TableCustom.apply(jScrollPane5, TableCustom.TableType.DEFAULT);
        populateCommunity();
        
    }
    
    public void populateCommunity() {
       addHouseComCombo.removeAll();
       for (Community type : network.getCommunityDirectory().getCommunityList()) {
            addHouseComCombo.addItem(type);
        } 
    }
    //Method to change panel color on hover
    public void populateEnterprise() {
        System.out.print("inside populate");
        createEnterpriseType.removeAll();
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            createEnterpriseType.addItem(type);
        }
    }
    
    private void populateEnterpriseName(Network network, Combobox comboBox){
        comboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            comboBox.addItem(enterprise);
        }
        
    }
    
    private void populateHouseTable(Enterprise selectedEnterprise) {
        try{
        DefaultTableModel model = (DefaultTableModel) vSEntepriseT.getModel();

        model.setRowCount(0);
            for (Organization org : selectedEnterprise.getOrganizationDirectory().getOrganizationList()) {
                for(UserAccount user : org.getUserAccountDirectory().getUserAccountList()){
                Object[] row = new Object[3];
                row[0] = org.getName();
                row[1] = user.getEmployee().getName();
                row[2] = user.getRole().toString();
                model.addRow(row);
                }
            }
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }
    }
     
    
    
     private void populateHouseTable(Community selectedCommunity) {
        try{
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();

        model.setRowCount(0);
            for (House house : selectedCommunity.houselist.getHouses()) {
                Object[] row = new Object[4];
                row[0] = house.getHouseNumer();
                row[1] = house.getStreeAdredss();
                row[2] = network;
                row[3] = selectedCommunity.getZipCode();
                model.addRow(row);
                
            }
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }
    }
     
      private void populateTenantTable(House selectedHouse) {
        try{
        DefaultTableModel model = (DefaultTableModel) tenantsTable.getModel();

        model.setRowCount(0);
            for (Tenant tenant : selectedHouse.tenats.getTenants()) {
                Object[] row = new Object[5];
                row[0] = tenant.getFirstName();
                row[1] = tenant.getLastName();
                row[2] = tenant.getGender();
                row[3] = tenant.getAge();
                row[4] = tenant.getEmailId();
                model.addRow(row);
                
            }
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }
    }
    
    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    
     public void changecolorB(JButton hover, Color rand) {
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
        manageNetwork = new javax.swing.JPanel();
        side1 = new javax.swing.JPanel();
        statisticslbl = new javax.swing.JLabel();
        statisticsimg = new javax.swing.JLabel();
        manageEnterprise = new javax.swing.JPanel();
        side2 = new javax.swing.JPanel();
        managePharmacylbl = new javax.swing.JLabel();
        managePharmacyIcon = new javax.swing.JLabel();
        enterpriseAdmin = new javax.swing.JPanel();
        side3 = new javax.swing.JPanel();
        manageCategorylbl = new javax.swing.JLabel();
        manageCategoryIcon = new javax.swing.JLabel();
        viewSystem = new javax.swing.JPanel();
        side4 = new javax.swing.JPanel();
        manageMedicinelbl = new javax.swing.JLabel();
        manageMedicineIcon = new javax.swing.JLabel();
        sysAdminTab = new javax.swing.JTabbedPane();
        manageNetworkTab = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addHouseComCombo = new UI.Components.Combobox();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        ListHouses = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        addTenantN = new UI.Components.Button();
        jScrollPane5 = new javax.swing.JScrollPane();
        tenantsTable = new javax.swing.JTable();
        addTenantN1 = new UI.Components.Button();
        jPanel4 = new javax.swing.JPanel();
        houseAddress = new UI.Components.MyTextFieldLogin();
        houseNumber = new UI.Components.MyTextFieldLogin();
        addHouse = new UI.Components.Button();
        jPanel5 = new javax.swing.JPanel();
        tenantContact = new UI.Components.MyTextFieldLogin();
        tenantEmail = new UI.Components.MyTextFieldLogin();
        tenantName = new UI.Components.MyTextFieldLogin();
        tenantAge = new UI.Components.MyTextFieldLogin();
        addTenant = new UI.Components.Button();
        genderCombo = new UI.Components.Combobox();
        tenantDob2 = new com.toedter.calendar.JDateChooser();
        button1 = new UI.Components.Button();
        createEnt = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        createEnterpriseName = new UI.Components.MyTextFieldLogin();
        createEnterpriseType = new UI.Components.Combobox();
        createEnterpriseButton = new UI.Components.Button();
        createEntAdminTab = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        cEntUsername = new UI.Components.MyTextFieldLogin();
        cEntName = new UI.Components.Combobox();
        cEntCreateButton = new UI.Components.Button();
        cEntEEname = new UI.Components.MyTextFieldLogin();
        cEntPassword = new UI.Components.MyPasswordFieldLogin();
        viewSystemTab = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        vSEnterprise = new UI.Components.Combobox();
        jScrollPane1 = new javax.swing.JScrollPane();
        vSEntepriseT = new javax.swing.JTable();
        button2 = new UI.Components.Button();
        button3 = new UI.Components.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        header.setBackground(new java.awt.Color(27, 152, 245));
        header.setPreferredSize(new java.awt.Dimension(800, 50));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
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

        manageNetwork.setBackground(new java.awt.Color(0, 91, 149));
        manageNetwork.setPreferredSize(new java.awt.Dimension(220, 50));
        manageNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageNetworkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageNetworkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageNetworkMouseExited(evt);
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
        statisticsimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/performance_imac_40px.png"))); // NOI18N

        javax.swing.GroupLayout manageNetworkLayout = new javax.swing.GroupLayout(manageNetwork);
        manageNetwork.setLayout(manageNetworkLayout);
        manageNetworkLayout.setHorizontalGroup(
            manageNetworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageNetworkLayout.createSequentialGroup()
                .addComponent(side1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statisticsimg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statisticslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageNetworkLayout.setVerticalGroup(
            manageNetworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageNetworkLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statisticslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(statisticsimg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        manageEnterprise.setBackground(new java.awt.Color(0, 91, 149));
        manageEnterprise.setPreferredSize(new java.awt.Dimension(220, 50));
        manageEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageEnterpriseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageEnterpriseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageEnterpriseMouseExited(evt);
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
        managePharmacyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/adaptive_degradation_40px.png"))); // NOI18N

        javax.swing.GroupLayout manageEnterpriseLayout = new javax.swing.GroupLayout(manageEnterprise);
        manageEnterprise.setLayout(manageEnterpriseLayout);
        manageEnterpriseLayout.setHorizontalGroup(
            manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEnterpriseLayout.createSequentialGroup()
                .addComponent(side2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(managePharmacyIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(managePharmacylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageEnterpriseLayout.setVerticalGroup(
            manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageEnterpriseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managePharmacylbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(managePharmacyIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        enterpriseAdmin.setBackground(new java.awt.Color(0, 91, 149));
        enterpriseAdmin.setPreferredSize(new java.awt.Dimension(220, 50));
        enterpriseAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterpriseAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterpriseAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterpriseAdminMouseExited(evt);
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
        manageCategorylbl.setText("Enterprise Admin");

        manageCategoryIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageCategoryIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/system_administrator_male_40px.png"))); // NOI18N

        javax.swing.GroupLayout enterpriseAdminLayout = new javax.swing.GroupLayout(enterpriseAdmin);
        enterpriseAdmin.setLayout(enterpriseAdminLayout);
        enterpriseAdminLayout.setHorizontalGroup(
            enterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterpriseAdminLayout.createSequentialGroup()
                .addComponent(side3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageCategoryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageCategorylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        enterpriseAdminLayout.setVerticalGroup(
            enterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enterpriseAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageCategorylbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(manageCategoryIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        viewSystem.setBackground(new java.awt.Color(0, 91, 149));
        viewSystem.setPreferredSize(new java.awt.Dimension(220, 50));
        viewSystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewSystemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewSystemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewSystemMouseExited(evt);
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
        manageMedicineIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/automative_storage_system_40px.png"))); // NOI18N

        javax.swing.GroupLayout viewSystemLayout = new javax.swing.GroupLayout(viewSystem);
        viewSystem.setLayout(viewSystemLayout);
        viewSystemLayout.setHorizontalGroup(
            viewSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewSystemLayout.createSequentialGroup()
                .addComponent(side4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageMedicineIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageMedicinelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        viewSystemLayout.setVerticalGroup(
            viewSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewSystemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageMedicinelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(manageMedicineIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout menuhide1Layout = new javax.swing.GroupLayout(menuhide1);
        menuhide1.setLayout(menuhide1Layout);
        menuhide1Layout.setHorizontalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(manageEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(enterpriseAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(viewSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuhide1Layout.setVerticalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhide1Layout.createSequentialGroup()
                .addComponent(manageNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(enterpriseAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(viewSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345))
        );

        menuhide.add(menuhide1, java.awt.BorderLayout.CENTER);

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        sysAdminTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sysAdminTabMouseClicked(evt);
            }
        });

        manageNetworkTab.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(217, 241, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOSTON CITY ");

        addHouseComCombo.setLabeText("Community");
        addHouseComCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHouseComComboActionPerformed(evt);
            }
        });

        ListHouses.setBackground(new java.awt.Color(217, 241, 255));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "House Number", "Address", "City", "ZipCode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        houseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                houseTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(houseTable);

        addTenantN.setBackground(new java.awt.Color(0, 91, 149));
        addTenantN.setForeground(new java.awt.Color(255, 255, 255));
        addTenantN.setText("Add Tenant");
        addTenantN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addTenantN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addTenantNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addTenantNMouseExited(evt);
            }
        });
        addTenantN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTenantNActionPerformed(evt);
            }
        });

        tenantsTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Second Name", "Gender", "Age", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tenantsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tenantsTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tenantsTable);

        addTenantN1.setBackground(new java.awt.Color(0, 91, 149));
        addTenantN1.setForeground(new java.awt.Color(255, 255, 255));
        addTenantN1.setText("View Tenants");
        addTenantN1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addTenantN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addTenantN1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addTenantN1MouseExited(evt);
            }
        });
        addTenantN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTenantN1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ListHousesLayout = new javax.swing.GroupLayout(ListHouses);
        ListHouses.setLayout(ListHousesLayout);
        ListHousesLayout.setHorizontalGroup(
            ListHousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
            .addComponent(jScrollPane5)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListHousesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addTenantN1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addTenantN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ListHousesLayout.setVerticalGroup(
            ListHousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListHousesLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(ListHousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTenantN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTenantN1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("List Houses", ListHouses);

        jPanel4.setBackground(new java.awt.Color(217, 241, 255));

        houseAddress.setLabelText("House Address");
        houseAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                houseAddressFocusGained(evt);
            }
        });

        houseNumber.setLabelText("Apartment Number");
        houseNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                houseNumberFocusGained(evt);
            }
        });
        houseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseNumberActionPerformed(evt);
            }
        });

        addHouse.setBackground(new java.awt.Color(0, 91, 149));
        addHouse.setForeground(new java.awt.Color(255, 255, 255));
        addHouse.setText("Add House");
        addHouse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addHouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addHouseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addHouseMouseExited(evt);
            }
        });
        addHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(houseAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(houseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(addHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280))))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {houseAddress, houseNumber});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(houseAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(houseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(addHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        jTabbedPane2.addTab("Add House", jPanel4);

        jPanel5.setBackground(new java.awt.Color(217, 241, 255));

        tenantContact.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tenantContact.setLabelText("Phone Number");
        tenantContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tenantContactFocusGained(evt);
            }
        });
        tenantContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tenantContactKeyTyped(evt);
            }
        });

        tenantEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tenantEmail.setLabelText("Email");
        tenantEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tenantEmailFocusGained(evt);
            }
        });

        tenantName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tenantName.setLabelText("Name");
        tenantName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tenantNameFocusGained(evt);
            }
        });
        tenantName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tenantNameKeyTyped(evt);
            }
        });

        tenantAge.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tenantAge.setLabelText("Age");
        tenantAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tenantAgeFocusGained(evt);
            }
        });
        tenantAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenantAgeActionPerformed(evt);
            }
        });
        tenantAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tenantAgeKeyTyped(evt);
            }
        });

        addTenant.setBackground(new java.awt.Color(0, 91, 149));
        addTenant.setForeground(new java.awt.Color(255, 255, 255));
        addTenant.setText("Add Tenant");
        addTenant.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addTenant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addTenantMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addTenantMouseExited(evt);
            }
        });
        addTenant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTenantActionPerformed(evt);
            }
        });

        genderCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        genderCombo.setSelectedIndex(-1);
        genderCombo.setLabeText("Gender");

        tenantDob2.setDateFormatString("MM/dd/yyyy");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tenantName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tenantAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tenantContact, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(tenantEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tenantDob2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(addTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenantContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenantAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenantEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(addTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tenantDob2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        jTabbedPane2.addTab("Add Tenant", jPanel5);

        button1.setBackground(new java.awt.Color(0, 91, 149));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("View ");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addHouseComCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(addHouseComCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        manageNetworkTab.add(jPanel2, java.awt.BorderLayout.CENTER);

        sysAdminTab.addTab("Manage Network", manageNetworkTab);

        jPanel11.setBackground(new java.awt.Color(217, 241, 255));

        createEnterpriseName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        createEnterpriseName.setLabelText("Enterprise Name");
        createEnterpriseName.setLineColor(new java.awt.Color(27, 152, 245));
        createEnterpriseName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                createEnterpriseNameFocusGained(evt);
            }
        });

        createEnterpriseType.setLabeText("Enterprise Type");

        createEnterpriseButton.setBackground(new java.awt.Color(0, 91, 149));
        createEnterpriseButton.setForeground(new java.awt.Color(255, 255, 255));
        createEnterpriseButton.setText("Create Enterprise");
        createEnterpriseButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createEnterpriseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createEnterpriseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createEnterpriseButtonMouseExited(evt);
            }
        });
        createEnterpriseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEnterpriseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(createEnterpriseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(createEnterpriseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(createEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(createEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(createEnterpriseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
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

        jPanel8.setBackground(new java.awt.Color(217, 241, 255));

        cEntUsername.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cEntUsername.setLabelText("Username");
        cEntUsername.setLineColor(new java.awt.Color(27, 152, 245));
        cEntUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cEntUsernameFocusGained(evt);
            }
        });

        cEntName.setLabeText("Enterprise List");

        cEntCreateButton.setBackground(new java.awt.Color(0, 91, 149));
        cEntCreateButton.setForeground(new java.awt.Color(255, 255, 255));
        cEntCreateButton.setText("Create Admin");
        cEntCreateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cEntCreateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cEntCreateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cEntCreateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cEntCreateButtonMouseExited(evt);
            }
        });
        cEntCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEntCreateButtonActionPerformed(evt);
            }
        });

        cEntEEname.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cEntEEname.setLabelText("Name");
        cEntEEname.setLineColor(new java.awt.Color(27, 152, 245));
        cEntEEname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cEntEEnameFocusGained(evt);
            }
        });

        cEntPassword.setLabelText("Password");
        cEntPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cEntPasswordFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(cEntCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cEntEEname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cEntPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cEntUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cEntName, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(cEntName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cEntUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cEntPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cEntEEname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(cEntCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
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

        jPanel9.setBackground(new java.awt.Color(217, 241, 255));

        vSEnterprise.setLabeText("Enterprise");

        vSEntepriseT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Organization", "Employee Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vSEntepriseT);

        button2.setBackground(new java.awt.Color(0, 91, 149));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("View Data");
        button2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(0, 91, 149));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Update");
        button3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vSEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(vSEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout viewSystemTabLayout = new javax.swing.GroupLayout(viewSystemTab);
        viewSystemTab.setLayout(viewSystemTabLayout);
        viewSystemTabLayout.setHorizontalGroup(
            viewSystemTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        viewSystemTabLayout.setVerticalGroup(
            viewSystemTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sysAdminTab.addTab("View System", viewSystemTab);

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

    private void manageNetworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageNetworkMouseClicked
         sysAdminTab.setSelectedIndex(0);
         changecolor(manageNetwork, new Color(3,138,255));
        changecolor(side1, new Color(190, 224, 236));
    }//GEN-LAST:event_manageNetworkMouseClicked

    private void manageNetworkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageNetworkMouseEntered
        changecolor(manageNetwork, new Color(3,138,255));
        changecolor(side1, new Color(190, 224, 236));
    }//GEN-LAST:event_manageNetworkMouseEntered

    private void manageNetworkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageNetworkMouseExited
        changecolor(manageNetwork, new Color(0,91,149));
        changecolor(side1, new Color(0,91,149));
    }//GEN-LAST:event_manageNetworkMouseExited

    private void manageEnterpriseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEnterpriseMouseClicked
       sysAdminTab.setSelectedIndex(1);
         changecolor(manageEnterprise, new Color(3,138,255));
        changecolor(side2, new Color(190, 224, 236));
    }//GEN-LAST:event_manageEnterpriseMouseClicked

    private void manageEnterpriseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEnterpriseMouseEntered
        changecolor(manageEnterprise, new Color(3,138,255));
        changecolor(side2, new Color(190, 224, 236));
    }//GEN-LAST:event_manageEnterpriseMouseEntered

    private void manageEnterpriseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEnterpriseMouseExited
       changecolor(manageEnterprise, new Color(0,91,149));
        changecolor(side2, new Color(0,91,149));
    }//GEN-LAST:event_manageEnterpriseMouseExited

    private void enterpriseAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterpriseAdminMouseClicked
        sysAdminTab.setSelectedIndex(2);
         changecolor(enterpriseAdmin, new Color(3,138,255));
        changecolor(side3, new Color(190, 224, 236));
        
    }//GEN-LAST:event_enterpriseAdminMouseClicked

    private void enterpriseAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterpriseAdminMouseEntered
      changecolor(enterpriseAdmin, new Color(3,138,255));
        changecolor(side3, new Color(190, 224, 236));
    }//GEN-LAST:event_enterpriseAdminMouseEntered

    private void enterpriseAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterpriseAdminMouseExited
       changecolor(enterpriseAdmin, new Color(0,91,149));
        changecolor(side3, new Color(0,91,149));
    }//GEN-LAST:event_enterpriseAdminMouseExited

    private void viewSystemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSystemMouseClicked
      sysAdminTab.setSelectedIndex(3);
         changecolor(viewSystem, new Color(3,138,255));
        changecolor(side4, new Color(190, 224, 236));
    }//GEN-LAST:event_viewSystemMouseClicked

    private void viewSystemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSystemMouseEntered
      changecolor(viewSystem, new Color(3,138,255));
        changecolor(side4, new Color(190, 224, 236));
    }//GEN-LAST:event_viewSystemMouseEntered

    private void viewSystemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSystemMouseExited
        changecolor(viewSystem, new Color(0,91,149));
        changecolor(side4, new Color(0,91,149));
    }//GEN-LAST:event_viewSystemMouseExited

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

    private void houseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseNumberActionPerformed

    private void tenantAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenantAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenantAgeActionPerformed

    private void addTenantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTenantActionPerformed
       if (tenantName.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please enter Tenant Name");
             return;
         }
          else if(tenantAge.getText().equals("")) {
             JOptionPane.showMessageDialog(null,"Please enter Tenant Age");
             return;
         }
          else if(tenantContact.getText().equals("")) {
             JOptionPane.showMessageDialog(null,"Please enter Tenant Contact");
             return;
         }
          else if(tenantEmail.getText().equals("")) {
             JOptionPane.showMessageDialog(null,"Please enter Tenant Email");
             return;
         }
        if (!tenantEmail.getText().matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(this, "Invalid Email Address");
            return;
        }
       
        if (tenantContact.getText().length() >= 11) {
            JOptionPane.showMessageDialog(this, "Contact Number too Long");
            return ;
        }
        if (tenantContact.getText().length() < 10) {
            JOptionPane.showMessageDialog(this, "Contact Number too Short");
            return;
        }
         else{
        int selectedRowIndex = houseTable.getSelectedRow();
        if(selectedRowIndex <0){
             JOptionPane.showMessageDialog(null, "Please select house first");
        return;
        }
        
        
       
        Community selectedCommunity = (Community) addHouseComCombo.getSelectedItem();
        House selectedHouse = selectedCommunity.getHouse().getHouses().get(selectedRowIndex);
        Date date = new Date(); 
//        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        date = tenantDob2.getDate();

        selectedHouse.getTenats().createAndAddTenant(tenantName.getText(), tenantName.getText(), date, String.valueOf(genderCombo.getSelectedItem()), Integer.parseInt(tenantAge.getText()), 
                tenantEmail.getText(), String.valueOf(tenantContact.getText()),selectedHouse);
        
        JOptionPane.showMessageDialog(this, "Tenant Added!");
        tenantName.setText(null);
        tenantAge.setText(null);
        tenantContact.setText(null);
        tenantEmail.setText(null);
        genderCombo.setSelectedItem(-1);
          }
       
    }//GEN-LAST:event_addTenantActionPerformed

    private void createEnterpriseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEnterpriseButtonActionPerformed
        String errorMessage = "";
        if (createEnterpriseType.getSelectedIndex() == -1) {
            errorMessage += "Please select Enterprise! \n";
        }
        else if(createEnterpriseName.getText().equals(""))
        {
             createEnterpriseName.setHelperText("Please enter Entersprise Name");
        }
         else if(createEnterpriseName.getText().length()<5 || createEnterpriseName.getText().length()>20 )
        {
             createEnterpriseName.setHelperText("Enterprise Name too short or long!");
        }else
         {
        
            
        
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) createEnterpriseType.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        
        String name = createEnterpriseName.getText();
        System.out.println(name);
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
        JOptionPane.showMessageDialog(this, "Enterprise Added");
        
        createEnterpriseName.setText(null);
         }
    }//GEN-LAST:event_createEnterpriseButtonActionPerformed
 public boolean isEmptyEnterprise() {
     if (cEntUsername.getText().isEmpty()) {
         cEntUsername.setHelperText("Please Enter Username");
        return false;
        }
     if (cEntPassword.getText().isEmpty()) {
         cEntPassword.setHelperText("Please Enter Username");
        return false;
        }
     if (cEntEEname.getText().isEmpty()) {
         cEntEEname.setHelperText("Please Enter Username");
        return false;
        }
     if (!cEntUsername.getText().isEmpty()) {
         cEntUsername.setHelperText("");
        return false;
        }
     else if (!cEntPassword.getText().isEmpty()) {
         cEntPassword.setHelperText("");
        return false;
        }
     else if (!cEntEEname.getText().isEmpty()) {
         cEntEEname.setHelperText("");
        return false;
        }
     return true;

}
  private void clearEnterprise() {
        //clear TextField values
        cEntUsername.setText(null);
        cEntPassword.setText(null);
        cEntEEname.setText(null);
  }
  
  boolean hasError(String fieldName) {
        if (fieldName == "cEntUsername") {
            String username = cEntUsername.getText();
            if (username.trim().isEmpty()) {
                cEntUsername.setHelperText("Please Enter Username");
                return true;
            } else if (!fieldValidation.isStringOnlyAlphabet(username)) {
                
               cEntUsername.setHelperText("Please Enter Valid Username");
                return true;
            } else if (!fieldValidation.isValidLength(username, 5, 30)) {
               cEntUsername.setHelperText("UserName must be betwen 5 and 30 characters");
              
                return true;
            } else {
                cEntUsername.setHelperText("");
                return false;
            }
        } 
        else if (fieldName == "cEntPassword") {
            String u = cEntPassword.getText();
            if (u.trim().isEmpty()) {
                cEntPassword.setHelperText("Please Enter Password");
                return true;
            } else if (!fieldValidation.isValidLength(u, 5, 30)) {
               cEntPassword.setHelperText("Password must be betwen 5 and 30 characters");
              
                return true;
            } else {
                cEntPassword.setHelperText("");
                return false;
            }
        } 
        else if (fieldName == "cEntEEname") {
            String u = cEntEEname.getText();
            if (u.trim().isEmpty()) {
                cEntEEname.setHelperText("Please Enter Enterprise Name");
                return true;
            } else if (!fieldValidation.isStringOnlyAlphabet(u)) {
                
               cEntEEname.setHelperText("Please Enter Valid Enterprise Name");
                return true;
            } else {
                cEntEEname.setHelperText("");
                return false;
            }
        } 
        return false;
  }
    private void cEntCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEntCreateButtonActionPerformed
    int flag = 0;
        String fields[] = {"cEntUsername", "cEntPassword", "cEntEEname"};
        for (int i = 0; i < fields.length; i++) {
            if (hasError(fields[i])) {
                flag++;
            }
        }
       if (flag > 0) {
            return;
        }
        Enterprise enterprise = (Enterprise) cEntName.getSelectedItem();

        String username = cEntUsername.getText();
        String password = cEntPassword.getText();
        String name = cEntEEname.getText();

        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        if (EcoSystem.isUserUnique(username)) {
            UserAccount account = null;
            switch (enterprise.getEnterpriseType()) {
            case Volunteer:
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new VolunteerAdminRole());
                System.out.print(account);
                break;
            case Diagnostics:
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new DiagnosticAdminRole());
                break;
            case Hospital:
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalAdminRole());
                break;
            case Insurance:
                account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new InsuranceAdminRole());
                break;
            default:
                break;
        }
        }
         JOptionPane.showMessageDialog(this, "Enterprise Admin Added");
        clearEnterprise();
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
                populateEnterpriseName(network, cEntName);
                break;
                case 3:
                populateEnterpriseName(network, vSEnterprise);
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_sysAdminTabMouseClicked

    private void cEntCreateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cEntCreateButtonMouseEntered
        changecolorB(cEntCreateButton, new Color(3,138,255));
         
    }//GEN-LAST:event_cEntCreateButtonMouseEntered

    private void cEntCreateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cEntCreateButtonMouseExited
        changecolorB(cEntCreateButton, new Color(0,91,149));
    }//GEN-LAST:event_cEntCreateButtonMouseExited

    private void createEnterpriseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createEnterpriseButtonMouseEntered
       changecolorB(createEnterpriseButton, new Color(3,138,255));
    }//GEN-LAST:event_createEnterpriseButtonMouseEntered

    private void createEnterpriseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createEnterpriseButtonMouseExited
        changecolorB(createEnterpriseButton, new Color(0,91,149));
    }//GEN-LAST:event_createEnterpriseButtonMouseExited

    private void addTenantNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTenantNActionPerformed
        
        int selectedRowIndex = houseTable.getSelectedRow();
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        } 
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_addTenantNActionPerformed

    private void addTenantNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTenantNMouseEntered
       changecolorB(addTenantN, new Color(3,138,255));
    }//GEN-LAST:event_addTenantNMouseEntered

    private void addTenantNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTenantNMouseExited
               changecolorB(addTenantN, new Color(0,91,149));

    }//GEN-LAST:event_addTenantNMouseExited

    private void addHouseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addHouseMouseEntered
         changecolorB(addHouse, new Color(3,138,255));
    }//GEN-LAST:event_addHouseMouseEntered

    private void addHouseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addHouseMouseExited
      changecolorB(addHouse, new Color(0,91,149));
    }//GEN-LAST:event_addHouseMouseExited

    private void addTenantMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTenantMouseEntered
        changecolorB(addTenant, new Color(3,138,255));
    }//GEN-LAST:event_addTenantMouseEntered

    private void addTenantMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTenantMouseExited
         changecolorB(addTenant, new Color(0,91,149));
    }//GEN-LAST:event_addTenantMouseExited

    private void houseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_houseTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_houseTableMouseClicked

    private void tenantsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenantsTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tenantsTableMouseClicked

    private void addHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHouseActionPerformed
        if (houseNumber.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please enter House Number");
             
         }
          else if(houseAddress.getText().equals("")) {
             JOptionPane.showMessageDialog(null,"Please enter House Address");
          
         }
         else{
        Community selectedCommunity = (Community) addHouseComCombo.getSelectedItem();
    
        selectedCommunity.getHouse().createAndAddHouse(houseNumber.getText(), houseAddress.getText(),selectedCommunity);
        
        JOptionPane.showMessageDialog(this, "House Added!");
        houseAddress.setText(null);
        houseNumber.setText(null);
        
         }
    }//GEN-LAST:event_addHouseActionPerformed

    private void cEntCreateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cEntCreateButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cEntCreateButtonMouseClicked

    private void addHouseComComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHouseComComboActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_addHouseComComboActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        Community selectedCommunity = (Community) addHouseComCombo.getSelectedItem();
        if (selectedCommunity != null) {
            populateHouseTable(selectedCommunity);  
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void addTenantN1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTenantN1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addTenantN1MouseEntered

    private void addTenantN1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTenantN1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addTenantN1MouseExited

    private void addTenantN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTenantN1ActionPerformed
        // TODO add your handling code here:
        Community selectedCommunity = (Community) addHouseComCombo.getSelectedItem();
        if (selectedCommunity != null) {
        int selectedRowIndex = houseTable.getSelectedRow();
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        } 
        House selectedHouse = selectedCommunity.getHouse().getHouses().get(selectedRowIndex);
        populateTenantTable(selectedHouse);
        }
    }//GEN-LAST:event_addTenantN1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        
         Enterprise enterprise = (Enterprise) vSEnterprise.getSelectedItem();
         
        
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
       xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_headerMouseDragged

    private void tenantAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tenantAgeKeyTyped
      if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_tenantAgeKeyTyped

    private void tenantContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tenantContactKeyTyped
      if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_tenantContactKeyTyped

    private void tenantNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tenantNameKeyTyped
       char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            tenantName.setEditable(true);
        } else {
            tenantName.setEditable(false);
        }
    }//GEN-LAST:event_tenantNameKeyTyped

    private void houseAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_houseAddressFocusGained
        houseAddress.setHelperText(null);
    }//GEN-LAST:event_houseAddressFocusGained

    private void houseNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_houseNumberFocusGained
        houseNumber.setHelperText(null);
    }//GEN-LAST:event_houseNumberFocusGained

    private void tenantNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tenantNameFocusGained
        tenantName.setHelperText(null);
    }//GEN-LAST:event_tenantNameFocusGained

    private void tenantContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tenantContactFocusGained
       tenantContact.setHelperText(null);
    }//GEN-LAST:event_tenantContactFocusGained

    private void tenantAgeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tenantAgeFocusGained
       tenantAge.setHelperText(null);
    }//GEN-LAST:event_tenantAgeFocusGained

    private void tenantEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tenantEmailFocusGained
        tenantEmail.setHelperText(null);
    }//GEN-LAST:event_tenantEmailFocusGained

    private void createEnterpriseNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_createEnterpriseNameFocusGained
       createEnterpriseName.setHelperText(null);
    }//GEN-LAST:event_createEnterpriseNameFocusGained

    private void cEntUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cEntUsernameFocusGained
        cEntUsername.setHelperText(null);
    }//GEN-LAST:event_cEntUsernameFocusGained

    private void cEntPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cEntPasswordFocusGained
        cEntPassword.setHelperText(null);
    }//GEN-LAST:event_cEntPasswordFocusGained

    private void cEntEEnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cEntEEnameFocusGained
       cEntEEname.setHelperText(null);
    }//GEN-LAST:event_cEntEEnameFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ListHouses;
    private javax.swing.JPanel MenuIcon;
    private UI.Components.Button addHouse;
    private UI.Components.Combobox addHouseComCombo;
    private UI.Components.Button addTenant;
    private UI.Components.Button addTenantN;
    private UI.Components.Button addTenantN1;
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
    private UI.Components.MyPasswordFieldLogin cEntPassword;
    private UI.Components.MyTextFieldLogin cEntUsername;
    private javax.swing.JLabel close;
    private javax.swing.JPanel createEnt;
    private javax.swing.JPanel createEntAdminTab;
    private UI.Components.Button createEnterpriseButton;
    private UI.Components.MyTextFieldLogin createEnterpriseName;
    private UI.Components.Combobox createEnterpriseType;
    private javax.swing.JPanel enterpriseAdmin;
    private UI.Components.Combobox genderCombo;
    private javax.swing.JPanel header;
    private javax.swing.JPanel hidemenu;
    private UI.Components.MyTextFieldLogin houseAddress;
    private UI.Components.MyTextFieldLogin houseNumber;
    private javax.swing.JTable houseTable;
    private javax.swing.JPanel iconmaxclose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel lineSetting;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JLabel manageCategoryIcon;
    private javax.swing.JLabel manageCategorylbl;
    private javax.swing.JPanel manageEnterprise;
    private javax.swing.JLabel manageMedicineIcon;
    private javax.swing.JLabel manageMedicinelbl;
    private javax.swing.JPanel manageNetwork;
    private javax.swing.JPanel manageNetworkTab;
    private javax.swing.JLabel managePharmacyIcon;
    private javax.swing.JLabel managePharmacylbl;
    private javax.swing.JLabel max;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel menuhide1;
    private javax.swing.JPanel setting;
    private javax.swing.JPanel side1;
    private javax.swing.JPanel side2;
    private javax.swing.JPanel side3;
    private javax.swing.JPanel side4;
    private javax.swing.JLabel statisticsimg;
    private javax.swing.JLabel statisticslbl;
    private javax.swing.JTabbedPane sysAdminTab;
    private UI.Components.MyTextFieldLogin tenantAge;
    private UI.Components.MyTextFieldLogin tenantContact;
    private com.toedter.calendar.JDateChooser tenantDob2;
    private UI.Components.MyTextFieldLogin tenantEmail;
    private UI.Components.MyTextFieldLogin tenantName;
    private javax.swing.JTable tenantsTable;
    private javax.swing.JTable vSEntepriseT;
    private UI.Components.Combobox vSEnterprise;
    private javax.swing.JPanel viewSystem;
    private javax.swing.JPanel viewSystemTab;
    // End of variables declaration//GEN-END:variables
}
