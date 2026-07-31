package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5610q4 {
    public final String a;
    public final Integer b;
    public final String c;

    public C5610q4(String str, Integer num, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5610q4.class != obj.getClass()) {
            return false;
        }
        C5610q4 c5610q4 = (C5610q4) obj;
        if (!this.a.equals(c5610q4.a)) {
            return false;
        }
        Integer num = this.b;
        if (num == null ? c5610q4.b != null : !num.equals(c5610q4.b)) {
            return false;
        }
        String str = this.c;
        String str2 = c5610q4.c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
