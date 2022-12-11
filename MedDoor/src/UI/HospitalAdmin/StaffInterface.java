package UI.HospitalAdmin;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.HospitalStaffOrganization;
import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalWorkRequest;
import Business.WorkQueue.StaffWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import UI.Components.TableCustom;
import UI.Login.MainLoginPage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.text.MessageFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class StaffInterface extends javax.swing.JFrame {

    boolean a = true;
    static boolean maximized = true;
    private JFrame userProcessContainer;
    JFrame parentFrame;
    HospitalEnterprise hEnterPrise;
    Organization organization;
    UserAccount account;
    Network network;
    Organization docOrg;
    Organization staffOrg;

    public StaffInterface(UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business, JFrame parentFrame) {
        initComponents();
//        TableCustom.apply(jScrollPane2, TableCustom.TableType.DEFAULT);
        TableCustom.apply(patientList, TableCustom.TableType.DEFAULT);
         TableCustom.apply(patientProfileSP, TableCustom.TableType.DEFAULT);
        TableCustom.apply(labSP, TableCustom.TableType.DEFAULT);
        TableCustom.apply(pharmacySP, TableCustom.TableType.DEFAULT);
        hEnterPrise = (HospitalEnterprise) enterprise;
        this.organization = organization;
        this.parentFrame = parentFrame;
        this.account = account;
        network = business.getNetworkList().get(0);
        hospitalAdmin.setSelectedIndex(0);
        initializeOrganizations();
        populateRequestTable();
    }

    public void initializeOrganizations() {
        for (Organization org : hEnterPrise.getOrganizationDirectory().getOrganizationList()) {
            System.out.println("org-------" + org);
            if (org.getName() == Organization.Type.Doctor.getValue()) {
                docOrg = org;
                System.out.println("doctor organi" + docOrg);
            }
            if (org.getName() == Organization.Type.HospitalStaff.getValue()) {
                staffOrg = org;
                System.out.println("staff org " + staffOrg);
            }
        }
    }
    
    public void populateRequestTable(){
        try{
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();

        model.setRowCount(0);
        if(hEnterPrise.getWorkQueue()==null)
        {
            hEnterPrise.setWorkQueue(new WorkQueue());
        }
        for (WorkRequest request : staffOrg.getWorkQueue().getWorkRequestList()) {
            if(request instanceof StaffWorkRequest){
                 Object[] row = new Object[4];
                    row[0] = ((HospitalWorkRequest) request).getPatient();
            row[1] = ((HospitalWorkRequest) request).getPatient().getPatientName();
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            model.addRow(row);
        }
        }
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }        
    }
    //Method to change panel color on hover

//    public HospitalAdmin(UserAccount account, 
//            Organization organization, 
//            Enterprise enterprise, 
//            EcoSystem business,JFrame parentFrame) {
//        initComponents();
//          this.parentFrame = parentFrame;
////        this.userProcessContainer=userProcessContainer;
//    }

    public void populateDoctor() {
doctorCombo.removeAllItems();
        if (docOrg.getUserAccountDirectory().getUserAccountList().size() > 0) {

            for (UserAccount account : docOrg.getUserAccountDirectory().getUserAccountList()) {
                System.out.println("line 145" + account.getEmployee());
                doctorCombo.addItem(account.getEmployee());
            }
        }
    }



    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }

    //Method to change Background color of the panel 
    public void clickmenu(JPanel h1, JPanel h2, int numberbool) {
        if (numberbool == 1) {
            h1.setBackground(new Color(42, 58, 73));
            h2.setBackground(new Color(4, 16, 20));

        } else {
            h1.setBackground(new Color(4, 16, 20));
            h2.setBackground(new Color(42, 58, 73));
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

    public void changecolorB(JButton hover, Color rand) {
        hover.setBackground(rand);
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
        hospitalAdmin = new javax.swing.JTabbedPane();
        dashboard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        updatePatient = new UI.Components.Button();
        doctorCombo = new UI.Components.Combobox();
        patientList = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        combobox3 = new UI.Components.Combobox();
        patientTab = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pharmacySP = new javax.swing.JScrollPane();
        pharmacyTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        combobox2 = new UI.Components.Combobox();
        patientProfileSP = new javax.swing.JScrollPane();
        patientProfile = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labSP = new javax.swing.JScrollPane();
        labTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchPatient = new javax.swing.JTextField();
        updatePatientBtn = new UI.Components.Button();

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
        statisticslbl.setText("Dashboard");

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
        managePharmacylbl.setText("Manage Patients");

        managePharmacyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managePharmacyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/health_checkup_40px.png"))); // NOI18N

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

        javax.swing.GroupLayout menuhide1Layout = new javax.swing.GroupLayout(menuhide1);
        menuhide1.setLayout(menuhide1Layout);
        menuhide1Layout.setHorizontalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pharmacyStaistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(managePharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuhide1Layout.setVerticalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhide1Layout.createSequentialGroup()
                .addComponent(pharmacyStaistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(managePharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(925, 925, 925))
        );

        menuhide.add(menuhide1, java.awt.BorderLayout.CENTER);

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        hospitalAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hospitalAdminMouseClicked(evt);
            }
        });

        dashboard.setBackground(new java.awt.Color(217, 241, 255));
        dashboard.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(217, 241, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setText("Assign A Doctor");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("Patient List");

        updatePatient.setBackground(new java.awt.Color(0, 91, 149));
        updatePatient.setBorder(null);
        updatePatient.setForeground(new java.awt.Color(255, 255, 255));
        updatePatient.setText("Send Request");
        updatePatient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatePatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatePatientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatePatientMouseExited(evt);
            }
        });
        updatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePatientActionPerformed(evt);
            }
        });

        doctorCombo.setLabeText("Select Doctor\n");
        doctorCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorComboActionPerformed(evt);
            }
        });

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Volunteer(Sender)", "Receiver", "Height", "Weight", "Pulse", "Blood Pressure", "Status"
            }
        ));
        patientList.setViewportView(patientTable);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel13.setText("Perform Action");

        combobox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Status", "Pending", "Send Sample To Lab", "Report Sent By Lab", "Assign Doctor", "Send Report To Doctor", "Prescription Added", "Send Prescription", " " }));
        combobox3.setSelectedIndex(-1);
        combobox3.setLabeText("Select Status");
        combobox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(patientList, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combobox3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doctorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientList, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(updatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
        );

        dashboard.add(jPanel1, java.awt.BorderLayout.CENTER);

        hospitalAdmin.addTab("Dashboard", dashboard);

        patientTab.setBackground(new java.awt.Color(217, 241, 255));
        patientTab.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(217, 241, 255));

        pharmacyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Pharmacy ID", "Pharmacy Name", "Community"
            }
        ));
        pharmacySP.setViewportView(pharmacyTable);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setText("Associated Pharmacy Details");

        combobox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Status", "Send Sample To Lab", "Report Sent By Lab", "Send Report To Doctor", "Prescription Added", "Send Prescription", " " }));
        combobox2.setSelectedIndex(-1);
        combobox2.setLabeText("Select Status");
        combobox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox2ActionPerformed(evt);
            }
        });

        patientProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Gender", "Community", "Assigned Doctor", "Assigned Staff", " Volunteer", "Lab Tests", "Lab Records", "Status"
            }
        ));
        patientProfileSP.setViewportView(patientProfile);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setText("Patient Profile");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("Associated Lab Details");

        labTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null}
            },
            new String [] {
                "Lab ID", "Lab Name", "Community"
            }
        ));
        labSP.setViewportView(labTable);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setText("Perform Action");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/search_30px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(searchPatient)
        );

        updatePatientBtn.setBackground(new java.awt.Color(0, 91, 149));
        updatePatientBtn.setForeground(new java.awt.Color(255, 255, 255));
        updatePatientBtn.setText("Update Patient Record");
        updatePatientBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatePatientBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatePatientBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatePatientBtnMouseExited(evt);
            }
        });
        updatePatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePatientBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGap(770, 770, 770))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(388, 388, 388))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(patientProfileSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                                .addComponent(labSP, javax.swing.GroupLayout.Alignment.LEADING))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(pharmacySP, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(updatePatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(patientProfileSP, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(labSP, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(pharmacySP, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(updatePatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        patientTab.add(jPanel2, java.awt.BorderLayout.CENTER);

        hospitalAdmin.addTab("Patient", patientTab);

        getContentPane().add(hospitalAdmin, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseClicked
        if (maximized) {
            StaffInterface.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            StaffInterface.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        } else {
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }
    }//GEN-LAST:event_maxMouseClicked

    private void maxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseEntered
        changecolor(buttonMax, new Color(3, 138, 255));
    }//GEN-LAST:event_maxMouseEntered

    private void maxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseExited
        changecolor(buttonMax, new Color(27, 152, 245));
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
        changecolor(linehidemenu, new Color(190, 224, 236));

    }//GEN-LAST:event_buttonhidemenuMouseEntered

    private void buttonhidemenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseExited
        changecolor(linehidemenu, new Color(4, 16, 20));
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
        changecolor(lineSetting, new Color(190, 224, 236));
    }//GEN-LAST:event_buttonLogoutMouseEntered

    private void buttonLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogoutMouseExited
        changecolor(lineSetting, new Color(4, 16, 20));
    }//GEN-LAST:event_buttonLogoutMouseExited

    private void pharmacyStaisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacyStaisticsMouseClicked
        hospitalAdmin.setSelectedIndex(0);
        changecolor(pharmacyStaistics, new Color(3, 138, 255));
        changecolor(side1, new Color(190, 224, 236));
    }//GEN-LAST:event_pharmacyStaisticsMouseClicked

    private void pharmacyStaisticsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacyStaisticsMouseEntered
        changecolor(pharmacyStaistics, new Color(3, 138, 255));
        changecolor(side1, new Color(190, 224, 236));
    }//GEN-LAST:event_pharmacyStaisticsMouseEntered

    private void pharmacyStaisticsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacyStaisticsMouseExited
        changecolor(pharmacyStaistics, new Color(0, 91, 149));
        changecolor(side1, new Color(0, 91, 149));
    }//GEN-LAST:event_pharmacyStaisticsMouseExited

    private void managePharmacyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePharmacyMouseClicked
        hospitalAdmin.setSelectedIndex(1);
        changecolor(managePharmacy, new Color(3, 138, 255));
        changecolor(side2, new Color(190, 224, 236));
    }//GEN-LAST:event_managePharmacyMouseClicked

    private void managePharmacyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePharmacyMouseEntered
        changecolor(managePharmacy, new Color(3, 138, 255));
        changecolor(side2, new Color(190, 224, 236));
    }//GEN-LAST:event_managePharmacyMouseEntered

    private void managePharmacyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePharmacyMouseExited
        changecolor(managePharmacy, new Color(0, 91, 149));
        changecolor(side2, new Color(0, 91, 149));
    }//GEN-LAST:event_managePharmacyMouseExited

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        changecolor(buttonClose, new Color(27, 152, 245));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        changecolor(buttonClose, new Color(3, 138, 255));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.setVisible(false);
        parentFrame.setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

    private void combobox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox2ActionPerformed

    private void updatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePatientActionPerformed
        JOptionPane.showMessageDialog(this, "Please Details Updated ");

    }//GEN-LAST:event_updatePatientActionPerformed

    private void updatePatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePatientMouseEntered
        changecolorB(updatePatient, new Color(3, 138, 255));
    }//GEN-LAST:event_updatePatientMouseEntered

    private void updatePatientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePatientMouseExited
        changecolorB(updatePatient, new Color(0, 91, 149));
    }//GEN-LAST:event_updatePatientMouseExited

    private void updatePatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePatientBtnActionPerformed
        JOptionPane.showMessageDialog(this, "Patient Details Updated");
    }//GEN-LAST:event_updatePatientBtnActionPerformed

    private void updatePatientBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePatientBtnMouseEntered
        changecolorB(updatePatientBtn, new Color(3, 138, 255));
    }//GEN-LAST:event_updatePatientBtnMouseEntered

    private void updatePatientBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePatientBtnMouseExited
        changecolorB(updatePatientBtn, new Color(0, 91, 149));
    }//GEN-LAST:event_updatePatientBtnMouseExited
    private void clearDoctor() {
//        doctorID.setText("");
//        txtDoctorName.setText("");
//        txtDoctorUsername.setText("");
//        txtDoctorPassword.setText("");
//        doctorSalary.setText("");
//        doctorExperience.setText("");
    }    private void clearStaff() {
//        staffID.setText("");
//        staffName.setText("");
//        staffUsername.setText("");
//        staffPassword.setText("");
//        staffSalary.setText("");

    }
    private void hospitalAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospitalAdminMouseClicked
        // TODO add your handling code here:
        int index = hospitalAdmin.getSelectedIndex();

        System.out.print(index);
        switch (index) {
            case 0:
                populateDoctor();
                
                break;
            case 1:
                populateDoctor();
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_hospitalAdminMouseClicked

    private void doctorComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorComboActionPerformed

    private void combobox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HospitalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HospitalAdmin().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JPanel buttonClose;
    private javax.swing.JLabel buttonLogout;
    private javax.swing.JPanel buttonMax;
    private javax.swing.JLabel buttonhidemenu;
    private javax.swing.JLabel close;
    private UI.Components.Combobox combobox2;
    private UI.Components.Combobox combobox3;
    private javax.swing.JPanel dashboard;
    private UI.Components.Combobox doctorCombo;
    private javax.swing.JPanel header;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JTabbedPane hospitalAdmin;
    private javax.swing.JPanel iconmaxclose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane labSP;
    private javax.swing.JTable labTable;
    private javax.swing.JPanel lineSetting;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel managePharmacy;
    private javax.swing.JLabel managePharmacyIcon;
    private javax.swing.JLabel managePharmacylbl;
    private javax.swing.JLabel max;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel menuhide1;
    private javax.swing.JScrollPane patientList;
    private javax.swing.JTable patientProfile;
    private javax.swing.JScrollPane patientProfileSP;
    private javax.swing.JPanel patientTab;
    private javax.swing.JTable patientTable;
    private javax.swing.JScrollPane pharmacySP;
    private javax.swing.JPanel pharmacyStaistics;
    private javax.swing.JTable pharmacyTable;
    private javax.swing.JTextField searchPatient;
    private javax.swing.JPanel setting;
    private javax.swing.JPanel side1;
    private javax.swing.JPanel side2;
    private javax.swing.JLabel statisticsimg;
    private javax.swing.JLabel statisticslbl;
    private UI.Components.Button updatePatient;
    private UI.Components.Button updatePatientBtn;
    // End of variables declaration//GEN-END:variables
}
