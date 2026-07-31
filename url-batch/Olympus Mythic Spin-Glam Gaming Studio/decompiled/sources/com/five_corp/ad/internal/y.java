package com.five_corp.ad.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* loaded from: classes3.dex */
public final class y {
    public final Context a;
    public final String b;

    public y(Context context) {
        this.a = context;
        this.b = com.five_corp.ad.internal.tracking_data.c.a(context);
    }

    public final int a(int i) {
        return (int) TypedValue.applyDimension(1, i, this.a.getResources().getDisplayMetrics());
    }

    public final Rect b() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        if (Build.VERSION.SDK_INT > 30) {
            currentWindowMetrics = ((WindowManager) this.a.getSystemService("window")).getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return bounds;
        }
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Rect(0, 0, point.x, point.y);
    }

    public final com.five_corp.ad.internal.util.b a() {
        long longVersionCode;
        try {
            PackageInfo a = com.five_corp.ad.internal.system.i.a(this.a, "com.google.android.gms");
            if (Build.VERSION.SDK_INT < 28) {
                return new com.five_corp.ad.internal.util.b(true, null, Integer.valueOf(a.versionCode));
            }
            longVersionCode = a.getLongVersionCode();
            return new com.five_corp.ad.internal.util.b(true, null, Integer.valueOf((int) (longVersionCode & 4294967295L)));
        } catch (Exception e) {
            return new com.five_corp.ad.internal.util.b(false, new l(m.G, "Unknown error occurred when fetching Google Play Services version.", e), null);
        }
    }
}
