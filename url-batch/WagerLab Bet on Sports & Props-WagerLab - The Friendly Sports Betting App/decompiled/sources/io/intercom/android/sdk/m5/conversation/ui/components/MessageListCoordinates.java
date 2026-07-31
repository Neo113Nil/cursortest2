package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageList.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/MessageListCoordinates;", "", "boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "boundsInWindow", "size", "Landroidx/compose/ui/geometry/Size;", "<init>", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBoundsInParent", "()Landroidx/compose/ui/geometry/Rect;", "getBoundsInWindow", "getSize-NH-jbRc", "()J", "J", "isZero", "", "component1", "component2", "component3", "component3-NH-jbRc", "copy", "copy-cSwnlzA", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;J)Lio/intercom/android/sdk/m5/conversation/ui/components/MessageListCoordinates;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class MessageListCoordinates {
    private final Rect boundsInParent;
    private final Rect boundsInWindow;
    private final long size;

    public /* synthetic */ MessageListCoordinates(Rect rect, Rect rect2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(rect, rect2, j);
    }

    /* renamed from: copy-cSwnlzA$default, reason: not valid java name */
    public static /* synthetic */ MessageListCoordinates m11290copycSwnlzA$default(MessageListCoordinates messageListCoordinates, Rect rect, Rect rect2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = messageListCoordinates.boundsInParent;
        }
        if ((i & 2) != 0) {
            rect2 = messageListCoordinates.boundsInWindow;
        }
        if ((i & 4) != 0) {
            j = messageListCoordinates.size;
        }
        return messageListCoordinates.m11292copycSwnlzA(rect, rect2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final Rect getBoundsInParent() {
        return this.boundsInParent;
    }

    /* renamed from: component2, reason: from getter */
    public final Rect getBoundsInWindow() {
        return this.boundsInWindow;
    }

    /* renamed from: component3-NH-jbRc, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: copy-cSwnlzA, reason: not valid java name */
    public final MessageListCoordinates m11292copycSwnlzA(Rect boundsInParent, Rect boundsInWindow, long size) {
        Intrinsics.checkNotNullParameter(boundsInParent, "boundsInParent");
        Intrinsics.checkNotNullParameter(boundsInWindow, "boundsInWindow");
        return new MessageListCoordinates(boundsInParent, boundsInWindow, size, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageListCoordinates)) {
            return false;
        }
        MessageListCoordinates messageListCoordinates = (MessageListCoordinates) other;
        return Intrinsics.areEqual(this.boundsInParent, messageListCoordinates.boundsInParent) && Intrinsics.areEqual(this.boundsInWindow, messageListCoordinates.boundsInWindow) && Size.m5478equalsimpl0(this.size, messageListCoordinates.size);
    }

    public int hashCode() {
        return (((this.boundsInParent.hashCode() * 31) + this.boundsInWindow.hashCode()) * 31) + Size.m5483hashCodeimpl(this.size);
    }

    public String toString() {
        return "MessageListCoordinates(boundsInParent=" + this.boundsInParent + ", boundsInWindow=" + this.boundsInWindow + ", size=" + ((Object) Size.m5486toStringimpl(this.size)) + ')';
    }

    private MessageListCoordinates(Rect boundsInParent, Rect boundsInWindow, long j) {
        Intrinsics.checkNotNullParameter(boundsInParent, "boundsInParent");
        Intrinsics.checkNotNullParameter(boundsInWindow, "boundsInWindow");
        this.boundsInParent = boundsInParent;
        this.boundsInWindow = boundsInWindow;
        this.size = j;
    }

    public /* synthetic */ MessageListCoordinates(Rect rect, Rect rect2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Rect.INSTANCE.getZero() : rect, (i & 2) != 0 ? Rect.INSTANCE.getZero() : rect2, (i & 4) != 0 ? Size.INSTANCE.m5491getZeroNHjbRc() : j, null);
    }

    public final Rect getBoundsInParent() {
        return this.boundsInParent;
    }

    public final Rect getBoundsInWindow() {
        return this.boundsInWindow;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m11293getSizeNHjbRc() {
        return this.size;
    }

    public final boolean isZero() {
        return Intrinsics.areEqual(this.boundsInParent, Rect.INSTANCE.getZero()) && Size.m5478equalsimpl0(this.size, Size.INSTANCE.m5491getZeroNHjbRc());
    }
}
