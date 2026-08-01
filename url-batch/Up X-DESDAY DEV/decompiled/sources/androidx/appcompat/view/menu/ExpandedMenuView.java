package androidx.appcompat.view.menu;

import K.C0012l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.C0160o;
import k.InterfaceC0141A;
import k.InterfaceC0157l;
import k.MenuC0158m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0157l, InterfaceC0141A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1116b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0158m f1117a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0012l r2 = C0012l.r(context, attributeSet, f1116b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) r2.f432c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(r2.h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(r2.h(1));
        }
        r2.t();
    }

    @Override // k.InterfaceC0157l
    public final boolean b(C0160o c0160o) {
        return this.f1117a.q(c0160o, null, 0);
    }

    @Override // k.InterfaceC0141A
    public final void c(MenuC0158m menuC0158m) {
        this.f1117a = menuC0158m;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        b((C0160o) getAdapter().getItem(i));
    }
}
