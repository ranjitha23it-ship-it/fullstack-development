import java.util.ArrayList;
import java.util.List;
public class LearnList {
public static void main(String[] args) {
List<String> learners =new ArrayList<String>();
System.out.println("Empty list: "+learners);
learners.add("Karthik");
System.out.println("List with 1 element: "+learners);
learners.add("Ranji");
learners.add("Rams");
learners.add("Sandy");
System.out.println("List with multiple elements:"+learners);
learners.add(1, "Swathi");
System.out.println("Current List: "+learners);		
int sizeOfList = learners.size();
System.out.println("List Size: "+sizeOfList);
boolean contains = learners.contains("Swathi");
System.out.println("Present or not: "+contains);		
String index2 = learners.get(2);
System.out.println("secondElement :"+index2);
learners.clear();
System.out.println("Current list: "+learners);
List<String> employees =new ArrayList<String>();
System.out.println("Empty List: "+employees);
employees.addAll(learners);
System.out.println("Current employess List: "+employees);
}
}