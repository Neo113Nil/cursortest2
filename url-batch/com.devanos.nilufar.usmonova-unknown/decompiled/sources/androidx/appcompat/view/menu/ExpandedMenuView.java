package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import o.C0950e6;
import o.C1284jC;
import o.InterfaceC0760bC;
import o.InterfaceC2339zC;
import o.MenuC0825cC;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0760bC, InterfaceC2339zC, AdapterView.OnItemClickListener {
    public static final int[] i = {R.attr.background, R.attr.divider};
    public MenuC0825cC h;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0950e6 F = C0950e6.F(context, attributeSet, i, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) F.i;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(F.x(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(F.x(1));
        }
        F.L();
    }

    @Override // o.InterfaceC2339zC
    public final void a(MenuC0825cC menuC0825cC) {
        this.h = menuC0825cC;
    }

    @Override // o.InterfaceC0760bC
    public final boolean b(C1284jC c1284jC) {
        return this.h.q(c1284jC, null, 0);
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
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
        b((C1284jC) getAdapter().getItem(i2));
    }
}
