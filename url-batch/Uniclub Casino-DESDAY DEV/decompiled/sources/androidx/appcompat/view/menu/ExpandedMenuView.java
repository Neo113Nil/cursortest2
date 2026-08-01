package androidx.appcompat.view.menu;

import K.C0011l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.C0170o;
import k.InterfaceC0151A;
import k.InterfaceC0167l;
import k.MenuC0168m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0167l, InterfaceC0151A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1118b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0168m f1119a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0011l r2 = C0011l.r(context, attributeSet, f1118b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) r2.f414c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(r2.h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(r2.h(1));
        }
        r2.t();
    }

    @Override // k.InterfaceC0167l
    public final boolean b(C0170o c0170o) {
        return this.f1119a.q(c0170o, null, 0);
    }

    @Override // k.InterfaceC0151A
    public final void c(MenuC0168m menuC0168m) {
        this.f1119a = menuC0168m;
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
        b((C0170o) getAdapter().getItem(i));
    }
}
