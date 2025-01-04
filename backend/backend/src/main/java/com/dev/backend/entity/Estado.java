package com.dev.backend.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "estado") // Nome da tabela no banco de dados
@Data
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String sigla;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

    public void setDataAtualizacao(Date date) {
        this.dataAtualizacao = date;
    }

    public void setDataCriacao(Date date) {
        this.dataCriacao = date;
    }
}



// package com.dev.backend.entity;

// import java.sql.Date;



// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
// import jakarta.persistence.Temporal;
// import jakarta.persistence.TemporalType;
// import lombok.Data;

// @Entity
// @Table(name = "estado") //nome da tabela no banco de dados
// @Data
// public class Estado {

//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     private Long id;

//     private String nome;
//     private String sigla;
//     @Temporal(TemporalType.TIMESTAMP)
//     private Date dataCriacao;
//     @Temporal(TemporalType.TIMESTAMP)
//     private Date dataAtualizacao;

//     public void setDataAtualizacao(java.util.Date date) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'setDataAtualizacao'");
//     }
//     public void setDataCriacao(java.util.Date date) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'setDataCriacao'");
//     }
// }