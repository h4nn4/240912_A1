/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a1;


import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @NUR FARHANA BT FARISHAMUDIN
 * @240912
 * @ASSIGNMENT 1
 *
 */
public class Count {

    public String[] listJavaFile;

    public Count() {
        File searchIssue;
       // int noFile = 0;
        Collection<File> all = new ArrayList<>();
        scanFolder(new File("C:/Users/Asus/Documents/SEM5/Real-time_Programming/MyNote"), all); //scan folder
        Collection<File> listAllFile = all;
        ArrayList<String> simpanJava = new ArrayList();
        Iterator<File> iterate = listAllFile.iterator();
        
        while (iterate.hasNext()) {
            searchIssue = iterate.next();
            if (searchIssue.getName().endsWith(".java")) {
                simpanJava.add(searchIssue.getAbsolutePath());
            }
        }
        
        String[] listIssue = new String[simpanJava.size()];
        for (int i = 0; i < simpanJava.size(); i++) {
            listIssue[i] = simpanJava.get(i);
        }
        listJavaFile= listIssue;
        System.out.println("Number of Java Files = " +simpanJava.size()); //all java files
    }

    public static void scanFolder(File file, Collection<File> all) {
        File[] dalamFolder = file.listFiles();
        if (dalamFolder != null) {
            for (File child : dalamFolder) {
                all.add(child);
                scanFolder(child, all);
            }
        }
    }
}//class

//https://stackoverflow.com/questions/15369744/file-list-vs-file-listfiles
//https://stackoverflow.com/questions/189094/how-to-scan-a-folder-in-java

