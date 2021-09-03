/**
 * Crie um programa para gerenciar uma lista de funcionários de uma empresa,
 * cada funcionário tem nome, telefone, email e CPF. No final do programa deve ser
 * exibida a lista de funcionários cadastrados.
 * Entrega Mínima: O sistema permite, via terminal, inserir pelo menos 1 funcionário
 * em uma lista e retornar o mesmo na tela.
 * Entrega Média: O sistema permite adicionar mais de um funcionário e apresenta
 * um menu para decidir se deverá:
 * 1. Adicionar mais funcionários.
 * 2. Exibir a lista de todos os funcionários cadastrados.
 * 3. Encerrar o programa.
 * Entrega Máxima: O Sistema permite excluir um funcionário usando como
 * parâmetro o CPF e não permite inserir um funcionário com o CPF repetido.
 **/
package br.com.zup.desafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciarFuncionarios {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        Map<String, String> funcionarios = new HashMap<String, String>();

        boolean chave = true;
        int opcao = 0;


        System.out.println("Olá! Seja Bem vindo ao Programa Gerenciador de Funcionários!!!");


        do {
            System.out.println("Digite 1: Para adicionar funcionários na lista de cadastrados.");
            System.out.println("Digite 2: Para exibir a lista de todos os funcionários cadastrados.");
            System.out.println("Digite 3: Deletar Funcionário: ");
            System.out.println("Digite 4: Para Encerrar o programa.");
            System.out.println("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                //Adicionando Funcionários
                System.out.println("Informe o nome do funcionário: ");
                String nomeFuncionario = entrada.nextLine();

                System.out.println("Informe o CPF do funcionário: ");
                String cpfFuncionario = entrada.nextLine();
                // Verificando a existência de duplicidade com condicionais.
                if (funcionarios.size() != 0) {
                    if (funcionarios.containsKey(cpfFuncionario)) {
                        System.out.println("CPF não cadastrado");
                    } else {
                        System.out.println("Informe o número de telefone do funcionário para contato: ");
                        String telefoneFuncionario = entrada.nextLine();

                        System.out.println("Informe o email do funcionário para contato: ");
                        String emailFuncionario = entrada.nextLine();
                        funcionarios.put(cpfFuncionario, "| Nome do funcionário: " + nomeFuncionario
                                + "| Telefone do Funcionário: " + telefoneFuncionario
                                + "| Email do Funcionário: " + emailFuncionario);
                        System.out.println("Usuário cadastrado com Sucesso!!!");
                        Thread.sleep(1000);
                    }

                } else {
                    System.out.println("Informe o número de telefone do funcionário para contato: ");
                    String telefoneFuncionario = entrada.nextLine();

                    System.out.println("Informe o email do funcionário para contato: ");
                    String emailFuncionario = entrada.nextLine();
                    funcionarios.put(cpfFuncionario, "| Nome do funcionário: " + nomeFuncionario
                            + "| Telefone do Funcionário: " + telefoneFuncionario
                            + "| Email do Funcionário: " + emailFuncionario);
                    System.out.println("Usuário cadastrado com Sucesso!!!");
                    Thread.sleep(1000);
                }


            } else if (opcao == 2) {
                //Apresentando Funcionarios Cadastrados
                System.out.println("Lista de Funcionários: ");
                System.out.println("----------------------------------------------------------");
                for (String dadosFuncionario : funcionarios.keySet()) {
                    System.out.println(dadosFuncionario + funcionarios.get(dadosFuncionario));
                }
                Thread.sleep(2005);
                System.out.println("----------------------------------------------------------");


            } else if (opcao == 3) {
                //Deletando Funcionário da Lista
                System.out.println("Informe o CPF do Funcionario que você deseja deletar: ");
                String cpfDeletarFunc = entrada.nextLine();
                //cpfDeletarFunc - Começará a Fazer parte da lista. Portanto,
                // se seguirmos com a exclusão normalmente, a lista será diminuida e teremos um erro do tipo Exception.
                //Por conta disso, uma variavel deve armazenar o valor.
                String cpfDeletado = "";

                if (funcionarios.containsKey(cpfDeletarFunc)) {
                    System.out.println("CPF deletado com Sucesso " + funcionarios.get(cpfDeletarFunc) + "!!!");
                    cpfDeletado = cpfDeletarFunc;
                    funcionarios.remove(cpfDeletado);
                } else {
                    System.out.println("CPF não encontrado. Verifique a lista de cadastros de Funcionário.");
                }


            } else if (opcao == 4) {
                chave = false;
            } else {
                System.out.println("Você digitou um valor inválido😐...");
                System.out.println("Digite um valor entre 1 à 4, de acordo com o menu. 😉");
            }

        } while (chave == true);

        System.out.println("Foi um prazer te ter aqui!!");
        System.out.println("Volte mais vezes!!!❤");
        System.out.println("---------------------------------------");
        System.out.printf("%25s", "Fim do Programa");
        System.out.println("\n---------------------------------------");
    }
}
