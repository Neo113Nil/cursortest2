package com.yandex.div.internal.widget.slider;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.Px;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SliderView.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0016\u0018\u0000 «\u00012\u00020\u0001:\n©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020:J\u0006\u0010p\u001a\u00020nJ\u0010\u0010q\u001a\u00020\u001e2\u0006\u0010r\u001a\u00020sH\u0014J\u0010\u0010t\u001a\u00020\u001e2\u0006\u0010r\u001a\u00020uH\u0016J\u0015\u0010v\u001a\u00020X2\u0006\u0010w\u001a\u00020\u0007H\u0000¢\u0006\u0002\bxJ\u0015\u0010y\u001a\u00020\u00072\u0006\u0010i\u001a\u000201H\u0000¢\u0006\u0002\bzJ\b\u0010{\u001a\u00020\u0007H\u0014J\b\u0010|\u001a\u00020\u0007H\u0014J\u0010\u0010}\u001a\u0002012\u0006\u0010w\u001a\u00020\u0007H\u0002J\u0012\u0010~\u001a\u00020\u00072\b\b\u0002\u0010\u007f\u001a\u00020\u0007H\u0002J\t\u0010\u0080\u0001\u001a\u00020\u001eH\u0002J\u001b\u0010\u0081\u0001\u001a\u00020\u00072\u0007\u0010\u0082\u0001\u001a\u00020\u00072\u0007\u0010\u0083\u0001\u001a\u00020\u0007H\u0002J#\u0010\u0084\u0001\u001a\u00020n2\t\u0010\u0085\u0001\u001a\u0004\u0018\u0001012\u0007\u0010\u0086\u0001\u001a\u000201H\u0002¢\u0006\u0003\u0010\u0087\u0001J%\u0010\u0088\u0001\u001a\u00020n2\t\u0010\u0085\u0001\u001a\u0004\u0018\u0001012\t\u0010\u0086\u0001\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0003\u0010\u0089\u0001J\u0013\u0010\u008a\u0001\u001a\u00020n2\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0014J'\u0010\u008d\u0001\u001a\u00020n2\u0007\u0010\u008e\u0001\u001a\u00020\u001e2\u0007\u0010\u008f\u0001\u001a\u00020\u00072\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001H\u0014J\u001b\u0010\u0092\u0001\u001a\u00020n2\u0007\u0010\u0093\u0001\u001a\u00020\u00072\u0007\u0010\u0094\u0001\u001a\u00020\u0007H\u0014J\u0012\u0010\u0095\u0001\u001a\u00020\u001e2\u0007\u0010\u0096\u0001\u001a\u00020sH\u0017J\"\u0010\u0097\u0001\u001a\u00020n2\b\u0010\r\u001a\u0004\u0018\u0001012\t\b\u0002\u0010\u0098\u0001\u001a\u00020\u001e¢\u0006\u0003\u0010\u0099\u0001J\u001a\u0010\u009a\u0001\u001a\u00020n2\u0006\u0010\r\u001a\u0002012\t\b\u0002\u0010\u0098\u0001\u001a\u00020\u001eJ\t\u0010\u009b\u0001\u001a\u00020nH\u0002J\t\u0010\u009c\u0001\u001a\u00020nH\u0002J \u0010\u009d\u0001\u001a\u00020n2\u0007\u0010\u009e\u0001\u001a\u00020X2\u0006\u0010\r\u001a\u000201H\u0000¢\u0006\u0003\b\u009f\u0001J.\u0010 \u0001\u001a\u00020n2\u0007\u0010\u009e\u0001\u001a\u00020X2\u0006\u0010\r\u001a\u0002012\u0007\u0010\u0098\u0001\u001a\u00020\u001e2\t\b\u0002\u0010¡\u0001\u001a\u00020\u001eH\u0002J+\u0010¢\u0001\u001a\u00020n2\b\u0010\r\u001a\u0004\u0018\u0001012\u0007\u0010\u0098\u0001\u001a\u00020\u001e2\u0007\u0010¡\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0003\u0010£\u0001J%\u0010¤\u0001\u001a\u00020n2\u0006\u0010\r\u001a\u0002012\t\b\u0002\u0010\u0098\u0001\u001a\u00020\u001e2\u0007\u0010¡\u0001\u001a\u00020\u001eH\u0002J\r\u0010¥\u0001\u001a\u000201*\u000201H\u0002J\r\u0010¦\u0001\u001a\u00020n*\u00020OH\u0002J\u0017\u0010§\u0001\u001a\u00020\u0007*\u0002012\b\b\u0002\u0010\u007f\u001a\u00020\u0007H\u0003J\r\u0010§\u0001\u001a\u00020\u0007*\u00020\u0007H\u0003J\r\u0010¨\u0001\u001a\u000201*\u00020\u0007H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0017@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010(\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R(\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0011\"\u0004\b-\u0010\u0013R\u001a\u0010.\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\"R$\u00102\u001a\u0002012\u0006\u0010\r\u001a\u000201@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00107\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020:09X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010;\u001a\u00020\u00078BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R$\u0010>\u001a\u0002012\u0006\u0010\r\u001a\u000201@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00104\"\u0004\b@\u00106R$\u0010A\u001a\u0002012\u0006\u0010\r\u001a\u000201@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00104\"\u0004\bC\u00106R\u0012\u0010D\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0004\n\u0002\u0010ER\u000e\u0010F\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0010\u0010N\u001a\u0004\u0018\u00010OX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020QX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u0004\u0018\u00010OX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010T\u001a\u0004\u0018\u00010\u000e2\b\u0010S\u001a\u0004\u0018\u00010\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0011\"\u0004\bV\u0010\u0013R\u000e\u0010W\u001a\u00020XX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010Z\u001a\u0004\u0018\u00010Y2\b\u0010S\u001a\u0004\u0018\u00010Y@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010_\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0011\"\u0004\ba\u0010\u0013R$\u0010c\u001a\u0004\u0018\u0001012\b\u0010b\u001a\u0004\u0018\u000101@BX\u0086\u000e¢\u0006\n\n\u0002\u0010E\u001a\u0004\bd\u0010eR(\u0010f\u001a\u0004\u0018\u00010Y2\b\u0010S\u001a\u0004\u0018\u00010Y@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\\\"\u0004\bh\u0010^R\u001e\u0010i\u001a\u0002012\u0006\u0010b\u001a\u000201@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bj\u00104R\u0012\u0010k\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010l¨\u0006®\u0001"}, d2 = {"Lcom/yandex/div/internal/widget/slider/SliderView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a11yHelper", "Lcom/yandex/div/internal/widget/slider/SliderAccessibilityHelper;", "activeRange", "Lcom/yandex/div/internal/widget/slider/SliderView$ActiveRange;", "value", "Landroid/graphics/drawable/Drawable;", "activeTickMarkDrawable", "getActiveTickMarkDrawable", "()Landroid/graphics/drawable/Drawable;", "setActiveTickMarkDrawable", "(Landroid/graphics/drawable/Drawable;)V", "activeTrackDrawable", "getActiveTrackDrawable", "setActiveTrackDrawable", "", "animationDuration", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationEnabled", "", "getAnimationEnabled", "()Z", "setAnimationEnabled", "(Z)V", "animationInterpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "animatorListener", "Lcom/yandex/div/internal/widget/slider/SliderThumbAnimatorListener;", "animatorSecondaryListener", "inactiveTickMarkDrawable", "getInactiveTickMarkDrawable", "setInactiveTickMarkDrawable", "inactiveTrackDrawable", "getInactiveTrackDrawable", "setInactiveTrackDrawable", "interactive", "getInteractive", "setInteractive", "", "interceptionAngle", "getInterceptionAngle", "()F", "setInterceptionAngle", "(F)V", "interceptionAngleTg", "listeners", "Lcom/yandex/div/core/ObserverList;", "Lcom/yandex/div/internal/widget/slider/SliderView$ChangedListener;", "maxTickmarkOrThumbWidth", "getMaxTickmarkOrThumbWidth", "()I", "maxValue", "getMaxValue", "setMaxValue", "minValue", "getMinValue", "setMinValue", "prevThumbSecondaryValue", "Ljava/lang/Float;", "prevThumbValue", "prevX", "prevY", "ranges", "", "Lcom/yandex/div/internal/widget/slider/SliderView$Range;", "getRanges", "()Ljava/util/List;", "sliderAnimator", "Landroid/animation/ValueAnimator;", "sliderDrawDelegate", "Lcom/yandex/div/internal/widget/slider/SliderDrawDelegate;", "sliderSecondaryAnimator", "drawable", "thumbDrawable", "getThumbDrawable", "setThumbDrawable", "thumbOnTouch", "Lcom/yandex/div/internal/widget/slider/SliderView$Thumb;", "Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;", "thumbSecondTextDrawable", "getThumbSecondTextDrawable", "()Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;", "setThumbSecondTextDrawable", "(Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;)V", "thumbSecondaryDrawable", "getThumbSecondaryDrawable", "setThumbSecondaryDrawable", "<set-?>", "thumbSecondaryValue", "getThumbSecondaryValue", "()Ljava/lang/Float;", "thumbTextDrawable", "getThumbTextDrawable", "setThumbTextDrawable", "thumbValue", "getThumbValue", "touchSlop", "Ljava/lang/Integer;", "addOnThumbChangedListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "clearOnThumbChangedListener", "dispatchHoverEvent", "event", "Landroid/view/MotionEvent;", "dispatchKeyEvent", "Landroid/view/KeyEvent;", "getClosestThumb", X3.i.L, "getClosestThumb$div_release", "getPositionInView", "getPositionInView$div_release", "getSuggestedMinimumHeight", "getSuggestedMinimumWidth", "getTouchValue", "getTrackLength", "viewWidth", "isThumbSecondaryEnabled", "measureDimension", "desiredSize", "measureSpec", "notifyThumbChangedListeners", "prevValue", "newValue", "(Ljava/lang/Float;F)V", "notifyThumbSecondaryChangedListeners", "(Ljava/lang/Float;Ljava/lang/Float;)V", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onFocusChanged", "gainFocus", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "ev", "setThumbSecondaryValue", "animated", "(Ljava/lang/Float;Z)V", "setThumbValue", "setThumbsInBoarders", "setThumbsOnTickMarks", "setValueToAccessibilityThumb", "thumb", "setValueToAccessibilityThumb$div_release", "setValueToThumb", "forced", "trySetThumbSecondaryValue", "(Ljava/lang/Float;ZZ)V", "trySetThumbValue", "inBoarders", "setBaseParams", "toPosition", "toValue", "ActiveRange", "ChangedListener", "Companion", Command.HTTP_HEADER_RANGE, "Thumb", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class SliderView extends View {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final SliderAccessibilityHelper a11yHelper;

    @NotNull
    private final ActiveRange activeRange;

    @Nullable
    private Drawable activeTickMarkDrawable;

    @Nullable
    private Drawable activeTrackDrawable;
    private long animationDuration;
    private boolean animationEnabled;

    @NotNull
    private AccelerateDecelerateInterpolator animationInterpolator;

    @NotNull
    private final SliderThumbAnimatorListener animatorListener;

    @NotNull
    private final SliderThumbAnimatorListener animatorSecondaryListener;

    @Nullable
    private Drawable inactiveTickMarkDrawable;

    @Nullable
    private Drawable inactiveTrackDrawable;
    private boolean interactive;
    private float interceptionAngle;
    private float interceptionAngleTg;

    @NotNull
    private final ObserverList<ChangedListener> listeners;
    private int maxTickmarkOrThumbWidth;
    private float maxValue;
    private float minValue;

    @Nullable
    private Float prevThumbSecondaryValue;
    private float prevThumbValue;
    private float prevX;
    private float prevY;

    @NotNull
    private final List<Range> ranges;

    @Nullable
    private ValueAnimator sliderAnimator;

    @NotNull
    private final SliderDrawDelegate sliderDrawDelegate;

    @Nullable
    private ValueAnimator sliderSecondaryAnimator;

    @Nullable
    private Drawable thumbDrawable;

    @NotNull
    private Thumb thumbOnTouch;

    @Nullable
    private TextDrawable thumbSecondTextDrawable;

    @Nullable
    private Drawable thumbSecondaryDrawable;

    @Nullable
    private Float thumbSecondaryValue;

    @Nullable
    private TextDrawable thumbTextDrawable;
    private float thumbValue;

    @Nullable
    private Integer touchSlop;

    /* compiled from: SliderView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/internal/widget/slider/SliderView$ChangedListener;", "", "onThumbSecondaryValueChanged", "", "value", "", "(Ljava/lang/Float;)V", "onThumbValueChanged", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ChangedListener {
        default void onThumbSecondaryValueChanged(@Nullable Float value) {
        }

        default void onThumbValueChanged(float value) {
        }
    }

    /* compiled from: SliderView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/internal/widget/slider/SliderView$Thumb;", "", "(Ljava/lang/String;I)V", "THUMB", "THUMB_SECONDARY", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Thumb {
        THUMB,
        THUMB_SECONDARY
    }

    /* compiled from: SliderView.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Thumb.values().length];
            try {
                iArr[Thumb.THUMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Thumb.THUMB_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SliderView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public SliderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    public /* synthetic */ SliderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SliderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.sliderDrawDelegate = new SliderDrawDelegate();
        this.listeners = new ObserverList<>();
        this.animatorListener = new SliderThumbAnimatorListener(new Function1() { // from class: com.yandex.div.internal.widget.slider.SliderView$animatorListener$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                float f;
                SliderView.this.sliderAnimator = null;
                if (z) {
                    return;
                }
                SliderView sliderView = SliderView.this;
                f = sliderView.prevThumbValue;
                sliderView.notifyThumbChangedListeners(Float.valueOf(f), SliderView.this.getThumbValue());
            }
        });
        this.animatorSecondaryListener = new SliderThumbAnimatorListener(new Function1() { // from class: com.yandex.div.internal.widget.slider.SliderView$animatorSecondaryListener$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                Float f;
                SliderView.this.sliderSecondaryAnimator = null;
                if (z) {
                    return;
                }
                SliderView sliderView = SliderView.this;
                f = sliderView.prevThumbSecondaryValue;
                sliderView.notifyThumbSecondaryChangedListeners(f, SliderView.this.getThumbSecondaryValue());
            }
        });
        this.ranges = new ArrayList();
        this.animationDuration = 300L;
        this.animationInterpolator = new AccelerateDecelerateInterpolator();
        this.animationEnabled = true;
        this.maxValue = 100.0f;
        this.thumbValue = this.minValue;
        this.a11yHelper = new SliderAccessibilityHelper(this);
        this.maxTickmarkOrThumbWidth = -1;
        this.activeRange = new ActiveRange();
        this.thumbOnTouch = Thumb.THUMB;
        this.interactive = true;
        this.interceptionAngle = 45.0f;
        this.interceptionAngleTg = (float) Math.tan(45.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyThumbChangedListeners(Float prevValue, float newValue) {
        if (Intrinsics.areEqual(prevValue, newValue)) {
            return;
        }
        Iterator<ChangedListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onThumbValueChanged(newValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyThumbSecondaryChangedListeners(Float prevValue, Float newValue) {
        if (Intrinsics.areEqual(prevValue, newValue)) {
            return;
        }
        Iterator<ChangedListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onThumbSecondaryValueChanged(newValue);
        }
    }

    @NotNull
    public final List<Range> getRanges() {
        return this.ranges;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final void setAnimationDuration(long j) {
        if (this.animationDuration == j || j < 0) {
            return;
        }
        this.animationDuration = j;
    }

    public final boolean getAnimationEnabled() {
        return this.animationEnabled;
    }

    public final void setAnimationEnabled(boolean z) {
        this.animationEnabled = z;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    public final void setMinValue(float f) {
        if (this.minValue == f) {
            return;
        }
        setMaxValue(Math.max(this.maxValue, 1.0f + f));
        this.minValue = f;
        setThumbsInBoarders();
        invalidate();
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final void setMaxValue(float f) {
        if (this.maxValue == f) {
            return;
        }
        setMinValue(Math.min(this.minValue, f - 1.0f));
        this.maxValue = f;
        setThumbsInBoarders();
        invalidate();
    }

    @Nullable
    public final Drawable getActiveTickMarkDrawable() {
        return this.activeTickMarkDrawable;
    }

    public final void setActiveTickMarkDrawable(@Nullable Drawable drawable) {
        this.activeTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        setThumbsOnTickMarks();
        invalidate();
    }

    @Nullable
    public final Drawable getInactiveTickMarkDrawable() {
        return this.inactiveTickMarkDrawable;
    }

    public final void setInactiveTickMarkDrawable(@Nullable Drawable drawable) {
        this.inactiveTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        setThumbsOnTickMarks();
        invalidate();
    }

    @Nullable
    public final Drawable getActiveTrackDrawable() {
        return this.activeTrackDrawable;
    }

    public final void setActiveTrackDrawable(@Nullable Drawable drawable) {
        this.activeTrackDrawable = drawable;
        invalidate();
    }

    @Nullable
    public final Drawable getInactiveTrackDrawable() {
        return this.inactiveTrackDrawable;
    }

    public final void setInactiveTrackDrawable(@Nullable Drawable drawable) {
        this.inactiveTrackDrawable = drawable;
        invalidate();
    }

    public final float getThumbValue() {
        return this.thumbValue;
    }

    public static /* synthetic */ void setThumbValue$default(SliderView sliderView, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setThumbValue");
        }
        if ((i & 2) != 0) {
            z = sliderView.animationEnabled;
        }
        sliderView.setThumbValue(f, z);
    }

    public final void setThumbValue(float value, boolean animated) {
        trySetThumbValue(value, animated, true);
    }

    static /* synthetic */ void trySetThumbValue$default(SliderView sliderView, float f, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trySetThumbValue");
        }
        if ((i & 2) != 0) {
            z = sliderView.animationEnabled;
        }
        sliderView.trySetThumbValue(f, z, z2);
    }

    private final void trySetThumbValue(float value, boolean animated, boolean forced) {
        ValueAnimator valueAnimator;
        float inBoarders = inBoarders(value);
        float f = this.thumbValue;
        if (f == inBoarders) {
            return;
        }
        if (animated && this.animationEnabled) {
            ValueAnimator valueAnimator2 = this.sliderAnimator;
            if (valueAnimator2 == null) {
                this.prevThumbValue = f;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.thumbValue, inBoarders);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.slider.SliderView$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    SliderView.trySetThumbValue$lambda$3$lambda$2(SliderView.this, valueAnimator3);
                }
            });
            ofFloat.addListener(this.animatorListener);
            setBaseParams(ofFloat);
            ofFloat.start();
            this.sliderAnimator = ofFloat;
        } else {
            if (forced && (valueAnimator = this.sliderAnimator) != null) {
                valueAnimator.cancel();
            }
            if (forced || this.sliderAnimator == null) {
                float f2 = this.thumbValue;
                this.prevThumbValue = f2;
                this.thumbValue = inBoarders;
                notifyThumbChangedListeners(Float.valueOf(f2), this.thumbValue);
            }
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trySetThumbValue$lambda$3$lambda$2(SliderView sliderView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        sliderView.thumbValue = ((Float) animatedValue).floatValue();
        sliderView.postInvalidateOnAnimation();
    }

    @Nullable
    public final Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    public final void setThumbDrawable(@Nullable Drawable drawable) {
        this.thumbDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    @Nullable
    public final TextDrawable getThumbTextDrawable() {
        return this.thumbTextDrawable;
    }

    public final void setThumbTextDrawable(@Nullable TextDrawable textDrawable) {
        this.thumbTextDrawable = textDrawable;
        invalidate();
    }

    @Nullable
    public final Float getThumbSecondaryValue() {
        return this.thumbSecondaryValue;
    }

    public static /* synthetic */ void setThumbSecondaryValue$default(SliderView sliderView, Float f, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setThumbSecondaryValue");
        }
        if ((i & 2) != 0) {
            z = sliderView.animationEnabled;
        }
        sliderView.setThumbSecondaryValue(f, z);
    }

    public final void setThumbSecondaryValue(@Nullable Float value, boolean animated) {
        trySetThumbSecondaryValue(value, animated, true);
    }

    private final void trySetThumbSecondaryValue(Float value, boolean animated, boolean forced) {
        ValueAnimator valueAnimator;
        Float f;
        Float valueOf = value != null ? Float.valueOf(inBoarders(value.floatValue())) : null;
        if (Intrinsics.areEqual(this.thumbSecondaryValue, valueOf)) {
            return;
        }
        if (animated && this.animationEnabled && (f = this.thumbSecondaryValue) != null && valueOf != null) {
            ValueAnimator valueAnimator2 = this.sliderSecondaryAnimator;
            if (valueAnimator2 == null) {
                this.prevThumbSecondaryValue = f;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            Float f2 = this.thumbSecondaryValue;
            Intrinsics.checkNotNull(f2);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2.floatValue(), valueOf.floatValue());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.slider.SliderView$$ExternalSyntheticLambda1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    SliderView.trySetThumbSecondaryValue$lambda$5$lambda$4(SliderView.this, valueAnimator3);
                }
            });
            ofFloat.addListener(this.animatorSecondaryListener);
            setBaseParams(ofFloat);
            ofFloat.start();
            this.sliderSecondaryAnimator = ofFloat;
        } else {
            if (forced && (valueAnimator = this.sliderSecondaryAnimator) != null) {
                valueAnimator.cancel();
            }
            if (forced || this.sliderSecondaryAnimator == null) {
                Float f3 = this.thumbSecondaryValue;
                this.prevThumbSecondaryValue = f3;
                this.thumbSecondaryValue = valueOf;
                notifyThumbSecondaryChangedListeners(f3, valueOf);
            }
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trySetThumbSecondaryValue$lambda$5$lambda$4(SliderView sliderView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        sliderView.thumbSecondaryValue = (Float) animatedValue;
        sliderView.postInvalidateOnAnimation();
    }

    @Nullable
    public final Drawable getThumbSecondaryDrawable() {
        return this.thumbSecondaryDrawable;
    }

    public final void setThumbSecondaryDrawable(@Nullable Drawable drawable) {
        this.thumbSecondaryDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    @Nullable
    public final TextDrawable getThumbSecondTextDrawable() {
        return this.thumbSecondTextDrawable;
    }

    public final void setThumbSecondTextDrawable(@Nullable TextDrawable textDrawable) {
        this.thumbSecondTextDrawable = textDrawable;
        invalidate();
    }

    private final int getMaxTickmarkOrThumbWidth() {
        if (this.maxTickmarkOrThumbWidth == -1) {
            Companion companion = INSTANCE;
            this.maxTickmarkOrThumbWidth = Math.max(Math.max(companion.getBoundsWidth(this.activeTickMarkDrawable), companion.getBoundsWidth(this.inactiveTickMarkDrawable)), Math.max(companion.getBoundsWidth(this.thumbDrawable), companion.getBoundsWidth(this.thumbSecondaryDrawable)));
        }
        return this.maxTickmarkOrThumbWidth;
    }

    public final void addOnThumbChangedListener(@NotNull ChangedListener listener) {
        this.listeners.addObserver(listener);
    }

    public final void clearOnThumbChangedListener() {
        this.listeners.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        int measureDimension = measureDimension(suggestedMinimumWidth, widthMeasureSpec);
        int measureDimension2 = measureDimension(suggestedMinimumHeight, heightMeasureSpec);
        setMeasuredDimension(measureDimension, measureDimension2);
        this.sliderDrawDelegate.onMeasure(getTrackLength(measureDimension), (measureDimension2 - getPaddingTop()) - getPaddingBottom());
        for (Range range : this.ranges) {
            range.setStartPosition(toPosition(Math.max(range.getStartValue(), this.minValue), measureDimension) + range.getMarginStart());
            range.setEndPosition(toPosition(Math.min(range.getEndValue(), this.maxValue), measureDimension) - range.getMarginEnd());
        }
    }

    private final int measureDimension(int desiredSize, int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? desiredSize : size;
        }
        return Math.min(desiredSize, size);
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        Integer valueOf;
        Companion companion = INSTANCE;
        int max = Math.max(companion.getBoundsHeight(this.activeTrackDrawable), companion.getBoundsHeight(this.inactiveTrackDrawable));
        Iterator<T> it = this.ranges.iterator();
        if (it.hasNext()) {
            Range range = (Range) it.next();
            valueOf = Integer.valueOf(Math.max(companion.getBoundsHeight(range.getActiveTrackDrawable()), companion.getBoundsHeight(range.getInactiveTrackDrawable())));
            while (it.hasNext()) {
                Range range2 = (Range) it.next();
                Companion companion2 = INSTANCE;
                Integer valueOf2 = Integer.valueOf(Math.max(companion2.getBoundsHeight(range2.getActiveTrackDrawable()), companion2.getBoundsHeight(range2.getInactiveTrackDrawable())));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        Companion companion3 = INSTANCE;
        return Math.max(Math.max(companion3.getBoundsHeight(this.thumbDrawable), companion3.getBoundsHeight(this.thumbSecondaryDrawable)), Math.max(max, intValue));
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        int i = (int) ((this.maxValue - this.minValue) + 1);
        Companion companion = INSTANCE;
        int max = Math.max(Math.max(companion.getBoundsWidth(this.thumbDrawable), companion.getBoundsWidth(this.thumbSecondaryDrawable)), Math.max(companion.getBoundsWidth(this.activeTrackDrawable), companion.getBoundsWidth(this.inactiveTrackDrawable)) * i);
        TextDrawable textDrawable = this.thumbTextDrawable;
        int intrinsicWidth = textDrawable != null ? textDrawable.getIntrinsicWidth() : 0;
        TextDrawable textDrawable2 = this.thumbSecondTextDrawable;
        return Math.max(max, Math.max(intrinsicWidth, textDrawable2 != null ? textDrawable2.getIntrinsicWidth() : 0));
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Drawable drawable;
        int i;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft() + (getMaxTickmarkOrThumbWidth() / 2), getPaddingTop());
        int save = canvas.save();
        for (Range range : this.ranges) {
            canvas.clipRect(range.getStartPosition() - range.getMarginStart(), 0.0f, range.getEndPosition() + range.getMarginEnd(), getHeight(), Region.Op.DIFFERENCE);
        }
        this.sliderDrawDelegate.drawInactiveTrack(canvas, this.inactiveTrackDrawable);
        float start = this.activeRange.getStart();
        float end = this.activeRange.getEnd();
        int position$default = toPosition$default(this, start, 0, 1, null);
        int position$default2 = toPosition$default(this, end, 0, 1, null);
        this.sliderDrawDelegate.drawTrackPart(canvas, this.activeTrackDrawable, RangesKt.coerceAtMost(position$default, position$default2), RangesKt.coerceAtLeast(position$default2, position$default));
        canvas.restoreToCount(save);
        for (Range range2 : this.ranges) {
            if (range2.getEndPosition() < position$default || range2.getStartPosition() > position$default2) {
                i = position$default2;
                onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getInactiveTrackDrawable(), 0, 0, 48, null);
            } else if (range2.getStartPosition() < position$default || range2.getEndPosition() > position$default2) {
                i = position$default2;
                if (range2.getStartPosition() < position$default && range2.getEndPosition() <= i) {
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getInactiveTrackDrawable(), 0, RangesKt.coerceAtLeast(position$default - 1, range2.getStartPosition()), 16, null);
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getActiveTrackDrawable(), position$default, 0, 32, null);
                } else if (range2.getStartPosition() >= position$default && range2.getEndPosition() > i) {
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getActiveTrackDrawable(), 0, i, 16, null);
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getInactiveTrackDrawable(), RangesKt.coerceAtMost(i + 1, range2.getEndPosition()), 0, 32, null);
                } else {
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getInactiveTrackDrawable(), 0, 0, 48, null);
                    onDraw$lambda$10$drawTrackPart(range2, this, canvas, range2.getActiveTrackDrawable(), position$default, i);
                }
            } else {
                i = position$default2;
                onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getActiveTrackDrawable(), 0, 0, 48, null);
            }
            position$default2 = i;
        }
        int i2 = (int) this.minValue;
        int i3 = (int) this.maxValue;
        if (i2 <= i3) {
            while (true) {
                int i4 = (int) start;
                if (i2 <= ((int) end) && i4 <= i2) {
                    drawable = this.activeTickMarkDrawable;
                } else {
                    drawable = this.inactiveTickMarkDrawable;
                }
                this.sliderDrawDelegate.drawOnPosition(canvas, drawable, toPosition(i2));
                if (i2 == i3) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.sliderDrawDelegate.drawThumb(canvas, toPosition$default(this, this.thumbValue, 0, 1, null), this.thumbDrawable, (int) this.thumbValue, this.thumbTextDrawable);
        if (isThumbSecondaryEnabled()) {
            SliderDrawDelegate sliderDrawDelegate = this.sliderDrawDelegate;
            Float f = this.thumbSecondaryValue;
            Intrinsics.checkNotNull(f);
            int position$default3 = toPosition$default(this, f.floatValue(), 0, 1, null);
            Drawable drawable2 = this.thumbSecondaryDrawable;
            Float f2 = this.thumbSecondaryValue;
            Intrinsics.checkNotNull(f2);
            sliderDrawDelegate.drawThumb(canvas, position$default3, drawable2, (int) f2.floatValue(), this.thumbSecondTextDrawable);
        }
        canvas.restore();
    }

    static /* synthetic */ void onDraw$lambda$10$drawTrackPart$default(Range range, SliderView sliderView, Canvas canvas, Drawable drawable, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDraw$lambda$10$drawTrackPart");
        }
        if ((i3 & 16) != 0) {
            i = range.getStartPosition();
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = range.getEndPosition();
        }
        onDraw$lambda$10$drawTrackPart(range, sliderView, canvas, drawable, i4, i2);
    }

    private static final void onDraw$lambda$10$drawTrackPart(Range range, SliderView sliderView, Canvas canvas, Drawable drawable, int i, int i2) {
        sliderView.sliderDrawDelegate.drawTrackPart(canvas, drawable, i, i2);
    }

    public final boolean getInteractive() {
        return this.interactive;
    }

    public final void setInteractive(boolean z) {
        this.interactive = z;
    }

    public final float getInterceptionAngle() {
        return this.interceptionAngle;
    }

    public final void setInterceptionAngle(float f) {
        float max = Math.max(45.0f, Math.abs(f) % 90);
        this.interceptionAngle = max;
        this.interceptionAngleTg = (float) Math.tan(max);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        int scaledTouchSlop;
        if (!this.interactive) {
            return false;
        }
        int x = (((int) ev.getX()) - getPaddingLeft()) - (getMaxTickmarkOrThumbWidth() / 2);
        int action = ev.getAction();
        if (action == 0) {
            Thumb closestThumb$div_release = getClosestThumb$div_release(x);
            this.thumbOnTouch = closestThumb$div_release;
            setValueToThumb$default(this, closestThumb$div_release, getTouchValue(x), this.animationEnabled, false, 8, null);
            this.prevX = ev.getX();
            this.prevY = ev.getY();
            return true;
        }
        if (action == 1) {
            setValueToThumb$default(this, this.thumbOnTouch, getTouchValue(x), this.animationEnabled, false, 8, null);
            return true;
        }
        if (action != 2) {
            return false;
        }
        setValueToThumb(this.thumbOnTouch, getTouchValue(x), false, true);
        Integer num = this.touchSlop;
        if (num != null) {
            scaledTouchSlop = num.intValue();
        } else {
            scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            this.touchSlop = Integer.valueOf(scaledTouchSlop);
        }
        float abs = Math.abs(ev.getY() - this.prevY);
        if (abs < scaledTouchSlop) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            getParent().requestDisallowInterceptTouchEvent(abs / Math.abs(ev.getX() - this.prevX) <= this.interceptionAngleTg);
        }
        this.prevX = ev.getX();
        this.prevY = ev.getY();
        return true;
    }

    @NotNull
    public final Thumb getClosestThumb$div_release(int position) {
        if (!isThumbSecondaryEnabled()) {
            return Thumb.THUMB;
        }
        int abs = Math.abs(position - toPosition$default(this, this.thumbValue, 0, 1, null));
        Float f = this.thumbSecondaryValue;
        Intrinsics.checkNotNull(f);
        if (abs < Math.abs(position - toPosition$default(this, f.floatValue(), 0, 1, null))) {
            return Thumb.THUMB;
        }
        return Thumb.THUMB_SECONDARY;
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean gainFocus, int direction, @Nullable Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        this.a11yHelper.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        return this.a11yHelper.dispatchHoverEvent(event) || super.dispatchHoverEvent(event);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        return this.a11yHelper.dispatchKeyEvent(event) || super.dispatchKeyEvent(event);
    }

    public final void setValueToAccessibilityThumb$div_release(@NotNull Thumb thumb, float value) {
        setValueToThumb(thumb, inBoarders(value), false, true);
    }

    static /* synthetic */ void setValueToThumb$default(SliderView sliderView, Thumb thumb, float f, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setValueToThumb");
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        sliderView.setValueToThumb(thumb, f, z, z2);
    }

    private final void setValueToThumb(Thumb thumb, float value, boolean animated, boolean forced) {
        int i = WhenMappings.$EnumSwitchMapping$0[thumb.ordinal()];
        if (i == 1) {
            trySetThumbValue(value, animated, forced);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            trySetThumbSecondaryValue(Float.valueOf(value), animated, forced);
        }
    }

    private final float getTouchValue(int position) {
        if (this.inactiveTickMarkDrawable != null || this.activeTickMarkDrawable != null) {
            return MathKt.roundToInt(toValue(position));
        }
        return toValue(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isThumbSecondaryEnabled() {
        return this.thumbSecondaryValue != null;
    }

    private final void setThumbsInBoarders() {
        trySetThumbValue(inBoarders(this.thumbValue), false, true);
        if (isThumbSecondaryEnabled()) {
            Float f = this.thumbSecondaryValue;
            trySetThumbSecondaryValue(f != null ? Float.valueOf(inBoarders(f.floatValue())) : null, false, true);
        }
    }

    private final void setThumbsOnTickMarks() {
        trySetThumbValue(MathKt.roundToInt(this.thumbValue), false, true);
        if (this.thumbSecondaryValue != null) {
            trySetThumbSecondaryValue(Float.valueOf(MathKt.roundToInt(r0.floatValue())), false, true);
        }
    }

    static /* synthetic */ int toPosition$default(SliderView sliderView, float f, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPosition");
        }
        if ((i2 & 1) != 0) {
            i = sliderView.getWidth();
        }
        return sliderView.toPosition(f, i);
    }

    @Px
    private final int toPosition(float f, int i) {
        return MathKt.roundToInt((getTrackLength(i) / (this.maxValue - this.minValue)) * (ViewsKt.isLayoutRtl(this) ? this.maxValue - f : f - this.minValue));
    }

    static /* synthetic */ int getTrackLength$default(SliderView sliderView, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrackLength");
        }
        if ((i2 & 1) != 0) {
            i = sliderView.getWidth();
        }
        return sliderView.getTrackLength(i);
    }

    private final int getTrackLength(int viewWidth) {
        return ((viewWidth - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth();
    }

    @Px
    private final int toPosition(int i) {
        return toPosition$default(this, i, 0, 1, null);
    }

    private final float toValue(int i) {
        float f = this.minValue;
        float trackLength$default = (i * (this.maxValue - f)) / getTrackLength$default(this, 0, 1, null);
        if (ViewsKt.isLayoutRtl(this)) {
            trackLength$default = (this.maxValue - trackLength$default) - 1;
        }
        return f + trackLength$default;
    }

    private final float inBoarders(float f) {
        return Math.min(Math.max(f, this.minValue), this.maxValue);
    }

    private final void setBaseParams(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(this.animationDuration);
        valueAnimator.setInterpolator(this.animationInterpolator);
    }

    public final int getPositionInView$div_release(float thumbValue) {
        return toPosition$default(this, thumbValue, 0, 1, null) + getPaddingLeft();
    }

    /* compiled from: SliderView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\fR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/internal/widget/slider/SliderView$ActiveRange;", "", "(Lcom/yandex/div/internal/widget/slider/SliderView;)V", "end", "", "getEnd", "()F", "start", "getStart", "max", "one", "another", "(FLjava/lang/Float;)F", "min", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class ActiveRange {
        public ActiveRange() {
        }

        public final float getStart() {
            if (!SliderView.this.isThumbSecondaryEnabled()) {
                return SliderView.this.getMinValue();
            }
            return min(SliderView.this.getThumbValue(), SliderView.this.getThumbSecondaryValue());
        }

        public final float getEnd() {
            if (!SliderView.this.isThumbSecondaryEnabled()) {
                return SliderView.this.getThumbValue();
            }
            return max(SliderView.this.getThumbValue(), SliderView.this.getThumbSecondaryValue());
        }

        private final float min(float one, Float another) {
            return another != null ? Math.min(one, another.floatValue()) : one;
        }

        private final float max(float one, Float another) {
            return another != null ? Math.max(one, another.floatValue()) : one;
        }
    }

    /* compiled from: SliderView.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001e\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001e\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/yandex/div/internal/widget/slider/SliderView$Range;", "", "()V", "activeTrackDrawable", "Landroid/graphics/drawable/Drawable;", "getActiveTrackDrawable", "()Landroid/graphics/drawable/Drawable;", "setActiveTrackDrawable", "(Landroid/graphics/drawable/Drawable;)V", "endPosition", "", "getEndPosition", "()I", "setEndPosition", "(I)V", "endValue", "", "getEndValue", "()F", "setEndValue", "(F)V", "inactiveTrackDrawable", "getInactiveTrackDrawable", "setInactiveTrackDrawable", "marginEnd", "getMarginEnd", "setMarginEnd", "marginStart", "getMarginStart", "setMarginStart", "startPosition", "getStartPosition", "setStartPosition", "startValue", "getStartValue", "setStartValue", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Range {

        @Nullable
        private Drawable activeTrackDrawable;

        @Px
        private int endPosition;
        private float endValue;

        @Nullable
        private Drawable inactiveTrackDrawable;

        @Px
        private int marginEnd;

        @Px
        private int marginStart;

        @Px
        private int startPosition;
        private float startValue;

        public final float getStartValue() {
            return this.startValue;
        }

        public final void setStartValue(float f) {
            this.startValue = f;
        }

        public final float getEndValue() {
            return this.endValue;
        }

        public final void setEndValue(float f) {
            this.endValue = f;
        }

        public final int getMarginStart() {
            return this.marginStart;
        }

        public final void setMarginStart(int i) {
            this.marginStart = i;
        }

        public final int getMarginEnd() {
            return this.marginEnd;
        }

        public final void setMarginEnd(int i) {
            this.marginEnd = i;
        }

        @Nullable
        public final Drawable getActiveTrackDrawable() {
            return this.activeTrackDrawable;
        }

        public final void setActiveTrackDrawable(@Nullable Drawable drawable) {
            this.activeTrackDrawable = drawable;
        }

        @Nullable
        public final Drawable getInactiveTrackDrawable() {
            return this.inactiveTrackDrawable;
        }

        public final void setInactiveTrackDrawable(@Nullable Drawable drawable) {
            this.inactiveTrackDrawable = drawable;
        }

        public final int getStartPosition() {
            return this.startPosition;
        }

        public final void setStartPosition(int i) {
            this.startPosition = i;
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final void setEndPosition(int i) {
            this.endPosition = i;
        }
    }

    /* compiled from: SliderView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u0004*\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/yandex/div/internal/widget/slider/SliderView$Companion;", "", "()V", "boundsHeight", "", "Landroid/graphics/drawable/Drawable;", "getBoundsHeight", "(Landroid/graphics/drawable/Drawable;)I", "boundsWidth", "getBoundsWidth", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getBoundsWidth(@Nullable Drawable drawable) {
            Rect bounds;
            if (drawable == null || (bounds = drawable.getBounds()) == null) {
                return 0;
            }
            return bounds.width();
        }

        public final int getBoundsHeight(@Nullable Drawable drawable) {
            Rect bounds;
            if (drawable == null || (bounds = drawable.getBounds()) == null) {
                return 0;
            }
            return bounds.height();
        }
    }
}
