package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.MainThread;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewGroupKt;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.UtilsKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAspect;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPivotFixed;
import com.yandex.div2.DivPivotPercentage;
import com.yandex.div2.DivSightAction;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivVisibilityAction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseDivViewExtensions.kt */
@Metadata(d1 = {"\u0000æ\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fH\u0000\u001a)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\fH\u0002¢\u0006\u0002\b\u0012\u001a \u0010\u0013\u001a\u00020\u0006*\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0000\u001a\u001d\u0010\u0018\u001a\u00020\u0006*\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0002\b \u001a@\u0010!\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060\fH\u0000\u001a\u0019\u0010)\u001a\u00020\u0006*\u00020*2\u0006\u0010+\u001a\u00020\u0011H\u0002¢\u0006\u0002\b,\u001a¤\u0001\u0010-\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\"\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010.2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010&2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010&2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010&2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010&2\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010&2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010&2\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010&2\u0006\u00106\u001a\u0002072\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001109H\u0000\u001a\u0019\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010;\u001a\u00020<H\u0002¢\u0006\u0002\b=\u001a\u001e\u0010>\u001a\u00020\u0006*\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001e\u0010A\u001a\u00020\u0006*\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001c\u0010B\u001a\u00020\u0006*\u00020\u00022\u0006\u0010C\u001a\u00020D2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a(\u0010E\u001a\u00020\u0006*\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a2\u0010I\u001a\u00020\u0006*\u00020*2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u0011092\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001092\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001c\u0010L\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u00012\u0006\u0010M\u001a\u00020NH\u0000\u001a\u0014\u0010O\u001a\u00020\u0006*\u00020\u00022\u0006\u0010P\u001a\u00020QH\u0000\u001a<\u0010R\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u0011\u0018\u00010S*\u00020\u00022\u0006\u0010\"\u001a\u00020\u00012\b\u0010U\u001a\u0004\u0018\u0001072\b\u0010V\u001a\u0004\u0018\u00010WH\u0000\u001a\u0014\u0010X\u001a\u00020\u0006*\u00020\u00022\u0006\u0010Y\u001a\u00020ZH\u0000\u001a\f\u0010[\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a)\u0010\\\u001a\u00020]*\u00020\u00022\u0006\u0010^\u001a\u00020<2\u0006\u0010_\u001a\u00020`2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\ba\u001a2\u0010b\u001a\u00020\u0006*\u00020*2\u0006\u0010c\u001a\u00020d2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020f0&2\u000e\u0010g\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010&H\u0001\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006h"}, d2 = {"bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "Landroid/view/View;", "getBindingContext", "(Landroid/view/View;)Lcom/yandex/div/core/view2/BindingContext;", "bindItemBuilder", "", "builder", "Lcom/yandex/div2/DivCollectionItemBuilder;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "callback", "Lkotlin/Function1;", "", "traverseViewHierarchy", "view", "action", "", "traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "applyAlignment", "horizontal", "Lcom/yandex/div2/DivAlignmentHorizontal;", "vertical", "Lcom/yandex/div2/DivAlignmentVertical;", "applyAspectRatio", "Lcom/yandex/div/core/widget/AspectView;", "ratio", "", "applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "(Lcom/yandex/div/core/widget/AspectView;Ljava/lang/Double;)V", "applyBaselineAlignment", "baselineAligned", "applyBaselineAlignment$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "applyBitmapFilters", "context", "bitmap", "Landroid/graphics/Bitmap;", "filters", "", "Lcom/yandex/div2/DivFilter;", "actionAfterFilters", "applyClipChildren", "Landroid/view/ViewGroup;", "clip", "applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "applyDivActions", "Lcom/yandex/div2/DivAction;", "actions", "longTapActions", "doubleTapActions", "hoverStartActions", "hoverEndActions", "pressStartActions", "pressEndActions", "actionAnimation", "Lcom/yandex/div2/DivAnimation;", "captureFocusOnAction", "Lcom/yandex/div/json/expressions/Expression;", "applyGravity", "newGravity", "", "applyGravity$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "applyMargins", "insets", "Lcom/yandex/div2/DivEdgeInsets;", "applyPaddings", "applyTransform", "div", "Lcom/yandex/div2/DivBase;", "bindAspectRatio", "newAspect", "Lcom/yandex/div2/DivAspect;", "oldAspect", "bindClipChildren", "newClipToBounds", "oldClipToBounds", "bindStates", "binder", "Lcom/yandex/div/core/view2/DivBinder;", "clearFocusOnClick", "focusTracker", "Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "createAnimatedTouchListener", "Lkotlin/Function2;", "Landroid/view/MotionEvent;", "divAnimation", "divGestureListener", "Lcom/yandex/div/core/view2/DivGestureListener;", "drawShadow", "canvas", "Landroid/graphics/Canvas;", "gainAccessibilityFocus", "getPivotValue", "", "len", "divPivot", "Lcom/yandex/div2/DivPivot;", "getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt", "trackVisibilityActions", "divView", "Lcom/yandex/div/core/view2/Div2View;", "newItems", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "oldItems", "div_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "com/yandex/div/core/view2/divs/BaseDivViewExtensionsKt")
/* loaded from: classes8.dex */
final /* synthetic */ class BaseDivViewExtensionsKt__BaseDivViewExtensionsKt {

    /* compiled from: BaseDivViewExtensions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivSizeUnit.values().length];
            try {
                iArr[DivSizeUnit.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivSizeUnit.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivSizeUnit.SP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void drawShadow(@NotNull View view, @NotNull Canvas canvas) {
        DivBorderDrawer borderDrawer;
        int save = canvas.save();
        try {
            canvas.translate(view.getX(), view.getY());
            canvas.rotate(view.getRotation(), view.getPivotX(), view.getPivotY());
            DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
            if (divBorderSupports != null && (borderDrawer = divBorderSupports.getBorderDrawer()) != null) {
                borderDrawer.drawShadow(canvas);
            }
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public static final void applyPaddings(@NotNull View view, @Nullable DivEdgeInsets divEdgeInsets, @NotNull ExpressionResolver expressionResolver) {
        if (divEdgeInsets == null) {
            view.setPadding(0, 0, 0, 0);
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        DivSizeUnit divSizeUnit = (DivSizeUnit) divEdgeInsets.unit.evaluate(expressionResolver);
        Expression expression = divEdgeInsets.start;
        if (expression != null || divEdgeInsets.end != null) {
            int px = expression != null ? BaseDivViewExtensionsKt.toPx(((Number) expression.evaluate(expressionResolver)).longValue(), divSizeUnit, displayMetrics) : 0;
            int px2 = BaseDivViewExtensionsKt.toPx(((Number) divEdgeInsets.top.evaluate(expressionResolver)).longValue(), divSizeUnit, displayMetrics);
            Expression expression2 = divEdgeInsets.end;
            view.setPaddingRelative(px, px2, expression2 != null ? BaseDivViewExtensionsKt.toPx(((Number) expression2.evaluate(expressionResolver)).longValue(), divSizeUnit, displayMetrics) : 0, BaseDivViewExtensionsKt.toPx(((Number) divEdgeInsets.bottom.evaluate(expressionResolver)).longValue(), divSizeUnit, displayMetrics));
            return;
        }
        view.setPadding(BaseDivViewExtensionsKt.toPx(((Number) divEdgeInsets.left.evaluate(expressionResolver)).longValue(), divSizeUnit, displayMetrics), BaseDivViewExtensionsKt.toPx(((Number) divEdgeInsets.top.evaluate(expressionResolver)).longValue(), divSizeUnit, displayMetrics), BaseDivViewExtensionsKt.toPx(((Number) divEdgeInsets.right.evaluate(expressionResolver)).longValue(), divSizeUnit, displayMetrics), BaseDivViewExtensionsKt.toPx(((Number) divEdgeInsets.bottom.evaluate(expressionResolver)).longValue(), divSizeUnit, displayMetrics));
    }

    public static final void applyMargins(@NotNull View view, @Nullable DivEdgeInsets divEdgeInsets, @NotNull ExpressionResolver expressionResolver) {
        int i;
        int i2;
        int i3;
        int i4;
        Integer num;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        if (divEdgeInsets != null) {
            DivSizeUnit divSizeUnit = (DivSizeUnit) divEdgeInsets.unit.evaluate(expressionResolver);
            i = BaseDivViewExtensionsKt.unitToPx((Long) divEdgeInsets.left.evaluate(expressionResolver), displayMetrics, divSizeUnit);
            i2 = BaseDivViewExtensionsKt.unitToPx((Long) divEdgeInsets.top.evaluate(expressionResolver), displayMetrics, divSizeUnit);
            i3 = BaseDivViewExtensionsKt.unitToPx((Long) divEdgeInsets.right.evaluate(expressionResolver), displayMetrics, divSizeUnit);
            i4 = BaseDivViewExtensionsKt.unitToPx((Long) divEdgeInsets.bottom.evaluate(expressionResolver), displayMetrics, divSizeUnit);
            Expression expression = divEdgeInsets.start;
            Integer valueOf = expression != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx((Long) expression.evaluate(expressionResolver), displayMetrics, divSizeUnit)) : null;
            Expression expression2 = divEdgeInsets.end;
            num = expression2 != null ? Integer.valueOf(BaseDivViewExtensionsKt.unitToPx((Long) expression2.evaluate(expressionResolver), displayMetrics, divSizeUnit)) : null;
            r3 = valueOf;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            num = null;
        }
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4 && ((r3 == null || marginLayoutParams.getMarginStart() == r3.intValue()) && (num == null || marginLayoutParams.getMarginEnd() == num.intValue()))) {
            return;
        }
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = i4;
        if (r3 != null || num != null) {
            marginLayoutParams.setMarginStart(r3 != null ? r3.intValue() : 0);
            marginLayoutParams.setMarginEnd(num != null ? num.intValue() : 0);
        } else {
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i3;
        }
        view.requestLayout();
    }

    public static final void applyTransform(@NotNull final View view, @NotNull DivBase divBase, @NotNull final ExpressionResolver expressionResolver) {
        Unit unit;
        Expression expression;
        final DivTransform transform = divBase.getTransform();
        if (transform == null || (expression = transform.rotation) == null) {
            unit = null;
        } else {
            view.setRotation((float) ((Number) expression.evaluate(expressionResolver)).doubleValue());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            view.setRotation(0.0f);
        } else if (view.getWidth() == 0 && view.getHeight() == 0) {
            OneShotPreDrawListener.add(view, new Runnable() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$applyTransform$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    float pivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt;
                    float pivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt2;
                    View view2 = view;
                    pivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt = BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view2, view2.getWidth(), transform.pivotX, expressionResolver);
                    view2.setPivotX(pivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt);
                    View view3 = view;
                    pivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt2 = BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view3, view3.getHeight(), transform.pivotY, expressionResolver);
                    view3.setPivotY(pivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt2);
                }
            });
        } else {
            view.setPivotX(getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, view.getWidth(), transform.pivotX, expressionResolver));
            view.setPivotY(getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, view.getHeight(), transform.pivotY, expressionResolver));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, int i, DivPivot divPivot, ExpressionResolver expressionResolver) {
        Object value = divPivot.value();
        if (value instanceof DivPivotFixed) {
            DivPivotFixed divPivotFixed = (DivPivotFixed) value;
            Expression expression = divPivotFixed.value;
            if (expression == null) {
                return i / 2.0f;
            }
            float longValue = ((Number) expression.evaluate(expressionResolver)).longValue();
            int i2 = WhenMappings.$EnumSwitchMapping$0[((DivSizeUnit) divPivotFixed.unit.evaluate(expressionResolver)).ordinal()];
            if (i2 == 1) {
                return BaseDivViewExtensionsKt.dpToPxF(Float.valueOf(longValue), view.getResources().getDisplayMetrics());
            }
            if (i2 == 2) {
                return longValue;
            }
            if (i2 == 3) {
                return BaseDivViewExtensionsKt.spToPxF(Float.valueOf(longValue), view.getResources().getDisplayMetrics());
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(value instanceof DivPivotPercentage)) {
            return i / 2.0f;
        }
        return i * (((float) ((Number) ((DivPivotPercentage) value).value.evaluate(expressionResolver)).doubleValue()) / 100.0f);
    }

    public static final void applyAlignment(@NotNull View view, @Nullable DivAlignmentHorizontal divAlignmentHorizontal, @Nullable DivAlignmentVertical divAlignmentVertical) {
        applyGravity$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
        applyBaselineAlignment$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, divAlignmentVertical == DivAlignmentVertical.BASELINE);
    }

    private static final void applyGravity$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.getGravity() != i) {
                divLayoutParams.setGravity(i);
                view.requestLayout();
                return;
            }
            return;
        }
        Log.e("DivView", "tag=" + view.getTag() + ": Can't cast " + layoutParams + " to get gravity");
    }

    private static final void applyBaselineAlignment$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams == null || divLayoutParams.getIsBaselineAligned() == z) {
            return;
        }
        divLayoutParams.setBaselineAligned(z);
        view.requestLayout();
    }

    public static final void applyDivActions(@NotNull View view, @NotNull BindingContext bindingContext, @Nullable DivAction divAction, @Nullable List<DivAction> list, @Nullable List<DivAction> list2, @Nullable List<DivAction> list3, @Nullable List<DivAction> list4, @Nullable List<DivAction> list5, @Nullable List<DivAction> list6, @Nullable List<DivAction> list7, @NotNull DivAnimation divAnimation, @NotNull Expression<Boolean> expression) {
        List<DivAction> listOf;
        DivActionBinder actionBinder = bindingContext.getDivView().getDiv2Component().getActionBinder();
        List<DivAction> list8 = list;
        if (list8 == null || list8.isEmpty()) {
            listOf = divAction != null ? CollectionsKt.listOf(divAction) : null;
        } else {
            listOf = list;
        }
        actionBinder.bindDivActions(bindingContext, view, listOf, list2, list3, list4, list5, list6, list7, divAnimation, expression);
    }

    @Nullable
    public static final Function2 createAnimatedTouchListener(@NotNull View view, @NotNull BindingContext bindingContext, @Nullable DivAnimation divAnimation, @Nullable DivGestureListener divGestureListener) {
        final GestureDetector gestureDetector;
        final Function2 asTouchListener = divAnimation != null ? UtilsKt.asTouchListener(divAnimation, bindingContext.getExpressionResolver(), view) : null;
        if (divGestureListener != null) {
            if (((divGestureListener.getOnSingleTapListener() == null && divGestureListener.getOnDoubleTapListener() == null) ? null : divGestureListener) != null) {
                gestureDetector = new GestureDetector(bindingContext.getDivView().getContext(), divGestureListener, new Handler(Looper.getMainLooper()));
                if (asTouchListener == null || gestureDetector != null) {
                    return new Function2() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$createAnimatedTouchListener$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @NotNull
                        public final Boolean invoke(@NotNull View view2, @NotNull MotionEvent motionEvent) {
                            Function2 function2 = Function2.this;
                            if (function2 != null) {
                                function2.invoke(view2, motionEvent);
                            }
                            GestureDetector gestureDetector2 = gestureDetector;
                            return Boolean.valueOf(gestureDetector2 != null ? gestureDetector2.onTouchEvent(motionEvent) : false);
                        }
                    };
                }
                return null;
            }
        }
        gestureDetector = null;
        if (asTouchListener == null) {
        }
        return new Function2() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$createAnimatedTouchListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final Boolean invoke(@NotNull View view2, @NotNull MotionEvent motionEvent) {
                Function2 function2 = Function2.this;
                if (function2 != null) {
                    function2.invoke(view2, motionEvent);
                }
                GestureDetector gestureDetector2 = gestureDetector;
                return Boolean.valueOf(gestureDetector2 != null ? gestureDetector2.onTouchEvent(motionEvent) : false);
            }
        };
    }

    public static final void bindStates(@NotNull View view, @NotNull final BindingContext bindingContext, @NotNull final DivBinder divBinder) {
        traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, new Function1() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$bindStates$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull View view2) {
                DivStatePath path;
                if (!(view2 instanceof DivStateLayout)) {
                    return Boolean.TRUE;
                }
                DivStateLayout divStateLayout = (DivStateLayout) view2;
                Div.State div = divStateLayout.getDiv();
                if (div != null && (path = divStateLayout.getPath()) != null) {
                    DivBinder.this.bind(bindingContext, view2, div, path.parentState());
                    return Boolean.FALSE;
                }
                return Boolean.FALSE;
            }
        });
    }

    private static final void traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, Function1 function1) {
        if (((Boolean) function1.invoke(view)).booleanValue() && (view instanceof ViewGroup)) {
            Iterator it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt((View) it.next(), function1);
            }
        }
    }

    @MainThread
    public static final void trackVisibilityActions(@NotNull final ViewGroup viewGroup, @NotNull final Div2View div2View, @NotNull final List<DivItemBuilderResult> list, @Nullable List<DivItemBuilderResult> list2) {
        final DivVisibilityActionTracker visibilityActionTracker = div2View.getDiv2Component().getVisibilityActionTracker();
        List<DivItemBuilderResult> list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, DivUtilKt.getAllSightActions(((DivItemBuilderResult) it.next()).getDiv().value()));
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashSet.add(((DivSightAction) it2.next()).getLogId());
            }
            for (DivItemBuilderResult divItemBuilderResult : list2) {
                List<DivVisibilityAction> allAppearActions = DivUtilKt.getAllAppearActions(divItemBuilderResult.getDiv().value());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : allAppearActions) {
                    if (!hashSet.contains(((DivVisibilityAction) obj).getLogId())) {
                        arrayList2.add(obj);
                    }
                }
                List<DivDisappearAction> allDisappearActions = DivUtilKt.getAllDisappearActions(divItemBuilderResult.getDiv().value());
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : allDisappearActions) {
                    if (!hashSet.contains(((DivDisappearAction) obj2).getLogId())) {
                        arrayList3.add(obj2);
                    }
                }
                visibilityActionTracker.trackVisibilityActionsOf(div2View, divItemBuilderResult.getExpressionResolver(), null, divItemBuilderResult.getDiv(), arrayList2, arrayList3);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$trackVisibilityActions$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                for (Pair pair : SequencesKt.zip(ViewGroupKt.getChildren(viewGroup), CollectionsKt.asSequence(list))) {
                    View view2 = (View) pair.component1();
                    DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) pair.component2();
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, div2View, divItemBuilderResult2.getExpressionResolver(), view2, divItemBuilderResult2.getDiv(), null, null, 48, null);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindAspectRatio(@NotNull final View view, @Nullable DivAspect divAspect, @Nullable DivAspect divAspect2, @NotNull ExpressionResolver expressionResolver) {
        Expression expression;
        Expression expression2;
        if (view instanceof AspectView) {
            Disposable disposable = null;
            if (ExpressionsKt.equalsToConstant(divAspect != null ? divAspect.ratio : null, divAspect2 != null ? divAspect2.ratio : null)) {
                return;
            }
            applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt((AspectView) view, (divAspect == null || (expression2 = divAspect.ratio) == null) ? null : (Double) expression2.evaluate(expressionResolver));
            if (ExpressionsKt.isConstantOrNull(divAspect != null ? divAspect.ratio : null) || !(view instanceof ExpressionSubscriber)) {
                return;
            }
            ExpressionSubscriber expressionSubscriber = (ExpressionSubscriber) view;
            if (divAspect != null && (expression = divAspect.ratio) != null) {
                disposable = expression.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$bindAspectRatio$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).doubleValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(double d) {
                        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt((AspectView) view, Double.valueOf(d));
                    }
                });
            }
            expressionSubscriber.addSubscription(disposable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(AspectView aspectView, Double d) {
        aspectView.setAspectRatio(d != null ? (float) d.doubleValue() : 0.0f);
    }

    public static final void applyBitmapFilters(@NotNull final View view, @NotNull BindingContext bindingContext, @NotNull final Bitmap bitmap, @Nullable final List<? extends DivFilter> list, @NotNull final Function1 function1) {
        int i;
        List<? extends DivFilter> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            function1.invoke(bitmap);
            return;
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final BitmapEffectHelper bitmapEffectHelper = bindingContext.getDivView().getDiv2Component().getBitmapEffectHelper();
        if (!ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$applyBitmapFilters$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    int i2;
                    view2.removeOnLayoutChangeListener(this);
                    float max = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (r4.getWidth() * max), (int) (max * bitmap.getHeight()), false);
                    for (DivFilter divFilter : list) {
                        if (divFilter instanceof DivFilter.Blur) {
                            long longValue = ((Number) ((DivFilter.Blur) divFilter).getValue().radius.evaluate(expressionResolver)).longValue();
                            long j = longValue >> 31;
                            if (j == 0 || j == -1) {
                                i2 = (int) longValue;
                            } else {
                                KAssert kAssert = KAssert.INSTANCE;
                                if (Assert.isEnabled()) {
                                    Assert.fail("Unable convert '" + longValue + "' to Int");
                                }
                                i2 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                            }
                            createScaledBitmap = bitmapEffectHelper.blurBitmap(createScaledBitmap, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i2), view.getResources().getDisplayMetrics()));
                        } else if ((divFilter instanceof DivFilter.RtlMirror) && ViewsKt.isLayoutRtl(view)) {
                            createScaledBitmap = bitmapEffectHelper.mirrorBitmap(createScaledBitmap);
                        }
                    }
                    function1.invoke(createScaledBitmap);
                }
            });
            return;
        }
        float max = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * max), (int) (max * bitmap.getHeight()), false);
        for (DivFilter divFilter : list) {
            if (divFilter instanceof DivFilter.Blur) {
                long longValue = ((Number) ((DivFilter.Blur) divFilter).getValue().radius.evaluate(expressionResolver)).longValue();
                long j = longValue >> 31;
                if (j == 0 || j == -1) {
                    i = (int) longValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + longValue + "' to Int");
                    }
                    i = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                createScaledBitmap = bitmapEffectHelper.blurBitmap(createScaledBitmap, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i), view.getResources().getDisplayMetrics()));
            } else if ((divFilter instanceof DivFilter.RtlMirror) && ViewsKt.isLayoutRtl(view)) {
                createScaledBitmap = bitmapEffectHelper.mirrorBitmap(createScaledBitmap);
            }
        }
        function1.invoke(createScaledBitmap);
    }

    public static final void clearFocusOnClick(@NotNull View view, @NotNull InputFocusTracker inputFocusTracker) {
        if (view.isFocused() || !view.isInTouchMode()) {
            return;
        }
        inputFocusTracker.removeFocusFromFocusedInput();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final BindingContext getBindingContext(@NotNull View view) {
        DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
        if (divHolderView != null) {
            return divHolderView.getBindingContext();
        }
        return null;
    }

    public static final void bindItemBuilder(@NotNull DivCollectionItemBuilder divCollectionItemBuilder, @NotNull ExpressionResolver expressionResolver, @NotNull Function1 function1) {
        divCollectionItemBuilder.data.observe(expressionResolver, function1);
        ExpressionResolver itemResolver = DivCollectionExtensionsKt.getItemResolver(divCollectionItemBuilder, expressionResolver);
        Iterator it = divCollectionItemBuilder.prototypes.iterator();
        while (it.hasNext()) {
            ((DivCollectionItemBuilder.Prototype) it.next()).selector.observe(itemResolver, function1);
        }
    }

    public static final void gainAccessibilityFocus(@NotNull View view) {
        view.performAccessibilityAction(64, null);
        view.sendAccessibilityEvent(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindClipChildren(@NotNull final ViewGroup viewGroup, @NotNull Expression<Boolean> expression, @Nullable Expression<Boolean> expression2, @NotNull ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(expression, expression2)) {
            return;
        }
        applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(viewGroup, expression.evaluate(expressionResolver).booleanValue());
        if (ExpressionsKt.isConstant(expression)) {
            return;
        }
        DivHolderView divHolderView = viewGroup instanceof DivHolderView ? (DivHolderView) viewGroup : null;
        if (divHolderView != null) {
            divHolderView.addSubscription(expression.observe(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$bindClipChildren$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(viewGroup, z);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(ViewGroup viewGroup, boolean z) {
        DivHolderView divHolderView = viewGroup instanceof DivHolderView ? (DivHolderView) viewGroup : null;
        if (divHolderView != null) {
            divHolderView.setNeedClipping(z);
        }
        ViewParent parent = viewGroup.getParent();
        if (z || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).setClipChildren(false);
    }
}
