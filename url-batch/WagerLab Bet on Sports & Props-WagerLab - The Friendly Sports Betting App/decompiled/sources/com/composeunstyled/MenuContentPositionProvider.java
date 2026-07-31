package com.composeunstyled;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import com.composeunstyled.DropdownPanelAnchor;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: DropdownMenu.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\""}, d2 = {"Lcom/composeunstyled/MenuContentPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "density", "Landroidx/compose/ui/unit/Density;", "anchor", "Lcom/composeunstyled/DropdownPanelAnchor;", "<init>", "(Landroidx/compose/ui/unit/Density;Lcom/composeunstyled/DropdownPanelAnchor;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getAnchor", "()Lcom/composeunstyled/DropdownPanelAnchor;", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MenuContentPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final DropdownPanelAnchor anchor;
    private final Density density;

    public static /* synthetic */ MenuContentPositionProvider copy$default(MenuContentPositionProvider menuContentPositionProvider, Density density, DropdownPanelAnchor dropdownPanelAnchor, int i, Object obj) {
        if ((i & 1) != 0) {
            density = menuContentPositionProvider.density;
        }
        if ((i & 2) != 0) {
            dropdownPanelAnchor = menuContentPositionProvider.anchor;
        }
        return menuContentPositionProvider.copy(density, dropdownPanelAnchor);
    }

    /* renamed from: component1, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* renamed from: component2, reason: from getter */
    public final DropdownPanelAnchor getAnchor() {
        return this.anchor;
    }

    public final MenuContentPositionProvider copy(Density density, DropdownPanelAnchor anchor) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return new MenuContentPositionProvider(density, anchor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuContentPositionProvider)) {
            return false;
        }
        MenuContentPositionProvider menuContentPositionProvider = (MenuContentPositionProvider) other;
        return Intrinsics.areEqual(this.density, menuContentPositionProvider.density) && Intrinsics.areEqual(this.anchor, menuContentPositionProvider.anchor);
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + this.anchor.hashCode();
    }

    public String toString() {
        return "MenuContentPositionProvider(density=" + this.density + ", anchor=" + this.anchor + ")";
    }

    public MenuContentPositionProvider(Density density, DropdownPanelAnchor anchor) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.density = density;
        this.anchor = anchor;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final DropdownPanelAnchor getAnchor() {
        return this.anchor;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo388calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        int left;
        int top;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        DropdownPanelAnchor dropdownPanelAnchor = this.anchor;
        if (Intrinsics.areEqual(dropdownPanelAnchor, DropdownPanelAnchor.TopStart.INSTANCE) || Intrinsics.areEqual(dropdownPanelAnchor, DropdownPanelAnchor.CenterStart.INSTANCE) || Intrinsics.areEqual(dropdownPanelAnchor, DropdownPanelAnchor.BottomStart.INSTANCE)) {
            left = anchorBounds.getLeft();
        } else {
            if (!Intrinsics.areEqual(dropdownPanelAnchor, DropdownPanelAnchor.TopEnd.INSTANCE) && !Intrinsics.areEqual(dropdownPanelAnchor, DropdownPanelAnchor.CenterEnd.INSTANCE) && !Intrinsics.areEqual(dropdownPanelAnchor, DropdownPanelAnchor.BottomEnd.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            left = anchorBounds.getRight() - ((int) (popupContentSize >> 32));
        }
        DropdownPanelAnchor dropdownPanelAnchor2 = this.anchor;
        if (Intrinsics.areEqual(dropdownPanelAnchor2, DropdownPanelAnchor.TopStart.INSTANCE) || Intrinsics.areEqual(dropdownPanelAnchor2, DropdownPanelAnchor.TopEnd.INSTANCE)) {
            top = anchorBounds.getTop();
            i = (int) (popupContentSize & 4294967295L);
        } else if (Intrinsics.areEqual(dropdownPanelAnchor2, DropdownPanelAnchor.CenterStart.INSTANCE) || Intrinsics.areEqual(dropdownPanelAnchor2, DropdownPanelAnchor.CenterEnd.INSTANCE)) {
            top = anchorBounds.getTop();
            i = ((int) (popupContentSize & 4294967295L)) / 2;
        } else {
            if (!Intrinsics.areEqual(dropdownPanelAnchor2, DropdownPanelAnchor.BottomStart.INSTANCE) && !Intrinsics.areEqual(dropdownPanelAnchor2, DropdownPanelAnchor.BottomEnd.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = anchorBounds.getBottom();
            return IntOffset.m8523constructorimpl((RangesKt.coerceIn(left, 0, ((int) (windowSize >> 32)) - ((int) (popupContentSize >> 32))) << 32) | (RangesKt.coerceIn(i2, 0, ((int) (windowSize & 4294967295L)) - ((int) (popupContentSize & 4294967295L))) & 4294967295L));
        }
        i2 = top - i;
        return IntOffset.m8523constructorimpl((RangesKt.coerceIn(left, 0, ((int) (windowSize >> 32)) - ((int) (popupContentSize >> 32))) << 32) | (RangesKt.coerceIn(i2, 0, ((int) (windowSize & 4294967295L)) - ((int) (popupContentSize & 4294967295L))) & 4294967295L));
    }
}
