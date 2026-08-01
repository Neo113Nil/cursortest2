package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ionia.reidopitaco.libya.R;
import defpackage.iw;
import defpackage.kd;
import defpackage.o4;
import defpackage.tt;
import java.util.HashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public HashMap i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void r(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof kd) && (((kd) childAt.getLayoutParams()).a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    HashMap hashMap = this.i;
                    if (z) {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else if (hashMap != null && hashMap.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.i.get(childAt)).intValue());
                    }
                }
            }
            if (!z) {
                this.i = null;
            }
        }
        super.r(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final o4 y(Context context, boolean z) {
        int i = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        o4 o4Var = new o4(14, false);
        o4Var.g = tt.b(context, i);
        o4Var.h = new iw(2);
        return o4Var;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
