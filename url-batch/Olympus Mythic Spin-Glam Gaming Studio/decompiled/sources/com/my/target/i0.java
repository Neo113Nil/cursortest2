package com.my.target;

import com.my.target.internal.api.internalnativead.models.AppInfo;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class i0 implements AppInfo {
    private final j7 a;
    private final String b;
    private final String c;

    private i0(j7 j7Var, String str, String str2) {
        this.a = j7Var;
        this.b = str;
        this.c = str2;
    }

    public static i0 a(j7 j7Var) {
        String g = j7Var.g();
        String I = j7Var.I();
        if (g == null || I == null) {
            return null;
        }
        return new i0(j7Var, g, I);
    }

    public String getBundleId() {
        return this.b;
    }

    public String getCategory() {
        return this.a.h();
    }

    public Float getRating() {
        return this.a.f0();
    }

    public String getStoreType() {
        return this.c;
    }

    public Integer getVotes() {
        return this.a.g0();
    }
}
