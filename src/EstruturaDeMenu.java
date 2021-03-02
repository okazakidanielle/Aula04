
public class EstruturaDeMenu {

	public static void main(String[] args) {

		 int opcao =0;
		 
		 
		 while(opcao!= 4 ) {
			 System.out.println ("Escolha uma das opções a seguir:");
			 System.out.println ("1 - Opção A");
		     System.out.println ("2 - Opção B"); 
		     System.out.println	("3 - Opção C");
		     System.out.println	("4 - Sair");
		     System.out.println	("Digite a opção desejada");
		     opcao = leitor.nextInt();
		    	        
		     switch (opcao){
			  case 1:
				  System.out.println ("Voce escolheu a opcao A");
				  break;
				
			  case 2:
				  System.out.println ("Voce escolheu a opcao B");
				  break;  
				  
			  case 3:
				  System.out.println ("Voce escolheu a opcao C");
				  break; 
		   			   
				  
				  
		  }
		 }
	}

}
