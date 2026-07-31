package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.zb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5850zb {
    public static final V9 a(C5850zb c5850zb, EnumC5304ea enumC5304ea, JSONObject jSONObject) {
        int i;
        c5850zb.getClass();
        V9 v9 = new V9();
        switch (enumC5304ea.ordinal()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        v9.a = i;
        v9.b = jSONObject.toString().getBytes(Charsets.UTF_8);
        return v9;
    }
}
