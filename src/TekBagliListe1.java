class Node {
 
int data ; 
Node next ; 

Node ( int data ) {
	this.data = data ; 
	next = null ; 
}
	
}

public class TekBagliListe1 {

	Node head ; 
	Node tail ; 

	public TekBagliListe1 () {
		
		head = null ; 
		tail = null ; 
	}
		

	void Basekle ( Node eleman  ) {
		
		if ( head == null ) {
			head = eleman ; 
			tail = eleman ; 
			
		}
		else {
			eleman.next = head ; 
			head = eleman ; 
			
			
		}
		
		
		
	}


	void Sonaekle (Node eleman ) {
		if ( head == null ) {
			head = eleman ; 
			tail = eleman ; 
			}
		else {
			eleman.next = null ; 
			tail.next = eleman ; 
			tail = eleman  ; 
				
		}
		
	}

	void araekle ( Node eleman , Node once) {
		
		eleman.next = once.next ; 
		once.next = eleman ; 
		
	}


	public void Baştansil ( Node Silinecek ) {
		if ( head == null ) {
			
			System.out.println("liste boş , silinecek nesne yok ");
			
			
		}
		else if ( head.next == null ) {
			head = null ; 
			tail = null ; 
			System.out.println(" Listede kalan son elemanda silindi ");
			
		}
		
		else {
			
			head = head.next ; 
			System.out.println(" baştaki eleman silindi ");
			
		}
		
	}
	
	public void ListeOrtasıSil ( Node Silinecek) {
		Node temp = head ; 
		Node tempdenOnce = null  ; 
		while ( temp != Silinecek ) {
			
			tempdenOnce = temp ; 
			temp = temp.next ; 
		}
		tempdenOnce.next = temp.next ; 
		temp.next = null ; 
		System.out.println("Seçilen Eleman Silindi");
	}




	public void SondanSil ( Node Silinecek ) {
		if ( head == null ) {
			
			System.out.println("liste boş , silinecek nesne yok ");
			
			
		}
		else if ( head.next == null ) {
			head = null ; 
			tail = null ; 
			System.out.println(" Listede kalan son elemanda silindi ");
			
		}
		
		else {
			  
			Node temp = head ; 
			Node tempdenOnce = head ; 
	         		
			while ( temp.next != null ) {
				
				tempdenOnce = temp ; 
				temp =temp.next ; 
				
			}
			
			tempdenOnce.next = null ; 
			tail = tempdenOnce ; 
			System.out.println(" Sondan eleman silindi ");
			
			
			
		}
		
	}




	void yazdır () {
		
		Node temp = head ; 
		if ( head == null ) {
			
		System.out.println("bu liste boş "); 
		
		}
		
		else {
			while ( temp != null ) {
				
				System.out.print(temp.data + " --> " + " ");
				temp = temp.next ; 
			}
			
			
		}}






		public static void main(String[] args) {
			
			 TekBagliListe1 list = new  TekBagliListe1 ();
			
			Node elemanbir = new Node (5); 
			Node elemaniki = new Node (7);
	        Node elemanuc  = new Node (8);  
		    Node elemandort = new Node(9); 
		    Node elemanbes = new Node (85);
	        
		    list.Basekle(elemanbir);
			list.Sonaekle(elemaniki);
			list.Sonaekle(elemanuc);
	        list.Sonaekle(elemandort);
	     list.araekle(elemanbes,elemanuc);  
	     list.ListeOrtasıSil(elemanuc);
	     
	     list.yazdır();
	    
		 //list.araekle(elemaniki, elemandort);
		 
		
	     
	     
	     
	     
		}
		}
	

