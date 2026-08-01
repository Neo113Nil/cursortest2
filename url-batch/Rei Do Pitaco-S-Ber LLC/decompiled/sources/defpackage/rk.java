package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class rk implements qk {
    public final int a;
    public final /* synthetic */ sk b;

    public rk(sk skVar, int i) {
        this.b = skVar;
        this.a = i;
    }

    @Override // defpackage.qk
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        sk skVar = this.b;
        dk dkVar = skVar.w;
        int i = this.a;
        if (dkVar == null || i >= 0 || !dkVar.g().O(-1, 0)) {
            return skVar.P(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
