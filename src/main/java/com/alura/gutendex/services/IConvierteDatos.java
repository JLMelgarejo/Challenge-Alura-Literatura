package com.alura.gutendex.services;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class <T> clase);
}
