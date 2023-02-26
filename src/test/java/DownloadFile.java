import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class DownloadFile {
    public URL website;
    ReadableByteChannel rbc;
    FileOutputStream outputStream;
    public void downloadFileFromURL(String urlString) throws IOException {
            website= new URL(urlString);
            rbc = Channels.newChannel(website.openStream());
            outputStream = new FileOutputStream("info.html");
            outputStream.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            outputStream.close();
            rbc.close();
    }
    public static void main(String[] args) throws Throwable {
        DownloadFile df=new DownloadFile();
        df.downloadFileFromURL("https://github.com/MishraDurgesh1/UIAutomation.git" );
    }
}
