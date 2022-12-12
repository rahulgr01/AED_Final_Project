
package UI.VolunteerAdmin;


import Business.Community.Community;
import Business.Community.House;
import Business.Community.Tenant;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.VolunteerEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.SurveyVolunteerOrganization;
import Business.UserAccount.UserAccount;
import Business.Voluntary.SurveyReport;
import Business.Voluntary.VitalSigns;
import Business.WorkQueue.SurveyVolunteerWorkRequest;
import Business.WorkQueue.WorkRequest;
import UI.Components.TableCustom;
import UI.Login.MainLoginPage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class SurveyVolunteer extends javax.swing.JFrame {

    boolean a = true;
    static boolean maximized = true;
    private JFrame userProcessContainer;
     EcoSystem business;
    SurveyVolunteerOrganization organization;
    UserAccount account;
    VolunteerEnterprise vEnterPrise;
    JFrame parentFrame;
    Network 
    network;
    int xx, xy;
    int selectedRow= -1;
    SurveyVolunteerWorkRequest surveyWR;
    public SurveyVolunteer(UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business, JFrame parentFrame) {
            initComponents();
            vEnterPrise = (VolunteerEnterprise) enterprise;
          this.organization = (SurveyVolunteerOrganization) organization;
          this.parentFrame = parentFrame;
          this.account = account;
          network = business.getNetworkList().get(0);
          this.parentFrame = parentFrame;
           TableCustom.apply(jScrollPane6, TableCustom.TableType.DEFAULT);
         populateSurveyList();
    }
    //Method to change panel color on hover
 
    public void populateSurveyList() {
        try {
            for(WorkRequest wq: organization.getWorkQueue().getWorkRequestList()) {
            if(wq instanceof SurveyVolunteerWorkRequest)
            {
                
                DefaultTableModel model = (DefaultTableModel) svWorkRTable.getModel();



            model.setRowCount(0);
               House hous = ((SurveyVolunteerWorkRequest) wq).getAssignedHouse();
                   Object[] row = new Object[8];
            row[0] = hous.getCommunity().getCommunityName();
            row[1] = hous.getStreeAdredss();
            row[2] = hous.getHouseNumer();
            row[3] = hous.getCommunity().getZipCode();
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            String formattedDate = dateFormat.format(((SurveyVolunteerWorkRequest) wq).assignedDate);
            row[4] = formattedDate;
            row[5] = ((SurveyVolunteerWorkRequest) wq).getSender().getEmployee().getName();
            row[6] = ((SurveyVolunteerWorkRequest) wq).getStatus();
            row[7] = ((SurveyVolunteerWorkRequest) wq).getMessage();
              model.addRow(row);
               }
            
        }
        }catch(Exception e) {
            System.out.println("Error===" + e);
            JOptionPane.showMessageDialog(null, "system is down please contact system admin");
        }
        
        
    }
    
 
    public void populateTenantInfo() {
        sVTenantCombo.removeAllItems();
     House house=
          ((SurveyVolunteerWorkRequest)(organization.getWorkQueue().getWorkRequestList().
                get(selectedRow))).getAssignedHouse();
        for (Tenant tenant: house.tenats.getTenants()){
            sVTenantCombo.addItem(tenant);
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
        svolunteerViewTask = new javax.swing.JPanel();
        side7 = new javax.swing.JPanel();
        manageMedicinelbl2 = new javax.swing.JLabel();
        manageMedicineIcon2 = new javax.swing.JLabel();
        svolunteerTaskUpdate = new javax.swing.JPanel();
        side5 = new javax.swing.JPanel();
        manageSupplierlbl = new javax.swing.JLabel();
        manageSupplierIcon = new javax.swing.JLabel();
        svolunteer = new javax.swing.JTabbedPane();
        viewSurveyTask = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        svWorkRTable = new javax.swing.JTable();
        button5 = new UI.Components.Button();
        button6 = new UI.Components.Button();
        updateSurveyTask = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        weight = new UI.Components.MyTextFieldLogin();
        BP = new UI.Components.MyTextFieldLogin();
        PR = new UI.Components.MyTextFieldLogin();
        height = new UI.Components.MyTextFieldLogin();
        HR = new UI.Components.MyTextFieldLogin();
        needHosCombo = new UI.Components.Combobox();
        jLabel4 = new javax.swing.JLabel();
        diseaseList = new UI.Components.Combobox();
        jLabel6 = new javax.swing.JLabel();
        button1 = new UI.Components.Button();
        sVTenantCombo = new UI.Components.Combobox();
        communityName = new javax.swing.JLabel();
        houseName = new javax.swing.JLabel();
        HR1 = new UI.Components.MyTextFieldLogin();

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

        svolunteerViewTask.setBackground(new java.awt.Color(0, 91, 149));
        svolunteerViewTask.setPreferredSize(new java.awt.Dimension(220, 50));
        svolunteerViewTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svolunteerViewTaskMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                svolunteerViewTaskMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                svolunteerViewTaskMouseExited(evt);
            }
        });

        side7.setBackground(new java.awt.Color(0, 91, 149));
        side7.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout side7Layout = new javax.swing.GroupLayout(side7);
        side7.setLayout(side7Layout);
        side7Layout.setHorizontalGroup(
            side7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        side7Layout.setVerticalGroup(
            side7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        manageMedicinelbl2.setBackground(new java.awt.Color(51, 51, 51));
        manageMedicinelbl2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageMedicinelbl2.setForeground(new java.awt.Color(255, 255, 255));
        manageMedicinelbl2.setText("View Task");

        manageMedicineIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageMedicineIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/Medicine_40px.png"))); // NOI18N

        javax.swing.GroupLayout svolunteerViewTaskLayout = new javax.swing.GroupLayout(svolunteerViewTask);
        svolunteerViewTask.setLayout(svolunteerViewTaskLayout);
        svolunteerViewTaskLayout.setHorizontalGroup(
            svolunteerViewTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(svolunteerViewTaskLayout.createSequentialGroup()
                .addComponent(side7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageMedicineIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageMedicinelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        svolunteerViewTaskLayout.setVerticalGroup(
            svolunteerViewTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageMedicineIcon2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, svolunteerViewTaskLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(side7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(svolunteerViewTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageMedicinelbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        svolunteerTaskUpdate.setBackground(new java.awt.Color(0, 91, 149));
        svolunteerTaskUpdate.setPreferredSize(new java.awt.Dimension(220, 50));
        svolunteerTaskUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svolunteerTaskUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                svolunteerTaskUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                svolunteerTaskUpdateMouseExited(evt);
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
        manageSupplierlbl.setText("Task Update");

        manageSupplierIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageSupplierIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/supplier_40px.png"))); // NOI18N

        javax.swing.GroupLayout svolunteerTaskUpdateLayout = new javax.swing.GroupLayout(svolunteerTaskUpdate);
        svolunteerTaskUpdate.setLayout(svolunteerTaskUpdateLayout);
        svolunteerTaskUpdateLayout.setHorizontalGroup(
            svolunteerTaskUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(svolunteerTaskUpdateLayout.createSequentialGroup()
                .addComponent(side5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageSupplierIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageSupplierlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        svolunteerTaskUpdateLayout.setVerticalGroup(
            svolunteerTaskUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, svolunteerTaskUpdateLayout.createSequentialGroup()
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
            .addComponent(svolunteerTaskUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(svolunteerViewTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuhide1Layout.setVerticalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhide1Layout.createSequentialGroup()
                .addComponent(svolunteerViewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(svolunteerTaskUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 446, Short.MAX_VALUE))
        );

        menuhide.add(menuhide1, java.awt.BorderLayout.CENTER);

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        svolunteer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svolunteerMouseClicked(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(217, 241, 255));

        svWorkRTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Community", "House street address", "House Apt No", "Zip Code", "Date of task", "Sender", "Status", "Message"
            }
        ));
        svWorkRTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svWorkRTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(svWorkRTable);

        button5.setBackground(new java.awt.Color(0, 91, 149));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("Start Survey");
        button5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button5MouseExited(evt);
            }
        });
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(0, 91, 149));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("Refresh");
        button6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button6MouseExited(evt);
            }
        });
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout viewSurveyTaskLayout = new javax.swing.GroupLayout(viewSurveyTask);
        viewSurveyTask.setLayout(viewSurveyTaskLayout);
        viewSurveyTaskLayout.setHorizontalGroup(
            viewSurveyTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        viewSurveyTaskLayout.setVerticalGroup(
            viewSurveyTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        svolunteer.addTab("View Task", viewSurveyTask);

        jPanel22.setBackground(new java.awt.Color(217, 241, 255));

        weight.setLabelText("Weight");
        weight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                weightFocusGained(evt);
            }
        });
        weight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                weightKeyTyped(evt);
            }
        });

        BP.setLabelText("Body temperature");
        BP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BPFocusGained(evt);
            }
        });
        BP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BPKeyTyped(evt);
            }
        });

        PR.setLabelText("Pulse rate");
        PR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PRFocusGained(evt);
            }
        });
        PR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PRKeyTyped(evt);
            }
        });

        height.setLabelText("Height");
        height.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                heightFocusGained(evt);
            }
        });
        height.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                heightKeyTyped(evt);
            }
        });

        HR.setLabelText("Heart Rate");
        HR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HRFocusGained(evt);
            }
        });
        HR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HRKeyTyped(evt);
            }
        });

        needHosCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        needHosCombo.setSelectedIndex(-1);
        needHosCombo.setToolTipText("");
        needHosCombo.setLabeText("Choose");

        jLabel4.setText("Need To Hospitalise:");

        diseaseList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Covid", "Common Flue", "Cold", "None", " " }));
        diseaseList.setSelectedIndex(-1);
        diseaseList.setLabeText("Select disease");

        jLabel6.setText("Tenant health status for past 2 week");

        button1.setBackground(new java.awt.Color(0, 91, 149));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Complete Survey");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        sVTenantCombo.setLabeText("Tenant");
        sVTenantCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sVTenantComboActionPerformed(evt);
            }
        });

        communityName.setText("jLabel1");

        houseName.setText("jLabel2");

        HR1.setLabelText("Policy Id");
        HR1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HR1FocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sVTenantCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HR, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(PR, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(HR1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
                .addGap(47, 47, 47)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(diseaseList, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(needHosCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(communityName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(houseName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityName)
                    .addComponent(houseName))
                .addGap(77, 77, 77)
                .addComponent(sVTenantCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(diseaseList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(needHosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(height, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout updateSurveyTaskLayout = new javax.swing.GroupLayout(updateSurveyTask);
        updateSurveyTask.setLayout(updateSurveyTaskLayout);
        updateSurveyTaskLayout.setHorizontalGroup(
            updateSurveyTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        updateSurveyTaskLayout.setVerticalGroup(
            updateSurveyTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        svolunteer.addTab("Task Update", updateSurveyTask);

        getContentPane().add(svolunteer, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseClicked
        if (maximized) {
            SurveyVolunteer.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            SurveyVolunteer.this.setMaximizedBounds(env.getMaximumWindowBounds());
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
       this.setVisible(false);
           parentFrame.setVisible(true);
    }//GEN-LAST:event_closeMouseClicked

    private void svolunteerTaskUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svolunteerTaskUpdateMouseClicked
         svolunteer.setSelectedIndex(1);
          changecolor(svolunteerTaskUpdate, new Color(3,138,255));
        changecolor(side5, new Color(190, 224, 236));
    }//GEN-LAST:event_svolunteerTaskUpdateMouseClicked

    private void svolunteerTaskUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svolunteerTaskUpdateMouseEntered
        changecolor(svolunteerTaskUpdate, new Color(3,138,255));
        changecolor(side5, new Color(190, 224, 236));
    }//GEN-LAST:event_svolunteerTaskUpdateMouseEntered

    private void svolunteerTaskUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svolunteerTaskUpdateMouseExited
        changecolor(svolunteerTaskUpdate, new Color(0,91,149));
        changecolor(side5, new Color(0,91,149));
    }//GEN-LAST:event_svolunteerTaskUpdateMouseExited

    private void svolunteerViewTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svolunteerViewTaskMouseClicked
         svolunteer.setSelectedIndex(0);
          changecolor(svolunteerViewTask, new Color(3,138,255));
        changecolor(side5, new Color(190, 224, 236));
    }//GEN-LAST:event_svolunteerViewTaskMouseClicked

    private void svolunteerViewTaskMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svolunteerViewTaskMouseEntered
       changecolor(svolunteerViewTask, new Color(3,138,255));
        changecolor(side5, new Color(190, 224, 236));
    }//GEN-LAST:event_svolunteerViewTaskMouseEntered

    private void svolunteerViewTaskMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svolunteerViewTaskMouseExited
       changecolor(svolunteerViewTask, new Color(0,91,149));
        changecolor(side5, new Color(0,91,149));
    }//GEN-LAST:event_svolunteerViewTaskMouseExited
public void changecolorB(JButton hover, Color rand) {
        hover.setBackground(rand);
    }
    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        
    }//GEN-LAST:event_button1MouseClicked

    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
       changecolorB(button1, new Color(3,138,255));
    }//GEN-LAST:event_button1MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
        changecolorB(button1, new Color(0,91,149));
    }//GEN-LAST:event_button1MouseExited

    private void button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_button5MouseEntered

    private void button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_button5MouseExited

    private void svolunteerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svolunteerMouseClicked
        // TODO add your handling code here:
        int index = svolunteer.getSelectedIndex();
       
        System.out.print(index);
        switch (index) {
           
            case 0:
                populateSurveyList();
                break;
            case 1:
//            populateCommunities();
                break;
            
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_svolunteerMouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if (height.getText().equals("")){
             height.setHelperText("Please Enter Height");
          
         }
          else if(weight.getText().equals("")) {
            weight.setHelperText("Please Enter Weight");
            
         }
        else if(BP.getText().equals("")) {
            BP.setHelperText("Please Enter Blood Pressure");
           
         }
        else if(PR.getText().equals("")) {
            PR.setHelperText("Please Enter Pulse Rate");
           
         }
        else if(HR.getText().equals("")) {
            HR.setHelperText("Please Enter Heart Rate");
             
         }
        else if(HR1.getText().equals("")) {
            HR1.setHelperText("Please Enter PolicyID");
             return;
         }
        else
        {
        
        Tenant tenant = (Tenant)sVTenantCombo.getSelectedItem();
        VitalSigns vS = new VitalSigns();
        vS.setTemperature(Double.parseDouble(PR.getText()));
        vS.setHeartRate( Integer.parseInt(HR.getText()));
        vS.setBP(Integer.parseInt(BP.getText()));
        vS.setHeight(Integer.parseInt(height.getText()));
        vS.setWeight(Integer.parseInt(weight.getText()));
        tenant.setVitalSign(vS);
          
        SurveyReport rep = new SurveyReport();
        rep.setNeedHospitalization(needHosCombo.getSelectedIndex() == 0);
        rep.setPolicyID(HR1.getText());
        rep.setSurveyStatus("completed Survey");
        String disease = "other";
        switch (needHosCombo.getSelectedIndex()) {
            case 0:
                disease ="covid";
                break;
            case 1:
                disease = "common flue";
                break; 
            case 2:
                disease = "cold";
                break;
            case 3:
                disease = "other";
                break;
            default:
                break;
        }
        rep.setSicknessType(disease);
        tenant.setReport(rep);
        
         organization.getWorkQueue().getWorkRequestList().get(selectedRow).setStatus("Completed");
          ((SurveyVolunteerWorkRequest)(organization.getWorkQueue().getWorkRequestList().get(selectedRow))).setTenant(tenant);
    
          JOptionPane.showMessageDialog(this, "Work request completed successfully!");
          populateSurveyList();
     
        }
//        surveyWR.setStatus("Completed");
//        surveyWR.setTenant(tenant);
        
    }//GEN-LAST:event_button1ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
                 

       selectedRow = svWorkRTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row!!");
            
            return;
        }
        
      organization.getWorkQueue().getWorkRequestList().get(selectedRow).setStatus("new");
      populateSurveyList();
      //  surveyWR = (SurveyVolunteerWorkRequest)svWorkRTable.getValueAt(selectedRow, 0);
//        System.out.println("1135--"+ surveyWR.getStatus());
//        surveyWR.setStatus("Started");
        
        JOptionPane.showMessageDialog(null,"Survey Started!!");
          communityName.setText( ((SurveyVolunteerWorkRequest)(organization.getWorkQueue().getWorkRequestList().
              get(selectedRow))).getAssignedHouse().getCommunity().getCommunityName());
      communityName.disable();
      houseName.setText( ((SurveyVolunteerWorkRequest)(organization.getWorkQueue().getWorkRequestList().
              get(selectedRow))).getAssignedHouse().getStreeAdredss());
      houseName.disable();
      populateTenantInfo();
        svolunteer.setSelectedIndex(2);

        // TODO add your handling code here:
    }//GEN-LAST:event_button5ActionPerformed

    private void button6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_button6MouseEntered

    private void button6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_button6MouseExited

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
         populateSurveyList();
    }//GEN-LAST:event_button6ActionPerformed

    private void sVTenantComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sVTenantComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sVTenantComboActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_headerMouseDragged

    private void svWorkRTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svWorkRTableMouseClicked
        // TODO add your handling code here:
     this.selectedRow = svWorkRTable.getSelectedRow();
    }//GEN-LAST:event_svWorkRTableMouseClicked

    private void heightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightKeyTyped
