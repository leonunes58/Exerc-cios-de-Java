import Entities.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        Scanner sc = new Scanner(System.in);

        List<Users> users = new ArrayList<>();
        int quantidade;
        int idMudanca;

        System.out.print("Quantidade de funcionários: ");
        quantidade = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i = 0; i < quantidade; i++) {
            Users user = new Users();

            user.setId(i);

            System.out.print("Digite o nome do funcionário: ");
            String name = sc.nextLine();
            user.setName(name);
            System.out.println();

            System.out.print("Digite o salário do funcionário: ");
            double salario = sc.nextDouble();
            user.setSalary(salario);
            sc.nextLine();
            System.out.println();

            users.add(user);
        }
        for (Users user: users){
            System.out.printf("Id: %d\n", user.getId());
            System.out.printf("Funcionário: %s\n", user.getName());
            System.out.printf("Salário: R$%.2f\n", user.getSalary());
            System.out.println();
        }

        System.out.print("Digite o id do usuário que deseja modificar: ");
        idMudanca = sc.nextInt();
        boolean usuarioEncontrado = false;
        for (Users user: users) {
            double porcentagem = 0;
            if(user.getId() == idMudanca) {
                System.out.print("Digite a porcentagem que desejam aumentar: ");
                porcentagem = sc.nextInt();
                user.aumentoSalario(porcentagem, user.getSalary());
                System.out.println();
                usuarioEncontrado = true;
            }
        }
        for (Users user: users) {
            System.out.printf("%d, %s, R$%.2f\n", user.getId(), user.getName(), user.getSalary());
            System.out.println();
        }

        if (!usuarioEncontrado) {
            System.out.println("Esse id não existe!");
        }
        System.out.println();


        sc.close();
    }
}