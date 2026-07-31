package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class n70 extends Lambda implements Function0 {
    public static final n70 b = new n70();

    public n70() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 != null) {
            return vw2Var2;
        }
        synchronized (vw2.k) {
            vw2Var = vw2.l;
            if (vw2Var == null) {
                vw2Var = new vw2();
                vw2.l = vw2Var;
            }
        }
        return vw2Var;
    }
}
