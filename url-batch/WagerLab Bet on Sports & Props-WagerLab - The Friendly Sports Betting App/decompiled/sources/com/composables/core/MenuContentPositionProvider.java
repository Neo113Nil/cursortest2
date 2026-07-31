package com.composables.core;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: deprecated.Menu.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\""}, d2 = {"Lcom/composables/core/MenuContentPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "density", "Landroidx/compose/ui/unit/Density;", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "<init>", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/Alignment$Horizontal;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getAlignment", "()Landroidx/compose/ui/Alignment$Horizontal;", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MenuContentPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final Alignment.Horizontal alignment;
    private final Density density;

    public static /* synthetic */ MenuContentPositionProvider copy$default(MenuContentPositionProvider menuContentPositionProvider, Density density, Alignment.Horizontal horizontal, int i, Object obj) {
        if ((i & 1) != 0) {
            density = menuContentPositionProvider.density;
        }
        if ((i & 2) != 0) {
            horizontal = menuContentPositionProvider.alignment;
        }
        return menuContentPositionProvider.copy(density, horizontal);
    }

    /* renamed from: component1, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* renamed from: component2, reason: from getter */
    public final Alignment.Horizontal getAlignment() {
        return this.alignment;
    }

    public final MenuContentPositionProvider copy(Density density, Alignment.Horizontal alignment) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new MenuContentPositionProvider(density, alignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuContentPositionProvider)) {
            return false;
        }
        MenuContentPositionProvider menuContentPositionProvider = (MenuContentPositionProvider) other;
        return Intrinsics.areEqual(this.density, menuContentPositionProvider.density) && Intrinsics.areEqual(this.alignment, menuContentPositionProvider.alignment);
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + this.alignment.hashCode();
    }

    public String toString() {
        return "MenuContentPositionProvider(density=" + this.density + ", alignment=" + this.alignment + ")";
    }

    public MenuContentPositionProvider(Density density, Alignment.Horizontal alignment) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.density = density;
        this.alignment = alignment;
    }

    public final Alignment.Horizontal getAlignment() {
        return this.alignment;
    }

    public final Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo388calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        Sequence sequenceOf;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int left = anchorBounds.getLeft();
        int i = (int) (popupContentSize >> 32);
        int right = anchorBounds.getRight() - i;
        int i2 = (int) (windowSize >> 32);
        int i3 = i2 - i;
        if (Intrinsics.areEqual(this.alignment, Alignment.INSTANCE.getStart())) {
            Integer[] numArr = new Integer[3];
            numArr[0] = Integer.valueOf(left);
            numArr[1] = Integer.valueOf(right);
            if (anchorBounds.getLeft() < 0) {
                i3 = 0;
            }
            numArr[2] = Integer.valueOf(i3);
            sequenceOf = SequencesKt.sequenceOf(numArr);
        } else if (Intrinsics.areEqual(this.alignment, Alignment.INSTANCE.getEnd())) {
            Integer[] numArr2 = new Integer[3];
            numArr2[0] = Integer.valueOf(right);
            numArr2[1] = Integer.valueOf(left);
            if (anchorBounds.getRight() <= i2) {
                i3 = 0;
            }
            numArr2[2] = Integer.valueOf(i3);
            sequenceOf = SequencesKt.sequenceOf(numArr2);
        } else {
            sequenceOf = SequencesKt.sequenceOf(Integer.valueOf(anchorBounds.getLeft() + ((anchorBounds.getWidth() - i) / 2)));
        }
        Iterator it = sequenceOf.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            int intValue = ((Number) obj2).intValue();
            if (intValue >= 0 && intValue + i <= i2) {
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            right = num.intValue();
        }
        int max = Math.max(anchorBounds.getBottom(), 0);
        int i4 = (int) (popupContentSize & 4294967295L);
        int top = anchorBounds.getTop() - i4;
        int i5 = (int) (windowSize & 4294967295L);
        Iterator it2 = SequencesKt.sequenceOf(Integer.valueOf(max), Integer.valueOf(top), Integer.valueOf(anchorBounds.getTop() - (i4 / 2)), Integer.valueOf(i5 - i4)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= 0 && intValue2 + i4 <= i5) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            top = num2.intValue();
        }
        return IntOffset.m8523constructorimpl((right << 32) | (top & 4294967295L));
    }
}
