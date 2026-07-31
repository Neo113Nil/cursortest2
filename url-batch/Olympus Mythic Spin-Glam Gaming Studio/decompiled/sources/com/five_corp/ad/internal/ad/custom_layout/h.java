package com.five_corp.ad.internal.ad.custom_layout;

/* loaded from: classes14.dex */
public final class h {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final Integer g;

    public h(String str, String str2, String str3, int i, Boolean bool, Boolean bool2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (i != 0) {
            this.d = i;
        } else {
            this.d = 1;
        }
        this.e = bool != null ? bool.booleanValue() : true;
        this.f = bool2 != null ? bool2.booleanValue() : false;
        this.g = num;
    }
}
