package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: o.jA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1282jA implements InterfaceC2141wC, AdapterView.OnItemClickListener {
    public Context h;
    public LayoutInflater i;
    public MenuC0825cC j;
    public ExpandedMenuView k;
    public InterfaceC2075vC l;
    public C1218iA m;

    public C1282jA(ContextWrapper contextWrapper) {
        this.h = contextWrapper;
        this.i = LayoutInflater.from(contextWrapper);
    }

    @Override // o.InterfaceC2141wC
    public final void b(MenuC0825cC menuC0825cC, boolean z) {
        InterfaceC2075vC interfaceC2075vC = this.l;
        if (interfaceC2075vC != null) {
            interfaceC2075vC.b(menuC0825cC, z);
        }
    }

    @Override // o.InterfaceC2141wC
    public final void c() {
        C1218iA c1218iA = this.m;
        if (c1218iA != null) {
            c1218iA.notifyDataSetChanged();
        }
    }

    @Override // o.InterfaceC2141wC
    public final boolean e(C1284jC c1284jC) {
        return false;
    }

    @Override // o.InterfaceC2141wC
    public final void g(InterfaceC2075vC interfaceC2075vC) {
        throw null;
    }

    @Override // o.InterfaceC2141wC
    public final void h(Context context, MenuC0825cC menuC0825cC) {
        if (this.h != null) {
            this.h = context;
            if (this.i == null) {
                this.i = LayoutInflater.from(context);
            }
        }
        this.j = menuC0825cC;
        C1218iA c1218iA = this.m;
        if (c1218iA != null) {
            c1218iA.notifyDataSetChanged();
        }
    }

    @Override // o.InterfaceC2141wC
    public final boolean i() {
        return false;
    }

    @Override // o.InterfaceC2141wC
    public final boolean j(SubMenuC0909dU subMenuC0909dU) {
        boolean hasVisibleItems = subMenuC0909dU.hasVisibleItems();
        Context context = subMenuC0909dU.a;
        if (!hasVisibleItems) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0891dC dialogInterfaceOnKeyListenerC0891dC = new DialogInterfaceOnKeyListenerC0891dC();
        dialogInterfaceOnKeyListenerC0891dC.h = subMenuC0909dU;
        C1143h2 c1143h2 = new C1143h2(context);
        C0880d2 c0880d2 = (C0880d2) c1143h2.i;
        C1282jA c1282jA = new C1282jA(c0880d2.a);
        dialogInterfaceOnKeyListenerC0891dC.j = c1282jA;
        c1282jA.l = dialogInterfaceOnKeyListenerC0891dC;
        subMenuC0909dU.b(c1282jA, context);
        C1282jA c1282jA2 = dialogInterfaceOnKeyListenerC0891dC.j;
        if (c1282jA2.m == null) {
            c1282jA2.m = new C1218iA(c1282jA2);
        }
        c0880d2.g = c1282jA2.m;
        c0880d2.h = dialogInterfaceOnKeyListenerC0891dC;
        View view = subMenuC0909dU.f144o;
        if (view != null) {
            c0880d2.e = view;
        } else {
            c0880d2.c = subMenuC0909dU.n;
            c0880d2.d = subMenuC0909dU.m;
        }
        c0880d2.f = dialogInterfaceOnKeyListenerC0891dC;
        DialogInterfaceC1209i2 g = c1143h2.g();
        dialogInterfaceOnKeyListenerC0891dC.i = g;
        g.setOnDismissListener(dialogInterfaceOnKeyListenerC0891dC);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0891dC.i.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0891dC.i.show();
        InterfaceC2075vC interfaceC2075vC = this.l;
        if (interfaceC2075vC == null) {
            return true;
        }
        interfaceC2075vC.z(subMenuC0909dU);
        return true;
    }

    @Override // o.InterfaceC2141wC
    public final boolean k(C1284jC c1284jC) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.j.q(this.m.getItem(i), this, 0);
    }
}
