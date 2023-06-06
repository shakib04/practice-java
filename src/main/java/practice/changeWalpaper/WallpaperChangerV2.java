package practice.changeWalpaper;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.win32.W32APIOptions;

public class WallpaperChangerV2 {
    public interface User32 extends Library {
        User32 INSTANCE = Native.load("user32", User32.class, W32APIOptions.DEFAULT_OPTIONS);

        boolean SystemParametersInfo(int uiAction, int uiParam, String pvParam, int fWinIni);
    }

    public static void main(String[] args) {
        // Provide the path to the new wallpaper image
        String wallpaperPath = "C:\\path\\to\\wallpaper.jpg";
        wallpaperPath = "D:\\test_wallpaper.jpg";

        // Call the SystemParametersInfo function to change the wallpaper
        boolean result = User32.INSTANCE.SystemParametersInfo(0x0014, 0, wallpaperPath, 1);
        if (result) {
            System.out.println("Wallpaper changed successfully!");
        } else {
            System.out.println("Failed to change the wallpaper.");
        }
    }
}

