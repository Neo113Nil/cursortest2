package com.composables.core;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\r"}, d2 = {"Lcom/composables/core/OverscrollSides;", "", "id", "", "constructor-impl", "(I)I", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes3.dex */
public final class OverscrollSides {
    private final int id;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Top = m9389constructorimpl(0);
    private static final int Bottom = m9389constructorimpl(1);
    private static final int Left = m9389constructorimpl(2);
    private static final int Right = m9389constructorimpl(3);
    private static final int Vertical = m9389constructorimpl(4);
    private static final int Horizontal = m9389constructorimpl(5);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OverscrollSides m9388boximpl(int i) {
        return new OverscrollSides(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m9389constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9390equalsimpl(int i, Object obj) {
        return (obj instanceof OverscrollSides) && i == ((OverscrollSides) obj).getId();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9391equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9392hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9393toStringimpl(int i) {
        return "OverscrollSides(id=" + i + ")";
    }

    public boolean equals(Object other) {
        return m9390equalsimpl(this.id, other);
    }

    public int hashCode() {
        return m9392hashCodeimpl(this.id);
    }

    public String toString() {
        return m9393toStringimpl(this.id);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getId() {
        return this.id;
    }

    /* compiled from: ScrollArea.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/composables/core/OverscrollSides$Companion;", "", "<init>", "()V", "Top", "Lcom/composables/core/OverscrollSides;", "getTop-FfLkZdc", "()I", "I", "Bottom", "getBottom-FfLkZdc", "Left", "getLeft-FfLkZdc", "Right", "getRight-FfLkZdc", "Vertical", "getVertical-FfLkZdc", "Horizontal", "getHorizontal-FfLkZdc", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getTop-FfLkZdc, reason: not valid java name */
        public final int m9399getTopFfLkZdc() {
            return OverscrollSides.Top;
        }

        /* renamed from: getBottom-FfLkZdc, reason: not valid java name */
        public final int m9395getBottomFfLkZdc() {
            return OverscrollSides.Bottom;
        }

        /* renamed from: getLeft-FfLkZdc, reason: not valid java name */
        public final int m9397getLeftFfLkZdc() {
            return OverscrollSides.Left;
        }

        /* renamed from: getRight-FfLkZdc, reason: not valid java name */
        public final int m9398getRightFfLkZdc() {
            return OverscrollSides.Right;
        }

        /* renamed from: getVertical-FfLkZdc, reason: not valid java name */
        public final int m9400getVerticalFfLkZdc() {
            return OverscrollSides.Vertical;
        }

        /* renamed from: getHorizontal-FfLkZdc, reason: not valid java name */
        public final int m9396getHorizontalFfLkZdc() {
            return OverscrollSides.Horizontal;
        }
    }

    private /* synthetic */ OverscrollSides(int i) {
        this.id = i;
    }
}
