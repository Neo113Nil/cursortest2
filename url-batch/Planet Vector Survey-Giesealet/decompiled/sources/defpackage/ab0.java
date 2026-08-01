package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class ab0 implements bu {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ab0(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Finally extract failed */
    private final Object d() {
        int i;
        is0 is0Var = (is0) this.e;
        do {
            synchronized (is0Var.g) {
                try {
                    if (!is0Var.c) {
                        is0Var.c = true;
                        try {
                            l70 l70Var = is0Var.f;
                            Object[] objArr = l70Var.d;
                            int i2 = l70Var.f;
                            for (int i3 = 0; i3 < i2; i3++) {
                                hs0 hs0Var = (hs0) objArr[i3];
                                b70 b70Var = hs0Var.g;
                                mu muVar = hs0Var.a;
                                Object[] objArr2 = b70Var.b;
                                long[] jArr = b70Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j = jArr[i4];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = 0;
                                            while (i7 < i6) {
                                                if ((j & 255) < 128) {
                                                    i = i5;
                                                    muVar.c(objArr2[(i4 << 3) + i7]);
                                                } else {
                                                    i = i5;
                                                }
                                                j >>= i;
                                                i7++;
                                                i5 = i;
                                            }
                                            if (i6 != i5) {
                                                break;
                                            }
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                    }
                                }
                                b70Var.b();
                            }
                            is0Var.c = false;
                        } catch (Throwable th) {
                            is0Var.c = false;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (is0Var.a());
        return ky0.a;
    }

    @Override // defpackage.bu
    public final Object a() {
        fc A;
        int i = 0;
        switch (this.d) {
            case 0:
                return new cb0((eb0) this.e);
            case 1:
                wi0 wi0Var = (wi0) this.e;
                synchronized (wi0Var.b) {
                    A = wi0Var.A();
                    if (((si0) wi0Var.t.getValue()).compareTo(si0.e) <= 0) {
                        Throwable th = wi0Var.d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (A != null) {
                    ((hc) A).resumeWith(ky0.a);
                }
                return ky0.a;
            case 2:
                vm0 vm0Var = (vm0) this.e;
                on0 on0Var = vm0Var.d;
                Object obj = vm0Var.g;
                if (obj != null) {
                    return on0Var.d(vm0Var, obj);
                }
                g8.r("Value should be initialized");
                return null;
            case 3:
                an0 an0Var = (an0) this.e;
                Bundle r = x40.r((pd0[]) Arrays.copyOf(new pd0[0], 0));
                an0Var.e.b(r);
                if (r.isEmpty()) {
                    return null;
                }
                return r;
            case 4:
                return x40.E((r01) this.e);
            case 5:
                ln0 ln0Var = (ln0) this.e;
                ln0Var.getLifecycle().a(new yi0(i, ln0Var));
                return ky0.a;
            case 6:
                return this.e;
            case 7:
                oq0 oq0Var = (oq0) this.e;
                ce0 ce0Var = oq0Var.f;
                if (((fr0) ce0Var.getValue()).a == 9205357640488583168L || fr0.f(((fr0) ce0Var.getValue()).a)) {
                    return null;
                }
                return oq0Var.d.Y(((fr0) ce0Var.getValue()).a);
            case 8:
                return d();
            default:
                return (kv0) this.e;
        }
    }
}
