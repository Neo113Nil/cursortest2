package com.yandex.div.internal.widget;

import android.view.ViewTreeObserver;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view.OnPreDrawListeners;
import com.yandex.div.internal.KLog;
import com.yandex.div.logging.Severity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AutoEllipsizeHelper.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\b\u0010\u0016\u001a\u00020\u0013H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/internal/widget/AutoEllipsizeHelper;", "", "textView", "Lcom/yandex/div/internal/widget/EllipsizedTextView;", "(Lcom/yandex/div/internal/widget/EllipsizedTextView;)V", "drawingPassOverrideStrategy", "Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "getDrawingPassOverrideStrategy", "()Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "setDrawingPassOverrideStrategy", "(Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;)V", "isEnabled", "", "()Z", "setEnabled", "(Z)V", "preDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "addListener", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "removeListener", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AutoEllipsizeHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "AutoEllipsizeHelper";

    @NotNull
    private DrawingPassOverrideStrategy drawingPassOverrideStrategy = DrawingPassOverrideStrategy.Safe.INSTANCE;
    private boolean isEnabled;

    @Nullable
    private ViewTreeObserver.OnPreDrawListener preDrawListener;

    @NotNull
    private final EllipsizedTextView textView;

    public AutoEllipsizeHelper(@NotNull EllipsizedTextView ellipsizedTextView) {
        this.textView = ellipsizedTextView;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    @NotNull
    public final DrawingPassOverrideStrategy getDrawingPassOverrideStrategy() {
        return this.drawingPassOverrideStrategy;
    }

    public final void setDrawingPassOverrideStrategy(@NotNull DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.drawingPassOverrideStrategy = drawingPassOverrideStrategy;
    }

    public final void onViewAttachedToWindow() {
        if (this.isEnabled) {
            addListener();
        }
    }

    public final void onViewDetachedFromWindow() {
        removeListener();
    }

    private final void addListener() {
        if (this.preDrawListener != null) {
            return;
        }
        this.preDrawListener = OnPreDrawListeners.onPreDrawListener(this.drawingPassOverrideStrategy, new Function0() { // from class: com.yandex.div.internal.widget.AutoEllipsizeHelper$addListener$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Boolean mo4828invoke() {
                EllipsizedTextView ellipsizedTextView;
                boolean z;
                EllipsizedTextView ellipsizedTextView2;
                EllipsizedTextView ellipsizedTextView3;
                if (AutoEllipsizeHelper.this.getIsEnabled()) {
                    ellipsizedTextView = AutoEllipsizeHelper.this.textView;
                    int height = (ellipsizedTextView.getHeight() - ellipsizedTextView.getCompoundPaddingTop()) - ellipsizedTextView.getCompoundPaddingBottom();
                    int lineAt = TextViewsKt.lineAt(ellipsizedTextView, height);
                    int i = lineAt + 1;
                    if (height >= TextViewsKt.textHeight(ellipsizedTextView, i)) {
                        lineAt = i;
                    }
                    if (lineAt > 0) {
                        ellipsizedTextView2 = AutoEllipsizeHelper.this.textView;
                        if (lineAt < ellipsizedTextView2.getLineCount()) {
                            KLog kLog = KLog.INSTANCE;
                            if (kLog.isAtLeast(Severity.DEBUG)) {
                                kLog.print(3, AutoEllipsizeHelper.TAG, "Trying to set new max lines " + lineAt + ". Current drawing pass is canceled. ");
                            }
                            ellipsizedTextView3 = AutoEllipsizeHelper.this.textView;
                            ellipsizedTextView3.setMaxLines(lineAt);
                            z = false;
                            return Boolean.valueOf(z);
                        }
                    }
                    AutoEllipsizeHelper.this.removeListener();
                    z = true;
                    return Boolean.valueOf(z);
                }
                return Boolean.TRUE;
            }
        });
        this.textView.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeListener() {
        if (this.preDrawListener != null) {
            this.textView.getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
            this.preDrawListener = null;
        }
    }

    /* compiled from: AutoEllipsizeHelper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/internal/widget/AutoEllipsizeHelper$Companion;", "", "()V", "TAG", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
