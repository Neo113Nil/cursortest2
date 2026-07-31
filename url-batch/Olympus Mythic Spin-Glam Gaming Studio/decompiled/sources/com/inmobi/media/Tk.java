package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Tk {
    public final String a;
    public final Map b;

    public Tk(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tk)) {
            return false;
        }
        Tk tk = (Tk) obj;
        return Intrinsics.areEqual(this.a, tk.a) && Intrinsics.areEqual(this.b, tk.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "TokenMetaData(keywords=" + this.a + ", extras=" + this.b + ")";
    }
}
