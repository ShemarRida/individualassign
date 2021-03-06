package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int x = 0;
        while (x < personArray.length) {
            // begin loop
            result += personArray[x];
            x++;
        }

            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable

            // end loop
            return result;
        }


        public String forLoop() {
            String result = "";
            for(int x = 0; x < personArray.length; x++){
                result += personArray[x];
            }
            // identify initial value
            // identify terminal condition
            // identify increment


            // use the above clauses to declare for-loop signature
            // begin loop
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop

            return result;
        }


        public String forEachLoop() {
            String result = "";
            for(Person x : getPersonArray()){
                result += x;
            }
            // identify array's type
            // identify array's variable-name

            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop

            return result;
        }


        public Person[] getPersonArray () {
            return personArray;
        }
    }
