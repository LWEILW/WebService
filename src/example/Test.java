package example;

import mypackage.BokeDeeServiceWS;
import mypackage.BokeDeeServiceWSService;
import mypackage.BokeDeeServiceWSServiceLocator;
import org.apache.axis.AxisFault;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

public class Test {

    public static void main(String[] argv) throws RemoteException, ServiceException, MalformedURLException {
        BokeDeeServiceWSService service = new BokeDeeServiceWSServiceLocator();
        // 路径名称 "http://10.1.20.41:48000/BokeDee/services/deeSpService"
        String address = service.getdeeSpServiceAddress();
        System.out.println(address);

        //直接获取数据
        BokeDeeServiceWS bokeDeeServiceWS = service.getdeeSpService();
//        String data = bokeDeeServiceWS.deeService(null, "UpdateWarehouse");
        String dataHv = bokeDeeServiceWS.deeServiceHv(null, "UpdateWarehouse");
//        System.out.println(data);
//        System.out.println(dataHv);

        // 根据路径获取数据
//        try {
//            URL url = new URL(address);
//            BokeDeeServiceWS data = service.getdeeSpService(url);
//            System.out.println(data);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }


    }
}
