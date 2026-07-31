package com.yandex.div.core.widget;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.yandex.div.core.timer.TimerController;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view.OnPreDrawListeners;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdaptiveMaxLines.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0006\u0010\u0015\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/widget/AdaptiveMaxLines;", "", "textView", "Landroid/widget/TextView;", "drawingPassOverrideStrategy", "Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "(Landroid/widget/TextView;Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;)V", "isAdaptLinesRequested", "", "params", "Lcom/yandex/div/core/widget/AdaptiveMaxLines$Params;", "preDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "viewAttachListener", "Landroid/view/View$OnAttachStateChangeListener;", "addAttachListener", "", "addPreDrawListener", "apply", "removeAttachListener", "removePreDrawListener", TimerController.RESET_COMMAND, "Params", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AdaptiveMaxLines {

    @NotNull
    private final DrawingPassOverrideStrategy drawingPassOverrideStrategy;
    private boolean isAdaptLinesRequested;

    @Nullable
    private Params params;

    @Nullable
    private ViewTreeObserver.OnPreDrawListener preDrawListener;

    @NotNull
    private final TextView textView;

    @Nullable
    private View.OnAttachStateChangeListener viewAttachListener;

    public AdaptiveMaxLines(@NotNull TextView textView, @NotNull DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.textView = textView;
        this.drawingPassOverrideStrategy = drawingPassOverrideStrategy;
    }

    public final void apply(@NotNull Params params) {
        if (Intrinsics.areEqual(this.params, params)) {
            return;
        }
        this.params = params;
        if (ViewCompat.isAttachedToWindow(this.textView)) {
            addPreDrawListener();
        }
        addAttachListener();
    }

    public final void reset() {
        removeAttachListener();
        removePreDrawListener();
    }

    private final void addAttachListener() {
        if (this.viewAttachListener != null) {
            return;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.widget.AdaptiveMaxLines$addAttachListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View v) {
                AdaptiveMaxLines.this.addPreDrawListener();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View v) {
                AdaptiveMaxLines.this.removePreDrawListener();
            }
        };
        this.textView.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.viewAttachListener = onAttachStateChangeListener;
    }

    private final void removeAttachListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.viewAttachListener;
        if (onAttachStateChangeListener != null) {
            this.textView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.viewAttachListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addPreDrawListener() {
        if (this.preDrawListener != null) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = OnPreDrawListeners.onPreDrawListener(this.drawingPassOverrideStrategy, new Function0() { // from class: com.yandex.div.core.widget.AdaptiveMaxLines$addPreDrawListener$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Boolean mo4828invoke() {
                AdaptiveMaxLines.Params params;
                TextView textView;
                boolean z;
                TextView textView2;
                TextView textView3;
                TextView textView4;
                params = AdaptiveMaxLines.this.params;
                if (params == null) {
                    return Boolean.TRUE;
                }
                textView = AdaptiveMaxLines.this.textView;
                if (!TextUtils.isEmpty(textView.getText())) {
                    z = AdaptiveMaxLines.this.isAdaptLinesRequested;
                    boolean z2 = false;
                    if (z) {
                        AdaptiveMaxLines.this.removePreDrawListener();
                        AdaptiveMaxLines.this.isAdaptLinesRequested = false;
                        return Boolean.TRUE;
                    }
                    textView2 = AdaptiveMaxLines.this.textView;
                    Integer num = textView2.getLineCount() > params.getTotalVisibleLines() ? null : Integer.MAX_VALUE;
                    int intValue = num != null ? num.intValue() : params.getMaxLines();
                    textView3 = AdaptiveMaxLines.this.textView;
                    if (intValue != textView3.getMaxLines()) {
                        textView4 = AdaptiveMaxLines.this.textView;
                        textView4.setMaxLines(intValue);
                        AdaptiveMaxLines.this.isAdaptLinesRequested = true;
                    } else {
                        AdaptiveMaxLines.this.removePreDrawListener();
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
                return Boolean.TRUE;
            }
        });
        this.textView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
        this.preDrawListener = onPreDrawListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePreDrawListener() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.preDrawListener;
        if (onPreDrawListener != null) {
            this.textView.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
        this.preDrawListener = null;
    }

    /* compiled from: AdaptiveMaxLines.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/widget/AdaptiveMaxLines$Params;", "", "maxLines", "", "minHiddenLines", "(II)V", "getMaxLines", "()I", "getMinHiddenLines", "totalVisibleLines", "getTotalVisibleLines", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Params {
        private final int maxLines;
        private final int minHiddenLines;

        public static /* synthetic */ Params copy$default(Params params, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = params.maxLines;
            }
            if ((i3 & 2) != 0) {
                i2 = params.minHiddenLines;
            }
            return params.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMaxLines() {
            return this.maxLines;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMinHiddenLines() {
            return this.minHiddenLines;
        }

        @NotNull
        public final Params copy(int maxLines, int minHiddenLines) {
            return new Params(maxLines, minHiddenLines);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.maxLines == params.maxLines && this.minHiddenLines == params.minHiddenLines;
        }

        public int hashCode() {
            return (Integer.hashCode(this.maxLines) * 31) + Integer.hashCode(this.minHiddenLines);
        }

        @NotNull
        public String toString() {
            return "Params(maxLines=" + this.maxLines + ", minHiddenLines=" + this.minHiddenLines + ')';
        }

        public Params(int i, int i2) {
            this.maxLines = i;
            this.minHiddenLines = i2;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public final int getMinHiddenLines() {
            return this.minHiddenLines;
        }

        public final int getTotalVisibleLines() {
            return this.maxLines + this.minHiddenLines;
        }
    }
}
