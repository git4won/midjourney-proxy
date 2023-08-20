package com.github.novicezk.midjourney.util;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImageProcessUtils {

    public static int[] getWidthAndHeightFromPicURL(String imageUrl) {
        int[] dimensions = new int[2];
        try {
            URL url = new URL(imageUrl);
            BufferedImage image = ImageIO.read(url);
            int width = image.getWidth();
            int height = image.getHeight();
            dimensions[0] = width;
            dimensions[1] = height;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dimensions;
    }
}
