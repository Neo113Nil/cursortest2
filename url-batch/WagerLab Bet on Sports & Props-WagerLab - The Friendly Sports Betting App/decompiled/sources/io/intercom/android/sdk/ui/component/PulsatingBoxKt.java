package io.intercom.android.sdk.ui.component;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PulsatingBox.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a]\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"PulsatingBox", "", "modifier", "Landroidx/compose/ui/Modifier;", "pulseSize", "", "pulseColor", "Landroidx/compose/ui/graphics/Color;", "pulseShape", "Landroidx/compose/ui/graphics/Shape;", ViewProps.ENABLED, "", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "PulsatingBox-FU0evQE", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "PulsatingBoxPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PulsatingBoxKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PulsatingBoxPreview$lambda$2(int i, Composer composer, int i2) {
        PulsatingBoxPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PulsatingBox_FU0evQE$lambda$1(Modifier modifier, float f, long j, Shape shape, boolean z, Function3 content, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(content, "$content");
        m11999PulsatingBoxFU0evQE(modifier, f, j, shape, z, content, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a6  */
    /* renamed from: PulsatingBox-FU0evQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11999PulsatingBoxFU0evQE(Modifier modifier, final float f, long j, Shape shape, boolean z, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        Shape shape2;
        boolean z2;
        int i4;
        int i5;
        final long j3;
        final Shape shape3;
        Modifier modifier3;
        Object rememberedValue;
        Composer composer2;
        final Modifier modifier4;
        final Shape shape4;
        final long j4;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-63498318);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                j2 = j;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            j2 = j;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i6 = 2048;
                    i3 |= i6;
                }
            } else {
                shape2 = shape;
            }
            i6 = 1024;
            i3 |= i6;
        } else {
            shape2 = shape;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    i4 = startRestartGroup.changedInstance(content) ? 131072 : 65536;
                }
                if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            j2 = IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m12147getAction0d7_KjU();
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shape2 = RoundedCornerShapeKt.RoundedCornerShape(50);
                        }
                        if (i9 != 0) {
                            i5 = i3;
                            j3 = j2;
                            shape3 = shape2;
                            z2 = true;
                        } else {
                            i5 = i3;
                            j3 = j2;
                            shape3 = shape2;
                        }
                        modifier3 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        i5 = i3;
                        j3 = j2;
                        shape3 = shape2;
                        modifier3 = modifier2;
                    }
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceGroup(-1108114118);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final Animatable animatable = (Animatable) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(Float.valueOf(f), new PulsatingBoxKt$PulsatingBox$1(animatable, f, null), startRestartGroup, ((i5 >> 3) & 14) | 64);
                    final boolean z3 = z2;
                    long j5 = j3;
                    composer2 = startRestartGroup;
                    Modifier modifier5 = modifier3;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier5, Alignment.INSTANCE.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(526284572, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                            invoke(boxWithConstraintsScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i10) {
                            int i11;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i10 & 14) == 0) {
                                i11 = i10 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i11 = i10;
                            }
                            if ((i11 & 91) != 18 || !composer3.getSkipping()) {
                                composer3.startReplaceGroup(1154915079);
                                if (z3) {
                                    BoxKt.Box(BoxWithConstraints.align(BackgroundKt.m261backgroundbw27NRU(ShadowKt.m5260shadows4CzXII$default(ScaleKt.scale(SizeKt.m891sizeVpY3zN4(Modifier.INSTANCE, BoxWithConstraints.mo725getMaxWidthD9Ej5fM(), BoxWithConstraints.mo724getMaxHeightD9Ej5fM()), animatable.getValue().floatValue()), Dp.m8401constructorimpl(2), shape3, false, 0L, 0L, 28, null), j3, shape3), Alignment.INSTANCE.getCenter()), composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                content.invoke(BoxWithConstraints, composer3, Integer.valueOf(i11 & 14));
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), composer2, (i5 & 14) | 3120, 4);
                    modifier4 = modifier5;
                    shape4 = shape3;
                    j4 = j5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    modifier4 = modifier2;
                    j4 = j2;
                    shape4 = shape2;
                }
                final boolean z4 = z2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit PulsatingBox_FU0evQE$lambda$1;
                            PulsatingBox_FU0evQE$lambda$1 = PulsatingBoxKt.PulsatingBox_FU0evQE$lambda$1(Modifier.this, f, j4, shape4, z4, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return PulsatingBox_FU0evQE$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i3 |= i4;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i9 != 0) {
            }
            modifier3 = companion;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceGroup(-1108114118);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final Animatable<Float, AnimationVector1D> animatable2 = (Animatable) rememberedValue;
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(Float.valueOf(f), new PulsatingBoxKt$PulsatingBox$1(animatable2, f, null), startRestartGroup, ((i5 >> 3) & 14) | 64);
            final boolean z32 = z2;
            long j52 = j3;
            composer2 = startRestartGroup;
            Modifier modifier52 = modifier3;
            BoxWithConstraintsKt.BoxWithConstraints(modifier52, Alignment.INSTANCE.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(526284572, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                    invoke(boxWithConstraintsScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i10) {
                    int i11;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i10 & 14) == 0) {
                        i11 = i10 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 91) != 18 || !composer3.getSkipping()) {
                        composer3.startReplaceGroup(1154915079);
                        if (z32) {
                            BoxKt.Box(BoxWithConstraints.align(BackgroundKt.m261backgroundbw27NRU(ShadowKt.m5260shadows4CzXII$default(ScaleKt.scale(SizeKt.m891sizeVpY3zN4(Modifier.INSTANCE, BoxWithConstraints.mo725getMaxWidthD9Ej5fM(), BoxWithConstraints.mo724getMaxHeightD9Ej5fM()), animatable2.getValue().floatValue()), Dp.m8401constructorimpl(2), shape3, false, 0L, 0L, 28, null), j3, shape3), Alignment.INSTANCE.getCenter()), composer3, 0);
                        }
                        composer3.endReplaceGroup();
                        content.invoke(BoxWithConstraints, composer3, Integer.valueOf(i11 & 14));
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), composer2, (i5 & 14) | 3120, 4);
            modifier4 = modifier52;
            shape4 = shape3;
            j4 = j52;
            final boolean z42 = z2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i2 & 32) != 0) {
        }
        i3 |= i4;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i9 != 0) {
        }
        modifier3 = companion;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceGroup(-1108114118);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final Animatable<Float, AnimationVector1D> animatable22 = (Animatable) rememberedValue;
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(Float.valueOf(f), new PulsatingBoxKt$PulsatingBox$1(animatable22, f, null), startRestartGroup, ((i5 >> 3) & 14) | 64);
        final boolean z322 = z2;
        long j522 = j3;
        composer2 = startRestartGroup;
        Modifier modifier522 = modifier3;
        BoxWithConstraintsKt.BoxWithConstraints(modifier522, Alignment.INSTANCE.getCenter(), false, ComposableLambdaKt.rememberComposableLambda(526284572, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$PulsatingBox$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                invoke(boxWithConstraintsScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i10) {
                int i11;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i10 & 14) == 0) {
                    i11 = i10 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) != 18 || !composer3.getSkipping()) {
                    composer3.startReplaceGroup(1154915079);
                    if (z322) {
                        BoxKt.Box(BoxWithConstraints.align(BackgroundKt.m261backgroundbw27NRU(ShadowKt.m5260shadows4CzXII$default(ScaleKt.scale(SizeKt.m891sizeVpY3zN4(Modifier.INSTANCE, BoxWithConstraints.mo725getMaxWidthD9Ej5fM(), BoxWithConstraints.mo724getMaxHeightD9Ej5fM()), animatable22.getValue().floatValue()), Dp.m8401constructorimpl(2), shape3, false, 0L, 0L, 28, null), j3, shape3), Alignment.INSTANCE.getCenter()), composer3, 0);
                    }
                    composer3.endReplaceGroup();
                    content.invoke(BoxWithConstraints, composer3, Integer.valueOf(i11 & 14));
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), composer2, (i5 & 14) | 3120, 4);
        modifier4 = modifier522;
        shape4 = shape3;
        j4 = j522;
        final boolean z422 = z2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void PulsatingBoxPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2057763747);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PulsatingBoxKt.INSTANCE.m11963getLambda2$intercom_sdk_ui_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.PulsatingBoxKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PulsatingBoxPreview$lambda$2;
                    PulsatingBoxPreview$lambda$2 = PulsatingBoxKt.PulsatingBoxPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PulsatingBoxPreview$lambda$2;
                }
            });
        }
    }
}
