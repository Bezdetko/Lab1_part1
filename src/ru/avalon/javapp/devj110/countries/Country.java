package ru.avalon.javapp.devj110.countries;

public class Country {
    private String name;
    private int square;
    private int population;
    private String capitalName;
    private int capitalPopulation;
    
    public Country(String name, int square) {
    setName(name);
    setSquare(square);
    }
         
    public Country(String name, int square, int population) {
    this(name, square);
    setPopulation(population);
    }
    
    public Country(String name, int square, String capitalName){
    this(name, square);
    setCapitalName(capitalName);   
    }
    
    public Country(String name, int square, int population, String capitalName){
    this(name, square, population);
    setCapitalName(capitalName);    
    }
        
    
    public Country(String name, int square, int population, 
            String capitalName, int capitalPopulation) {
        this(name, square, population, capitalName);
        setCapitalPopulation(capitalPopulation);
    }     
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().equals(""))
            throw new IllegalArgumentException("Название страны не может быть пустой ссылкой или незаполненной строкой.");
        this.name = name;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        if(square <= 0)
            throw new IllegalArgumentException("Площадь страны должна быть строго больше нуля.");
        this.square = square;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population <= 0)
            throw new IllegalArgumentException("Население страны должно быть строго больше нуля.");
        this.population = population;
    }
    
    public float getPopulationDensity() {
        return ((float)population) / square;
    }

    public String getCapitalName() {
        return capitalName;
    }
   
    public void setCapitalName(String capitalName){
        if(capitalName == null || capitalName.trim().equals(""))
            throw new IllegalArgumentException("Название стольцы не может быть пустой ссылкой или незаполненной строкой");
        this.capitalName = capitalName;
    }

    public int getCapitalPopulation() {
        return capitalPopulation;
    }

    public void setCapitalPopulation(int capitalPopulation) {
        if(capitalPopulation <= 0)
            throw new IllegalArgumentException("Население страны должно быть строго больше нуля.");
        this.capitalPopulation = capitalPopulation;
    }

public void print() {
    if (population ==0 && capitalName ==null && capitalPopulation ==0){
        System.out.println("Название страны: " + name + "; площадь страны: " + square +" кв. км.; население страны: " + "неизвестно" + ";");
    }
    else if (population !=0 && capitalName ==null && capitalPopulation ==0){
        System.out.println("Название страны: " + name + "; площадь страны: " + square +" кв. км.; население страны: " + population + " человек; плотность населения страны: " + getPopulationDensity() + " чел./кв.км;");
    }
        
    else if (population ==0 && capitalName!= null && capitalPopulation ==0){
        System.out.println("Название страны: " + name + "; площадь страны: " + square +" кв. км.; население страны: " + " неизвестно" + ";");
        System.out.println("столица: " + capitalName + "; население столицы: " + "неизвестно" + ";");
         }
    else if (population !=0 && capitalName !=null && capitalPopulation ==0){
        System.out.println("Название страны: " + name + "; площадь страны: " + square +" кв. км.; население страны: " + population + " человек; плотность населения страны: " + getPopulationDensity() + " чел./кв.км;");
        System.out.println("столица: " + capitalName + "; население столицы: " + "неизвестно" + ";");
    }
        
    else {
        System.out.println("Название страны: " + name + "; площадь страны: " + square +" млн. кв. км.; население страны: " + population + " человек; плотность населения страны: " + getPopulationDensity() + " чел./кв.км;");
        System.out.println("столица: " + capitalName + "; население столицы: " + capitalPopulation + ";");
         }
        System.out.println();    
}    
 

    public static void printAll(Country[] countries) {
        for(Country country: countries)
            country.print();
    }
}
