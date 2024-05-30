/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.poetry.io;

import java.io.*;

public class PoemClient {

    /**
     * To run one method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
         readPoem();
//         writePoem();
    }

    /**
     * TASK: read all the lines in file 'famous-poem.txt' and print them.
     *
     * Avoid the temptation to open the file in the IDE first.
     * You'll see the poem once you get your code working(!)
     *
     * This file is in the module's root directory, which is the current / working
     * directory at runtime.  Therefore, the path to the file is just the filename.
     *
     * Use a BufferedReader wrapped around a FileReader.
     * The try-with-resources below allows you to initialize the stream and auto-close it.
     */
    private static void readPoem() {

        String file = "Lab12.1/famous-poem.txt";
//        The file path pf the poem that we want to be read
        // TODO: initialize 'reader' variable and complete the try block
        try (BufferedReader buffer = new BufferedReader(new FileReader(file))) {

           /* BufferedReader is used to read text from a character-input stream (like a file), and it's initialized with a FileReader object, which reads characters from a file.
            The FileReader is initialized with the file path stored in the file variable. Essentially the line above is used to read the file path that you stored in a varaible called file*/
            String poem;
        while((poem = buffer.readLine()) != null){
            /*
                 the read line method is used to read the next line of what the buffer read. Buffer is the varible name of the BufferReader object that is written above and buffer.readLine() reads what's in the buffer. In the while statement the buffer.readline() is stored in the poem variable and while it's npt equl to null it reads the next line and then when there are no lines and it returns null the loops stops signaling the end of the text in the file.
             */
            System.out.println(poem);
        }


        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * TASK: write a Haiku to file 'haiku.txt'.
     *
     * A Haiku is a 3-line poem with the following characteristics:
     *  1st line is 5 syllables
     *  2nd line is 7 syllables
     *  3rd line is 5 syllables
     *
     * Use a PrintWriter wrapped around a FileWriter.
     * Use a try-with-resources to initialize the stream and auto-close it.
     */
    private static void writePoem() {
        // TODO
        String file2 = "Lab12.1/haiku.txt";
        /*THis is the path where the poem will be written and the file will be created when the code is ran if it does not exsist. If the file does exsisit it will overwrite any text that is inside the file already */

        try(FileWriter fileWriter = new FileWriter(file2);
            /*FileWriter points to the file and establishes a connection to the fiile that needs to be written in, and it's initialized with the file path stored in file2. Will write to file 2*/
            PrintWriter printWriter = new PrintWriter(fileWriter)){
//            PrintWriter does the actual writing to the file and points to filewriter that esblished the connection to the file im writing to
            printWriter.println("In shadows he stands, \n");
            printWriter.println("Yuji Itadori, the light, \n");
            printWriter.println("Heart ablaze, he fights. \n");
//            These are the lines that will be written above
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}