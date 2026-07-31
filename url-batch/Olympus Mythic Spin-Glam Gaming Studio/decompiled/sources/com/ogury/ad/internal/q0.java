package com.ogury.ad.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import com.adjust.sdk.Constants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class q0 {
    public final Context a;
    public final qh b;
    public final DisplayMetrics c;
    public final String d;
    public final String e;

    public q0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        qh timeUtils = new qh();
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeUtils, "timeUtils");
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        this.a = context;
        this.b = timeUtils;
        this.c = displayMetrics;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        this.d = MANUFACTURER;
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        this.e = MODEL;
    }

    public static String a(NetworkInfo networkInfo) {
        Intrinsics.checkNotNullParameter(networkInfo, "<this>");
        if (networkInfo.isConnected() && networkInfo.getType() == 1) {
            String typeName = networkInfo.getTypeName();
            Intrinsics.checkNotNull(typeName);
            return typeName;
        }
        return networkInfo.getTypeName() + " - " + networkInfo.getSubtypeName();
    }

    public final String b() {
        switch (this.a.getResources().getConfiguration().uiMode & 15) {
            case 1:
                return Constants.NORMAL;
            case 2:
                return "desk";
            case 3:
                return "car";
            case 4:
                return "television";
            case 5:
                return "appliance";
            case 6:
                return "watch";
            case 7:
                return "vrheadset";
            default:
                return "undefined";
        }
    }

    public final String a() {
        int i = this.a.getResources().getConfiguration().screenLayout & 15;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : Constants.XLARGE : Constants.LARGE : Constants.NORMAL : Constants.SMALL;
    }

    public final Rect a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        DisplayMetrics displayMetrics = this.c;
        Rect rect = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        try {
            view.getWindowVisibleDisplayFrame(rect);
        } catch (Exception unused) {
        }
        return rect;
    }
}
