package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class cp implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ ViewTreeObserver.OnWindowVisibilityChangeListener c;

    public cp(ViewGroup viewGroup, ViewGroup viewGroup2, ViewTreeObserver.OnWindowVisibilityChangeListener onWindowVisibilityChangeListener) {
        this.a = viewGroup;
        this.b = viewGroup2;
        this.c = onWindowVisibilityChangeListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a.removeOnAttachStateChangeListener(this);
        this.b.getViewTreeObserver().removeOnWindowVisibilityChangeListener(this.c);
    }
}
