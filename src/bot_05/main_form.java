package bot_05;
/*
2015-01-19  Предположительно остановился - паркет стукает

Нужен контроль "Скрол есть или нет"

Все вступления, подписки  на КОНТАКТ - одной процедурой сделать, на разных кликерах - нет четкого разделения
Скрины по возможности делать одного размера - меньше массивов обьявлять прийдется

Написанный код - не идеален, нужно проосматривать, чистить, оптимизировать.


*/


import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


import  library.Actions_file;
import library.ScreenClass;
import library.RobotClass;
import library.VK_Class;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alecs
 */
public class main_form extends javax.swing.JFrame {
    Actions_file action_file = new Actions_file();
    ScreenClass SC = new ScreenClass();
    RobotClass RC = new RobotClass();
    VK_Class VK = new VK_Class();

    /**
     * Creates new form main_form
     */
    public main_form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("123");
        setAlwaysOnTop(true);
        setIconImages(null);

        jLabel1.setText("jTextField1");

        jLabel2.setText("jTextField2");

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Матрица");
        jButton9.setToolTipText("");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jScrollPane1.setMinimumSize(new java.awt.Dimension(500, 370));
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 350));
        jScrollPane1.setRequestFocusEnabled(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton8)
                            .addComponent(jButton9)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //  Демо - файл в массив
        try {
            // TODO add your handling code here:
            String File_name = jTextField1.getText();
            jTextArea1.setText("че-то есть (клик по кнопке)  jTextField1 - абсолютный путь к файлу \n");
            /**/
            int[][] t3 = action_file.GetCSV( File_name );    //  Пришел массивчик
            int t1 = t3.length;
            int t2 = t3[0].length;
            jTextArea1.append("Пришел массив: строк=" + t1 + ", столбцов=" + t2 + "\n");
            String a = new String();
            
            for( int i = 0; i<t1; ++i )
            {
                for( int j = 0; j<t2; ++j )
                {
                    a = a + Integer.toString(t3[i][j]);
                }
                a = a + "\n";
                        
            }
            jTextArea1.append(a);


 
            
        } catch (IOException ex) {
            Logger.getLogger(main_form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //  Получение матрицы зоны экрана
        jTextArea1.setText("Получение матрицы скрина экрана.\n jTextField1 - вводим через ',':\n X - Старт\n Y - Старт\n W - ширина\n H - высота\n Q - порог");
        jTextArea1.append("jTextField2 - абсолютное имя файла\n");
        String source1 = jTextField1.getText();
        String file_name = jTextField2.getText();
        String[] side_str = source1.split(",");
        int i = side_str.length;
        int[] side_num = new int[i];
        for( int j = 0; j < i; j++)
        {
            
            
            side_num[j] = parseInt(side_str[j]);
            System.out.println(j+"  "+side_num[j]); //
        }
        String str = "";
        
        
        int matr1[][]; 
        matr1  = SC.GetМatrix(side_num[0], side_num[1], side_num[2], side_num[3], side_num[4], file_name, true /**/);
        i = matr1.length;
        int j = matr1[0].length;
        
        for( int ii=0; ii<i; ii++)
        {
            for( int jj=0; jj<j; jj++)
            {
                str = str  + Integer.toString(matr1[ii][jj])+";"; 
            }
            str = str + "\n";
        }
       /* */
        jTextArea1.append(str);
        
        
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("Анализируем, какое задание\n");
        int matr1[][] = SC.GetМatrix(140,739,72,12,127, "вЖ\\455.png", false);
        int[][] t3 = null;
        try { 
            t3 = action_file.GetCSV( "D:\\folder_bot\\matrix\\smmok_task_subscription.csv" );
        } catch (IOException ex) {
            Logger.getLogger(main_form.class.getName()).log(Level.SEVERE, null, ex);
        }
        Boolean rez = SC.CompareМatrix(matr1, t3);
        if(rez)
        {
            jTextArea1.append("Наше задание");
            
        }
        else
        {
            jTextArea1.append("Чужое задание");            
        }            

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea1.setText("Анализируем, какое задание\n");
         
        int MatrixScan[][] = SC.GetМatrix(431,482,185,12,127, "", false);
        Boolean task_identify = false;  // Задание распознанно 
        Boolean task_done = false; // Задание выполненно
        int[][] MatrixTemp = null;
        int[][] MatrixTemp_oK = null;
        int[][] MatrixTemp_err = null;  //  ошибка системы При принятии задания
        try { 
            MatrixTemp = action_file.GetCSV( "D:\\folder_bot\\matrix\\smmka_task_subscription.csv" );
        } catch (IOException ex) {
            Logger.getLogger(main_form.class.getName()).log(Level.SEVERE, null, ex);
        }
        task_identify = SC.CompareМatrix(MatrixScan, MatrixTemp);
        if(task_identify)
        {      //  ЗАДАНИЕ - Подписаться
            System.out.println("ЗАДАНИЕ - Подписаться");
            jTextArea1.append("Наше задание - Подписаться"+"\n");    
            RC.mouse_left_click( 135, 489);
            RC.key_ctrl_char('A');
            RC.key_ctrl_char('C');
            RC.key_ctrl_char('T');
            RC.key_ctrl_char('V');
            RC.key_enter(1000);
            int btn_Y = VK.VK_subscription();  
            jTextArea1.append("Высота= "+btn_Y+"\n"); 
            if( btn_Y > 0 )
            {
                RC.mouse_left_click( 890, btn_Y);
                btn_Y = btn_Y - 12;
                RC.sleep(2000);
                int MatrixScan_oK[][] = SC.GetМatrix(715,btn_Y,100,12,127, "d:\\455.png", true);
                try { 
                    MatrixTemp_oK = action_file.GetCSV( "D:\\folder_bot\\matrix\\smmka_task_embark_ok.csv" );
                } catch (IOException ex) {
                    Logger.getLogger(main_form.class.getName()).log(Level.SEVERE, null, ex);
                }
                task_done = SC.CompareМatrix(MatrixScan_oK, MatrixTemp_oK);
            }


            // По любому закрываем окно, решено или нет - task_done
            RC.key_ctrl_char('W');
        }
        if( !task_identify )
        {   //  по первому варианту - задание не опознанно
            //   ЗАДАНИЕ - Вступить
        
            try { 
                MatrixTemp = action_file.GetCSV( "D:\\folder_bot\\matrix\\smmka_task_embark.csv" );
            } catch (IOException ex) {
                Logger.getLogger(main_form.class.getName()).log(Level.SEVERE, null, ex);
            }
            task_identify = SC.CompareМatrix(MatrixScan, MatrixTemp); 
            if(task_identify)
            {   //  Вступить в группу
                System.out.println("ЗАДАНИЕ - Вступить");    
                jTextArea1.append("Наше задание - Вступить в группу\n"); 
                RC.mouse_left_click( 135, 489);
                RC.key_ctrl_char('A');
                RC.key_ctrl_char('C');
                RC.key_ctrl_char('T');
                RC.key_ctrl_char('V');
                RC.key_enter(2000);
                System.out.println("Сделали картинку370");
                int btn_Y = VK.VK_subscription();  
                jTextArea1.append("Высота= "+btn_Y+"\n"); 
                if( btn_Y > 0 )
                {
                    System.out.println("Есть кнопа 375");
                    RC.mouse_left_click( 890, btn_Y);
                    btn_Y = btn_Y - 12;
                    RC.sleep(2000);
                    int MatrixScan_oK[][] = SC.GetМatrix(715,btn_Y,100,12,127, "d:\\4556.png", true);
                    try { 
                        MatrixTemp_oK = action_file.GetCSV( "D:\\folder_bot\\matrix\\smmka_task_embark_ok.csv" );
                    } catch (IOException ex) {
                        Logger.getLogger(main_form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    task_done = SC.CompareМatrix(MatrixScan_oK, MatrixTemp_oK);
                }
                
                
                // По любому закрываем окно, решено или нет - task_done
                RC.key_ctrl_char('W');

                
            }
        }
        
        if( task_identify )
        {   //  Задание распознано
         // Окна закрыты, отлаваливаем появление  "Подтвердить" Бесконечный цикл - низя!
            for(int i=0; i<10; i++)
            {   System.out.println("Финальный цикл "+i);
                RC.sleep(1500);
                int MatrixScan_oK[][] = SC.GetМatrix(609,638,80,12,240, "d:\\455.png", false);
                try { 
                    MatrixTemp_oK = action_file.GetCSV( "D:\\folder_bot\\matrix\\smmka_task__ok.csv" );
                } catch (IOException ex) {
                    Logger.getLogger(main_form.class.getName()).log(Level.SEVERE, null, ex);
                }
                Boolean task = SC.CompareМatrix(MatrixScan_oK, MatrixTemp_oK);
                if( task )
                {   //  Есть  Кнопочка "Подтвердить"
                    System.out.println("label_297_task_done=" + task_done);
                    if(task_done)
                    {   //  Задача выполненна, подтверждаем  
                        RC.mouse_left_click( 620, 638 );
                        System.out.println("label_414 левый клик, пауза 1,5сек");
                        RC.sleep(1500);
                        
                        //  проверяем ответ сайта
                        int MatrixScan_err[][] = SC.GetМatrix(480,409,100,12,127, "d:\\455.png", false);  
                        try { 
                            MatrixTemp_err = action_file.GetCSV( "D:\\folder_bot\\matrix\\smmka_err_group.csv" );
                        } catch (IOException ex) {
                            Logger.getLogger(main_form.class.getName()).log(Level.SEVERE, null, ex);
                        } 
                        Boolean task_err = SC.CompareМatrix(MatrixScan_err, MatrixTemp_err);
                        System.out.println("Проверяем -> Вы не вступили в группу(((результат распознавания-> " + task_err);
                        if(task_err)
                        {
                            System.out.println("Система не принимает задачу(((" );
                            RC.mouse_left_click( 686, 484 );    // Клик на кнопке "Закрыть"
                            RC.mouse_left_click( 951, 488 );    // Клик на крестике - отказ
                            break;
                        }

                        //  Проверяем "Данное задание больше не будет отображаться ."
                        MatrixScan_err = SC.GetМatrix(416,424,100,12,127, "d:\\455.png", false);
                        try { 
                            MatrixTemp_err = action_file.GetCSV( "D:\\folder_bot\\matrix\\smmka_err_task.csv" );
                        } catch (IOException ex) {
                            Logger.getLogger(main_form.class.getName()).log(Level.SEVERE, null, ex);
                        } 
                        task_err = SC.CompareМatrix(MatrixScan_err, MatrixTemp_err);
                        if(task_err)
                        {
                            System.out.println("Система не принимает задачу(((\n");
                            RC.mouse_left_click( 580, 500 );    // Клик на кнопке "Закрыть"
                            RC.mouse_left_click( 951, 488 );    // Клик на крестике - отказ
                            break;
                        }                        



                    }
                    else
                    {
                        System.out.println("Отказ от задачи\n");
                        RC.mouse_left_click( 720, 638 );    // Клик на кнопке "Закрыть"
                        RC.mouse_left_click( 951, 488 );    // Клик на крестике - отказ
                        RC.mouse_left_click( 580, 500 );    // Клик на "Подтверждаю"
                    }

                }

            }       
        }
        else
        {
            System.out.println("нет распознаных заданий"); 
        }    
        

        
        System.out.println("Завершили line388"); 
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        System.out.println("Иммитация PageDown, получаем первый скрин");
        RC.mouse_left_click(1000, 35);  // Активируем окно
        RC.key_function("PageDown");
        
        jTextArea1.setText("Распознавание капчи для сайта smmok .\n jTextField1 - вводим через ',':\n X - Старт\n Y - Старт\n W - ширина\n H - высота\n");
        String source1 = jTextField1.getText();
        String[] side_str = source1.split(",");
        int i = side_str.length;
        int[] side_num = new int[i];
        for( int j = 0; j < i; j++)
        {
            side_num[j] = parseInt(side_str[j]);
            System.out.println(j+"  "+side_num[j]); //
        }
        int[][] captcha_color = SC.captcha_smmok_save_pict(side_num[0], side_num[1], side_num[2], side_num[3], "88");
        action_file.SaveCSV(captcha_color, "D:\\folder_bot\\captcha1.csv");
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.out.println("Иммитация PageDown, получаем втрой скрин");
        RC.mouse_left_click(1000, 35);  // Активируем окно
        RC.key_function("PageDown");
        
        jTextArea1.setText("Распознавание капчи для сайта smmok .\n jTextField1 - вводим через ',':\n X - Старт\n Y - Старт\n W - ширина\n H - высота\n");
        String source1 = jTextField1.getText();
        String[] side_str = source1.split(",");
        int i = side_str.length;
        int[] side_num = new int[i];
        for( int j = 0; j < i; j++)
        {
            side_num[j] = parseInt(side_str[j]);
            System.out.println(j+"  "+side_num[j]); //
        }
        int[][] captcha_color = SC.captcha_smmok_save_pict(side_num[0], side_num[1], side_num[2], side_num[3], "77");
        action_file.SaveCSV(captcha_color, "D:\\folder_bot\\captcha2.csv");        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.out.println("Иммитация PageDown, получаем третий скрин");
        RC.mouse_left_click(1000, 35);  // Активируем окно
        RC.key_function("PageDown");
        
        jTextArea1.setText("Распознавание капчи для сайта smmok .\n jTextField1 - вводим через ',':\n X - Старт\n Y - Старт\n W - ширина\n H - высота\n");
        String source1 = jTextField1.getText();
        String[] side_str = source1.split(",");
        int i = side_str.length;
        int[] side_num = new int[i];
        for( int j = 0; j < i; j++)
        {
            side_num[j] = parseInt(side_str[j]);
            System.out.println(j+"  "+side_num[j]); //
        }
        int[][] captcha_color = SC.captcha_smmok_save_pict(side_num[0], side_num[1], side_num[2], side_num[3], "6");
        action_file.SaveCSV(captcha_color, "D:\\folder_bot\\captcha3.csv");  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String source1 = jTextField2.getText();
        int DELTA = parseInt(source1);
        try {
            // Вычисление фоновой картинки
            int[][] captcha_background = action_file.GetCSV("D:\\folder_bot\\captcha_background.csv");
            int[][] captcha1 = action_file.GetCSV("D:\\folder_bot\\captcha1.csv");
            int[][] captcha2 = action_file.GetCSV("D:\\folder_bot\\captcha2.csv");
            int[][] captcha3 = action_file.GetCSV("D:\\folder_bot\\captcha3.csv");
            int count=0;
            BufferedImage image_captcha = null;  //    итоговая картинка фона капчи
            Robot robot = new Robot();
            image_captcha = robot.createScreenCapture(new Rectangle(1,1,210,50));
            int ii = captcha1.length;
            int jj = captcha1[0].length; 
            for( int i = 0; i<ii; i++ )
            {
                for( int j=0; j<jj; j++)
                {
                    image_captcha.setRGB(j, i, captcha_background[i][j]);
                    int  red_3 = (captcha3[i][j] & 0x00ff0000) >> 16;
                    int  green_3 = (captcha3[i][j] & 0x0000ff00) >> 8;
                    int  blue_3 = captcha3[i][j] & 0x000000ff;
                    
                    int  red_1 = (captcha1[i][j] & 0x00ff0000) >> 16;
                    int  green_1 = (captcha1[i][j] & 0x0000ff00) >> 8;
                    int  blue_1 = captcha1[i][j] & 0x000000ff;

                    int  red_2 = (captcha2[i][j] & 0x00ff0000) >> 16;
                    int  green_2 = (captcha2[i][j] & 0x0000ff00) >> 8;
                    int  blue_2 = captcha2[i][j] & 0x000000ff;
                    
                    int delta_1 = abs( red_3-red_1) + abs( green_3-green_1) + abs( blue_3-blue_1);
                    int delta_2 = abs( red_3-red_2) + abs( green_3-green_2) + abs( blue_3-blue_2);
                    int delta_3 = abs( red_2-red_1) + abs( green_2-green_1) + abs( blue_2-blue_1);
                    
                    if( /*(delta_1<DELTA) && (delta_2<DELTA) &&*/ (delta_3<DELTA) )
                    {  //   На ТРЕХ картинках пиксель совпал
                        if( captcha_background[i][j] == -1 )
                        {
                            image_captcha.setRGB(j, i, captcha1[i][j]);
                            captcha_background[i][j] = captcha1[i][j];
                            count++;  
                            
                        }    

                    }

                }
            }
            action_file.SaveCSV(captcha_background, "D:\\folder_bot\\captcha_background.csv");
            System.out.println("Совпавших пикселей-> "+count); //
            try {
                ImageIO.write(image_captcha, "png", new File("d:\\folder_bot\\captcha_background.png"));
                System.out.println("Готово!");

            } catch (IOException e1) {
                System.out.println("косяк");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(main_form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AWTException ex) {
            Logger.getLogger(main_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // перевод цветной капчи в ч/б
        System.out.println("Иммитация PageDown, получаем третий скрин");
        RC.mouse_left_click(1000, 35);  // Активируем окно
        RC.key_function("PageDown");
        
        jTextArea1.setText("Распознавание капчи для сайта smmok .\n jTextField1 - вводим через ',':\n X - Старт\n Y - Старт\n W - ширина\n H - высота\n парамерт в первое поле ->140,660,210,50\n параметр во второе поле 15 ???? ");
        String source1 = jTextField1.getText();
        String[] side_str = source1.split(",");
        int i = side_str.length;
        int[] side_num = new int[i];
        for( int j = 0; j < i; j++)
        {
            side_num[j] = parseInt(side_str[j]);
            System.out.println(j+"  "+side_num[j]); //
        }
        
        try {
           int[][] captcha_background = action_file.GetCSV("D:\\folder_bot\\captcha_background.csv");    
        
           int[][] captchaBW = SC.captcha_smmok(side_num[0], side_num[1], side_num[2], side_num[3], captcha_background );            
           action_file.SaveCSV(captchaBW, "D:\\folder_bot\\captcha_bw.csv"); 
            
        } catch (IOException ex) {
            Logger.getLogger(main_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(main_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_form().setVisible(true);
                
                
            }
        });
        //  Типо свой код

        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables





}
