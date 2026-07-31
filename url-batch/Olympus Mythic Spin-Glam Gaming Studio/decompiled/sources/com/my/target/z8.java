package com.my.target;

import com.my.target.common.models.ImageData;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class z8 extends y8 {
    private int b;
    private ImageData c;
    private String d = "";
    private String e;

    private z8() {
    }

    public static z8 f() {
        return new z8();
    }

    public void a(int i) {
        this.b = i;
    }

    public int b() {
        return this.b;
    }

    public String c() {
        return this.e;
    }

    public ImageData d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public void a(ImageData imageData) {
        this.c = imageData;
    }

    public void b(String str) {
        this.d = str;
    }

    public void a(String str) {
        this.e = str;
    }
}
