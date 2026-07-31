package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.inmobi.media.qj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4292qj {
    public static SharedPreferences a() {
        Context context = AbstractC4002fj.a;
        String str = (context != null ? context.getPackageName() : null) + "_preferences";
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }
}
