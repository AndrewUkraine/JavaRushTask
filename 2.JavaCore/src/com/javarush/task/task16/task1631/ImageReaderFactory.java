package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;
import com.sun.imageio.plugins.jpeg.JPEG;

/**
 * Created by AndrewUkraine on 06.08.2017.
 */
public class ImageReaderFactory  {

    public static ImageReader getImageReader(ImageTypes type) {
         if (type == ImageTypes.BMP) {
                      return new BmpReader();
                } else if (type == ImageTypes.JPG) {
                        return new JpgReader();
                  } else if (type == ImageTypes.PNG) {
                      return new PngReader();
                  } else {
                       throw new IllegalArgumentException("Неизвестный тип картинки");
                   }
          }
}