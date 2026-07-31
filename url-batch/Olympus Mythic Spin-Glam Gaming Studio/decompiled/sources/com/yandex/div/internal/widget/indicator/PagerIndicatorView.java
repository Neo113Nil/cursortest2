package com.yandex.div.internal.widget.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import com.yandex.div.internal.widget.indicator.animations.IndicatorAnimatorKt;
import com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawerKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PagerIndicatorView.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eJ\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0014J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u001f\u001a\u00020\u0016*\u00020\u0012H\u0002R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/yandex/div/internal/widget/indicator/PagerIndicatorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentAdapter", "Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;", "getCurrentAdapter", "()Lcom/yandex/div/core/view2/divs/pager/DivPagerAdapter;", "divPager", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "onPageChangeListener", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "stripDrawer", "Lcom/yandex/div/internal/widget/indicator/IndicatorsStripDrawer;", "style", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;", "attachPager", "", "newDivPager", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setStyle", "update", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public class PagerIndicatorView extends View {

    @Nullable
    private DivPagerView divPager;

    @NotNull
    private final ViewPager2.OnPageChangeCallback onPageChangeListener;

    @Nullable
    private IndicatorsStripDrawer stripDrawer;

    @Nullable
    private IndicatorParams.Style style;

    public PagerIndicatorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public PagerIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    public /* synthetic */ PagerIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PagerIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onPageChangeListener = new ViewPager2.OnPageChangeCallback() { // from class: com.yandex.div.internal.widget.indicator.PagerIndicatorView$onPageChangeListener$1
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            
                if (r5 > 1.0f) goto L6;
             */
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                IndicatorsStripDrawer indicatorsStripDrawer;
                indicatorsStripDrawer = PagerIndicatorView.this.stripDrawer;
                if (indicatorsStripDrawer != null) {
                    PagerIndicatorView pagerIndicatorView = PagerIndicatorView.this;
                    float f = positionOffset >= 0.0f ? 1.0f : 0.0f;
                    positionOffset = f;
                    indicatorsStripDrawer.onPageScrolled(toRealPosition(position), positionOffset);
                    pagerIndicatorView.invalidate();
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                IndicatorsStripDrawer indicatorsStripDrawer;
                indicatorsStripDrawer = PagerIndicatorView.this.stripDrawer;
                if (indicatorsStripDrawer != null) {
                    PagerIndicatorView pagerIndicatorView = PagerIndicatorView.this;
                    indicatorsStripDrawer.onPageSelected(toRealPosition(position));
                    pagerIndicatorView.invalidate();
                }
            }

            private final int toRealPosition(int i2) {
                DivPagerAdapter currentAdapter;
                currentAdapter = PagerIndicatorView.this.getCurrentAdapter();
                return currentAdapter == null ? i2 : currentAdapter.realItemPosition(i2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DivPagerAdapter getCurrentAdapter() {
        ViewPager2 viewPager;
        DivPagerView divPagerView = this.divPager;
        RecyclerView.Adapter adapter = (divPagerView == null || (viewPager = divPagerView.getViewPager()) == null) ? null : viewPager.getAdapter();
        if (adapter instanceof DivPagerAdapter) {
            return (DivPagerAdapter) adapter;
        }
        return null;
    }

    public final void setStyle(@NotNull IndicatorParams.Style style) {
        this.style = style;
        IndicatorsStripDrawer indicatorsStripDrawer = new IndicatorsStripDrawer(style, SingleIndicatorDrawerKt.getIndicatorDrawer(style), IndicatorAnimatorKt.getIndicatorAnimator(style), this);
        indicatorsStripDrawer.calculateMaximumVisibleItems((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        update(indicatorsStripDrawer);
        this.stripDrawer = indicatorsStripDrawer;
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int paddingLeft;
        int paddingRight;
        int i;
        IndicatorsStripDrawer indicatorsStripDrawer;
        ViewPager2 viewPager;
        RecyclerView.Adapter adapter;
        IndicatorParams.Shape activeShape;
        IndicatorParams.ItemSize itemSize;
        IndicatorParams.Shape minimumShape;
        IndicatorParams.ItemSize itemSize2;
        IndicatorParams.Shape inactiveShape;
        IndicatorParams.ItemSize itemSize3;
        IndicatorParams.Shape activeShape2;
        IndicatorParams.ItemSize itemSize4;
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        IndicatorParams.Style style = this.style;
        float f = 0.0f;
        float height = (style == null || (activeShape2 = style.getActiveShape()) == null || (itemSize4 = activeShape2.getItemSize()) == null) ? 0.0f : itemSize4.getHeight();
        IndicatorParams.Style style2 = this.style;
        float height2 = (style2 == null || (inactiveShape = style2.getInactiveShape()) == null || (itemSize3 = inactiveShape.getItemSize()) == null) ? 0.0f : itemSize3.getHeight();
        IndicatorParams.Style style3 = this.style;
        int max = (int) (Math.max(height, Math.max(height2, (style3 == null || (minimumShape = style3.getMinimumShape()) == null || (itemSize2 = minimumShape.getItemSize()) == null) ? 0.0f : itemSize2.getHeight())) + getPaddingTop() + getPaddingBottom());
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(max, size);
        } else if (mode != 1073741824) {
            size = max;
        }
        int mode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(widthMeasureSpec);
        IndicatorParams.Style style4 = this.style;
        if (style4 != null && (activeShape = style4.getActiveShape()) != null && (itemSize = activeShape.getItemSize()) != null) {
            f = itemSize.getWidth();
        }
        IndicatorParams.Style style5 = this.style;
        IndicatorParams.ItemPlacement itemsPlacement = style5 != null ? style5.getItemsPlacement() : null;
        if (itemsPlacement instanceof IndicatorParams.ItemPlacement.Default) {
            float spaceBetweenCenters = ((IndicatorParams.ItemPlacement.Default) itemsPlacement).getSpaceBetweenCenters();
            DivPagerView divPagerView = this.divPager;
            paddingLeft = ((int) ((spaceBetweenCenters * ((divPagerView == null || (viewPager = divPagerView.getViewPager()) == null || (adapter = viewPager.getAdapter()) == null) ? 0 : adapter.getItemCount())) + f)) + getPaddingLeft();
            paddingRight = getPaddingRight();
        } else {
            if (itemsPlacement instanceof IndicatorParams.ItemPlacement.Stretch) {
                i = size2;
                if (mode2 != Integer.MIN_VALUE) {
                    size2 = Math.min(i, size2);
                } else if (mode2 != 1073741824) {
                    size2 = i;
                }
                setMeasuredDimension(size2, size);
                indicatorsStripDrawer = this.stripDrawer;
                if (indicatorsStripDrawer == null) {
                    indicatorsStripDrawer.calculateMaximumVisibleItems((size2 - getPaddingLeft()) - getPaddingRight(), (size - getPaddingTop()) - getPaddingBottom());
                    return;
                }
                return;
            }
            if (itemsPlacement == null) {
                paddingLeft = ((int) f) + getPaddingLeft();
                paddingRight = getPaddingRight();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        i = paddingLeft + paddingRight;
        if (mode2 != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size2, size);
        indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer == null) {
        }
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        IndicatorsStripDrawer indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer != null) {
            indicatorsStripDrawer.onDraw(canvas);
        }
    }

    public final void attachPager(@NotNull DivPagerView newDivPager) {
        DivPagerView divPagerView = this.divPager;
        if (divPagerView != null) {
            divPagerView.removeChangePageCallbackForIndicators(this.onPageChangeListener);
        }
        newDivPager.addChangePageCallbackForIndicators(this.onPageChangeListener);
        if (newDivPager == this.divPager) {
            return;
        }
        this.divPager = newDivPager;
        if (newDivPager.getViewPager().getAdapter() == null) {
            throw new IllegalArgumentException("Attached pager adapter is null!");
        }
        IndicatorsStripDrawer indicatorsStripDrawer = this.stripDrawer;
        if (indicatorsStripDrawer != null) {
            update(indicatorsStripDrawer);
        }
        newDivPager.setPagerOnItemsCountChange$div_release(new DivPagerView.OnItemsUpdatedCallback() { // from class: com.yandex.div.internal.widget.indicator.PagerIndicatorView$$ExternalSyntheticLambda0
            @Override // com.yandex.div.core.view2.divs.widgets.DivPagerView.OnItemsUpdatedCallback
            public final void onItemsUpdated() {
                PagerIndicatorView.attachPager$lambda$3(PagerIndicatorView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachPager$lambda$3(PagerIndicatorView pagerIndicatorView) {
        IndicatorsStripDrawer indicatorsStripDrawer = pagerIndicatorView.stripDrawer;
        if (indicatorsStripDrawer != null) {
            pagerIndicatorView.update(indicatorsStripDrawer);
        }
    }

    private final void update(IndicatorsStripDrawer indicatorsStripDrawer) {
        DivPagerAdapter currentAdapter = getCurrentAdapter();
        if (currentAdapter != null) {
            indicatorsStripDrawer.setItemsCount(currentAdapter.getVisibleItems().size());
            indicatorsStripDrawer.onPageSelected(currentAdapter.realItemPosition(currentAdapter.getCurrentItem()));
            invalidate();
        }
    }
}
