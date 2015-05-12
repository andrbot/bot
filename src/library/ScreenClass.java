/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.sun.javafx.iio.ImageFrame;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import static java.lang.Math.abs;

/**
 *
 * @author Alecs
 */
public class ScreenClass {
    
    private Robot robot;

    public boolean Screen(int Pos_X, int Pos_Y, int Size_X, int Size_Y, int Level, String FileName, int[][] arr )
    {   // Делает Screen части экрана, записывает картинку в файл, приводит к ч/б матрице, сравнивает с шаблоном

        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice screen=env.getDefaultScreenDevice(); // GraphicsDevice класс описывает графические устройства, которые могут быть доступны в определенной среде графики.
        try {
            robot=new Robot(screen);
        } catch (AWTException ex) { }
        BufferedImage image_2 = robot.createScreenCapture(new Rectangle(Pos_X,Pos_Y,Size_X,Size_Y)); //именно это метод createScreenCapture у класса Robot позволяет нам получить часть изображения
        //  System.out.println("Контролька Адрес  + url");
        //  image_2 - картинка для анализа
        /**/ 
        int delta = 0;
        int count = 0;
        boolean result = false;
        //int control = 0;
        for(int j = 0; j < Size_X; j++ )
        {
            for(int i = 0; i < Size_Y; i++ )
            {
                //System.out.println("ПОЗИЦИЯ "+ j + " " + i);       
                int c = image_2.getRGB(j, i);
                //System.out.println("Контролька Цвет int" + c + " "+ j + " " + i);
                int  red = (c & 0x00ff0000) >> 16;
                int  green = (c & 0x0000ff00) >> 8;
                int  blue = c & 0x000000ff;
                float sum = ( red + green + blue )/3;
                /**/
                if( sum > Level) 
                {   
                    if(arr[i][j] == 1)
                    {// Пиксель правильный
                      delta++; // control = 1; 
                    }
                  else
                    {   // НЕВЕРНО
                        delta--;// control = -1;
                    }               
                
                }
     
   
                if( sum <= Level ) 
                {   
                    if( arr[i][j] == 0 )
                    {// Пиксель правильный
                       delta++;   // control = 2;
                    }
                    else
                    {   // НЕВЕРНО
                        delta--;  // control = -2;
                    }                
                }
                count++;
                
               // System.out.println("Км-> " /**/+ arr[i][j] + " Уп-> " + sum + " РЕШЕНИЕ " + control + " накопитель=" + delta );
            }
        }
        //System.out.println("Всего="+ count+" Правильных="+delta ); 
        float t1 = 0;
        float t2 = 0;
        t1 = (float) delta/count; 
        t2 = count*delta;
        //System.out.println("104 соотношение "+ t1 + "затрахан="+t2 + "стою Я на лыжах"+t3); 
        if ( count>0 && ( t1 > 0.75) ) result = true;
            /*   
                int x_pos_img = 12;
                int y_pos_img = 10;
                int c = image_2.getRGB(x_pos_img,y_pos_img);
                System.out.println("Контролька Цвет int" + c );
                int  red = (c & 0x00ff0000) >> 16;
                int  green = (c & 0x0000ff00) >> 8;
                int  blue = c & 0x000000ff;
// and the Java Color is ...
                Color color = new Color(red,green,blue);
                System.out.println("Контролька Цвет" + color );
                */
        try {
            ImageIO.write(image_2, "png", new File(FileName));
           // System.out.println("Готово!");

        } catch (IOException e1) {
            //System.out.println("косяк");
        }
                
    return result;


    }

    public void ScreenSearch_oKstart(int Pos_X, int Pos_Y, int Size_X, int Size_Y,  String FileName)
    {   // Поиск кнопы oK - типо начали просмотр видео
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice screen=env.getDefaultScreenDevice(); // GraphicsDevice класс описывает графические устройства, которые могут быть доступны в определенной среде графики.
        try {
            robot=new Robot(screen);
        } catch (AWTException ex) { }
        BufferedImage image_2 = robot.createScreenCapture(new Rectangle(Pos_X,Pos_Y,Size_X,Size_Y)); //именно это метод createScreenCapture у класса Robot позволяет нам получить часть изображения
        try {
            ImageIO.write(image_2, "png", new File(FileName));
           // System.out.println("Готово!");

        } catch (IOException e1) {
            //System.out.println("косяк");
        }         
    }
    
