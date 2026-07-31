package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import com.google.android.exoplayer2.C;
import com.moloco.sdk.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes14.dex */
public final class u {
    public static final Unit a(Painter painter, Function0 function0, Modifier modifier, boolean z, String str, long j, long j2, long j3, Shape shape, long j4, int i, int i2, Composer composer, int i3) {
        a(painter, function0, modifier, z, str, j, j2, j3, shape, j4, composer, i | 1, i2);
        return Unit.INSTANCE;
    }

    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, i | 1);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b3  */
    @ComposableTarget
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(@NotNull final Painter painter, @NotNull final Function0 onClick, @Nullable Modifier modifier, boolean z, @Nullable String str, long j, long j2, long j3, @Nullable Shape shape, long j4, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        long j5;
        int i7;
        Shape shape2;
        int i8;
        Modifier modifier3;
        boolean z3;
        String str2;
        long j6;
        Shape f;
        long e;
        int i9;
        long j7;
        long j8;
        Object rememberedValue;
        Shape shape3;
        final boolean z4;
        final long j9;
        final long j10;
        final long j11;
        final String str3;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-2002285559);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((2 & i2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = 16 & i2;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(str) ? 16384 : 8192;
                    if ((i & 196608) == 0) {
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        j5 = j3;
                        i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j5)) ? 8388608 : 4194304;
                    } else {
                        j5 = j3;
                    }
                    i7 = 256 & i2;
                    if (i7 == 0) {
                        i3 |= 100663296;
                        shape2 = shape;
                    } else {
                        shape2 = shape;
                        if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changed(shape2) ? 67108864 : 33554432;
                        }
                    }
                    i8 = i2 & 512;
                    if (i8 == 0) {
                        i3 |= C.ENCODING_PCM_32BIT;
                    } else if ((805306368 & i) == 0) {
                        i3 |= startRestartGroup.changed(j4) ? 536870912 : 268435456;
                        if ((i3 & 306783379) != 306783378 && startRestartGroup.getSkipping()) {
                            startRestartGroup.skipToGroupEnd();
                            j10 = j4;
                            modifier4 = modifier2;
                            z4 = z2;
                            shape3 = shape2;
                            str3 = str;
                            j7 = j5;
                            j9 = j;
                            j11 = j2;
                        } else {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((32 & i2) != 0) {
                                    i3 &= -458753;
                                }
                                if ((128 & i2) != 0) {
                                    i3 &= -29360129;
                                }
                                str2 = str;
                                e = j4;
                                modifier3 = modifier2;
                                z3 = z2;
                                f = shape2;
                                i9 = i3;
                                j6 = j;
                                j7 = j5;
                                j8 = j2;
                            } else {
                                modifier3 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                                z3 = i4 == 0 ? z2 : true;
                                str2 = i5 != 0 ? null : str;
                                if ((32 & i2) != 0) {
                                    j6 = MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m796getPrimary0d7_KjU();
                                    i3 &= -458753;
                                } else {
                                    j6 = j;
                                }
                                long b = i6 != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j2;
                                if ((128 & i2) != 0) {
                                    i3 &= -29360129;
                                    j5 = b;
                                }
                                f = i7 != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f() : shape2;
                                e = i8 != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : j4;
                                i9 = i3;
                                j7 = j5;
                                j8 = b;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2002285559, i9, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.GenericIconButton (GenericIconButton.kt:54)");
                            }
                            Modifier m158backgroundbw27NRU$default = BackgroundKt.m158backgroundbw27NRU$default(ClipKt.clip(SizeKt.m358size6HolHcs(modifier3, j8), f), e, null, 2, null);
                            Indication m1075rememberRipple9IZ8Weo = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
                            startRestartGroup.startReplaceableGroup(-1646968890);
                            rememberedValue = startRestartGroup.rememberedValue();
                            shape3 = f;
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            Modifier m169clickableO2vRcR0 = ClickableKt.m169clickableO2vRcR0(m158backgroundbw27NRU$default, (MutableInteractionSource) rememberedValue, m1075rememberRipple9IZ8Weo, z3, str2, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            startRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            boolean z5 = z3;
                            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Modifier modifier5 = modifier3;
                            Function0 constructor = companion.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(m169clickableO2vRcR0);
                            if (startRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            startRestartGroup.disableReusing();
                            Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                            long j12 = j8;
                            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            startRestartGroup.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            startRestartGroup.startReplaceableGroup(-2137368960);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            IconKt.m886Iconww6aTOc(painter, str2, SizeKt.m358size6HolHcs(Modifier.INSTANCE, j7), j6, startRestartGroup, ((i9 >> 6) & 7168) | (i9 & 14) | ((i9 >> 9) & 112), 0);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z4 = z5;
                            j9 = j6;
                            j10 = e;
                            j11 = j12;
                            str3 = str2;
                            modifier4 = modifier5;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final long j13 = j7;
                            final Shape shape4 = shape3;
                            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return u.a(Painter.this, onClick, modifier4, z4, str3, j9, j11, j13, shape4, j10, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i3 & 306783379) != 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((32 & i2) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((128 & i2) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    i9 = i3;
                    j7 = j5;
                    j8 = b;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier m158backgroundbw27NRU$default2 = BackgroundKt.m158backgroundbw27NRU$default(ClipKt.clip(SizeKt.m358size6HolHcs(modifier3, j8), f), e, null, 2, null);
                    Indication m1075rememberRipple9IZ8Weo2 = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
                    startRestartGroup.startReplaceableGroup(-1646968890);
                    rememberedValue = startRestartGroup.rememberedValue();
                    shape3 = f;
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier m169clickableO2vRcR02 = ClickableKt.m169clickableO2vRcR0(m158backgroundbw27NRU$default2, (MutableInteractionSource) rememberedValue, m1075rememberRipple9IZ8Weo2, z3, str2, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    startRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    boolean z52 = z3;
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Modifier modifier52 = modifier3;
                    Function0 constructor2 = companion2.getConstructor();
                    Function3 materializerOf2 = LayoutKt.materializerOf(m169clickableO2vRcR02);
                    if (startRestartGroup.getApplier() == null) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    startRestartGroup.disableReusing();
                    Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
                    long j122 = j8;
                    Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    IconKt.m886Iconww6aTOc(painter, str2, SizeKt.m358size6HolHcs(Modifier.INSTANCE, j7), j6, startRestartGroup, ((i9 >> 6) & 7168) | (i9 & 14) | ((i9 >> 9) & 112), 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z4 = z52;
                    j9 = j6;
                    j10 = e;
                    j11 = j122;
                    str3 = str2;
                    modifier4 = modifier52;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i & 196608) == 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i7 = 256 & i2;
                if (i7 == 0) {
                }
                i8 = i2 & 512;
                if (i8 == 0) {
                }
                if ((i3 & 306783379) != 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                }
                if (i10 != 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if ((32 & i2) != 0) {
                }
                if (i6 != 0) {
                }
                if ((128 & i2) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                i9 = i3;
                j7 = j5;
                j8 = b;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier m158backgroundbw27NRU$default22 = BackgroundKt.m158backgroundbw27NRU$default(ClipKt.clip(SizeKt.m358size6HolHcs(modifier3, j8), f), e, null, 2, null);
                Indication m1075rememberRipple9IZ8Weo22 = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
                startRestartGroup.startReplaceableGroup(-1646968890);
                rememberedValue = startRestartGroup.rememberedValue();
                shape3 = f;
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                Modifier m169clickableO2vRcR022 = ClickableKt.m169clickableO2vRcR0(m158backgroundbw27NRU$default22, (MutableInteractionSource) rememberedValue, m1075rememberRipple9IZ8Weo22, z3, str2, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick);
                Alignment center22 = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                boolean z522 = z3;
                ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Modifier modifier522 = modifier3;
                Function0 constructor22 = companion22.getConstructor();
                Function3 materializerOf22 = LayoutKt.materializerOf(m169clickableO2vRcR022);
                if (startRestartGroup.getApplier() == null) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl22 = Updater.m1149constructorimpl(startRestartGroup);
                long j1222 = j8;
                Updater.m1153setimpl(m1149constructorimpl22, rememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl22, density22, companion22.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl22, layoutDirection22, companion22.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl22, viewConfiguration22, companion22.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                IconKt.m886Iconww6aTOc(painter, str2, SizeKt.m358size6HolHcs(Modifier.INSTANCE, j7), j6, startRestartGroup, ((i9 >> 6) & 7168) | (i9 & 14) | ((i9 >> 9) & 112), 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                z4 = z522;
                j9 = j6;
                j10 = e;
                j11 = j1222;
                str3 = str2;
                modifier4 = modifier522;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = 16 & i2;
            if (i5 != 0) {
            }
            if ((i & 196608) == 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i7 = 256 & i2;
            if (i7 == 0) {
            }
            i8 = i2 & 512;
            if (i8 == 0) {
            }
            if ((i3 & 306783379) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            if (i10 != 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if ((32 & i2) != 0) {
            }
            if (i6 != 0) {
            }
            if ((128 & i2) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            i9 = i3;
            j7 = j5;
            j8 = b;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m158backgroundbw27NRU$default222 = BackgroundKt.m158backgroundbw27NRU$default(ClipKt.clip(SizeKt.m358size6HolHcs(modifier3, j8), f), e, null, 2, null);
            Indication m1075rememberRipple9IZ8Weo222 = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
            startRestartGroup.startReplaceableGroup(-1646968890);
            rememberedValue = startRestartGroup.rememberedValue();
            shape3 = f;
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m169clickableO2vRcR0222 = ClickableKt.m169clickableO2vRcR0(m158backgroundbw27NRU$default222, (MutableInteractionSource) rememberedValue, m1075rememberRipple9IZ8Weo222, z3, str2, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick);
            Alignment center222 = Alignment.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            boolean z5222 = z3;
            ViewConfiguration viewConfiguration222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
            Modifier modifier5222 = modifier3;
            Function0 constructor222 = companion222.getConstructor();
            Function3 materializerOf222 = LayoutKt.materializerOf(m169clickableO2vRcR0222);
            if (startRestartGroup.getApplier() == null) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl222 = Updater.m1149constructorimpl(startRestartGroup);
            long j12222 = j8;
            Updater.m1153setimpl(m1149constructorimpl222, rememberBoxMeasurePolicy222, companion222.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl222, density222, companion222.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl222, layoutDirection222, companion222.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl222, viewConfiguration222, companion222.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            IconKt.m886Iconww6aTOc(painter, str2, SizeKt.m358size6HolHcs(Modifier.INSTANCE, j7), j6, startRestartGroup, ((i9 >> 6) & 7168) | (i9 & 14) | ((i9 >> 9) & 112), 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            z4 = z5222;
            j9 = j6;
            j10 = e;
            j11 = j12222;
            str3 = str2;
            modifier4 = modifier5222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = 16 & i2;
        if (i5 != 0) {
        }
        if ((i & 196608) == 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i7 = 256 & i2;
        if (i7 == 0) {
        }
        i8 = i2 & 512;
        if (i8 == 0) {
        }
        if ((i3 & 306783379) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i10 != 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if ((32 & i2) != 0) {
        }
        if (i6 != 0) {
        }
        if ((128 & i2) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        i9 = i3;
        j7 = j5;
        j8 = b;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m158backgroundbw27NRU$default2222 = BackgroundKt.m158backgroundbw27NRU$default(ClipKt.clip(SizeKt.m358size6HolHcs(modifier3, j8), f), e, null, 2, null);
        Indication m1075rememberRipple9IZ8Weo2222 = RippleKt.m1075rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
        startRestartGroup.startReplaceableGroup(-1646968890);
        rememberedValue = startRestartGroup.rememberedValue();
        shape3 = f;
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        Modifier m169clickableO2vRcR02222 = ClickableKt.m169clickableO2vRcR0(m158backgroundbw27NRU$default2222, (MutableInteractionSource) rememberedValue, m1075rememberRipple9IZ8Weo2222, z3, str2, Role.m2157boximpl(Role.INSTANCE.m2164getButtono7Vup1c()), onClick);
        Alignment center2222 = Alignment.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(center2222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density2222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        boolean z52222 = z3;
        ViewConfiguration viewConfiguration2222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2222 = ComposeUiNode.INSTANCE;
        Modifier modifier52222 = modifier3;
        Function0 constructor2222 = companion2222.getConstructor();
        Function3 materializerOf2222 = LayoutKt.materializerOf(m169clickableO2vRcR02222);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl2222 = Updater.m1149constructorimpl(startRestartGroup);
        long j122222 = j8;
        Updater.m1153setimpl(m1149constructorimpl2222, rememberBoxMeasurePolicy2222, companion2222.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl2222, density2222, companion2222.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl2222, layoutDirection2222, companion2222.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl2222, viewConfiguration2222, companion2222.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        IconKt.m886Iconww6aTOc(painter, str2, SizeKt.m358size6HolHcs(Modifier.INSTANCE, j7), j6, startRestartGroup, ((i9 >> 6) & 7168) | (i9 & 14) | ((i9 >> 9) & 112), 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        z4 = z52222;
        j9 = j6;
        j10 = e;
        j11 = j122222;
        str3 = str2;
        modifier4 = modifier52222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    @ComposableTarget
    @Composable
    public static final void a(@Nullable Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1484935213);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1484935213, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.Preview (GenericIconButton.kt:81)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, n.a.a(), startRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u.a(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ ImageView a(Context context, int i, int i2, int i3, int i4, boolean z, String str, Integer num, Function0 function0, int i5, Object obj) {
        int dimensionPixelSize = (i5 & 8) != 0 ? context.getResources().getDimensionPixelSize(R.dimen.moloco_default_button_size) : i3;
        return a(context, i, i2, dimensionPixelSize, (i5 & 16) != 0 ? dimensionPixelSize : i4, (i5 & 32) != 0 ? true : z, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? null : num, function0);
    }

    @NotNull
    public static final ImageView a(@NotNull Context context, @DrawableRes int i, @ColorInt int i2, int i3, int i4, boolean z, @Nullable String str, @ColorInt @Nullable Integer num, @NotNull final Function0 onClick) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        int coerceAtLeast = RangesKt.coerceAtLeast((i3 - i4) / 2, 0);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(i3, i3));
        if (num != null) {
            drawable = a(context, num.intValue());
        } else {
            drawable = ContextCompat.getDrawable(context, R.drawable.moloco_icon_button_background);
        }
        imageView.setBackground(drawable);
        imageView.setPadding(coerceAtLeast, coerceAtLeast, coerceAtLeast, coerceAtLeast);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(i);
        ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(i2));
        imageView.setEnabled(z);
        imageView.setFocusable(true);
        imageView.setContentDescription(str);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.a(Function0.this, view);
            }
        });
        return imageView;
    }

    public static final void a(Function0 function0, View view) {
        function0.mo4828invoke();
    }

    public static final RippleDrawable a(Context context, @ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(-1);
        return new RippleDrawable(ColorStateList.valueOf(a(context)), gradientDrawable, gradientDrawable2);
    }

    @ColorInt
    public static final int a(Context context) {
        int i;
        TypedValue typedValue = new TypedValue();
        return (!context.getTheme().resolveAttribute(android.R.attr.colorControlHighlight, typedValue, true) || (i = typedValue.data) == 0) ? ContextCompat.getColor(context, R.color.moloco_icon_button_ripple_fallback) : i;
    }
}
