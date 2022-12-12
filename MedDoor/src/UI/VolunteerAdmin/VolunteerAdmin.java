
package UI.VolunteerAdmin;


import Business.Community.Community;
import Business.Community.House;
import Business.Community.HouseList;
import Business.Community.Tenant;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.VolunteerEnterprise;
import Business.Network.Network;
import Business.Organization.HomeCareVolunteerOrganization;
import Business.Organization.Organization;
import Business.Organization.SurveyVolunteerOrganization;
import Business.Role.HomeCareVolunteerRole;
import Business.Role.SurveyVolunteerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HomeCareVolunteerWorkRequest;
import Business.WorkQueue.SurveyVolunteerWorkRequest;
import Business.WorkQueue.WorkRequest;
import UI.Components.TableCustom;
import UI.Login.MainLoginPage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class VolunteerAdmin extends javax.swing.JFrame {

    boolean a = true;
    static boolean maximized = true;
    private JFrame userProcessContainer;
    JFrame parentFrame;
    VolunteerEnterprise vEnterPrise;
    Organization organization;
    UserAccount account;
    Network network;
    Enterprise enterpriseD;
    int xx, xy;
    public VolunteerAdmin(UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,JFrame parentFrame) {
          initComponents();
          vEnterPrise = (VolunteerEnterprise) enterprise;
          this.organization = organization;
          this.parentFrame = parentFrame;
          this.enterpriseD = enterprise;
          this.account = account;
          network = business.getNetworkList().get(0);
          vAdminTab.setSelectedIndex(0);
          vAdminTask.setSelectedIndex(0);
          populateCommunities();
          populateCommunitiesHC();
          populateHouses();
          populateHousesHC();
          populateVolunteerEnterpriseOrganizations();
//          populateSurveyVolunteers();
//          populateHomeCareVolunteers();
    }
    //Method to change panel color on hover
 
    
    public void populateVolunteerEnterpriseOrganizations() {
        vOrganizationsCombo.removeAllItems();
        
        for (Organization org : vEnterPrise.getOrganizationDirectory().getOrganizationList()){
            vOrganizationsCombo.addItem(org);
        }
    }
    
    public void populateSurveyVolunteers() {
        sVolunteerCombo.removeAllItems();
        
        for (Organization org : vEnterPrise.getOrganizationDirectory().getOrganizationList()){
            if (org.getName() == Organization.Type.SurveyVolunteer.getValue()) {
                for(UserAccount account : org.getUserAccountDirectory().getUserAccountList()) {
                    sVolunteerCombo.addItem(account.getEmployee());
                }
            }
        }
      
    }
    
    public void populateHomeCareVolunteers() {
        hClistCombo.removeAllItems();
        
        for (Organization org : vEnterPrise.getOrganizationDirectory().getOrganizationList()){
            if (org.getName() == null ? Organization.Type.HomeCareVolunteer.getValue() == null : org.getName().equals(Organization.Type.HomeCareVolunteer.getValue())) {
                for(UserAccount account : org.getUserAccountDirectory().getUserAccountList()) {
                    hClistCombo.addItem(account.getEmployee());
                }
            }
        }
      
    }
    
    public void populateCommunities() {
        sVCommunity.removeAllItems();
        
        for (Community com : network.getCommunityDirectory().getCommunityList()){
            sVCommunity.addItem(com);
        }
      
    }
    
    public void populateHouses() {
        sVHouse.removeAllItems();
        Community com = (Community) sVCommunity.getSelectedItem();
        if (com != null) {
        for (House house : com.houselist.getHouses()){
            sVHouse.addItem(house);
        }
        }
    }
    
    
    public void populateCommunitiesHC() {
        sVCommCombo.removeAllItems();
        
        for (Community com : network.getCommunityDirectory().getCommunityList()){
            sVCommCombo.addItem(com);
        }
      
    }
    
    public void populateHousesHC() {
        if (sVCommCombo.getSelectedIndex() >= 0) {
        sVHousCombo.removeAllItems();
        Community com = (Community) sVCommCombo.getSelectedItem();
        for (House house : com.houselist.getHouses()){
            sVHousCombo.addItem(house);
        }
        }
      
    }
   
    
   public void populateTenantInfo(House house) {
        try{
           Organization org = null;
             for (Organization orn : vEnterPrise.getOrganizationDirectory().getOrganizationList()){
           if (orn instanceof SurveyVolunteerOrganization){
                org = orn;
                break;
            }
             }
        if (org != null) {
            DefaultTableModel model = (DefaultTableModel) svWorkRTenantTable.getModel();
            model.setRowCount(0);
            for(WorkRequest wq: org.getWorkQueue().getWorkRequestList()) {
            if(wq instanceof SurveyVolunteerWorkRequest)
            {
               
             House hous = ((SurveyVolunteerWorkRequest) wq).getAssignedHouse();
             for(Tenant tenant: hous.getTenats().getTenants()) {
                  
            Object[] row = new Object[7];
            row[0] = tenant.getFirstName();
            
            row[1] = tenant.getAge();
            row[2] = tenant.getGender();
            row[3] = tenant.report.getSicknessType();
            Boolean row5;
                 if (((Boolean)tenant.report.isNeedHospitalization()).booleanValue() == false) {
                 row5 = Boolean.FALSE;
             } else {
                     row5 = Boolean.TRUE;
                 }
            row[4] = row5;
              
            row[5]=    tenant.getReport().getSurveyStatus();
                     row[6]=    tenant.getReport().getHomeCareStatus();
                       model.addRow(row);
          }
            }
        }
        }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "system is down please contact system admin");
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
        addvolunteer = new javax.swing.JPanel();
        side2 = new javax.swing.JPanel();
        managePharmacylbl = new javax.swing.JLabel();
        managePharmacyIcon = new javax.swing.JLabel();
        surveyvolunteer = new javax.swing.JPanel();
        side3 = new javax.swing.JPanel();
        manageCategorylbl = new javax.swing.JLabel();
        manageCategoryIcon = new javax.swing.JLabel();
        vAdminTab = new javax.swing.JTabbedPane();
        addVolunteer = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        vOrganizationsCombo = new UI.Components.Combobox();
        vOrgUN = new UI.Components.MyTextFieldLogin();
        vOrgUName = new UI.Components.MyTextFieldLogin();
        createVolunteer = new UI.Components.Button();
        vOrgPW = new UI.Components.MyPasswordFieldLogin();
        manageTask = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        vAdminTask = new javax.swing.JTabbedPane();
        jPanel23 = new javax.swing.JPanel();
        sVolunteerCombo = new UI.Components.Combobox();
        sVCommunity = new UI.Components.Combobox();
        sVHouse = new UI.Components.Combobox();
        button2 = new UI.Components.Button();
        sVDate2 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaMsg = new javax.swing.JTextArea();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        sVCommCombo = new UI.Components.Combobox();
        sVHousCombo = new UI.Components.Combobox();
        jScrollPane7 = new javax.swing.JScrollPane();
        svWorkRTenantTable = new javax.swing.JTable();
        button1 = new UI.Components.Button();
        hClistCombo = new UI.Components.Combobox();
        button6 = new UI.Components.Button();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaMsghc = new javax.swing.JTextArea();

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

        addvolunteer.setBackground(new java.awt.Color(0, 91, 149));
        addvolunteer.setPreferredSize(new java.awt.Dimension(220, 50));
        addvolunteer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addvolunteerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addvolunteerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addvolunteerMouseExited(evt);
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
        managePharmacylbl.setText("Add Volunteer");

        managePharmacyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managePharmacyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/adaptive_degradation_40px.png"))); // NOI18N

        javax.swing.GroupLayout addvolunteerLayout = new javax.swing.GroupLayout(addvolunteer);
        addvolunteer.setLayout(addvolunteerLayout);
        addvolunteerLayout.setHorizontalGroup(
            addvolunteerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addvolunteerLayout.createSequentialGroup()
                .addComponent(side2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(managePharmacyIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(managePharmacylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        addvolunteerLayout.setVerticalGroup(
            addvolunteerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addvolunteerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managePharmacylbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(managePharmacyIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        surveyvolunteer.setBackground(new java.awt.Color(0, 91, 149));
        surveyvolunteer.setPreferredSize(new java.awt.Dimension(220, 50));
        surveyvolunteer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                surveyvolunteerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                surveyvolunteerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                surveyvolunteerMouseExited(evt);
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
        manageCategorylbl.setText("Survey Volunteer");

        manageCategoryIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageCategoryIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/system_administrator_male_40px.png"))); // NOI18N

        javax.swing.GroupLayout surveyvolunteerLayout = new javax.swing.GroupLayout(surveyvolunteer);
        surveyvolunteer.setLayout(surveyvolunteerLayout);
        surveyvolunteerLayout.setHorizontalGroup(
            surveyvolunteerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(surveyvolunteerLayout.createSequentialGroup()
                .addComponent(side3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageCategoryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageCategorylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        surveyvolunteerLayout.setVerticalGroup(
            surveyvolunteerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, surveyvolunteerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageCategorylbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(manageCategoryIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout menuhide1Layout = new javax.swing.GroupLayout(menuhide1);
        menuhide1.setLayout(menuhide1Layout);
        menuhide1Layout.setHorizontalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addvolunteer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(surveyvolunteer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuhide1Layout.setVerticalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhide1Layout.createSequentialGroup()
                .addComponent(addvolunteer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(surveyvolunteer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 702, Short.MAX_VALUE))
        );

        menuhide.add(menuhide1, java.awt.BorderLayout.CENTER);

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        vAdminTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vAdminTabMouseClicked(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(217, 241, 255));

        vOrganizationsCombo.setLabeText("Organization");
        vOrganizationsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vOrganizationsComboActionPerformed(evt);
            }
        });

        vOrgUN.setLabelText("Username");
        vOrgUN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vOrgUNFocusGained(evt);
            }
        });

        vOrgUName.setLabelText("Name");
        vOrgUName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vOrgUNameFocusGained(evt);
            }
        });
        vOrgUName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vOrgUNameActionPerformed(evt);
            }
        });
        vOrgUName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vOrgUNameKeyTyped(evt);
            }
        });

        createVolunteer.setBackground(new java.awt.Color(0, 91, 149));
        createVolunteer.setForeground(new java.awt.Color(255, 255, 255));
        createVolunteer.setText("Create User");
        createVolunteer.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        createVolunteer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createVolunteerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createVolunteerMouseExited(evt);
            }
        });
        createVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createVolunteerActionPerformed(evt);
            }
        });

        vOrgPW.setLabelText("Password");
        vOrgPW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vOrgPWFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vOrganizationsCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(vOrgPW, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vOrgUN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                            .addComponent(vOrgUName, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(createVolunteer, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(vOrganizationsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(vOrgUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vOrgPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vOrgUName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(createVolunteer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addVolunteerLayout = new javax.swing.GroupLayout(addVolunteer);
        addVolunteer.setLayout(addVolunteerLayout);
        addVolunteerLayout.setHorizontalGroup(
            addVolunteerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addVolunteerLayout.setVerticalGroup(
            addVolunteerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vAdminTab.addTab("Add Volunteer", addVolunteer);

        vAdminTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vAdminTaskMouseClicked(evt);
            }
        });

        jPanel23.setBackground(new java.awt.Color(217, 241, 255));

        sVolunteerCombo.setLabeText("Survey Volunteers");

        sVCommunity.setLabeText("Community");
        sVCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sVCommunityActionPerformed(evt);
            }
        });

        sVHouse.setLabeText("House");

        button2.setBackground(new java.awt.Color(0, 91, 149));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Assign Task");
        button2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        sVDate2.setDateFormatString("MM/dd/yyyy");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setText("Message");

        textAreaMsg.setColumns(20);
        textAreaMsg.setRows(5);
        jScrollPane2.setViewportView(textAreaMsg);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sVHouse, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(sVCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(sVolunteerCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(sVDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2))
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(sVolunteerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sVCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sVHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sVDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        vAdminTask.addTab("Survey Volunteer", jPanel23);

        jPanel25.setBackground(new java.awt.Color(217, 241, 255));

        sVCommCombo.setLabeText("Community");
        sVCommCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sVCommComboActionPerformed(evt);
            }
        });

        sVHousCombo.setLabeText("Houses");
        sVHousCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sVHousComboActionPerformed(evt);
            }
        });

        svWorkRTenantTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "FName", "Age", "Gender", "Sickness", "Need Hospitalization", "Status from survey", "Status from Home Care"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(svWorkRTenantTable);

        button1.setBackground(new java.awt.Color(0, 91, 149));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("View Tenant Report");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        hClistCombo.setLabeText("Home Care Volunteers");

        button6.setBackground(new java.awt.Color(0, 91, 149));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("Assign Home Care");
        button6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setText("Message");

        textAreaMsghc.setColumns(20);
        textAreaMsghc.setRows(5);
        jScrollPane3.setViewportView(textAreaMsghc);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sVHousCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sVCommCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel25Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hClistCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3))))
                        .addGap(0, 250, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(sVCommCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(sVHousCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(hClistCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vAdminTask.addTab("View Tasks", jPanel24);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vAdminTask)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vAdminTask)
        );

        javax.swing.GroupLayout manageTaskLayout = new javax.swing.GroupLayout(manageTask);
        manageTask.setLayout(manageTaskLayout);
        manageTaskLayout.setHorizontalGroup(
            manageTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        manageTaskLayout.setVerticalGroup(
            manageTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        vAdminTab.addTab("Survey", manageTask);

        getContentPane().add(vAdminTab, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseClicked
        if (maximized) {
            VolunteerAdmin.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            VolunteerAdmin.this.setMaximizedBounds(env.getMaximumWindowBounds());
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
           parentFrame.setVisible(true);;
        }
    }//GEN-LAST:event_buttonLogoutMouseClicked

    private void buttonLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogoutMouseEntered
        changecolor(lineSetting, new Color(190,224,236));
    }//GEN-LAST:event_buttonLogoutMouseEntered

    private void buttonLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogoutMouseExited
        changecolor(lineSetting, new Color(4,16,20));
    }//GEN-LAST:event_buttonLogoutMouseExited

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

    private void vAdminTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vAdminTabMouseClicked
        // TODO add your handling code here:
        int index = vAdminTab.getSelectedIndex();
       
         System.out.println("Index---"+ index);
        switch (index) {
            case 0:
                break;
            case 1:
                populateVolunteerEnterpriseOrganizations();
                break;
            case 2:
                 populateSurveyVolunteers();
                 populateHomeCareVolunteers();
                break;
            case 3:
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_vAdminTabMouseClicked

    private void vOrgUNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vOrgUNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vOrgUNameActionPerformed
//boolean hasError(String fieldName) {
//        if (fieldName == "vOrgUN") {
//            String username = vOrgUN.getText();
//            if (username.trim().isEmpty()) {
//                vOrgUN.setHelperText("Please Enter Username");
//                return true;
//            } else if (!fieldValidation.isStringOnlyAlphabet(username)) {
//                
//               vOrgUN.setHelperText("Please Enter Valid Username");
//                return true;
//            } else if (!fieldValidation.isValidLength(username, 5, 30)) {
//               vOrgUN.setHelperText("UserName must be betwen 5 and 30 characters");
//              
//                return true;
//            } else {
//                cEntUsername.setHelperText("");
//                return false;
//            }
//        } 
//        else if (fieldName == "cEntPassword") {
//            String u = cEntPassword.getText();
//            if (u.trim().isEmpty()) {
//                cEntPassword.setHelperText("Please Enter Password");
//                return true;
//            } else if (!fieldValidation.isValidLength(u, 5, 30)) {
//               cEntPassword.setHelperText("Password must be betwen 5 and 30 characters");
//              
//                return true;
//            } else {
//                cEntPassword.setHelperText("");
//                return false;
//            }
//        } 
//        else if (fieldName == "cEntEEname") {
//            String u = cEntEEname.getText();
//            if (u.trim().isEmpty()) {
//                cEntEEname.setHelperText("Please Enter Enterprise Name");
//                return true;
//            } else if (!fieldValidation.isStringOnlyAlphabet(u)) {
//                
//               cEntEEname.setHelperText("Please Enter Valid Enterprise Name");
//                return true;
//            } else {
//                cEntEEname.setHelperText("");
//                return false;
//            }
//        } 
//        return false;
//  }
    private void createVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createVolunteerActionPerformed
         if (vOrgUName.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please enter Employee Fullname");
           
         }
         else  if(vOrgPW.getText().length()>25||vOrgPW.getText().length()<5) {
             JOptionPane.showMessageDialog(null,"Please enter Valid Password");
           
         }
         else if (vOrgPW.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Do not enter an empty password!!!");
             
         } else if(vOrgUN.getText().equals("")) {
             JOptionPane.showMessageDialog(null,"Please enter UserName");
            
         }
         else{
Organization org = (Organization) vOrganizationsCombo.getSelectedItem();
int index = vOrganizationsCombo.getSelectedIndex();
        String username = vOrgUN.getText();
        char[] passwordCharArray = vOrgPW.getPassword();
        
        String password = String.valueOf(passwordCharArray);
        String name = vOrgUName.getText();

         Organization o=vEnterPrise.getOrganizationDirectory().getOrganizationList().get(index);
          if (EcoSystem.isUserUnique(username)) {
          
         Employee employee = o.getEmployeeDirectory().createEmployee(name);
         if(o.getName() == Organization.Type.HomeCareVolunteer.getValue()){
           
             
             o.getUserAccountDirectory().createUserAccount(username, password, employee, new HomeCareVolunteerRole());
         JOptionPane.showMessageDialog(this, " HC Volunteer Added Successfully!");
         populateHomeCareVolunteers();
         }  
         else{
              o.getUserAccountDirectory().createUserAccount(username, password, employee, new SurveyVolunteerRole());
        JOptionPane.showMessageDialog(this, " SC Volunteer Added Successfully!");
        populateSurveyVolunteers();
         } 
         
         
         vOrgUName.setText(null);
          vOrgPW.setText(null);
           vOrgUN.setText(null);
         
          
          }
          else{
              
               JOptionPane.showMessageDialog(this, "Give a unique username!");
          }
       }
         
        
    }//GEN-LAST:event_createVolunteerActionPerformed

    private void vAdminTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vAdminTaskMouseClicked
        // TODO add your handling code here:
        int index = vAdminTask.getSelectedIndex();
       
        System.out.print("index==" + index);
        switch (index) {
            case 0:
                System.out.println("inside case");
                populateSurveyVolunteers();
               populateCommunities();
                populateHomeCareVolunteers();
                break;
            case 1:
               // populateVolunteerEnterpriseOrganizations();
                populateSurveyVolunteers();
               populateCommunities();
               populateHomeCareVolunteers();
                break;
           
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_vAdminTaskMouseClicked
    
    public UserAccount getUser(String empId, Organization org) {

        for(UserAccount user: org.getUserAccountDirectory().getUserAccountList()) {
            if(user.getEmployee().getId() == empId) {
                return user;
            }
        }
        return null ;
    }
    
    
    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        //getting survey volunteer organization
        Organization org = null;
        for (Organization orn : vEnterPrise.getOrganizationDirectory().getOrganizationList())
        {   if (orn instanceof SurveyVolunteerOrganization){
            org = orn;
            break;
        }
        }
           String message = textAreaMsg.getText();

                if (message.equals("") || message.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter something to send.");
                    return;
                }
        SurveyVolunteerWorkRequest sV = new SurveyVolunteerWorkRequest();
        sV.setAssignedHouse((House)sVHouse.getSelectedItem());
        //            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
       
        Date date = sVDate2.getDate();
        sV.setAssignedDate(date);
        sV.setStatus("new");
        sV.setMessage(message);
        System.out.println("Sv detaisls -- " + sV.getAssignedHouse() + sV.getAssignedDate()) ;
        Employee emp = (Employee)sVolunteerCombo.getSelectedItem();
        sV.setReceiver(getUser(emp.getId(), org));
        sV.setSender(account);
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(sV);
            account.getWorkQueue().getWorkRequestList().add(sV);
            
            JOptionPane.showMessageDialog(this, "Work request created successfully!");
            
        }
        
        
    }//GEN-LAST:event_button2ActionPerformed

    private void sVCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sVCommunityActionPerformed
        // TODO add your handling code here:
        populateHouses();
    }//GEN-LAST:event_sVCommunityActionPerformed
