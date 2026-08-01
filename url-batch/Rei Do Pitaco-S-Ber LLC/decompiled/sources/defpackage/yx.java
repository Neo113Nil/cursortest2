package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class yx {
    public final tx a;
    public final ArrayList b;
    public final int c;
    public final ei d;
    public final po e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public yx(tx txVar, ArrayList arrayList, int i, ei eiVar, po poVar, int i2, int i3, int i4) {
        this.a = txVar;
        this.b = arrayList;
        this.c = i;
        this.d = eiVar;
        this.e = poVar;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static yx a(yx yxVar, int i, ei eiVar, po poVar, int i2) {
        if ((i2 & 1) != 0) {
            i = yxVar.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            eiVar = yxVar.d;
        }
        ei eiVar2 = eiVar;
        if ((i2 & 4) != 0) {
            poVar = yxVar.e;
        }
        po poVar2 = poVar;
        int i4 = yxVar.f;
        int i5 = yxVar.g;
        int i6 = yxVar.h;
        poVar2.getClass();
        return new yx(yxVar.a, yxVar.b, i3, eiVar2, poVar2, i4, i5, i6);
    }

    public final zz b(po poVar) {
        poVar.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            l8.u("Check failed.");
            return null;
        }
        this.i++;
        ei eiVar = this.d;
        if (eiVar != null) {
            gi giVar = eiVar.b;
            xn xnVar = (xn) poVar.b;
            giVar.getClass();
            xnVar.getClass();
            xn xnVar2 = giVar.b.h;
            if (xnVar.e != xnVar2.e || !oo.b(xnVar.d, xnVar2.d)) {
                l8.s(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.i != 1) {
                l8.s(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        yx a = a(this, i2, null, poVar, 58);
        no noVar = (no) arrayList.get(i);
        zz a2 = noVar.a(a);
        if (a2 == null) {
            throw new NullPointerException("interceptor " + noVar + " returned null");
        }
        if (eiVar != null && i2 < arrayList.size() && a.i != 1) {
            l8.s(noVar, " must call proceed() exactly once", "network interceptor ");
            return null;
        }
        if (a2.l != null) {
            return a2;
        }
        l8.s(noVar, " returned a response with no body", "interceptor ");
        return null;
    }
}
