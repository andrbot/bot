package library;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alecs
 */
public class Actions_file {
    public int[][] GetCSV( String csvFile ) throws IOException
    {   //  Приходит абсолютный путь к файлу CSV,  Возврашается - массив INT        
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ";";
        ArrayList<String> catnamesList = new ArrayList<String>();
        int[][] arr_rez = null;
 
	try {
		br = new BufferedReader(new FileReader(csvFile));
                String[] Row_arr = null;  //  Строка из файла
                int i=0;    //  Счетчик строк
		while ((line = br.readLine()) != null) 
                {
                    catnamesList.add(line);
		}
         
                i = catnamesList.size();
                /**/
                String Row_text = catnamesList.get(0);
                Row_arr = Row_text.split(cvsSplitBy);
                int j = Row_arr.length;
                arr_rez = new int[i][j];
                
                for( int k = 0; k<i; k++ )
                {   //  Перебор по строкам
                    Row_text = catnamesList.get(k);
                    Row_arr = Row_text.split(cvsSplitBy);                    
                        for( int m = 0; m<j; m++ )
                        {   //  Перебор по ячейкам
                            arr_rez[k][m] = Integer.valueOf(Row_arr[m]);
                        }
                }
 
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
 
	//System.out.println("Done");
        return arr_rez;
    }
    
    public void SaveCSV( int[][] CSV_ARR, String csvFile )
    {   //  Запись массива как CSV
        int i = CSV_ARR.length; //  Строк в массиве
        int j = CSV_ARR[0].length;  //  Столбцов в массиве
        String str = "";    //  Накопитель результата
        for( int ii=0; ii<i; ii++)
        {
            for( int jj=0; jj<j; jj++)
            {
                str = str  + Integer.toString(CSV_ARR[ii][jj])+";"; 
            }
            str = str + "\n";
        }
        
        //  запись в файл.  Определяем файл
        File file = new File(csvFile);

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                out.print(str);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    
    }
    
}

