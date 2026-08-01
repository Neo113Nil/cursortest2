package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class bz0 extends wy0 {
    public final wv b;
    public String c;
    public boolean d;
    public final jo e;
    public bu f;
    public final ce0 g;
    public q9 h;
    public final ce0 i;
    public long j;
    public float k;
    public float l;
    public final az0 m;

    public bz0(wv wvVar) {
        this.b = wvVar;
        wvVar.i = new az0(this, 0);
        this.c = "";
        this.d = true;
        this.e = new jo();
        this.f = gi.F;
        this.g = ud0.o(null);
        this.i = ud0.o(new fr0(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new az0(this, 1);
    }

    @Override // defpackage.wy0
    public final void a(oo ooVar) {
        e(ooVar, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r3 != (r8 == null ? r8.a() : 0)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
    
        if (r9.d == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(oo ooVar, float f, q9 q9Var) {
        int i;
        boolean z;
        jo joVar;
        q9 q9Var2;
        x4 x4Var;
        char c;
        long j;
        q9 q9Var3;
        x4 x4Var2;
        int i2;
        int i3;
        wv wvVar = this.b;
        boolean z2 = wvVar.d;
        ce0 ce0Var = this.g;
        if (z2 && wvVar.e != 16) {
            q9 q9Var4 = (q9) ce0Var.getValue();
            int i4 = fz0.a;
            if (!(q9Var4 instanceof q9) ? q9Var4 == null : !((i3 = q9Var4.c) != 5 && i3 != 3)) {
                if (!(q9Var instanceof q9) ? q9Var == null : !((i2 = q9Var.c) != 5 && i2 != 3)) {
                    i = 1;
                    z = this.d;
                    joVar = this.e;
                    if (!z && fr0.b(this.j, ooVar.c())) {
                        x4 x4Var3 = joVar.a;
                    }
                    if (i != 1) {
                        long j2 = wvVar.e;
                        int i5 = fz0.a;
                        if (ge.d(j2) != 1.0f) {
                            j2 = ge.b(j2, 1.0f);
                        }
                        q9Var2 = new q9(j2, 5);
                    } else {
                        q9Var2 = null;
                    }
                    this.h = q9Var2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (ooVar.c() >> 32));
                    ce0 ce0Var2 = this.i;
                    this.k = intBitsToFloat / Float.intBitsToFloat((int) (((fr0) ce0Var2.getValue()).a >> 32));
                    this.l = Float.intBitsToFloat((int) (ooVar.c() & 4294967295L)) / Float.intBitsToFloat((int) (((fr0) ce0Var2.getValue()).a & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (ooVar.c() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (ooVar.c() & 4294967295L)))) & 4294967295L);
                    c10 layoutDirection = ooVar.getLayoutDirection();
                    x4Var = joVar.a;
                    o2 o2Var = joVar.b;
                    if (x4Var != null || o2Var == null) {
                        c = ' ';
                        j = 4294967295L;
                    } else {
                        int i6 = (int) (ceil >> 32);
                        Bitmap bitmap = x4Var.a;
                        c = ' ';
                        j = 4294967295L;
                        if (i6 <= bitmap.getWidth()) {
                            if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                            }
                        }
                    }
                    x4Var = a50.b((int) (ceil >> c), (int) (ceil & j), i);
                    Canvas canvas = p2.a;
                    o2Var = new o2();
                    o2Var.a = new Canvas(x4Var.a);
                    joVar.a = x4Var;
                    joVar.b = o2Var;
                    joVar.d = i;
                    joVar.c = ceil;
                    nc ncVar = joVar.e;
                    long W = px0.W(ceil);
                    mc mcVar = ncVar.d;
                    sl slVar = mcVar.a;
                    c10 c10Var = mcVar.b;
                    kc kcVar = mcVar.c;
                    o2 o2Var2 = o2Var;
                    long j3 = mcVar.d;
                    mcVar.a = ooVar;
                    mcVar.b = layoutDirection;
                    mcVar.c = o2Var2;
                    mcVar.d = W;
                    o2Var2.i();
                    y6.q(ncVar, ge.b, 0L, 62);
                    this.m.c(ncVar);
                    o2Var2.g();
                    mc mcVar2 = ncVar.d;
                    mcVar2.a = slVar;
                    mcVar2.b = c10Var;
                    mcVar2.c = kcVar;
                    mcVar2.d = j3;
                    x4Var.a.prepareToDraw();
                    this.d = false;
                    this.j = ooVar.c();
                    if (q9Var == null) {
                        q9Var3 = q9Var;
                    } else {
                        q9Var3 = ((q9) ce0Var.getValue()) != null ? (q9) ce0Var.getValue() : this.h;
                    }
                    x4Var2 = joVar.a;
                    if (x4Var2 == null) {
                        cy.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                    }
                    y6.n(ooVar, x4Var2, joVar.c, 0L, f, q9Var3, 0, 858);
                }
            }
        }
        i = 0;
        z = this.d;
        joVar = this.e;
        if (!z) {
            x4 x4Var32 = joVar.a;
        }
        if (i != 1) {
        }
        this.h = q9Var2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ooVar.c() >> 32));
        ce0 ce0Var22 = this.i;
        this.k = intBitsToFloat2 / Float.intBitsToFloat((int) (((fr0) ce0Var22.getValue()).a >> 32));
        this.l = Float.intBitsToFloat((int) (ooVar.c() & 4294967295L)) / Float.intBitsToFloat((int) (((fr0) ce0Var22.getValue()).a & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (ooVar.c() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (ooVar.c() & 4294967295L)))) & 4294967295L);
        c10 layoutDirection2 = ooVar.getLayoutDirection();
        x4Var = joVar.a;
        o2 o2Var3 = joVar.b;
        if (x4Var != null) {
        }
        c = ' ';
        j = 4294967295L;
        x4Var = a50.b((int) (ceil2 >> c), (int) (ceil2 & j), i);
        Canvas canvas2 = p2.a;
        o2Var3 = new o2();
        o2Var3.a = new Canvas(x4Var.a);
        joVar.a = x4Var;
        joVar.b = o2Var3;
        joVar.d = i;
        joVar.c = ceil2;
        nc ncVar2 = joVar.e;
        long W2 = px0.W(ceil2);
        mc mcVar3 = ncVar2.d;
        sl slVar2 = mcVar3.a;
        c10 c10Var2 = mcVar3.b;
        kc kcVar2 = mcVar3.c;
        o2 o2Var22 = o2Var3;
        long j32 = mcVar3.d;
        mcVar3.a = ooVar;
        mcVar3.b = layoutDirection2;
        mcVar3.c = o2Var22;
        mcVar3.d = W2;
        o2Var22.i();
        y6.q(ncVar2, ge.b, 0L, 62);
        this.m.c(ncVar2);
        o2Var22.g();
        mc mcVar22 = ncVar2.d;
        mcVar22.a = slVar2;
        mcVar22.b = c10Var2;
        mcVar22.c = kcVar2;
        mcVar22.d = j32;
        x4Var.a.prepareToDraw();
        this.d = false;
        this.j = ooVar.c();
        if (q9Var == null) {
        }
        x4Var2 = joVar.a;
        if (x4Var2 == null) {
        }
        y6.n(ooVar, x4Var2, joVar.c, 0L, f, q9Var3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        ce0 ce0Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((fr0) ce0Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((fr0) ce0Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
