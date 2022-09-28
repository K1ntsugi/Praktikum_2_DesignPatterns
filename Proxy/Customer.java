package Proxy;

public class Customer {
    private int id = 0;
    DownloadProductProxy proxy;

    public Customer(){
        id++;
        proxy = new DownloadProductProxy();
    }

    public static void main(String[] args) {
        Customer c1 = new Customer();
        for(int i = 0; i < 4; i++){
            c1.requestDownload();
        }
    }

    public void requestDownload(){
        proxy.downloadProduct();
    }
}