    public int[][] GetМatrix(int Pos_X, int Pos_Y, int Size_X, int Size_Y, int Level, String FileName, boolean save_pict/**/ )
    {   //  Делает Screen части экрана, возврашает 1/0 матрицу с учетом уровня раздела 
        //  записывает картинку в файл при необхрдимости ( параметр save_pict )
/**/
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice screen=env.getDefaultScreenDevice(); // GraphicsDevice класс описывает графические устройства, которые могут быть доступны в определенной среде графики.
        try {
            robot=new Robot(screen);
        } catch (AWTException ex) { }
        BufferedImage image_2 = robot.createScreenCapture(new Rectangle(Pos_X,Pos_Y,Size_X,Size_Y)); //именно это метод createScreenCapture у класса Robot позволяет нам получить часть изображения
        //  System.out.   println("Контролька Адрес  + url");
        //  image_2 - картинка для анализа
        
        int delta = 0;
        int count = 0;
         
        int arr[][] = new int[Size_Y][Size_X];
        //int arr[][] = new int[Pos_X][Pos_Y];
        /**/
        boolean result = false;
        //int control = 0;
        for(int j = 0; j < Size_X; j++ )
        {
            for(int i = 0; i < Size_Y; i++ )
            {
                //System.out.println("ПОЗИЦИЯ "+ j + " " + i);       
                int c = image_2.getRGB(j, i);
                //System.out.println("Контролька Цвет int" + c + " "+ j + " " + i);
                int  red = (c & 0x00ff0000) >> 16;
                int  green = (c & 0x0000ff00) >> 8;
                int  blue = c & 0x000000ff;
                float sum = ( red + green + blue )/3;
              
                if( sum > Level) 
                {   
                    arr[i][j] = 1;
                }
                else
                {   
                    arr[i][j] = 0;
                }                    

            }
        }

        if ( save_pict )
        {
            try {
                ImageIO.write(image_2, "png", new File(FileName));
                System.out.println("Готово!");

            } catch (IOException e1) {
                System.out.println("косяк");
            }        
        }     
    return arr;


    }
    
    public boolean CompareМatrix(int[][] m1, int[][] m2)
    {   //  Сравнение матриц
        int i1 = m1.length;
        int j1 = m1[0].length;
        int i2 = m2.length;
        int j2 = m2[0].length;
        boolean rezult = false;
        if( i1 != i2 ) return rezult;
        if( j1 != j2 ) return rezult;
        
        int delta = 0;
        int count = 0;
        //int control = 0;
        for(int i = 0; i < i1; i++ )
        {
            for(int j = 0; j < j1; j++ )
            {
               //System.out.println(i + " <> "+ j); 
                if( m1[i][j] == m2[i][j] )
                {
                    delta++;
                }
                else 
                {
                    delta--;
                }
                count++;
            }
        }
        //System.out.println(count + " <> "+ delta); 
        /* 
        float t1 = count/delta;
        */
               
           
                    float t1 = 0;
        float t2 = 0;
        t1 = (float) delta/count; 
        
        //System.out.println(t1 + "принято");     
        if( t1 > 0.75 ) 
        { 
            //System.out.println("принято"); 
            rezult = true; 
        }
        /*
        else
        {
            System.out.println("Отмена");        
        }
                */
        return rezult;
    }

