package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TypingIndicator.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/row/TypingIndicatorStyle;", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "borderStroke", "Landroidx/compose/foundation/BorderStroke;", "color", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getBorderStroke", "()Landroidx/compose/foundation/BorderStroke;", "getColor-0d7_KjU", "()J", "J", "component1", "component2", "component3", "component3-0d7_KjU", "copy", "copy-mxwnekA", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;J)Lio/intercom/android/sdk/m5/conversation/ui/components/row/TypingIndicatorStyle;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class TypingIndicatorStyle {
    private final BorderStroke borderStroke;
    private final long color;
    private final Shape shape;

    public /* synthetic */ TypingIndicatorStyle(Shape shape, BorderStroke borderStroke, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(shape, borderStroke, j);
    }

    /* renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ TypingIndicatorStyle m11462copymxwnekA$default(TypingIndicatorStyle typingIndicatorStyle, Shape shape, BorderStroke borderStroke, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = typingIndicatorStyle.shape;
        }
        if ((i & 2) != 0) {
            borderStroke = typingIndicatorStyle.borderStroke;
        }
        if ((i & 4) != 0) {
            j = typingIndicatorStyle.color;
        }
        return typingIndicatorStyle.m11464copymxwnekA(shape, borderStroke, j);
    }

    /* renamed from: component1, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: component2, reason: from getter */
    public final BorderStroke getBorderStroke() {
        return this.borderStroke;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: copy-mxwnekA, reason: not valid java name */
    public final TypingIndicatorStyle m11464copymxwnekA(Shape shape, BorderStroke borderStroke, long color) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        return new TypingIndicatorStyle(shape, borderStroke, color, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypingIndicatorStyle)) {
            return false;
        }
        TypingIndicatorStyle typingIndicatorStyle = (TypingIndicatorStyle) other;
        return Intrinsics.areEqual(this.shape, typingIndicatorStyle.shape) && Intrinsics.areEqual(this.borderStroke, typingIndicatorStyle.borderStroke) && Color.m5658equalsimpl0(this.color, typingIndicatorStyle.color);
    }

    public int hashCode() {
        int hashCode = this.shape.hashCode() * 31;
        BorderStroke borderStroke = this.borderStroke;
        return ((hashCode + (borderStroke == null ? 0 : borderStroke.hashCode())) * 31) + Color.m5664hashCodeimpl(this.color);
    }

    public String toString() {
        return "TypingIndicatorStyle(shape=" + this.shape + ", borderStroke=" + this.borderStroke + ", color=" + ((Object) Color.m5665toStringimpl(this.color)) + ')';
    }

    private TypingIndicatorStyle(Shape shape, BorderStroke borderStroke, long j) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.shape = shape;
        this.borderStroke = borderStroke;
        this.color = j;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final BorderStroke getBorderStroke() {
        return this.borderStroke;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m11465getColor0d7_KjU() {
        return this.color;
    }
}
