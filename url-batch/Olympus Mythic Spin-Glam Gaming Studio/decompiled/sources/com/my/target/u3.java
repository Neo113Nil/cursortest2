package com.my.target;

import android.os.Build;
import com.my.target.common.MyTargetVersion;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class u3 {
    public final String a = "Android";
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public u3() {
        String str = Build.VERSION.RELEASE;
        this.b = str;
        this.c = a(str);
        this.d = Build.DEVICE;
        this.e = Build.MODEL;
        this.f = Build.MANUFACTURER;
        this.g = MyTargetVersion.VERSION;
        this.h = 5047001;
        this.l = "default-empty";
        this.i = "default-empty";
        this.j = "default-empty";
        this.k = "default-empty";
    }

    private int a(String str) {
        int i;
        int i2;
        int i3 = 0;
        try {
            String[] split = str.split("\\.");
            if (split.length == 0) {
                return 0;
            }
            int length = split.length;
            if (length != 1) {
                if (length == 2) {
                    i = 0;
                } else {
                    if (length != 3) {
                        i = 0;
                        i2 = 0;
                        return (i3 * 1000000) + (i2 * 1000) + i;
                    }
                    i = Integer.parseInt(split[2]);
                }
                i2 = Integer.parseInt(split[1]);
            } else {
                i = 0;
                i2 = 0;
            }
            i3 = Integer.parseInt(split[0]);
            return (i3 * 1000000) + (i2 * 1000) + i;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public u3(String str, String str2, String str3, String str4) {
        String str5 = Build.VERSION.RELEASE;
        this.b = str5;
        this.c = a(str5);
        this.d = Build.DEVICE;
        this.e = Build.MODEL;
        this.f = Build.MANUFACTURER;
        this.g = MyTargetVersion.VERSION;
        this.h = 5047001;
        this.l = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
    }
}
