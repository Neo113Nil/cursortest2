package o;

import java.util.Locale;

/* renamed from: o.Fz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158Fz {
    public int a;
    public int b;
    public boolean c;
    public final C0950e6 d;

    public C0158Fz(C1183hf c1183hf) {
        C0950e6 c0950e6 = new C0950e6(c1183hf, "flutter/lifecycle", RT.i, 4);
        this.a = 0;
        this.b = 0;
        this.c = true;
        this.d = c0950e6;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, boolean z) {
        int i2;
        String str;
        int i3 = this.a;
        if (i3 == i && z == this.c) {
            return;
        }
        if (i == 0 && i3 == 0) {
            this.c = z;
            return;
        }
        int v = AbstractC1888sN.v(i);
        if (v != 0) {
            if (v == 1) {
                i2 = z ? 2 : 3;
            } else if (v != 2 && v != 3 && v != 4) {
                i2 = 0;
            }
            this.a = i;
            this.c = z;
            if (i2 != this.b) {
                return;
            }
            StringBuilder sb = new StringBuilder("AppLifecycleState.");
            if (i2 == 1) {
                str = "DETACHED";
            } else if (i2 == 2) {
                str = "RESUMED";
            } else if (i2 == 3) {
                str = "INACTIVE";
            } else if (i2 == 4) {
                str = "HIDDEN";
            } else {
                if (i2 != 5) {
                    throw null;
                }
                str = "PAUSED";
            }
            sb.append(str.toLowerCase(Locale.ROOT));
            this.d.M(sb.toString(), null);
            this.b = i2;
            return;
        }
        i2 = i;
        this.a = i;
        this.c = z;
        if (i2 != this.b) {
        }
    }
}
