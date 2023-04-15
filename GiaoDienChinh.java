/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DAO.DanhMucDao;
import DAO.SanPhamDao;
import Model.DanhMuc;
import Model.SanPham;


public class GiaoDienChinh extends javax.swing.JFrame {

    ArrayList<SanPham> dssp;
    int row;
    
    /**
     * Creates new form GiaoDienChinh
     */
    public GiaoDienChinh() {
           
        initComponents();
        hienthilenlist();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listdanhmuc = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsanpham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmasp = new javax.swing.JTextField();
        txttensp = new javax.swing.JTextField();
        txtsoluong = new javax.swing.JTextField();
        txtdongia = new javax.swing.JTextField();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        cbodm = new javax.swing.JComboBox<>();
        btntoi = new javax.swing.JButton();
        btnlui = new javax.swing.JButton();
        txttim = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbltongsp = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("quan ly san pham");
        setBackground(new java.awt.Color(204, 255, 255));

        listdanhmuc.setForeground(new java.awt.Color(204, 0, 0));
        listdanhmuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listdanhmucMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listdanhmuc);

        tblsanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Masp", "TenSp", "SoLuong", "Đơn Giá"
            }
        ));
        tblsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsanphamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblsanpham);

        jLabel1.setText("Danh Mục");

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Mã Sản Phẩm");

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Tên Sản Phẩm");

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Số Lượng");

        jLabel5.setBackground(new java.awt.Color(204, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Đơn Giá");

        btnthem.setText("Thêm SP");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa SP");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa SP");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btntoi.setText(">");
        btntoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntoiActionPerformed(evt);
            }
        });

        btnlui.setText("<");
        btnlui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluiActionPerformed(evt);
            }
        });

        txttim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttimKeyPressed(evt);
            }
        });

        jLabel6.setText("Tim");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 204), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 204, 255), new java.awt.Color(255, 204, 204)));

        lbltongsp.setText("Tổng Số Lượng Sản Phẩm");
        lbltongsp.setToolTipText("Tong so san pham");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Computer warehouse management project");

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(lbltongsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbodm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnlui, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btntoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtdongia, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                        .addComponent(txtmasp)
                                        .addComponent(txttensp)
                                        .addComponent(txtsoluong)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnthem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnxoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnsua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbodm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(lbltongsp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmasp, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttensp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdongia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btntoi, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(btnlui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void hienthilentable()
{
     SanPhamDao spdao = new SanPhamDao();
       dssp= spdao.docdanhsachsptheodm(listdanhmuc.getSelectedValue().getMadm());
         DefaultTableModel dftbl = (DefaultTableModel)tblsanpham.getModel();
         dftbl.setRowCount(0);
         
         for(int i=0;i<dssp.size(); i++)
             //for (SanPham sp: dssp)
                 
         {/* Vector<Object> vec = new Vector<>();
           
            vec.add(dssp.get(i).getMasp());
            vec.add(dssp.get(i).getTensp());
              vec.add(dssp.get(i).getSoluong());
                vec.add(dssp.get(i).getDongia());
                  dftbl.addRow(vec);   
             */
      /*    cách 2
                  vec.add(sp.getMadm());
              vec.add(sp.getTensp());
                 vec.add(sp.getSoluong());
                 vec.add(sp.getDongia());
                 dftbl.addRow(vec);     
       */  
         //cách 3
         String masp=dssp.get(i).getMasp();
         String tensp=dssp.get(i).getTensp();
         int soluong=dssp.get(i).getSoluong();
         int dongia=dssp.get(i).getDongia();
         Object[] row= new Object[]{masp,tensp,soluong,dongia};
         dftbl.addRow(row);
         }
         
        cbodm.setSelectedItem(listdanhmuc.getSelectedValue());
}
    private void listdanhmucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listdanhmucMouseClicked
        // TODO add your handling code here:
       SanPhamDao sp = new SanPhamDao();
        hienthilentable();
        lbltongsp.setText("tong so sp: " + String.valueOf(sp.tongsp(listdanhmuc.getSelectedValue().getMadm())));
       
   //
   
   //
       
       
         
       
         
    }//GEN-LAST:event_listdanhmucMouseClicked

    private void tblsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsanphamMouseClicked
        // TODO add your handling code here:
 
        row = tblsanpham.getSelectedRow();
        if (row== -1) return ;
     SanPham sp = dssp.get(row);
     txttensp.setText(sp.getTensp()); // viet gon hon
     txtmasp.setText(dssp.get(row).getMasp());
     txtsoluong.setText(String.valueOf(sp.getSoluong()));
     //txtsoluong.setText(sp.getSoluong()+""); //viet gon hon
     txtdongia.setText(sp.getDongia()+ "");
     
      
     
     
     
     
    }//GEN-LAST:event_tblsanphamMouseClicked
 
 
   int toi=0;
   
   public void duyet(int toi)
   {
       txttensp.setText(dssp.get(toi).getTensp());
       txtmasp.setText(dssp.get(toi).getMasp());
       txtsoluong.setText(dssp.get(toi).getSoluong()+ "");
       txtdongia.setText(dssp.get(toi).getDongia()+"");
       
   }
    private void btntoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntoiActionPerformed
        // TODO add your handling code here:
     
      try
       {
        toi=tblsanpham.getSelectedRow();
        toi++;
        if (toi==dssp.size())
            toi=0;
         
        tblsanpham.setRowSelectionInterval(toi, toi);
      
        duyet(toi);
        
       }
       catch (Exception ex)
       {
            JOptionPane.showMessageDialog(null, "chọn vào danh sách");
       }
        
    }//GEN-LAST:event_btntoiActionPerformed

    int lui;
    private void btnluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluiActionPerformed
        // TODO add your handling code here:
         try
       {
        lui=tblsanpham.getSelectedRow();
        lui--;
        if (lui==0)
            lui=0;
         
        tblsanpham.setRowSelectionInterval(lui, lui);
      
        duyet(lui);
        
       }
       catch (Exception ex)
       {
            JOptionPane.showMessageDialog(null, "Đã về vị trí đầu tiên");
       }
        
    }//GEN-LAST:event_btnluiActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
       SanPham sp =  new SanPham();
       sp.setMadm(listdanhmuc.getSelectedValue().getMadm());
       sp.setMasp(txtmasp.getText());
       sp.setTensp(txttensp.getText());
         sp.setSoluong(Integer.parseInt(txtsoluong.getText()));
       sp.setDongia(Integer.parseInt(txtdongia.getText()));
       SanPhamDao spdao =new SanPhamDao() ;
       
       if (spdao.luusanpham(sp)>0 )
       {    
       JOptionPane.showMessageDialog(null, "lưu thành công");
       hienthilentable();
       }
       else
              JOptionPane.showMessageDialog(null, "lưu that bại");
       
       
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
    SanPham sp = new SanPham();
     sp.setMadm(cbodm.getItemAt(cbodm.getSelectedIndex()).getMadm());
        sp.setMasp(txtmasp.getText());
       sp.setTensp(txttensp.getText());
         sp.setSoluong(Integer.parseInt(txtsoluong.getText()));
       sp.setDongia(Integer.parseInt(txtdongia.getText()));
       SanPhamDao spdao =new SanPhamDao() ;
       if (spdao.capnhatsanpham(sp)>0 )
       {    
       JOptionPane.showMessageDialog(null, "câp nhật thành công");
       hienthilentable();
       }
       else
              JOptionPane.showMessageDialog(null, "cập nhật that bại,khong duoc sua ma");
       
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        int index = tblsanpham.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 Sản Phẩm trong bảng để xóa", "Thông Báo", 1);
            return;
        }
        SanPhamDao spdao = new SanPhamDao();
        
        int tk = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không");
      if (tk==JOptionPane.YES_OPTION)  
      {
        if (spdao.XoaSanPham(tblsanpham.getValueAt(index,0).toString()))
        {
            JOptionPane.showMessageDialog(this, "Xóa Sản Phẩm thành công", "Thông Báo", 1);
            hienthilentable();
        } else {
            JOptionPane.showMessageDialog(this, "Lỗi hệ thống", "Thông Báo", 0);
        }
        
      }
      else
      {
          return;
          
      }
        
    }//GEN-LAST:event_btnxoaActionPerformed

    private void txttimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimKeyPressed
        // TODO add your handling code here:
        SanPhamDao sp = new SanPhamDao();
              
        
        dssp=sp.timtheoten(txttim.getText());
         DefaultTableModel dftbl = (DefaultTableModel)tblsanpham.getModel();
         dftbl.setRowCount(0);
         
         for(int i=0;i<dssp.size(); i++)
             //for (SanPham sp: dssp)
                 
         {/* Vector<Object> vec = new Vector<>();
           
            vec.add(dssp.get(i).getMasp());
            vec.add(dssp.get(i).getTensp());
              vec.add(dssp.get(i).getSoluong());
                vec.add(dssp.get(i).getDongia());
                  dftbl.addRow(vec);   
             */
      /*    cách 2
                  vec.add(sp.getMadm());
              vec.add(sp.getTensp());
                 vec.add(sp.getSoluong());
                 vec.add(sp.getDongia());
                 dftbl.addRow(vec);     
       */  
         //cách 3
         String masp=dssp.get(i).getMasp();
         String tensp=dssp.get(i).getTensp();
         int soluong=dssp.get(i).getSoluong();
         int dongia=dssp.get(i).getDongia();
         Object[] row= new Object[]{masp,tensp,soluong,dongia};
         dftbl.addRow(row);
         }
         
        cbodm.setSelectedItem(listdanhmuc.getSelectedValue());
        
    }//GEN-LAST:event_txttimKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void hienthilenlist()
    {
        
       DanhMucDao dmDao = new DanhMucDao();
        Vector<DanhMuc> vec = dmDao.docdanhmuc();
        
      listdanhmuc.setListData(vec);
       
        DefaultComboBoxModel cbo = new DefaultComboBoxModel();
       
        for (DanhMuc dm : vec)
      { 
       
         cbo.addElement(dm);
         
      }
      cbodm.setModel(cbo);
     

    
    
    }
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
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlui;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntoi;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<DanhMuc> cbodm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltongsp;
    private javax.swing.JList<DanhMuc> listdanhmuc;
    private javax.swing.JTable tblsanpham;
    private javax.swing.JTextField txtdongia;
    private javax.swing.JTextField txtmasp;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txttensp;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables
}