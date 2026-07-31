package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class q5 {
    public final qh a;

    public q5() {
        qh timeUtils = new qh();
        Intrinsics.checkNotNullParameter(timeUtils, "timeUtils");
        this.a = timeUtils;
    }

    public static u2 a(q5 q5Var, b bVar, v2 v2Var, int i) {
        JSONArray jSONArray;
        v2 v2Var2 = null;
        if ((i & 1) != 0) {
            bVar = null;
        }
        if ((i & 2) != 0) {
            v2Var = null;
        }
        String str = bVar != null ? bVar.g : null;
        String str2 = bVar != null ? bVar.h : null;
        String str3 = bVar != null ? bVar.B : null;
        if (str3 == null || StringsKt.isBlank(str3)) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray(bVar != null ? bVar.B : null);
        }
        x xVar = bVar != null ? bVar.x : null;
        if ((xVar == null ? -1 : p5.a[xVar.ordinal()]) == 1) {
            if (v2Var == null) {
                z0 z0Var = bVar.y;
                v2Var2 = new v2(z0Var.c, z0Var.b);
            } else {
                v2Var2 = v2Var;
            }
        }
        return new u2(str, str2, jSONArray, v2Var2);
    }
}
