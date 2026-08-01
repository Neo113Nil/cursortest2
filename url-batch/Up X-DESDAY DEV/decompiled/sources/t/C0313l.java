package t;

import java.util.ArrayList;

/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0316o f3766a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3767b;

    public static long a(C0307f c0307f, long j2) {
        AbstractC0316o abstractC0316o = c0307f.d;
        if (abstractC0316o instanceof C0311j) {
            return j2;
        }
        ArrayList arrayList = c0307f.f3761k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0305d interfaceC0305d = (InterfaceC0305d) arrayList.get(i);
            if (interfaceC0305d instanceof C0307f) {
                C0307f c0307f2 = (C0307f) interfaceC0305d;
                if (c0307f2.d != abstractC0316o) {
                    j3 = Math.min(j3, a(c0307f2, c0307f2.f3758f + j2));
                }
            }
        }
        if (c0307f != abstractC0316o.i) {
            return j3;
        }
        long j4 = abstractC0316o.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(abstractC0316o.h, j5)), j5 - r9.f3758f);
    }

    public static long b(C0307f c0307f, long j2) {
        AbstractC0316o abstractC0316o = c0307f.d;
        if (abstractC0316o instanceof C0311j) {
            return j2;
        }
        ArrayList arrayList = c0307f.f3761k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0305d interfaceC0305d = (InterfaceC0305d) arrayList.get(i);
            if (interfaceC0305d instanceof C0307f) {
                C0307f c0307f2 = (C0307f) interfaceC0305d;
                if (c0307f2.d != abstractC0316o) {
                    j3 = Math.max(j3, b(c0307f2, c0307f2.f3758f + j2));
                }
            }
        }
        if (c0307f != abstractC0316o.h) {
            return j3;
        }
        long j4 = abstractC0316o.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(abstractC0316o.i, j5)), j5 - r9.f3758f);
    }
}
