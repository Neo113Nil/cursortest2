package com.five_corp.ad.internal.layouter;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.util.Log;
import com.ironsource.X3;

/* loaded from: classes3.dex */
public abstract class k {
    public static BitmapDrawable a(String str, Resources resources, com.five_corp.ad.internal.hub.ad_instance.e eVar) {
        String str2;
        Bitmap decodeByteArray;
        if (str == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            str2 = "WatermarkDrawableBuilder.build Base64.decode failed, input: [" + str + "], exception: " + Log.getStackTraceString(e);
        }
        if (decodeByteArray != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, decodeByteArray);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        }
        str2 = "WatermarkDrawableBuilder.build BitmapFactory.decodeByteArray failed, input: [" + str + X3.j.e;
        eVar.a(com.five_corp.ad.internal.logger.b.a(str2));
        return null;
    }
}
