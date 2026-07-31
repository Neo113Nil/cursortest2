package com.yandex.div.core.tooltip;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewGroupKt;
import com.safedk.android.internal.special.SpecialsBridge;
import com.yandex.div.R;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivTooltip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTooltipController.kt */
@Metadata(d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001.\b\u0011\u0018\u00002\u00020\u0001B]\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\"\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000ej\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015B9\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0016J/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0012¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u000fH\u0012¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020\u0019H\u0012¢\u0006\u0004\b&\u0010'J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020(H\u0012¢\u0006\u0004\b&\u0010)J/\u0010*\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0012¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010-\u001a\u00020,H\u0012¢\u0006\u0004\b/\u00100J'\u00104\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u000fH\u0012¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00102\u001a\u000201H\u0012¢\u0006\u0004\b6\u00107J)\u0010\u001f\u001a\u00020\u001e2\u0006\u00108\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u00109J\u001f\u0010<\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020,H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b\"\u0010>J\u000f\u0010?\u001a\u00020\u001cH\u0016¢\u0006\u0004\b?\u0010@J'\u0010C\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u000f2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u001eH\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u0004\u0018\u00010\u000f2\u0006\u0010:\u001a\u00020%H\u0016¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010MR\u0014\u0010\r\u001a\u00020\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\r\u0010NR0\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000ej\u0002`\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010OR \u0010B\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020(0P8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bB\u0010QR\u0014\u0010S\u001a\u00020R8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lcom/yandex/div/core/tooltip/DivTooltipController;", "", "Lcom/yandex/div/core/DivTooltipRestrictor;", "tooltipRestrictor", "Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "divVisibilityActionTracker", "Lcom/yandex/div/core/DivPreloader;", "divPreloader", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "errorCollectors", "Lcom/yandex/div/core/tooltip/DivTooltipViewBuilder;", "divTooltipViewBuilder", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "accessibilityStateProvider", "Lkotlin/Function3;", "Landroid/view/View;", "", "Lcom/yandex/div/core/util/SafePopupWindow;", "Lcom/yandex/div/core/tooltip/CreatePopupCall;", "createPopup", "<init>", "(Lcom/yandex/div/core/DivTooltipRestrictor;Lcom/yandex/div/core/view2/DivVisibilityActionTracker;Lcom/yandex/div/core/DivPreloader;Lcom/yandex/div/core/view2/errors/ErrorCollectors;Lcom/yandex/div/core/tooltip/DivTooltipViewBuilder;Lcom/yandex/div/core/util/AccessibilityStateProvider;Lkotlin/jvm/functions/Function3;)V", "(Lcom/yandex/div/core/DivTooltipRestrictor;Lcom/yandex/div/core/view2/DivVisibilityActionTracker;Lcom/yandex/div/core/DivPreloader;Lcom/yandex/div/core/tooltip/DivTooltipViewBuilder;Lcom/yandex/div/core/util/AccessibilityStateProvider;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "Lcom/yandex/div/core/view2/BindingContext;", "context", "Lcom/yandex/div2/DivTooltip;", "divTooltip", "anchor", "", "multiple", "", "showTooltip", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/DivTooltip;Landroid/view/View;Z)V", "view", "cancelTooltips", "(Landroid/view/View;)V", "tooltip", "", "dismissTooltip", "(Lcom/yandex/div2/DivTooltip;)Ljava/lang/String;", "Lcom/yandex/div/core/tooltip/TooltipData;", "(Lcom/yandex/div/core/tooltip/TooltipData;)Ljava/lang/String;", "tryShowTooltip", "(Landroid/view/View;Lcom/yandex/div2/DivTooltip;Lcom/yandex/div/core/view2/BindingContext;Z)V", "Lcom/yandex/div/core/view2/Div2View;", "divView", "com/yandex/div/core/tooltip/DivTooltipController$createOnBackPressCallback$1", "createOnBackPressCallback", "(Lcom/yandex/div2/DivTooltip;Lcom/yandex/div/core/view2/Div2View;)Lcom/yandex/div/core/tooltip/DivTooltipController$createOnBackPressCallback$1;", "Lcom/yandex/div2/Div;", "div", "tooltipView", "startVisibilityTracking", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/Div;Landroid/view/View;)V", "stopVisibilityTracking", "(Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div2/Div;)V", "tooltipId", "(Ljava/lang/String;Lcom/yandex/div/core/view2/BindingContext;Z)V", "id", "div2View", "hideTooltip", "(Ljava/lang/String;Lcom/yandex/div/core/view2/Div2View;)V", "(Lcom/yandex/div/core/view2/Div2View;)V", "cancelAllTooltips", "()Z", "", "tooltips", "mapTooltip", "(Landroid/view/View;Ljava/util/List;)V", "clear", "()V", "findViewWithTag", "(Ljava/lang/String;)Landroid/view/View;", "Lcom/yandex/div/core/DivTooltipRestrictor;", "Lcom/yandex/div/core/view2/DivVisibilityActionTracker;", "Lcom/yandex/div/core/DivPreloader;", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "Lcom/yandex/div/core/tooltip/DivTooltipViewBuilder;", "Lcom/yandex/div/core/util/AccessibilityStateProvider;", "Lkotlin/jvm/functions/Function3;", "", "Ljava/util/Map;", "Landroid/os/Handler;", "mainThreadHandler", "Landroid/os/Handler;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes3.dex */
public class DivTooltipController {

