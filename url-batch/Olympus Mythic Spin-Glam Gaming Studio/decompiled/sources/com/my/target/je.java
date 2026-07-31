package com.my.target;

import com.ironsource.X3;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class je extends rh {
    private final String f;

    private je(String str, String str2) {
        super(X3.i.n, str, false);
        this.f = str2;
    }

    public static je a(String str, String str2) {
        return new je(str, str2);
    }

    public String g() {
        return this.f;
    }
}
