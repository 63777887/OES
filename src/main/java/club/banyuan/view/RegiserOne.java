package club.banyuan.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static club.banyuan.controller.CheckRegister.*;

class RegisterOne extends javax.swing.JFrame {

    /**
     * Creates new form zhuce
     */
    public RegisterOne() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        regUserName = new javax.swing.JLabel();
        regUserNameInput = new javax.swing.JTextField();
        regPassword = new javax.swing.JLabel();
        regPasswordInput = new javax.swing.JTextField();
        regName = new javax.swing.JLabel();
        regNameInput = new javax.swing.JTextField();
        regId = new javax.swing.JLabel();
        regIdInput = new javax.swing.JTextField();
        regEmail = new javax.swing.JLabel();
        regEmailInput = new javax.swing.JTextField();
        regAddBatton = new javax.swing.JButton();
        regTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        regUserName.setText("用户名：");

        regUserNameInput.setToolTipText("字母开头,允许5-16字节,允许字母数字下划线");

        regPassword.setText("密   码：");

        regPasswordInput.setToolTipText("必须包含大小写字母和数字的组合,不能使用特殊字符,长度在 8-16 之间");

        regName.setText("姓   名：");

        regNameInput.setToolTipText("支持少数民族和生僻字,长度2-20之间,少数民族中间使用·");

        regId.setText("学   号：");

        regIdInput.setToolTipText("至少1位数字");

        regEmail.setText("邮   箱：");

        regAddBatton.setText("注册");
        regAddBatton.setToolTipText("");
        regAddBatton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkUserName(regUserNameInput.getText());
                if (checkUserName(regUserNameInput.getText())&&checkPwd(regPasswordInput.getText())&&checkName(regNameInput.getText())&&checkStuNum(regIdInput.getText())&&checkEmail(regEmailInput.getText())) {
                    JOptionPane.showMessageDialog(new javax.swing.JLabel(),"注册成功！");
                    System.out.println(checkUserName(regUserName.getText()));
                    dispose();
                    Login.loginwin.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(new javax.swing.JLabel(),"输入不合法，不符合规定字段已被重置");
                    if (!checkUserName(regUserNameInput.getText())) {
                        regUserNameInput.setText("");
                    }
                    if (!checkPwd(regPasswordInput.getText())) {
                        regPasswordInput.setText("");
                    }
                    if (!checkName(regNameInput.getText())) {
                        regNameInput.setText("");
                    }
                    if (!checkStuNum(regIdInput.getText())) {
                        regIdInput.setText("");
                    }
                    if (!checkEmail(regEmailInput.getText())) {
                        regEmailInput.setText("");
                    }
                }
            }
        });

        regTitle.setFont(new java.awt.Font("Lucida Grande", 0, 28)); // NOI18N
        regTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regTitle.setText("注  册");
        regTitle.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        regTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(regId)
                                                                .addGap(27, 27, 27)
                                                                .addComponent(regIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(regName)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(regNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(regPassword)
                                                                        .addGap(27, 27, 27)
                                                                        .addComponent(regPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(regUserName)
                                                                .addGap(27, 27, 27)
                                                                .addComponent(regUserNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(regEmail)
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(regEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(regAddBatton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(68, 68, 68))))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(87, 87, 87)
                                                .addComponent(regTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(regTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(regUserName)
                                        .addComponent(regUserNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(regPassword)
                                        .addComponent(regPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(regName)
                                        .addComponent(regNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(regId)
                                        .addComponent(regIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(regEmail)
                                        .addComponent(regEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(regAddBatton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    /**
     */
    public static void start() {
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
            java.util.logging.Logger.getLogger(RegisterOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton regAddBatton;
    private javax.swing.JLabel regEmail;
    private javax.swing.JTextField regEmailInput;
    private javax.swing.JLabel regId;
    private javax.swing.JTextField regIdInput;
    private javax.swing.JLabel regName;
    private javax.swing.JTextField regNameInput;
    private javax.swing.JLabel regPassword;
    private javax.swing.JTextField regPasswordInput;
    private javax.swing.JLabel regTitle;
    private javax.swing.JLabel regUserName;
    private javax.swing.JTextField regUserNameInput;
    // End of variables declaration
}