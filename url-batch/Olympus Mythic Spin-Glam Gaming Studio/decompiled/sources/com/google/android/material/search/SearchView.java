package com.google.android.material.search;

import android.content.Context;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes6.dex */
public abstract class SearchView extends FrameLayout implements CoordinatorLayout.AttachedBehavior {

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(view);
            return onDependentViewChanged(coordinatorLayout, (SearchView) null, view2);
        }

        public Behavior() {
        }

        public Behavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            throw null;
        }
    }
}
