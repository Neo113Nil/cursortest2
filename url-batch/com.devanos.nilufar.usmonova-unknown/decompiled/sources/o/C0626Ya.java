package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.Ya, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626Ya extends AbstractC0179Gu {
    public final /* synthetic */ int l;
    public final C0849ca m;

    public /* synthetic */ C0626Ya(C0849ca c0849ca, int i) {
        this.l = i;
        this.m = c0849ca;
    }

    @Override // o.AbstractC0179Gu
    public final boolean k() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // o.AbstractC0179Gu
    public final void l(Throwable th) {
        switch (this.l) {
            case 0:
                C0283Ku j = j();
                C0849ca c0849ca = this.m;
                Throwable p = c0849ca.p(j);
                if (c0849ca.v()) {
                    C0011Ai c0011Ai = (C0011Ai) c0849ca.k;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0011Ai.f12o;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c0011Ai);
                        C0457Rn c0457Rn = AbstractC0022At.c;
                        if (AbstractC0048Bt.h(obj, c0457Rn)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c0011Ai, c0457Rn, p)) {
                                if (atomicReferenceFieldUpdater.get(c0011Ai) != c0457Rn) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c0011Ai, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(c0011Ai) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c0849ca.m(p);
                if (!c0849ca.v()) {
                    c0849ca.n();
                    break;
                }
                break;
            default:
                this.m.resumeWith(C0782bY.a);
                break;
        }
    }
}
