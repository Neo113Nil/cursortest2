package com.my.target;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class e5 extends RecyclerView.ItemDecoration {
    private final int a;

    public e5(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        u1 u1Var = (u1) recyclerView.getAdapter();
        if (u1Var == null) {
            return;
        }
        int itemCount = u1Var.getItemCount();
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.right = this.a;
        } else {
            if (recyclerView.getChildAdapterPosition(view) == itemCount - 1) {
                rect.left = this.a;
                return;
            }
            int i = this.a;
            rect.right = i;
            rect.left = i;
        }
    }
}