if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }       
    }//GEN-LAST:event_heightKeyTyped

    private void PRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PRKeyTyped
       if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_PRKeyTyped

    private void weightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightKeyTyped
       if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_weightKeyTyped

    private void HRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HRKeyTyped
      if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_HRKeyTyped

    private void BPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BPKeyTyped
      if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_BPKeyTyped

    private void heightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_heightFocusGained
       height.setHelperText(null);
    }//GEN-LAST:event_heightFocusGained

    private void weightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_weightFocusGained
        weight.setHelperText(null);
    }//GEN-LAST:event_weightFocusGained

    private void BPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BPFocusGained
       BP.setHelperText(null);
    }//GEN-LAST:event_BPFocusGained

    private void PRFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PRFocusGained
      PR.setHelperText(null);
    }//GEN-LAST:event_PRFocusGained

    private void HRFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HRFocusGained
       HR.setHelperText(null);
    }//GEN-LAST:event_HRFocusGained

    private void HR1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HR1FocusGained
        HR1.setHelperText(null);
    }//GEN-LAST:event_HR1FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private UI.Components.MyTextFieldLogin BP;
    private UI.Components.MyTextFieldLogin HR;
    private UI.Components.MyTextFieldLogin HR1;
    private javax.swing.JPanel MenuIcon;
    private UI.Components.MyTextFieldLogin PR;
    private UI.Components.Button button1;
    private UI.Components.Button button5;
    private UI.Components.Button button6;
    private javax.swing.JPanel buttonClose;
    private javax.swing.JLabel buttonLogout;
    private javax.swing.JPanel buttonMax;
    private javax.swing.JLabel buttonhidemenu;
    private javax.swing.JLabel close;
    private javax.swing.JLabel communityName;
    private UI.Components.Combobox diseaseList;
    private javax.swing.JPanel header;
    private UI.Components.MyTextFieldLogin height;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JLabel houseName;
    private javax.swing.JPanel iconmaxclose;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel lineSetting;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JLabel manageMedicineIcon2;
    private javax.swing.JLabel manageMedicinelbl2;
    private javax.swing.JLabel manageSupplierIcon;
    private javax.swing.JLabel manageSupplierlbl;
    private javax.swing.JLabel max;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel menuhide1;
    private UI.Components.Combobox needHosCombo;
    private UI.Components.Combobox sVTenantCombo;
    private javax.swing.JPanel setting;
    private javax.swing.JPanel side5;
    private javax.swing.JPanel side7;
    private javax.swing.JTable svWorkRTable;
    private javax.swing.JTabbedPane svolunteer;
    private javax.swing.JPanel svolunteerTaskUpdate;
    private javax.swing.JPanel svolunteerViewTask;
    private javax.swing.JPanel updateSurveyTask;
    private javax.swing.JPanel viewSurveyTask;
    private UI.Components.MyTextFieldLogin weight;
    // End of variables declaration//GEN-END:variables
}
