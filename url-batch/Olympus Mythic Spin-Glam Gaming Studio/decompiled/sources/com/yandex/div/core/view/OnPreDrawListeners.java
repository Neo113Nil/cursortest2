package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import com.yandex.div.core.annotations.InternalApi;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: OnPreDrawListeners.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¨\u0006\b"}, d2 = {"onPreDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "overrideStrategy", "Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "action", "Lkotlin/Function0;", "", "delegate", "div-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OnPreDrawListeners {
    public static /* synthetic */ ViewTreeObserver.OnPreDrawListener onPreDrawListener$default(DrawingPassOverrideStrategy drawingPassOverrideStrategy, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            drawingPassOverrideStrategy = DrawingPassOverrideStrategy.Safe.INSTANCE;
        }
        return onPreDrawListener(drawingPassOverrideStrategy, function0);
    }

    @InternalApi
    @NotNull
    public static final ViewTreeObserver.OnPreDrawListener onPreDrawListener(@NotNull DrawingPassOverrideStrategy drawingPassOverrideStrategy, @NotNull final Function0 function0) {
        return new OverridableOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.div.core.view.OnPreDrawListeners$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean onPreDrawListener$lambda$0;
                onPreDrawListener$lambda$0 = OnPreDrawListeners.onPreDrawListener$lambda$0(Function0.this);
                return onPreDrawListener$lambda$0;
            }
        }, drawingPassOverrideStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPreDrawListener$lambda$0(Function0 function0) {
        return ((Boolean) function0.mo4828invoke()).booleanValue();
    }

    public static /* synthetic */ ViewTreeObserver.OnPreDrawListener onPreDrawListener$default(DrawingPassOverrideStrategy drawingPassOverrideStrategy, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i, Object obj) {
        if ((i & 1) != 0) {
            drawingPassOverrideStrategy = DrawingPassOverrideStrategy.Safe.INSTANCE;
        }
        return onPreDrawListener(drawingPassOverrideStrategy, onPreDrawListener);
    }

    @InternalApi
    @NotNull
    public static final ViewTreeObserver.OnPreDrawListener onPreDrawListener(@NotNull DrawingPassOverrideStrategy drawingPassOverrideStrategy, @NotNull ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        return new OverridableOnPreDrawListener(onPreDrawListener, drawingPassOverrideStrategy);
    }
}
