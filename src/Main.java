
public class Main {
    public static void main(String[] args) {


        Empresa empresa = new Empresa();
        System.out.println(empresa.nomeEmpresa);
        System.out.println(empresa.CNPJEmpresa);
        System.out.println(empresa.tipoEmpresa);

        System.out.println("O nome do funcionario é: " + empresa.nomeFuncionario);
        System.out.println("O salario do funcionario é: " + empresa.valorSalarioFuncionario);
        System.out.println("O funcionario trabalha no: " + empresa.cargoFuncionario);


        //Testando a nova Branch
        EmpresaSetor empresa = new EmpresaSetor();
        System.out.println(empressaSetor.nomeSetorJuridico);
        System.out.println(empressaSetor.nomeSetorRH);


        Funcionario funcionario = new Funcionario();
        System.out.println("O nome do funcionario é: " + funcionario.nomeFuncionario);
        System.out.println("O salario do funcionario é: " + funcionario.valorSalarioFuncionario);
        System.out.println("O cargo do funcionario é: " + funcionario.cargoFuncionario);


        System.out.println(empresa.cargoFuncionario.);



        int aumento = 120;
        int salarioFuncionario = 1512;

        System.out.println();


        System.out.println(aumento + salarioFuncionario);

        System.out.println(aumento - salarioFuncionario);

        System.out.println(aumento * salarioFuncionario); // Não acoontece no mundo real

        System.out.println(aumento / salarioFuncionario);

        System.out.println(salarioFuncionario / aumento);


    }
}