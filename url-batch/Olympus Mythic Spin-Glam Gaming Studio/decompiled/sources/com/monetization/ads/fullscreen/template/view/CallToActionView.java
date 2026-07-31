package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.mobile.ads.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.o63;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/CallToActionView;", "Landroid/widget/Button;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "Landroid/widget/TextView$BufferType;", "type", "", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CallToActionView extends Button {
    private String a;

    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public final void a() {
        setSpannableFactory(Spannable.Factory.getInstance());
        setText(this.a);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.TextView
    public final CharSequence getText() {
        return this.a;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.widget.TextView
    public void setText(@NotNull CharSequence text, @NotNull TextView.BufferType type) {
        if (text instanceof String) {
            this.a = (String) text;
        }
        super.setText(this.a, TextView.BufferType.SPANNABLE);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CallToActionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalIconButton, i, 0);
            int resourceId = obtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalIconButton_monetization_internal_icon, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_size, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_offset, 0);
            obtainStyledAttributes.recycle();
            r0 = resourceId != 0 ? ContextCompat.getDrawable(context, resourceId) : null;
            i2 = dimensionPixelSize2;
            i3 = dimensionPixelSize;
        } else {
            i2 = 0;
        }
        setSpannableFactory(new o63(r0, i3, i2));
    }
}
