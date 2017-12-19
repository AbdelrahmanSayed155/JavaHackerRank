package JavaPriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {
     
	PriorityQueue<Student> pq; 
	
	
	public List<Student> getStudents(List<String> events){
		pq = new PriorityQueue<Student>();
		
		for(int y=0;y<events.size();y++) {
            String [] entered = events.get(y).split(" ");			
           if(entered[0].equals("SERVED")) {
        	   pq.poll();
           }else if(entered[0].equals("ENTER")) {
        	   Student st = new Student();
        	   st.setName(entered[1]);
        	   st.setCGPA(Double.parseDouble(entered[2]));
        	   st.setId(Integer.parseInt(entered[3]));
        	   pq.offer(st);
           } 
		}

		
		Student stud= pq.poll();
		List<Student> pStudent =  new ArrayList<>();
		while(stud !=null) {
			pStudent.add(stud);
			stud = pq.poll();
		}
		
		
		return pStudent;
	}
}
