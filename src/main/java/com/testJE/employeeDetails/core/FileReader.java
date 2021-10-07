package com.testJE.employeeDetails.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Loick 21
 * Build an application which can show
 * the number of employees at each level of a company.
 *
 * We use an N-Ary Tree to build our hierachy data Structure
 *
 * And to compute the number of employees at each level,
 * we use the BFS algorithm
 *
 **/

/**
 * This class allow to read the input and output file to perform our test.
 */
public class FileReader {

    /**
     * @param filename is the input file name.
     *                 <p>
     *                 <p>
     *                 This method read the input file "filename"/
     * @return A list of string which contains all the data row by row of the filename
     * @throws FileNotFoundException
     * @throws IOException
     * @see BufferedReader
     * @see FileReader
     */
    public static List<String> readInput(String filename) {
        List<String> data = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader("src/main/resources/" + filename));
            String s = "";
            while ((s = bufferedReader.readLine()) != null) {
                data.add(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    /**
     * @param filename is the output file name.
     *                 <p>
     *                 <p>
     *                 This method read the output file "filename"/
     * @return A String of string which contains all the data of the filename
     * @throws FileNotFoundException
     * @throws IOException
     * @see BufferedReader
     * @see FileReader
     */
    public static String readOutput(String filename) {
        String data = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader("src/main/resources/" + filename));
            String s = "";
            while ((s = bufferedReader.readLine()) != null) {
                data += s;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

}
