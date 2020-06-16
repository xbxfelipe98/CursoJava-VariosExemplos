package one.digitalinovationone.classes.pessoa;

import one.digitalinovationone.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario
{
    public static void main(String[] args)
    {
        final var batman = new SuperUsuario("batman","1234");

        batman.getLogin();

        //batman.getSenha(); Erro
        //String nomeDoCliente = batman.nome; Erro
    }
}
