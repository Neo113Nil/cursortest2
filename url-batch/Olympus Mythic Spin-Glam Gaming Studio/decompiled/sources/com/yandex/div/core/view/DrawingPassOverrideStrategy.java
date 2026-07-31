package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.div.core.annotations.InternalApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawingPassOverrideStrategy.kt */
@InternalApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "", "overrideDrawingPass", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "proceed", "NoOp", "Safe", "div-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DrawingPassOverrideStrategy {
    boolean overrideDrawingPass(@NotNull ViewTreeObserver.OnPreDrawListener listener, boolean proceed);

    /* compiled from: DrawingPassOverrideStrategy.kt */
    @InternalApi
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/yandex/div/core/view/DrawingPassOverrideStrategy$NoOp;", "Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "()V", "overrideDrawingPass", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "proceed", "div-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NoOp implements DrawingPassOverrideStrategy {

        @NotNull
        public static final NoOp INSTANCE = new NoOp();

        @Override // com.yandex.div.core.view.DrawingPassOverrideStrategy
        public boolean overrideDrawingPass(@NotNull ViewTreeObserver.OnPreDrawListener listener, boolean proceed) {
            return proceed;
        }

        private NoOp() {
        }
    }

    /* compiled from: DrawingPassOverrideStrategy.kt */
    @InternalApi
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view/DrawingPassOverrideStrategy$Safe;", "Lcom/yandex/div/core/view/SafeDrawingPassOverrideStrategy;", "()V", "div-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Safe extends SafeDrawingPassOverrideStrategy {

        @NotNull
        public static final Safe INSTANCE = new Safe();

        private Safe() {
        }
    }
}
