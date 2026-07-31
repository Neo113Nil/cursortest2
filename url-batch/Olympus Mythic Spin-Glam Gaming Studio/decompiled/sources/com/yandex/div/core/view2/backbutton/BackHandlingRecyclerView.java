package com.yandex.div.core.view2.backbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.view2.backbutton.BackKeyPressedHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BackHandlingRecyclerView.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0015J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\rH\u0017J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/core/view2/backbutton/BackHandlingRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/yandex/div/core/view2/backbutton/BackHandlingView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backKeyPressedHelper", "Lcom/yandex/div/core/view2/backbutton/BackKeyPressedHelper;", "onKeyPreIme", "", "keyCode", "event", "Landroid/view/KeyEvent;", "onVisibilityChanged", "", "changedView", "Landroid/view/View;", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "onWindowFocusChanged", "hasWindowFocus", "setOnBackClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/yandex/div/core/view2/backbutton/BackKeyPressedHelper$OnBackClickListener;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BackHandlingRecyclerView extends RecyclerView implements BackHandlingView {

    @NotNull
    private final BackKeyPressedHelper backKeyPressedHelper;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public /* synthetic */ BackHandlingRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public BackHandlingRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.backKeyPressedHelper = new BackKeyPressedHelper(this);
    }

    @Override // android.view.View
    @CallSuper
    public boolean onKeyPreIme(int keyCode, @NotNull KeyEvent event) {
        return this.backKeyPressedHelper.onKeyAction(keyCode, event) || super.onKeyPreIme(keyCode, event);
    }

    @Override // android.view.View
    @CallSuper
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        this.backKeyPressedHelper.onWindowFocusChanged(hasWindowFocus);
    }

    @Override // android.view.View
    @CallSuper
    protected void onVisibilityChanged(@NotNull View changedView, int visibility) {
        this.backKeyPressedHelper.onVisibilityChanged();
    }

    @Override // com.yandex.div.core.view2.backbutton.BackHandlingView
    public void setOnBackClickListener(@Nullable BackKeyPressedHelper.OnBackClickListener listener) {
        setDescendantFocusability(listener != null ? 131072 : 262144);
        this.backKeyPressedHelper.setOnBackClickListener(listener);
    }
}
