package com.smaato.sdk.ng.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class WatermarkDecoder {
    private static final byte[] a = {-119, 80, 78, 71, 13, 10, 26, 10};

    private WatermarkDecoder() {
    }

    public static Drawable decodeWatermark(Context context, String str) {
        Bitmap decodeByteArray;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            int length = decode.length;
            byte[] bArr = a;
            if (length >= bArr.length && Arrays.equals(Arrays.copyOf(decode, bArr.length), bArr) && (decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length)) != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), decodeByteArray);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                bitmapDrawable.setTileModeXY(tileMode, tileMode);
                return bitmapDrawable;
            }
        } catch (Exception e) {
            Logger.d("WatermarkDecoder", "Exception in watermark decoding: " + e.getMessage());
        }
        return null;
    }
}
