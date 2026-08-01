package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.hd;
import defpackage.hi;
import defpackage.ii;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends hd {
    public int a = 0;

    public ExpandableBehavior() {
    }

    @Override // defpackage.hd
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hd
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (ii) view2;
        boolean z = ((FloatingActionButton) obj).t.a;
        int i = this.a;
        if (z) {
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        boolean z2 = ((FloatingActionButton) obj).t.a;
        this.a = z2 ? 1 : 2;
        r((View) obj, view, z2, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hd
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        ii iiVar;
        if (!view.isLaidOut()) {
            ArrayList j = coordinatorLayout.j(view);
            int size = j.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    iiVar = null;
                    break;
                }
                View view2 = (View) j.get(i2);
                if (b(view, view2)) {
                    iiVar = (ii) view2;
                    break;
                }
                i2++;
            }
            if (iiVar != null) {
                boolean z = ((FloatingActionButton) iiVar).t.a;
                int i3 = this.a;
                if (!z ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                    int i4 = z ? 1 : 2;
                    this.a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new hi(this, view, i4, iiVar));
                }
            }
        }
        return false;
    }

    public abstract void r(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
