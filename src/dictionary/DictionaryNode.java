/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dictionary;

/**
 *
 * @author dv
 */
public class DictionaryNode {
    String word;
    String meaning;
    DictionaryNode left;
    DictionaryNode right;   

    public DictionaryNode(String w, String m) {
        word = w;
        meaning = m;
        left = null;
        right = null;
    }
    public String getMeaning() {
        return meaning;
    }

    // Setter method for the meaning
    public void setMeaning(String newMeaning) {
        this.meaning = newMeaning;
    }
}

