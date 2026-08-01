package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wk extends v00 implements mu {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(cj0 cj0Var, s80 s80Var, m80 m80Var, Bundle bundle) {
        super(1);
        this.f = cj0Var;
        this.g = s80Var;
        this.h = m80Var;
        this.i = bundle;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        boolean z;
        int i = this.e;
        ky0 ky0Var = ky0.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                b7 b7Var = (b7) obj;
                dj0 dj0Var = (dj0) serializable;
                float floatValue = ((Number) b7Var.e.getValue()).floatValue() - dj0Var.d;
                float a = ((vo0) obj3).a(floatValue);
                dj0Var.d = ((Number) b7Var.e.getValue()).floatValue();
                ((dj0) obj4).d = ((Number) ((mu) b7Var.a.f).c(b7Var.f)).floatValue();
                if (Math.abs(floatValue - a) > 0.5f) {
                    b7Var.i.setValue(Boolean.FALSE);
                    b7Var.d.a();
                }
                ((j3) obj2).getClass();
                break;
            case 1:
                long longValue = ((Number) obj).longValue();
                bk bkVar = (bk) obj2;
                dj0 dj0Var2 = (dj0) serializable;
                zx zxVar = (zx) obj3;
                bt0 bt0Var = (bt0) ((f70) obj4).getValue();
                long longValue2 = bt0Var != null ? ((Number) bt0Var.getValue()).longValue() : longValue;
                long j = zxVar.c;
                l70 l70Var = zxVar.a;
                int i2 = 0;
                if (j == Long.MIN_VALUE || dj0Var2.d != ze0.k(bkVar.f())) {
                    zxVar.c = longValue;
                    int i3 = l70Var.f;
                    if (i3 > 0) {
                        Object[] objArr = l70Var.d;
                        int i4 = 0;
                        do {
                            ((xx) objArr[i4]).i = true;
                            i4++;
                        } while (i4 < i3);
                    }
                    dj0Var2.d = ze0.k(bkVar.f());
                }
                float f = dj0Var2.d;
                if (f != 0.0f) {
                    long j2 = (long) ((longValue2 - zxVar.c) / f);
                    int i5 = l70Var.f;
                    if (i5 > 0) {
                        Object[] objArr2 = l70Var.d;
                        z = true;
                        int i6 = 0;
                        do {
                            xx xxVar = (xx) objArr2[i6];
                            if (!xxVar.h) {
                                xxVar.k.b.setValue(Boolean.FALSE);
                                if (xxVar.i) {
                                    xxVar.i = false;
                                    xxVar.j = j2;
                                }
                                long j3 = j2 - xxVar.j;
                                xxVar.f.setValue(xxVar.g.b(j3));
                                zu0 zu0Var = xxVar.g;
                                zu0Var.getClass();
                                xxVar.h = y6.a(zu0Var, j3);
                            }
                            if (!xxVar.h) {
                                z = false;
                            }
                            i6++;
                        } while (i6 < i5);
                    } else {
                        z = true;
                    }
                    zxVar.d.setValue(Boolean.valueOf(!z));
                    break;
                } else {
                    int i7 = l70Var.f;
                    if (i7 > 0) {
                        Object[] objArr3 = l70Var.d;
                        do {
                            xx xxVar2 = (xx) objArr3[i2];
                            xxVar2.f.setValue(xxVar2.g.c);
                            xxVar2.i = true;
                            i2++;
                        } while (i2 < i7);
                    }
                }
                break;
            default:
                y70 y70Var = (y70) obj;
                y70Var.getClass();
                ((cj0) serializable).d = true;
                ((s80) obj4).a((m80) obj3, (Bundle) obj2, y70Var, wp.d);
                break;
        }
        return ky0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(f70 f70Var, zx zxVar, dj0 dj0Var, bk bkVar) {
        super(1);
        this.g = f70Var;
        this.h = zxVar;
        this.f = dj0Var;
        this.i = bkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(dj0 dj0Var, vo0 vo0Var, dj0 dj0Var2, j3 j3Var) {
        super(1);
        this.f = dj0Var;
        this.h = vo0Var;
        this.g = dj0Var2;
        this.i = j3Var;
    }
}
