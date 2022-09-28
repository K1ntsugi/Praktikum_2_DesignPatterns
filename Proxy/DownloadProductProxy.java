package Proxy;

public class DownloadProductProxy implements DownloadProduct{
    int count = 3;
    RealDownloadProduct product;

    DownloadProductProxy(){
        product = new RealDownloadProduct();
    }

    @Override
    public void downloadProduct() {
        if(count == 0){
            System.out.println("Downloadlimit erreicht");
            return;
        }

        count--;
        product.downloadProduct();
        System.out.println("Es verbleiben " + this.count + " Kopien zum Download verfügbar");



    }
}
