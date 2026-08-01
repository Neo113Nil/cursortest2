package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0131b;
import g.DialogInterfaceC0135f;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164i implements InterfaceC0180y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2680a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2681b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0168m f2682c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0179x f2683e;

    /* renamed from: f, reason: collision with root package name */
    public C0163h f2684f;

    public C0164i(ContextWrapper contextWrapper) {
        this.f2680a = contextWrapper;
        this.f2681b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0180y
    public final void b(MenuC0168m menuC0168m, boolean z2) {
        InterfaceC0179x interfaceC0179x = this.f2683e;
        if (interfaceC0179x != null) {
            interfaceC0179x.b(menuC0168m, z2);
        }
    }

    @Override // k.InterfaceC0180y
    public final void c() {
        C0163h c0163h = this.f2684f;
        if (c0163h != null) {
            c0163h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0180y
    public final boolean d(C0170o c0170o) {
        return false;
    }

    @Override // k.InterfaceC0180y
    public final boolean e(SubMenuC0155E subMenuC0155E) {
        if (!subMenuC0155E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0169n dialogInterfaceOnKeyListenerC0169n = new DialogInterfaceOnKeyListenerC0169n();
        dialogInterfaceOnKeyListenerC0169n.f2712a = subMenuC0155E;
        Context context = subMenuC0155E.f2691a;
        H.j jVar = new H.j(context);
        C0131b c0131b = (C0131b) jVar.f221b;
        C0164i c0164i = new C0164i(c0131b.f2294a);
        dialogInterfaceOnKeyListenerC0169n.f2714c = c0164i;
        c0164i.f2683e = dialogInterfaceOnKeyListenerC0169n;
        subMenuC0155E.b(c0164i, context);
        C0164i c0164i2 = dialogInterfaceOnKeyListenerC0169n.f2714c;
        if (c0164i2.f2684f == null) {
            c0164i2.f2684f = new C0163h(c0164i2);
        }
        c0131b.f2299g = c0164i2.f2684f;
        c0131b.h = dialogInterfaceOnKeyListenerC0169n;
        View view = subMenuC0155E.f2702o;
        if (view != null) {
            c0131b.f2297e = view;
        } else {
            c0131b.f2296c = subMenuC0155E.f2701n;
            c0131b.d = subMenuC0155E.f2700m;
        }
        c0131b.f2298f = dialogInterfaceOnKeyListenerC0169n;
        DialogInterfaceC0135f a2 = jVar.a();
        dialogInterfaceOnKeyListenerC0169n.f2713b = a2;
        a2.setOnDismissListener(dialogInterfaceOnKeyListenerC0169n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0169n.f2713b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0169n.f2713b.show();
        InterfaceC0179x interfaceC0179x = this.f2683e;
        if (interfaceC0179x == null) {
            return true;
        }
        interfaceC0179x.f(subMenuC0155E);
        return true;
    }

    @Override // k.InterfaceC0180y
    public final void g(InterfaceC0179x interfaceC0179x) {
        throw null;
    }

    @Override // k.InterfaceC0180y
    public final boolean h(C0170o c0170o) {
        return false;
    }

    @Override // k.InterfaceC0180y
    public final void j(Context context, MenuC0168m menuC0168m) {
        if (this.f2680a != null) {
            this.f2680a = context;
            if (this.f2681b == null) {
                this.f2681b = LayoutInflater.from(context);
            }
        }
        this.f2682c = menuC0168m;
        C0163h c0163h = this.f2684f;
        if (c0163h != null) {
            c0163h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0180y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f2682c.q(this.f2684f.getItem(i), this, 0);
    }
}
