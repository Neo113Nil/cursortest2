package com.my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.my.target.m4;
import com.my.target.va;
import com.my.target.wh;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class i4 {
    private final Context a;

    private i4(Context context) {
        this.a = context;
    }

    public static i4 a(Context context) {
        return new i4(context);
    }

    public m4 a(va.a aVar, r9 r9Var, m4.a aVar2) {
        return new n4(this.a, aVar, r9Var, aVar2);
    }

    public Handler a() {
        return new Handler(Looper.getMainLooper());
    }

    public oe a(eb ebVar, fe feVar, wh.c cVar) {
        return oe.a(ebVar, feVar, cVar, this.a);
    }
}
