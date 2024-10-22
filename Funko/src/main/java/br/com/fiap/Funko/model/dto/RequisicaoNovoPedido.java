package br.com.fiap.Funko.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RequisicaoNovoPedido(
    @NotBlank
    @Size(min=5,max=250, message = "quantidade minima de 5 e máxima de 250 caracteres")
    String nomeProduto,
    @NotBlank
    String urlProduto,
    @NotBlank(message = "URL da imagem não pode ficar em branco")
    String urlImagem,
    String descricao){
}
