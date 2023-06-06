package practice.changeWalpaper;

import java.util.HashMap;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.WinDef.UINT_PTR;
import com.sun.jna.win32.*;

public class WallpaperChanger {
    public static void main(String[] args) {

        String currentWorkingDir = System.getProperty("user.dir");
        System.out.println("Current Working Directory: " + currentWorkingDir);


        //supply your own path instead of using this one
        String path = "D:\\test_wallpaper.jpg";
        //E:\Learning Spring\PracticeJava\src\main\java\practice\changeWalpaper\

        SPI.INSTANCE.SystemParametersInfo(
                new UINT_PTR(SPI.SPI_SETDESKWALLPAPER),
                new UINT_PTR(0),
                path,
                new UINT_PTR(SPI.SPIF_UPDATEINIFILE | SPI.SPIF_SENDWININICHANGE));
    }

    public interface SPI extends StdCallLibrary {

        //from MSDN article
        long SPI_SETDESKWALLPAPER = 20;
        long SPIF_UPDATEINIFILE = 0x01;
        long SPIF_SENDWININICHANGE = 0x02;

        @SuppressWarnings("serial")
        SPI INSTANCE = (SPI) Native.loadLibrary("user32", SPI.class,
                new HashMap<String, Object>() {
                    {
                        put(OPTION_TYPE_MAPPER, W32APITypeMapper.UNICODE);
                        put(OPTION_FUNCTION_MAPPER, W32APIFunctionMapper.UNICODE);
                    }
                });

        boolean SystemParametersInfo(
                UINT_PTR uiAction,
                UINT_PTR uiParam,
                String pvParam,
                UINT_PTR fWinIni
        );
    }
}
