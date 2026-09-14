package com.delivery.delivery_api.dto;

import jakarta.validation.constraints.*;

public class ClienteDTO {

    @NotBlank (message = "O nome é obrigatório")
    @Size (min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    private String nome;

    @NotBlank (message = "O email é obrigatório")
    @Email (message = "O email deve ser válido")
    private String email;

    @NotBlank (message = "O telefone é obrigatório")
    @Pattern (regexp = "^[0-9]{10,11}$", message = "O telefone deve conter apenas números e ter entre 10 e 11 caracteres")
    private String telefone;

    @NotBlank (message = "O endereço é obrigatório")
    @Size (min = 5, max = 200, message = "O endereço deve ter entre 5 e 200 caracteres")
    private String endereco;

    //getter e setter

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
}
