import java.util.*;
class Tester{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> queue = new ArrayList();
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			String input = sc.next();
			if(input.equals("ENTER")){
				Student s = new Student(sc.next(),sc.nextDouble(),sc.nextInt());
				int pos=0;
				for(int j=0;j<queue.size();j++){
					if(queue.get(j).Greater(s)){
						pos = j+1;
					}
					else break;
				}
				queue.add(pos,s);
			}
			else{
				queue.remove(0);
			}
		}
		if(queue.size()>0){
			for(int i=0;i<queue.size();i++){
				System.out.println(queue.get(i).getName());
			}
		}
		else System.out.println("EMPTY");
		
	}
}