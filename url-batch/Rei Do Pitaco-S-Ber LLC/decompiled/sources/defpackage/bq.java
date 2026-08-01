package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class bq implements jt, AdapterView.OnItemClickListener {
    public Context f;
    public LayoutInflater g;
    public ss h;
    public ExpandedMenuView i;
    public ht j;
    public aq k;

    public bq(ContextWrapper contextWrapper) {
        this.f = contextWrapper;
        this.g = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.jt
    public final void a(ss ssVar, boolean z) {
        ht htVar = this.j;
        if (htVar != null) {
            htVar.a(ssVar, z);
        }
    }

    @Override // defpackage.jt
    public final boolean c(vs vsVar) {
        return false;
    }

    @Override // defpackage.jt
    public final void e(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.i.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // defpackage.jt
    public final void f(ht htVar) {
        throw null;
    }

    @Override // defpackage.jt
    public final boolean g(vs vsVar) {
        return false;
    }

    @Override // defpackage.jt
    public final int getId() {
        return 0;
    }

    @Override // defpackage.jt
    public final void i(Context context, ss ssVar) {
        if (this.f != null) {
            this.f = context;
            if (this.g == null) {
                this.g = LayoutInflater.from(context);
            }
        }
        this.h = ssVar;
        aq aqVar = this.k;
        if (aqVar != null) {
            aqVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.jt
    public final void j(boolean z) {
        aq aqVar = this.k;
        if (aqVar != null) {
            aqVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.jt
    public final boolean k(v30 v30Var) {
        boolean hasVisibleItems = v30Var.hasVisibleItems();
        Context context = v30Var.a;
        if (!hasVisibleItems) {
            return false;
        }
        ts tsVar = new ts();
        tsVar.f = v30Var;
        g2 g2Var = new g2(context);
        c2 c2Var = (c2) g2Var.g;
        bq bqVar = new bq(c2Var.a);
        tsVar.h = bqVar;
        bqVar.j = tsVar;
        v30Var.b(bqVar, context);
        bq bqVar2 = tsVar.h;
        if (bqVar2.k == null) {
            bqVar2.k = new aq(bqVar2);
        }
        c2Var.g = bqVar2.k;
        c2Var.h = tsVar;
        View view = v30Var.o;
        if (view != null) {
            c2Var.e = view;
        } else {
            c2Var.c = v30Var.n;
            c2Var.d = v30Var.m;
        }
        c2Var.f = tsVar;
        h2 b = g2Var.b();
        tsVar.g = b;
        b.setOnDismissListener(tsVar);
        WindowManager.LayoutParams attributes = tsVar.g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        tsVar.g.show();
        ht htVar = this.j;
        if (htVar == null) {
            return true;
        }
        htVar.v(v30Var);
        return true;
    }

    @Override // defpackage.jt
    public final boolean l() {
        return false;
    }

    @Override // defpackage.jt
    public final Parcelable m() {
        if (this.i == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.i;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.h.q(this.k.getItem(i), this, 0);
    }
}
