package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class zw {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final yw j;
    public boolean k;

    public zw(float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        String str = (i2 & 1) != 0 ? "" : "AutoMirrored.Filled.ArrowBack";
        long j2 = (i2 & 32) != 0 ? ge.g : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        yw ywVar = new yw(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = ywVar;
        arrayList.add(ywVar);
    }

    public final ax a() {
        if (this.k) {
            cy.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                yw ywVar = this.j;
                ax axVar = new ax(this.a, this.b, this.c, this.d, this.e, new ez0(ywVar.a, ywVar.b, ywVar.c, ywVar.d, ywVar.e, ywVar.f, ywVar.g, ywVar.h, ywVar.i, ywVar.j), this.f, this.g, this.h);
                this.k = true;
                return axVar;
            }
            if (this.k) {
                cy.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            yw ywVar2 = (yw) arrayList.remove(arrayList.size() - 1);
            ((yw) arrayList.get(arrayList.size() - 1)).j.add(new ez0(ywVar2.a, ywVar2.b, ywVar2.c, ywVar2.d, ywVar2.e, ywVar2.f, ywVar2.g, ywVar2.h, ywVar2.i, ywVar2.j));
        }
    }
}
