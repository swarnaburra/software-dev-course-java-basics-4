package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class CollectionExerciseTests {
    @Test // @Test is an annotation to tell JAVA this is a unit test case
    public void testMakeFruitStringArray() {
        CollectionExercises collectionExercises = new CollectionExercises();
        String[] fruits = collectionExercises.makeFruitStringArray();
        //assert fruits.length == 5;
        //assert fruits[0].equals("apple");
        assertEquals(5, fruits.length);
        assertEquals("apple", fruits[0]);
        assertEquals("banana", fruits[1]);
        assertEquals("cherry", fruits[2]);
        assertEquals("date", fruits[3]);
        assertEquals("elderberry", fruits[4]);

    }

    @Test
    public void testMakeFruitStringArrayWithSize() {
        CollectionExercises collectionExercises = new CollectionExercises();
        String[] fruits = collectionExercises.makeFruitStringArrayWithSize(3);
        //assert fruits.length == 3;
        //assert fruits[0].equals("apple");
        //assert fruits[1].equals("apple");
        //assert fruits[2].equals("apple");
        assertEquals(3, fruits.length);
        assertEquals("apple", fruits[0]);
        assertEquals("apple", fruits[1]);
        assertEquals("apple", fruits[2]);


    }

    @Test
    public void testMakeTopThreeArray() {
        CollectionExercises collectionExercises = new CollectionExercises();
        String[] fruits = new String[] { "apple", "banana", "cherry", "date", "elderberry" };
        String[] topThree = collectionExercises.makeTopThreeArray(fruits);
        assert topThree.length == 3;
        assert topThree[0].equals("apple");
        assert topThree[1].equals("banana");
        assert topThree[2].equals("cherry");
    }

    @Test
    public void testMakeFruitList() {
        CollectionExercises collectionExercises = new CollectionExercises();
        ArrayList<String> fruitList = collectionExercises.makeFruitList();
        assert fruitList.size() == 5;
        assert fruitList.get(0).equals("apple");
        assert fruitList.get(1).equals("banana");
        assert fruitList.get(2).equals("cherry");
        assert fruitList.get(3).equals("date");
        assert fruitList.get(4).equals("elderberry");
    }

    @Test
    public void testMakeListOfThreeFruits() {
        CollectionExercises collectionExercises = new CollectionExercises();
        ArrayList<String> fruitList = collectionExercises.makeListOfThreeFruits("apple", "banana", "cherry");
        assert fruitList.size() == 3;
        assert fruitList.get(0).equals("apple");
        assert fruitList.get(1).equals("banana");
        assert fruitList.get(2).equals("cherry");
    }

    @Test
    public void testMakeFruitMap() {
        CollectionExercises collectionExercises = new CollectionExercises();
        HashMap<String, String> fruitMap = collectionExercises.makeFruitMap();
        assert fruitMap.size() == 5;
        assert fruitMap.get("apple").equals("red");
        assert fruitMap.get("banana").equals("yellow");
        assert fruitMap.get("cherry").equals("red");
        assert fruitMap.get("date").equals("brown");
        assert fruitMap.get("elderberry").equals("black");
    }

    @Test
    public void testLookupAppleColor() {
        CollectionExercises collectionExercises = new CollectionExercises();
        HashMap<String, String> fruitMap = new HashMap<>();
        fruitMap.put("apple", "red");
        fruitMap.put("banana", "yellow");
        fruitMap.put("cherry", "red");
        fruitMap.put("date", "brown");
        fruitMap.put("elderberry", "black");
        String color = collectionExercises.lookupAppleColor(fruitMap);
        assert color.equals("red");
    }

    @Test
    public void testMakeFruitSet() {
        CollectionExercises collectionExercises = new CollectionExercises();
        HashSet<String> fruitSet = collectionExercises.makeFruitSet("apple", "banana", "cherry");
        assert fruitSet.size() == 3;
        assert fruitSet.contains("apple");
        assert fruitSet.contains("banana");
        assert fruitSet.contains("cherry");
    }
}
