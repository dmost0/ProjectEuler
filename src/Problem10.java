import java.util.*;
public class Problem10 {

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 2 ; i < 2000000; i++){
			list.add(i);
		}
		ListIterator<Integer> itr = list.listIterator();
		Integer check;
		int cursor = 0;
		while(itr.hasNext()){
			check = itr.next();
			while(itr.hasNext()){
				if(itr.next() % check == 0)
					itr.remove();
			}

			
			while(itr.hasPrevious()){
				itr.previous();
			}
			cursor++;
			for(int i = 0; i < cursor; i++)
				itr.next();
		}

		long sum = 0;
		
		
		
		
		for(Integer c: list){
			sum += c.longValue();
		}
		
		System.out.println(sum);
	}
	
}
