package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class b3 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ gj0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(gj0 gj0Var, int i) {
        super(1);
        this.e = i;
        this.f = gj0Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        boolean z = true;
        gj0 gj0Var = this.f;
        switch (i) {
            case 0:
                gj0Var.d = (ts) obj;
                return Boolean.TRUE;
            case 1:
                String str = (String) obj;
                str.getClass();
                Object obj2 = gj0Var.d;
                if (obj2 != null && ((Bundle) obj2).containsKey(str)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Object obj3 = (ix0) obj;
                if (((t50) obj3).d.q) {
                    gj0Var.d = obj3;
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
