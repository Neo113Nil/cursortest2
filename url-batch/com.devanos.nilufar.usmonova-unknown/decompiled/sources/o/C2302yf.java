package o;

import java.util.LinkedHashSet;

/* renamed from: o.yf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2302yf extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0657Zf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2302yf(C0657Zf c0657Zf, int i) {
        super(0);
        this.h = i;
        this.i = c0657Zf;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return ((LF) this.i.p.getValue()).c;
            default:
                IF r0 = this.i.h;
                String o2 = ((CH) r0.d.getValue()).h.o();
                synchronized (IF.f) {
                    LinkedHashSet linkedHashSet = IF.e;
                    if (linkedHashSet.contains(o2)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + o2 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(o2);
                }
                return new LF(r0.a, (CH) r0.d.getValue(), (SR) r0.b.invoke((CH) r0.d.getValue(), r0.a), new HF(r0, 1));
        }
    }
}
