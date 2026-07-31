package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.widget.FixedLineHeightHelper;
import com.yandex.div.core.widget.FixedLineHeightView;
import com.yandex.div.core.widget.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SuperLineHeightTextView.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0014J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%H\u0016R+\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8V@VX\u0096\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011*\u0004\b\f\u0010\rR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0015\u0010\u001a\u001a\u00020\b8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000f¨\u0006&"}, d2 = {"Lcom/yandex/div/internal/widget/SuperLineHeightTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/yandex/div/core/widget/FixedLineHeightView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "fixedLineHeight", "getFixedLineHeight$delegate", "(Lcom/yandex/div/internal/widget/SuperLineHeightTextView;)Ljava/lang/Object;", "getFixedLineHeight", "()I", "setFixedLineHeight", "(I)V", "fixedLineHeightHelper", "Lcom/yandex/div/core/widget/FixedLineHeightHelper;", "value", "", "isTightenWidth", "()Z", "setTightenWidth", "(Z)V", "visibleLineCount", "getVisibleLineCount", "getCompoundPaddingBottom", "getCompoundPaddingTop", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setTextSize", "unit", "size", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public class SuperLineHeightTextView extends AppCompatTextView implements FixedLineHeightView {

    @NotNull
    private final FixedLineHeightHelper fixedLineHeightHelper;
    private boolean isTightenWidth;

    public SuperLineHeightTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public SuperLineHeightTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    public /* synthetic */ SuperLineHeightTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SuperLineHeightTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fixedLineHeightHelper = new FixedLineHeightHelper(this);
    }

    private final int getVisibleLineCount() {
        return Math.min(getLineCount(), getMaxLines());
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public int getFixedLineHeight() {
        return this.fixedLineHeightHelper.getLineHeight();
    }

    @Override // com.yandex.div.core.widget.FixedLineHeightView
    public void setFixedLineHeight(int i) {
        this.fixedLineHeightHelper.setLineHeight(i);
    }

    /* renamed from: isTightenWidth, reason: from getter */
    public final boolean getIsTightenWidth() {
        return this.isTightenWidth;
    }

    public final void setTightenWidth(boolean z) {
        boolean z2 = this.isTightenWidth;
        this.isTightenWidth = z;
        if (z2 != z) {
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int unit, float size) {
        super.setTextSize(unit, size);
        this.fixedLineHeightHelper.onFontSizeChanged();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int makeExactSpec;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        FixedLineHeightHelper fixedLineHeightHelper = this.fixedLineHeightHelper;
        int min = Math.min(getLineCount(), getMaxLines());
        if (fixedLineHeightHelper.getLineHeight() != -1 && !ViewsKt.isExact(heightMeasureSpec)) {
            int coerceAtLeast = RangesKt.coerceAtLeast(TextViewsKt.textHeight(fixedLineHeightHelper.view, min) + (min >= fixedLineHeightHelper.view.getLineCount() ? fixedLineHeightHelper.textPaddingTop + fixedLineHeightHelper.textPaddingBottom : 0) + fixedLineHeightHelper.view.getPaddingTop() + fixedLineHeightHelper.view.getPaddingBottom(), fixedLineHeightHelper.view.getMinimumHeight());
            if (View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE) {
                makeExactSpec = ViewsKt.makeAtMostSpec(Math.min(coerceAtLeast, View.MeasureSpec.getSize(heightMeasureSpec)));
            } else {
                makeExactSpec = ViewsKt.makeExactSpec(coerceAtLeast);
            }
            super.setMeasuredDimension(getMeasuredWidthAndState(), makeExactSpec);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams != null && this.isTightenWidth && ((ViewGroup.MarginLayoutParams) divLayoutParams).width == -3 && divLayoutParams.getMaxWidth() != Integer.MAX_VALUE) {
            int lineCount = getLayout().getLineCount();
            float f = 0.0f;
            for (int i = 0; i < lineCount; i++) {
                f = Math.max(f, getLayout().getLineWidth(i));
            }
            int ceil = (int) Math.ceil(f + getCompoundPaddingLeft() + getCompoundPaddingRight());
            if (ceil < getMeasuredWidth()) {
                super.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(ceil, View.MeasureSpec.getMode(getMeasuredWidthAndState())), getMeasuredHeightAndState());
            }
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.fixedLineHeightHelper.getTextPaddingTop();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.fixedLineHeightHelper.getTextPaddingBottom();
    }
}
