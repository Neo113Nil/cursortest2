package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class l00 {
    public w90 a;
    public ArrayList b;

    public static long a(ze zeVar, long j) {
        w90 w90Var = zeVar.d;
        ArrayList arrayList = zeVar.k;
        if (w90Var instanceof om) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            xe xeVar = (xe) arrayList.get(i);
            if (xeVar instanceof ze) {
                ze zeVar2 = (ze) xeVar;
                if (zeVar2.d != w90Var) {
                    j2 = Math.min(j2, a(zeVar2, zeVar2.f + j));
                }
            }
        }
        ze zeVar3 = w90Var.i;
        ze zeVar4 = w90Var.h;
        if (zeVar != zeVar3) {
            return j2;
        }
        long j3 = j - w90Var.j();
        return Math.min(Math.min(j2, a(zeVar4, j3)), j3 - zeVar4.f);
    }

    public static long b(ze zeVar, long j) {
        w90 w90Var = zeVar.d;
        ArrayList arrayList = zeVar.k;
        if (w90Var instanceof om) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            xe xeVar = (xe) arrayList.get(i);
            if (xeVar instanceof ze) {
                ze zeVar2 = (ze) xeVar;
                if (zeVar2.d != w90Var) {
                    j2 = Math.max(j2, b(zeVar2, zeVar2.f + j));
                }
            }
        }
        ze zeVar3 = w90Var.h;
        ze zeVar4 = w90Var.i;
        if (zeVar != zeVar3) {
            return j2;
        }
        long j3 = w90Var.j() + j;
        return Math.max(Math.max(j2, b(zeVar4, j3)), j3 - zeVar4.f);
    }
}
