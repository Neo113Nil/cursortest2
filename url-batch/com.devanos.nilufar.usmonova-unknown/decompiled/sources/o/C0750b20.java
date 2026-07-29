package o;

import java.util.ArrayList;

/* renamed from: o.b20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0750b20 {
    public final CH a;
    public final boolean b;
    public final long c;
    public final long d;
    public final int e;
    public final Long f;
    public final long g;
    public final ArrayList h;

    public /* synthetic */ C0750b20(CH ch) {
        this(ch, true, "", -1L, -1L, -1, null, -1L);
    }

    public C0750b20(CH ch, boolean z, String str, long j, long j2, int i, Long l, long j3) {
        AbstractC0048Bt.n(str, "comment");
        this.a = ch;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = l;
        this.g = j3;
        this.h = new ArrayList();
    }
}
