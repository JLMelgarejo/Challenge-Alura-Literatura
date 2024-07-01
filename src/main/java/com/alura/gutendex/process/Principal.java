package com.alura.gutendex.process;

import com.alura.gutendex.services.ConsumoAPI;
import com.alura.gutendex.services.ConvierteDatos;

public class Principal {
    private ConsumoAPI consumoAPI =new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private final String URL_BASE="https://gutendex.com/books/";
    public void muestraMenu(){
        var json= consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);

    }
}
