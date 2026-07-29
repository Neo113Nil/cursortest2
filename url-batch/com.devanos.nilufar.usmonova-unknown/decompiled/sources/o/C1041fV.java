package o;

import java.util.Locale;

/* renamed from: o.fV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041fV {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final C1107gV g;
    public final Integer h;
    public final String i;
    public final C1334k j;
    public final String[] k;
    public final C1041fV[] l;
    public final Locale[] m;

    public C1041fV(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, C1107gV c1107gV, Integer num, String str, C1334k c1334k, String[] strArr, C1041fV[] c1041fVArr, Locale[] localeArr) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
        this.g = c1107gV;
        this.h = num;
        this.i = str;
        this.j = c1334k;
        this.k = strArr;
        this.l = c1041fVArr;
        this.m = localeArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 o.fV, still in use, count: 2, list:
          (r8v1 o.fV) from 0x021e: PHI (r8v2 o.fV) = (r8v1 o.fV), (r8v4 o.fV) binds: [B:68:0x0211, B:75:0x04fc] A[DONT_GENERATE, DONT_INLINE]
          (r8v1 o.fV) from 0x01e8: MOVE (r30v5 o.fV) = (r8v1 o.fV) (LINE:489)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static o.C1041fV a(org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 1740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1041fV.a(org.json.JSONObject):o.fV");
    }
}
