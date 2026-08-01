package androidx.appcompat.view.menu;

import K.C0019l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.C0204o;
import k.InterfaceC0185A;
import k.InterfaceC0201l;
import k.MenuC0202m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0201l, InterfaceC0185A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1652b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0202m f1653a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0019l i = C0019l.i(context, attributeSet, f1652b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) i.f684b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(i.c(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(i.c(1));
        }
        i.k();
    }

    @Override // k.InterfaceC0201l
    public final boolean b(C0204o c0204o) {
        return this.f1653a.q(c0204o, null, 0);
    }

    @Override // k.InterfaceC0185A
    public final void c(MenuC0202m menuC0202m) {
        this.f1653a = menuC0202m;
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
        b((C0204o) getAdapter().getItem(i));
    }
}
