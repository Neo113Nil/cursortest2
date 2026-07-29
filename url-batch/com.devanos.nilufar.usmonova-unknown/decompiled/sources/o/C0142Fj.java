package o;

import android.os.Build;
import java.util.ArrayList;

/* renamed from: o.Fj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142Fj extends AbstractC0868ct {
    public final /* synthetic */ C0168Gj s;

    public C0142Fj(C0168Gj c0168Gj) {
        this.s = c0168Gj;
    }

    @Override // o.AbstractC0868ct
    public final void O(Throwable th) {
        this.s.a.d(th);
    }

    @Override // o.AbstractC0868ct
    public final void P(C1334k c1334k) {
        C0168Gj c0168Gj = this.s;
        c0168Gj.c = c1334k;
        C1334k c1334k2 = c0168Gj.c;
        C0272Kj c0272Kj = c0168Gj.a;
        c0168Gj.b = new C0950e6(c1334k2, c0272Kj.g, c0272Kj.i, Build.VERSION.SDK_INT >= 34 ? AbstractC0401Pj.a() : AbstractC0022At.s());
        C0272Kj c0272Kj2 = c0168Gj.a;
        c0272Kj2.getClass();
        ArrayList arrayList = new ArrayList();
        c0272Kj2.a.writeLock().lock();
        try {
            c0272Kj2.c = 1;
            arrayList.addAll(c0272Kj2.b);
            c0272Kj2.b.clear();
            c0272Kj2.a.writeLock().unlock();
            c0272Kj2.d.post(new F9(arrayList, c0272Kj2.c, (Throwable) null));
        } catch (Throwable th) {
            c0272Kj2.a.writeLock().unlock();
            throw th;
        }
    }
}
