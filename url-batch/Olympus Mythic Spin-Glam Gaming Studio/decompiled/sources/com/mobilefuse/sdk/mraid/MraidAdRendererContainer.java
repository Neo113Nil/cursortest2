package com.mobilefuse.sdk.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C4643f8;
import com.ironsource.X3;
import com.mobilefuse.sdk.AdRendererContainer;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MraidAdRendererContainer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002&'B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u000fJ\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001cH\u0015J0\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0014J\u0010\u0010$\u001a\u00020\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\b\u0010%\u001a\u00020\u000fH\u0002R\u000e\u0010\r\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/mobilefuse/sdk/mraid/MraidAdRendererContainer;", "Lcom/mobilefuse/sdk/AdRendererContainer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "MIN_MS_BETWEEN_CHECKPOSITION", "attachedToWindow", "", "isOnscreen", C4643f8.k, "onLayoutListener", "Lcom/mobilefuse/sdk/mraid/MraidAdRendererContainer$OnLayoutListener;", "timeOfLastCheckPosition", "Ljava/util/Date;", "viewableChangeListener", "Lcom/mobilefuse/sdk/mraid/MraidAdRendererContainer$ViewableChangeListener;", "checkPosition", "", X3.i.o, "onAttachedToWindow", "", "onDetachedFromWindow", "onLayout", "changed", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "setViewableChangeListener", "tooManyCheckPositionRequests", "OnLayoutListener", "ViewableChangeListener", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes11.dex */
public final class MraidAdRendererContainer extends AdRendererContainer {
    private final int MIN_MS_BETWEEN_CHECKPOSITION;
    private boolean attachedToWindow;
    private boolean isOnscreen;
    private final boolean isVisible;
    private OnLayoutListener onLayoutListener;
    private Date timeOfLastCheckPosition;
    private ViewableChangeListener viewableChangeListener;

