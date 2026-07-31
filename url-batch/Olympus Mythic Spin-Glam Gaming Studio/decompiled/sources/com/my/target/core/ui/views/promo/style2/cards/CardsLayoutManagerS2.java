package com.my.target.core.ui.views.promo.style2.cards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.qi;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes10.dex */
public class CardsLayoutManagerS2 extends LinearLayoutManager {
    private a a;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    interface a {
        void a();
    }

    CardsLayoutManagerS2(Context context) {
        super(context, 0, false);
    }

    void a(a aVar) {
        this.a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(View view, int i, int i2) {
        int a2 = qi.a(10, view.getContext());
        if (getPosition(view) > 0) {
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin = a2;
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(((int) (getWidth() * 0.7f)) - a2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight > getHeight()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(((int) (getWidth() * (((getHeight() - (a2 * 2)) * 0.7f) / measuredHeight))) - a2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
