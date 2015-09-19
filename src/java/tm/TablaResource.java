/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tm;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author ESTACION
 */
@Path("tabla")
public class TablaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TablaResource
     */
    public TablaResource() {
    }

    /**
     * Retrieves representation of an instance of tm.TablaResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{numero}")
    @Produces("text/html")
    public String getJson(@PathParam("numero") int numero) {
        String colors;
        switch (numero) {

            case 1:
                colors = "green";
                break;
            case 2:
                colors = "red";
                break;
            case 3:
                colors = "blue";
                break;
            case 4:
                colors = "pink";
                break;
            case 5:
                colors = "purple";
                break;
            default:
                colors = "white";
        }
        int resultado = 0;
        String tabla = "<html><head>"
                + "<title>TABLA DE MULTIPLICAR</title>"
                + "</head><body>" + "<h1  style=\"width:26%; margin: 0px auto;\">Tabla de multiplicar del "
                + numero + "</h1> <table style=\"width:26%; margin: 0px auto; background-color:"+colors+"\">";

        for (int i = 1; i < 11; i++) {
            resultado = i * numero;
            tabla += " <tr>"
                    + "    <td>" + numero + "</td>"
                    + "    <td>x</td>"
                    + "    <td>" + i + "</td>"
                    + "    <td>=</td>"
                    + "    <td>" + resultado + "</td>"
                    + "  </tr>";
        }
        tabla += "</table> "
                + "</body>"
                + "</html>";

        return tabla;
    }
}
