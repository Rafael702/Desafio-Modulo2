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
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Map<String, String> funcionarios = new HashMap<String, String>();

        String nomeFuncionario;
        String telefoneFuncionario;
        String emailFuncionario;
        String cpfFuncionario;


        System.out.println("Olá! Seja Bem vindo ao Programa Gerenciador de Funcionários!!!");
        //Adicionando Funcionários
        System.out.println("Informe o nome do funcionário: ");
        nomeFuncionario = entrada.nextLine();

        System.out.println("Informe o CPF do funcionário: ");
        cpfFuncionario = entrada.nextLine();

        System.out.println("Informe o número de telefone do funcionário para contato: ");
        telefoneFuncionario = entrada.nextLine();

        System.out.println("Informe o email do funcionário para contato: ");
        emailFuncionario = entrada.nextLine();

        funcionarios.put("CPF do Funcionário: " + cpfFuncionario,
                "| Nome do funcionário: " + nomeFuncionario + "| Telefone do Funcionário: " + telefoneFuncionario
                        + "| Email do Funcionário: " + emailFuncionario);

        System.out.println("Lista de Funcionários: ");
        for (String dadosFuncionario : funcionarios.keySet()) {
            System.out.println(dadosFuncionario + funcionarios.get(dadosFuncionario));
        }
    }
}
