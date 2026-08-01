package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.lt;
import defpackage.rs;
import defpackage.ss;
import defpackage.vs;
import defpackage.y5;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements rs, lt, AdapterView.OnItemClickListener {
    public static final int[] g = {R.attr.background, R.attr.divider};
    public ss f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        y5 l = y5.l(R.attr.listViewStyle, 0, context, attributeSet, g);
        TypedArray typedArray = (TypedArray) l.a;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(l.f(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(l.f(1));
        }
        l.n();
    }

    @Override // defpackage.rs
    public final boolean a(vs vsVar) {
        return this.f.q(vsVar, null, 0);
    }

    @Override // defpackage.lt
    public final void b(ss ssVar) {
        this.f = ssVar;
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
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((vs) getAdapter().getItem(i));
    }
}
