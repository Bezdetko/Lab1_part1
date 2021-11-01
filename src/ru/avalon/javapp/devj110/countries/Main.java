package ru.avalon.javapp.devj110.countries;

public class Main {
    public static void main(String[] args) {
        Country[] countries = new Country[] {
            new Country("Russia", 17_100_000, 146_700_000, "Moscow", 12_600_000),
            new Country("Finland", 338_000, 5_500_000, "Helsinki", 655_000),
            new Country("France", 643_800, 67_800_000, "Paris", 2_100_000),
            new Country("Andorra", 467, 85_400, "Andorra la Vella", 22_600),
            new Country("Singapore", 725, 5_700_000),
            
            
            // *Cлучай, когда население страны (и столицы, если она есть) неизвестно
            new Country("China", 9_598_962, 1_411_778_724, "Pekin"),
            new Country("India", 3_287_263 , "New Delhi"),
            new Country("Monako", 2)
        };
        
        Country.printAll(countries);    
    }
}