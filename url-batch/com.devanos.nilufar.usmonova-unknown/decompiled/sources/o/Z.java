package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class Z {
    public AbstractC0679a0[] h;
    public int i;
    public int j;
    public C1040fU k;

    public final AbstractC0679a0 a() {
        AbstractC0679a0 abstractC0679a0;
        C1040fU c1040fU;
        synchronized (this) {
            try {
                AbstractC0679a0[] abstractC0679a0Arr = this.h;
                if (abstractC0679a0Arr == null) {
                    abstractC0679a0Arr = c();
                    this.h = abstractC0679a0Arr;
                } else if (this.i >= abstractC0679a0Arr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC0679a0Arr, abstractC0679a0Arr.length * 2);
                    AbstractC0048Bt.m(copyOf, "copyOf(...)");
                    this.h = (AbstractC0679a0[]) copyOf;
                    abstractC0679a0Arr = (AbstractC0679a0[]) copyOf;
                }
                int i = this.j;
                do {
                    abstractC0679a0 = abstractC0679a0Arr[i];
                    if (abstractC0679a0 == null) {
                        abstractC0679a0 = b();
                        abstractC0679a0Arr[i] = abstractC0679a0;
                    }
                    i++;
                    if (i >= abstractC0679a0Arr.length) {
                        i = 0;
                    }
                } while (!abstractC0679a0.a(this));
                this.j = i;
                this.i++;
                c1040fU = this.k;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c1040fU != null) {
            c1040fU.v(1);
        }
        return abstractC0679a0;
    }

    public abstract AbstractC0679a0 b();

    public abstract AbstractC0679a0[] c();

    public final void d(AbstractC0679a0 abstractC0679a0) {
        C1040fU c1040fU;
        int i;
        InterfaceC2235xe[] b;
        synchronized (this) {
            try {
                int i2 = this.i - 1;
                this.i = i2;
                c1040fU = this.k;
                if (i2 == 0) {
                    this.j = 0;
                }
                AbstractC0048Bt.l(abstractC0679a0, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b = abstractC0679a0.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC2235xe interfaceC2235xe : b) {
            if (interfaceC2235xe != null) {
                interfaceC2235xe.resumeWith(C0782bY.a);
            }
        }
        if (c1040fU != null) {
            c1040fU.v(-1);
        }
    }

    public final C1040fU e() {
        C1040fU c1040fU;
        synchronized (this) {
            c1040fU = this.k;
            if (c1040fU == null) {
                int i = this.i;
                c1040fU = new C1040fU(1, Integer.MAX_VALUE, H8.i);
                c1040fU.n(Integer.valueOf(i));
                this.k = c1040fU;
            }
        }
        return c1040fU;
    }
}