public void changecolorB(JButton hover, Color rand) {
        hover.setBackground(rand);
    }
    private void createVolunteerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createVolunteerMouseEntered
        changecolorB(createVolunteer, new Color(3,138,255));
    }//GEN-LAST:event_createVolunteerMouseEntered

    private void createVolunteerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createVolunteerMouseExited
         changecolorB(createVolunteer, new Color(0,91,149));
    }//GEN-LAST:event_createVolunteerMouseExited

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        Community selectedCommunity = (Community) sVCommCombo.getSelectedItem();
        if (selectedCommunity != null) {
            House selectedHouse = (House) sVHousCombo.getSelectedItem();
            if (selectedHouse != null) {
                 populateTenantInfo(selectedHouse);
            } else {
                 JOptionPane.showMessageDialog(this, "Please select a community and house view");
                 return;
            }
            
           
        } else {
             JOptionPane.showMessageDialog(this, "Please select a community and house view");
              return;
        }
        
    }//GEN-LAST:event_button1ActionPerformed

    private void sVCommComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sVCommComboActionPerformed
        // TODO add your handling code here:
       if (sVCommCombo.getSelectedIndex() >= 0) {
           populateHousesHC();
       }
    }//GEN-LAST:event_sVCommComboActionPerformed

    private void sVHousComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sVHousComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sVHousComboActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        try{
            HomeCareVolunteerWorkRequest sV = new HomeCareVolunteerWorkRequest();
            int selectedRow = svWorkRTenantTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row!!");
            
            return;
        }
         String message = textAreaMsghc.getText();

                if (message.equals("") || message.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter something to send.");
                    return;
                }

       Organization org = null;
       for (Organization orn : vEnterPrise.getOrganizationDirectory().getOrganizationList())
        {   
            if (orn instanceof HomeCareVolunteerOrganization){
                org = orn;
                break;
            }
        }
       
       
       
        Organization orgSV = null;
             for (Organization orn : vEnterPrise.getOrganizationDirectory().getOrganizationList()){
           if (orn instanceof SurveyVolunteerOrganization){
                orgSV = orn;
                break;
            }
             }
        if (orgSV != null) {
           
           
        Tenant tenat = ((SurveyVolunteerWorkRequest)(orgSV.getWorkQueue().getWorkRequestList().
              get(selectedRow))).getTenant();
        sV.setPatient(tenat);
            DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
         
            sV.setRequestDate(new Date());
            sV.setStatus("New");
            Employee emp = (Employee)hClistCombo.getSelectedItem();
            sV.setReceiver(getUser(emp.getId(),org));
            sV.setSender(account);
            sV.setMessage(message);
            

        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(sV);
            account.getWorkQueue().getWorkRequestList().add(sV);
             JOptionPane.showMessageDialog(this, "Work Request created successfully");
        }
        }
            
        } catch (Exception e) {e.printStackTrace();}
        
    }//GEN-LAST:event_button6ActionPerformed

    private void vOrganizationsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vOrganizationsComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vOrganizationsComboActionPerformed

    private void addvolunteerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addvolunteerMouseClicked
        vAdminTab.setSelectedIndex(0);
        changecolor(addvolunteer, new Color(3,138,255));
        changecolor(side2, new Color(190, 224, 236));
    }//GEN-LAST:event_addvolunteerMouseClicked

    private void addvolunteerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addvolunteerMouseEntered
        changecolor(addvolunteer, new Color(3,138,255));
        changecolor(side2, new Color(190, 224, 236));
    }//GEN-LAST:event_addvolunteerMouseEntered

    private void addvolunteerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addvolunteerMouseExited
        changecolor(addvolunteer, new Color(0,91,149));
        changecolor(side2, new Color(0,91,149));
    }//GEN-LAST:event_addvolunteerMouseExited

    private void surveyvolunteerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_surveyvolunteerMouseClicked
        vAdminTab.setSelectedIndex(1);
        changecolor(surveyvolunteer, new Color(3,138,255));
        changecolor(side3, new Color(190, 224, 236));

    }//GEN-LAST:event_surveyvolunteerMouseClicked

    private void surveyvolunteerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_surveyvolunteerMouseEntered
        changecolor(surveyvolunteer, new Color(3,138,255));
        changecolor(side3, new Color(190, 224, 236));
    }//GEN-LAST:event_surveyvolunteerMouseEntered

    private void surveyvolunteerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_surveyvolunteerMouseExited
        changecolor(surveyvolunteer, new Color(0,91,149));
        changecolor(side3, new Color(0,91,149));
    }//GEN-LAST:event_surveyvolunteerMouseExited

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_headerMouseDragged

    private void vOrgUNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vOrgUNameKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            vOrgUName.setEditable(true);
        } else {
            vOrgUName.setEditable(false);
        }
    }//GEN-LAST:event_vOrgUNameKeyTyped

    private void vOrgUNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vOrgUNFocusGained
        vOrgUN.setHelperText(null);
    }//GEN-LAST:event_vOrgUNFocusGained

    private void vOrgPWFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vOrgPWFocusGained
        vOrgPW.setHelperText(null);
    }//GEN-LAST:event_vOrgPWFocusGained

    private void vOrgUNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vOrgUNameFocusGained
       vOrgUName.setHelperText(null);
    }//GEN-LAST:event_vOrgUNameFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JPanel addVolunteer;
    private javax.swing.JPanel addvolunteer;
    private UI.Components.Button button1;
    private UI.Components.Button button2;
    private UI.Components.Button button6;
    private javax.swing.JPanel buttonClose;
    private javax.swing.JLabel buttonLogout;
    private javax.swing.JPanel buttonMax;
    private javax.swing.JLabel buttonhidemenu;
    private javax.swing.JLabel close;
    private UI.Components.Button createVolunteer;
    private UI.Components.Combobox hClistCombo;
    private javax.swing.JPanel header;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JPanel iconmaxclose;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel lineSetting;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JLabel manageCategoryIcon;
    private javax.swing.JLabel manageCategorylbl;
    private javax.swing.JLabel managePharmacyIcon;
    private javax.swing.JLabel managePharmacylbl;
    private javax.swing.JPanel manageTask;
    private javax.swing.JLabel max;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel menuhide1;
    private UI.Components.Combobox sVCommCombo;
    private UI.Components.Combobox sVCommunity;
    private com.toedter.calendar.JDateChooser sVDate2;
    private UI.Components.Combobox sVHousCombo;
    private UI.Components.Combobox sVHouse;
    private UI.Components.Combobox sVolunteerCombo;
    private javax.swing.JPanel setting;
    private javax.swing.JPanel side2;
    private javax.swing.JPanel side3;
    private javax.swing.JPanel surveyvolunteer;
    private javax.swing.JTable svWorkRTenantTable;
    private javax.swing.JTextArea textAreaMsg;
    private javax.swing.JTextArea textAreaMsghc;
    private javax.swing.JTabbedPane vAdminTab;
    private javax.swing.JTabbedPane vAdminTask;
    private UI.Components.MyPasswordFieldLogin vOrgPW;
    private UI.Components.MyTextFieldLogin vOrgUN;
    private UI.Components.MyTextFieldLogin vOrgUName;
    private UI.Components.Combobox vOrganizationsCombo;
    // End of variables declaration//GEN-END:variables
}
