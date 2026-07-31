package net.pubnative.lite.sdk.vpaid.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.io.File;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes4.dex */
public class ImageUtils {
    private static final String TAG = "ImageUtils";

    static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        return calculateInSampleSize(options.outWidth, options.outHeight, i, i2);
    }

    static Bitmap decodeSampledBitmap(String str, int i, int i2) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = calculateInSampleSize(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError | RuntimeException e) {
            HyBid.reportException(e);
            return new AndroidBitmapDecoder().decodeFile(new File(str), i, i2);
        }
    }

    public static void setScaledImage(ImageView imageView, String str) {
        setScaledImage(imageView, str, new AndroidBitmapDecoder());
    }

    public static void setScaledImage(final ImageView imageView, final String str, final BitmapDecoder bitmapDecoder) {
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: net.pubnative.lite.sdk.vpaid.utils.ImageUtils.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    imageView.getViewTreeObserver().removeOnPreDrawListener(this);
                    int measuredHeight = imageView.getMeasuredHeight();
                    Bitmap decodeFile = bitmapDecoder.decodeFile(new File(str), imageView.getMeasuredWidth(), measuredHeight);
                    if (decodeFile == null) {
                        return true;
                    }
                    imageView.setImageBitmap(decodeFile);
                    return true;
                }
            });
        }
    }

    static int calculateInSampleSize(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 <= i4 && i <= i3) {
            return 1;
        }
        int i6 = i2 / 2;
        int i7 = i / 2;
        while (i6 / i5 > i4 && i7 / i5 > i3) {
            i5 *= 2;
        }
        return i5;
    }

    static Bitmap decodeSampledBitmap(Bitmap bitmap, int i, int i2) {
        try {
            int calculateInSampleSize = calculateInSampleSize(bitmap.getWidth(), bitmap.getHeight(), i, i2);
            return Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / calculateInSampleSize, bitmap.getHeight() / calculateInSampleSize, false);
        } catch (RuntimeException e) {
            HyBid.reportException((Exception) e);
            Logger.e(TAG, e.getMessage());
            return null;
        }
    }
}
