package com.smaato.sdk.ng.vpaid.helpers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.smaato.sdk.ng.NextGen;

/* loaded from: classes6.dex */
public class BitmapHelper {
    public static Bitmap decodeResource(Context context, Integer num) {
        return BitmapFactory.decodeResource(context.getResources(), num.intValue());
    }

    public static Bitmap toBitmap(Context context, Integer num, Integer num2) {
        if (context == null || num == null) {
            return null;
        }
        try {
            return BitmapFactory.decodeResource(context.getResources(), num.intValue());
        } catch (Exception e) {
            NextGen.reportException(e);
            return BitmapFactory.decodeResource(context.getResources(), num2.intValue());
        }
    }
}
