import Services.Stamp.SWStampService;
import Utils.Responses.SuccessV1Response;
import Utils.Responses.SuccessV4Response;

/**
 * Created by cristianricardobarustasanchez on 13/12/17.
 */
public class main {
    public static void main(String[] args){

        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<cfdi:Comprobante xsi:schemaLocation=\"http://www.sat.gob.mx/cfd/3 http://www.sat.gob.mx/sitio_internet/cfd/3/cfdv33.xsd\" Version=\"3.3\" Serie=\"RogueOne\" Folio=\"HNFK231\" Fecha=\"2017-12-12T12:47:06\" Sello=\"Qu3cvzH8sZWYzvwqwo3NJ2wCxutlzjfgdNH2RhAKcxVGji0HjLS1GkIy6uHfPRFC/Q1ZWpR5by7bLhdBIez+jaWYnF2dWpWCES/yRRr7Mjx+k4RWycpVkeFr/W9+N7TETvUSrZm7OEUklCm+B+X1R6jiz4608Bx53BuVKzvhA+53LrajsQ6icNVEwfR8HLfMyZ840gwIvLWwyaoupMr+tu74txBiZ8sPfM8VJR7If0d3ndxNQW7Kelbq9lQHNFhDpwnP1gUDyx0SCZ4V6jtVu8dVGmqu/1lYDl46wae3Ha/x8bnSWCeUUALXTPuhcHB8HPDStflbiJNiD0EBxiLGpw==\" FormaPago=\"01\" NoCertificado=\"20001000000300022815\" Certificado=\"MIIFxTCCA62gAwIBAgIUMjAwMDEwMDAwMDAzMDAwMjI4MTUwDQYJKoZIhvcNAQELBQAwggFmMSAwHgYDVQQDDBdBLkMuIDIgZGUgcHJ1ZWJhcyg0MDk2KTEvMC0GA1UECgwmU2VydmljaW8gZGUgQWRtaW5pc3RyYWNpw7NuIFRyaWJ1dGFyaWExODA2BgNVBAsML0FkbWluaXN0cmFjacOzbiBkZSBTZWd1cmlkYWQgZGUgbGEgSW5mb3JtYWNpw7NuMSkwJwYJKoZIhvcNAQkBFhphc2lzbmV0QHBydWViYXMuc2F0LmdvYi5teDEmMCQGA1UECQwdQXYuIEhpZGFsZ28gNzcsIENvbC4gR3VlcnJlcm8xDjAMBgNVBBEMBTA2MzAwMQswCQYDVQQGEwJNWDEZMBcGA1UECAwQRGlzdHJpdG8gRmVkZXJhbDESMBAGA1UEBwwJQ295b2Fjw6FuMRUwEwYDVQQtEwxTQVQ5NzA3MDFOTjMxITAfBgkqhkiG9w0BCQIMElJlc3BvbnNhYmxlOiBBQ0RNQTAeFw0xNjEwMjUyMTUyMTFaFw0yMDEwMjUyMTUyMTFaMIGxMRowGAYDVQQDExFDSU5ERU1FWCBTQSBERSBDVjEaMBgGA1UEKRMRQ0lOREVNRVggU0EgREUgQ1YxGjAYBgNVBAoTEUNJTkRFTUVYIFNBIERFIENWMSUwIwYDVQQtExxMQU43MDA4MTczUjUgLyBGVUFCNzcwMTE3QlhBMR4wHAYDVQQFExUgLyBGVUFCNzcwMTE3TURGUk5OMDkxFDASBgNVBAsUC1BydWViYV9DRkRJMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgvvCiCFDFVaYX7xdVRhp/38ULWto/LKDSZy1yrXKpaqFXqERJWF78YHKf3N5GBoXgzwFPuDX+5kvY5wtYNxx/Owu2shNZqFFh6EKsysQMeP5rz6kE1gFYenaPEUP9zj+h0bL3xR5aqoTsqGF24mKBLoiaK44pXBzGzgsxZishVJVM6XbzNJVonEUNbI25DhgWAd86f2aU3BmOH2K1RZx41dtTT56UsszJls4tPFODr/caWuZEuUvLp1M3nj7Dyu88mhD2f+1fA/g7kzcU/1tcpFXF/rIy93APvkU72jwvkrnprzs+SnG81+/F16ahuGsb2EZ88dKHwqxEkwzhMyTbQIDAQABox0wGzAMBgNVHRMBAf8EAjAAMAsGA1UdDwQEAwIGwDANBgkqhkiG9w0BAQsFAAOCAgEAJ/xkL8I+fpilZP+9aO8n93+20XxVomLJjeSL+Ng2ErL2GgatpLuN5JknFBkZAhxVIgMaTS23zzk1RLtRaYvH83lBH5E+M+kEjFGp14Fne1iV2Pm3vL4jeLmzHgY1Kf5HmeVrrp4PU7WQg16VpyHaJ/eonPNiEBUjcyQ1iFfkzJmnSJvDGtfQK2TiEolDJApYv0OWdm4is9Bsfi9j6lI9/T6MNZ+/LM2L/t72Vau4r7m94JDEzaO3A0wHAtQ97fjBfBiO5M8AEISAV7eZidIl3iaJJHkQbBYiiW2gikreUZKPUX0HmlnIqqQcBJhWKRu6Nqk6aZBTETLLpGrvF9OArV1JSsbdw/ZH+P88RAt5em5/gjwwtFlNHyiKG5w+UFpaZOK3gZP0su0sa6dlPeQ9EL4JlFkGqQCgSQ+NOsXqaOavgoP5VLykLwuGnwIUnuhBTVeDbzpgrg9LuF5dYp/zs+Y9ScJqe5VMAagLSYTShNtN8luV7LvxF9pgWwZdcM7lUwqJmUddCiZqdngg3vzTactMToG16gZA4CWnMgbU4E+r541+FNMpgAZNvs2CiW/eApfaaQojsZEAHDsDv4L5n3M1CC7fYjE/d61aSng1LaO6T1mh+dEfPvLzp7zyzz+UgWMhi5Cs4pcXx1eic5r7uxPoBwcCTt3YI1jKVVnV7/w=\" SubTotal=\"200.00\" Moneda=\"MXN\" TipoCambio=\"1\" Total=\"603.20\" TipoDeComprobante=\"I\" MetodoPago=\"PUE\" LugarExpedicion=\"06300\" \n" +
                "    xmlns:cfdi=\"http://www.sat.gob.mx/cfd/3\" \n" +
                "    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "    <cfdi:Emisor Rfc=\"LAN7008173R5\" Nombre=\"CINDEMEX SA DE CV\" RegimenFiscal=\"601\" />\n" +
                "    <cfdi:Receptor Rfc=\"AAA010101AAA\" Nombre=\"SW SMARTERWEB\" UsoCFDI=\"G03\" />\n" +
                "    <cfdi:Conceptos>\n" +
                "        <cfdi:Concepto ClaveProdServ=\"50211503\" NoIdentificacion=\"UT421511\" Cantidad=\"1\" ClaveUnidad=\"H87\" Unidad=\"Pieza\" Descripcion=\"Cigarros\" ValorUnitario=\"200.00\" Importe=\"200.00\">\n" +
                "            <cfdi:Impuestos>\n" +
                "                <cfdi:Traslados>\n" +
                "                    <cfdi:Traslado Base=\"200.00\" Impuesto=\"002\" TipoFactor=\"Tasa\" TasaOCuota=\"0.160000\" Importe=\"32.00\" />\n" +
                "                    <cfdi:Traslado Base=\"232.00\" Impuesto=\"003\" TipoFactor=\"Tasa\" TasaOCuota=\"1.600000\" Importe=\"371.20\" />\n" +
                "                </cfdi:Traslados>\n" +
                "            </cfdi:Impuestos>\n" +
                "        </cfdi:Concepto>\n" +
                "    </cfdi:Conceptos>\n" +
                "    <cfdi:Impuestos TotalImpuestosTrasladados=\"403.20\">\n" +
                "        <cfdi:Traslados>\n" +
                "            <cfdi:Traslado Impuesto=\"002\" TipoFactor=\"Tasa\" TasaOCuota=\"0.160000\" Importe=\"32.00\" />\n" +
                "            <cfdi:Traslado Impuesto=\"003\" TipoFactor=\"Tasa\" TasaOCuota=\"1.600000\" Importe=\"371.20\" />\n" +
                "        </cfdi:Traslados>\n" +
                "    </cfdi:Impuestos>\n" +
                "</cfdi:Comprobante>";
        Utils utils = new Utils();

        String xml_sellado = utils.signXML(xml);

        try{
            //Es preferible inicializar el objeto con el usuario y password de nuestra cuenta, en caso contrario se puede incluir solamente el token de acceso
            //Se especifica el base path, esto para consumir el api de pruebas o productivo
            SWStampService sdk = new SWStampService("demo","123456789","http://services.test.sw.com.mx");
            //Se inicializa un objeto response, que obtendra la respuesta del api
            SuccessV4Response response = null;
            //Se asigna el resultado de la respuesta a dicho objeto
            //Se ejecuta el metodo "Stamp", que timbrara nuestro comprobante posteriormente sellado, asi como la versión del servicio de timbrado,
            //puede ver mas de estas versiones en el apartado "Versiones de timbrado"
            response = (SuccessV4Response)sdk.Stamp(xml_sellado,"v4");
            //El objeto response tendra así los atributos:
            // Status: estado de la petición procesada, puede ser : "success", "fail", "error"
            // HttpStatusCode: Codigo de respuesta HTTP del servidor: eg. 200, 400, 500
            // tfd: El campo donde se encuentra el token
            if(response.Status.equals("success")){
                System.out.println(response.Status);
                System.out.println(response.HttpStatusCode);
                System.out.println(response.cfdi);
                System.out.println(response.uuid);
                System.out.println(response.fechaTimbrado);
                System.out.println(response.selloCFDI);
            }
            else{
                //En caso de obtener estatus "fail", "error"
                //Se puede identificar el error en los campos message, messageDetail
                System.out.println(response.message);
                System.out.println(response.messageDetail);
                //***Como observacion***
                //El campo messageDetail puede no incluirse en ciertos errores

            }


        }
        catch(Exception e){

            System.out.println(e.getMessage());
        }

    }
}
