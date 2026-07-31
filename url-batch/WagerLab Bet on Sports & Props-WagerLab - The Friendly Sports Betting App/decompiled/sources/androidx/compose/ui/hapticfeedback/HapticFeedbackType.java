package androidx.compose.ui.hapticfeedback;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: HapticFeedbackType.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "", "value", "", "constructor-impl", "(I)I", InAppPurchaseConstants.METHOD_TO_STRING, "", "toString-impl", "(I)Ljava/lang/String;", "equals", "", "other", "hashCode", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class HapticFeedbackType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m6432boximpl(int i) {
        return new HapticFeedbackType(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6433constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6434equalsimpl(int i, Object obj) {
        return (obj instanceof HapticFeedbackType) && i == ((HapticFeedbackType) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6435equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6436hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object other) {
        return m6434equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m6436hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    private /* synthetic */ HapticFeedbackType(int i) {
        this.value = i;
    }

    public String toString() {
        return m6437toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6437toStringimpl(int i) {
        Companion companion = INSTANCE;
        return m6435equalsimpl0(i, companion.m6439getConfirm5zf0vsI()) ? "Confirm" : m6435equalsimpl0(i, companion.m6440getContextClick5zf0vsI()) ? "ContextClick" : m6435equalsimpl0(i, companion.m6441getGestureEnd5zf0vsI()) ? "GestureEnd" : m6435equalsimpl0(i, companion.m6442getGestureThresholdActivate5zf0vsI()) ? "GestureThresholdActivate" : m6435equalsimpl0(i, companion.m6443getKeyboardTap5zf0vsI()) ? "KeyboardTap" : m6435equalsimpl0(i, companion.m6444getLongPress5zf0vsI()) ? "LongPress" : m6435equalsimpl0(i, companion.m6445getReject5zf0vsI()) ? "Reject" : m6435equalsimpl0(i, companion.m6446getSegmentFrequentTick5zf0vsI()) ? "SegmentFrequentTick" : m6435equalsimpl0(i, companion.m6447getSegmentTick5zf0vsI()) ? "SegmentTick" : m6435equalsimpl0(i, companion.m6448getTextHandleMove5zf0vsI()) ? "TextHandleMove" : m6435equalsimpl0(i, companion.m6449getToggleOff5zf0vsI()) ? "ToggleOff" : m6435equalsimpl0(i, companion.m6450getToggleOn5zf0vsI()) ? "ToggleOn" : m6435equalsimpl0(i, companion.m6451getVirtualKey5zf0vsI()) ? "VirtualKey" : "Invalid";
    }

    /* compiled from: HapticFeedbackType.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0007¨\u0006\""}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;", "", "<init>", "()V", "Confirm", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "getConfirm-5zf0vsI", "()I", "ContextClick", "getContextClick-5zf0vsI", "GestureEnd", "getGestureEnd-5zf0vsI", "GestureThresholdActivate", "getGestureThresholdActivate-5zf0vsI", "KeyboardTap", "getKeyboardTap-5zf0vsI", "LongPress", "getLongPress-5zf0vsI", "Reject", "getReject-5zf0vsI", "SegmentFrequentTick", "getSegmentFrequentTick-5zf0vsI", "SegmentTick", "getSegmentTick-5zf0vsI", "TextHandleMove", "getTextHandleMove-5zf0vsI", "ToggleOff", "getToggleOff-5zf0vsI", "ToggleOn", "getToggleOn-5zf0vsI", "VirtualKey", "getVirtualKey-5zf0vsI", "values", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m6439getConfirm5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6452getConfirm5zf0vsI();
        }

        /* renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m6440getContextClick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6453getContextClick5zf0vsI();
        }

        /* renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m6441getGestureEnd5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6454getGestureEnd5zf0vsI();
        }

        /* renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m6442getGestureThresholdActivate5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6455getGestureThresholdActivate5zf0vsI();
        }

        /* renamed from: getKeyboardTap-5zf0vsI, reason: not valid java name */
        public final int m6443getKeyboardTap5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6456getKeyboardTap5zf0vsI();
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m6444getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6457getLongPress5zf0vsI();
        }

        /* renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m6445getReject5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6458getReject5zf0vsI();
        }

        /* renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m6446getSegmentFrequentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6459getSegmentFrequentTick5zf0vsI();
        }

        /* renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m6447getSegmentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6460getSegmentTick5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m6448getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6461getTextHandleMove5zf0vsI();
        }

        /* renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m6449getToggleOff5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6462getToggleOff5zf0vsI();
        }

        /* renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m6450getToggleOn5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6463getToggleOn5zf0vsI();
        }

        /* renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m6451getVirtualKey5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6464getVirtualKey5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return CollectionsKt.listOf((Object[]) new HapticFeedbackType[]{HapticFeedbackType.m6432boximpl(m6439getConfirm5zf0vsI()), HapticFeedbackType.m6432boximpl(m6440getContextClick5zf0vsI()), HapticFeedbackType.m6432boximpl(m6441getGestureEnd5zf0vsI()), HapticFeedbackType.m6432boximpl(m6442getGestureThresholdActivate5zf0vsI()), HapticFeedbackType.m6432boximpl(m6443getKeyboardTap5zf0vsI()), HapticFeedbackType.m6432boximpl(m6444getLongPress5zf0vsI()), HapticFeedbackType.m6432boximpl(m6445getReject5zf0vsI()), HapticFeedbackType.m6432boximpl(m6446getSegmentFrequentTick5zf0vsI()), HapticFeedbackType.m6432boximpl(m6447getSegmentTick5zf0vsI()), HapticFeedbackType.m6432boximpl(m6448getTextHandleMove5zf0vsI()), HapticFeedbackType.m6432boximpl(m6449getToggleOff5zf0vsI()), HapticFeedbackType.m6432boximpl(m6450getToggleOn5zf0vsI()), HapticFeedbackType.m6432boximpl(m6451getVirtualKey5zf0vsI())});
        }
    }
}
