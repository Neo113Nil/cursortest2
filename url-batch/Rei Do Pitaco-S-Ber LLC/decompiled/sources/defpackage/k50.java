package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class k50 implements n1, qs {
    public final /* synthetic */ Toolbar f;

    public /* synthetic */ k50(Toolbar toolbar) {
        this.f = toolbar;
    }

    @Override // defpackage.qs
    public boolean f(ss ssVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.qs
    public void n(ss ssVar) {
        Toolbar toolbar = this.f;
        k1 k1Var = toolbar.f.y;
        if (k1Var == null || !k1Var.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.c).iterator();
            while (it.hasNext()) {
                ((mk) it.next()).a.s();
            }
        }
    }
}
