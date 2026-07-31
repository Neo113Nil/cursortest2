package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yandex.div.core.annotations.InternalApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: SafeDrawingPassOverrideStrategy.kt */
@InternalApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/view/SafeDrawingPassOverrideStrategy;", "Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "()V", "frameCancelCount", "", "value", "frameCancelLimit", "getFrameCancelLimit", "()I", "setFrameCancelLimit", "(I)V", "onFrameCancelLimitExceeded", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onFrameCancelled", "overrideDrawingPass", "", "proceed", "Companion", "div-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public class SafeDrawingPassOverrideStrategy implements DrawingPassOverrideStrategy {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int DEFAULT_FRAME_CANCEL_LIMIT = 3;
    private int frameCancelCount;
    private int frameCancelLimit = 3;

    protected void onFrameCancelLimitExceeded(@NotNull ViewTreeObserver.OnPreDrawListener listener, int frameCancelCount) {
    }

    protected void onFrameCancelled(@NotNull ViewTreeObserver.OnPreDrawListener listener, int frameCancelCount) {
    }

    public final int getFrameCancelLimit() {
        return this.frameCancelLimit;
    }

    public final void setFrameCancelLimit(int i) {
        if (this.frameCancelLimit != i) {
            this.frameCancelLimit = i;
            this.frameCancelCount = 0;
        }
    }

    @Override // com.yandex.div.core.view.DrawingPassOverrideStrategy
    public boolean overrideDrawingPass(@NotNull ViewTreeObserver.OnPreDrawListener listener, boolean proceed) {
        if (proceed) {
            this.frameCancelCount = 0;
            return true;
        }
        int i = this.frameCancelCount;
        int i2 = this.frameCancelLimit;
        if (i < i2) {
            int i3 = i + 1;
            this.frameCancelCount = i3;
            onFrameCancelled(listener, i3);
            return false;
        }
        if (i == i2) {
            int i4 = i + 1;
            this.frameCancelCount = i4;
            onFrameCancelLimitExceeded(listener, i4);
        }
        return true;
    }

    /* compiled from: SafeDrawingPassOverrideStrategy.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view/SafeDrawingPassOverrideStrategy$Companion;", "", "()V", "DEFAULT_FRAME_CANCEL_LIMIT", "", "div-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
