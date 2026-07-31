package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivViewGroup.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 +2\u00020\u0001:\u0002+,B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0004J0\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0004J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020%H\u0014J\u0012\u0010'\u001a\u00020%2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010%H\u0014J \u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014J0\u0010*\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0014R*\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000e¨\u0006-"}, d2 = {"Lcom/yandex/div/internal/widget/DivViewGroup;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "gravity", "getGravity$annotations", "()V", "getGravity", "()I", "setGravity", "(I)V", "horizontalGravity", "getHorizontalGravity$div_release", "horizontalPaddings", "getHorizontalPaddings$div_release", "verticalGravity", "getVerticalGravity$div_release", "verticalPaddings", "getVerticalPaddings$div_release", "baseMeasureChild", "", "child", "Landroid/view/View;", "parentWidthMeasureSpec", "parentHeightMeasureSpec", "baseMeasureChildWithMargins", "widthUsed", "heightUsed", "checkLayoutParams", "", "p", "Landroid/view/ViewGroup$LayoutParams;", "generateDefaultLayoutParams", "generateLayoutParams", "lp", "measureChild", "measureChildWithMargins", "Companion", "OffsetsHolder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class DivViewGroup extends ViewGroup {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int gravity;

    public DivViewGroup(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public DivViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static /* synthetic */ void getGravity$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public /* synthetic */ DivViewGroup(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public DivViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        setClipToPadding(false);
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final void setGravity(int i) {
        if (this.gravity == i) {
            return;
        }
        Companion companion = INSTANCE;
        if (companion.toHorizontalGravity(i) == 0) {
            i |= 8388611;
        }
        if (companion.toVerticalGravity(i) == 0) {
            i |= 48;
        }
        this.gravity = i;
        requestLayout();
    }

    protected final void baseMeasureChild(@NotNull View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        super.measureChild(child, parentWidthMeasureSpec, parentHeightMeasureSpec);
    }

    protected final void baseMeasureChildWithMargins(@NotNull View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        super.measureChildWithMargins(child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
    }

    public final int getHorizontalGravity$div_release() {
        return INSTANCE.toHorizontalGravity(this.gravity);
    }

    public final int getVerticalGravity$div_release() {
        return INSTANCE.toVerticalGravity(this.gravity);
    }

    public final int getHorizontalPaddings$div_release() {
        return getPaddingLeft() + getPaddingRight();
    }

    public final int getVerticalPaddings$div_release() {
        return getPaddingTop() + getPaddingBottom();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(@Nullable ViewGroup.LayoutParams p) {
        return p instanceof DivLayoutParams;
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable AttributeSet attrs) {
        return new DivLayoutParams(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams lp) {
        return lp instanceof DivLayoutParams ? new DivLayoutParams((DivLayoutParams) lp) : lp instanceof ViewGroup.MarginLayoutParams ? new DivLayoutParams((ViewGroup.MarginLayoutParams) lp) : new DivLayoutParams(lp);
    }

    @Override // android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-2, -2);
    }

    /* compiled from: DivViewGroup.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tJ\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0015J\u001d\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0017J\f\u0010\u0018\u001a\u00020\t*\u00020\tH\u0007J\f\u0010\u0019\u001a\u00020\t*\u00020\tH\u0007R\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/internal/widget/DivViewGroup$Companion;", "", "()V", "lp", "Lcom/yandex/div/internal/widget/DivLayoutParams;", "Landroid/view/View;", "getLp", "(Landroid/view/View;)Lcom/yandex/div/internal/widget/DivLayoutParams;", "getChildMeasureSpec", "", "parentMeasureSpec", VastAttributes.PADDING, "childDimension", SDKConstants.PARAM_CONTEXT_MIN_SIZE, SDKConstants.PARAM_CONTEXT_MAX_SIZE, "getSpaceAroundPart", "", "freeSpace", "childCount", "getSpaceAroundPart$div_release", "getSpaceBetweenPart", "getSpaceBetweenPart$div_release", "getSpaceEvenlyPart", "getSpaceEvenlyPart$div_release", "toHorizontalGravity", "toVerticalGravity", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getSpaceAroundPart$div_release(float freeSpace, int childCount) {
            return freeSpace / (childCount * 2);
        }

        public final float getSpaceBetweenPart$div_release(float freeSpace, int childCount) {
            if (childCount == 1) {
                return 0.0f;
            }
            return freeSpace / (childCount - 1);
        }

        public final float getSpaceEvenlyPart$div_release(float freeSpace, int childCount) {
            return freeSpace / (childCount + 1);
        }

        @SuppressLint({"WrongConstant"})
        public final int toHorizontalGravity(int i) {
            return i & 125829127;
        }

        @SuppressLint({"WrongConstant"})
        public final int toVerticalGravity(int i) {
            return i & 1879048304;
        }

        private Companion() {
        }

        @NotNull
        public final DivLayoutParams getLp(@NotNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            return (DivLayoutParams) layoutParams;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        
            r10 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            r10 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int getChildMeasureSpec(int parentMeasureSpec, int padding, int childDimension, int minSize, int maxSize) {
            int mode = View.MeasureSpec.getMode(parentMeasureSpec);
            int size = View.MeasureSpec.getSize(parentMeasureSpec) - padding;
            int i = 0;
            int max = Math.max(0, size);
            if (mode == Integer.MIN_VALUE) {
                if (childDimension < 0 || childDimension > Integer.MAX_VALUE) {
                    if (childDimension == -1) {
                        childDimension = Math.min(Math.max(max, minSize), maxSize);
                    } else if (childDimension != -2) {
                        if (childDimension == -3) {
                            childDimension = Math.min(Math.max(max, minSize), maxSize);
                        }
                        childDimension = 0;
                    }
                    i = Integer.MIN_VALUE;
                }
                i = 1073741824;
            } else if (mode != 0) {
                if (mode == 1073741824) {
                    if (childDimension < 0 || childDimension > Integer.MAX_VALUE) {
                        if (childDimension == -1) {
                            childDimension = Math.min(Math.max(max, minSize), maxSize);
                        } else if (childDimension != -2) {
                            if (childDimension == -3) {
                                childDimension = Math.min(Math.max(max, minSize), maxSize);
                                i = Integer.MIN_VALUE;
                            }
                        }
                    }
                    i = 1073741824;
                }
                childDimension = 0;
            } else {
                if (childDimension < 0) {
                }
                i = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(childDimension, i);
        }
    }

    @Override // android.view.ViewGroup
    protected void measureChild(@NotNull View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        Companion companion = INSTANCE;
        child.measure(companion.getChildMeasureSpec(parentWidthMeasureSpec, getHorizontalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(parentHeightMeasureSpec, getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(@NotNull View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        Companion companion = INSTANCE;
        child.measure(companion.getChildMeasureSpec(parentWidthMeasureSpec, getHorizontalPaddings$div_release() + divLayoutParams.getHorizontalMargins$div_release() + widthUsed, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(parentHeightMeasureSpec, getVerticalPaddings$div_release() + divLayoutParams.getVerticalMargins$div_release() + heightUsed, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    /* compiled from: DivViewGroup.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/internal/widget/DivViewGroup$OffsetsHolder;", "", "firstChildOffset", "", "spaceBetweenChildren", "edgeDividerOffset", "", "(Lcom/yandex/div/internal/widget/DivViewGroup;FFI)V", "getEdgeDividerOffset", "()I", "setEdgeDividerOffset", "(I)V", "getFirstChildOffset", "()F", "setFirstChildOffset", "(F)V", "getSpaceBetweenChildren", "setSpaceBetweenChildren", "update", "", "freeSpace", "gravity", "childCount", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class OffsetsHolder {
        private int edgeDividerOffset;
        private float firstChildOffset;
        private float spaceBetweenChildren;

        public OffsetsHolder(float f, float f2, int i) {
            this.firstChildOffset = f;
            this.spaceBetweenChildren = f2;
            this.edgeDividerOffset = i;
        }

        public /* synthetic */ OffsetsHolder(DivViewGroup divViewGroup, float f, float f2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0 : i);
        }

        public final float getFirstChildOffset() {
            return this.firstChildOffset;
        }

        public final void setFirstChildOffset(float f) {
            this.firstChildOffset = f;
        }

        public final float getSpaceBetweenChildren() {
            return this.spaceBetweenChildren;
        }

        public final void setSpaceBetweenChildren(float f) {
            this.spaceBetweenChildren = f;
        }

        public final int getEdgeDividerOffset() {
            return this.edgeDividerOffset;
        }

        public final void setEdgeDividerOffset(int i) {
            this.edgeDividerOffset = i;
        }

        public final void update(float freeSpace, int gravity, int childCount) {
            this.firstChildOffset = 0.0f;
            this.spaceBetweenChildren = 0.0f;
            this.edgeDividerOffset = 0;
            switch (gravity) {
                case 1:
                case 16:
                    this.firstChildOffset = freeSpace / 2;
                    return;
                case 3:
                case 48:
                    return;
                case 5:
                case 80:
                    this.firstChildOffset = freeSpace;
                    return;
                case 16777216:
                case 268435456:
                    float spaceAroundPart$div_release = DivViewGroup.INSTANCE.getSpaceAroundPart$div_release(freeSpace, childCount);
                    this.firstChildOffset = spaceAroundPart$div_release;
                    float f = 2;
                    this.spaceBetweenChildren = spaceAroundPart$div_release * f;
                    this.edgeDividerOffset = (int) (spaceAroundPart$div_release / f);
                    return;
                case 33554432:
                case 536870912:
                    this.spaceBetweenChildren = DivViewGroup.INSTANCE.getSpaceBetweenPart$div_release(freeSpace, childCount);
                    return;
                case 67108864:
                case 1073741824:
                    float spaceEvenlyPart$div_release = DivViewGroup.INSTANCE.getSpaceEvenlyPart$div_release(freeSpace, childCount);
                    this.firstChildOffset = spaceEvenlyPart$div_release;
                    this.spaceBetweenChildren = spaceEvenlyPart$div_release;
                    this.edgeDividerOffset = (int) (spaceEvenlyPart$div_release / 2);
                    return;
                default:
                    throw new IllegalStateException("Invalid gravity is set: " + gravity);
            }
        }
    }
}
