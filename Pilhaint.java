package pilha_sequencial_inteiros;

public class Pilhaint {
		public final int  N = 6;

		int dados[] = new int[N];
		int topo;

		public void init() {
			topo = 0;
		}

		public boolean isFull() {
			if(topo==N) {
				return true;
			} else {
		return false;		
			}
		}
		public void push(int elem) {
			if(isFull()==false) {dados[topo]=elem;
			topo++;
			} 
			else {
				System.out.println("Stack overflow");
			}
			
		}

		public int pop() {
			topo--;
			return dados[topo];
		}

}
