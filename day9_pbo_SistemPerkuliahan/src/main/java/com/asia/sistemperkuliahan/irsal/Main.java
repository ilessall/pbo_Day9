/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asia.sistemperkuliahan.irsal;

/**
 *
 * @author A-5
 */
import com.asia.sistemperkuliahan.ui.TextUi; 
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        // Create DataManager instance (specify array sizes)
        //dataManager = new DataManager(100, 50, 20, 200);
        SistemPerkuliahan sistemPerkuliahan = new SistemPerkuliahan();
        TextUi ui = new TextUi();
        ui.run();
    }
}
