
package com.elity;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Stateless              //esto sirve para convertir a un EJB
@Path("/services")      //ruta que se consultara los servicios
public class services {
    
    @GET                //DEFINE UN METODO GET
    public String services(@QueryParam("clave") int num) { //EL PARAMETRO ES CLAVE
        String showMSN="";
        switch (num) {
            case 1001: showMSN = "Servicio:Consultoria Empresa:Elity Clave:1001 Director:Jth Rdz";
                break;
            case 1002: showMSN = "Servicio:Desarrollo Empresa:AppMoviles Clave:1002 Director:Fernet";
                break;
            case 1003: showMSN = "Servicio:Finanzas Empresa:Bursatil Clave:1003 Director:Xper";
                break;
        }
        return showMSN;
    }
    //DAR CLIC EN EL PROYECTO->DEPLOIT
    //RUTA DE ESTE SERVICIO
    //http://localhost:8080/api_developer_level1_GET/webresources/services?clave=1001
}
