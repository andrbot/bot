/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Created by Alecs on 29.09.2014.
 */
public class RobotClass {
    public Robot robot;
    // "кирпички для действий бота  - всё с использованием Robot
   // private Robot robot;
    public RobotClass(){
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice screen=env.getDefaultScreenDevice(); // GraphicsDevice класс описывает графические устройства, которые могут быть доступны в определенной среде графики.
        try {
            robot=new Robot(screen);
        } catch (AWTException ex) { }

    }

    public void mouse_left_click( int x_pos, int y_pos)
    // Левый клик Мыши по координатам X, Y
    {
        robot.mouseMove(x_pos, y_pos); // двигаем мышку на заданную координату x,y
        robot.mousePress(InputEvent.BUTTON1_MASK); // нажимаем левую кнопку мыши
        robot.delay(300); // 300 миллисекундная пауза
        robot.mouseRelease(InputEvent.BUTTON1_MASK); // отжимаем левую кнопку мыши
        robot.delay(300); // 300 миллисекундная пауза
    }

    public void text_input_all( String text)
    // Ввод (замена)  текста
    {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress('A'); // нажимаем кнопу 'a' с клавиатуры
        robot.delay(100); // 100 миллисекундная пауза
        robot.keyRelease('A'); // отжимаем кнопу 'a' с клавиатуры
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DELETE);
        robot.delay(100);
        // Разборки с текстом START
        char[] text_chars = text.toCharArray();
        int text_length = text_chars.length;
        byte[] bytes = text.getBytes();

