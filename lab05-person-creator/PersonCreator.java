//
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (Deepsana Shahi) 
 * @version (9/15/2016)
 */
public class PersonCreator
{
    private String name, address, phone, dob;
    private boolean sex;
    private boolean female;
    private boolean male;
    private int ssnumber,age, height, weight;

    /**
     * Constructor for user's first and last name.
     */  
    public PersonCreator(String first, String last)
    {
        name = first+ " " +last;

    }

    /**
     * Description: Returns the first and last name of person.
     * Input: String.
     * Output: Returns name.
     * Example: You state the name and it will just return the name.
     */ 
    public String name()
    {
        return name;
    }

    /**
     * Description: Getting the ssnumber.
     * Input: int.
     * Output: void so no output.
     * Example: If you have some specific number to put in the ssnumber then you just state
     *          that in the section and read ssnumber to be that specific number but since it's
     *          void it won't return anything.
     */
    public void ss()
    {

        if(100000000 <= ssnumber && ssnumber >= 999999999)
        {
            ssnumber = ssnumber;
        }

    }

    /**
     * Description: Determining the person's sex
     * Input: boolean
     * Output: void so no output.
     * Example: You are saying if the person is female then it will state as being female and if that is not true 
     * then the else statement tells you it is otherwise.
     */
    public void sexPerson()
    {
        if(sex = female)
        {
            sex = female;
        } else
        {
            sex = male; 
        }
    }

    /**
     * Description: Getting a phone number
     * Input: int
     * Output: void so no output
     * Example: If you have some specific number to put in for areacode, numMiddle and numlast, then you just state
     *          that in the section and it will read areacode, numMiddle and numlast to be that specific number but since it's
     *          void it won't return anything.
     */
    public void getNum(int areaCode, int numMiddle, int numLast)
    {
        if(100 >= areaCode && areaCode <= 999)
        {
            areaCode = areaCode;
        } else if(100 >= numMiddle && numMiddle <= 999)
        {
            numMiddle = numMiddle;
        } else if(1000 >= numLast && numLast <= 9999)
        {
            numLast = numLast;
        } 
        
        phone = areaCode+"-"+numMiddle+"-"+numLast;
   }

    /**
     * Description: Getting date of birth
     * Input: int
     * Output: void so no output
     * Example: If you set the month, day and year to be something specific then you state that in the section and it will 
     * keep that to be true but won't return anything since it is void.
     */
    public void setDateOfBirth(int month, int day, int year)
    {
        if(1 >= month && month <= 12)
        {
            month = month;
        } else if (1 >= day && day < 31)
        {
            day = day;
        } else if(0 > year && year <= 2016)
        {
            year = year;
        }

        dob = month+"/"+day+"/"+year;
    }

    /**
     * Description: Setting age
     * Input: int
     * Output: void so no output
     * Example: If you make the age to be something specific, then it will record it as being that specific age and read it that way
     *          and since it is void, it won't return anything.
     */
    public void setAge(int age)
    {
        if(1>= age && age <= 100) 
        {
            age = age;
        }
    }

    /**
     * Description: Setting Height in inches
     * Input: int
     * Output: void so no output.
     * Example: If you make the height to be something specific, then it will record it as being that specific height and read it that way
     *          and since it is void, it won't return anything.
     */
    public void setHeight(int height)
    {
        if(height>0) //height in inches 
        {
            this.height = height;
        }
    }

    /**
     * Description: Setting Weight in lb.
     * Input: int
     * Output: void so no output
     * Example: If you make the weight to be something specific, then it will record it as being that specific weight and read it that way
     *          and since it is void, it won't return anything.
     */
    public void setWeight(int weight)
    {
        if(weight>0) //weight in pounds
        {
            this.weight = weight;
        }
    }

    /**
     * Description: Getting an address.
     * Input: int and String.
     * Output: void so no output
     * Example: If you make the houseNumber, zipcode, streetName, city, state and zipcode to be something specific, then it will record it as being that specific thing and read it that way
     *          and since it is void, it won't return anything.
     */
    public void setAddress(int houseNumber, String streetName, String city, String state, int zipcode)
    {
        if(1 >= houseNumber && zipcode <10000)
        {
            houseNumber = houseNumber;
        } else if(11111 >= zipcode && zipcode <= 99999)
        {
            zipcode = zipcode;
        }
       
        address = houseNumber +" "+ streetName+ " ,"+ city+ " ,"+ state+ " ,"+zipcode;
    }

    /**
     * Printing the name, sex, social security, age, height, weight, address, date of birth, phone number 
     * and since it is void it won't return anything.
     */
    public void print(){
        System.out.println("Name: " + name);  
        System.out.println("Sex: " + sex);
        System.out.println("Social Security: " + ssnumber);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height+" inches");
        System.out.println("Weight: " + weight+" lb");
        System.out.println("Address: " + address);
        System.out.println("Date Of Birth: " + dob);  
        System.out.println("Phone number: " + phone); 
    }
}
