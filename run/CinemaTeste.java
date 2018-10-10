package run;

import java.util.Scanner;
import transacao.*;

public class CinemaTeste {
	/**
	 * @author Jose e Danilo
	 * Classe executora do test da aplicacao 
	 */
		private static final Scanner scanner = new Scanner(System.in);
	    private static int opcao = -1; 
	    private static int opcao1 = -1;
	    private static int opcao2 = -1;
	    //private static int opcao3 = -1; 
	    private static final String nomeArquivoFilmes = "/home/josephkzez/Cinema/filmes.txt";
	    private static final String nomeArquivoSessoes = "/home/josephkzez/Cinema/sessoes.txt";
	    //private static final String nomeArquivoSalas = "/home/josephkzez/Cinema/salas.txt";
	    private static final CatalogoFilmes catalogoPeli = new CatalogoFilmesImpl();
	    //criar um desse para cada um dos casos de uso
	    private static final CatalogoSessoes catalogoSession = new CatalogoSessoesImpl();
	    //private static final CatalogoSessao catalogoSala = new CatalogoSalaImpl();
	    
	    public static void main(String[] args) {

	    	//Um menu mais externo perguntando ao funcionario qual o caso de uso que ele deseja
	    	//Voce deseja manipular Filme? Sala? Sessao? Ou ingresso?
	    	
	    	//Menu Externo
	        while (opcao != 0) {
	            try {
	                System.out.println("Bem vindo ao Sistema de Gerência de Cinemas \n Escolha opcao:\n1.- Gerência de Filmes"
	                        + "\n2.- Gerência de Sessões\n"
	                        + "3.- Gerência de Salas\n"
	                        + "0.- Sair");
	                
	                opcao = Integer.parseInt(scanner.nextLine());

	                switch (opcao) {
	                    case 1: //Menu Gerência Filmes
	                        //1. Creamos el objeto que administra el catalogo de personas
	                        //La creacion del archivo es opcional, de todas maneras se creara 
	                        //al escribir por primera vez en el archivo
	                    	menufilmes();
	            
	                    case 2: //Menu Gerência Sessões
	                    	menusessoes();
	                    	break;
	                    case 3:
	                    	//menusalas();
	                    	break;
	                    	
	                    default :
	                    	break;
	                    	
	                }
	                System.out.println("\n"); 

	            } catch (Exception e) {
	                System.out.println("Erro!"); //atualizar para erro se 
	                //for Erro em Filme, Erro em Sala, Erro em Sessao, Erro em Ingresso
	            }
	                    	/*while (opcao2 != 0) {
	            	            try {
	            	                System.out.println("Escolha opção:\n1.- Catálogo de Sessões"
	            	                        + "\n2.- Inserir Sessão\n"
	            	                        + "3.- Listar Sessões\n"
	            	                        + "4.- Buscar Sessões\n"
	            	                        + "0.- Sair");
	            	                
	            	                opcao2 = Integer.parseInt(scanner.nextLine());

	                    	
	                    	switch (opcao2) {
		                    case 1:
		                        //1. Creamos el objeto que administra el catalogo de personas
		                        //La creacion del archivo es opcional, de todas maneras se creara 
		                        //al escribir por primera vez en el archivo
		                        catalogoSessao.iniciarArquivo(nomeArquivoSessoes);
		                        break;
		                    case 2:
		                        //2. agregar informacion archivo
		                        System.out.println("Digite o nome de uma sessão para adicionar::");
		                        String nome= scanner.nextLine();
		                        catalogoSessao.inserirSessao(nome, nomeArquivoSessoes);
		                        break;
		                    case 3:
		                        //3. listar catalogo completo
		                        catalogoSessao.listarFilmes(nomeArquivoSessoes);
		                        break;
		                    case 4:
		                        //4. Buscar pelicula
		                        System.out.println("Digite o nome de uma sessão para busca:");
		                        String busca = scanner.nextLine();
		                        catalogoPeli.buscaFilme(nomeArquivoFilmes, busca);
		                        break;
		                    case 0:
		                        System.out.println("Saindo Gerencia de Filmes!");
		                        break;
		                    default:
		                        System.out.println("Opção não reconhecida");
		                        break;
		                }
		                System.out.println("\n"); 

		            } catch (Exception e) {
		                System.out.println("Erro!");
		            }
	            }

	                    case 3: //Menu Gerência Salas
	                        //3. listar catalogo completo
	                        catalogoPeli.listarFilmes(nomeArquivoFilmes);
	                        break;
	                    case 0:
	                        System.out.println("!Até logo!");
	                        break;
	                    default:
	                        System.out.println("Opção não reconhecida");
	                        break;
	                }
	                System.out.println("\n"); 

	            } catch (Exception e) {
	                System.out.println("Erro!"); //atualizar para erro se 
	                //for Erro em Filme, Erro em Sala, Erro em Sessao, Erro em Ingresso
	            }
	        }
	    	
	        //Mientras la opcion elegida sea 0, preguntamos al usuario
	        while (opcao != 0) {
	            try {
	                System.out.println("Elige opcion:\n1.- Catálogo de filmes "
	                        + "\n2.- Inserir Filme\n"
	                        + "3.- Listar Filmes\n"
	                        + "4.- Busca de Filme\n"
	                        + "0.- Sair");
	                
	                opcao = Integer.parseInt(scanner.nextLine());

	                //Ejemplo de switch case en Java
	                switch (opcao) {
	                    case 1:
	                        //1. Creamos el objeto que administra el catalogo de personas
	                        //La creacion del archivo es opcional, de todas maneras se creara 
	                        //al escribir por primera vez en el archivo
	                        catalogoPeli.iniciarArquivo(nomeArquivoFilmes);
	                        break;
	                    case 2:
	                        //2. agregar informacion archivo
	                        System.out.println("Digite o nome de um filme para adicionar::");
	                        String nome= scanner.nextLine();
	                        catalogoPeli.inserirFilme(nome, nomeArquivoFilmes);
	                        break;
	                    case 3:
	                        //3. listar catalogo completo
	                        catalogoPeli.listarFilmes(nomeArquivoFilmes);
	                        break;
	                    case 4:
	                        //4. Buscar pelicula
	                        System.out.println("Digite o nome de um filme para busca:");
	                        String busca = scanner.nextLine();
	                        catalogoPeli.buscaFilme(nomeArquivoFilmes, busca);
	                        break;
	                    case 0:
	                        System.out.println("!Até logo!");
	                        break;
	                    default:
	                        System.out.println("Opção não reconhecida");
	                        break;
	                }
	                System.out.println("\n"); 

	            } catch (Exception e) {
	                System.out.println("Erro!"); //atualizar para erro se 
	                //for Erro em Filme, Erro em Sala, Erro em Sessao, Erro em Ingresso
	            }
	        }*/
	    }		



	    }
	        
