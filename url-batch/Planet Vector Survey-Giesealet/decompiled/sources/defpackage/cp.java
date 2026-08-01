package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cp extends px0 {
    public final /* synthetic */ dp k;

    public cp(dp dpVar) {
        this.k = dpVar;
    }

    @Override // defpackage.px0
    public final void M(Throwable th) {
        this.k.a.d(th);
    }

    @Override // defpackage.px0
    public final void N(k2 k2Var) {
        dp dpVar = this.k;
        dpVar.c = k2Var;
        k2 k2Var2 = dpVar.c;
        gp gpVar = dpVar.a;
        dpVar.b = new t7(k2Var2, gpVar.g, gpVar.i, Build.VERSION.SDK_INT >= 34 ? mp.a() : d31.w());
        gp gpVar2 = dpVar.a;
        ArrayList arrayList = new ArrayList();
        gpVar2.a.writeLock().lock();
        try {
            gpVar2.c = 1;
            arrayList.addAll(gpVar2.b);
            gpVar2.b.clear();
            gpVar2.a.writeLock().unlock();
            gpVar2.d.post(new ep(arrayList, gpVar2.c, null));
        } catch (Throwable th) {
            gpVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
