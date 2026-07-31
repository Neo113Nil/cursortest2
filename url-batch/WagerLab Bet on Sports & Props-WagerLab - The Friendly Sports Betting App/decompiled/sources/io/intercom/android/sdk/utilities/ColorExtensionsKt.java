package io.intercom.android.sdk.utilities;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.devlauncher.launcher.manifest.DevLauncherUserInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColorExtensions.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0003\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\n*\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\n*\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\n*\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\f\u001a\u0013\u0010\u0011\u001a\u00020\n*\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\f\u001a\u0013\u0010\u0013\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0006\u001a\u0013\u0010\u0015\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0006\u001a\u0013\u0010\u0017\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0006\u001a\u0013\u0010\u0019\u001a\u00020\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\f\u001a\u001b\u0010\u001b\u001a\u00020\u0004*\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u001e\u001a\u001e\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u001cH\u0000\u001a\u0013\u0010\"\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"BRIGHTNESS_CUTOFF", "", "WHITENESS_CUTOFF", "darken", "Landroidx/compose/ui/graphics/Color;", "darken-8_81llA", "(J)J", "lighten", "lighten-8_81llA", "isDarkColor", "", "isDarkColor-8_81llA", "(J)Z", "isLightColor", "isLightColor-8_81llA", "isWhite", "isWhite-8_81llA", "isBlack", "isBlack-8_81llA", "generateTextColor", "generateTextColor-8_81llA", "getAccessibleBorderColor", "getAccessibleBorderColor-8_81llA", "getAccessibleColorOnWhiteBackground", "getAccessibleColorOnWhiteBackground-8_81llA", "isColorTooWhite", "isColorTooWhite-8_81llA", "toComposeColor", "", ViewProps.OPACITY, "(Ljava/lang/String;F)J", "getGreetingTextColor", "Lkotlin/Pair;", "textColorType", "getAccessibleColorOnDarkBackground", "getAccessibleColorOnDarkBackground-8_81llA", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ColorExtensionsKt {
    private static final float BRIGHTNESS_CUTOFF = 0.6f;
    private static final float WHITENESS_CUTOFF = 0.9411765f;

    /* renamed from: darken-8_81llA, reason: not valid java name */
    public static final long m12237darken8_81llA(long j) {
        return ColorKt.Color(ColorUtils.darkenColor(ColorKt.m5711toArgb8_81llA(j)));
    }

    /* renamed from: lighten-8_81llA, reason: not valid java name */
    public static final long m12247lighten8_81llA(long j) {
        return ColorKt.Color(ColorUtils.lightenColor(ColorKt.m5711toArgb8_81llA(j)));
    }

    /* renamed from: isDarkColor-8_81llA, reason: not valid java name */
    public static final boolean m12244isDarkColor8_81llA(long j) {
        return ColorKt.m5709luminance8_81llA(j) < 0.6f;
    }

    /* renamed from: isLightColor-8_81llA, reason: not valid java name */
    public static final boolean m12245isLightColor8_81llA(long j) {
        return !m12244isDarkColor8_81llA(j);
    }

    /* renamed from: isWhite-8_81llA, reason: not valid java name */
    public static final boolean m12246isWhite8_81llA(long j) {
        return Color.m5658equalsimpl0(j, Color.INSTANCE.m5694getWhite0d7_KjU());
    }

    /* renamed from: isBlack-8_81llA, reason: not valid java name */
    public static final boolean m12242isBlack8_81llA(long j) {
        return Color.m5658equalsimpl0(j, Color.INSTANCE.m5683getBlack0d7_KjU());
    }

    /* renamed from: generateTextColor-8_81llA, reason: not valid java name */
    public static final long m12238generateTextColor8_81llA(long j) {
        return m12244isDarkColor8_81llA(j) ? Color.INSTANCE.m5694getWhite0d7_KjU() : Color.INSTANCE.m5683getBlack0d7_KjU();
    }

    /* renamed from: getAccessibleBorderColor-8_81llA, reason: not valid java name */
    public static final long m12239getAccessibleBorderColor8_81llA(long j) {
        return m12244isDarkColor8_81llA(j) ? m12247lighten8_81llA(j) : m12237darken8_81llA(j);
    }

    /* renamed from: getAccessibleColorOnWhiteBackground-8_81llA, reason: not valid java name */
    public static final long m12241getAccessibleColorOnWhiteBackground8_81llA(long j) {
        return m12243isColorTooWhite8_81llA(j) ? Color.INSTANCE.m5683getBlack0d7_KjU() : j;
    }

    /* renamed from: isColorTooWhite-8_81llA, reason: not valid java name */
    private static final boolean m12243isColorTooWhite8_81llA(long j) {
        return Color.m5663getRedimpl(j) >= WHITENESS_CUTOFF && Color.m5662getGreenimpl(j) >= WHITENESS_CUTOFF && Color.m5660getBlueimpl(j) >= WHITENESS_CUTOFF;
    }

    public static /* synthetic */ long toComposeColor$default(String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return toComposeColor(str, f);
    }

    public static final long toComposeColor(String str, float f) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Color.m5656copywmQWz5c$default(ColorKt.Color(ColorUtils.parseColor(str)), f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final Pair<String, Float> getGreetingTextColor(String str) {
        return Intrinsics.areEqual(str, DevLauncherUserInterface.DARK) ? new Pair<>("#000000", Float.valueOf(0.6f)) : Intrinsics.areEqual(str, DevLauncherUserInterface.LIGHT) ? new Pair<>("#FFFFFF", Float.valueOf(0.7f)) : new Pair<>("#000000", Float.valueOf(1.0f));
    }

    /* renamed from: getAccessibleColorOnDarkBackground-8_81llA, reason: not valid java name */
    public static final long m12240getAccessibleColorOnDarkBackground8_81llA(long j) {
        return m12244isDarkColor8_81llA(j) ? m12247lighten8_81llA(j) : j;
    }
}
