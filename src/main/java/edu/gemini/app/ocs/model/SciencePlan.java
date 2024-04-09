package edu.gemini.app.ocs.model;

import java.util.Date;

public class SciencePlan extends Object {

    public int getPlanNo() {
        return planNo;
    }

    public void setPlanNo(int planNo) {
        this.planNo = planNo;
    }

    private int planNo;
    private String creator;
    private String submitter;
    private double fundingInUSD;
    private String objectives;
    private StarSystem.CONSTELLATIONS starSystem;
    private Date startDate;
    private Date endDate;
    private SciencePlan.TELESCOPELOC telescopeLocation;
    private DataProcRequirement dataProcRequirements;

    private SciencePlan.STATUS status;

    public SciencePlan() {
        //What's this
    }

    public SciencePlan(String creator, String submitter, double fundingInUSD, String objectives, StarSystem.CONSTELLATIONS starSystem, Date startDate, Date endDate, SciencePlan.TELESCOPELOC telescopeLocation, DataProcRequirement dataProcRequirements) {
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public double getFundingInUSD() {
        return fundingInUSD;
    }

    public void setFundingInUSD(double fundingInUSD) {
        this.fundingInUSD = fundingInUSD;
    }

    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    public StarSystem.CONSTELLATIONS getStarSystem() {
        return starSystem;
    }

    public void setStarSystem(StarSystem.CONSTELLATIONS starSystem) {
        this.starSystem = starSystem;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public SciencePlan.TELESCOPELOC getTelescopeLocation() {
        return telescopeLocation;
    }

    public void setTelescopeLocation(SciencePlan.TELESCOPELOC telescopeLocation) {
        this.telescopeLocation = telescopeLocation;
    }

    public DataProcRequirement getDataProcRequirements() {
        return dataProcRequirements;
    }

    public void setDataProcRequirements(DataProcRequirement dataProcRequirements) {
        this.dataProcRequirements = dataProcRequirements;
    }

    public SciencePlan.STATUS getStatus() {
        return this.status;
    }

    public void setStatus(SciencePlan.STATUS status){
        this.status = status;
    }

    public enum STATUS{
        COMPLETE,
        TESTED,
        CANCELLED,
        RUNNING,
        SUBMITTED,
        VALIDATED,
        INVALIDATED
    }

    public enum TELESCOPELOC{
        CHILE,
        HAWAII
    }

//    public SciencePlan.STATUS getStatus(){
//        return this.status;
//    }
}