package com.my.target;

import com.my.target.common.models.ImageData;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class l3 {
    private final String a;
    private final String b;
    private final String c;
    private final Integer d;
    private final Integer e;
    private final ImageData f;

    private l3(String str, String str2, String str3, Integer num, Integer num2, ImageData imageData) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = num2;
        this.f = imageData;
    }

    public static l3 a(String str, String str2, String str3, Integer num, Integer num2, ImageData imageData) {
        return new l3(str, str2, str3, num, num2, imageData);
    }

    public Integer b() {
        return this.d;
    }

    public String c() {
        return this.c;
    }

    public Integer d() {
        return this.e;
    }

    public ImageData e() {
        return this.f;
    }

    public String f() {
        return this.b;
    }

    public String a() {
        return this.a;
    }
}
