package androidx.lifecycle;

import defpackage.fp;
import defpackage.ga;
import defpackage.ia;
import defpackage.jp;
import defpackage.kp;
import defpackage.lp;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements jp {
    public final kp a;
    public final ga b;

    public ReflectiveGenericLifecycleObserver(kp kpVar) {
        this.a = kpVar;
        ia iaVar = ia.c;
        Class<?> cls = kpVar.getClass();
        ga gaVar = (ga) iaVar.a.get(cls);
        this.b = gaVar == null ? iaVar.a(cls, null) : gaVar;
    }

    @Override // defpackage.jp
    public final void b(lp lpVar, fp fpVar) {
        HashMap hashMap = this.b.a;
        List list = (List) hashMap.get(fpVar);
        kp kpVar = this.a;
        ga.a(list, lpVar, fpVar, kpVar);
        ga.a((List) hashMap.get(fp.ON_ANY), lpVar, fpVar, kpVar);
    }
}
