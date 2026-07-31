package com.my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
class y1 extends LinearLayoutManager {
    private final int a;
    private int b;
    private a c;
    private int d;
    private int e;
    private int f;
    private int g;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();
    }

    y1(Context context) {
        super(context, 0, false);
        this.a = qi.g(context).b(4);
    }

    public void a(a aVar) {
        this.c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(View view, int i, int i2) {
        int height = getHeight();
        int width = getWidth();
        if (height != this.g || width != this.f || this.d <= 0 || this.e <= 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
            float width2 = getWidth() / view.getMeasuredWidth();
            if (width2 > 1.0f) {
                this.d = (int) (width / (Math.floor(width2) + 0.5d));
            } else {
                this.d = (int) (width / 1.5f);
            }
            this.e = height;
            this.f = width;
            this.g = height;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (view != getChildAt(0)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = qi.a(this.b / 2, view.getContext());
        }
        if (view != getChildAt(getChildCount())) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = qi.a(this.b / 2, view.getContext());
        }
        int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(width, getWidthMode(), 0, this.d, canScrollHorizontally());
        int heightMode = getHeightMode();
        int i3 = this.a;
        view.measure(childMeasureSpec, RecyclerView.LayoutManager.getChildMeasureSpec(height, heightMode, i3, height - (i3 * 2), canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void a(int i) {
        this.b = i;
    }

    public boolean a(View view) {
        int findFirstCompletelyVisibleItemPosition = findFirstCompletelyVisibleItemPosition();
        int position = getPosition(view);
        return findFirstCompletelyVisibleItemPosition <= position && position <= findLastCompletelyVisibleItemPosition();
    }
}
