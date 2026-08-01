package t;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public o f3751a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3752b;

    public static long a(C0335f c0335f, long j2) {
        o oVar = c0335f.d;
        if (oVar instanceof j) {
            return j2;
        }
        ArrayList arrayList = c0335f.f3746k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0333d interfaceC0333d = (InterfaceC0333d) arrayList.get(i);
            if (interfaceC0333d instanceof C0335f) {
                C0335f c0335f2 = (C0335f) interfaceC0333d;
                if (c0335f2.d != oVar) {
                    j3 = Math.min(j3, a(c0335f2, c0335f2.f3743f + j2));
                }
            }
        }
        if (c0335f != oVar.i) {
            return j3;
        }
        long j4 = oVar.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(oVar.h, j5)), j5 - r9.f3743f);
    }

    public static long b(C0335f c0335f, long j2) {
        o oVar = c0335f.d;
        if (oVar instanceof j) {
            return j2;
        }
        ArrayList arrayList = c0335f.f3746k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0333d interfaceC0333d = (InterfaceC0333d) arrayList.get(i);
            if (interfaceC0333d instanceof C0335f) {
                C0335f c0335f2 = (C0335f) interfaceC0333d;
                if (c0335f2.d != oVar) {
                    j3 = Math.max(j3, b(c0335f2, c0335f2.f3743f + j2));
                }
            }
        }
        if (c0335f != oVar.h) {
            return j3;
        }
        long j4 = oVar.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(oVar.i, j5)), j5 - r9.f3743f);
    }
}
