package com.my.target;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class j4 extends RecyclerView.ItemDecoration {
    private final int a;

    public j4(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        d4 d4Var = (d4) recyclerView.getAdapter();
        if (d4Var == null) {
            return;
        }
        int itemCount = d4Var.getItemCount();
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            int i = this.a;
            rect.left = i;
            rect.right = i / 2;
        } else if (recyclerView.getChildAdapterPosition(view) == itemCount - 1) {
            int i2 = this.a;
            rect.right = i2;
            rect.left = i2 / 2;
        } else {
            int i3 = this.a / 2;
            rect.right = i3;
            rect.left = i3;
        }
    }
}
