package com.uum._a1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Thread.sleep;


/**
 *
 * @NUR FARHANA BT FARISHAMUDIN
 * @240912
 * @ASSIGNMENT 1
 *
 */
public class RunCount extends Thread {

    public static int countIssue(String[] jList) {

        int noIssue = 0;

        for (String read : jList) {
            try (final BufferedReader readLine = new BufferedReader(new FileReader(read))) { //read file in folder
                String searchMain;
                while ((searchMain = readLine.readLine()) != null) {
                    if (searchMain.contains("void main")&&(searchMain.contains("args"))) {
                        noIssue++;
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("Number of Issues = " + noIssue);
        System.out.println("");
        return noIssue;
    }
//==============================================================================
    public static void main(String[] args) {
        new Thread(new RunCount()).start();
    }

    @Override
    public void run() {

        Count issue = new Count(); //CariIssue class
        String[] jList = issue.listJavaFile; //call method cariJavaIssue()

        try {
            countIssue(jList);
            sleep(500);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//https://www.codeproject.com/Questions/423929/Java-return-number-of-files-on-folder

