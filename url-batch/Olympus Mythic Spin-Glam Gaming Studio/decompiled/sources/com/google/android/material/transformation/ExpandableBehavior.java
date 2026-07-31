package com.google.android.material.transformation;

import android.content.Context;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;

@Deprecated
/* loaded from: classes9.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    private int currentState;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    public ExpandableBehavior() {
        this.currentState = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentState = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (ViewCompat.isLaidOut(view)) {
            return false;
        }
        findExpandableWidget(coordinatorLayout, view);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(view2);
        throw null;
    }

    protected ExpandableWidget findExpandableWidget(CoordinatorLayout coordinatorLayout, View view) {
        List dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) dependencies.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(view2);
                return null;
            }
        }
        return null;
    }
}
