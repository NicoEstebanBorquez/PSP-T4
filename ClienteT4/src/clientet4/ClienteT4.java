package clientet4;

import java.util.List;
import tarea6.WebServiceT6;
import tarea6.WebServiceT6_Service;
import tarea6.Pais;
import tarea6.Moneda;
import tarea6.Zona;

public class ClienteT4 {

//• La aplicación debe permitir al usuario obtener los siguientes listados:
    public static void main(String[] args) {
        WebServiceT6_Service s = new WebServiceT6_Service();
        WebServiceT6 conexion = s.getWebServiceT6Port();
        /*
       getMonedaByCodigo
       ///getMonedas
       //getPaises
       getPaisesMoneda
       getZonaById
         */
//o Listado de zonas geográficas
        List<Zona> listaZonas = conexion.getZonas();
        System.out.println("[--------------- LISTADO DE ZONAS ---------------]");
        for (Zona z : listaZonas) {
            System.out.println(
                    "ID: " + z.getId() + "\n"
                    + "Nombre: " + z.getNombre() + "\n");
        }

//o Listado de monedas
        List<Moneda> listaMonedas = conexion.getMonedas();
        System.out.println("[--------------- LISTADO DE MONEDAS ---------------]");
        for (Moneda m : listaMonedas) {
            System.out.println(
                    "Código: " + m.getCodigo() + "\n"
                    + "Nombre: " + m.getNombre() + "\n");
        }

//o Listado de países completo
        List<Pais> listaPaises = conexion.getPaises();
        System.out.println("[--------------- LISTADO DE PAISES ---------------]");
        for (Pais p : listaPaises) {
            System.out.println(
                    "ID: " + p.getId() + "\n"
                    + "Nombre: " + p.getNombre() + "\n"
                    + "idArea: " + p.getIdArea() + "\n"
                    + "Cod. Divisa: " + p.getCodigoDivisa() + "\n"
                    + "Cod. Bandera: " + p.getCodigoBandera() + "\n"
                    + "Cod. NIC: " + p.getCodigoNic() + "\n");
        }

//o Listado de países por zona geográfica. El usuario insertará el nombre de la zona geográfica.
        List<Pais> listaPaisesPorZona = conexion.getPaisesZona(6);
        System.out.println("[--------------- LISTADO DE PAISES POR ZONA ---------------]");
        for (Pais p : listaPaisesPorZona) {
            System.out.println(
                    "ID: " + p.getId() + "\n"
                    + "Nombre: " + p.getNombre() + "\n"
                    + "idArea: " + p.getIdArea() + "\n"
                    + "Cod. Divisa: " + p.getCodigoDivisa() + "\n"
                    + "Cod. Bandera: " + p.getCodigoBandera() + "\n"
                    + "Cod. NIC: " + p.getCodigoNic() + "\n");
        }

//o Listado de países por moneda. El usuario insertará el nombre de la moneda. 
        List<Pais> listaPaisesPorMoneda = conexion.getPaisesMoneda("AED");
        System.out.println("[--------------- LISTADO DE PAISES POR MONEDA ---------------]");
        for (Pais p : listaPaisesPorMoneda) {
            System.out.println(
                    "ID: " + p.getId() + "\n"
                    + "Nombre: " + p.getNombre() + "\n"
                    + "idArea: " + p.getIdArea() + "\n"
                    + "Cod. Divisa: " + p.getCodigoDivisa() + "\n"
                    + "Cod. Bandera: " + p.getCodigoBandera() + "\n"
                    + "Cod. NIC: " + p.getCodigoNic() + "\n");
        }

    }
}
