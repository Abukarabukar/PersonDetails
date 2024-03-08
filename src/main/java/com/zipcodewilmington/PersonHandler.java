package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...

    public String whileLoop() {
        String result = "";
        int count = 0; // Initialize counter

        // While `counter` is less than the length of array
        while (count < personArray.length) {
            // Use `counter` to identify the `current Person` in the array
            Person person = personArray[count];

            // Get `string Representation` of `currentPerson`
            String str = person.toString();

            // Append `stringRepresentation` to `result` variable
            result += str;

            // Increment the counter to avoid an infinite loop
            count++;
        }

        return result;
    }



    public String forLoop() {
        String result = "";
        // For-loop signature: initialization; condition; increment
        for (int count = 0; count < personArray.length; count++) {
            // Begin loop
            // Use `counter` to identify the `current Person` in the array
            Person person = personArray[count];

            // Get `string Representation` of `currentPerson`
            String str = person.toString();

            // Append `stringRepresentation` to `result` variable
            result += str;
            // End loop
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // For-each loop signature: for (Type var : array)
        for (Person person : personArray) {
            // Begin loop
            // Get `string Representation` of `currentPerson`
            String str = person.toString();

            // Append `stringRepresentation` to `result` variable
            result += str;
            // End loop
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
