package com.techno_world.pencil.sketch.camera;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class ExifUtil {
    public static Bitmap rotateBitmap(String str, Bitmap bitmap) {
        try {
            int exifOrientation = getExifOrientation(str);
            if (exifOrientation == 1) {
                return bitmap;
            }
            Matrix matrix = new Matrix();
            switch (exifOrientation) {
                case 2:
                    matrix.setScale(-1.0f, 1.0f);
                    break;
                case 3:
                    matrix.setRotate(180.0f);
                    break;
                case 4:
                    matrix.setRotate(180.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 5:
                    matrix.setRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 6:
                    matrix.setRotate(90.0f);
                    break;
                case 7:
                    matrix.setRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 8:
                    matrix.setRotate(-90.0f);
                    break;
                default:
                    return bitmap;
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                bitmap.recycle();
                return createBitmap;
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                return bitmap;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return bitmap;
        }
    }

    private static int getExifOrientation(String str) throws IOException {
        try {
            if (Build.VERSION.SDK_INT < 5) {
                return 1;
            }
            Class<?> cls = Class.forName("android.media.ExifInterface");
            return ((Integer) cls.getMethod("getAttributeInt", String.class, Integer.TYPE).invoke(cls.getConstructor(String.class).newInstance(str), (String) cls.getField("TAG_ORIENTATION").get(null), 1)).intValue();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return 1;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return 1;
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
            return 1;
        } catch (InstantiationException e4) {
            e4.printStackTrace();
            return 1;
        } catch (NoSuchFieldException e5) {
            e5.printStackTrace();
            return 1;
        } catch (NoSuchMethodException e6) {
            e6.printStackTrace();
            return 1;
        } catch (SecurityException e7) {
            e7.printStackTrace();
            return 1;
        } catch (InvocationTargetException e8) {
            e8.printStackTrace();
            return 1;
        }
    }
}
