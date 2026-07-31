package yads;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class lo {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public lo(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo)) {
            return false;
        }
        lo loVar = (lo) obj;
        return this.c == loVar.c && this.d == loVar.d && x92.a(this.a, loVar.a) && x92.a(this.b, loVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
