package com.unep.wcmc.foodnutrition.model;

import com.unep.wcmc.foodnutrition.support.BaseEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Food implements BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "food_type_id")
    private FoodType foodType;

    @ManyToOne
    @JoinColumn(name = "food_group_id")
    private FoodGroup foodGroup;

    @ManyToOne
    @JoinColumn(name = "part_plant_animal_id")
    private PartPlantAnimal partPlantAnimal;

    private String scientificName;

    private String taxonRank;

    private String notes;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "food_id")
    private Set<FoodSource> sources;

    private String manufacturer;

    @ManyToOne
    @JoinColumn(name = "food_processing_id")
    private FoodProcessing processing;

    @ManyToOne
    @JoinColumn(name = "preservation_method_id")
    private PreservationMethod preservationMethod;

    @ManyToOne
    @JoinColumn(name = "cooking_degree_id")
    private CookingDegree cookingDegree;

    @ManyToOne
    @JoinColumn(name = "agricultural_condition_id")
    private AgriculturalProductionCondition agriculturalCondition;

    @ManyToOne
    @JoinColumn(name = "storage_condition_id")
    private StorageCondition storageCondition;

    @ManyToOne
    @JoinColumn(name = "physical_state_id")
    private PhysicalState physicalState;

    @ManyToOne
    @JoinColumn(name = "ripeness_maturity_id")
    private RipenessMaturity ripenessMaturity;

    private String grade;

    @ManyToOne
    @JoinColumn(name = "contact_surface_id")
    private ContactSurfaceContainer contactSurface;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "food_id")
    private Set<FoodIngredient> ingredients;

    private String recipeProcedure;

    private String shapeForm;

    @ManyToOne
    @JoinColumn(name = "colour_id")
    private Colour colour;

    @OneToOne
    @JoinColumn(name = "sampling_id")
    private Sampling sampling;

    @OneToOne
    @JoinColumn(name = "reference_id")
    private Reference reference;

    @OneToOne
    @JoinColumn(name = "general_analysis_id")
    private GeneralAnalysis generalAnalysis;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "food_id")
    private Set<Nutrient> nutrients;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getTaxonRank() {
        return taxonRank;
    }

    public void setTaxonRank(String taxonRank) {
        this.taxonRank = taxonRank;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Set<FoodSource> getSources() {
        return sources;
    }

    public void setSources(Set<FoodSource> sources) {
        this.sources = sources;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public FoodProcessing getProcessing() {
        return processing;
    }

    public void setProcessing(FoodProcessing processing) {
        this.processing = processing;
    }

    public PreservationMethod getPreservationMethod() {
        return preservationMethod;
    }

    public void setPreservationMethod(PreservationMethod preservationMethod) {
        this.preservationMethod = preservationMethod;
    }

    public CookingDegree getCookingDegree() {
        return cookingDegree;
    }

    public void setCookingDegree(CookingDegree cookingDegree) {
        this.cookingDegree = cookingDegree;
    }

    public AgriculturalProductionCondition getAgriculturalCondition() {
        return agriculturalCondition;
    }

    public void setAgriculturalCondition(AgriculturalProductionCondition agriculturalCondition) {
        this.agriculturalCondition = agriculturalCondition;
    }

    public StorageCondition getStorageCondition() {
        return storageCondition;
    }

    public void setStorageCondition(StorageCondition storageCondition) {
        this.storageCondition = storageCondition;
    }

    public PhysicalState getPhysicalState() {
        return physicalState;
    }

    public void setPhysicalState(PhysicalState physicalState) {
        this.physicalState = physicalState;
    }

    public RipenessMaturity getRipenessMaturity() {
        return ripenessMaturity;
    }

    public void setRipenessMaturity(RipenessMaturity ripenessMaturity) {
        this.ripenessMaturity = ripenessMaturity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public ContactSurfaceContainer getContactSurface() {
        return contactSurface;
    }

    public void setContactSurface(ContactSurfaceContainer contactSurface) {
        this.contactSurface = contactSurface;
    }

    public Set<FoodIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<FoodIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipeProcedure() {
        return recipeProcedure;
    }

    public void setRecipeProcedure(String recipeProcedure) {
        this.recipeProcedure = recipeProcedure;
    }

    public String getShapeForm() {
        return shapeForm;
    }

    public void setShapeForm(String shapeForm) {
        this.shapeForm = shapeForm;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Sampling getSampling() {
        return sampling;
    }

    public void setSampling(Sampling sampling) {
        this.sampling = sampling;
    }

    public GeneralAnalysis getGeneralAnalysis() {
        return generalAnalysis;
    }

    public void setGeneralAnalysis(GeneralAnalysis generalAnalysis) {
        this.generalAnalysis = generalAnalysis;
    }

    public Set<Nutrient> getNutrients() {
        return nutrients;
    }

    public void setNutrients(Set<Nutrient> nutrients) {
        this.nutrients = nutrients;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public FoodGroup getFoodGroup() {
        return foodGroup;
    }

    public void setFoodGroup(FoodGroup foodGroup) {
        this.foodGroup = foodGroup;
    }

    public PartPlantAnimal getPartPlantAnimal() {
        return partPlantAnimal;
    }

    public void setPartPlantAnimal(PartPlantAnimal partPlantAnimal) {
        this.partPlantAnimal = partPlantAnimal;
    }

    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }
}
