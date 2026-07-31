package com.my.target;

import android.content.Context;
import com.my.target.r4;
import com.my.target.z;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class id extends z.a {
    private id() {
    }

    public static id b() {
        return new id();
    }

    @Override // com.my.target.z.a
    public int a(n nVar, Context context) {
        return ve.a(context).c();
    }

    @Override // com.my.target.z.a
    protected Map a(n nVar, tb tbVar, Context context) {
        Map a = super.a(nVar, tbVar, context);
        r4.b a2 = r4.e.a(nVar.h().i);
        String str = a2.a;
        if (!str.isEmpty()) {
            a.put("exb", str);
            mi.a("NativeAdServiceBuilder: Exclude list - " + str);
        }
        String str2 = a2.b;
        if (!str2.isEmpty()) {
            a.put("excrid", str2);
        }
        return a;
    }
}
