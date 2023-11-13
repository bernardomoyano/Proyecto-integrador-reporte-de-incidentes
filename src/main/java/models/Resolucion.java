package models;

import java.util.Date;

public class Resolucion {
    private Integer id;
    private Incidente incidente;
    private Integer idTecnico;
    private String tiempoResolucion;
    private Date fechaEstimada;
    private Boolean isResuelto;
    private Date fechaResolucion;
}
