package com.yandex.div.core.view;

import android.annotation.SuppressLint;
import android.view.ViewTreeObserver;
import com.yandex.div.core.annotations.InternalApi;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: OnPreDrawListeners.kt */
@InternalApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/view/OverridableOnPreDrawListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "delegate", "overrideStrategy", "Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;)V", "onPreDraw", "", "div-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"OnPreDrawListenerIssue"})
/* loaded from: classes12.dex */
public final class OverridableOnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {

    @NotNull
    private final ViewTreeObserver.OnPreDrawListener delegate;

    @NotNull
    private final DrawingPassOverrideStrategy overrideStrategy;

    /* JADX WARN: Multi-variable type inference failed */
    public OverridableOnPreDrawListener(@NotNull ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(onPreDrawListener, null, 2, 0 == true ? 1 : 0);
    }

    public OverridableOnPreDrawListener(@NotNull ViewTreeObserver.OnPreDrawListener onPreDrawListener, @NotNull DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.delegate = onPreDrawListener;
        this.overrideStrategy = drawingPassOverrideStrategy;
    }

    public /* synthetic */ OverridableOnPreDrawListener(ViewTreeObserver.OnPreDrawListener onPreDrawListener, DrawingPassOverrideStrategy drawingPassOverrideStrategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onPreDrawListener, (i & 2) != 0 ? DrawingPassOverrideStrategy.Safe.INSTANCE : drawingPassOverrideStrategy);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        return this.overrideStrategy.overrideDrawingPass(this.delegate, this.delegate.onPreDraw());
    }
}
