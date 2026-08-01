package androidx.lifecycle;

import defpackage.fp;
import defpackage.jp;
import defpackage.ke;
import defpackage.l8;
import defpackage.le;
import defpackage.lp;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements jp {
    public final ke a;
    public final jp b;

    public DefaultLifecycleObserverAdapter(ke keVar, jp jpVar) {
        this.a = keVar;
        this.b = jpVar;
    }

    @Override // defpackage.jp
    public final void b(lp lpVar, fp fpVar) {
        int i = le.a[fpVar.ordinal()];
        if (i == 3) {
            this.a.a();
        } else if (i == 7) {
            l8.l("ON_ANY must not been send by anybody");
            return;
        }
        jp jpVar = this.b;
        if (jpVar != null) {
            jpVar.b(lpVar, fpVar);
        }
    }
}
