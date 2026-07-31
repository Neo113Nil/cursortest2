package com.smaato.sdk.ng.vpaid.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.VisibleForTesting;
import com.smaato.sdk.ng.NextGen;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes12.dex */
public class AndroidBitmapDecoder implements BitmapDecoder {
    @VisibleForTesting
    Bitmap a(InputStream inputStream, InputStream inputStream2, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        options.inSampleSize = a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream2, null, options);
    }

    @Override // com.smaato.sdk.ng.vpaid.utils.BitmapDecoder
    public Bitmap decodeFile(File file, int i, int i2) {
        try {
            return a(new FileInputStream(file), new FileInputStream(file), i, i2);
        } catch (FileNotFoundException e) {
            NextGen.reportException((Exception) e);
            return null;
        }
    }

    private int a(BitmapFactory.Options options, int i, int i2) {
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
}
