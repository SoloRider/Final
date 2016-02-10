import java.util.Comparator;
public class InitiativeSorter implements Comparator<Fighter>
	{
		public int compare(Fighter inti1, Fighter inti2, Fighter inti3, Fighter inti4)
			{
				if(inti1.getIntiative() < inti2.getIntiative())
					return 1;
				else
					return -1;
			}

		@Override
		public int compare(Fighter o1, Fighter o2)
			{
				// TODO Auto-generated method stub
				return 0;
			}
	}
