package Proxy;

public class RealDownloadProduct implements DownloadProduct{
    @Override
    public void downloadProduct() {
        System.out.println("RealDownload abgeschlossen");
    }
}
