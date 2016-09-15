
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    private String name, address;
    private boolean sex;
    private boolean female;
    private int ssnumber,age, height, weight, phone, dob;
    private String streetName;
    private String city;
    private String state;
    private int zipcode;

    /**
     * Constructor for user's first and last name.
     */  
    public PersonCreator(String first, String last)
    {
        name = first+ " " +last;

    }

    /**
     * Return the first and last name of person.
     */
    public String name()
    {
        return name;
    }

    /**
     * Get the ssnumber.
     */
    public void ss()
    {

        if(100000000 <= ssnumber && ssnumber >= 999999999)
        {
            ssnumber = ssnumber;
        }

    }

    /**
     * Determine the person's sex
     */
    public void sexPerson()
    {
        if(sex = female)
        {
            System.out.print("female");
        }
    }

    /**
     * Getting number
     */
    public void getNum(int v1, int v2, int v3)
    {
        if(100 >= v1 && v1 <= 999)
        {
            v1 = v1;
        }
        then if(100 >= v2 && v2 <= 999)
        {
            v2 = v2;
        }
        then if(1000 >= v3 && v3 <= 9999)
        {
            v3 = v3;
        }
        phone = v1+ " " + v2+" " +v3;
    }

    /**
     * Getting date of birth
     */
    public void setDateOfBirth(int month, int day, int year)
    {
        if(1 >= month && month <= 12)
        {
            month = month;
        }
        then if (1 >= day && < 31)
        {
            day = day;
        }
        then if(0 > year <= 2016)
        {
            year = year;
        }

        dob = month+"/"day+"/"+year;
    }

    /**
     * Setting age
     */
    public void setAge(int age)
    {
        if(1>= age <= 100) 
        {
            age = age;
        }
    }

    public void setHeight(int height)
    {
        if(height = 86) //height in inches 
        {
            height = height;
        }
    }

    public void setWeight(int weight)
    {
        if(weight = 200) //weight in pounds
        {
            weight = weight;
        }
    }

    public void setAddress(int houseNumber, String streetName, String city, String state, int zipcode)
    {
        if(1 >= houseNumber <10000)
        {
            houseNumber = houseNumber;
        }
        then if(11111 >= zipcode <= 99999)
        {
            zipcode = zipcode;
        }
        return streetName;
        return city;
        return state;
        address = houseNumber +" "+ streetName+ " ,"+ city+ " ,"+ state+ " ,"+zipcode
    }

    public void print(){
        System.out.println("Name: " + name);  
        System.out.println ("Sex: " + sex);
        System.out.println ("Social Security: " + ssnumber);
        System.out.println ("Age: " + age);
        System.out.println ("Height: " + height+" inches");
        System.out.println ("Weight: " + weight+" lb");
        System.out.println ("Address: " address);

        System.out.println ("Date Of Birth: " + dob);  
        System.out.println ("Phone number: " + phone); 
}
}
