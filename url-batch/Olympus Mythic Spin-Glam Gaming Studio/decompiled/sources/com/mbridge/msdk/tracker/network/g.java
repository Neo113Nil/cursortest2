package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.ironsource.X3;

/* compiled from: Header.java */
/* loaded from: classes11.dex */
public final class g {
    private final String a;
    private final String b;

    public g(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return TextUtils.equals(this.a, gVar.a) && TextUtils.equals(this.b, gVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + X3.j.e;
    }
}
