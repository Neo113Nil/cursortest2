package androidx.room;

import android.os.CancellationSignal;
import o1.P;
import o1.b0;

/* loaded from: classes.dex */
public final class d extends g1.g implements f1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1674c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i, Object obj2) {
        super(1);
        this.f1673b = i;
        this.f1674c = obj;
        this.d = obj2;
    }

    @Override // f1.l
    public final Object g(Object obj) {
        switch (this.f1673b) {
            case 0:
                ((CancellationSignal) this.f1674c).cancel();
                b0 b0Var = (b0) this.d;
                b0Var.i(new P(b0Var.l(), null, b0Var));
                break;
            default:
                ((p1.c) this.f1674c).f3428c.removeCallbacks((H.a) this.d);
                break;
        }
        return U0.i.f870a;
    }
}
