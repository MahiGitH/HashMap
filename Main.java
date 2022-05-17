package HashMapExercise;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {
        // Which command retrieves the value 3 from the hash map?
        HashMap<String, Integer> conversionMap = new HashMap<>();

        conversionMap.put("3", 9);
        conversionMap.put("6", 6);
        conversionMap.put("9", 3);
//this line
        if(conversionMap.get("9")== 3) {
            System.out.println("Correct!");
        }

        // Programming exercise:Nicknames, get Matthew's nickname from the hashmap, and print it.
        HashMap<String,String> nickName = new HashMap<>();
        nickName.put("matthew", "matt");
        nickName.put("michael", "mix");
        nickName.put("arthur", "artie");
        System.out.println(nickName.get("matthew"));

        /***************Object As Hash Map******************/
        // Which command can be used to retrieve the number 4 of HashMapExercise.Person Class from the hash map?
        HashMap<String, Person> personMap = new HashMap<>();

        Person casper = new Person("Casper", 55);
        Person mike = new Person("Mike", 4);
        Person matt = new Person("Matt", 12);

        personMap.put(casper.getName(), casper);
        personMap.put(mike.getName(), mike);
        personMap.put(matt.getName(), matt);

        if(personMap.get("Mike").getAge() == 4) {
            System.out.println("Correct!");
        }


        /************* abbreviation*******************/
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();

        /****************************Print me my hash map**********************************/
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        Program.printKeys(hashmap);
        System.out.println("---");
        Program.printKeysWhere(hashmap, "i");
        System.out.println("---");
        Program.printValuesOfKeysWhere(hashmap, ".e");

        /************************Print me another hash map************************/
        HashMap<String, Book> hashmap2 = new HashMap<>();
        hashmap2.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap2.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        Program.printValues(hashmap2);
        System.out.println("---");
        Program.printValueIfNameContains(hashmap2, "prejudice");

        /*************************I owe you**********************************/
        IOU mattesIOU = new IOU();
        mattesIOU.setSum("Arthur", 51.5);
        mattesIOU.setSum("Michael", 30);

        System.out.println(mattesIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattesIOU.howMuchDoIOweTo("Michael"));

        /******************************Same date**************************************/
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));

        /******************************Vehicle Registry*********************************************/
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found

        /*******************************Dictionary of many translations*************************************/

        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
        /*************************************Storage facility***********************************************/
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());

    }
}