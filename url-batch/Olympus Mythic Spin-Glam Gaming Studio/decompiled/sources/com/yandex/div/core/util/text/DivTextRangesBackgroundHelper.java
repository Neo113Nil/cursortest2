package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTextRangeBackground;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTextRangesBackgroundHelper.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0019H\u0000¢\u0006\u0002\b J\u001e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(J\r\u0010)\u001a\u00020\u001eH\u0000¢\u0006\u0002\b*J-\u0010+\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0002\b1J\r\u00102\u001a\u00020\"H\u0000¢\u0006\u0002\b3R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0015\u0010\u0010R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lcom/yandex/div/core/util/text/DivTextRangesBackgroundHelper;", "", "view", "Landroid/view/View;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "(Landroid/view/View;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "cloudBackgroundRenderer", "Lcom/yandex/div/core/util/text/CloudTextRangeBackgroundRenderer;", "getCloudBackgroundRenderer", "()Lcom/yandex/div/core/util/text/CloudTextRangeBackgroundRenderer;", "cloudBackgroundRenderer$delegate", "Lkotlin/Lazy;", "multiLineRenderer", "Lcom/yandex/div/core/util/text/DivTextRangesBackgroundRenderer;", "getMultiLineRenderer", "()Lcom/yandex/div/core/util/text/DivTextRangesBackgroundRenderer;", "multiLineRenderer$delegate", "getResolver", "()Lcom/yandex/div/json/expressions/ExpressionResolver;", "singleLineRenderer", "getSingleLineRenderer", "singleLineRenderer$delegate", "spans", "Ljava/util/ArrayList;", "Lcom/yandex/div/core/util/text/DivBackgroundSpan;", "Lkotlin/collections/ArrayList;", "getView", "()Landroid/view/View;", "addBackgroundSpan", "", "span", "addBackgroundSpan$div_release", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "Landroid/text/Spanned;", "layout", "Landroid/text/Layout;", "hasBackgroundSpan", "hasBackgroundSpan$div_release", "hasSameSpan", "", "backgroundSpan", "start", "", "end", "hasSameSpan$div_release", "invalidateSpansCache", "invalidateSpansCache$div_release", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DivTextRangesBackgroundHelper {

    @NotNull
    private final ExpressionResolver resolver;

    @NotNull
    private final View view;

    @NotNull
    private ArrayList<DivBackgroundSpan> spans = new ArrayList<>();

    /* renamed from: singleLineRenderer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy singleLineRenderer = LazyKt.lazy(new Function0() { // from class: com.yandex.div.core.util.text.DivTextRangesBackgroundHelper$singleLineRenderer$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final SingleLineRenderer mo4828invoke() {
            return new SingleLineRenderer(DivTextRangesBackgroundHelper.this.getView(), DivTextRangesBackgroundHelper.this.getResolver());
        }
    });

    /* renamed from: multiLineRenderer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy multiLineRenderer = LazyKt.lazy(new Function0() { // from class: com.yandex.div.core.util.text.DivTextRangesBackgroundHelper$multiLineRenderer$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final MultiLineRenderer mo4828invoke() {
            return new MultiLineRenderer(DivTextRangesBackgroundHelper.this.getView(), DivTextRangesBackgroundHelper.this.getResolver());
        }
    });

    /* renamed from: cloudBackgroundRenderer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cloudBackgroundRenderer = LazyKt.lazy(new Function0() { // from class: com.yandex.div.core.util.text.DivTextRangesBackgroundHelper$cloudBackgroundRenderer$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final CloudTextRangeBackgroundRenderer mo4828invoke() {
            return new CloudTextRangeBackgroundRenderer(DivTextRangesBackgroundHelper.this.getView().getContext(), DivTextRangesBackgroundHelper.this.getResolver());
        }
    });

    public DivTextRangesBackgroundHelper(@NotNull View view, @NotNull ExpressionResolver expressionResolver) {
        this.view = view;
        this.resolver = expressionResolver;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @NotNull
    public final ExpressionResolver getResolver() {
        return this.resolver;
    }

    public final void invalidateSpansCache$div_release() {
        this.spans.clear();
    }

    public final boolean addBackgroundSpan$div_release(@NotNull DivBackgroundSpan span) {
        return this.spans.add(span);
    }

    public final boolean hasBackgroundSpan$div_release() {
        return !this.spans.isEmpty();
    }

    public final boolean hasSameSpan$div_release(@NotNull CharSequence text, @NotNull DivBackgroundSpan backgroundSpan, int start, int end) {
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return false;
        }
        ArrayList<DivBackgroundSpan> arrayList = this.spans;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (DivBackgroundSpan divBackgroundSpan : arrayList) {
            if (Intrinsics.areEqual(divBackgroundSpan.getBorder(), backgroundSpan.getBorder()) && Intrinsics.areEqual(divBackgroundSpan.getBackground(), backgroundSpan.getBackground()) && end == spannable.getSpanEnd(divBackgroundSpan) && start == spannable.getSpanStart(divBackgroundSpan)) {
                return true;
            }
        }
        return false;
    }

    private final DivTextRangesBackgroundRenderer getSingleLineRenderer() {
        return (DivTextRangesBackgroundRenderer) this.singleLineRenderer.getValue();
    }

    private final DivTextRangesBackgroundRenderer getMultiLineRenderer() {
        return (DivTextRangesBackgroundRenderer) this.multiLineRenderer.getValue();
    }

    private final CloudTextRangeBackgroundRenderer getCloudBackgroundRenderer() {
        return (CloudTextRangeBackgroundRenderer) this.cloudBackgroundRenderer.getValue();
    }

    public final void draw(@NotNull Canvas canvas, @NotNull Spanned text, @NotNull Layout layout) {
        for (DivBackgroundSpan divBackgroundSpan : this.spans) {
            int spanStart = text.getSpanStart(divBackgroundSpan);
            int spanEnd = text.getSpanEnd(divBackgroundSpan);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            int primaryHorizontal = (int) layout.getPrimaryHorizontal(spanStart);
            int primaryHorizontal2 = (int) layout.getPrimaryHorizontal(spanEnd);
            if (divBackgroundSpan.getBackground() instanceof DivTextRangeBackground.Cloud) {
                getCloudBackgroundRenderer().draw(canvas, layout, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2, divBackgroundSpan.getBorder(), divBackgroundSpan.getBackground());
            } else {
                (lineForOffset == lineForOffset2 ? getSingleLineRenderer() : getMultiLineRenderer()).draw(canvas, layout, lineForOffset, lineForOffset2, primaryHorizontal, primaryHorizontal2, divBackgroundSpan.getBorder(), divBackgroundSpan.getBackground());
            }
        }
    }
}
