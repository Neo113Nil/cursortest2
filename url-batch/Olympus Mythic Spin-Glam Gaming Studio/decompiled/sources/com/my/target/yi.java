package com.my.target;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class yi extends RecyclerView.ItemDecoration {
    private final int a;
    private final int b;

    public yi(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        rect.bottom = this.a;
        if (childAdapterPosition % 2 == 0) {
            rect.right = this.b;
        } else {
            rect.left = this.b;
        }
    }
}