    public int[][] captcha_smmok_save_pict( int Pos_X, int Pos_Y, int Size_X, int Size_Y, String ff)
    {   // Распознавание капчи для сайта smmok / пролучение цветной каритнки для фонового изображения

        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice screen=env.getDefaultScreenDevice(); // GraphicsDevice класс описывает графические устройства, которые могут быть доступны в определенной среде графики.
        try {
            robot=new Robot(screen);
        } catch (AWTException ex) { }
        BufferedImage image_2 = robot.createScreenCapture(new Rectangle(Pos_X,Pos_Y,Size_X,Size_Y)); //именно это метод createScreenCapture у класса Robot позволяет нам получить часть изображения
        String fn = "d:\\folder_bot\\"+ff+"455captcha.png";
        try {
            ImageIO.write(image_2, "png", new File(fn));
            System.out.println("Готово!265 Записали картинку");

        } catch (IOException e1) {
            //System.out.println("косяк");
        } 
        //  создаем массив - полноцветная матрица капчи
        int i = Size_X;
        int j = Size_Y;
        int[][] color_captcha = new int[j][i];
        for( i = 0; i < Size_X; i++ )
        {
            for( j = 0; j < Size_Y; j++ )
            {
                //System.out.println("ПОЗИЦИЯ "+ j + " " + i);       
                int c = image_2.getRGB(i, j);
               // System.out.println("Контролька Цвет int" + c + " "+ i + " " + j);
                color_captcha[j][i] = c;
                /*
                int  red = (c & 0x00ff0000) >> 16;
                int  green = (c & 0x0000ff00) >> 8;
                int  blue = c & 0x000000ff;
                float sum = ( red + green + blue )/3;
                if( sum > Level) 
                {   
                    if(arr[i][j] == 1)
                    {// Пиксель правильный
                      delta++; // control = 1; 
                    }
                  else
                    {   // НЕВЕРНО
                        delta--;// control = -1;
                    }               
                
                }
     
   
                if( sum <= Level ) 
                {   
                    if( arr[i][j] == 0 )
                    {// Пиксель правильный
                       delta++;   // control = 2;
                    }
                    else
                    {   // НЕВЕРНО
                        delta--;  // control = -2;
                    }                
                }
                count++;
                */
               // System.out.println("Км-> " /**/+ arr[i][j] + " Уп-> " + sum + " РЕШЕНИЕ " + control + " накопитель=" + delta );
            }
            
        }
        /*
            for( j = 0; j < Size_Y; j++ )
            {
                //System.out.println("ПОЗИЦИЯ "+ j + " " + i);       
                image_2.setRGB(8, j, -1447710);
                image_2.setRGB(9, j, -15689777);
                image_2.setRGB(7, j, -1447710);
            }
            try {
                ImageIO.write(image_2, "png", new File("d:\\4556captcha.png"));
                System.out.println("Готово!");

            } catch (IOException e1) {
                System.out.println("косяк");
            } 
*/
                
    return color_captcha;


    } 
    
    public int[][] captcha_smmok( int Pos_X, int Pos_Y, int Size_X, int Size_Y, int[][]captcha_background)
    {   // Распознавание капчи для сайта smmok
        
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice screen=env.getDefaultScreenDevice(); // GraphicsDevice класс описывает графические устройства, которые могут быть доступны в определенной среде графики.
        try {
            robot=new Robot(screen);
        } catch (AWTException ex) { }
        BufferedImage image_2 = robot.createScreenCapture(new Rectangle(Pos_X,Pos_Y,Size_X,Size_Y)); //именно это метод createScreenCapture у класса Robot позволяет нам получить часть изображения
        String fn = "d:\\folder_bot\\ff455captcha.png";
        try {
            ImageIO.write(image_2, "png", new File(fn));
            System.out.println("Готово!265 Записали картинку");

        } catch (IOException e1) {
            //System.out.println("косяк");
        }
        //  создаем массив - полноцветная матрица капчи
        int i = Size_X;
        int j = Size_Y;
        int rez = 0;
        int[][] captchaBW = new int[j][i];
        for( i = 0; i < Size_X; i++ )
        {
            for( j = 0; j < Size_Y; j++ )
            {
                int c = image_2.getRGB(i, j);
                int  red_2 = (c & 0x00ff0000) >> 16;
                int  green_2 = (c & 0x0000ff00) >> 8;
                int  blue_2 = c & 0x000000ff;

                int  red_1 = (captcha_background[j][i] & 0x00ff0000) >> 16;
                int  green_1 = (captcha_background[j][i] & 0x0000ff00) >> 8;
                int  blue_1 = captcha_background[j][i] & 0x000000ff;                
                rez = abs( red_2-red_1) + abs( green_2-green_1) + abs( blue_2-blue_1);
                if( rez < 100 )
                {
                captchaBW[j][i] = 1;
                }
                else
                { captchaBW[j][i] = 0; }
                System.out.println(c +" #-# "+captcha_background[j][i]+"  "+rez+"  "+ j + " " + i);
            }
            
        }

                
    return captchaBW;


    }     


    
}
