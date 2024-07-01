package com.alura.gutendex.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosAutor(
        @JsonAlias String nombreAutor,
        String fechaDeNacimientoAutor
) {
}
