/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Alecs
 */
public class VK_Class {
    private Robot robot;

    public int VK_subscription()
    {   // находим кнопку "Подписаться" возвращаем ее Y координату, или -123  при отказе

        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice screen=env.getDefaultScreenDevice(); // GraphicsDevice класс описывает графические устройства, которые могут быть доступны в определенной среде графики.
        try {
            robot=new Robot(screen);
        } catch (AWTException ex) { }
        BufferedImage image_2 = robot.createScreenCapture(new Rectangle(720,50,1,750)); //именно это метод createScreenCapture у класса Robot позволяет нам получить часть изображения
        //  System.out.println("Контролька Адрес  + url");
        //  image_2 - картинка для анализа
        /**/ 
        int delta = 0;
        int count = 0;
        int result = -123;

        int j = 0;
        for(int i = 0; i < 750; i++ )
        {

            //System.out.println("ПОЗИЦИЯ "+ j + " " + i);       
            int c = image_2.getRGB(j, i);

            /*
            int  red = (c & 0x00ff0000) >> 16;
            int  green = (c & 0x0000ff00) >> 8;
            int  blue = c & 0x000000ff;
            System.out.println("Контролька Цвет int *" + c + " "+" " + i + " R="+red+" G="+green+" B="+blue);
            */
            if( c == -3353379 )
            {
                int pix1 = i+1;
                int pix2 = i+24;
                int pix3 = i+25;
                if( image_2.getRGB(j, pix1)== -9729620 &&  image_2.getRGB(j, pix2)== -9729620 &&  image_2.getRGB(j, pix3)== -3353379 )
                {
                    //System.out.println("ПОЗИЦИЯ " + i);
                    result = i+5+50;    // 5 - сместили на кнопу, 50 - обрезка верхней шапки браузера
                    break;
                }
            
              //System.out.println("Начало кнопы??? " + i + image_2.getRGB(j, pix1) +" "+  image_2.getRGB(j, pix2) +" "+  image_2.getRGB(j, pix3));
            }

        }

        try {
            ImageIO.write(image_2, "png", new File("d:\\455.png"));
           // System.out.println("Готово!");

        } catch (IOException e1) {
            //System.out.println("косяк");
        }
                
    return result;


    }    
    
}
