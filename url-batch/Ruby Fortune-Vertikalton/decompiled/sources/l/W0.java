package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0155k;
import k.MenuC0157m;

/* loaded from: classes.dex */
public final class W0 implements InterfaceC0250o, InterfaceC0155k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2937a;

    public /* synthetic */ W0(Toolbar toolbar) {
        this.f2937a = toolbar;
    }

    @Override // k.InterfaceC0155k
    public void g(MenuC0157m menuC0157m) {
        Toolbar toolbar = this.f2937a;
        C0244l c0244l = toolbar.f1220a.f1184t;
        if (c0244l == null || !c0244l.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1209G.f432c).iterator();
            while (it.hasNext()) {
                ((X.B) it.next()).f784a.s();
            }
        }
    }

    @Override // k.InterfaceC0155k
    public boolean h(MenuC0157m menuC0157m, MenuItem menuItem) {
        this.f2937a.getClass();
        return false;
    }
}
