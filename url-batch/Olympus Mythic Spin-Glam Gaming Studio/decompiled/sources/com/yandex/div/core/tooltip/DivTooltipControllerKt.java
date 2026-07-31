package com.yandex.div.core.tooltip;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewGroupKt;
import com.yandex.div.R;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTooltipMode;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTooltipController.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001b\u001a\u00020\u0018*\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&*<\b\u0000\u0010)\"\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020(0'2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020(0'¨\u0006*"}, d2 = {"", "tooltipId", "Landroid/view/View;", "view", "Lkotlin/Pair;", "Lcom/yandex/div2/DivTooltip;", "findChildWithTooltip", "(Ljava/lang/String;Landroid/view/View;)Lkotlin/Pair;", "popupView", "anchor", "divTooltip", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Landroid/graphics/Point;", "calcPopupLocation", "(Landroid/view/View;Landroid/view/View;Lcom/yandex/div2/DivTooltip;Lcom/yandex/div/json/expressions/ExpressionResolver;)Landroid/graphics/Point;", "Landroid/widget/PopupWindow;", "Lcom/yandex/div/core/tooltip/TooltipData;", "data", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "accessibilityStateProvider", "", "removeBackPressedCallback", "(Landroid/widget/PopupWindow;Lcom/yandex/div/core/tooltip/TooltipData;Lcom/yandex/div/core/util/AccessibilityStateProvider;)V", "", "isModal", "(Lcom/yandex/div2/DivTooltip;)Z", "shouldDismissByOutsideTouch", "(Lcom/yandex/div2/DivTooltip;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lcom/yandex/div/core/view2/Div2View;", "Landroid/graphics/Rect;", "getWindowFrame", "(Lcom/yandex/div/core/view2/Div2View;)Landroid/graphics/Rect;", "", "event", "sendAccessibilityEventUnchecked", "(ILandroid/view/View;Lcom/yandex/div/core/util/AccessibilityStateProvider;)V", "CANT_FIND_ON_BACKPRESS_DISPATCHER", "Ljava/lang/String;", "Lkotlin/Function3;", "Lcom/yandex/div/core/util/SafePopupWindow;", "CreatePopupCall", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DivTooltipControllerKt {

    @NotNull
    private static final String CANT_FIND_ON_BACKPRESS_DISPATCHER = "Can't find onBackPressedDispatcher to set on back press listener on tooltip.";

    /* compiled from: DivTooltipController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivTooltip.Position.values().length];
            try {
                iArr[DivTooltip.Position.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivTooltip.Position.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivTooltip.Position.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivTooltip.Position.TOP_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivTooltip.Position.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivTooltip.Position.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DivTooltip.Position.TOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DivTooltip.Position.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DivTooltip.Position.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<DivTooltip, View> findChildWithTooltip(String str, View view) {
        Object tag = view.getTag(R.id.div_tooltips_tag);
        List<DivTooltip> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (DivTooltip divTooltip : list) {
                if (Intrinsics.areEqual(divTooltip.id, str)) {
                    return TuplesKt.to(divTooltip, view);
                }
            }
        }
        if (view instanceof ViewGroup) {
            Iterator it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                Pair<DivTooltip, View> findChildWithTooltip = findChildWithTooltip(str, (View) it.next());
                if (findChildWithTooltip != null) {
                    return findChildWithTooltip;
                }
            }
        }
        return null;
    }

    @VisibleForTesting
    @NotNull
    public static final Point calcPopupLocation(@NotNull View view, @NotNull View view2, @NotNull DivTooltip divTooltip, @NotNull ExpressionResolver expressionResolver) {
        int i;
        int height;
        DivDimension divDimension;
        DivDimension divDimension2;
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int i2 = 0;
        Point point = new Point(iArr[0], iArr[1]);
        DivTooltip.Position position = (DivTooltip.Position) divTooltip.position.evaluate(expressionResolver);
        int i3 = point.x;
        int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr2[position.ordinal()]) {
            case 1:
            case 2:
            case 3:
                i = -view.getWidth();
                break;
            case 4:
            case 5:
            case 6:
                i = view2.getWidth();
                break;
            case 7:
            case 8:
            case 9:
                i = (view2.getWidth() - view.getWidth()) / 2;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        point.x = i3 + i;
        int i4 = point.y;
        switch (iArr2[position.ordinal()]) {
            case 1:
            case 5:
            case 9:
                height = (view2.getHeight() - view.getHeight()) / 2;
                break;
            case 2:
            case 4:
            case 7:
                height = -view.getHeight();
                break;
            case 3:
            case 6:
            case 8:
                height = view2.getHeight();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        point.y = i4 + height;
        DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
        int i5 = point.x;
        DivPoint divPoint = divTooltip.offset;
        point.x = i5 + ((divPoint == null || (divDimension2 = divPoint.x) == null) ? 0 : BaseDivViewExtensionsKt.toPx(divDimension2, displayMetrics, expressionResolver));
        int i6 = point.y;
        DivPoint divPoint2 = divTooltip.offset;
        if (divPoint2 != null && (divDimension = divPoint2.y) != null) {
            i2 = BaseDivViewExtensionsKt.toPx(divDimension, displayMetrics, expressionResolver);
        }
        point.y = i6 + i2;
        return point;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeBackPressedCallback(PopupWindow popupWindow, TooltipData tooltipData, AccessibilityStateProvider accessibilityStateProvider) {
        sendAccessibilityEventUnchecked(32, popupWindow.getContentView(), accessibilityStateProvider);
        OnBackPressedCallback onBackPressedCallback = tooltipData.getOnBackPressedCallback();
        if (onBackPressedCallback == null) {
            return;
        }
        onBackPressedCallback.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isModal(DivTooltip divTooltip) {
        return divTooltip.mode instanceof DivTooltipMode.Modal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldDismissByOutsideTouch(DivTooltip divTooltip, ExpressionResolver expressionResolver) {
        return ((Boolean) divTooltip.closeByTapOutside.evaluate(expressionResolver)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getWindowFrame(Div2View div2View) {
        Rect rect = new Rect();
        div2View.getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendAccessibilityEventUnchecked(int i, View view, AccessibilityStateProvider accessibilityStateProvider) {
        AccessibilityEvent obtain;
        if (view != null && accessibilityStateProvider.isAccessibilityEnabled(view.getContext())) {
            if (Build.VERSION.SDK_INT >= 30) {
                obtain = DivTooltipControllerKt$$ExternalSyntheticApiModelOutline0.m(i);
            } else {
                obtain = AccessibilityEvent.obtain(i);
            }
            view.sendAccessibilityEventUnchecked(obtain);
        }
    }
}
