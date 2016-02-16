import java.util.Collections;
import java.util.Comparator;
public class InitiativeSorter implements Comparator<Fighter>
	{
		public int compare(Fighter f1, Fighter f2)
			{
				if(f1.getInitiative() < f2.getInitiative())
					return 1;
				else
					return -1;
			}
		
	}
