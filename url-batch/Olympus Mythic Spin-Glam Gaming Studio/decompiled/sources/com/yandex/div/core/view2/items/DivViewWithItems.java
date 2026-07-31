package com.yandex.div.core.view2.items;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivSizeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivViewWithItems.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u001d2\u00020\u0001:\u0005\u001d\u001e\u001f !B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0004H\u0016R\u0018\u0010\u0003\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006\u0082\u0001\u0004\"#$%¨\u0006&"}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems;", "", "()V", "currentItem", "", "getCurrentItem", "()I", "setCurrentItem", "(I)V", "itemCount", "getItemCount", "metrics", "Landroid/util/DisplayMetrics;", "getMetrics", "()Landroid/util/DisplayMetrics;", "scrollOffset", "getScrollOffset", "scrollRange", "getScrollRange", "scrollTo", "", "value", "sizeUnit", "Lcom/yandex/div2/DivSizeUnit;", "animated", "", "scrollToTheEnd", "setCurrentItemNoAnimation", "index", "Companion", "Gallery", "Pager", "PagingGallery", "Tabs", "Lcom/yandex/div/core/view2/items/DivViewWithItems$Gallery;", "Lcom/yandex/div/core/view2/items/DivViewWithItems$Pager;", "Lcom/yandex/div/core/view2/items/DivViewWithItems$PagingGallery;", "Lcom/yandex/div/core/view2/items/DivViewWithItems$Tabs;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class DivViewWithItems {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static DivViewWithItems viewForTests;
    private final int scrollOffset;
    private final int scrollRange;

    public /* synthetic */ DivViewWithItems(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getCurrentItem();

    public abstract int getItemCount();

    @NotNull
    public abstract DisplayMetrics getMetrics();

    public void scrollTo(int value, @NotNull DivSizeUnit sizeUnit, boolean animated) {
    }

    public void scrollToTheEnd(boolean animated) {
    }

    public abstract void setCurrentItem(int i);

    public void setCurrentItemNoAnimation(int index) {
    }

    private DivViewWithItems() {
    }

    public int getScrollRange() {
        return this.scrollRange;
    }

    public int getScrollOffset() {
        return this.scrollOffset;
    }

    public static /* synthetic */ void scrollTo$default(DivViewWithItems divViewWithItems, int i, DivSizeUnit divSizeUnit, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollTo");
        }
        if ((i2 & 2) != 0) {
            divSizeUnit = DivSizeUnit.PX;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        divViewWithItems.scrollTo(i, divSizeUnit, z);
    }

    public static /* synthetic */ void scrollToTheEnd$default(DivViewWithItems divViewWithItems, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToTheEnd");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        divViewWithItems.scrollToTheEnd(z);
    }

    /* compiled from: DivViewWithItems.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\bH\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$PagingGallery;", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "view", "Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "direction", "Lcom/yandex/div/core/view2/items/Direction;", "(Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;Lcom/yandex/div/core/view2/items/Direction;)V", "value", "", "currentItem", "getCurrentItem", "()I", "setCurrentItem", "(I)V", "itemCount", "getItemCount", "metrics", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "getMetrics", "()Landroid/util/DisplayMetrics;", "scrollOffset", "getScrollOffset", "scrollRange", "getScrollRange", "scrollTo", "", "sizeUnit", "Lcom/yandex/div2/DivSizeUnit;", "animated", "", "scrollToTheEnd", "setCurrentItemNoAnimation", "index", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PagingGallery extends DivViewWithItems {

        @NotNull
        private final Direction direction;
        private final DisplayMetrics metrics;

        @NotNull
        private final DivRecyclerView view;

        public PagingGallery(@NotNull DivRecyclerView divRecyclerView, @NotNull Direction direction) {
            super(null);
            this.view = divRecyclerView;
            this.direction = direction;
            this.metrics = divRecyclerView.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            int currentItem;
            currentItem = DivViewWithItemsKt.currentItem(this.view, this.direction);
            return currentItem;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i) {
            int itemCount = getItemCount();
            if (i >= 0 && i < itemCount) {
                this.view.smoothScrollToPosition(i);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            int itemCount;
            itemCount = DivViewWithItemsKt.getItemCount(this.view);
            return itemCount;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollRange() {
            int scrollRange;
            scrollRange = DivViewWithItemsKt.scrollRange(this.view);
            return scrollRange;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollOffset() {
            int scrollOffset;
            scrollOffset = DivViewWithItemsKt.scrollOffset(this.view);
            return scrollOffset;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollTo(int value, @NotNull DivSizeUnit sizeUnit, boolean animated) {
            DivViewWithItemsKt.scrollTo(this.view, value, sizeUnit, getMetrics(), animated);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean animated) {
            DivViewWithItemsKt.scrollToTheEnd(this.view, getMetrics(), animated);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int index) {
            int itemCount = getItemCount();
            if (index >= 0 && index < itemCount) {
                this.view.scrollToPosition(index);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(index + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    /* compiled from: DivViewWithItems.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\bH\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$Gallery;", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "view", "Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "direction", "Lcom/yandex/div/core/view2/items/Direction;", "(Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;Lcom/yandex/div/core/view2/items/Direction;)V", "value", "", "currentItem", "getCurrentItem", "()I", "setCurrentItem", "(I)V", "itemCount", "getItemCount", "metrics", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "getMetrics", "()Landroid/util/DisplayMetrics;", "scrollOffset", "getScrollOffset", "scrollRange", "getScrollRange", "scrollTo", "", "sizeUnit", "Lcom/yandex/div2/DivSizeUnit;", "animated", "", "scrollToTheEnd", "setCurrentItemNoAnimation", "index", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Gallery extends DivViewWithItems {

        @NotNull
        private final Direction direction;
        private final DisplayMetrics metrics;

        @NotNull
        private final DivRecyclerView view;

        public Gallery(@NotNull DivRecyclerView divRecyclerView, @NotNull Direction direction) {
            super(null);
            this.view = divRecyclerView;
            this.direction = direction;
            this.metrics = divRecyclerView.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            int currentItem;
            currentItem = DivViewWithItemsKt.currentItem(this.view, this.direction);
            return currentItem;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i) {
            int itemCount = getItemCount();
            if (i >= 0 && i < itemCount) {
                final Context context = this.view.getContext();
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(context) { // from class: com.yandex.div.core.view2.items.DivViewWithItems$Gallery$currentItem$1$smoothScroller$1
                    private final float MILLISECONDS_PER_INCH = 50.0f;

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    protected int getHorizontalSnapPreference() {
                        return -1;
                    }

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    protected int getVerticalSnapPreference() {
                        return -1;
                    }

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    protected float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
                        return this.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
                    }
                };
                linearSmoothScroller.setTargetPosition(i);
                RecyclerView.LayoutManager layoutManager = this.view.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.startSmoothScroll(linearSmoothScroller);
                    return;
                }
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            int itemCount;
            itemCount = DivViewWithItemsKt.getItemCount(this.view);
            return itemCount;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollRange() {
            int scrollRange;
            scrollRange = DivViewWithItemsKt.scrollRange(this.view);
            return scrollRange;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollOffset() {
            int scrollOffset;
            scrollOffset = DivViewWithItemsKt.scrollOffset(this.view);
            return scrollOffset;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollTo(int value, @NotNull DivSizeUnit sizeUnit, boolean animated) {
            DivViewWithItemsKt.scrollTo(this.view, value, sizeUnit, getMetrics(), animated);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean animated) {
            DivViewWithItemsKt.scrollToTheEnd(this.view, getMetrics(), animated);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int index) {
            int itemCount = getItemCount();
            if (index >= 0 && index < itemCount) {
                this.view.scrollToPosition(index);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(index + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    /* compiled from: DivViewWithItems.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0006H\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u001c\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$Pager;", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "view", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "(Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;)V", "value", "", "currentItem", "getCurrentItem", "()I", "setCurrentItem", "(I)V", "itemCount", "getItemCount", "metrics", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "getMetrics", "()Landroid/util/DisplayMetrics;", "scrollToTheEnd", "", "animated", "", "setCurrentItemNoAnimation", "index", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Pager extends DivViewWithItems {
        private final DisplayMetrics metrics;

        @NotNull
        private final DivPagerView view;

        public Pager(@NotNull DivPagerView divPagerView) {
            super(null);
            this.view = divPagerView;
            this.metrics = divPagerView.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return this.view.getViewPager().getCurrentItem();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i) {
            int itemCount = getItemCount();
            if (i >= 0 && i < itemCount) {
                this.view.getViewPager().setCurrentItem(i, true);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            RecyclerView.Adapter adapter = this.view.getViewPager().getAdapter();
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean animated) {
            this.view.getViewPager().setCurrentItem(getItemCount() - 1, animated);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int index) {
            int itemCount = getItemCount();
            if (index >= 0 && index < itemCount) {
                this.view.getViewPager().setCurrentItem(index, false);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(index + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    /* compiled from: DivViewWithItems.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0006H\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u001c\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$Tabs;", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "view", "Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;", "(Lcom/yandex/div/core/view2/divs/widgets/DivTabsLayout;)V", "value", "", "currentItem", "getCurrentItem", "()I", "setCurrentItem", "(I)V", "itemCount", "getItemCount", "metrics", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "getMetrics", "()Landroid/util/DisplayMetrics;", "scrollToTheEnd", "", "animated", "", "setCurrentItemNoAnimation", "index", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Tabs extends DivViewWithItems {
        private final DisplayMetrics metrics;

        @NotNull
        private final DivTabsLayout view;

        public Tabs(@NotNull DivTabsLayout divTabsLayout) {
            super(null);
            this.view = divTabsLayout;
            this.metrics = divTabsLayout.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return this.view.getViewPager().getCurrentItem();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i) {
            int itemCount = getItemCount();
            if (i >= 0 && i < itemCount) {
                this.view.getViewPager().setCurrentItem(i, true);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            PagerAdapter adapter = this.view.getViewPager().getAdapter();
            if (adapter != null) {
                return adapter.getCount();
            }
            return 0;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean animated) {
            this.view.getViewPager().setCurrentItem(getItemCount() - 1, animated);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int index) {
            int itemCount = getItemCount();
            if (index >= 0 && index < itemCount) {
                this.view.getViewPager().setCurrentItem(index, false);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(index + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    /* compiled from: DivViewWithItems.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\b¢\u0006\u0002\b\u0012R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$Companion;", "", "()V", "<set-?>", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "viewForTests", "getViewForTests$div_release", "()Lcom/yandex/div/core/view2/items/DivViewWithItems;", "setViewForTests$div_release", "(Lcom/yandex/div/core/view2/items/DivViewWithItems;)V", "create", "view", "Landroid/view/View;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "direction", "Lkotlin/Function0;", "Lcom/yandex/div/core/view2/items/Direction;", "create$div_release", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: DivViewWithItems.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DivGallery.ScrollMode.values().length];
                try {
                    iArr[DivGallery.ScrollMode.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DivGallery.ScrollMode.PAGING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final DivViewWithItems getViewForTests$div_release() {
            return DivViewWithItems.viewForTests;
        }

        @VisibleForTesting
        public final void setViewForTests$div_release(@Nullable DivViewWithItems divViewWithItems) {
            DivViewWithItems.viewForTests = divViewWithItems;
        }

        @Nullable
        public final DivViewWithItems create$div_release(@NotNull View view, @NotNull ExpressionResolver resolver, @NotNull Function0 direction) {
            DivViewWithItems viewForTests$div_release = getViewForTests$div_release();
            if (viewForTests$div_release != null) {
                return viewForTests$div_release;
            }
            if (view instanceof DivRecyclerView) {
                DivRecyclerView divRecyclerView = (DivRecyclerView) view;
                Div.Gallery div = divRecyclerView.getDiv();
                Intrinsics.checkNotNull(div);
                int i = WhenMappings.$EnumSwitchMapping$0[((DivGallery.ScrollMode) div.getValue().scrollMode.evaluate(resolver)).ordinal()];
                if (i == 1) {
                    return new Gallery(divRecyclerView, (Direction) direction.mo4828invoke());
                }
                if (i == 2) {
                    return new PagingGallery(divRecyclerView, (Direction) direction.mo4828invoke());
                }
                throw new NoWhenBranchMatchedException();
            }
            if (view instanceof DivPagerView) {
                return new Pager((DivPagerView) view);
            }
            if (view instanceof DivTabsLayout) {
                return new Tabs((DivTabsLayout) view);
            }
            return null;
        }
    }
}
