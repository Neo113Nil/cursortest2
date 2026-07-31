package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomButton.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/ui/component/IntercomButton;", "", "<init>", "()V", "primaryStyle", "Lio/intercom/android/sdk/ui/component/IntercomButton$Style;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "primaryStyle-Klgx-Pg", "(JJLandroidx/compose/foundation/BorderStroke;Landroidx/compose/runtime/Composer;II)Lio/intercom/android/sdk/ui/component/IntercomButton$Style;", "outlinedStyle", "outlinedStyle-Klgx-Pg", "Style", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomButton {
    public static final int $stable = 0;
    public static final IntercomButton INSTANCE = new IntercomButton();

    private IntercomButton() {
    }

    /* compiled from: IntercomButton.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u001dH×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/ui/component/IntercomButton$Style;", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "<init>", "(JJLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getContentColor-0d7_KjU", "getBorder", "()Landroidx/compose/foundation/BorderStroke;", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "copy", "copy-jxsXWHM", "(JJLandroidx/compose/foundation/BorderStroke;)Lio/intercom/android/sdk/ui/component/IntercomButton$Style;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Style {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final BorderStroke border;
        private final long contentColor;

        public /* synthetic */ Style(long j, long j2, BorderStroke borderStroke, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, borderStroke);
        }

        /* renamed from: copy-jxsXWHM$default, reason: not valid java name */
        public static /* synthetic */ Style m11966copyjxsXWHM$default(Style style, long j, long j2, BorderStroke borderStroke, int i, Object obj) {
            if ((i & 1) != 0) {
                j = style.backgroundColor;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = style.contentColor;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                borderStroke = style.border;
            }
            return style.m11969copyjxsXWHM(j3, j4, borderStroke);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getContentColor() {
            return this.contentColor;
        }

        /* renamed from: component3, reason: from getter */
        public final BorderStroke getBorder() {
            return this.border;
        }

        /* renamed from: copy-jxsXWHM, reason: not valid java name */
        public final Style m11969copyjxsXWHM(long backgroundColor, long contentColor, BorderStroke border) {
            Intrinsics.checkNotNullParameter(border, "border");
            return new Style(backgroundColor, contentColor, border, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Style)) {
                return false;
            }
            Style style = (Style) other;
            return Color.m5658equalsimpl0(this.backgroundColor, style.backgroundColor) && Color.m5658equalsimpl0(this.contentColor, style.contentColor) && Intrinsics.areEqual(this.border, style.border);
        }

        public int hashCode() {
            return (((Color.m5664hashCodeimpl(this.backgroundColor) * 31) + Color.m5664hashCodeimpl(this.contentColor)) * 31) + this.border.hashCode();
        }

        public String toString() {
            return "Style(backgroundColor=" + ((Object) Color.m5665toStringimpl(this.backgroundColor)) + ", contentColor=" + ((Object) Color.m5665toStringimpl(this.contentColor)) + ", border=" + this.border + ')';
        }

        private Style(long j, long j2, BorderStroke border) {
            Intrinsics.checkNotNullParameter(border, "border");
            this.backgroundColor = j;
            this.contentColor = j2;
            this.border = border;
        }

        /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m11970getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
        public final long m11971getContentColor0d7_KjU() {
            return this.contentColor;
        }

        public final BorderStroke getBorder() {
            return this.border;
        }
    }

    /* renamed from: primaryStyle-Klgx-Pg, reason: not valid java name */
    public final Style m11965primaryStyleKlgxPg(long j, long j2, BorderStroke borderStroke, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-155594647);
        if ((i2 & 1) != 0) {
            j = IntercomTheme.INSTANCE.getColors(composer, 6).m12152getBackground0d7_KjU();
        }
        Style style = new Style(j, (i2 & 2) != 0 ? IntercomTheme.INSTANCE.getColors(composer, 6).m12174getPrimaryText0d7_KjU() : j2, (i2 & 4) != 0 ? BorderStrokeKt.m292BorderStrokecXLIe8U(Dp.m8401constructorimpl(1), IntercomTheme.INSTANCE.getColors(composer, 6).m12154getBorder0d7_KjU()) : borderStroke, null);
        composer.endReplaceGroup();
        return style;
    }

    /* renamed from: outlinedStyle-Klgx-Pg, reason: not valid java name */
    public final Style m11964outlinedStyleKlgxPg(long j, long j2, BorderStroke borderStroke, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-1228695891);
        if ((i2 & 1) != 0) {
            j = IntercomTheme.INSTANCE.getColors(composer, 6).m12152getBackground0d7_KjU();
        }
        Style style = new Style(j, (i2 & 2) != 0 ? IntercomTheme.INSTANCE.getColors(composer, 6).m12174getPrimaryText0d7_KjU() : j2, (i2 & 4) != 0 ? BorderStrokeKt.m292BorderStrokecXLIe8U(Dp.m8401constructorimpl(1), IntercomTheme.INSTANCE.getColors(composer, 6).m12154getBorder0d7_KjU()) : borderStroke, null);
        composer.endReplaceGroup();
        return style;
    }
}
