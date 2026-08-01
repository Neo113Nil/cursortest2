package t;

import java.util.ArrayList;

/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310l {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0313o f3792a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3793b;

    public static long a(C0304f c0304f, long j2) {
        AbstractC0313o abstractC0313o = c0304f.d;
        if (abstractC0313o instanceof C0308j) {
            return j2;
        }
        ArrayList arrayList = c0304f.f3787k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0302d interfaceC0302d = (InterfaceC0302d) arrayList.get(i);
            if (interfaceC0302d instanceof C0304f) {
                C0304f c0304f2 = (C0304f) interfaceC0302d;
                if (c0304f2.d != abstractC0313o) {
                    j3 = Math.min(j3, a(c0304f2, c0304f2.f3784f + j2));
                }
            }
        }
        if (c0304f != abstractC0313o.i) {
            return j3;
        }
        long j4 = abstractC0313o.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(abstractC0313o.h, j5)), j5 - r9.f3784f);
    }

    public static long b(C0304f c0304f, long j2) {
        AbstractC0313o abstractC0313o = c0304f.d;
        if (abstractC0313o instanceof C0308j) {
            return j2;
        }
        ArrayList arrayList = c0304f.f3787k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0302d interfaceC0302d = (InterfaceC0302d) arrayList.get(i);
            if (interfaceC0302d instanceof C0304f) {
                C0304f c0304f2 = (C0304f) interfaceC0302d;
                if (c0304f2.d != abstractC0313o) {
                    j3 = Math.max(j3, b(c0304f2, c0304f2.f3784f + j2));
                }
            }
        }
        if (c0304f != abstractC0313o.h) {
            return j3;
        }
        long j4 = abstractC0313o.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(abstractC0313o.i, j5)), j5 - r9.f3784f);
    }
}
