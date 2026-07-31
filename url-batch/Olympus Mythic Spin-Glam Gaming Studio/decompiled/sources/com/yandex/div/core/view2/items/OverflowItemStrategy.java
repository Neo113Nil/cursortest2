package com.yandex.div.core.view2.items;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OverflowItemStrategy.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \r2\u00020\u0001:\u0003\f\r\u000eB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0084\bJ\u0012\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/div/core/view2/items/OverflowItemStrategy;", "", "itemCount", "", "(I)V", "checkItemCount", "block", "Lkotlin/Function0;", "nextItem", "step", "positionAfterScrollBy", "previousItem", "Clamp", "Companion", "Ring", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Clamp;", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Ring;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class OverflowItemStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int itemCount;

    public /* synthetic */ OverflowItemStrategy(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public abstract int nextItem(int step);

    public abstract int positionAfterScrollBy(int step);

    public abstract int previousItem(int step);

    private OverflowItemStrategy(int i) {
        this.itemCount = i;
    }

    public static /* synthetic */ int nextItem$default(OverflowItemStrategy overflowItemStrategy, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextItem");
        }
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return overflowItemStrategy.nextItem(i);
    }

    public static /* synthetic */ int previousItem$default(OverflowItemStrategy overflowItemStrategy, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: previousItem");
        }
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return overflowItemStrategy.previousItem(i);
    }

    /* compiled from: OverflowItemStrategy.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Clamp;", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy;", "currentItem", "", "itemCount", "scrollRange", "scrollOffset", "metrics", "Landroid/util/DisplayMetrics;", "(IIIILandroid/util/DisplayMetrics;)V", "nextItem", "step", "positionAfterScrollBy", "previousItem", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Clamp extends OverflowItemStrategy {
        private final int currentItem;
        private final int itemCount;

        @NotNull
        private final DisplayMetrics metrics;
        private final int scrollOffset;
        private final int scrollRange;

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int nextItem(int step) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return Math.min(this.currentItem + step, this.itemCount - 1);
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int previousItem(int step) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return Math.max(0, this.currentItem - step);
        }

        public Clamp(int i, int i2, int i3, int i4, @NotNull DisplayMetrics displayMetrics) {
            super(i2, null);
            this.currentItem = i;
            this.itemCount = i2;
            this.scrollRange = i3;
            this.scrollOffset = i4;
            this.metrics = displayMetrics;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int positionAfterScrollBy(int step) {
            return Math.min(Math.max(0, this.scrollOffset + BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(step), this.metrics)), this.scrollRange);
        }
    }

    /* compiled from: OverflowItemStrategy.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Ring;", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy;", "currentItem", "", "itemCount", "scrollRange", "scrollOffset", "metrics", "Landroid/util/DisplayMetrics;", "(IIIILandroid/util/DisplayMetrics;)V", "nextItem", "step", "positionAfterScrollBy", "previousItem", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ring extends OverflowItemStrategy {
        private final int currentItem;
        private final int itemCount;

        @NotNull
        private final DisplayMetrics metrics;
        private final int scrollOffset;
        private final int scrollRange;

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int nextItem(int step) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return (this.currentItem + step) % this.itemCount;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int previousItem(int step) {
            if (super.itemCount <= 0) {
                return -1;
            }
            int i = this.currentItem - step;
            int i2 = this.itemCount;
            int i3 = i % i2;
            return (i2 & (((i3 ^ i2) & ((-i3) | i3)) >> 31)) + i3;
        }

        public Ring(int i, int i2, int i3, int i4, @NotNull DisplayMetrics displayMetrics) {
            super(i2, null);
            this.currentItem = i;
            this.itemCount = i2;
            this.scrollRange = i3;
            this.scrollOffset = i4;
            this.metrics = displayMetrics;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int positionAfterScrollBy(int step) {
            int dpToPx = this.scrollOffset + BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(step), this.metrics);
            int i = this.scrollRange;
            int i2 = dpToPx % i;
            return i2 < 0 ? i2 + i : i2;
        }
    }

    protected final int checkItemCount(@NotNull Function0 block) {
        if (this.itemCount <= 0) {
            return -1;
        }
        return ((Number) block.mo4828invoke()).intValue();
    }

    /* compiled from: OverflowItemStrategy.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J?\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/div/core/view2/items/OverflowItemStrategy$Companion;", "", "()V", "create", "Lcom/yandex/div/core/view2/items/OverflowItemStrategy;", "overflow", "", "currentItem", "", "itemCount", "scrollRange", "scrollOffset", "metrics", "Landroid/util/DisplayMetrics;", "create$div_release", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final OverflowItemStrategy create$div_release(@Nullable String overflow, int currentItem, int itemCount, int scrollRange, int scrollOffset, @NotNull DisplayMetrics metrics) {
            if (overflow == null ? true : Intrinsics.areEqual(overflow, "clamp")) {
                return new Clamp(currentItem, itemCount, scrollRange, scrollOffset, metrics);
            }
            if (Intrinsics.areEqual(overflow, "ring")) {
                return new Ring(currentItem, itemCount, scrollRange, scrollOffset, metrics);
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unsupported overflow " + overflow);
            }
            return new Clamp(currentItem, itemCount, scrollRange, scrollOffset, metrics);
        }
    }
}
