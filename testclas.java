package stu;


import org.junit.*;
import static org.junit.Assert.*;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Exception;
import java.util.ArrayList;

public class AListTest {

private AList list = new AList();
private ArrayList listNull = list.AListNull();
private ArrayList listString;

@Before
public void SList() {
listString = list.AListString();
}

@Test
public void TestIsEmty() {
assertTrue(listNull.isEmpty());
}

@Test
public void TestSize() {
assertEquals(3, listString.size());
}

@Test
public void TestContains() {
assertTrue(listString.contains("world"));
}

@Test
public void testIndexOf() {
assertEquals(2, listString.indexOf("!"));
}

@Test
public void TestLastIndexOf() {
listString.add("Hello");
assertEquals(3, listString.lastIndexOf("Hello"));
}

@Test
public void TestGet() {
try
{
assertEquals("world", listString.get(1));
} catch (Exception ex)
{
System.out.println ();
}
}

@Test
public void TestSet() {
listString.set(1, ",");
assertEquals(",", listString.get(1));
}

@Test
public void testRemove() {
listString.remove(1);
assertFalse(listString.contains("world"));
}

@Test
public void TestClear() {
listString.clear();
assertTrue(listString.isEmpty());
} 
}
