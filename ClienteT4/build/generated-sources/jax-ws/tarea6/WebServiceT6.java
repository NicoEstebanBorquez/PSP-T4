
package tarea6;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "webServiceT6", targetNamespace = "http://tarea6/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceT6 {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "insertarDatos", targetNamespace = "http://tarea6/", className = "tarea6.InsertarDatos")
    @ResponseWrapper(localName = "insertarDatosResponse", targetNamespace = "http://tarea6/", className = "tarea6.InsertarDatosResponse")
    @Action(input = "http://tarea6/webServiceT6/insertarDatosRequest", output = "http://tarea6/webServiceT6/insertarDatosResponse")
    public void insertarDatos();

    /**
     * 
     * @return
     *     returns java.util.List<tarea6.Moneda>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMonedas", targetNamespace = "http://tarea6/", className = "tarea6.GetMonedas")
    @ResponseWrapper(localName = "getMonedasResponse", targetNamespace = "http://tarea6/", className = "tarea6.GetMonedasResponse")
    @Action(input = "http://tarea6/webServiceT6/getMonedasRequest", output = "http://tarea6/webServiceT6/getMonedasResponse")
    public List<Moneda> getMonedas();

    /**
     * 
     * @param idZona
     * @return
     *     returns tarea6.Zona
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getZonaById", targetNamespace = "http://tarea6/", className = "tarea6.GetZonaById")
    @ResponseWrapper(localName = "getZonaByIdResponse", targetNamespace = "http://tarea6/", className = "tarea6.GetZonaByIdResponse")
    @Action(input = "http://tarea6/webServiceT6/getZonaByIdRequest", output = "http://tarea6/webServiceT6/getZonaByIdResponse")
    public Zona getZonaById(
        @WebParam(name = "idZona", targetNamespace = "")
        long idZona);

    /**
     * 
     * @return
     *     returns java.util.List<tarea6.Zona>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getZonas", targetNamespace = "http://tarea6/", className = "tarea6.GetZonas")
    @ResponseWrapper(localName = "getZonasResponse", targetNamespace = "http://tarea6/", className = "tarea6.GetZonasResponse")
    @Action(input = "http://tarea6/webServiceT6/getZonasRequest", output = "http://tarea6/webServiceT6/getZonasResponse")
    public List<Zona> getZonas();

    /**
     * 
     * @param codigoDivisa
     * @return
     *     returns java.util.List<tarea6.Pais>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPaisesMoneda", targetNamespace = "http://tarea6/", className = "tarea6.GetPaisesMoneda")
    @ResponseWrapper(localName = "getPaisesMonedaResponse", targetNamespace = "http://tarea6/", className = "tarea6.GetPaisesMonedaResponse")
    @Action(input = "http://tarea6/webServiceT6/getPaisesMonedaRequest", output = "http://tarea6/webServiceT6/getPaisesMonedaResponse")
    public List<Pais> getPaisesMoneda(
        @WebParam(name = "codigoDivisa", targetNamespace = "")
        String codigoDivisa);

    /**
     * 
     * @param idZona
     * @return
     *     returns java.util.List<tarea6.Pais>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPaisesZona", targetNamespace = "http://tarea6/", className = "tarea6.GetPaisesZona")
    @ResponseWrapper(localName = "getPaisesZonaResponse", targetNamespace = "http://tarea6/", className = "tarea6.GetPaisesZonaResponse")
    @Action(input = "http://tarea6/webServiceT6/getPaisesZonaRequest", output = "http://tarea6/webServiceT6/getPaisesZonaResponse")
    public List<Pais> getPaisesZona(
        @WebParam(name = "idZona", targetNamespace = "")
        long idZona);

    /**
     * 
     * @return
     *     returns java.util.List<tarea6.Pais>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPaises", targetNamespace = "http://tarea6/", className = "tarea6.GetPaises")
    @ResponseWrapper(localName = "getPaisesResponse", targetNamespace = "http://tarea6/", className = "tarea6.GetPaisesResponse")
    @Action(input = "http://tarea6/webServiceT6/getPaisesRequest", output = "http://tarea6/webServiceT6/getPaisesResponse")
    public List<Pais> getPaises();

    /**
     * 
     * @param codigo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMonedaByCodigo", targetNamespace = "http://tarea6/", className = "tarea6.GetMonedaByCodigo")
    @ResponseWrapper(localName = "getMonedaByCodigoResponse", targetNamespace = "http://tarea6/", className = "tarea6.GetMonedaByCodigoResponse")
    @Action(input = "http://tarea6/webServiceT6/getMonedaByCodigoRequest", output = "http://tarea6/webServiceT6/getMonedaByCodigoResponse")
    public String getMonedaByCodigo(
        @WebParam(name = "codigo", targetNamespace = "")
        int codigo);

}
