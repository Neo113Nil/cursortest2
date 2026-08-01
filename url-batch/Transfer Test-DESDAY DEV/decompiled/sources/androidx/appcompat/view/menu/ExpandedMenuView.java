package androidx.appcompat.view.menu;

import K.C0014m;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.C0166o;
import k.InterfaceC0147A;
import k.InterfaceC0163l;
import k.MenuC0164m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0163l, InterfaceC0147A, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1263b = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    public MenuC0164m f1264a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0014m i = C0014m.i(context, attributeSet, f1263b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) i.f425b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(i.c(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(i.c(1));
        }
        i.k();
    }

    @Override // k.InterfaceC0163l
    public final boolean b(C0166o c0166o) {
        return this.f1264a.q(c0166o, null, 0);
    }

    @Override // k.InterfaceC0147A
    public final void c(MenuC0164m menuC0164m) {
        this.f1264a = menuC0164m;
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
        b((C0166o) getAdapter().getItem(i));
    }
}
