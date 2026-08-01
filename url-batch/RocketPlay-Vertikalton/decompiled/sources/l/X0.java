package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0200k;
import k.MenuC0202m;

/* loaded from: classes.dex */
public final class X0 implements InterfaceC0267o, InterfaceC0200k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3381a;

    public /* synthetic */ X0(Toolbar toolbar) {
        this.f3381a = toolbar;
    }

    @Override // k.InterfaceC0200k
    public void e(MenuC0202m menuC0202m) {
        Toolbar toolbar = this.f3381a;
        C0259k c0259k = toolbar.f1759a.f1723t;
        if (c0259k == null || !c0259k.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1748G.f684b).iterator();
            while (it.hasNext()) {
                ((Y.B) it.next()).f1322a.s();
            }
        }
    }

    @Override // k.InterfaceC0200k
    public boolean f(MenuC0202m menuC0202m, MenuItem menuItem) {
        this.f3381a.getClass();
        return false;
    }
}
