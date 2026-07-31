package net.pubnative.lite.sdk.vpaid.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import net.pubnative.lite.sdk.HyBid;

/* loaded from: classes15.dex */
public class AndroidBitmapDecoder implements BitmapDecoder {
    private int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i2 > 0 && i > 0 && (i3 > i2 || i4 > i)) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    Bitmap decode(InputStream inputStream, InputStream inputStream2, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream2, null, options);
    }

    @Override // net.pubnative.lite.sdk.vpaid.utils.BitmapDecoder
    public Bitmap decodeFile(File file, int i, int i2) {
        try {
            return decode(new FileInputStream(file), new FileInputStream(file), i, i2);
        } catch (FileNotFoundException e) {
            HyBid.reportException((Exception) e);
            return null;
        }
    }
}
