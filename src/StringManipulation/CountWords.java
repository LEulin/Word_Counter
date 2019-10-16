/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

import java.util.Arrays;
import DB.Create;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author laurentera_sd2022
 */
public class CountWords {
    
    public String countWords(String words) {

        Create insert = new Create();
        String[] list = words.trim().split("\\s+");
        List<String> listOfUniqueString = new ArrayList<>(Arrays.asList(list));
        for (String word : list) {
            int count = 0;
            for(String u_string: listOfUniqueString){
                if(word.equals(u_string)){
                    ++count;
                }
            }
            insert.InsertData(word, count, "USC");
            listOfUniqueString.add(word + "=" + count);
        }
        return listOfUniqueString.toString();
    }
    
    
}