	        public static void menufilmes(){
            	while (opcao1 != 0) {
    	            try {
    	                System.out.println("Elige opcion:\n1.- Catálogo de filmes "
    	                        + "\n2.- Inserir Filme\n"
    	                        + "3.- Listar Filmes\n"
    	                        + "4.- Busca de Filme\n"
    	                        + "0.- Sair");
    	                
    	                opcao1 = Integer.parseInt(scanner.nextLine());

            	
            	switch (opcao1) {
                case 1:
                    //1. Creamos el objeto que administra el catalogo de personas
                    //La creacion del archivo es opcional, de todas maneras se creara 
                    //al escribir por primera vez en el archivo
                    catalogoPeli.iniciarArquivo(nomeArquivoFilmes);
                    break;
                case 2:
                    //2. agregar informacion archivo
                    System.out.println("Digite o nome de um filme para adicionar::");
                    String nome= scanner.nextLine();
                    catalogoPeli.inserirFilme(nome, nomeArquivoFilmes);
                    break;
                case 3:
                    //3. listar catalogo completo
                    catalogoPeli.listarFilmes(nomeArquivoFilmes);
                    break;
                case 4:
                    //4. Buscar pelicula
                    System.out.println("Digite o nome de um filme para busca:");
                    String busca = scanner.nextLine();
                    catalogoPeli.buscaFilme(nomeArquivoFilmes, busca);
                    break;
                case 0:
                    System.out.println("Saindo Gerencia de Filmes!");
                    break;
                default:
                    System.out.println("Opção não reconhecida");
                    break;
            }
            System.out.println("\n"); 

        } catch (Exception e) {
            System.out.println("Erro!");
        }
    }	
	        
	        }
	        
	        public static void menusessoes() {

	           	while (opcao2 != 0) {
    	            try {
    	                System.out.println("Escolha a opção:\n1.- Catálogo de sess]oes"
    	                        + "\n2.- Inserir Sessão\n"
    	                        + "3.- Listar Sessões\n"
    	                        + "4.- Busca de Sessão\n"
    	                        + "0.- Sair");
    	                
    	                opcao2 = Integer.parseInt(scanner.nextLine());

	        	
	        	switch (opcao2) {
                case 1:
                    //1. Creamos el objeto que administra el catalogo de personas
                    //La creacion del archivo es opcional, de todas maneras se creara 
                    //al escribir por primera vez en el archivo
                    catalogoSession.iniciarArquivo(nomeArquivoSessoes);
                    break;
                case 2:
                    //2. agregar informacion archivo
                    System.out.println("Digite o nome de uma sessão para adicionar::");
                    String nome= scanner.nextLine();
                    catalogoSession.inserirSessao(nome, nomeArquivoSessoes);
                    break;
                case 3:
                    //3. listar catalogo completo
                    catalogoSession.listarSessoes(nomeArquivoSessoes);
                    break;
                case 4:
                    //4. Buscar pelicula
                    System.out.println("Digite o nome de uma sessão para busca:");
                    String busca = scanner.nextLine();
                    catalogoSession.buscaSessao(nomeArquivoSessoes, busca);
                    break;
                case 0:
                    System.out.println("Saindo Gerencia de Sessões!");
                    break;
                default:
                    System.out.println("Opção não reconhecida");
                    break;
	        	}
            System.out.println("\n"); 

        } catch (Exception e) {
            System.out.println("Erro!");
        }
    }

	        }
}
	        
	        
