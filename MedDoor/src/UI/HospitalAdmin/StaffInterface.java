package UI.HospitalAdmin;

import Business.Community.Tenant;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.DiagnosticsEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.VolunteerEnterprise;
import Business.MailNew;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.HomeCareVolunteerOrganization;
import Business.Organization.HospitalStaffOrganization;
import Business.Organization.LabServiceOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Organization.SurveyVolunteerOrganization;
import Business.Role.DoctorRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorWorkRequest;
import Business.WorkQueue.HomeCareVolunteerWorkRequest;
import Business.WorkQueue.HospitalWorkRequest;
import Business.WorkQueue.LabWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.StaffWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import UI.Components.TableCustom;
import UI.Login.MainLoginPage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
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
    int xx, xy;
    ArrayList<Tenant> tenantList;

    public StaffInterface(UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business, JFrame parentFrame) {
        initComponents();
//        TableCustom.apply(jScrollPane2, TableCustom.TableType.DEFAULT);
//        TableCustom.apply(patientList, TableCustom.TableType.DEFAULT);
        hEnterPrise = (HospitalEnterprise) enterprise;
        this.organization = (HospitalStaffOrganization) organization;
        this.parentFrame = parentFrame;
        this.account = account;
        network = business.getNetworkList().get(0);
        hospitalAdmin.setSelectedIndex(0);
        populateRequestTable();
        populateDoctor();
        tenantList = new ArrayList<Tenant>();
    }

    public void populateRequestTable() {

        try {
            DefaultTableModel model = (DefaultTableModel) patientTable.getModel();

            model.setRowCount(0);

            for (WorkRequest wq : organization.getWorkQueue().getWorkRequestList()) {
                System.out.println("wq--" + wq.getMessage());
                if (wq instanceof StaffWorkRequest) {
                    System.out.println("wq--" + wq.getMessage());
                    Tenant tenant = ((StaffWorkRequest) wq).getPatient();
                    //  tenantList.add(tenant);
                    Object[] row = new Object[8];
                    row[0] = tenant.getFirstName();
                    row[1] = ((StaffWorkRequest) wq).getSender().getEmployee().getName();

                    if (((StaffWorkRequest) wq).getDoctorAssigned() == null) {
                        row[5] = "Pending";
                    } else {
                        row[5] = ((StaffWorkRequest) wq).getDoctorAssigned();
                    }
                    row[4] = ((StaffWorkRequest) wq).getLabStatus();
                    // row[5] = ((StaffWorkRequest) wq).getLabReport();
                    row[6] = ((StaffWorkRequest) wq).getPrescription();
                    row[3] = ((StaffWorkRequest) wq).getStatus();
                    row[2] = ((StaffWorkRequest) wq).getMessage();
                    row[7] = ((StaffWorkRequest) wq).getMedicinesPrice();
                    model.addRow(row);
                }

            }
        } catch (Exception e) {
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
        try {
            for (Organization org : hEnterPrise.getOrganizationDirectory().getOrganizationList()) {
                if (org.getName() == Organization.Type.Doctor.getValue()) {
                    for (UserAccount account : org.getUserAccountDirectory().getUserAccountList()) {
                        doctorCombo.addItem(account.getEmployee());
                    }

                }
            }
        } catch (Exception e) {
            System.out.println("Error- " + e);
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
        hospitalAdmin = new javax.swing.JTabbedPane();
        dashboard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sendRequest = new UI.Components.Button();
        doctorCombo = new UI.Components.Combobox();
        jLabel13 = new javax.swing.JLabel();
        statusComboBox = new UI.Components.Combobox();
        patientList = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaMsg = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        labCombo = new UI.Components.Combobox();
        jLabel8 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        sendRequest1 = new UI.Components.Button();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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
        statisticslbl.setText("Staff Dashboard");

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

        javax.swing.GroupLayout menuhide1Layout = new javax.swing.GroupLayout(menuhide1);
        menuhide1.setLayout(menuhide1Layout);
        menuhide1Layout.setHorizontalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pharmacyStaistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuhide1Layout.setVerticalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhide1Layout.createSequentialGroup()
                .addComponent(pharmacyStaistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(987, 987, 987))
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

        sendRequest.setBackground(new java.awt.Color(0, 91, 149));
        sendRequest.setBorder(null);
        sendRequest.setForeground(new java.awt.Color(255, 255, 255));
        sendRequest.setText("Send Request");
        sendRequest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sendRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sendRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sendRequestMouseExited(evt);
            }
        });
        sendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestActionPerformed(evt);
            }
        });

        doctorCombo.setLabeText("Select Doctor\n");
        doctorCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorComboActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel13.setText("Perform Action");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Status", "Pending", "Send Sample To Lab", "Report Sent By Lab", "Assign Doctor", "Send Report To Doctor", "Prescription Added", "Send Prescription To Pharmacy", "Send Charges To Volunteer", " " }));
        statusComboBox.setSelectedIndex(-1);
        statusComboBox.setLabeText("Select Status");
        statusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboBoxActionPerformed(evt);
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
                "Patient Name", "Sender", "Message", "Status", "Lab", "Doctor Assigned", "Prescription", "Phamacy Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientList.setViewportView(patientTable);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setText("Total Amount:");

        textAreaMsg.setColumns(20);
        textAreaMsg.setRows(5);
        jScrollPane2.setViewportView(textAreaMsg);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel14.setText("Lab Test");

        labCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Full Body Test", "Complete Blood Count (CBC)", "Blood Enzyme Test" }));
        labCombo.setSelectedIndex(-1);
        labCombo.setLabeText("Select Lab Test ");
        labCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labComboActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setText("Message");

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });

        sendRequest1.setBackground(new java.awt.Color(0, 91, 149));
        sendRequest1.setBorder(null);
        sendRequest1.setForeground(new java.awt.Color(255, 255, 255));
        sendRequest1.setText("Generate Total Amount");
        sendRequest1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sendRequest1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sendRequest1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sendRequest1MouseExited(evt);
            }
        });
        sendRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequest1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setText("Hospital Charges");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(sendRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sendRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientList, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientList, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(doctorCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(sendRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dashboard.add(jPanel1, java.awt.BorderLayout.CENTER);

        hospitalAdmin.addTab("Dashboard", dashboard);

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

    private void sendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestActionPerformed

        // TODO add your handling code here:
        int selectedrow = patientTable.getSelectedRow();
        if (selectedrow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        String message = textAreaMsg.getText();

        if (message.equals("") || message.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter something to send.");
            return;
        }
        int selectedStatusIndex = statusComboBox.getSelectedIndex();
        if (selectedStatusIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select the action to be performed.");
            return;
        }

        String selectedValue = statusComboBox.getSelectedItem().toString();
        System.out.println("onclick" + selectedValue);
        switch (selectedValue) {

            case "Send Sample To Lab":
 try {

                if (labCombo.getSelectedIndex() < 0) {

                    JOptionPane.showMessageDialog(null, "Select Lab Test.");
                    return;
                }

                LabWorkRequest docRequest = new LabWorkRequest();
                Tenant tenat = ((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().
                        get(selectedrow))).getPatient();

                docRequest.setPatient(tenat);
                docRequest.setMessage(message);
                docRequest.setSender(account);
                docRequest.setStatus("Sent to Lab");
                docRequest.setCreatinine("No data");
                docRequest.setSugar("No Record");
                docRequest.setLabTest(String.valueOf(labCombo.getSelectedItem()));

                Organization org = null;

                for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {

                    if (enter instanceof DiagnosticsEnterprise) {
                        for (Organization orn : enter.getOrganizationDirectory().getOrganizationList()) {
                            if (orn instanceof LabServiceOrganization) {
                                org = orn;
                                break;
                            }
                        }
                    }
                }

                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(docRequest);
                    account.getWorkQueue().getWorkRequestList().add(docRequest);
                    organization.getWorkQueue().getWorkRequestList().get(selectedrow).setStatus("Sent to Lab");
                    ((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().get(selectedrow))).setLabStatus("Pending");
                    hEnterPrise.getWorkQueue().getWorkRequestList().get(selectedrow).setStatus("Sent to Lab");
                    hEnterPrise.getWorkQueue().getWorkRequestList().get(selectedrow).setMessage("Patient is treated");
                    JOptionPane.showMessageDialog(this, "Work request created successfully!");
                    populateRequestTable();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please check the details ");
                return;
            }

            break;
            case "Send Prescription To Pharmacy":
 try {


                PharmacyWorkRequest docRequest = new PharmacyWorkRequest();
                System.out.println("staff" + ((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().
                        get(selectedrow))).getPrescriptionObj());
                //   int amounts=Integer.parseInt(medicinePrice);
                docRequest.setPrescriptionObj(((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().
                        get(selectedrow))).getPrescriptionObj());
                docRequest.setMessage(message);
                docRequest.setPatientName(((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().
                        get(selectedrow))).getPatient().getFirstName());
                docRequest.setSender(account);
                docRequest.setStatus("Sent to Pharmacy");

                //     docRequest.setMedicinesPrice(amounts);
                Organization org = null;

                for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {

                    if (enter instanceof DiagnosticsEnterprise) {
                        for (Organization orn : enter.getOrganizationDirectory().getOrganizationList()) {
                            if (orn instanceof PharmacyOrganization) {
                                org = orn;
                                break;
                            }
                        }
                    }
                }

                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(docRequest);
                    account.getWorkQueue().getWorkRequestList().add(docRequest);
                    organization.getWorkQueue().getWorkRequestList().get(selectedrow).setStatus("Sent to Pharmacy");

                    hEnterPrise.getWorkQueue().getWorkRequestList().get(selectedrow).setStatus("Sent to Pharmacy");
                    JOptionPane.showMessageDialog(this, "Work request created successfully!");
                    populateRequestTable();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please check the details ");
                return;
            }

            break;

            case "Send Charges To Volunteer":
                   try {


                String medicinePrice = jLabel10.getText();
                if (medicinePrice == "" || medicinePrice == "0") {
                    JOptionPane.showMessageDialog(null, "Enter the total amount!!");
                    return;
                }
                if (amount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the hospital amount!!");
            return;
        }
                int amounts = Integer.parseInt(medicinePrice);

                ((HospitalWorkRequest) hEnterPrise.getWorkQueue().getWorkRequestList().get(selectedrow)).setMedicinesPrice(amounts);
                hEnterPrise.getWorkQueue().getWorkRequestList().get(selectedrow).setStatus("Sent Charges to Home Care Volunteer");
                hEnterPrise.getWorkQueue().getWorkRequestList().get(selectedrow).setMessage("Sent Charges to Home Care Volunteer");
                 ((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().get(selectedrow))).setStatus("Sent Charges to Home Care Volunteer");
                    ((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().get(selectedrow))).setMedicinesPrice(amounts);
                JOptionPane.showMessageDialog(this, "Work request completed successfully and mail has been sent!");
                try {
                    MailNew m = new MailNew("rahulgr3001@gmail.com", "MedDoor:Hospital Charges ", "Doctor has been assigned and Bill has been generated for patient");
                } catch (MessagingException ex) {
                    Logger.getLogger(MainLoginPage.class.getName()).log(Level.SEVERE, null, ex);
                }
                populateRequestTable();
//                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please check the details ");
                return;
            }

            break;

            case "Assign Doctor":
                 try {

               
                if (doctorCombo.getSelectedIndex() < 0) {

                    JOptionPane.showMessageDialog(null, "Assign Doctor first.");
                    return;
                }

                DoctorWorkRequest docRequest = new DoctorWorkRequest();

                Tenant tenat = ((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().
                        get(selectedrow))).getPatient();

                docRequest.setPatient(tenat);
                docRequest.setMessage(message);
                docRequest.setStatus("Doctor Assigned");
                docRequest.setSender(account);
                docRequest.setCreatinine(((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().
                        get(selectedrow))).getCreatinine());
                 docRequest.setSugar(((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().
                        get(selectedrow))).getSugar());
                docRequest.setLabReport(((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().
                        get(selectedrow))).getLabReport());
                docRequest.setLabTest(String.valueOf(labCombo.getSelectedItem()));
                docRequest.setPrescription("Not generated");

                Organization org = null;
                for (Organization orn : hEnterPrise.getOrganizationDirectory().getOrganizationList()) {
                    if (orn instanceof DoctorOrganization) {
                        org = orn;
                        break;
                    }
                }

                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(docRequest);
//                    account.getWorkQueue().getWorkRequestList().add(docRequest);
                    ((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().get(selectedrow))).setStatus("Sent to Doctor");
                    ((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().get(selectedrow))).setDoctorAssigned("Done");
                    JOptionPane.showMessageDialog(this, "Work request created successfully!");
                    populateRequestTable();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please check the details ");
                return;
            }

            break;

            default:
                break;

        }


    }//GEN-LAST:event_sendRequestActionPerformed

    public UserAccount getUser(String empId) {
        for (UserAccount user : organization.getUserAccountDirectory().getUserAccountList()) {
            if (user.getEmployee().getId() == empId) {
                return user;
            }
        }
        return null;
    }


    private void sendRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendRequestMouseEntered
        changecolorB(sendRequest, new Color(3, 138, 255));
    }//GEN-LAST:event_sendRequestMouseEntered

    private void sendRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendRequestMouseExited
        changecolorB(sendRequest, new Color(0, 91, 149));
    }//GEN-LAST:event_sendRequestMouseExited
    private void clearDoctor() {
//        doctorID.setText("");
//        txtDoctorName.setText("");
//        txtDoctorUsername.setText("");
//        txtDoctorPassword.setText("");
//        doctorSalary.setText("");
//        doctorExperience.setText("");
    }

    private void clearStaff() {
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
                populateRequestTable();

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

    private void statusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboBoxActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_statusComboBoxActionPerformed

    private void labComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labComboActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_headerMouseDragged

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void sendRequest1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendRequest1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_sendRequest1MouseEntered

    private void sendRequest1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendRequest1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_sendRequest1MouseExited

    private void sendRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequest1ActionPerformed
        // TODO add your handling code here:
        int selectedrow = patientTable.getSelectedRow();
        if (selectedrow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        if (amount.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the hospital amount!!");
            return;
        }
        int amounts = Integer.parseInt(amount.getText());
        int phamacyAm = ((StaffWorkRequest) (organization.getWorkQueue().getWorkRequestList().
                get(selectedrow))).getMedicinesPrice();
        jLabel10.setText(String.valueOf(amounts + phamacyAm));

    }//GEN-LAST:event_sendRequest1ActionPerformed

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_amountKeyTyped

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
    private javax.swing.JTextField amount;
    private javax.swing.JPanel buttonClose;
    private javax.swing.JLabel buttonLogout;
    private javax.swing.JPanel buttonMax;
    private javax.swing.JLabel buttonhidemenu;
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashboard;
    private UI.Components.Combobox doctorCombo;
    private javax.swing.JPanel header;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JTabbedPane hospitalAdmin;
    private javax.swing.JPanel iconmaxclose;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane2;
    private UI.Components.Combobox labCombo;
    private javax.swing.JPanel lineSetting;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JLabel max;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel menuhide1;
    private javax.swing.JScrollPane patientList;
    private javax.swing.JTable patientTable;
    private javax.swing.JPanel pharmacyStaistics;
    private UI.Components.Button sendRequest;
    private UI.Components.Button sendRequest1;
    private javax.swing.JPanel setting;
    private javax.swing.JPanel side1;
    private javax.swing.JLabel statisticsimg;
    private javax.swing.JLabel statisticslbl;
    private UI.Components.Combobox statusComboBox;
    private javax.swing.JTextArea textAreaMsg;
    // End of variables declaration//GEN-END:variables
}
