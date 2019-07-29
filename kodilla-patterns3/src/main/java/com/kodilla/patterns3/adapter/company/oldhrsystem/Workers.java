package com.kodilla.patterns3.adapter.company.oldhrsystem;

public class Workers {

    private String [][] workers = {
            {"67022715943","John","Smith"},
            {"23569815748","Amelia","Michelson"},
            {"46578945783","Michel","Anders"},
            {"46895763256","Kris","Nanka"},
            {"16597864953","Cloudia","Rakta"}
    };
    private double[] salaries = {
            4500.00,
            3700.00,
            3000.00,
            3800.00,
            4000.00
    };
    public String getWorker(int n) {
        if (n>salaries.length) {
            return  "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + workers[n];
    }
    public String[][] getWorkers() {
        return workers;
    }
    public double[] getSalaries() {
        return salaries;
    }
}
