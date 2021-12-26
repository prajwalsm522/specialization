package streamsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streamsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		st1.setsId(1);
		st1.setsName("prajwal");
		st1.setsBranch("cse");
	
		Student st2 = new Student();
		st2.setsId(2);
		st2.setsName("raj");
		st2.setsBranch("IS");
		
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(st1);
		studentList.add(st2);
		
		List<Student> sortedlist = studentList.stream().sorted(Comparator.comparing(Student::getsName)).collect(Collectors.toList());
		
		System.out.print(sortedlist);
	}

}
