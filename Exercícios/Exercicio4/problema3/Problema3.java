/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problema3;
import java.time.Instant;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author Alunos
 */
public class Problema3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 0;
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Loan> loans = new ArrayList<>();
        
        do{
            System.out.println("\nProblema 3 - Empréstimo de livros");
            System.out.println("1- Cadastrar pessoa\n2- Cadastrar livro\n3- Fazer empréstimo\n0 - Sair\n");
            answer = input.nextInt();
            
            //variáves de pessoas para ler
            String name = "";
            int cpf = 0;
            String email = "";
            String adress = "";
            int phone = 0;
            
            //variáveis de livro para ler
            String title = "";
            String author = "";
            int year = 0;
            int edition = 0;
            String publisher = "";
            
            //variáveis para empréstimo
            Date loan_date;
            Date return_date;
            
            //Variável para ler do usuário
            int selectedPersonIndex = 0;
            int selectedBookIndex = 0;
            //int index;
            
            switch(answer) {
                case 1 -> {
                    System.out.println("Digite o nome da pessoa: ");
                    name = input.next();
                    System.out.println("(Somente números) CPF: ");
                    cpf = input.nextInt();
                    System.out.println("E-mail: ");
                    email = input.next();
                    System.out.println("Endereço: ");
                    adress = input.next();
                    System.out.println("Número do telefone: ");
                    phone = input.nextInt();

                    Person person = new Person(name, cpf, email, adress, phone);
                    people.add(person);
                    System.out.println("Sucesso!");
                }
                case 2 -> { 
                    System.out.println("Digite o título do livro: ");
                    title = input.next();
                    System.out.println("Autor: ");
                    author = input.next();
                    System.out.println("Ano de lançamento: ");
                    year = input.nextInt();
                    System.out.println("Edição: ");
                    edition = input.nextInt();
                    System.out.println("Editora: ");
                    publisher = input.next();

                    Book book = new Book(title, author, year, edition, publisher);
                    books.add(book);
                    System.out.println("Sucesso!");
                }
                case 3 -> {
                    //Imprimir todas as pessoas na tela
                    for(int index = 1; index <= people.size(); index++) {
                        System.out.println(index +"- "+people.get(index-1).getName());
                    }

                    //Receber a escolha do usuário
                    System.out.println("Digite número correspondente à pessoa: ");
                    selectedPersonIndex = input.nextInt();

                    //Imprimir todas os livros na tela
                    for(int index = 1; index <= people.size(); index++) {
                        System.out.println(index+"- "+books.get(index-1).getTitle());
                    }

                    //Receber a escolha do usuário
                    System.out.println("Digite número correspondente ao livro: ");
                    selectedBookIndex = input.nextInt();

                    //Define data de empréstimo como agora
                    loan_date = Date.from(Instant.now());
                    //Somar 7 dias depois de hoje
                    return_date = Date.from(Instant.now().plus(7, ChronoUnit.DAYS));

                    System.out.println("Você deverá devolver o livro em: "+ return_date.toString());

                    Loan loan = new Loan(people.get(selectedPersonIndex-1), books.get(selectedBookIndex-1), loan_date, return_date);
                    loans.add(loan);
                    System.out.println("Sucesso!");
                }
                default -> System.out.println("Bye ;)");
            }

        }while(answer >= 1 && answer <= 3);
        
    }
}
