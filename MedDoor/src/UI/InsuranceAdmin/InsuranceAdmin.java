
package UI.InsuranceAdmin;


import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.ClaimsOrganization;
import Business.Organization.LabServiceOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PolicyOrganization;
import Business.Role.Role;
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
import javax.swing.table.DefaultTableModel;

public class InsuranceAdmin extends javax.swing.JFrame {

    boolean a = true;
    static boolean maximized = true;
     EcoSystem business;
    Organization organization;
    UserAccount account;
    Enterprise enterprise;
    JFrame parentFrame;
    public InsuranceAdmin(UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,JFrame parentFrame) {
        initComponents();
         this.business = business;
        this.account = account;
        this.organization=organization;
        this.enterprise=enterprise;
         this.parentFrame = parentFrame;
         TableCustom.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
     
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

        MenuIcon = new javax.swing.JPanel();
        linehidemenu = new javax.swing.JPanel();
        hidemenu = new javax.swing.JPanel();
        buttonhidemenu = new javax.swing.JLabel();
        lineSetting = new javax.swing.JPanel();
        setting = new javax.swing.JPanel();
        buttonLogout = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        iconmaxclose = new javax.swing.JPanel();
        buttonClose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        buttonMax = new javax.swing.JPanel();
        max = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        menuhide = new javax.swing.JPanel();
        menuhide1 = new javax.swing.JPanel();
        insuranceDashboard = new javax.swing.JPanel();
        side1 = new javax.swing.JPanel();
        statisticslbl = new javax.swing.JLabel();
        statisticsimg = new javax.swing.JLabel();
        manageOrganization = new javax.swing.JPanel();
        side2 = new javax.swing.JPanel();
        manageCompanylbl = new javax.swing.JLabel();
        manageCompanyIcon = new javax.swing.JLabel();
        manageHolders = new javax.swing.JPanel();
        side3 = new javax.swing.JPanel();
        manageHolderlbl = new javax.swing.JLabel();
        manageHolderIcon = new javax.swing.JLabel();
        managePolicies = new javax.swing.JPanel();
        side4 = new javax.swing.JPanel();
        managePolicieslbl = new javax.swing.JLabel();
        managePoliciesIcon = new javax.swing.JLabel();
        manageClaims = new javax.swing.JPanel();
        side5 = new javax.swing.JPanel();
        manageSupplierlbl = new javax.swing.JLabel();
        manageSupplierIcon = new javax.swing.JLabel();
        insuranceAdmin = new javax.swing.JTabbedPane();
        organizationTab = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        oType = new UI.Components.Combobox();
        addOrganization = new UI.Components.Button();
        oName = new UI.Components.MyTextFieldLogin();
        employeeTab = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        oJTable = new javax.swing.JTable();
        oCombo = new UI.Components.Combobox();
        oEmployeeCombo = new UI.Components.Combobox();
        oEmpName = new UI.Components.MyTextFieldLogin();
        createEmployee = new UI.Components.Button();
        userAccountTab = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        oOrganization = new UI.Components.Combobox();
        oEmployee = new UI.Components.Combobox();
        oRole = new UI.Components.Combobox();
        userPass = new UI.Components.MyTextFieldLogin();
        uuserName = new UI.Components.MyTextFieldLogin();
        createUser = new UI.Components.Button();

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

        menuhide.setBackground(new java.awt.Color(51, 51, 51));
        menuhide.setLayout(new java.awt.BorderLayout());

        menuhide1.setBackground(new java.awt.Color(0, 91, 149));

        insuranceDashboard.setBackground(new java.awt.Color(0, 91, 149));
        insuranceDashboard.setPreferredSize(new java.awt.Dimension(220, 50));
        insuranceDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insuranceDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insuranceDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insuranceDashboardMouseExited(evt);
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
        statisticslbl.setText("Insurance Dashboard");

        statisticsimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statisticsimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/statisticsW_40px.png"))); // NOI18N

        javax.swing.GroupLayout insuranceDashboardLayout = new javax.swing.GroupLayout(insuranceDashboard);
        insuranceDashboard.setLayout(insuranceDashboardLayout);
        insuranceDashboardLayout.setHorizontalGroup(
            insuranceDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insuranceDashboardLayout.createSequentialGroup()
                .addComponent(side1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statisticsimg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statisticslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        insuranceDashboardLayout.setVerticalGroup(
            insuranceDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insuranceDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statisticslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(statisticsimg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        manageOrganization.setBackground(new java.awt.Color(0, 91, 149));
        manageOrganization.setPreferredSize(new java.awt.Dimension(220, 50));
        manageOrganization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageOrganizationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageOrganizationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageOrganizationMouseExited(evt);
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

        manageCompanylbl.setBackground(new java.awt.Color(51, 51, 51));
        manageCompanylbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageCompanylbl.setForeground(new java.awt.Color(255, 255, 255));
        manageCompanylbl.setText("Manage Organization");

        manageCompanyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageCompanyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/organization_40px.png"))); // NOI18N

        javax.swing.GroupLayout manageOrganizationLayout = new javax.swing.GroupLayout(manageOrganization);
        manageOrganization.setLayout(manageOrganizationLayout);
        manageOrganizationLayout.setHorizontalGroup(
            manageOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrganizationLayout.createSequentialGroup()
                .addComponent(side2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageCompanyIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageCompanylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageOrganizationLayout.setVerticalGroup(
            manageOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageOrganizationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageCompanylbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(manageCompanyIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        manageHolders.setBackground(new java.awt.Color(0, 91, 149));
        manageHolders.setPreferredSize(new java.awt.Dimension(220, 50));
        manageHolders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageHoldersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageHoldersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageHoldersMouseExited(evt);
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

        manageHolderlbl.setBackground(new java.awt.Color(51, 51, 51));
        manageHolderlbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageHolderlbl.setForeground(new java.awt.Color(255, 255, 255));
        manageHolderlbl.setText("Manage Employee");

        manageHolderIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageHolderIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/stock_share_40px.png"))); // NOI18N

        javax.swing.GroupLayout manageHoldersLayout = new javax.swing.GroupLayout(manageHolders);
        manageHolders.setLayout(manageHoldersLayout);
        manageHoldersLayout.setHorizontalGroup(
            manageHoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageHoldersLayout.createSequentialGroup()
                .addComponent(side3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageHolderIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageHolderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageHoldersLayout.setVerticalGroup(
            manageHoldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageHoldersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageHolderlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(manageHolderIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        managePolicies.setBackground(new java.awt.Color(0, 91, 149));
        managePolicies.setPreferredSize(new java.awt.Dimension(220, 50));
        managePolicies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managePoliciesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                managePoliciesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                managePoliciesMouseExited(evt);
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

        managePolicieslbl.setBackground(new java.awt.Color(51, 51, 51));
        managePolicieslbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        managePolicieslbl.setForeground(new java.awt.Color(255, 255, 255));
        managePolicieslbl.setText("Manage Policies");

        managePoliciesIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managePoliciesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/privacy_policy_40px.png"))); // NOI18N

        javax.swing.GroupLayout managePoliciesLayout = new javax.swing.GroupLayout(managePolicies);
        managePolicies.setLayout(managePoliciesLayout);
        managePoliciesLayout.setHorizontalGroup(
            managePoliciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managePoliciesLayout.createSequentialGroup()
                .addComponent(side4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(managePoliciesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(managePolicieslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        managePoliciesLayout.setVerticalGroup(
            managePoliciesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managePoliciesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(managePolicieslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(managePoliciesIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(side4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        manageClaims.setBackground(new java.awt.Color(0, 91, 149));
        manageClaims.setPreferredSize(new java.awt.Dimension(220, 50));
        manageClaims.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageClaimsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageClaimsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageClaimsMouseExited(evt);
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
        manageSupplierlbl.setText("Manage Claims");

        manageSupplierIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageSupplierIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vcare/icon/requirement_40px.png"))); // NOI18N

        javax.swing.GroupLayout manageClaimsLayout = new javax.swing.GroupLayout(manageClaims);
        manageClaims.setLayout(manageClaimsLayout);
        manageClaimsLayout.setHorizontalGroup(
            manageClaimsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageClaimsLayout.createSequentialGroup()
                .addComponent(side5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageSupplierIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageSupplierlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageClaimsLayout.setVerticalGroup(
            manageClaimsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageClaimsLayout.createSequentialGroup()
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
            .addComponent(insuranceDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(manageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(manageHolders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(managePolicies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(manageClaims, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuhide1Layout.setVerticalGroup(
            menuhide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhide1Layout.createSequentialGroup()
                .addComponent(insuranceDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageHolders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(managePolicies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageClaims, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuhide.add(menuhide1, java.awt.BorderLayout.CENTER);

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        insuranceAdmin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                insuranceAdminStateChanged(evt);
            }
        });

        organizationTab.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(217, 241, 255));

        organizationJTable.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        oType.setLabeText("Organization Type");

        addOrganization.setBackground(new java.awt.Color(0, 91, 149));
        addOrganization.setForeground(new java.awt.Color(255, 255, 255));
        addOrganization.setText("Add Organization");
        addOrganization.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrganizationActionPerformed(evt);
            }
        });

        oName.setLabelText("Organization Name");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(oType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(oName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(203, 203, 203))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(oType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(oName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(addOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        organizationTab.add(jPanel18, java.awt.BorderLayout.CENTER);

        insuranceAdmin.addTab("Organization", organizationTab);

        employeeTab.setBackground(new java.awt.Color(217, 241, 255));
        employeeTab.setLayout(new java.awt.BorderLayout());

        jPanel26.setBackground(new java.awt.Color(217, 241, 255));

        oJTable.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        oJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(oJTable);

        oCombo.setLabeText("Organization ");

        oEmployeeCombo.setLabeText("Organization ");

        oEmpName.setLabelText("Employee Name");

        createEmployee.setBackground(new java.awt.Color(0, 91, 149));
        createEmployee.setForeground(new java.awt.Color(255, 255, 255));
        createEmployee.setText("Create Employee");
        createEmployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(oCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(oEmpName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oEmployeeCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(createEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(oCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(oEmployeeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(oEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(createEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        employeeTab.add(jPanel26, java.awt.BorderLayout.CENTER);

        insuranceAdmin.addTab("Employee", employeeTab);

        userAccountTab.setLayout(new java.awt.BorderLayout());

        jPanel27.setBackground(new java.awt.Color(217, 241, 255));

        userJTable.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(userJTable);

        oOrganization.setLabeText("Organization ");
        oOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oOrganizationActionPerformed(evt);
            }
        });

        oEmployee.setLabeText("Employee");

        oRole.setLabeText("Role");

        userPass.setLabelText("Password");

        uuserName.setLabelText("Username");

        createUser.setBackground(new java.awt.Color(0, 91, 149));
        createUser.setForeground(new java.awt.Color(255, 255, 255));
        createUser.setText("Create User");
        createUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel27Layout.createSequentialGroup()
                        .addComponent(oOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createUser, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(oEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(uuserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(oRole, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(uuserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        userAccountTab.add(jPanel27, java.awt.BorderLayout.CENTER);

        insuranceAdmin.addTab("UserAccount", userAccountTab);

        getContentPane().add(insuranceAdmin, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void maxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMouseClicked
        if (maximized) {
            InsuranceAdmin.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            InsuranceAdmin.this.setMaximizedBounds(env.getMaximumWindowBounds());
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

    private void insuranceDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insuranceDashboardMouseClicked
       insuranceAdmin.setSelectedIndex(0);
    }//GEN-LAST:event_insuranceDashboardMouseClicked

    private void insuranceDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insuranceDashboardMouseEntered
        changecolor(insuranceDashboard, new Color(3,138,255));
        changecolor(side1, new Color(190, 224, 236));
    }//GEN-LAST:event_insuranceDashboardMouseEntered

    private void insuranceDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insuranceDashboardMouseExited
        changecolor(insuranceDashboard, new Color(0,91,149));
        changecolor(side1, new Color(0,91,149));
    }//GEN-LAST:event_insuranceDashboardMouseExited

    private void manageOrganizationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMouseClicked
        insuranceAdmin.setSelectedIndex(1);
    }//GEN-LAST:event_manageOrganizationMouseClicked

    private void manageOrganizationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMouseEntered
        changecolor(manageOrganization, new Color(3,138,255));
        changecolor(side2, new Color(190, 224, 236));
    }//GEN-LAST:event_manageOrganizationMouseEntered

    private void manageOrganizationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMouseExited
       changecolor(manageOrganization, new Color(0,91,149));
        changecolor(side2, new Color(0,91,149));
    }//GEN-LAST:event_manageOrganizationMouseExited

    private void manageHoldersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageHoldersMouseClicked
        insuranceAdmin.setSelectedIndex(2);
    }//GEN-LAST:event_manageHoldersMouseClicked

    private void manageHoldersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageHoldersMouseEntered
      changecolor(manageHolders, new Color(3,138,255));
        changecolor(side3, new Color(190, 224, 236));
    }//GEN-LAST:event_manageHoldersMouseEntered

    private void manageHoldersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageHoldersMouseExited
       changecolor(manageHolders, new Color(0,91,149));
        changecolor(side3, new Color(0,91,149));
    }//GEN-LAST:event_manageHoldersMouseExited

    private void managePoliciesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePoliciesMouseClicked
      insuranceAdmin.setSelectedIndex(3);
    }//GEN-LAST:event_managePoliciesMouseClicked

    private void managePoliciesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePoliciesMouseEntered
      changecolor(managePolicies, new Color(3,138,255));
        changecolor(side4, new Color(190, 224, 236));
    }//GEN-LAST:event_managePoliciesMouseEntered

    private void managePoliciesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managePoliciesMouseExited
        changecolor(managePolicies, new Color(0,91,149));
        changecolor(side4, new Color(0,91,149));
    }//GEN-LAST:event_managePoliciesMouseExited

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

    private void manageClaimsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageClaimsMouseClicked
        insuranceAdmin.setSelectedIndex(4);
    }//GEN-LAST:event_manageClaimsMouseClicked

    private void manageClaimsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageClaimsMouseEntered
        changecolor(managePolicies, new Color(3,138,255));
        changecolor(side5, new Color(190, 224, 236));
    }//GEN-LAST:event_manageClaimsMouseEntered

    private void manageClaimsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageClaimsMouseExited
        changecolor(managePolicies, new Color(0,91,149));
        changecolor(side5, new Color(0,91,149));
    }//GEN-LAST:event_manageClaimsMouseExited
private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationId();
            row[1] = organization.getName();
            
            model.addRow(row);
        }
    }
 private void populateCombo(){
        oType.removeAllItems();
        for (Organization.Type type : Organization.Type.values()){
            if (!type.getValue().equals(Organization.Type.Admin.getValue()))
                oType.addItem(type);
        }
    }
 
   public void populateOrganizationComboBox(){
        oCombo.removeAllItems();
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            oCombo.addItem(organization);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        oEmployeeCombo.removeAllItems();
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            oEmployeeCombo.addItem(organization);
        }
    }
    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) oJTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
        }
    }
   
    private void addOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrganizationActionPerformed
        Organization.Type type = (Organization.Type) oType.getSelectedItem();
        enterprise.getOrganizationDirectory().createOrganization(type,oName.getText());
        populateTable();
        populateTable();
    }//GEN-LAST:event_addOrganizationActionPerformed

    private void oOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oOrganizationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oOrganizationActionPerformed

    private void insuranceAdminStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_insuranceAdminStateChanged
         int index = insuranceAdmin.getSelectedIndex();
       
        System.out.print(index);
        switch (index) {
           
            case 0:
               populateTable();
               populateCombo();
                break;
            case 1:
               populateOrganizationComboBox();
               populateOrganizationEmpComboBox();
                break;
            case 2:
               
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_insuranceAdminStateChanged

    private void createEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEmployeeActionPerformed
        Organization organization = (Organization) oEmployeeCombo.getSelectedItem();
         if (oEmpName.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Do not enter an empty emplyee name!!!");
         }else if(oEmpName.getText().length()>25) {
             JOptionPane.showMessageDialog(null,"Please do not exceed the name by 25 characters !!!");
         }
         else{
        String name = oEmpName.getText();
        
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable(organization);
         }
    }//GEN-LAST:event_createEmployeeActionPerformed
public void popOrganizationComboBox() {
        oOrganization.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            oOrganization.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        oEmployee.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            oEmployee.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        oRole.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            oRole.addItem(role);
        }
    }
    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
        }
    }
    private void createUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserActionPerformed
         
         if (uuserName.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Do not enter an empty  name!!!");
             return;
         }
         else  if(uuserName.getText().length()>25) {
             JOptionPane.showMessageDialog(null,"Please do not exceed the name by 25 characters !!!");
             return;
         }
         else if (userPass.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Do not enter an empty password!!!");
             return;
         } else if(userPass.getText().length()>25) {
             JOptionPane.showMessageDialog(null,"Please do not exceed the password by 25 characters !!!");
             return;
         }
         else{
             
        String userName = uuserName.getText();
        String password = userPass.getText();
        Organization organization = (Organization) oOrganization.getSelectedItem();
        Employee employee = (Employee) oEmployee.getSelectedItem();
        Role role = (Role) oRole.getSelectedItem();
        
        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        
        
        popData();
         JOptionPane.showMessageDialog(null,"User created Successfully !!!");
         }
    }//GEN-LAST:event_createUserActionPerformed

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
//            java.util.logging.Logger.getLogger(Insurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Insurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Insurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Insurance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
//                new Insurance().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuIcon;
    private UI.Components.Button addOrganization;
    private javax.swing.JPanel buttonClose;
    private javax.swing.JLabel buttonLogout;
    private javax.swing.JPanel buttonMax;
    private javax.swing.JLabel buttonhidemenu;
    private javax.swing.JLabel close;
    private UI.Components.Button createEmployee;
    private UI.Components.Button createUser;
    private javax.swing.JPanel employeeTab;
    private javax.swing.JPanel header;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JPanel iconmaxclose;
    private javax.swing.JTabbedPane insuranceAdmin;
    private javax.swing.JPanel insuranceDashboard;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel lineSetting;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel manageClaims;
    private javax.swing.JLabel manageCompanyIcon;
    private javax.swing.JLabel manageCompanylbl;
    private javax.swing.JLabel manageHolderIcon;
    private javax.swing.JLabel manageHolderlbl;
    private javax.swing.JPanel manageHolders;
    private javax.swing.JPanel manageOrganization;
    private javax.swing.JPanel managePolicies;
    private javax.swing.JLabel managePoliciesIcon;
    private javax.swing.JLabel managePolicieslbl;
    private javax.swing.JLabel manageSupplierIcon;
    private javax.swing.JLabel manageSupplierlbl;
    private javax.swing.JLabel max;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel menuhide1;
    private UI.Components.Combobox oCombo;
    private UI.Components.MyTextFieldLogin oEmpName;
    private UI.Components.Combobox oEmployee;
    private UI.Components.Combobox oEmployeeCombo;
    private javax.swing.JTable oJTable;
    private UI.Components.MyTextFieldLogin oName;
    private UI.Components.Combobox oOrganization;
    private UI.Components.Combobox oRole;
    private UI.Components.Combobox oType;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JPanel organizationTab;
    private javax.swing.JPanel setting;
    private javax.swing.JPanel side1;
    private javax.swing.JPanel side2;
    private javax.swing.JPanel side3;
    private javax.swing.JPanel side4;
    private javax.swing.JPanel side5;
    private javax.swing.JLabel statisticsimg;
    private javax.swing.JLabel statisticslbl;
    private javax.swing.JPanel userAccountTab;
    private javax.swing.JTable userJTable;
    private UI.Components.MyTextFieldLogin userPass;
    private UI.Components.MyTextFieldLogin uuserName;
    // End of variables declaration//GEN-END:variables
}
