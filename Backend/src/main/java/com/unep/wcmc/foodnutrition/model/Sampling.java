package com.unep.wcmc.foodnutrition.model;

import com.unep.wcmc.foodnutrition.support.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Sampling implements BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "sampling_origin_id")
    private SamplingOrigin origin;

    private String plan;

    @Temporal(TemporalType.DATE)
    private Date seassonStart;

    @Temporal(TemporalType.DATE)
    private Date seassonEnd;

    private Integer foodSamplesNumber;

    private Float foodSamplesWeights;

    private Integer analyticalSamplesNumber;

    private Integer analyticalReplicatesNumber;

    private String beforeSampleHandling;

    private String arrivesSampleHandling;

    private String storageConditions;

    private String analysisReason;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public SamplingOrigin getOrigin() {
        return origin;
    }

    public void setOrigin(SamplingOrigin origin) {
        this.origin = origin;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Date getSeassonStart() {
        return seassonStart;
    }

    public void setSeassonStart(Date seassonStart) {
        this.seassonStart = seassonStart;
    }

    public Date getSeassonEnd() {
        return seassonEnd;
    }

    public void setSeassonEnd(Date seassonEnd) {
        this.seassonEnd = seassonEnd;
    }

    public Integer getFoodSamplesNumber() {
        return foodSamplesNumber;
    }

    public void setFoodSamplesNumber(Integer foodSamplesNumber) {
        this.foodSamplesNumber = foodSamplesNumber;
    }

    public Float getFoodSamplesWeights() {
        return foodSamplesWeights;
    }

    public void setFoodSamplesWeights(Float foodSamplesWeights) {
        this.foodSamplesWeights = foodSamplesWeights;
    }

    public Integer getAnalyticalSamplesNumber() {
        return analyticalSamplesNumber;
    }

    public void setAnalyticalSamplesNumber(Integer analyticalSamplesNumber) {
        this.analyticalSamplesNumber = analyticalSamplesNumber;
    }

    public Integer getAnalyticalReplicatesNumber() {
        return analyticalReplicatesNumber;
    }

    public void setAnalyticalReplicatesNumber(Integer analyticalReplicatesNumber) {
        this.analyticalReplicatesNumber = analyticalReplicatesNumber;
    }

    public String getBeforeSampleHandling() {
        return beforeSampleHandling;
    }

    public void setBeforeSampleHandling(String beforeSampleHandling) {
        this.beforeSampleHandling = beforeSampleHandling;
    }

    public String getArrivesSampleHandling() {
        return arrivesSampleHandling;
    }

    public void setArrivesSampleHandling(String arrivesSampleHandling) {
        this.arrivesSampleHandling = arrivesSampleHandling;
    }

    public String getStorageConditions() {
        return storageConditions;
    }

    public void setStorageConditions(String storageConditions) {
        this.storageConditions = storageConditions;
    }

    public String getAnalysisReason() {
        return analysisReason;
    }

    public void setAnalysisReason(String analysisReason) {
        this.analysisReason = analysisReason;
    }
}
