package com.composeunstyled.theme;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR/\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR/\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\n\u001a\u0004\u0018\u00010!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0012\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/composeunstyled/theme/ThemeBuilder;", "", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "<set-?>", "Landroidx/compose/foundation/Indication;", "defaultIndication", "getDefaultIndication", "()Landroidx/compose/foundation/Indication;", "setDefaultIndication", "(Landroidx/compose/foundation/Indication;)V", "defaultIndication$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/text/TextStyle;", "defaultTextStyle", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "setDefaultTextStyle", "(Landroidx/compose/ui/text/TextStyle;)V", "defaultTextStyle$delegate", "Landroidx/compose/ui/graphics/Color;", "defaultContentColor", "getDefaultContentColor-0d7_KjU", "()J", "setDefaultContentColor-8_81llA", "(J)V", "defaultContentColor$delegate", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "defaultTextSelectionColors", "getDefaultTextSelectionColors", "()Landroidx/compose/foundation/text/selection/TextSelectionColors;", "setDefaultTextSelectionColors", "(Landroidx/compose/foundation/text/selection/TextSelectionColors;)V", "defaultTextSelectionColors$delegate", DiagnosticsEntry.PROPERTIES_KEY, "Lcom/composeunstyled/theme/MutableThemeProperties;", "getProperties", "()Lcom/composeunstyled/theme/MutableThemeProperties;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ThemeBuilderMarker
/* loaded from: classes3.dex */
public final class ThemeBuilder {
    public static final int $stable = 8;
    private String name = "Theme";

    /* renamed from: defaultIndication$delegate, reason: from kotlin metadata */
    private final MutableState defaultIndication = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: defaultTextStyle$delegate, reason: from kotlin metadata */
    private final MutableState defaultTextStyle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextStyle.INSTANCE.getDefault(), null, 2, null);

    /* renamed from: defaultContentColor$delegate, reason: from kotlin metadata */
    private final MutableState defaultContentColor = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m5647boximpl(Color.INSTANCE.m5693getUnspecified0d7_KjU()), null, 2, null);

    /* renamed from: defaultTextSelectionColors$delegate, reason: from kotlin metadata */
    private final MutableState defaultTextSelectionColors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableThemeProperties properties = new MutableThemeProperties();

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final Indication getDefaultIndication() {
        return (Indication) this.defaultIndication.getValue();
    }

    public final void setDefaultIndication(Indication indication) {
        this.defaultIndication.setValue(indication);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextStyle getDefaultTextStyle() {
        return (TextStyle) this.defaultTextStyle.getValue();
    }

    public final void setDefaultTextStyle(TextStyle textStyle) {
        Intrinsics.checkNotNullParameter(textStyle, "<set-?>");
        this.defaultTextStyle.setValue(textStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDefaultContentColor-0d7_KjU, reason: not valid java name */
    public final long m9565getDefaultContentColor0d7_KjU() {
        return ((Color) this.defaultContentColor.getValue()).m5667unboximpl();
    }

    /* renamed from: setDefaultContentColor-8_81llA, reason: not valid java name */
    public final void m9566setDefaultContentColor8_81llA(long j) {
        this.defaultContentColor.setValue(Color.m5647boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextSelectionColors getDefaultTextSelectionColors() {
        return (TextSelectionColors) this.defaultTextSelectionColors.getValue();
    }

    public final void setDefaultTextSelectionColors(TextSelectionColors textSelectionColors) {
        this.defaultTextSelectionColors.setValue(textSelectionColors);
    }

    public final MutableThemeProperties getProperties() {
        return this.properties;
    }
}
