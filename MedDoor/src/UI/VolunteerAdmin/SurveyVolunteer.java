
package UI.VolunteerAdmin;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.Components.TableCustom;
import UI.Login.MainLoginPage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.text.MessageFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class SurveyVolunteer extends javax.swing.JFrame {

    boolean a = true;
    static boolean maximized = true;
    private JFrame userProcessContainer;
    public SurveyVolunteer(UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business) {
            initComponents();
         
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
        manageSurveyTask = new javax.swing.JPanel();
        side7 = new javax.swing.JPanel();
        manageMedicinelbl2 = new javax.swing.JLabel();
        manageMedicineIcon2 = new javax.swing.JLabel();
        manageSupplier = new javax.swing.JPanel();
        side5 = new javax.swing.JPanel();
        manageSupplierlbl = new javax.swing.JLabel();
        manageSupplierIcon = new javax.swing.JLabel();
        pharmacyAdmin = new javax.swing.JTabbedPane();
        dashboard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        viewSurveyTask = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        button4 = new UI.Components.Button();
        updateSurveyTask = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        combobox2 = new UI.Components.Combobox();
        combobox9 = new UI.Components.Combobox();
        myTextFieldLogin6 = new UI.Components.MyTextFieldLogin();
        myTextFieldLogin9 = new UI.Components.MyTextFieldLogin();
        myTextFieldLogin10 = new UI.Components.MyTextFieldLogin();
        myTextFieldLogin11 = new UI.Components.MyTextFieldLogin();
        myTextFieldLogin12 = new UI.Components.MyTextFieldLogin();
        myTextFieldLogin13 = new UI.Components.MyTextFieldLogin();
        combobox10 = new UI.Components.Combobox();
        jLabel4 = new javax.swing.JLabel();
        combobox11 = new UI.Components.Combobox();
        jLabel6 = new javax.swing.JLabel();
        button1 = new UI.Components.Button();
        combobox12 = new UI.Components.Combobox();

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
        statisticslbl.setText("Volunteer Dashboard");

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

        manageSurveyTask.setBackground(new java.awt.Color(0, 91, 149));
        manageSurveyTask.setPreferredSize(new java.awt.Dimension(220, 50));
        manageSurveyTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageSurveyTaskMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageSurveyTaskMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageSurveyTaskMouseExited(evt);
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

        javax.swing.GroupLayout manageSurveyTaskLayout = new javax.swing.GroupLayout(manageSurveyTask);
        manageSurveyTask.setLayout(manageSurveyTaskLayout);
        manageSurveyTaskLayout.setHorizontalGroup(
            manageSurveyTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageSurveyTaskLayout.createSequentialGroup()
                .addComponent(side7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageMedicineIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageMedicinelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        manageSurveyTaskLayout.setVerticalGroup(
            manageSurveyTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageSurveyTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageMedicinelbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(manageMedicineIcon2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
            .addComponent(side7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        manageSupplierlbl.setText("Task Update");

        manageSupplierIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageSupplierIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/supplier_40px.png"))); // NOI18N

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
            .addComponent(manageSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(manageSurveyTask, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuhide1Layout.setVerticalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhide1Layout.createSequentialGroup()
                .addComponent(pharmacyStaistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(manageSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuhide1Layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(manageSurveyTask, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(645, Short.MAX_VALUE)))
        );

        menuhide.add(menuhide1, java.awt.BorderLayout.CENTER);

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );

        dashboard.add(jPanel1, java.awt.BorderLayout.CENTER);

        pharmacyAdmin.addTab("Dashboard", dashboard);

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
        jScrollPane6.setViewportView(jTable3);

        button4.setText("Show On Map");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(459, Short.MAX_VALUE))
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

        pharmacyAdmin.addTab("View Task", viewSurveyTask);

        combobox2.setLabeText("Date");

        combobox9.setLabeText("Task");

        myTextFieldLogin6.setLabelText("Weight");

        myTextFieldLogin9.setLabelText("Body temperature");

        myTextFieldLogin10.setLabelText("Pulse rate");

        myTextFieldLogin11.setLabelText("Blood group");

        myTextFieldLogin12.setLabelText("Hight");

        myTextFieldLogin13.setLabelText("Heart Rate");

        combobox10.setLabeText("");

        jLabel4.setText("Need To Hospitalise:");

        combobox11.setLabeText("Select disease");

        jLabel6.setText("Tenant health status for past 2 week");

        button1.setText("Complete Survey");

        combobox12.setLabeText("Tenant");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myTextFieldLogin6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myTextFieldLogin12, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myTextFieldLogin9, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(myTextFieldLogin13, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myTextFieldLogin10, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myTextFieldLogin11, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combobox11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(combobox10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combobox12, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox9, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(combobox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combobox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myTextFieldLogin12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myTextFieldLogin10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myTextFieldLogin6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myTextFieldLogin13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myTextFieldLogin9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myTextFieldLogin11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combobox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(combobox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
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

        pharmacyAdmin.addTab("Task Update", updateSurveyTask);

        getContentPane().add(pharmacyAdmin, java.awt.BorderLayout.CENTER);

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
         pharmacyAdmin.setSelectedIndex(0);
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
         pharmacyAdmin.setSelectedIndex(4);
          changecolor(manageSupplier, new Color(3,138,255));
        changecolor(side5, new Color(190, 224, 236));
    }//GEN-LAST:event_manageSupplierMouseClicked

    private void manageSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSupplierMouseEntered
        changecolor(manageSupplier, new Color(3,138,255));
        changecolor(side5, new Color(190, 224, 236));
    }//GEN-LAST:event_manageSupplierMouseEntered

    private void manageSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSupplierMouseExited
        changecolor(manageSupplier, new Color(0,91,149));
        changecolor(side5, new Color(0,91,149));
    }//GEN-LAST:event_manageSupplierMouseExited

    private void manageSurveyTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSurveyTaskMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_manageSurveyTaskMouseClicked

    private void manageSurveyTaskMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSurveyTaskMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_manageSurveyTaskMouseEntered

    private void manageSurveyTaskMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSurveyTaskMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_manageSurveyTaskMouseExited

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
    private UI.Components.Button button1;
    private UI.Components.Button button4;
    private javax.swing.JPanel buttonClose;
    private javax.swing.JLabel buttonLogout;
    private javax.swing.JPanel buttonMax;
    private javax.swing.JLabel buttonhidemenu;
    private javax.swing.JLabel close;
    private UI.Components.Combobox combobox10;
    private UI.Components.Combobox combobox11;
    private UI.Components.Combobox combobox12;
    private UI.Components.Combobox combobox2;
    private UI.Components.Combobox combobox9;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel header;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JPanel iconmaxclose;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel lineSetting;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JLabel manageMedicineIcon2;
    private javax.swing.JLabel manageMedicinelbl2;
    private javax.swing.JPanel manageSupplier;
    private javax.swing.JLabel manageSupplierIcon;
    private javax.swing.JLabel manageSupplierlbl;
    private javax.swing.JPanel manageSurveyTask;
    private javax.swing.JLabel max;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel menuhide1;
    private UI.Components.MyTextFieldLogin myTextFieldLogin10;
    private UI.Components.MyTextFieldLogin myTextFieldLogin11;
    private UI.Components.MyTextFieldLogin myTextFieldLogin12;
    private UI.Components.MyTextFieldLogin myTextFieldLogin13;
    private UI.Components.MyTextFieldLogin myTextFieldLogin6;
    private UI.Components.MyTextFieldLogin myTextFieldLogin9;
    private javax.swing.JTabbedPane pharmacyAdmin;
    private javax.swing.JPanel pharmacyStaistics;
    private javax.swing.JPanel setting;
    private javax.swing.JPanel side1;
    private javax.swing.JPanel side5;
    private javax.swing.JPanel side7;
    private javax.swing.JLabel statisticsimg;
    private javax.swing.JLabel statisticslbl;
    private javax.swing.JPanel updateSurveyTask;
    private javax.swing.JPanel viewSurveyTask;
    // End of variables declaration//GEN-END:variables
}