    /* compiled from: MraidAdRendererContainer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/sdk/mraid/MraidAdRendererContainer$OnLayoutListener;", "", "onLayout", "", "changed", "", "left", "", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
    public interface OnLayoutListener {
        void onLayout(boolean changed, int left, int top, int right, int bottom);
    }

    /* compiled from: MraidAdRendererContainer.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&¨\u0006\r"}, d2 = {"Lcom/mobilefuse/sdk/mraid/MraidAdRendererContainer$ViewableChangeListener;", "", "onViewableChange", "", "left", "", ViewHierarchyConstants.DIMENSION_TOP_KEY, "width", "height", "exposedPercentage", "", "localClippedArea", "Landroid/graphics/Rect;", "mobilefuse-sdk-mraid_release"}, k = 1, mv = {1, 4, 3})
    public interface ViewableChangeListener {
        void onViewableChange(int left, int top, int width, int height, double exposedPercentage, @Nullable Rect localClippedArea) throws Throwable;
    }

    @Override // com.mobilefuse.sdk.AdRendererContainer, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.E, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.mobilefuse.sdk.AdRendererContainer, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MraidAdRendererContainer(@NotNull Context context) throws Throwable {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.MIN_MS_BETWEEN_CHECKPOSITION = 50;
        this.timeOfLastCheckPosition = new Date();
    }

    public final double checkPosition() throws Throwable {
        Rect rect;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (!this.attachedToWindow) {
                return 0.0d;
            }
            if (tooManyCheckPositionRequests()) {
                return -1.0d;
            }
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            boolean globalVisibleRect = getGlobalVisibleRect(new Rect());
            double height = getHeight() * getWidth();
            if (height == 0.0d) {
                return 0.0d;
            }
            double height2 = ((globalVisibleRect ? r6.height() * r6.width() : 0.0d) / height) * 100.0d;
            boolean z = false;
            int i = iArr[0];
            int i2 = iArr[1];
            int width = getWidth() + i;
            int height3 = getHeight() + i2;
            int[] screenSizeAsPixels = Utils.getScreenSizeAsPixels(getContext());
            int i3 = screenSizeAsPixels[0];
            int i4 = screenSizeAsPixels[1];
            if (width > 0 && i < i3 && height3 > 0 && i2 < i4) {
                z = true;
            }
            this.isOnscreen = z;
            if (globalVisibleRect) {
                rect = new Rect();
                getLocalVisibleRect(rect);
            } else {
                rect = null;
            }
            Rect rect2 = rect;
            ViewableChangeListener viewableChangeListener = this.viewableChangeListener;
            if (viewableChangeListener != null) {
                viewableChangeListener.onViewableChange(i, i2, getWidth(), getHeight(), height2, rect2);
            }
            this.timeOfLastCheckPosition = new Date();
            return height2;
        } catch (Throwable th) {
            if (MraidAdRendererContainer$checkPosition$$inlined$handleExceptionsWithDefault$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return 0.0d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MraidAdRendererContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.MIN_MS_BETWEEN_CHECKPOSITION = 50;
        this.timeOfLastCheckPosition = new Date();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MraidAdRendererContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.MIN_MS_BETWEEN_CHECKPOSITION = 50;
        this.timeOfLastCheckPosition = new Date();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @RequiresApi
    public MraidAdRendererContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) throws Throwable {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.MIN_MS_BETWEEN_CHECKPOSITION = 50;
        this.timeOfLastCheckPosition = new Date();
    }

    private final boolean tooManyCheckPositionRequests() throws Throwable {
        return new Date().getTime() - this.timeOfLastCheckPosition.getTime() < ((long) this.MIN_MS_BETWEEN_CHECKPOSITION);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            OnLayoutListener onLayoutListener = this.onLayoutListener;
            if (onLayoutListener != null) {
                onLayoutListener.onLayout(changed, left, top, right, bottom);
            }
            getHandler().postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.mraid.MraidAdRendererContainer$onLayout$$inlined$handleExceptions$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        MraidAdRendererContainer.this.checkPosition();
                    } catch (Throwable th) {
                        int i = MraidAdRendererContainer$onLayout$1$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                        if (i == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                        } else if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }, 50L);
        } catch (Throwable th) {
            int i = MraidAdRendererContainer$onLayout$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final boolean isViewable() {
        return this.isOnscreen && this.isVisible;
    }

    public final void setViewableChangeListener(@Nullable ViewableChangeListener viewableChangeListener) {
        this.viewableChangeListener = viewableChangeListener;
    }

    @Override // com.mobilefuse.sdk.AdRendererContainer, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.mobilefuse.sdk.mraid.MraidAdRendererContainer$onAttachedToWindow$$inlined$handleExceptions$lambda$1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        MraidAdRendererContainer.this.checkPosition();
                    } catch (Throwable th) {
                        int i = MraidAdRendererContainer$onAttachedToWindow$1$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                        if (i == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                        } else if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            });
        } catch (Throwable th) {
            int i = MraidAdRendererContainer$onAttachedToWindow$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // com.mobilefuse.sdk.AdRendererContainer, android.view.ViewGroup, android.view.View
    @SuppressLint({"ImplicitSamInstance"})
    protected void onDetachedFromWindow() {
        this.attachedToWindow = false;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            getViewTreeObserver().removeOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.mobilefuse.sdk.mraid.MraidAdRendererContainer$onDetachedFromWindow$$inlined$handleExceptions$lambda$1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        MraidAdRendererContainer.this.checkPosition();
                    } catch (Throwable th) {
                        int i = MraidAdRendererContainer$onDetachedFromWindow$1$1$$special$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                        if (i == 1) {
                            StabilityHelper.logException("[Automatically caught]", th);
                        } else if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            });
        } catch (Throwable th) {
            int i = MraidAdRendererContainer$onDetachedFromWindow$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        super.onDetachedFromWindow();
    }
}
