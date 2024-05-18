/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dictionary;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author dv
 */
public class DictionaryApp {
    public DictionaryNode root;

    public DictionaryApp() {
        root = null;
    }

    public void destructor_help(DictionaryNode temp) {
        if (temp == null) {
            return;
        }
        destructor_help(temp.left);
        destructor_help(temp.right);
        root = null;
    }

    public void destructor() {
        destructor_help(root);
    }

    public void LoadDictionary() {
        try {
            BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\dv\\Desktop\\Dictionary\\src\\dictionary\\Dic.txt"));
            ClearTree(root);
            String line;
            while ((line = file.readLine()) != null) {
                String[] words = line.split(" ");
                Insert(words[0], words[1]);
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error: Unable to open the selected file.");
}
    }
    
    public void ClearTree(DictionaryNode node) {
        if (node != null) {
            ClearTree(node.left);
            ClearTree(node.right);
            node = null;
        }
       
    }

    public void Insert(String word, String meaning) {
        root = Insert(root, word, meaning);
    }

    public DictionaryNode Insert(DictionaryNode node, String word, String meaning) {
        if (node == null) {
            return new DictionaryNode(word, meaning);
        }
        if (word.compareTo(node.word) < 0) {
            node.left = Insert(node.left, word, meaning);
        } else if (word.compareTo(node.word) > 0) {
            node.right = Insert(node.right, word, meaning);
        }
        return node;
    }
    
    public DictionaryNode Search(DictionaryNode node, String word) {
    if (node == null || (node.word != null && node.word.equals(word))) {
        return node;
    }
    if (word.compareTo(node.word) < 0) {
        return Search(node.left, word);
    } else {
        return Search(node.right, word);
    }
}

    public DictionaryNode FindMin(DictionaryNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public DictionaryNode Delete(DictionaryNode node, String word) {
        if (node == null) {
            return node;
        }
        if (word.compareTo(node.word) < 0) {
            node.left = Delete(node.left, word);
        } else if (word.compareTo(node.word) > 0) {
            node.right = Delete(node.right, word);
        } else {
            if (node.left == null) {
                DictionaryNode temp = node.right;
                node = null;
                return temp;
            } else if (node.right == null) {
                DictionaryNode temp = node.left;
                node = null;
                return temp;
            }

            DictionaryNode temp = FindMin(node.right);
            node.word = temp.word;
            node.meaning = temp.meaning;
            node.right = Delete(node.right, temp.word);
        }
        return node;
    }

public void UpdateFile() {
    if (root != null) {
        try {
            BufferedWriter outFile = new BufferedWriter(new FileWriter("C:\\Users\\dv\\Desktop\\Dictionary\\src\\dictionary\\Dic.txt"));
            WriteToFile(outFile, root);
            outFile.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: Unable to open file Dictionary.txt for writing");
        }
    }
}

public void WriteToFile(BufferedWriter outFile, DictionaryNode node) throws IOException {
        if (node != null) {
            WriteToFile(outFile, node.left);
            outFile.write(node.word + " " + node.meaning);
            outFile.newLine();
            WriteToFile(outFile, node.right);
        }
    }

public void CollectSuggestedWords(DictionaryNode node, String partialWord, List<String> suggestions) {
        if (node != null) {
            if (node.word.startsWith(partialWord)) {
                suggestions.add(node.word);
            }
            CollectSuggestedWords(node.left, partialWord, suggestions);
            CollectSuggestedWords(node.right, partialWord, suggestions);
        }
    }
        
        public void InOrderPrint() {
        InOrderPrint(root);
    }

        public void InOrderPrint(DictionaryNode node) {
        if (node != null) {
            InOrderPrint(node.left);
            InOrderPrint(node.right);
        }
    }
}
