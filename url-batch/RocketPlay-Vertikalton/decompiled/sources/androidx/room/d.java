package androidx.room;

import android.os.CancellationSignal;
import q1.Z;

/* loaded from: classes.dex */
public final class d extends i1.g implements h1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f2052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z f2053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CancellationSignal cancellationSignal, Z z2) {
        super(1);
        this.f2052b = cancellationSignal;
        this.f2053c = z2;
    }

    @Override // h1.l
    public final Object g(Object obj) {
        this.f2052b.cancel();
        this.f2053c.g(null);
        return V0.i.f1250a;
    }
}
