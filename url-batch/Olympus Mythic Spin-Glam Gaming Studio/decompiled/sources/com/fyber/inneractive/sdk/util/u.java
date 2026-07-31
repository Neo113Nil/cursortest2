package com.fyber.inneractive.sdk.util;

import android.graphics.BitmapFactory;
import android.net.Uri;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.InputStream;

/* loaded from: classes6.dex */
public abstract class u {
    public static Float a(Uri uri) {
        InputStream openInputStream;
        int i;
        try {
            openInputStream = IAConfigManager.N.u.a.getApplicationContext().getContentResolver().openInputStream(uri);
        } catch (Exception e) {
            IAlog.b("%sFailed to retrieve image aspect ratio. Reason: %s", IAlog.a(u.class), e.getMessage());
        }
        if (openInputStream == null) {
            if (openInputStream != null) {
                openInputStream.close();
            }
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, null, options);
            int i2 = options.outHeight;
            if (i2 <= 0 || (i = options.outWidth) <= 0) {
                openInputStream.close();
                return null;
            }
            Float valueOf = Float.valueOf(i / i2);
            openInputStream.close();
            return valueOf;
        } finally {
        }
    }

    public static String b(Uri uri) {
        try {
            InputStream openInputStream = IAConfigManager.N.u.a.getApplicationContext().getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                if (openInputStream != null) {
                    openInputStream.close();
                }
                return null;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(openInputStream, null, options);
                String str = options.outMimeType;
                openInputStream.close();
                return str;
            } finally {
            }
        } catch (Exception e) {
            IAlog.b("%sFailed to retrieve image mime type. Reason: %s", IAlog.a(u.class), e.getMessage());
            return null;
        }
    }
}
