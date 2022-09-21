package lab8;

public class MyTable {
	private Entry[] entries;
	private final int INITIAL_SIZE = 26;

	public MyTable() {
		// TODO Auto-generated constructor stub
		entries = new Entry[INITIAL_SIZE];
		loadData();
	}

	private void loadData() {
		for(int i =0 ; i< entries.length; i++) {
			entries[i] = new Entry((char)((int)'a'+i) , null);
		}
	}

	// returns the String that is matched with char c in the table
	public String get(char c) {
		// implement
		
		for(Entry entry: entries) {
			if(entry.ch == c) {
				return entry.str;
			}
		}
		return null;
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		// implement
		
		for(Entry entry: entries) {
			if(entry.ch == c) {
				entry.str = s;
				break;
			}
		}
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		// implement
		StringBuilder sb = new StringBuilder();
		for(Entry entry: entries) {
			if(entry.str != null) {
				sb.append(entry.ch+"->"+entry.str+"\n");
			}
				
		}
		
		return sb.toString();
	}

	private class Entry {
		char ch;
		String str;
		Entry(char ch, String str) {
			// implement
			this.ch = ch;
			this.str = str;
		}

		// returns a String of the form "ch->str"
		public String toString() {
			// implement
			if(str != null)
				return ch+"->"+str;
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('c',"Charlie");
		t.add('w',"Willie");
		String s = t.get('b');
		System.out.println(s);
		System.out.println(t);
		
	}


}