    @NotNull
    private final AccessibilityStateProvider accessibilityStateProvider;

    @NotNull
    private final Function3 createPopup;

    @NotNull
    private final DivPreloader divPreloader;

    @NotNull
    private final DivTooltipViewBuilder divTooltipViewBuilder;

    @NotNull
    private final DivVisibilityActionTracker divVisibilityActionTracker;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final Handler mainThreadHandler;

    @NotNull
    private final DivTooltipRestrictor tooltipRestrictor;

    @NotNull
    private final Map<String, TooltipData> tooltips;

    @VisibleForTesting
    public DivTooltipController(@NotNull DivTooltipRestrictor divTooltipRestrictor, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull DivPreloader divPreloader, @NotNull ErrorCollectors errorCollectors, @NotNull DivTooltipViewBuilder divTooltipViewBuilder, @NotNull AccessibilityStateProvider accessibilityStateProvider, @NotNull Function3 function3) {
        this.tooltipRestrictor = divTooltipRestrictor;
        this.divVisibilityActionTracker = divVisibilityActionTracker;
        this.divPreloader = divPreloader;
        this.errorCollectors = errorCollectors;
        this.divTooltipViewBuilder = divTooltipViewBuilder;
        this.accessibilityStateProvider = accessibilityStateProvider;
        this.createPopup = function3;
        this.tooltips = new LinkedHashMap();
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    public DivTooltipController(@NotNull DivTooltipRestrictor divTooltipRestrictor, @NotNull DivVisibilityActionTracker divVisibilityActionTracker, @NotNull DivPreloader divPreloader, @NotNull DivTooltipViewBuilder divTooltipViewBuilder, @NotNull AccessibilityStateProvider accessibilityStateProvider, @NotNull ErrorCollectors errorCollectors) {
        this(divTooltipRestrictor, divVisibilityActionTracker, divPreloader, errorCollectors, divTooltipViewBuilder, accessibilityStateProvider, new Function3() { // from class: com.yandex.div.core.tooltip.DivTooltipController.1
            @NotNull
            public final SafePopupWindow invoke(@NotNull View view, int i, int i2) {
                return new DivTooltipWindow(view, i, i2, false, 8, null);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((View) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ void showTooltip$default(DivTooltipController divTooltipController, String str, BindingContext bindingContext, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTooltip");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        divTooltipController.showTooltip(str, bindingContext, z);
    }

    public void showTooltip(@NotNull String tooltipId, @NotNull BindingContext context, boolean multiple) {
        Pair findChildWithTooltip;
        Unit unit;
        findChildWithTooltip = DivTooltipControllerKt.findChildWithTooltip(tooltipId, context.getDivView());
        if (findChildWithTooltip != null) {
            showTooltip(context, (DivTooltip) findChildWithTooltip.component1(), (View) findChildWithTooltip.component2(), multiple);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            DivActionTypedUtilsKt.logError(context.getDivView(), new IllegalStateException("Unable to find view for tooltip '" + tooltipId + '\''));
        }
    }

    private void showTooltip(final BindingContext context, final DivTooltip divTooltip, final View anchor, final boolean multiple) {
        if (this.tooltips.containsKey(divTooltip.id)) {
            return;
        }
        if (!ViewsKt.isActuallyLaidOut(anchor) || anchor.isLayoutRequested()) {
            anchor.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$showTooltip$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    DivTooltipController.this.tryShowTooltip(anchor, divTooltip, context, multiple);
                }
            });
        } else {
            tryShowTooltip(anchor, divTooltip, context, multiple);
        }
        if (ViewsKt.isActuallyLaidOut(anchor) || anchor.isLayoutRequested()) {
            return;
        }
        anchor.requestLayout();
    }

    public void hideTooltip(@NotNull String id, @NotNull Div2View div2View) {
        SafePopupWindow popupWindow;
        TooltipData tooltipData = this.tooltips.get(id);
        if (tooltipData == null || (popupWindow = tooltipData.getPopupWindow()) == null) {
            return;
        }
        popupWindow.dismiss();
    }

    public void cancelTooltips(@NotNull Div2View divView) {
        Intrinsics.checkNotNull(divView, "null cannot be cast to non-null type android.view.View");
        cancelTooltips((View) divView);
    }

    private void cancelTooltips(View view) {
        Object tag = view.getTag(R.id.div_tooltips_tag);
        List list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String dismissTooltip = dismissTooltip((DivTooltip) it.next());
                if (dismissTooltip != null) {
                    arrayList.add(dismissTooltip);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.tooltips.remove((String) it2.next());
            }
        }
        if (view instanceof ViewGroup) {
            Iterator it3 = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it3.hasNext()) {
                cancelTooltips((View) it3.next());
            }
        }
    }

    public boolean cancelAllTooltips() {
        if (this.tooltips.isEmpty()) {
            return false;
        }
        Iterator it = CollectionsKt.toList(this.tooltips.values()).iterator();
        while (it.hasNext()) {
            dismissTooltip((TooltipData) it.next());
        }
        this.tooltips.clear();
        return true;
    }

    private String dismissTooltip(DivTooltip tooltip) {
        TooltipData tooltipData = this.tooltips.get(tooltip.id);
        if (tooltipData == null) {
            return null;
        }
        return dismissTooltip(tooltipData);
    }

    private String dismissTooltip(TooltipData tooltip) {
        tooltip.setDismissed(true);
        DivPreloader.Ticket ticket = tooltip.getTicket();
        if (ticket != null) {
            ticket.cancel();
        }
        if (tooltip.getPopupWindow().isShowing()) {
            DivTooltipAnimationKt.clearAnimation(tooltip.getPopupWindow());
            tooltip.getPopupWindow().dismiss();
            return null;
        }
        stopVisibilityTracking(tooltip.getBindingContext(), tooltip.getDiv());
        return tooltip.getId();
    }

    public void mapTooltip(@NotNull View view, @Nullable List<DivTooltip> tooltips) {
        SpecialsBridge.yandexViewSetTag(view, R.id.div_tooltips_tag, tooltips);
    }

    public void clear() {
        for (Map.Entry<String, TooltipData> entry : this.tooltips.entrySet()) {
            entry.getValue().getPopupWindow().dismiss();
            DivPreloader.Ticket ticket = entry.getValue().getTicket();
            if (ticket != null) {
                ticket.cancel();
            }
        }
        this.tooltips.clear();
        this.mainThreadHandler.removeCallbacksAndMessages(null);
    }

    @Nullable
    public View findViewWithTag(@NotNull String id) {
        Set<Map.Entry<String, TooltipData>> entrySet = this.tooltips.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            View contentView = ((TooltipData) ((Map.Entry) it.next()).getValue()).getPopupWindow().getContentView();
            if (contentView != null) {
                arrayList.add(contentView);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View findViewWithTag = ((View) it2.next()).findViewWithTag(id);
            if (findViewWithTag != null) {
                return findViewWithTag;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryShowTooltip(final View anchor, final DivTooltip divTooltip, final BindingContext context, final boolean multiple) {
        boolean shouldDismissByOutsideTouch;
        boolean isModal;
        boolean isModal2;
        boolean isModal3;
        final Div2View divView = context.getDivView();
        if (this.tooltipRestrictor.canShowTooltip(divView, anchor, divTooltip, multiple)) {
            final ExpressionResolver expressionResolver = context.getExpressionResolver();
            final Div div = divTooltip.div;
            DisplayMetrics displayMetrics = anchor.getResources().getDisplayMetrics();
            int layoutParamsSize$default = DivUtilKt.toLayoutParamsSize$default(divTooltip.div.value().getWidth(), displayMetrics, expressionResolver, null, 4, null);
            int layoutParamsSize$default2 = DivUtilKt.toLayoutParamsSize$default(divTooltip.div.value().getHeight(), displayMetrics, expressionResolver, null, 4, null);
            final DivTooltipContainer buildTooltipView = this.divTooltipViewBuilder.buildTooltipView(context, div, layoutParamsSize$default, layoutParamsSize$default2);
            final View tooltipView = buildTooltipView.getTooltipView();
            if (tooltipView == null) {
                return;
            }
            final SafePopupWindow safePopupWindow = (SafePopupWindow) this.createPopup.invoke(buildTooltipView, Integer.valueOf(layoutParamsSize$default), Integer.valueOf(layoutParamsSize$default2));
            safePopupWindow.setTouchable(true);
            shouldDismissByOutsideTouch = DivTooltipControllerKt.shouldDismissByOutsideTouch(divTooltip, expressionResolver);
            safePopupWindow.setOutsideTouchable(shouldDismissByOutsideTouch);
            if (Build.VERSION.SDK_INT < 29) {
                isModal = DivTooltipControllerKt.isModal(divTooltip);
                safePopupWindow.setFocusable(isModal);
            } else {
                safePopupWindow.setFocusable(true);
                isModal3 = DivTooltipControllerKt.isModal(divTooltip);
                safePopupWindow.setTouchModal(isModal3);
            }
            isModal2 = DivTooltipControllerKt.isModal(divTooltip);
            safePopupWindow.setTouchInterceptor(new PopupWindowTouchListener(safePopupWindow, tooltipView, isModal2, safePopupWindow.isOutsideTouchable(), divTooltip.tapOutsideActions, context));
            DivTooltipAnimationKt.setupAnimation(safePopupWindow, divTooltip, expressionResolver);
            DivPreloader.Ticket ticket = null;
            final TooltipData tooltipData = new TooltipData(divTooltip.id, context, div, safePopupWindow, ticket, createOnBackPressCallback(divTooltip, divView), false, 64, null);
            safePopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$$ExternalSyntheticLambda1
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    DivTooltipController.tryShowTooltip$lambda$15(DivTooltipController.this, divTooltip, context, buildTooltipView, divView, anchor, safePopupWindow, tooltipData);
                }
            });
            this.tooltips.put(divTooltip.id, tooltipData);
            DivPreloader.Ticket preload = this.divPreloader.preload(div, expressionResolver, new DivPreloader.Callback() { // from class: com.yandex.div.core.tooltip.DivTooltipController$$ExternalSyntheticLambda2
                @Override // com.yandex.div.core.DivPreloader.Callback
                public final void finish(boolean z) {
                    DivTooltipController.tryShowTooltip$lambda$18(TooltipData.this, anchor, this, divView, divTooltip, multiple, buildTooltipView, safePopupWindow, tooltipView, expressionResolver, context, div, z);
                }
            });
            TooltipData tooltipData2 = this.tooltips.get(divTooltip.id);
            if (tooltipData2 == null) {
                return;
            }
            tooltipData2.setTicket(preload);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryShowTooltip$lambda$15(DivTooltipController divTooltipController, DivTooltip divTooltip, BindingContext bindingContext, DivTooltipContainer divTooltipContainer, Div2View div2View, View view, SafePopupWindow safePopupWindow, TooltipData tooltipData) {
        divTooltipController.tooltips.remove(divTooltip.id);
        divTooltipController.stopVisibilityTracking(bindingContext, divTooltip.div);
        Div div = divTooltipController.divVisibilityActionTracker.getDivWithWaitingDisappearActions().get(divTooltipContainer);
        if (div != null) {
            divTooltipController.divVisibilityActionTracker.trackDetachedView(bindingContext, divTooltipContainer, div);
        }
        DivTooltipRestrictor.DivTooltipShownCallback tooltipShownCallback = divTooltipController.tooltipRestrictor.getTooltipShownCallback();
        if (tooltipShownCallback != null) {
            tooltipShownCallback.onDivTooltipDismissed(div2View, view, divTooltip);
        }
        DivTooltipControllerKt.removeBackPressedCallback(safePopupWindow, tooltipData, divTooltipController.accessibilityStateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryShowTooltip$lambda$18(TooltipData tooltipData, final View view, final DivTooltipController divTooltipController, final Div2View div2View, final DivTooltip divTooltip, boolean z, final DivTooltipContainer divTooltipContainer, final SafePopupWindow safePopupWindow, final View view2, final ExpressionResolver expressionResolver, final BindingContext bindingContext, final Div div, boolean z2) {
        SafePopupWindow safePopupWindow2;
        Rect windowFrame;
        if (z2 || tooltipData.getDismissed() || !view.isAttachedToWindow() || !divTooltipController.tooltipRestrictor.canShowTooltip(div2View, view, divTooltip, z)) {
            return;
        }
        if (ViewsKt.isActuallyLaidOut(divTooltipContainer) && !divTooltipContainer.isLayoutRequested()) {
            windowFrame = DivTooltipControllerKt.getWindowFrame(div2View);
            Point calcPopupLocation = DivTooltipControllerKt.calcPopupLocation(view2, view, divTooltip, expressionResolver);
            int min = Math.min(view2.getWidth(), windowFrame.width());
            int min2 = Math.min(view2.getHeight(), windowFrame.height());
            if (min < view2.getWidth()) {
                divTooltipController.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip width > screen size, width was changed"));
            }
            if (min2 < view2.getHeight()) {
                divTooltipController.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip height > screen size, height was changed"));
            }
            safePopupWindow.update(calcPopupLocation.x, calcPopupLocation.y, min, min2);
            divTooltipController.startVisibilityTracking(bindingContext, div, divTooltipContainer);
            DivTooltipRestrictor.DivTooltipShownCallback tooltipShownCallback = divTooltipController.tooltipRestrictor.getTooltipShownCallback();
            if (tooltipShownCallback != null) {
                tooltipShownCallback.onDivTooltipShown(div2View, view, divTooltip);
            }
            safePopupWindow2 = safePopupWindow;
        } else {
            safePopupWindow2 = safePopupWindow;
            divTooltipContainer.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda$18$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view3, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Rect windowFrame2;
                    view3.removeOnLayoutChangeListener(this);
                    windowFrame2 = DivTooltipControllerKt.getWindowFrame(Div2View.this);
                    Point calcPopupLocation2 = DivTooltipControllerKt.calcPopupLocation(view2, view, divTooltip, expressionResolver);
                    int min3 = Math.min(view2.getWidth(), windowFrame2.width());
                    int min4 = Math.min(view2.getHeight(), windowFrame2.height());
                    if (min3 < view2.getWidth()) {
                        divTooltipController.errorCollectors.getOrCreate(Div2View.this.getDataTag(), Div2View.this.getDivData()).logWarning(new Throwable("Tooltip width > screen size, width was changed"));
                    }
                    if (min4 < view2.getHeight()) {
                        divTooltipController.errorCollectors.getOrCreate(Div2View.this.getDataTag(), Div2View.this.getDivData()).logWarning(new Throwable("Tooltip height > screen size, height was changed"));
                    }
                    safePopupWindow.update(calcPopupLocation2.x, calcPopupLocation2.y, min3, min4);
                    divTooltipController.startVisibilityTracking(bindingContext, div, divTooltipContainer);
                    DivTooltipRestrictor.DivTooltipShownCallback tooltipShownCallback2 = divTooltipController.tooltipRestrictor.getTooltipShownCallback();
                    if (tooltipShownCallback2 != null) {
                        tooltipShownCallback2.onDivTooltipShown(Div2View.this, view, divTooltip);
                    }
                }
            });
        }
        safePopupWindow2.showAtLocation(view, 0, 0, 0);
        DivTooltipControllerKt.sendAccessibilityEventUnchecked(32, view2, divTooltipController.accessibilityStateProvider);
        if (((Number) divTooltip.duration.evaluate(expressionResolver)).longValue() != 0) {
            divTooltipController.mainThreadHandler.postDelayed(new Runnable() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda$18$$inlined$postDelayed$default$1
                @Override // java.lang.Runnable
                public final void run() {
                    DivTooltipController.this.hideTooltip(divTooltip.id, div2View);
                }
            }, ((Number) divTooltip.duration.evaluate(expressionResolver)).longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.activity.OnBackPressedCallback, com.yandex.div.core.tooltip.DivTooltipController$createOnBackPressCallback$1] */
    private DivTooltipController$createOnBackPressCallback$1 createOnBackPressCallback(final DivTooltip divTooltip, final Div2View divView) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (!this.accessibilityStateProvider.isAccessibilityEnabled(divView.getContext())) {
            return null;
        }
        ?? r0 = new OnBackPressedCallback() { // from class: com.yandex.div.core.tooltip.DivTooltipController$createOnBackPressCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                DivTooltipController.this.hideTooltip(divTooltip.id, divView);
            }
        };
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = ViewTreeOnBackPressedDispatcherOwner.get(divView);
        if (onBackPressedDispatcherOwner != null && (onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher()) != 0) {
            onBackPressedDispatcher.addCallback(r0);
            return r0;
        }
        DivActionTypedUtilsKt.logError(divView, new AssertionError("Can't find onBackPressedDispatcher to set on back press listener on tooltip."));
        Assert.fail("Can't find onBackPressedDispatcher to set on back press listener on tooltip.");
        Unit unit = Unit.INSTANCE;
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startVisibilityTracking(BindingContext context, Div div, View tooltipView) {
        stopVisibilityTracking(context, div);
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, context.getDivView(), context.getExpressionResolver(), tooltipView, div, null, null, 48, null);
    }

    private void stopVisibilityTracking(BindingContext context, Div div) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, context.getDivView(), context.getExpressionResolver(), null, div, null, null, 48, null);
    }
}
