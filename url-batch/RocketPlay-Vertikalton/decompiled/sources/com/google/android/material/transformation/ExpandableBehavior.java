package com.google.android.material.transformation;

import K.T;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x.AbstractC0379a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC0379a {
    public ExpandableBehavior() {
    }

    @Override // x.AbstractC0379a
    public abstract void b(View view);

    @Override // x.AbstractC0379a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // x.AbstractC0379a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = T.f633a;
        if (!view.isLaidOut()) {
            ArrayList j2 = coordinatorLayout.j(view);
            int size = j2.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