        for (int i = 0; i < text_length; i++) {
            switch(text_chars[i]) {
                case 'a':
                    robot.keyPress(KeyEvent.VK_A);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_A);
                    robot.delay(100);
                    break;
                case 'A':
                    /**/
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(50);
                    robot.keyPress(KeyEvent.VK_A);
                    robot.delay(50);
                    robot.keyRelease(KeyEvent.VK_A);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'b':
                    robot.keyPress(KeyEvent.VK_B);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_B);
                    robot.delay(100);
                    break;
                case 'B':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_B);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_B);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;

                case 'c':
                    robot.keyPress(KeyEvent.VK_C);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_C);
                    robot.delay(100);
                    break;
                case 'C':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_C);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_C);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'd':
                    robot.keyPress(KeyEvent.VK_D);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_D);
                    robot.delay(100);
                    break;
                case 'D':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(50);
                    robot.keyPress(KeyEvent.VK_D);
                    robot.delay(50);
                    robot.keyRelease(KeyEvent.VK_D);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'e':
                    robot.keyPress(KeyEvent.VK_E);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_E);
                    robot.delay(100);
                    break;
                case 'E':
                    /**/
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(50);
                    robot.keyPress(KeyEvent.VK_E);
                    robot.delay(50);
                    robot.keyRelease(KeyEvent.VK_E);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'f':
                    robot.keyPress(KeyEvent.VK_F);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_F);
                    robot.delay(100);
                    break;
                case 'F':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_F);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_F);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;

                case 'g':
                    robot.keyPress(KeyEvent.VK_G);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_G);
                    robot.delay(100);
                    break;
                case 'G':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_G);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_G);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'h':
                    robot.keyPress(KeyEvent.VK_H);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_H);
                    robot.delay(100);
                    break;
                case 'H':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(50);
                    robot.keyPress(KeyEvent.VK_H);
                    robot.delay(50);
                    robot.keyRelease(KeyEvent.VK_H);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'i':
                    robot.keyPress(KeyEvent.VK_I);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_I);
                    robot.delay(100);
                    break;
                case 'I':
                    /**/
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(50);
                    robot.keyPress(KeyEvent.VK_I);
                    robot.delay(50);
                    robot.keyRelease(KeyEvent.VK_I);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'k':
                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_K);
                    robot.delay(100);
                    break;
                case 'K':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_K);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;

                case 'l':
                    robot.keyPress(KeyEvent.VK_L);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_L);
                    robot.delay(100);
                    break;
                case 'L':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_L);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_L);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'm':
                    robot.keyPress(KeyEvent.VK_M);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_M);
                    robot.delay(100);
                    break;
                case 'M':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(50);
                    robot.keyPress(KeyEvent.VK_M);
                    robot.delay(50);
                    robot.keyRelease(KeyEvent.VK_M);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'n':
                    robot.keyPress(KeyEvent.VK_N);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_N);
                    robot.delay(100);
                    break;
                case 'N':
                    /**/
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(50);
                    robot.keyPress(KeyEvent.VK_N);
                    robot.delay(50);
                    robot.keyRelease(KeyEvent.VK_N);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'o':
                    robot.keyPress(KeyEvent.VK_O);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_O);
                    robot.delay(100);
                    break;
                case 'O':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_O);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_O);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;

                case 'p':
                    robot.keyPress(KeyEvent.VK_P);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_P);
                    robot.delay(100);
                    break;
                case 'P':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_P);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_P);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'q':
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_Q);
                    robot.delay(100);
                    break;
                case 'Q':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(50);
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.delay(50);
                    robot.keyRelease(KeyEvent.VK_Q);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'r':
                    robot.keyPress(KeyEvent.VK_R);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_R);
                    robot.delay(100);
                    break;
                case 'R':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(50);
                    robot.keyPress(KeyEvent.VK_R);
                    robot.delay(50);
                    robot.keyRelease(KeyEvent.VK_R);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 's':
                    robot.keyPress(KeyEvent.VK_S);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_S);
                    robot.delay(100);
                    break;
                case 'S':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_S);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_S);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;

                case 't':
                    robot.keyPress(KeyEvent.VK_T);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_T);
                    robot.delay(100);
                    break;
                case 'T':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_T);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_T);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'v':
                    robot.keyPress(KeyEvent.VK_V);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_V);
                    robot.delay(100);
                    break;
                case 'V':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(50);
                    robot.keyPress(KeyEvent.VK_V);
                    robot.delay(50);
                    robot.keyRelease(KeyEvent.VK_V);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'w':
                    robot.keyPress(KeyEvent.VK_W);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_W);
                    robot.delay(100);
                    break;
                case 'W':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(50);
                    robot.keyPress(KeyEvent.VK_W);
                    robot.delay(50);
                    robot.keyRelease(KeyEvent.VK_W);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'x':
                    robot.keyPress(KeyEvent.VK_X);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_X);
                    robot.delay(100);
                    break;
                case 'X':
                    /**/
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(50);
                    robot.keyPress(KeyEvent.VK_X);
                    robot.delay(50);
                    robot.keyRelease(KeyEvent.VK_X);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case 'y':
                    robot.keyPress(KeyEvent.VK_Y);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_Y);
                    robot.delay(100);
                    break;
                case 'Y':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_Y);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_Y);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;

                case 'z':
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_Z);
                    robot.delay(100);
                    break;
                case 'Z':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_Z);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;

                case '0':
                    robot.keyPress(KeyEvent.VK_0);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_0);
                    robot.delay(100);
                    break;
                case '1':
                    robot.keyPress(KeyEvent.VK_1);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_1);
                    robot.delay(100);
                    break;
                case '2':
                    robot.keyPress(KeyEvent.VK_2);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_2);
                    robot.delay(100);
                    break;
                case '3':
                    robot.keyPress(KeyEvent.VK_3);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_3);
                    robot.delay(100);
                    break;
                case '4':
                    robot.keyPress(KeyEvent.VK_4);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_4);
                    robot.delay(100);
                    break;
                case '5':
                    robot.keyPress(KeyEvent.VK_5);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_5);
                    robot.delay(100);
                    break;
                case '6':
                    robot.keyPress(KeyEvent.VK_6);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_6);
                    robot.delay(100);
                    break;
                case '7':
                    robot.keyPress(KeyEvent.VK_7);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_7);
                    robot.delay(100);
                    break;
                case '8':
                    robot.keyPress(KeyEvent.VK_8);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_8);
                    robot.delay(100);
                    break;
                case '9':
                    robot.keyPress(KeyEvent.VK_9);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_9);
                    robot.delay(100);
                    break;
                case '/':
                    robot.keyPress(KeyEvent.VK_SLASH);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SLASH);
                    robot.delay(100);
                    break;
                case '\\':
                    robot.keyPress(KeyEvent.VK_BACK_SLASH);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_BACK_SLASH);
                    robot.delay(100);
                    break;
                case '.':
                    robot.keyPress(KeyEvent.VK_DECIMAL );
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_DECIMAL );
                    robot.delay(100);
                    break;
                case ':':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_SEMICOLON ); // VK_SEMICOLON
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SEMICOLON );
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case '_':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_MINUS );
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_MINUS );
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.delay(100);
                    break;
                case '-':
                    robot.keyPress(KeyEvent.VK_MINUS );
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_MINUS );
                    robot.delay(100);
                    break;



            }
        }




    }

    public void key_ctrl_char( char key )
    // Клик ctrl + БУКВА
    {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(key); // нажимаем кнопу 'S' с клавиатуры
        robot.delay(100); // 100 миллисекундная пауза
        robot.keyRelease(key); // отжимаем кнопу 'S' с клавиатуры
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(100);
    }

    public void key_enter( int time_int )
    // Клик ентер)) // 100 миллисекундная пауза - рекомендованно
    {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(time_int ); // 100 миллисекундная пауза
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(time_int );
    }
    
    public void key_function( String key )
    {   // Нажатия функциональных кнопочек )))))  
            switch(key) {
                case "PageDown":
                    robot.keyPress(KeyEvent.VK_DOWN);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_DOWN);
                    robot.delay(100);
                    break; 
                case "PageUp":
                    robot.keyPress(KeyEvent.VK_UP);
                    robot.delay(100);
                    robot.keyRelease(KeyEvent.VK_UP);
                    robot.delay(100);
                    break;
            }
    }

    public void sleep( int time)
    // Пауза сколько нужно
    {
        robot.delay(time); // 1000 миллисекундная пауза
    }

    public void sleep_100()
    // Пауза 100
    {
        robot.delay(100); // 100 миллисекундная пауза
    }

}
