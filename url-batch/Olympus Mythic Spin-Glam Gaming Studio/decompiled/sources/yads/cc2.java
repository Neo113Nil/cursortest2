package yads;

import java.io.IOException;

/* loaded from: classes4.dex */
public class cc2 extends IOException {
    public final boolean b;
    public final int c;

    public cc2(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.b = z;
        this.c = i;
    }

    public static cc2 a(String str) {
        return new cc2(str, null, false, 1);
    }
}
