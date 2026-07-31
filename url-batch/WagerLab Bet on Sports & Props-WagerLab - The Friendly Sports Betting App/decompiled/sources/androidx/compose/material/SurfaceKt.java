package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Surface.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a`\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u008c\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00142\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0092\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00142\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u001e2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001f\u001a5\u0010 \u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#\u001a)\u0010$\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\fH\u0003¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Surface", "", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", ViewProps.ON_CLICK, ViewProps.ENABLED, "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Surface-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-Ny5ogXk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surface", "backgroundColor", "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "surfaceColorAtElevation", "elevationOverlay", "Landroidx/compose/material/ElevationOverlay;", "absoluteElevation", "surfaceColorAtElevation-cq6XJ1M", "(JLandroidx/compose/material/ElevationOverlay;FLandroidx/compose/runtime/Composer;I)J", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurfaceKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Surface_F_jzlyU$lambda$0(Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, Function2 function2, int i, int i2, Composer composer, int i3) {
        m2169SurfaceFjzlyU(modifier, shape, j, j2, borderStroke, f, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Surface_LPr_se0$lambda$1(Function0 function0, Modifier modifier, boolean z, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        m2170SurfaceLPr_se0(function0, modifier, z, shape, j, j2, borderStroke, f, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Surface_Ny5ogXk$lambda$2(boolean z, Function0 function0, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        m2171SurfaceNy5ogXk(z, (Function0<Unit>) function0, modifier, z2, shape, j, j2, borderStroke, f, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Surface_Ny5ogXk$lambda$3(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        m2172SurfaceNy5ogXk(z, (Function1<? super Boolean, Unit>) function1, modifier, z2, shape, j, j2, borderStroke, f, mutableInteractionSource, (Function2<? super Composer, ? super Integer, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0087  */
    /* renamed from: Surface-F-jzlyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2169SurfaceFjzlyU(Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        BorderStroke borderStroke2;
        int i5;
        final Shape shape3;
        long j5;
        final BorderStroke borderStroke3;
        final float f2;
        ScopeUpdateScope endRestartGroup;
        float m8401constructorimpl;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(174096871);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)N(modifier,shape,color:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,border,elevation:c#ui.unit.Dp,content)102@5257L7,106@5421L878,103@5281L1018:Surface.kt#jmzs0o");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    j4 = j2;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                borderStroke2 = borderStroke;
                i3 |= startRestartGroup.changed(borderStroke2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "96@5039L6,97@5081L22");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i9 != 0) {
                            shape2 = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i2 & 4) != 0) {
                            j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1957getSurface0d7_KjU();
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            j4 = ColorsKt.m1971contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            borderStroke2 = null;
                        }
                        if (i5 != 0) {
                            m8401constructorimpl = Dp.m8401constructorimpl(0);
                            Shape shape4 = shape2;
                            j5 = j3;
                            BorderStroke borderStroke4 = borderStroke2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(174096871, i3, -1, "androidx.compose.material.Surface (Surface.kt:101)");
                            }
                            ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localAbsoluteElevation);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            float m8401constructorimpl2 = Dp.m8401constructorimpl(((Dp) consume).m8415unboximpl() + m8401constructorimpl);
                            Modifier modifier3 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m5647boximpl(j4)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m8399boximpl(m8401constructorimpl2))}, ComposableLambdaKt.rememberComposableLambda(-2004281689, true, new SurfaceKt$Surface$1(modifier3, shape4, j5, m8401constructorimpl2, borderStroke4, m8401constructorimpl, function2), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            shape3 = shape4;
                            borderStroke3 = borderStroke4;
                            f2 = m8401constructorimpl;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                    }
                    m8401constructorimpl = f;
                    Shape shape42 = shape2;
                    j5 = j3;
                    BorderStroke borderStroke42 = borderStroke2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Dp> localAbsoluteElevation2 = ElevationOverlayKt.getLocalAbsoluteElevation();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localAbsoluteElevation2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float m8401constructorimpl22 = Dp.m8401constructorimpl(((Dp) consume2).m8415unboximpl() + m8401constructorimpl);
                    Modifier modifier32 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m5647boximpl(j4)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m8399boximpl(m8401constructorimpl22))}, ComposableLambdaKt.rememberComposableLambda(-2004281689, true, new SurfaceKt$Surface$1(modifier32, shape42, j5, m8401constructorimpl22, borderStroke42, m8401constructorimpl, function2), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier32;
                    shape3 = shape42;
                    borderStroke3 = borderStroke42;
                    f2 = m8401constructorimpl;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    shape3 = shape2;
                    j5 = j3;
                    borderStroke3 = borderStroke2;
                    f2 = f;
                }
                final long j6 = j4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    final long j7 = j5;
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SurfaceKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Surface_F_jzlyU$lambda$0;
                            Surface_F_jzlyU$lambda$0 = SurfaceKt.Surface_F_jzlyU$lambda$0(Modifier.this, shape3, j7, j6, borderStroke3, f2, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return Surface_F_jzlyU$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            borderStroke2 = borderStroke;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            final long j62 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        shape2 = shape;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        borderStroke2 = borderStroke;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        final long j622 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: Surface-LPr_se0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2170SurfaceLPr_se0(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Shape shape2;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final BorderStroke borderStroke2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final long j4;
        final long j5;
        final float f2;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        long j6;
        final MutableInteractionSource mutableInteractionSource3;
        final float f3;
        final Modifier modifier4;
        final boolean z4;
        final Shape shape4;
        final long j7;
        long j8;
        int i12;
        final BorderStroke borderStroke3;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(2141308794);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)N(onClick,modifier,enabled,shape,color:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,border,elevation:c#ui.unit.Dp,interactionSource,content)208@11026L7,212@11190L967,209@11050L1107:Surface.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    shape2 = shape;
                    i3 |= startRestartGroup.changed(shape2) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i15 = 16384;
                                i3 |= i15;
                            }
                        } else {
                            j3 = j;
                        }
                        i15 = 8192;
                        i3 |= i15;
                    } else {
                        j3 = j;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            i13 = i3;
                            if (startRestartGroup.changed(j2)) {
                                i14 = 131072;
                                i6 = i13 | i14;
                            }
                        } else {
                            i13 = i3;
                        }
                        i14 = 65536;
                        i6 = i13 | i14;
                    } else {
                        i6 = i3;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i6 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i6 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i6 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i9 = i8;
                        i6 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                        i10 = i2 & 256;
                        if (i10 != 0) {
                            i6 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i11 = i10;
                            i6 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : 33554432;
                            if ((i2 & 512) == 0) {
                                i6 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i6 |= startRestartGroup.changedInstance(function2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "201@10751L6,202@10793L22");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i2 & 16) != 0) {
                                            i6 &= -57345;
                                        }
                                        if ((i2 & 32) != 0) {
                                            i6 &= -458753;
                                        }
                                        borderStroke3 = borderStroke;
                                        f3 = f;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        modifier4 = modifier2;
                                        z4 = z2;
                                        shape4 = shape2;
                                        j7 = j3;
                                        i12 = 2141308794;
                                        j8 = j2;
                                    } else {
                                        if (i16 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            z2 = true;
                                        }
                                        if (i5 != 0) {
                                            shape2 = RectangleShapeKt.getRectangleShape();
                                        }
                                        if ((i2 & 16) != 0) {
                                            j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1957getSurface0d7_KjU();
                                            i6 &= -57345;
                                        }
                                        if ((i2 & 32) != 0) {
                                            j6 = ColorsKt.m1971contentColorForek8zF_U(j3, startRestartGroup, (i6 >> 12) & 14);
                                            i6 &= -458753;
                                        } else {
                                            j6 = j2;
                                        }
                                        BorderStroke borderStroke4 = i7 != 0 ? null : borderStroke;
                                        float m8401constructorimpl = i9 != 0 ? Dp.m8401constructorimpl(0) : f;
                                        mutableInteractionSource3 = i11 != 0 ? null : mutableInteractionSource;
                                        f3 = m8401constructorimpl;
                                        modifier4 = modifier2;
                                        z4 = z2;
                                        shape4 = shape2;
                                        j7 = j3;
                                        j8 = j6;
                                        i12 = 2141308794;
                                        borderStroke3 = borderStroke4;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(i12, i6, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                                    }
                                    ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localAbsoluteElevation);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final float m8401constructorimpl2 = Dp.m8401constructorimpl(((Dp) consume).m8415unboximpl() + f3);
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m5647boximpl(j8)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m8399boximpl(m8401constructorimpl2))}, ComposableLambdaKt.rememberComposableLambda(-1766606150, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$3
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i17) {
                                            long m2176surfaceColorAtElevationcq6XJ1M;
                                            Modifier m2175surface8ww4TTg;
                                            ComposerKt.sourceInformation(composer2, "C222@11592L7,220@11447L254,213@11200L951:Surface.kt#jmzs0o");
                                            if (!composer2.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1766606150, i17, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:213)");
                                            }
                                            Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.this);
                                            Shape shape5 = shape4;
                                            long j9 = j7;
                                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume2 = composer2.consume(localElevationOverlay);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            m2176surfaceColorAtElevationcq6XJ1M = SurfaceKt.m2176surfaceColorAtElevationcq6XJ1M(j9, (ElevationOverlay) consume2, m8401constructorimpl2, composer2, 0);
                                            m2175surface8ww4TTg = SurfaceKt.m2175surface8ww4TTg(minimumInteractiveComponentSize, shape5, m2176surfaceColorAtElevationcq6XJ1M, borderStroke3, f3);
                                            Modifier m299clickableO2vRcR0$default = ClickableKt.m299clickableO2vRcR0$default(m2175surface8ww4TTg, mutableInteractionSource3, RippleKt.m2121rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z4, null, null, function0, 24, null);
                                            Function2<Composer, Integer, Unit> function22 = function2;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m299clickableO2vRcR0$default);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer2, -2077913498, "C236@12132L9:Surface.kt#jmzs0o");
                                            function22.invoke(composer2, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    j5 = j8;
                                    modifier3 = modifier4;
                                    shape3 = shape4;
                                    j4 = j7;
                                    borderStroke2 = borderStroke3;
                                    f2 = f3;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    z3 = z4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    borderStroke2 = borderStroke;
                                    modifier3 = modifier2;
                                    z3 = z2;
                                    shape3 = shape2;
                                    j4 = j3;
                                    j5 = j2;
                                    f2 = f;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SurfaceKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Surface_LPr_se0$lambda$1;
                                            Surface_LPr_se0$lambda$1 = SurfaceKt.Surface_LPr_se0$lambda$1(Function0.this, modifier3, z3, shape3, j4, j5, borderStroke2, f2, mutableInteractionSource2, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            return Surface_LPr_se0$lambda$1;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i11 = i10;
                        if ((i2 & 512) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i9 = i8;
                    i10 = i2 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if ((i2 & 512) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                shape2 = shape;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i2 & 512) == 0) {
                }
                if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            shape2 = shape;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i2 & 512) == 0) {
            }
            if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        shape2 = shape;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i2 & 512) == 0) {
        }
        if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2171SurfaceNy5ogXk(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function0<Unit> function02;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        Shape shape2;
        int i8;
        BorderStroke borderStroke2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final long j3;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z4;
        final Shape shape3;
        final BorderStroke borderStroke3;
        final long j4;
        final float f2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        long j5;
        long j6;
        final MutableInteractionSource mutableInteractionSource3;
        final float f3;
        final Shape shape4;
        final long j7;
        final boolean z5;
        final BorderStroke borderStroke4;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-258978402);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)N(selected,onClick,modifier,enabled,shape,color:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,border,elevation:c#ui.unit.Dp,interactionSource,content)318@16972L7,322@17136L1013,319@16996L1153:Surface.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i4 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    z3 = z2;
                    i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        shape2 = shape;
                        i4 |= startRestartGroup.changed(shape2) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
                        }
                        if ((i & 1572864) == 0) {
                            i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288;
                        }
                        i8 = i3 & 128;
                        if (i8 != 0) {
                            i4 |= 12582912;
                            borderStroke2 = borderStroke;
                        } else {
                            borderStroke2 = borderStroke;
                            if ((i & 12582912) == 0) {
                                i4 |= startRestartGroup.changed(borderStroke2) ? 8388608 : 4194304;
                            }
                        }
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i10 = i9;
                            i4 |= startRestartGroup.changed(f) ? 67108864 : 33554432;
                            i11 = i3 & 512;
                            if (i11 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i12 = i11;
                                i4 |= startRestartGroup.changed(mutableInteractionSource) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                if ((i3 & 1024) != 0) {
                                    i13 = i2 | 6;
                                } else if ((i2 & 6) == 0) {
                                    i13 = i2 | (startRestartGroup.changedInstance(function2) ? 4 : 2);
                                } else {
                                    i13 = i2;
                                }
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "311@16697L6,312@16739L22");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        j7 = j;
                                        f3 = f;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        companion = modifier2;
                                        z5 = z3;
                                        shape4 = shape2;
                                        borderStroke4 = borderStroke2;
                                        i14 = -258978402;
                                        j6 = j2;
                                    } else {
                                        companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                                        if (i6 != 0) {
                                            z3 = true;
                                        }
                                        Shape rectangleShape = i7 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                        if ((i3 & 32) != 0) {
                                            j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1957getSurface0d7_KjU();
                                            i4 &= -458753;
                                        } else {
                                            j5 = j;
                                        }
                                        if ((i3 & 64) != 0) {
                                            j6 = ColorsKt.m1971contentColorForek8zF_U(j5, startRestartGroup, (i4 >> 15) & 14);
                                            i4 = (-3670017) & i4;
                                        } else {
                                            j6 = j2;
                                        }
                                        if (i8 != 0) {
                                            borderStroke2 = null;
                                        }
                                        float m8401constructorimpl = i10 != 0 ? Dp.m8401constructorimpl(0) : f;
                                        if (i12 != 0) {
                                            f3 = m8401constructorimpl;
                                            shape4 = rectangleShape;
                                            j7 = j5;
                                            z5 = z3;
                                            borderStroke4 = borderStroke2;
                                            i14 = -258978402;
                                            mutableInteractionSource3 = null;
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            f3 = m8401constructorimpl;
                                            shape4 = rectangleShape;
                                            j7 = j5;
                                            z5 = z3;
                                            borderStroke4 = borderStroke2;
                                            i14 = -258978402;
                                        }
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(i14, i4, i13, "androidx.compose.material.Surface (Surface.kt:317)");
                                    }
                                    ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localAbsoluteElevation);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final float m8401constructorimpl2 = Dp.m8401constructorimpl(((Dp) consume).m8415unboximpl() + f3);
                                    final Modifier modifier4 = companion;
                                    final Function0<Unit> function03 = function02;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m5647boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m8399boximpl(m8401constructorimpl2))}, ComposableLambdaKt.rememberComposableLambda(1830486238, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i15) {
                                            long m2176surfaceColorAtElevationcq6XJ1M;
                                            Modifier m2175surface8ww4TTg;
                                            ComposerKt.sourceInformation(composer2, "C332@17538L7,330@17393L254,323@17146L997:Surface.kt#jmzs0o");
                                            if (!composer2.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1830486238, i15, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:323)");
                                            }
                                            Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.this);
                                            Shape shape5 = shape4;
                                            long j8 = j7;
                                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume2 = composer2.consume(localElevationOverlay);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            m2176surfaceColorAtElevationcq6XJ1M = SurfaceKt.m2176surfaceColorAtElevationcq6XJ1M(j8, (ElevationOverlay) consume2, m8401constructorimpl2, composer2, 0);
                                            m2175surface8ww4TTg = SurfaceKt.m2175surface8ww4TTg(minimumInteractiveComponentSize, shape5, m2176surfaceColorAtElevationcq6XJ1M, borderStroke4, f3);
                                            Modifier m1165selectableO2vRcR0$default = SelectableKt.m1165selectableO2vRcR0$default(m2175surface8ww4TTg, z, mutableInteractionSource3, RippleKt.m2121rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z5, null, function03, 16, null);
                                            Function2<Composer, Integer, Unit> function22 = function2;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1165selectableO2vRcR0$default);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1999142974, "C347@18124L9:Surface.kt#jmzs0o");
                                            function22.invoke(composer2, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    j4 = j6;
                                    modifier3 = modifier4;
                                    shape3 = shape4;
                                    j3 = j7;
                                    borderStroke3 = borderStroke4;
                                    f2 = f3;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    z4 = z5;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    j3 = j;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    z4 = z3;
                                    shape3 = shape2;
                                    borderStroke3 = borderStroke2;
                                    j4 = j2;
                                    f2 = f;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SurfaceKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Surface_Ny5ogXk$lambda$2;
                                            Surface_Ny5ogXk$lambda$2 = SurfaceKt.Surface_Ny5ogXk$lambda$2(z, function0, modifier3, z4, shape3, j3, j4, borderStroke3, f2, mutableInteractionSource2, function2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            return Surface_Ny5ogXk$lambda$2;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i12 = i11;
                            if ((i3 & 1024) != 0) {
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i10 = i9;
                        i11 = i3 & 512;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        if ((i3 & 1024) != 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    shape2 = shape;
                    if ((196608 & i) == 0) {
                    }
                    if ((i & 1572864) == 0) {
                    }
                    i8 = i3 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i3 & 512;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if ((i3 & 1024) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z3 = z2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                shape2 = shape;
                if ((196608 & i) == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i3 & 1024) != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z3 = z2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            shape2 = shape;
            if ((196608 & i) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i3 & 1024) != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function02 = function0;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z3 = z2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        shape2 = shape;
        if ((196608 & i) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i3 & 1024) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2172SurfaceNy5ogXk(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function1<? super Boolean, Unit> function12;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        Shape shape2;
        int i8;
        BorderStroke borderStroke2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final long j3;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z4;
        final Shape shape3;
        final BorderStroke borderStroke3;
        final long j4;
        final float f2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        long j5;
        long j6;
        final MutableInteractionSource mutableInteractionSource3;
        final float f3;
        final Shape shape4;
        final long j7;
        final boolean z5;
        final BorderStroke borderStroke4;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-391302147);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)N(checked,onCheckedChange,modifier,enabled,shape,color:c#ui.graphics.Color,contentColor:c#ui.graphics.Color,border,elevation:c#ui.unit.Dp,interactionSource,content)429@23038L7,433@23202L1023,430@23062L1163:Surface.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            function12 = function1;
            i4 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    z3 = z2;
                    i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        shape2 = shape;
                        i4 |= startRestartGroup.changed(shape2) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j)) ? 131072 : 65536;
                        }
                        if ((i & 1572864) == 0) {
                            i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288;
                        }
                        i8 = i3 & 128;
                        if (i8 != 0) {
                            i4 |= 12582912;
                            borderStroke2 = borderStroke;
                        } else {
                            borderStroke2 = borderStroke;
                            if ((i & 12582912) == 0) {
                                i4 |= startRestartGroup.changed(borderStroke2) ? 8388608 : 4194304;
                            }
                        }
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i10 = i9;
                            i4 |= startRestartGroup.changed(f) ? 67108864 : 33554432;
                            i11 = i3 & 512;
                            if (i11 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i12 = i11;
                                i4 |= startRestartGroup.changed(mutableInteractionSource) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                if ((i3 & 1024) != 0) {
                                    i13 = i2 | 6;
                                } else if ((i2 & 6) == 0) {
                                    i13 = i2 | (startRestartGroup.changedInstance(function2) ? 4 : 2);
                                } else {
                                    i13 = i2;
                                }
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "422@22763L6,423@22805L22");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        j7 = j;
                                        f3 = f;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        companion = modifier2;
                                        z5 = z3;
                                        shape4 = shape2;
                                        borderStroke4 = borderStroke2;
                                        i14 = -391302147;
                                        j6 = j2;
                                    } else {
                                        companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                                        if (i6 != 0) {
                                            z3 = true;
                                        }
                                        Shape rectangleShape = i7 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                        if ((i3 & 32) != 0) {
                                            j5 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1957getSurface0d7_KjU();
                                            i4 &= -458753;
                                        } else {
                                            j5 = j;
                                        }
                                        if ((i3 & 64) != 0) {
                                            j6 = ColorsKt.m1971contentColorForek8zF_U(j5, startRestartGroup, (i4 >> 15) & 14);
                                            i4 = (-3670017) & i4;
                                        } else {
                                            j6 = j2;
                                        }
                                        if (i8 != 0) {
                                            borderStroke2 = null;
                                        }
                                        float m8401constructorimpl = i10 != 0 ? Dp.m8401constructorimpl(0) : f;
                                        if (i12 != 0) {
                                            f3 = m8401constructorimpl;
                                            shape4 = rectangleShape;
                                            j7 = j5;
                                            z5 = z3;
                                            borderStroke4 = borderStroke2;
                                            i14 = -391302147;
                                            mutableInteractionSource3 = null;
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            f3 = m8401constructorimpl;
                                            shape4 = rectangleShape;
                                            j7 = j5;
                                            z5 = z3;
                                            borderStroke4 = borderStroke2;
                                            i14 = -391302147;
                                        }
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(i14, i4, i13, "androidx.compose.material.Surface (Surface.kt:428)");
                                    }
                                    ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localAbsoluteElevation);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final float m8401constructorimpl2 = Dp.m8401constructorimpl(((Dp) consume).m8415unboximpl() + f3);
                                    final Modifier modifier4 = companion;
                                    final Function1<? super Boolean, Unit> function13 = function12;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m5647boximpl(j6)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m8399boximpl(m8401constructorimpl2))}, ComposableLambdaKt.rememberComposableLambda(1698162493, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i15) {
                                            long m2176surfaceColorAtElevationcq6XJ1M;
                                            Modifier m2175surface8ww4TTg;
                                            ComposerKt.sourceInformation(composer2, "C443@23604L7,441@23459L254,434@23212L1007:Surface.kt#jmzs0o");
                                            if (!composer2.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1698162493, i15, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:434)");
                                            }
                                            Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.this);
                                            Shape shape5 = shape4;
                                            long j8 = j7;
                                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume2 = composer2.consume(localElevationOverlay);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            m2176surfaceColorAtElevationcq6XJ1M = SurfaceKt.m2176surfaceColorAtElevationcq6XJ1M(j8, (ElevationOverlay) consume2, m8401constructorimpl2, composer2, 0);
                                            m2175surface8ww4TTg = SurfaceKt.m2175surface8ww4TTg(minimumInteractiveComponentSize, shape5, m2176surfaceColorAtElevationcq6XJ1M, borderStroke4, f3);
                                            Modifier m1172toggleableO2vRcR0$default = ToggleableKt.m1172toggleableO2vRcR0$default(m2175surface8ww4TTg, z, mutableInteractionSource3, RippleKt.m2121rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z5, null, function13, 16, null);
                                            Function2<Composer, Integer, Unit> function22 = function2;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1172toggleableO2vRcR0$default);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1275852541, "C458@24200L9:Surface.kt#jmzs0o");
                                            function22.invoke(composer2, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    j4 = j6;
                                    modifier3 = modifier4;
                                    shape3 = shape4;
                                    j3 = j7;
                                    borderStroke3 = borderStroke4;
                                    f2 = f3;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    z4 = z5;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    j3 = j;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    z4 = z3;
                                    shape3 = shape2;
                                    borderStroke3 = borderStroke2;
                                    j4 = j2;
                                    f2 = f;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SurfaceKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit Surface_Ny5ogXk$lambda$3;
                                            Surface_Ny5ogXk$lambda$3 = SurfaceKt.Surface_Ny5ogXk$lambda$3(z, function1, modifier3, z4, shape3, j3, j4, borderStroke3, f2, mutableInteractionSource2, function2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            return Surface_Ny5ogXk$lambda$3;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i12 = i11;
                            if ((i3 & 1024) != 0) {
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i10 = i9;
                        i11 = i3 & 512;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        if ((i3 & 1024) != 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    shape2 = shape;
                    if ((196608 & i) == 0) {
                    }
                    if ((i & 1572864) == 0) {
                    }
                    i8 = i3 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i3 & 512;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if ((i3 & 1024) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z3 = z2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                shape2 = shape;
                if ((196608 & i) == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i3 & 1024) != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z3 = z2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            shape2 = shape;
            if ((196608 & i) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i3 & 1024) != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function12 = function1;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z3 = z2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        shape2 = shape;
        if ((196608 & i) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i3 & 1024) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m2175surface8ww4TTg(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        Modifier m5260shadows4CzXII$default = ShadowKt.m5260shadows4CzXII$default(modifier, f, shape, false, 0L, 0L, 24, null);
        Modifier.Companion companion = Modifier.INSTANCE;
        if (borderStroke != null) {
            companion = BorderKt.border(companion, borderStroke, shape);
        }
        return ClipKt.clip(BackgroundKt.m261backgroundbw27NRU(m5260shadows4CzXII$default.then(companion), j, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-cq6XJ1M, reason: not valid java name */
    public static final long m2176surfaceColorAtElevationcq6XJ1M(long j, ElevationOverlay elevationOverlay, float f, Composer composer, int i) {
        Composer composer2;
        long j2;
        ComposerKt.sourceInformationMarkerStart(composer, 1561611256, "C(surfaceColorAtElevation)N(color:c#ui.graphics.Color,elevationOverlay,absoluteElevation:c#ui.unit.Dp)480@24749L6:Surface.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1561611256, i, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:479)");
        }
        if (Color.m5658equalsimpl0(j, MaterialTheme.INSTANCE.getColors(composer, 6).m1957getSurface0d7_KjU()) && elevationOverlay != null) {
            composer.startReplaceGroup(-1124594614);
            ComposerKt.sourceInformation(composer, "481@24820L31");
            composer2 = composer;
            j2 = elevationOverlay.mo1984apply7g2Lkgo(j, f, composer2, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896));
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(-1124526507);
            composer2.endReplaceGroup();
            j2 = j;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        return j2;
    }
}
