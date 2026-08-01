package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class vg extends vv {
    public final /* synthetic */ wg l;

    public vg(wg wgVar) {
        this.l = wgVar;
    }

    @Override // defpackage.vv
    public final void B(Throwable th) {
        this.l.a.d(th);
    }

    @Override // defpackage.vv
    public final void C(oe oeVar) {
        wg wgVar = this.l;
        wgVar.c = oeVar;
        oe oeVar2 = wgVar.c;
        ah ahVar = wgVar.a;
        tg tgVar = ahVar.g;
        ce ceVar = ahVar.i;
        Set<int[]> a = Build.VERSION.SDK_INT >= 34 ? fh.a() : m60.y();
        y5 y5Var = new y5();
        y5Var.a = tgVar;
        y5Var.b = oeVar2;
        y5Var.c = ceVar;
        if (!a.isEmpty()) {
            for (int[] iArr : a) {
                String str = new String(iArr, 0, iArr.length);
                y5Var.m(str, 0, str.length(), 1, true, new j0(17, str));
            }
        }
        wgVar.b = y5Var;
        ah ahVar2 = wgVar.a;
        ArrayList arrayList = new ArrayList();
        ahVar2.a.writeLock().lock();
        try {
            ahVar2.c = 1;
            arrayList.addAll(ahVar2.b);
            ahVar2.b.clear();
            ahVar2.a.writeLock().unlock();
            ahVar2.d.post(new w8(arrayList, ahVar2.c, (Throwable) null));
        } catch (Throwable th) {
            ahVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
