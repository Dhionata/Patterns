package prototype

import java.util.*

object TesteCliente {
    var clientes = LinkedList<Cliente>()
    var clientesCopias = LinkedList<Cliente>()

    @JvmStatic
    fun main(args: Array<String>) {
        val cli1 = ClientePF()
        cli1.cod = 1
        cli1.nome = "Fulano"
        cli1.cpf = "123.123.123-12"
        clientes.add(cli1)
        val novoCli = cli1.clonar() as ClientePF
        //clientes.add(novoCli);
        if (cli1.equals(novoCli)) {
            println("Cli1 é igual ao novoCli")
        } else {
            println("Cli1 é diferente ao novoCli")
        }
        val cli2 = ClientePJ()
        cli2.cod = 2
        cli2.nome = "Beltrano"
        cli2.cnpj = "333.33333333"
        clientes.add(cli2)
        val cli3 = ClientePF()
        cli3.cod = 1
        cli3.nome = "João"
        cli3.cpf = "123.123.123-12"
        clientes.add(cli3)
        criarClones()
        println("Tamanho da lista de clones: " + clientesCopias.size)
        testarNovaFuncionalidade()
    }

    fun criarClones() {
        var novoCliPF: ClientePF
        var novoCliPJ: ClientePJ
        for (i in clientes.indices) {
            if (clientes[i] is ClientePF) {
                novoCliPF = clientes[i].clonar() as ClientePF
                clientesCopias.add(novoCliPF)
            } else {
                novoCliPJ = clientes[i].clonar() as ClientePJ
                clientesCopias.add(novoCliPJ)
            }
        }
    }

    private fun testarNovaFuncionalidade() {

        //novo validador de cpf
        //String[] partes = new String[3];
        //String[] subpart = new String[2];
        var novoCliPF: ClientePF
        //String novoCPF;
        for (i in clientesCopias.indices) {
            if (clientesCopias[i] is ClientePF) {
                novoCliPF = clientesCopias[i] as ClientePF
                println("Nome antigo: " + novoCliPF.nome)
                novoCliPF.nome = novoCliPF.nome?.uppercase(Locale.getDefault())
                /* String[] partes = novoCliPF.getCpf().split(".");
                System.out.println(partes.length);
                //subpart = partes[].split("-");
                
                //novoCPF = partes[0] + partes[1] + subpart[0] + subpart[1];
                
                System.out.println("Novo cpf: "+novoCPF);
                */println("Novo nome: " + novoCliPF.nome)
            }
        }
    }
}