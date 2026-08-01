package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0101b;
import g.DialogInterfaceC0105f;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160i implements InterfaceC0176y, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2745a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2746b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC0164m f2747c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0175x f2748e;

    /* renamed from: f, reason: collision with root package name */
    public C0159h f2749f;

    public C0160i(ContextWrapper contextWrapper) {
        this.f2745a = contextWrapper;
        this.f2746b = LayoutInflater.from(contextWrapper);
    }

    @Override // k.InterfaceC0176y
    public final void b(MenuC0164m menuC0164m, boolean z2) {
        InterfaceC0175x interfaceC0175x = this.f2748e;
        if (interfaceC0175x != null) {
            interfaceC0175x.b(menuC0164m, z2);
        }
    }

    @Override // k.InterfaceC0176y
    public final void c() {
        C0159h c0159h = this.f2749f;
        if (c0159h != null) {
            c0159h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0176y
    public final boolean d(C0166o c0166o) {
        return false;
    }

    @Override // k.InterfaceC0176y
    public final boolean f(SubMenuC0151E subMenuC0151E) {
        if (!subMenuC0151E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0165n dialogInterfaceOnKeyListenerC0165n = new DialogInterfaceOnKeyListenerC0165n();
        dialogInterfaceOnKeyListenerC0165n.f2777a = subMenuC0151E;
        Context context = subMenuC0151E.f2756a;
        H.j jVar = new H.j(context);
        C0101b c0101b = (C0101b) jVar.f236b;
        C0160i c0160i = new C0160i(c0101b.f2207a);
        dialogInterfaceOnKeyListenerC0165n.f2779c = c0160i;
        c0160i.f2748e = dialogInterfaceOnKeyListenerC0165n;
        subMenuC0151E.b(c0160i, context);
        C0160i c0160i2 = dialogInterfaceOnKeyListenerC0165n.f2779c;
        if (c0160i2.f2749f == null) {
            c0160i2.f2749f = new C0159h(c0160i2);
        }
        c0101b.f2212g = c0160i2.f2749f;
        c0101b.h = dialogInterfaceOnKeyListenerC0165n;
        View view = subMenuC0151E.f2767o;
        if (view != null) {
            c0101b.f2210e = view;
        } else {
            c0101b.f2209c = subMenuC0151E.f2766n;
            c0101b.d = subMenuC0151E.f2765m;
        }
        c0101b.f2211f = dialogInterfaceOnKeyListenerC0165n;
        DialogInterfaceC0105f b2 = jVar.b();
        dialogInterfaceOnKeyListenerC0165n.f2778b = b2;
        b2.setOnDismissListener(dialogInterfaceOnKeyListenerC0165n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0165n.f2778b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0165n.f2778b.show();
        InterfaceC0175x interfaceC0175x = this.f2748e;
        if (interfaceC0175x == null) {
            return true;
        }
        interfaceC0175x.g(subMenuC0151E);
        return true;
    }

    @Override // k.InterfaceC0176y
    public final void g(InterfaceC0175x interfaceC0175x) {
        throw null;
    }

    @Override // k.InterfaceC0176y
    public final boolean h(C0166o c0166o) {
        return false;
    }

    @Override // k.InterfaceC0176y
    public final void j(Context context, MenuC0164m menuC0164m) {
        if (this.f2745a != null) {
            this.f2745a = context;
            if (this.f2746b == null) {
                this.f2746b = LayoutInflater.from(context);
            }
        }
        this.f2747c = menuC0164m;
        C0159h c0159h = this.f2749f;
        if (c0159h != null) {
            c0159h.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0176y
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        this.f2747c.q(this.f2749f.getItem(i), this, 0);
    }
}
