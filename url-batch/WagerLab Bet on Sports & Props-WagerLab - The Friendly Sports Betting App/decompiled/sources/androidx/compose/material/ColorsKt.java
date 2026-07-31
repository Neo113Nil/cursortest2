package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Colors.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0085\u0001\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0019\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0014\u0010\u001c\u001a\u00020\u001d*\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0000\"\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010 X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"lightColors", "Landroidx/compose/material/Colors;", "primary", "Landroidx/compose/ui/graphics/Color;", "primaryVariant", "secondary", "secondaryVariant", AppStateModule.APP_STATE_BACKGROUND, "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "lightColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "darkColors", "darkColors-2qZNXz8", "primarySurface", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "contentColorFor", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "updateColorsFrom", "", "other", "LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorsKt {
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.material.ColorsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Colors LocalColors$lambda$1;
            LocalColors$lambda$1 = ColorsKt.LocalColors$lambda$1();
            return LocalColors$lambda$1;
        }
    });

    /* renamed from: lightColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m1975lightColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long Color = (i & 1) != 0 ? ColorKt.Color(4284612846L) : j;
        long Color2 = (i & 2) != 0 ? ColorKt.Color(4281794739L) : j2;
        long Color3 = (i & 4) != 0 ? ColorKt.Color(4278442694L) : j3;
        long Color4 = (i & 8) != 0 ? ColorKt.Color(4278290310L) : j4;
        long m5694getWhite0d7_KjU = (i & 16) != 0 ? Color.INSTANCE.m5694getWhite0d7_KjU() : j5;
        long m5694getWhite0d7_KjU2 = (i & 32) != 0 ? Color.INSTANCE.m5694getWhite0d7_KjU() : j6;
        long Color5 = (i & 64) != 0 ? ColorKt.Color(4289724448L) : j7;
        long m5694getWhite0d7_KjU3 = (i & 128) != 0 ? Color.INSTANCE.m5694getWhite0d7_KjU() : j8;
        long j13 = Color;
        long m5683getBlack0d7_KjU = (i & 256) != 0 ? Color.INSTANCE.m5683getBlack0d7_KjU() : j9;
        long m5683getBlack0d7_KjU2 = (i & 512) != 0 ? Color.INSTANCE.m5683getBlack0d7_KjU() : j10;
        long m5683getBlack0d7_KjU3 = (i & 1024) != 0 ? Color.INSTANCE.m5683getBlack0d7_KjU() : j11;
        if ((i & 2048) != 0) {
            j12 = Color.INSTANCE.m5694getWhite0d7_KjU();
        }
        return m1974lightColors2qZNXz8(j13, Color2, Color3, Color4, m5694getWhite0d7_KjU, m5694getWhite0d7_KjU2, Color5, m5694getWhite0d7_KjU3, m5683getBlack0d7_KjU, m5683getBlack0d7_KjU2, m5683getBlack0d7_KjU3, j12);
    }

    /* renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final Colors m1974lightColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    /* renamed from: darkColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m1973darkColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long Color = (i & 1) != 0 ? ColorKt.Color(4290479868L) : j;
        long Color2 = (i & 2) != 0 ? ColorKt.Color(4281794739L) : j2;
        long Color3 = (i & 4) != 0 ? ColorKt.Color(4278442694L) : j3;
        long j13 = (i & 8) != 0 ? Color3 : j4;
        long Color4 = (i & 16) != 0 ? ColorKt.Color(4279374354L) : j5;
        long Color5 = (i & 32) != 0 ? ColorKt.Color(4279374354L) : j6;
        long Color6 = (i & 64) != 0 ? ColorKt.Color(4291782265L) : j7;
        long m5683getBlack0d7_KjU = (i & 128) != 0 ? Color.INSTANCE.m5683getBlack0d7_KjU() : j8;
        long m5683getBlack0d7_KjU2 = (i & 256) != 0 ? Color.INSTANCE.m5683getBlack0d7_KjU() : j9;
        long m5694getWhite0d7_KjU = (i & 512) != 0 ? Color.INSTANCE.m5694getWhite0d7_KjU() : j10;
        long m5694getWhite0d7_KjU2 = (i & 1024) != 0 ? Color.INSTANCE.m5694getWhite0d7_KjU() : j11;
        if ((i & 2048) != 0) {
            j12 = Color.INSTANCE.m5683getBlack0d7_KjU();
        }
        return m1972darkColors2qZNXz8(Color, Color2, Color3, j13, Color4, Color5, Color6, m5683getBlack0d7_KjU, m5683getBlack0d7_KjU2, m5694getWhite0d7_KjU, m5694getWhite0d7_KjU2, j12);
    }

    /* renamed from: darkColors-2qZNXz8, reason: not valid java name */
    public static final Colors m1972darkColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, false, null);
    }

    public static final long getPrimarySurface(Colors colors) {
        return colors.isLight() ? colors.m1953getPrimary0d7_KjU() : colors.m1957getSurface0d7_KjU();
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1970contentColorFor4WTKRHQ(Colors colors, long j) {
        if (!Color.m5658equalsimpl0(j, colors.m1953getPrimary0d7_KjU()) && !Color.m5658equalsimpl0(j, colors.m1954getPrimaryVariant0d7_KjU())) {
            if (!Color.m5658equalsimpl0(j, colors.m1955getSecondary0d7_KjU()) && !Color.m5658equalsimpl0(j, colors.m1956getSecondaryVariant0d7_KjU())) {
                return Color.m5658equalsimpl0(j, colors.m1946getBackground0d7_KjU()) ? colors.m1948getOnBackground0d7_KjU() : Color.m5658equalsimpl0(j, colors.m1957getSurface0d7_KjU()) ? colors.m1952getOnSurface0d7_KjU() : Color.m5658equalsimpl0(j, colors.m1947getError0d7_KjU()) ? colors.m1949getOnError0d7_KjU() : Color.INSTANCE.m5693getUnspecified0d7_KjU();
            }
            return colors.m1951getOnSecondary0d7_KjU();
        }
        return colors.m1950getOnPrimary0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1971contentColorForek8zF_U(long j, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 441849991, "C(contentColorFor)N(backgroundColor:c#ui.graphics.Color)310@11630L6:Colors.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:310)");
        }
        composer.startReplaceGroup(-583916561);
        ComposerKt.sourceInformation(composer, "*310@11701L7");
        long m1970contentColorFor4WTKRHQ = m1970contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j);
        if (m1970contentColorFor4WTKRHQ == 16) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            m1970contentColorFor4WTKRHQ = ((Color) consume).m5667unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m1970contentColorFor4WTKRHQ;
    }

    public static final void updateColorsFrom(Colors colors, Colors colors2) {
        colors.m1965setPrimary8_81llA$material(colors2.m1953getPrimary0d7_KjU());
        colors.m1966setPrimaryVariant8_81llA$material(colors2.m1954getPrimaryVariant0d7_KjU());
        colors.m1967setSecondary8_81llA$material(colors2.m1955getSecondary0d7_KjU());
        colors.m1968setSecondaryVariant8_81llA$material(colors2.m1956getSecondaryVariant0d7_KjU());
        colors.m1958setBackground8_81llA$material(colors2.m1946getBackground0d7_KjU());
        colors.m1969setSurface8_81llA$material(colors2.m1957getSurface0d7_KjU());
        colors.m1959setError8_81llA$material(colors2.m1947getError0d7_KjU());
        colors.m1962setOnPrimary8_81llA$material(colors2.m1950getOnPrimary0d7_KjU());
        colors.m1963setOnSecondary8_81llA$material(colors2.m1951getOnSecondary0d7_KjU());
        colors.m1960setOnBackground8_81llA$material(colors2.m1948getOnBackground0d7_KjU());
        colors.m1964setOnSurface8_81llA$material(colors2.m1952getOnSurface0d7_KjU());
        colors.m1961setOnError8_81llA$material(colors2.m1949getOnError0d7_KjU());
        colors.setLight$material(colors2.isLight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Colors LocalColors$lambda$1() {
        return m1975lightColors2qZNXz8$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
    }

    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }
}
