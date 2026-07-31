package io.bidmachine.util;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewShowState.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/bidmachine/util/ViewShowState;", "", "()V", "index", "", "layoutParams", "Landroid/view/ViewGroup$LayoutParams;", "weakParent", "Ljava/lang/ref/WeakReference;", "Landroid/view/ViewGroup;", "clear", "", "restoreViewShowState", "view", "Landroid/view/View;", "saveViewShowState", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewShowState {
    private int index = -1;

    @Nullable
    private ViewGroup.LayoutParams layoutParams;

    @Nullable
    private WeakReference<ViewGroup> weakParent;

    public final void saveViewShowState(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        this.weakParent = new WeakReference<>(viewGroup);
        this.layoutParams = view.getLayoutParams();
        viewGroup.indexOfChild(view);
    }

    public final void restoreViewShowState(@NotNull View view) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(view, "view");
        WeakReference<ViewGroup> weakReference = this.weakParent;
        if (weakReference != null && (viewGroup = weakReference.get()) != null) {
            ViewUtilsKt.addViewSafely(viewGroup, view, this.index, this.layoutParams);
        }
        clear();
    }

    public final void clear() {
        WeakReference<ViewGroup> weakReference = this.weakParent;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.weakParent = null;
        this.layoutParams = null;
        this.index = -1;
    }
}
