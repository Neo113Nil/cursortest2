package com.my.target;

import android.graphics.Color;
import com.my.target.common.models.ImageData;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class ue {
    private static final Integer f = Integer.valueOf(Color.parseColor("#0000008F"));
    private final String a;
    private final double b;
    private final boolean c;
    private final Integer d;
    private final ImageData e;

    private ue(String str, double d, boolean z, Integer num, ImageData imageData) {
        this.a = str;
        this.b = d;
        this.c = z;
        this.d = num;
        this.e = imageData;
    }

    public static ue a(String str, double d, boolean z, Integer num, ImageData imageData) {
        return new ue(str, d, z, num, imageData);
    }

    public double b() {
        return this.b;
    }

    public Integer c() {
        return this.d;
    }

    public boolean d() {
        return this.c;
    }

    public String e() {
        return this.a;
    }

    public static ue a(String str, ImageData imageData) {
        return new ue(str, 3.0d, false, f, imageData);
    }

    public ImageData a() {
        return this.e;
    }
}
