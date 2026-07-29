package o;

import java.util.Arrays;

/* renamed from: o.mv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1527mv extends AbstractC1478m8 {
    public static final C1527mv g;
    public static final C1527mv h;
    public final boolean f;

    static {
        C1527mv c1527mv = new C1527mv(new int[]{1, 8, 0}, false);
        g = c1527mv;
        int i = c1527mv.c;
        int i2 = c1527mv.b;
        h = (i2 == 1 && i == 9) ? new C1527mv(new int[]{2, 0, 0}, false) : new C1527mv(new int[]{i2, i + 1, 0}, false);
        new C1527mv(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527mv(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        AbstractC0048Bt.n(iArr, "versionArray");
        this.f = z;
    }

    public final boolean b(C1527mv c1527mv) {
        AbstractC0048Bt.n(c1527mv, "metadataVersionFromLanguageVersion");
        C1527mv c1527mv2 = g;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 2 && i == 0 && c1527mv2.b == 1 && c1527mv2.c == 8) {
            return true;
        }
        if (!this.f) {
            c1527mv2 = h;
        }
        int i3 = c1527mv2.b;
        int i4 = c1527mv.b;
        if (i3 > i4 || (i3 >= i4 && c1527mv2.c > c1527mv.c)) {
            c1527mv = c1527mv2;
        }
        boolean z = false;
        if ((i2 == 1 && i == 0) || i2 == 0) {
            return false;
        }
        int i5 = c1527mv.b;
        if (i2 > i5 || (i2 >= i5 && i > c1527mv.c)) {
            z = true;
        }
        return !z;
    }
}
