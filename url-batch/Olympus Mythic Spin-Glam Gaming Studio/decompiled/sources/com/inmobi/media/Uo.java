package com.inmobi.media;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Lazy;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Uo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public Uo(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("left", N3.a(this.a));
            jSONObject.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, N3.a(this.b));
            jSONObject.put("right", N3.a(this.c));
            jSONObject.put("bottom", N3.a(this.d));
            return jSONObject;
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e));
            return new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uo)) {
            return false;
        }
        Uo uo = (Uo) obj;
        return this.a == uo.a && this.b == uo.b && this.c == uo.c && this.d == uo.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Ai.a(this.c, Ai.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ")";
    }
}
