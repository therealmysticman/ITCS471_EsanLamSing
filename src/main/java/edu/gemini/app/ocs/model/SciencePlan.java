package edu.gemini.app.ocs.model;

import java.util.Date;

public class SciencePlan extends Object{
    private String creator;
    private String submitter;
    private double fundingInUSD;
    private String objectives;
    private StarSystem.CONSTELLATIONS starSystem;
    private Date startDate;
    private Date endDate;
    private SciencePlan.TELESCOPELOC telescopeLocation;
    private DataProcRequirement dataProcRequirements;

    public SciencePlan(){

    }
    public SciencePlan(String creator, String submitter, double fundingInUSD, String objectives, StarSystem.CONSTELLATIONS starSystem, Date startDate, Date endDate, SciencePlan.TELESCOPELOC telescopeLocation, DataProcRequirement dataProcRequirements){
        this.creator = creator;
        this.submitter = submitter;
        this.fundingInUSD = fundingInUSD;
        this.objectives = objectives;
        this.starSystem = starSystem;
        this.startDate = startDate;
        this.endDate = endDate;
        this.telescopeLocation = telescopeLocation;
        this.dataProcRequirements = dataProcRequirements;
    }
}
