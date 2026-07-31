package com.my.target.core.ui.views.nativeslider;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.v4;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public class CardRecyclerLayoutManager extends LinearLayoutManager {
    private final float a;
    private a b;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();
    }

    public CardRecyclerLayoutManager(float f, Context context) {
        super(context, 0, false);
        this.a = v4.a(f, -1.0f) == 0 ? 0.75f : f;
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(View view, int i, int i2) {
        ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).width = (int) (getWidth() * this.a);
        super.measureChildWithMargins(view, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public boolean a(View view) {
        return findViewByPosition(findFirstCompletelyVisibleItemPosition()) == view;
    }
}
