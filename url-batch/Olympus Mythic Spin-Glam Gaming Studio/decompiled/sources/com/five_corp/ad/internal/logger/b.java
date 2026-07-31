package com.five_corp.ad.internal.logger;

import android.util.Log;
import com.five_corp.ad.internal.context.g;

/* loaded from: classes4.dex */
public final class b {
    public final int a;
    public final String b;
    public final String c;
    public final com.five_corp.ad.internal.beacon.b d;
    public final String e;

    public b(int i, g gVar, com.five_corp.ad.internal.beacon.b bVar, String str) {
        this.a = i;
        this.b = gVar != null ? gVar.b : null;
        this.c = gVar != null ? gVar.a : null;
        this.d = bVar;
        this.e = str;
    }

    public static b a(Throwable th) {
        return new b(6, null, null, Log.getStackTraceString(th));
    }

    public static b a(String str) {
        return new b(4, null, null, str);
    }
}
