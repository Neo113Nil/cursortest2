package o;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class WV implements InterfaceC2326z1, InterfaceC0694aC {
    public final /* synthetic */ Toolbar h;

    public /* synthetic */ WV(Toolbar toolbar) {
        this.h = toolbar;
    }

    @Override // o.InterfaceC0694aC
    public boolean C(MenuC0825cC menuC0825cC, MenuItem menuItem) {
        return false;
    }

    @Override // o.InterfaceC0694aC
    public void Q(MenuC0825cC menuC0825cC) {
        Toolbar toolbar = this.h;
        C2128w1 c2128w1 = toolbar.h.A;
        if (c2128w1 == null || !c2128w1.f()) {
            Iterator it = toolbar.N.b.iterator();
            while (it.hasNext()) {
                ((C0406Po) ((InterfaceC2207xC) it.next())).a.t();
            }
        }
        C0845cW c0845cW = toolbar.V;
        if (c0845cW != null) {
            c0845cW.Q(menuC0825cC);
        }
    }
}
