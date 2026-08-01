package t;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public p f4146a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4147b;

    public static long a(f fVar, long j2) {
        p pVar = fVar.d;
        if (pVar instanceof j) {
            return j2;
        }
        ArrayList arrayList = fVar.f4141k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0367d interfaceC0367d = (InterfaceC0367d) arrayList.get(i);
            if (interfaceC0367d instanceof f) {
                f fVar2 = (f) interfaceC0367d;
                if (fVar2.d != pVar) {
                    j3 = Math.min(j3, a(fVar2, fVar2.f4138f + j2));
                }
            }
        }
        if (fVar != pVar.i) {
            return j3;
        }
        long j4 = pVar.j();
        long j5 = j2 - j4;
        return Math.min(Math.min(j3, a(pVar.h, j5)), j5 - r9.f4138f);
    }

    public static long b(f fVar, long j2) {
        p pVar = fVar.d;
        if (pVar instanceof j) {
            return j2;
        }
        ArrayList arrayList = fVar.f4141k;
        int size = arrayList.size();
        long j3 = j2;
        for (int i = 0; i < size; i++) {
            InterfaceC0367d interfaceC0367d = (InterfaceC0367d) arrayList.get(i);
            if (interfaceC0367d instanceof f) {
                f fVar2 = (f) interfaceC0367d;
                if (fVar2.d != pVar) {
                    j3 = Math.max(j3, b(fVar2, fVar2.f4138f + j2));
                }
            }
        }
        if (fVar != pVar.h) {
            return j3;
        }
        long j4 = pVar.j();
        long j5 = j2 + j4;
        return Math.max(Math.max(j3, b(pVar.i, j5)), j5 - r9.f4138f);
    }
}
