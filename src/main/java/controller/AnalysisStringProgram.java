/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import repository.AnalysisStringRepository;
/**
 *
 * @author Administrator
 */
public class AnalysisStringProgram {
    
    AnalysisStringRepository program;
    
    public AnalysisStringProgram() {
        program = new AnalysisStringRepository();
    }
    
    public void run() {
        System.out.println("===== Analysis String Program ====");
        program.analysisString();
    }
    
}
