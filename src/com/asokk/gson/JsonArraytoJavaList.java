package com.asokk.gson;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Java program to convert JSON array to String array in Java or List.
 * 
 *
 * @author Javin Paul
 */
public class JsonArraytoJavaList {

       // private static Logger logger = Logger.getLogger(JsonArraytoJavaList.class);
        
        private static Logger logger = Logger.getLogger(JsonArraytoJavaList.class.getName());
       
        public static void main(String args[]){
                // Converting JSON String array to Java String array
                String jsonStringArray = "[\"JSON\",\"To\",\"Java\"]";
               
                //creating Gson instance to convert JSON array to Java array
                Gson converter = new Gson();
               
                Type type = new TypeToken<List<String>>(){}.getType();
                List<String> list =  converter.fromJson(jsonStringArray, type );
               
                //convert List to Array in Java
                String [] strArray = list.toArray(new String[0]);
               
                logger.info("Java List created from JSON String Array - example");
                logger.info("JSON String Array : " + jsonStringArray ); // ["JSON","To","Java"]
                logger.info("Java List : " + list); //[JSON, To, Java]
                logger.info("String array : " + Arrays.toString(strArray)); //[JSON, To, Java]
               
                // let's now convert Java array to JSON array -        
                String toJson = converter.toJson(list);
                logger.info("Json array created from Java List : " + toJson); // ["JSON","To","Java"]
               
                // example to convert JSON int array into Java array and List of integer
                String json = "[101,201,301,401,501]";
               
                type = new TypeToken<List<Integer>>(){}.getType();
                List<Integer> iList = converter.fromJson(json, type);
                Integer[] iArray = iList.toArray(new Integer[0]);      
               
                logger.info("Example to convert numeric JSON array to integer List and array in Java");
                logger.info("Numeric JSON array : " + json); //[101,201,301,401,501]
                logger.info("Java List of Integers : " + iList); //[101, 201, 301, 401, 501]
                logger.info("Integer array in Java : " + Arrays.toString(iArray)); //[101, 201, 301, 401, 501]
               
                // Again, let's convert this Java int array back to Json numeric array
                String toJsonInt = converter.toJson(iList);
                logger.info("numeric JSON array create from Java collection : " + toJsonInt); //[101,201,301,401,501]
        }
}


//Read more: http://javarevisited.blogspot.com/2013/04/convert-json-array-to-string-array-list-java-from.html#ixzz3zH2x4l7s
