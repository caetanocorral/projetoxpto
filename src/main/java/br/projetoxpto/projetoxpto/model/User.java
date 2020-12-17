package br.projetoxpto.projetoxpto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // será armazenado no BD
@Table(name = "tbl_usuario") // table criada
@Getter @Setter @NoArgsConstructor
public class User {

    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerado pelo campo e não pelo java > sequencia 1, 2, 3...
    @Column(name = "id")
    private int id;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "linkfoto", length = 200)
    private String linkfoto;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "racf", length = 7, nullable = false, unique = true)
    private String racf;

    @Column(name = "senha", length = 30, nullable = false)
    private String senha;

}
