package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network/classes2.dex */
public class D8 {
    public final int A00;
    public final C3626no A01;
    public final long A02;
    public final CopyOnWriteArrayList<D7> A03;

    public D8() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public D8(CopyOnWriteArrayList<D7> copyOnWriteArrayList, int i, C3626no c3626no, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c3626no;
        this.A02 = j;
    }

    private long A00(long j) {
        long A0P = C5C.A0P(j);
        if (A0P == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + A0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final Cq cq, final C2211Cs c2211Cs, final int i) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d9 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D4
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final D8 A02(int i, C3626no c3626no, long j) {
        return new D8(this.A03, i, c3626no, j);
    }

    public final void A03(int i, C3778qI c3778qI, int i2, Object obj, long j) {
        A0C(new C2211Cs(1, i, c3778qI, i2, obj, A00(j), -9223372036854775807L));
    }

    public final void A04(Handler handler, D9 d9) {
        AbstractC20023y.A01(handler);
        AbstractC20023y.A01(d9);
        this.A03.add(new D7(handler, d9));
    }

    public final void A05(Cq cq, int i, int i2, C3778qI c3778qI, int i3, Object obj, long j, long j2) {
        A09(cq, new C2211Cs(i, i2, c3778qI, i3, obj, A00(j), A00(j2)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(Cq cq, int i, int i2, C3778qI c3778qI, int i3, Object obj, long j, long j2, int i4) {
        A01(cq, new C2211Cs(i, i2, c3778qI, i3, obj, A00(j), A00(j2)), i4);
    }

    public final void A07(Cq cq, int i, int i2, C3778qI c3778qI, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        A0A(cq, new C2211Cs(i, i2, c3778qI, i3, obj, A00(j), A00(j2)), iOException, z);
    }

    public final void A08(@MetaExoPlayerCustomization Cq cq, @MetaExoPlayerCustomization int i, int i2, C3778qI c3778qI, int i3, Object obj, long j, long j2, Object obj2, Object obj3) {
        A0B(cq, new C2211Cs(i, i2, c3778qI, i3, obj, A00(j), A00(j2)), obj2, obj3);
    }

    public final void A09(final Cq cq, final C2211Cs c2211Cs) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 listener = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D5
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0E(listener, cq, c2211Cs);
                }
            });
        }
    }

    public final void A0A(final Cq cq, final C2211Cs c2211Cs, final IOException iOException, final boolean z) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d9 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D0
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0F(d9, cq, c2211Cs, iOException, z);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final Cq cq, @MetaExoPlayerCustomization final C2211Cs c2211Cs, final Object obj, final Object obj2) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d9 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D1
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0G(d9, cq, c2211Cs, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final C2211Cs c2211Cs) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 listener = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D2
                @Override // java.lang.Runnable
                public final void run() {
                    D8.this.A0H(listener, c2211Cs);
                }
            });
        }
    }

    public final void A0D(D9 d9) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == d9) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final /* synthetic */ void A0E(D9 d9, Cq cq, C2211Cs c2211Cs) {
        d9.AEb(this.A00, this.A01, cq, c2211Cs);
    }

    public final /* synthetic */ void A0F(D9 d9, Cq cq, C2211Cs c2211Cs, IOException iOException, boolean z) {
        d9.AEg(this.A00, this.A01, cq, c2211Cs, iOException, z);
    }

    public final /* synthetic */ void A0G(D9 d9, Cq cq, C2211Cs c2211Cs, Object obj, Object obj2) {
        d9.AEd(this.A00, this.A01, cq, c2211Cs, obj, obj2);
    }

    public final /* synthetic */ void A0H(D9 d9, C2211Cs c2211Cs) {
        d9.ADk(this.A00, this.A01, c2211Cs);
    }
}
