package o;

/* renamed from: o.Pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0395Pd {
    public static final C2340zD a;

    static {
        C2285yO c2285yO = C1640oc.c;
        int i = c2285yO.c;
        C0317Md c0317Md = new C0317Md(c2285yO, c2285yO, 1);
        int i2 = c2285yO.c;
        PF pf = C1640oc.e;
        int i3 = (pf.c << 6) | i2;
        C0369Od c0369Od = new C0369Od(c2285yO, pf, 0);
        int i4 = (i2 << 6) | pf.c;
        C0369Od c0369Od2 = new C0369Od(pf, c2285yO, 0);
        C2340zD c2340zD = AbstractC0999et.a;
        C2340zD c2340zD2 = new C2340zD();
        c2340zD2.h(i | (i << 6), c0317Md);
        c2340zD2.h(i3, c0369Od);
        c2340zD2.h(i4, c0369Od2);
        a = c2340zD2;
    }
}
