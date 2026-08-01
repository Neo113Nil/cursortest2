package l;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0166k;
import k.MenuC0168m;

/* loaded from: classes.dex */
public final class W0 implements InterfaceC0240o, InterfaceC0166k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2946a;

    public /* synthetic */ W0(Toolbar toolbar) {
        this.f2946a = toolbar;
    }

    @Override // k.InterfaceC0166k
    public void e(MenuC0168m menuC0168m) {
        Toolbar toolbar = this.f2946a;
        C0232k c0232k = toolbar.f1225a.f1189t;
        if (c0232k == null || !c0232k.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1214G.f414c).iterator();
            while (it.hasNext()) {
                ((X.B) it.next()).f791a.s();
            }
        }
    }

    @Override // k.InterfaceC0166k
    public boolean f(MenuC0168m menuC0168m, MenuItem menuItem) {
        this.f2946a.getClass();
        return false;
    }
}
