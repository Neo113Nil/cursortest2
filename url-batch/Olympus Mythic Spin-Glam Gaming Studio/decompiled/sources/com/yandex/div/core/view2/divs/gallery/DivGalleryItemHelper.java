package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.X3;
import com.yandex.div.R;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivGallery;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivGalleryItemHelper.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 O2\u00020\u0001:\u0001OJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u0017H&J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\bH&J0\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0017H\u0016J:\u0010&\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00172\b\b\u0002\u0010'\u001a\u00020\u0010H\u0016J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010)\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\n\u0010*\u001a\u00060+R\u00020\u0013H\u0016J\u0012\u0010,\u001a\u00020\u001b2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0014\u0010/\u001a\u00020\u001b2\n\u0010*\u001a\u00060+R\u00020\u0013H\u0016J\u0010\u00100\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0010\u00101\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016J\u0010\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020\bH\u0016J\b\u00104\u001a\u00020\u0017H&J\b\u00105\u001a\u00020\u0017H&J8\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u0010H\u0016J\u0012\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020\u0017H&J\b\u0010@\u001a\u00020\u0017H&J$\u0010A\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u00172\b\b\u0002\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020\u0017H\u0016J\u0018\u0010E\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u00172\u0006\u0010B\u001a\u00020CH&J \u0010F\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u00172\u0006\u0010D\u001a\u00020\u00172\u0006\u0010B\u001a\u00020CH&J\b\u0010G\u001a\u00020\u0017H&J\b\u0010H\u001a\u00020\u0017H&J0\u0010I\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0017H&J\b\u0010J\u001a\u00020KH&J\u001a\u0010L\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010M\u001a\u00020\u0010H\u0016J\b\u0010N\u001a\u00020\u0017H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006PÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper;", "", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext", "()Lcom/yandex/div/core/view2/BindingContext;", "childrenToRelayout", "", "Landroid/view/View;", "getChildrenToRelayout", "()Ljava/util/Set;", "div", "Lcom/yandex/div2/DivGallery;", "getDiv", "()Lcom/yandex/div2/DivGallery;", "isHorizontal", "", "()Z", "view", "Landroidx/recyclerview/widget/RecyclerView;", "getView", "()Landroidx/recyclerview/widget/RecyclerView;", "scrollOffset", "", "getScrollOffset", "(Landroid/view/View;)I", "_detachView", "", "child", "_detachViewAt", "index", "_getChildAt", "_getPosition", "_layoutDecorated", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "_layoutDecoratedWithMargins", "isRelayoutingChildren", "_onAttachedToWindow", "_onDetachedFromWindow", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "_onLayoutCompleted", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "_removeAndRecycleAllViews", "_removeView", "_removeViewAt", "calcScrollOffset", "targetView", "firstCompletelyVisibleItemPosition", "firstVisibleItemPosition", "getChildMeasureSpec", "parentSize", "parentMode", VastAttributes.PADDING, "childDimension", SDKConstants.PARAM_CONTEXT_MAX_SIZE, "canScroll", "getItemDiv", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", X3.i.L, "getLayoutManagerOrientation", "instantScroll", "scrollPosition", "Lcom/yandex/div/core/view2/divs/gallery/ScrollPosition;", "offset", "instantScrollToPosition", "instantScrollToPositionWithOffset", "lastCompletelyVisibleItemPosition", "lastVisibleItemPosition", "superLayoutDecoratedWithMargins", "toLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "trackVisibilityAction", "clear", "width", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DivGalleryItemHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: DivGalleryItemHelper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScrollPosition.values().length];
            try {
                iArr[ScrollPosition.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScrollPosition.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    View _getChildAt(int index);

    int _getPosition(@NotNull View child);

    int firstCompletelyVisibleItemPosition();

    int firstVisibleItemPosition();

    @NotNull
    BindingContext getBindingContext();

    @NotNull
    Set<View> getChildrenToRelayout();

    @NotNull
    DivGallery getDiv();

    @Nullable
    DivItemBuilderResult getItemDiv(int position);

    int getLayoutManagerOrientation();

    @NotNull
    RecyclerView getView();

    void instantScrollToPosition(int position, @NotNull ScrollPosition scrollPosition);

    void instantScrollToPositionWithOffset(int position, int offset, @NotNull ScrollPosition scrollPosition);

    int lastCompletelyVisibleItemPosition();

    int lastVisibleItemPosition();

    void superLayoutDecoratedWithMargins(@NotNull View child, int left, int top, int right, int bottom);

    @NotNull
    RecyclerView.LayoutManager toLayoutManager();

    int width();

    default void _layoutDecorated(@NotNull View child, int left, int top, int right, int bottom) {
        trackVisibilityAction$default(this, child, false, 2, null);
    }

    default void _onLayoutCompleted(@Nullable RecyclerView.State state) {
        for (View view : getChildrenToRelayout()) {
            _layoutDecoratedWithMargins(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
        }
        getChildrenToRelayout().clear();
    }

    static /* synthetic */ void _layoutDecoratedWithMargins$default(DivGalleryItemHelper divGalleryItemHelper, View view, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: _layoutDecoratedWithMargins");
        }
        if ((i5 & 32) != 0) {
            z = false;
        }
        divGalleryItemHelper._layoutDecoratedWithMargins(view, i, i2, i3, i4, z);
    }

    default void _onAttachedToWindow(@NotNull RecyclerView view) {
        int childCount = view.getChildCount();
        for (int i = 0; i < childCount; i++) {
            trackVisibilityAction$default(this, view.getChildAt(i), false, 2, null);
        }
    }

    default void _onDetachedFromWindow(@NotNull RecyclerView view, @NotNull RecyclerView.Recycler recycler) {
        int childCount = view.getChildCount();
        for (int i = 0; i < childCount; i++) {
            trackVisibilityAction(view.getChildAt(i), true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (r3 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        if (r0 == null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default void _layoutDecoratedWithMargins(@NotNull View child, int left, int top, int right, int bottom, boolean isRelayoutingChildren) {
        ExpressionResolver expressionResolver;
        int i;
        int i2;
        DivGallery.CrossContentAlignment crossContentAlignment;
        Object evaluate;
        DivGallery.CrossContentAlignment crossContentAlignment2;
        Object evaluate2;
        Div div;
        int layoutManagerOrientation = getLayoutManagerOrientation();
        int measuredWidth = (getView().getMeasuredWidth() - getView().getPaddingLeft()) - getView().getPaddingRight();
        int measuredHeight = (getView().getMeasuredHeight() - getView().getPaddingTop()) - getView().getPaddingBottom();
        if (layoutManagerOrientation == 0 ? getView().getMeasuredHeight() == 0 || measuredHeight == 0 || child.getMeasuredHeight() == 0 : layoutManagerOrientation == 1 && (getView().getMeasuredWidth() == 0 || measuredWidth == 0 || child.getMeasuredWidth() == 0)) {
            superLayoutDecoratedWithMargins(child, left, top, right, bottom);
            if (isRelayoutingChildren) {
                return;
            }
            getChildrenToRelayout().add(child);
            return;
        }
        Integer num = (Integer) child.getTag(R.id.div_gallery_item_index);
        DivItemBuilderResult itemDiv = num != null ? getItemDiv(num.intValue()) : null;
        DivBase value = (itemDiv == null || (div = itemDiv.getDiv()) == null) ? null : div.value();
        if (itemDiv == null || (expressionResolver = itemDiv.getExpressionResolver()) == null) {
            expressionResolver = getBindingContext().getExpressionResolver();
        }
        Expression expression = getDiv().crossContentAlignment;
        if (layoutManagerOrientation == 1) {
            Expression alignmentHorizontal = value != null ? value.getAlignmentHorizontal() : null;
            if (alignmentHorizontal != null && (evaluate2 = alignmentHorizontal.evaluate(expressionResolver)) != null) {
                crossContentAlignment2 = INSTANCE.asCrossContentAlignment((DivAlignmentHorizontal) evaluate2);
            }
            crossContentAlignment2 = (DivGallery.CrossContentAlignment) expression.evaluate(expressionResolver);
            i = INSTANCE.calculateOffset(measuredWidth, right - left, crossContentAlignment2);
        } else {
            i = 0;
        }
        if (layoutManagerOrientation == 0) {
            Expression alignmentVertical = value != null ? value.getAlignmentVertical() : null;
            if (alignmentVertical != null && (evaluate = alignmentVertical.evaluate(expressionResolver)) != null) {
                crossContentAlignment = INSTANCE.asCrossContentAlignment((DivAlignmentVertical) evaluate);
            }
            crossContentAlignment = (DivGallery.CrossContentAlignment) expression.evaluate(expressionResolver);
            i2 = INSTANCE.calculateOffset(measuredHeight, bottom - top, crossContentAlignment);
        } else {
            i2 = 0;
        }
        superLayoutDecoratedWithMargins(child, left + i, top + i2, right + i, bottom + i2);
        trackVisibilityAction$default(this, child, false, 2, null);
        if (isRelayoutingChildren) {
            return;
        }
        getChildrenToRelayout().remove(child);
    }

    static /* synthetic */ void instantScroll$default(DivGalleryItemHelper divGalleryItemHelper, int i, ScrollPosition scrollPosition, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: instantScroll");
        }
        if ((i3 & 2) != 0) {
            scrollPosition = ScrollPosition.DEFAULT;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        divGalleryItemHelper.instantScroll(i, scrollPosition, i2);
    }

    default void instantScroll(final int position, @NotNull final ScrollPosition scrollPosition, final int offset) {
        RecyclerView view = getView();
        if (!ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper$instantScroll$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    if (position == 0) {
                        int i = (this.isHorizontal() && ViewsKt.isLayoutRtl(this.getView())) ? offset : -offset;
                        this.getView().scrollBy(i, i);
                        return;
                    }
                    this.getView().scrollBy(-this.getView().getScrollX(), -this.getView().getScrollY());
                    RecyclerView.LayoutManager layoutManager = this.getView().getLayoutManager();
                    View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(position) : null;
                    while (findViewByPosition == null && (this.getView().canScrollVertically(1) || this.getView().canScrollHorizontally(1))) {
                        RecyclerView.LayoutManager layoutManager2 = this.getView().getLayoutManager();
                        if (layoutManager2 != null) {
                            layoutManager2.requestLayout();
                        }
                        RecyclerView.LayoutManager layoutManager3 = this.getView().getLayoutManager();
                        findViewByPosition = layoutManager3 != null ? layoutManager3.findViewByPosition(position) : null;
                        if (findViewByPosition != null) {
                            break;
                        } else {
                            this.getView().scrollBy(this.getView().getWidth(), this.getView().getHeight());
                        }
                    }
                    if (findViewByPosition != null) {
                        int i2 = DivGalleryItemHelper.WhenMappings.$EnumSwitchMapping$0[scrollPosition.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                return;
                            }
                            int scrollOffset = this.getScrollOffset(findViewByPosition) - offset;
                            if (ViewsKt.isLayoutRtl(this.getView())) {
                                scrollOffset = -scrollOffset;
                            }
                            this.getView().scrollBy(scrollOffset, scrollOffset);
                            return;
                        }
                        int[] iArr = {0, 0};
                        int[] iArr2 = {0, 0};
                        this.getView().getLocationOnScreen(iArr2);
                        findViewByPosition.getLocationOnScreen(iArr);
                        this.getView().scrollBy(((findViewByPosition.getWidth() - this.getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((findViewByPosition.getHeight() - this.getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
                    }
                }
            });
            return;
        }
        if (position == 0) {
            if (!isHorizontal() || !ViewsKt.isLayoutRtl(getView())) {
                offset = -offset;
            }
            getView().scrollBy(offset, offset);
            return;
        }
        getView().scrollBy(-getView().getScrollX(), -getView().getScrollY());
        RecyclerView.LayoutManager layoutManager = getView().getLayoutManager();
        View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(position) : null;
        while (findViewByPosition == null && (getView().canScrollVertically(1) || getView().canScrollHorizontally(1))) {
            RecyclerView.LayoutManager layoutManager2 = getView().getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.requestLayout();
            }
            RecyclerView.LayoutManager layoutManager3 = getView().getLayoutManager();
            findViewByPosition = layoutManager3 != null ? layoutManager3.findViewByPosition(position) : null;
            if (findViewByPosition != null) {
                break;
            } else {
                getView().scrollBy(getView().getWidth(), getView().getHeight());
            }
        }
        if (findViewByPosition != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[scrollPosition.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                int scrollOffset = getScrollOffset(findViewByPosition) - offset;
                if (ViewsKt.isLayoutRtl(getView())) {
                    scrollOffset = -scrollOffset;
                }
                getView().scrollBy(scrollOffset, scrollOffset);
                return;
            }
            int[] iArr = {0, 0};
            int[] iArr2 = {0, 0};
            getView().getLocationOnScreen(iArr2);
            findViewByPosition.getLocationOnScreen(iArr);
            getView().scrollBy(((findViewByPosition.getWidth() - getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((findViewByPosition.getHeight() - getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    default boolean isHorizontal() {
        return getLayoutManagerOrientation() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    default int getScrollOffset(View view) {
        int marginStart;
        int paddingStart;
        if (!isHorizontal()) {
            int top = view.getTop();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            marginStart = top - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            paddingStart = getView().getPaddingTop();
        } else {
            int width = ViewsKt.isLayoutRtl(view) ? getView().getWidth() - view.getRight() : view.getLeft();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            marginStart = width - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0);
            paddingStart = getView().getPaddingStart();
        }
        return marginStart - paddingStart;
    }

    default int calcScrollOffset(@NotNull View targetView) {
        return getScrollOffset(targetView);
    }

    default void _removeAndRecycleAllViews(@NotNull RecyclerView.Recycler recycler) {
        RecyclerView view = getView();
        int childCount = view.getChildCount();
        for (int i = 0; i < childCount; i++) {
            trackVisibilityAction(view.getChildAt(i), true);
        }
    }

    default void _detachView(@NotNull View child) {
        trackVisibilityAction(child, true);
    }

    default void _detachViewAt(int index) {
        View _getChildAt = _getChildAt(index);
        if (_getChildAt == null) {
            return;
        }
        trackVisibilityAction(_getChildAt, true);
    }

    default void _removeView(@NotNull View child) {
        trackVisibilityAction(child, true);
    }

    default void _removeViewAt(int index) {
        View _getChildAt = _getChildAt(index);
        if (_getChildAt == null) {
            return;
        }
        trackVisibilityAction(_getChildAt, true);
    }

    static /* synthetic */ void trackVisibilityAction$default(DivGalleryItemHelper divGalleryItemHelper, View view, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackVisibilityAction");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        divGalleryItemHelper.trackVisibilityAction(view, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    default void trackVisibilityAction(@NotNull View child, boolean clear) {
        View view;
        BindingContext bindingContext;
        int _getPosition = _getPosition(child);
        if (_getPosition == -1) {
            return;
        }
        ViewGroup viewGroup = child instanceof ViewGroup ? (ViewGroup) child : null;
        if (viewGroup == null || (view = (View) SequencesKt.firstOrNull(ViewGroupKt.getChildren(viewGroup))) == 0) {
            return;
        }
        Div2View divView = getBindingContext().getDivView();
        if (clear) {
            Div takeBindingDiv$div_release = divView.takeBindingDiv$div_release(view);
            if (takeBindingDiv$div_release == null) {
                return;
            }
            DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
            if (divHolderView == null || (bindingContext = divHolderView.getBindingContext()) == null) {
                return;
            }
            divView.getDiv2Component().getVisibilityActionTracker().cancelTrackingViewsHierarchy(bindingContext, view, takeBindingDiv$div_release);
            divView.unbindViewFromDiv$div_release(view);
            return;
        }
        DivItemBuilderResult itemDiv = getItemDiv(_getPosition);
        if (itemDiv == null) {
            return;
        }
        divView.getDiv2Component().getVisibilityActionTracker().startTrackingViewsHierarchy(getBindingContext().getFor(itemDiv.getExpressionResolver()), view, itemDiv.getDiv());
        divView.bindViewToDiv$div_release(view, itemDiv.getDiv());
    }

    /* compiled from: DivGalleryItemHelper.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJP\u0010\u0012\u001a\u00020\u0007\"\b\b\u0000\u0010\u000b*\u00020\u0001*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0010H\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0011\u001a\u00020\u0007*\u00020\u0014H\u0002¢\u0006\u0004\b\u0011\u0010\u0015J\u0013\u0010\u0011\u001a\u00020\u0007*\u00020\u0016H\u0002¢\u0006\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryItemHelper$Companion;", "", "<init>", "()V", "", "totalSpace", "decoratedMeasurement", "Lcom/yandex/div2/DivGallery$CrossContentAlignment;", "crossContentAlignment", "calculateOffset", "(IILcom/yandex/div2/DivGallery$CrossContentAlignment;)I", "T", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "parentAlignment", "Lkotlin/Function1;", "asCrossContentAlignment", "evaluateAlignment", "(Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/json/expressions/Expression;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div2/DivGallery$CrossContentAlignment;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "(Lcom/yandex/div2/DivAlignmentHorizontal;)Lcom/yandex/div2/DivGallery$CrossContentAlignment;", "Lcom/yandex/div2/DivAlignmentVertical;", "(Lcom/yandex/div2/DivAlignmentVertical;)Lcom/yandex/div2/DivGallery$CrossContentAlignment;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: DivGalleryItemHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[DivGallery.CrossContentAlignment.values().length];
                try {
                    iArr[DivGallery.CrossContentAlignment.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DivGallery.CrossContentAlignment.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DivGallery.CrossContentAlignment.END.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[DivAlignmentHorizontal.values().length];
                try {
                    iArr2[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.START.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.END.ordinal()] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[DivAlignmentVertical.values().length];
                try {
                    iArr3[DivAlignmentVertical.TOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[DivAlignmentVertical.BASELINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[DivAlignmentVertical.CENTER.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[DivAlignmentVertical.BOTTOM.ordinal()] = 4;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int calculateOffset(int totalSpace, int decoratedMeasurement, DivGallery.CrossContentAlignment crossContentAlignment) {
            int i = totalSpace - decoratedMeasurement;
            int i2 = WhenMappings.$EnumSwitchMapping$0[crossContentAlignment.ordinal()];
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return i / 2;
            }
            if (i2 == 3) {
                return i;
            }
            throw new NoWhenBranchMatchedException();
        }

        private final <T> DivGallery.CrossContentAlignment evaluateAlignment(Expression<T> expression, ExpressionResolver expressionResolver, Expression<DivGallery.CrossContentAlignment> expression2, Function1 function1) {
            T evaluate;
            DivGallery.CrossContentAlignment crossContentAlignment;
            return (expression == null || (evaluate = expression.evaluate(expressionResolver)) == null || (crossContentAlignment = (DivGallery.CrossContentAlignment) function1.invoke(evaluate)) == null) ? expression2.evaluate(expressionResolver) : crossContentAlignment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DivGallery.CrossContentAlignment asCrossContentAlignment(DivAlignmentHorizontal divAlignmentHorizontal) {
            int i = WhenMappings.$EnumSwitchMapping$1[divAlignmentHorizontal.ordinal()];
            if (i == 1) {
                return DivGallery.CrossContentAlignment.START;
            }
            if (i == 2) {
                return DivGallery.CrossContentAlignment.CENTER;
            }
            if (i == 3) {
                return DivGallery.CrossContentAlignment.END;
            }
            if (i == 4) {
                return DivGallery.CrossContentAlignment.START;
            }
            if (i == 5) {
                return DivGallery.CrossContentAlignment.END;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DivGallery.CrossContentAlignment asCrossContentAlignment(DivAlignmentVertical divAlignmentVertical) {
            int i = WhenMappings.$EnumSwitchMapping$2[divAlignmentVertical.ordinal()];
            if (i == 1 || i == 2) {
                return DivGallery.CrossContentAlignment.START;
            }
            if (i == 3) {
                return DivGallery.CrossContentAlignment.CENTER;
            }
            if (i == 4) {
                return DivGallery.CrossContentAlignment.END;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    default int getChildMeasureSpec(int parentSize, int parentMode, int padding, int childDimension, int maxSize, boolean canScroll) {
        int coerceAtLeast = RangesKt.coerceAtLeast(parentSize - padding, 0);
        if (childDimension >= 0 && childDimension <= Integer.MAX_VALUE) {
            return com.yandex.div.core.widget.ViewsKt.makeExactSpec(childDimension);
        }
        if (childDimension == -1) {
            if (canScroll && parentMode == 0) {
                return com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec();
            }
            return View.MeasureSpec.makeMeasureSpec(coerceAtLeast, parentMode);
        }
        if (childDimension == -2) {
            return maxSize == Integer.MAX_VALUE ? com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec() : com.yandex.div.core.widget.ViewsKt.makeAtMostSpec(maxSize);
        }
        if (childDimension != -3) {
            return com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec();
        }
        if (parentMode == Integer.MIN_VALUE || parentMode == 1073741824) {
            return com.yandex.div.core.widget.ViewsKt.makeAtMostSpec(Math.min(coerceAtLeast, maxSize));
        }
        if (maxSize == Integer.MAX_VALUE) {
            return com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec();
        }
        return com.yandex.div.core.widget.ViewsKt.makeAtMostSpec(maxSize);
    }
}
