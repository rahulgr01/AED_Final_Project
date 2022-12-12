
package UI.VolunteerAdmin;


import Business.Community.Tenant;
import Business.EcoSystem;
import Business.Enterprise.DiagnosticsEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.InsuranceEnterprise;
import Business.Network.Network;
import Business.Organization.ClaimsOrganization;
import Business.Organization.HomeCareVolunteerOrganization;
import Business.Organization.Organization;
import Business.Organization.SurveyVolunteerOrganization;
import Business.UserAccount.UserAccount;
import Business.Voluntary.SurveyReport;
import Business.WorkQueue.ClaimsWorkRequest;
import Business.WorkQueue.HomeCareVolunteerWorkRequest;
import Business.WorkQueue.HospitalWorkRequest;
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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class HomeCareVolunteer extends javax.swing.JFrame {

    boolean a = true;
    static boolean maximized = true;
    private JFrame userProcessContainer;
    UserAccount account;
    Network network;
    int xx, xy;
    JFrame parentFrame;
     HomeCareVolunteerOrganization organization;
    public HomeCareVolunteer(UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,JFrame parentFrame) {
        initComponents();
         this.account = account;
         this.organization =(HomeCareVolunteerOrganization) organization;
         network = business.getNetworkList().get(0);
         this.parentFrame = parentFrame;
         populateSurveyList();
         populateHospitalList();
         
    }
    
    
    public void populateHospitalList() {
        try {
             Enterprise org = null;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
              System.out.println("hosp"+ enter.getName());
            if (enter instanceof HospitalEnterprise){
                org = enter;
                break;
            }
        }
        if (org!=null){
            System.out.println("hosp"+ org.getWorkQueue().getWorkRequestList());
                   
        }
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();



            model.setRowCount(0);
            for(WorkRequest wq: org.getWorkQueue().getWorkRequestList()) {
            if(wq instanceof HospitalWorkRequest)
            {
                
                
                   Object[] row = new Object[5];
            row[0] = ((HospitalWorkRequest) wq).getPatient().getFirstName();
           
            row[4] = ((HospitalWorkRequest) wq).getReceiver().getEmployee().getName();
            row[3] = ((HospitalWorkRequest) wq).getMedicinesPrice();
            row[1] = ((HospitalWorkRequest) wq).getStatus();
            row[2] = ((HospitalWorkRequest) wq).getMessage();
//            row[7] = ((HomeCareVolunteerWorkRequest) wq).getMessage();
              model.addRow(row);
               }
            
        }
        }catch(Exception e) {
            System.out.println("Error===" + e);
            JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }
        
        
    }
    
     public void populateClaimList() {
        try {
             Organization org = null;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
              System.out.println("hosp"+ enter.getName());
            if (enter instanceof InsuranceEnterprise){
                for (Organization claimorg : enter.getOrganizationDirectory().getOrganizationList()) {
                    if(claimorg instanceof ClaimsOrganization) {
                        org = claimorg;
                        break;
                    }
                }
            }
        }
        if (org!=null){
            System.out.println("hosp"+ org.getWorkQueue().getWorkRequestList());
                   
        }
       DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

            model.setRowCount(0);
            for(WorkRequest wq: org.getWorkQueue().getWorkRequestList()) {
            if(wq instanceof ClaimsWorkRequest)
            {
                
            
                   Object[] row = new Object[4];
            row[0] = ((ClaimsWorkRequest) wq).getPatient().getFirstName();
           
            
            row[3] = ((ClaimsWorkRequest) wq).getAmtapproved();
            row[1] = ((ClaimsWorkRequest) wq).getStatus();
            row[2] = ((ClaimsWorkRequest) wq).getMessage();
//            row[7] = ((HomeCareVolunteerWorkRequest) wq).getMessage();
              model.addRow(row);
               }
            
        }
        }catch(Exception e) {
            System.out.println("Error===" + e);
            JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }
        
        
    }
    //Method to change panel color on hover
 public void populateSurveyList() {
        try {
             Enterprise org = null;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
              System.out.println("hosp"+ enter.getName());
            if (enter instanceof HospitalEnterprise){
                org = enter;
                break;
            }
        }
        if (org!=null){
            System.out.println("hosp"+ org.getWorkQueue().getWorkRequestList());
                   
        }
       
            
            
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();



            model.setRowCount(0);
            for(WorkRequest wq: organization.getWorkQueue().getWorkRequestList()) {
            if(wq instanceof HomeCareVolunteerWorkRequest)
            {
                
                
               Tenant patient = ((HomeCareVolunteerWorkRequest) wq).getPatient();
                   Object[] row = new Object[4];
            row[0] = patient.getFirstName();
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            String formattedDate = dateFormat.format(((HomeCareVolunteerWorkRequest) wq).getRequestDate());
            row[3] = formattedDate;
            row[2] = ((HomeCareVolunteerWorkRequest) wq).getSender().getEmployee().getName();
            row[1] = ((HomeCareVolunteerWorkRequest) wq).getStatus();
//            row[7] = ((HomeCareVolunteerWorkRequest) wq).getMessage();
              model.addRow(row);
               }
            
        }
        }catch(Exception e) {
            System.out.println("Error===" + e);
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
        hcvTaskA = new javax.swing.JPanel();
        side2 = new javax.swing.JPanel();
        statisticslbl1 = new javax.swing.JLabel();
        statisticsimg1 = new javax.swing.JLabel();
        hcvTaskH = new javax.swing.JPanel();
        side3 = new javax.swing.JPanel();
        statisticslbl2 = new javax.swing.JLabel();
        statisticsimg2 = new javax.swing.JLabel();
        hcv = new javax.swing.JTabbedPane();
        addVolunteer = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        button4 = new UI.Components.Button();
        jLabel1 = new javax.swing.JLabel();
        button5 = new UI.Components.Button();
        manageTask = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button1 = new UI.Components.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        button3 = new UI.Components.Button();

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

        hcvTaskA.setBackground(new java.awt.Color(0, 91, 149));
        hcvTaskA.setPreferredSize(new java.awt.Dimension(220, 50));
        hcvTaskA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hcvTaskAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hcvTaskAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hcvTaskAMouseExited(evt);
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

        statisticslbl1.setBackground(new java.awt.Color(51, 51, 51));
        statisticslbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statisticslbl1.setForeground(new java.awt.Color(255, 255, 255));
        statisticslbl1.setText("Hospital Tasks");

        statisticsimg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statisticsimg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/task_40px.png"))); // NOI18N

        javax.swing.GroupLayout hcvTaskALayout = new javax.swing.GroupLayout(hcvTaskA);
        hcvTaskA.setLayout(hcvTaskALayout);
        hcvTaskALayout.setHorizontalGroup(
            hcvTaskALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hcvTaskALayout.createSequentialGroup()
                .addComponent(side2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statisticsimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statisticslbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        hcvTaskALayout.setVerticalGroup(
            hcvTaskALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hcvTaskALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statisticslbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(statisticsimg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        hcvTaskH.setBackground(new java.awt.Color(0, 91, 149));
        hcvTaskH.setPreferredSize(new java.awt.Dimension(220, 50));
        hcvTaskH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hcvTaskHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hcvTaskHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hcvTaskHMouseExited(evt);
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

        statisticslbl2.setBackground(new java.awt.Color(51, 51, 51));
        statisticslbl2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statisticslbl2.setForeground(new java.awt.Color(255, 255, 255));
        statisticslbl2.setText("Admin Tasks");

        statisticsimg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statisticsimg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/what_i_do_40px.png"))); // NOI18N

        javax.swing.GroupLayout hcvTaskHLayout = new javax.swing.GroupLayout(hcvTaskH);
        hcvTaskH.setLayout(hcvTaskHLayout);
        hcvTaskHLayout.setHorizontalGroup(
            hcvTaskHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hcvTaskHLayout.createSequentialGroup()
                .addComponent(side3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statisticsimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statisticslbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        hcvTaskHLayout.setVerticalGroup(
            hcvTaskHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hcvTaskHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statisticslbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(statisticsimg2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout menuhide1Layout = new javax.swing.GroupLayout(menuhide1);
        menuhide1.setLayout(menuhide1Layout);
        menuhide1Layout.setHorizontalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhide1Layout.createSequentialGroup()
                .addGroup(menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuhide1Layout.createSequentialGroup()
                        .addComponent(hcvTaskH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuhide1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(hcvTaskA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        menuhide1Layout.setVerticalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhide1Layout.createSequentialGroup()
                .addComponent(hcvTaskH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(hcvTaskA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 702, Short.MAX_VALUE))
        );

        menuhide.add(menuhide1, java.awt.BorderLayout.CENTER);

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        jPanel17.setBackground(new java.awt.Color(217, 241, 255));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Status", "Sender", "Assigned Date"
            }
        ));
        jScrollPane6.setViewportView(jTable3);

        button4.setBackground(new java.awt.Color(0, 91, 149));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("Create Work load for Hospital");
        button4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Assigned Patient Deatil:");

        button5.setBackground(new java.awt.Color(0, 91, 149));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("Update Hospital Request");
        button5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(479, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addVolunteerLayout = new javax.swing.GroupLayout(addVolunteer);
        addVolunteer.setLayout(addVolunteerLayout);
        addVolunteerLayout.setHorizontalGroup(
            addVolunteerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addVolunteerLayout.setVerticalGroup(
            addVolunteerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addVolunteerLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        hcv.addTab("Task From Admin", addVolunteer);

        jPanel22.setBackground(new java.awt.Color(217, 241, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Status", "Message", "Total Amount", "Hospital"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Claim Status");
        }

        button1.setBackground(new java.awt.Color(0, 91, 149));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Claim The Insurance");
        button1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Status", "Message", "Total Amount"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        button3.setBackground(new java.awt.Color(0, 91, 149));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Refresh");
        button3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
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

        hcv.addTab("Task From Hospital", manageTask);

        getContentPane().add(hcv, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseClicked
        if (maximized) {
            HomeCareVolunteer.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            HomeCareVolunteer.this.setMaximizedBounds(env.getMaximumWindowBounds());
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

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        changecolor(buttonClose, new Color(27,152,245));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        changecolor(buttonClose, new Color(3,138,255));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void hcvTaskAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hcvTaskAMouseClicked
          hcv.setSelectedIndex(0);
         changecolor(hcvTaskA, new Color(3,138,255));
        changecolor(side2, new Color(190, 224, 236));
    }//GEN-LAST:event_hcvTaskAMouseClicked

    private void hcvTaskAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hcvTaskAMouseEntered
      changecolor(hcvTaskA, new Color(3,138,255));
        changecolor(side2, new Color(190, 224, 236));
    }//GEN-LAST:event_hcvTaskAMouseEntered

    private void hcvTaskAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hcvTaskAMouseExited
        changecolor(hcvTaskA, new Color(0,91,149));
        changecolor(side2, new Color(0,91,149));
    }//GEN-LAST:event_hcvTaskAMouseExited

    private void hcvTaskHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hcvTaskHMouseClicked
        hcv.setSelectedIndex(2);
         changecolor(hcvTaskH, new Color(3,138,255));
        changecolor(side3, new Color(190, 224, 236));
    }//GEN-LAST:event_hcvTaskHMouseClicked

    private void hcvTaskHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hcvTaskHMouseEntered
       changecolor(hcvTaskH, new Color(3,138,255));
        changecolor(side3, new Color(190, 224, 236));
    }//GEN-LAST:event_hcvTaskHMouseEntered

    private void hcvTaskHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hcvTaskHMouseExited
            changecolor(hcvTaskH, new Color(0,91,149));
        changecolor(side3, new Color(0,91,149));
    }//GEN-LAST:event_hcvTaskHMouseExited

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable3.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row!!");
            return;
        }
           
         organization.getWorkQueue().getWorkRequestList().get(selectedRow).setStatus("Sent to Hospital");
         populateSurveyList();
    
        Tenant tenat = ((HomeCareVolunteerWorkRequest)(organization.getWorkQueue().getWorkRequestList().
              get(selectedRow))).getPatient();
         HospitalWorkRequest hosWR = new HospitalWorkRequest();
        hosWR.setPatient(tenat);
        hosWR.setRequestDate(new Date());
        hosWR.setStatus("New");
        hosWR.setSender(account);
        
        Enterprise org = null;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
            
            if (enter instanceof HospitalEnterprise){
                org = enter;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(hosWR);
            account.getWorkQueue().getWorkRequestList().add(hosWR);
            hosWR.setReceiver(org.getUserAccountDirectory().getUserAccountList().get(0));
        } 
        
        JOptionPane.showMessageDialog(null,"Work request created!!");
    }//GEN-LAST:event_button4ActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_headerMouseDragged

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
         try {

              int selectedrow = jTable1.getSelectedRow();
        if (selectedrow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row!!");
            return;
        }
        
        
         Enterprise ent = null;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
              System.out.println("hosp"+ enter.getName());
            if (enter instanceof HospitalEnterprise){
                ent = enter;
                break;
            }
        }
        if (ent!=null){
            System.out.println("hosp"+ ent.getWorkQueue().getWorkRequestList());
                   
        }
       
          int bill = ((HospitalWorkRequest)(ent.getWorkQueue().getWorkRequestList().get(selectedrow))).getMedicinesPrice();
           Tenant tenat = ((HospitalWorkRequest)(ent.getWorkQueue().getWorkRequestList().get(selectedrow))).getPatient();
        
                ClaimsWorkRequest docRequest = new ClaimsWorkRequest();
                
                docRequest.setPatient(tenat);
                docRequest.setMessage("Claim request");
                docRequest.setSender(account);
                docRequest.setRequestDate(new Date());
                docRequest.setStatus("New Request");
            docRequest.setBillamount(bill);
            docRequest.setPolicyID(tenat.getReport().getPolicyID());
           
                Organization org = null;

                for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {

                    if (enter instanceof InsuranceEnterprise) {
                        for (Organization orn : enter.getOrganizationDirectory().getOrganizationList()) {
                            if (orn instanceof ClaimsOrganization) {
                                org = orn;
                                break;
                            }
                        }
                    }
                }

                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(docRequest);
                    account.getWorkQueue().getWorkRequestList().add(docRequest);
                    JOptionPane.showMessageDialog(this, "Work request created successfully!");
                    populateHospitalList();
                    populateClaimList();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please check the details ");
                return;
            }

        
        
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        populateClaimList();
    }//GEN-LAST:event_button3ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
           try {

              int selectedrow = jTable3.getSelectedRow();
        if (selectedrow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row!!");
            return;
        }
        ((HomeCareVolunteerWorkRequest)(organization.getWorkQueue().getWorkRequestList().get(selectedrow))).setStatus("Patient has been tested and claim generated");
       ((HomeCareVolunteerWorkRequest)(organization.getWorkQueue().getWorkRequestList().get(selectedrow))).setMessage("Patient is cured");
      
       
       SurveyReport sR =  ((HomeCareVolunteerWorkRequest)(organization.getWorkQueue().getWorkRequestList().get(selectedrow))).getPatient().getReport();
       sR.setHomeCareStatus("Patient has been tested and claim generated");
       ((HomeCareVolunteerWorkRequest)(organization.getWorkQueue().getWorkRequestList().get(selectedrow))).getPatient().setReport(sR);
       JOptionPane.showMessageDialog(this, "Work request updated successfully!");
           
           } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please check the details ");
                return;
            }

        populateSurveyList();
        
    }//GEN-LAST:event_button5ActionPerformed

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
    private javax.swing.JPanel addVolunteer;
    private UI.Components.Button button1;
    private UI.Components.Button button3;
    private UI.Components.Button button4;
    private UI.Components.Button button5;
    private javax.swing.JPanel buttonClose;
    private javax.swing.JLabel buttonLogout;
    private javax.swing.JPanel buttonMax;
    private javax.swing.JLabel buttonhidemenu;
    private javax.swing.JLabel close;
    private javax.swing.JTabbedPane hcv;
    private javax.swing.JPanel hcvTaskA;
    private javax.swing.JPanel hcvTaskH;
    private javax.swing.JPanel header;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JPanel iconmaxclose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel lineSetting;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel manageTask;
    private javax.swing.JLabel max;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel menuhide1;
    private javax.swing.JPanel setting;
    private javax.swing.JPanel side2;
    private javax.swing.JPanel side3;
    private javax.swing.JLabel statisticsimg1;
    private javax.swing.JLabel statisticsimg2;
    private javax.swing.JLabel statisticslbl1;
    private javax.swing.JLabel statisticslbl2;
    // End of variables declaration//GEN-END:variables
}
