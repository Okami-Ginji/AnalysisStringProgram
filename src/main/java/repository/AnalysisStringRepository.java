/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataacess.AnalysisStringDAO;
/**
 *
 * @author Administrator
 */
public class AnalysisStringRepository implements IAnalysisStringRepository{

    @Override
    public void analysisString() {
        AnalysisStringDAO.Instance().analysisString();
    }
           
}
