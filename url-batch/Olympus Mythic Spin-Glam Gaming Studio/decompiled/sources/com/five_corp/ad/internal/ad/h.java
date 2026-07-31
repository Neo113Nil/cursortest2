package com.five_corp.ad.internal.ad;

import java.util.Objects;

/* loaded from: classes12.dex */
public final class h {
    public final String a;
    public final String b;
    public final boolean c;

    public h(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a.equals(hVar.a) && Objects.equals(this.b, hVar.b);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 31) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
