package o;

import java.util.Map;

/* renamed from: o.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1730q implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C1730q(InterfaceC1455lp interfaceC1455lp) {
        this.h = 3;
        this.i = (AbstractC1596ny) interfaceC1455lp;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [o.lp, o.ny] */
    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                return obj == ((r) this.i) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                C c = (C) this.i;
                Map.Entry entry = (Map.Entry) obj;
                AbstractC0048Bt.n(entry, "it");
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == c ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != c ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                ((C0762bE) this.i).e(null);
                return C0782bY.a;
            default:
                ?? r0 = (AbstractC1596ny) this.i;
                AbstractC0048Bt.n(obj, "it");
                return r0.invoke();
        }
    }

    public /* synthetic */ C1730q(InterfaceC1594nw interfaceC1594nw, int i) {
        this.h = i;
        this.i = interfaceC1594nw;
    }

    public /* synthetic */ C1730q(C0762bE c0762bE, C0696aE c0696aE) {
        this.h = 2;
        this.i = c0762bE;
    }
}
