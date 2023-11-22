package javachapter7;

public class JavaChapter7 {

    public static void main(String[] args) {
        System.out.print("lol");
    }

}


/*
WEEK 7: SINGLE DIMENSIONAL ARRAYS WOOOOOOOOOOOOOOOOOOOOOOOO


> array is a data structure that can store data
    > more often used to store LARGE amounts of data

> to declare an array, write:
    > dataType[] arrayName;

> to specifically assign the size of the array,, write:
    > dataType[] arrayName = new dataType[arraySize];
        > this declares a array variable arrayName and creates the array of 
        arraySize amount of elements in the array.

>you can use a for loop to print each element in an array
    > for (int i=0; i<arrayName.length; i++){
        System.out.print(arrayName[i]);
    }

or 

    > for (int i : arrayName){
        System.out.print(i);
    }




> the "length" funciton for arrays and strings are different to eachother
    > the array's "length" is a read-only variable
    > this means it would only be applicable to arrays 
    > length() can really only be used for Strings
        > String[] str is NOT THE SAME as String str. example:
            >String[] str = {"hello", "world"};
            String str = "hello world";
                > str.length()  -> gives error for array BECAUSE it's an array
                > str[0].length() = 4  -> the String value at index 0
                > str.length() = 9  -> the String value from String variable


> you can pass arrays as parameters in functions
> since arrays are a type of object and java passes by value in functions,
it's important to know what to pass especially when one is an object (Array)
    > 
*/