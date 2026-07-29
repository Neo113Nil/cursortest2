package o;

import java.io.Serializable;

/* renamed from: o.qP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1759qP implements InterfaceC2312yp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Serializable i;

    public /* synthetic */ C1759qP(int i, Serializable serializable) {
        this.h = i;
        this.i = serializable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        if (r0 == null) goto L24;
     */
    @Override // o.InterfaceC2312yp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                C1561nP c1561nP = (C1561nP) this.i;
                int intValue = ((Integer) obj).intValue();
                InterfaceC0137Fe interfaceC0137Fe = (InterfaceC0137Fe) obj2;
                InterfaceC0163Ge key = interfaceC0137Fe.getKey();
                InterfaceC0137Fe k = c1561nP.i.k(key);
                if (key != C0460Rq.K) {
                    if (interfaceC0137Fe != k) {
                        intValue = Integer.MIN_VALUE;
                    }
                    intValue++;
                } else {
                    InterfaceC0075Cu interfaceC0075Cu = (InterfaceC0075Cu) k;
                    InterfaceC0075Cu interfaceC0075Cu2 = (InterfaceC0075Cu) interfaceC0137Fe;
                    while (true) {
                        if (interfaceC0075Cu2 == null) {
                            interfaceC0075Cu2 = null;
                        } else if (interfaceC0075Cu2 != interfaceC0075Cu && (interfaceC0075Cu2 instanceof C1102gQ)) {
                            InterfaceC0652Za interfaceC0652Za = (InterfaceC0652Za) C0283Ku.i.get((C1102gQ) interfaceC0075Cu2);
                            interfaceC0075Cu2 = interfaceC0652Za != null ? interfaceC0652Za.getParent() : null;
                        }
                    }
                    if (interfaceC0075Cu2 != interfaceC0075Cu) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC0075Cu2 + ", expected child of " + interfaceC0075Cu + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                }
                return Integer.valueOf(intValue);
            default:
                char[] cArr = (char[]) this.i;
                CharSequence charSequence = (CharSequence) obj;
                int intValue2 = ((Integer) obj2).intValue();
                AbstractC0048Bt.n(charSequence, "$this$DelimitedRangesSequence");
                int I = UT.I(charSequence, cArr, intValue2, false);
                if (I < 0) {
                    return null;
                }
                return new C1619oH(Integer.valueOf(I), 1);
        }
    }
}
