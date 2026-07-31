package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Checkbox.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001aO\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0016\u001a3\u0010\u0017\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a;\u0010!\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)\"\u000e\u0010*\u001a\u00020+X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020+X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020+X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00101\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00102\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00103\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100\"\u0010\u00104\u001a\u00020/X\u0082\u0004¢\u0006\u0004\n\u0002\u00100¨\u00065²\u0006\n\u00106\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u00107\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001aX\u008a\u0084\u0002"}, d2 = {"Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/CheckboxColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "TriStateCheckbox", "state", "Landroidx/compose/ui/state/ToggleableState;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", "value", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", ViewProps.BORDER_COLOR, "radius", "", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "drawingCache", "Landroidx/compose/material/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V", "BoxInDuration", "", "BoxOutDuration", "CheckAnimationDuration", "CheckboxRippleRadius", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxDefaultPadding", "CheckboxSize", "StrokeWidth", "RadiusSize", "material", "checkDrawFraction", "checkCenterGravitationShiftFraction"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxRippleRadius = Dp.m8401constructorimpl(24);
    private static final float CheckboxSize = Dp.m8401constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Checkbox$lambda$2(boolean z, Function1 function1, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, int i, int i2, Composer composer, int i3) {
        Checkbox(z, function1, modifier, z2, mutableInteractionSource, checkboxColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckboxImpl$lambda$14(boolean z, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, int i, Composer composer, int i2) {
        CheckboxImpl(z, toggleableState, modifier, checkboxColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TriStateCheckbox$lambda$3(ToggleableState toggleableState, Function0 function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, int i, int i2, Composer composer, int i3) {
        TriStateCheckbox(toggleableState, function0, modifier, z, mutableInteractionSource, checkboxColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Checkbox(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        CheckboxColors checkboxColors2;
        final Modifier modifier3;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        boolean z5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-2118660998);
        ComposerKt.sourceInformation(startRestartGroup, "C(Checkbox)N(checked,onCheckedChange,modifier,enabled,interactionSource,colors)91@4126L325:Checkbox.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            checkboxColors2 = checkboxColors;
                            if (startRestartGroup.changed(checkboxColors2)) {
                                i6 = 131072;
                                i3 |= i6;
                            }
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i6 = 65536;
                        i3 |= i6;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "89@4108L8");
                        Function0 function0 = null;
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            z5 = z3;
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z6 = i4 != 0 ? true : z3;
                            MutableInteractionSource mutableInteractionSource3 = i5 != 0 ? null : mutableInteractionSource2;
                            if ((i2 & 32) != 0) {
                                CheckboxColors m1931colorszjMxDiM = CheckboxDefaults.INSTANCE.m1931colorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                startRestartGroup = startRestartGroup;
                                i3 &= -458753;
                                modifier4 = companion;
                                z5 = z6;
                                checkboxColors2 = m1931colorszjMxDiM;
                            } else {
                                modifier4 = companion;
                                z5 = z6;
                            }
                            mutableInteractionSource2 = mutableInteractionSource3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2118660998, i3, -1, "androidx.compose.material.Checkbox (Checkbox.kt:90)");
                        }
                        ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z);
                        if (function1 != null) {
                            startRestartGroup.startReplaceGroup(1809984331);
                            ComposerKt.sourceInformation(startRestartGroup, "95@4263L29");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -218707529, "CC(remember):Checkbox.kt#9igjgp");
                            boolean z7 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z7 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit Checkbox$lambda$1$lambda$0;
                                        Checkbox$lambda$1$lambda$0 = CheckboxKt.Checkbox$lambda$1$lambda$0(Function1.this, z);
                                        return Checkbox$lambda$1$lambda$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function0 = (Function0) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1810049027);
                            startRestartGroup.endReplaceGroup();
                        }
                        TriStateCheckbox(ToggleableState, function0, modifier4, z5, mutableInteractionSource2, checkboxColors2, startRestartGroup, i3 & 524160, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z4 = z5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                    }
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                    final CheckboxColors checkboxColors3 = checkboxColors2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Checkbox$lambda$2;
                                Checkbox$lambda$2 = CheckboxKt.Checkbox$lambda$2(z, function1, modifier3, z4, mutableInteractionSource4, checkboxColors3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return Checkbox$lambda$2;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) != 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                final CheckboxColors checkboxColors32 = checkboxColors2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i) != 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
            final CheckboxColors checkboxColors322 = checkboxColors2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
        final CheckboxColors checkboxColors3222 = checkboxColors2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Checkbox$lambda$1$lambda$0(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TriStateCheckbox(final ToggleableState toggleableState, final Function0<Unit> function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        CheckboxColors checkboxColors2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final CheckboxColors checkboxColors3;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Modifier modifier4;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(2031255194);
        ComposerKt.sourceInformation(startRestartGroup, "C(TriStateCheckbox)N(state,onClick,modifier,enabled,interactionSource,colors)152@6815L461:Checkbox.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
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
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            checkboxColors2 = checkboxColors;
                            if (startRestartGroup.changed(checkboxColors2)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            checkboxColors2 = checkboxColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        checkboxColors2 = checkboxColors;
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "137@6355L8");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            composer2 = startRestartGroup;
                            z4 = z2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion3 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z5 = i4 != 0 ? true : z2;
                            MutableInteractionSource mutableInteractionSource4 = i5 != 0 ? null : mutableInteractionSource2;
                            if ((i2 & 32) != 0) {
                                composer2 = startRestartGroup;
                                i6 = i3 & (-458753);
                                modifier4 = companion3;
                                z4 = z5;
                                checkboxColors2 = CheckboxDefaults.INSTANCE.m1931colorszjMxDiM(0L, 0L, 0L, 0L, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                            } else {
                                composer2 = startRestartGroup;
                                i6 = i3;
                                modifier4 = companion3;
                                z4 = z5;
                            }
                            mutableInteractionSource3 = mutableInteractionSource4;
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2031255194, i6, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:138)");
                        }
                        if (function0 != null) {
                            boolean z6 = z4;
                            companion = ToggleableKt.m1177triStateToggleableO2vRcR0(Modifier.INSTANCE, toggleableState, mutableInteractionSource3, RippleKt.m2121rippleH2RKhps$default(false, CheckboxRippleRadius, 0L, 4, null), z6, Role.m7575boximpl(Role.INSTANCE.m7584getCheckboxo7Vup1c()), function0);
                            mutableInteractionSource2 = mutableInteractionSource3;
                            z4 = z6;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource3;
                            companion = Modifier.INSTANCE;
                        }
                        if (function0 != null) {
                            companion2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            companion2 = Modifier.INSTANCE;
                        }
                        CheckboxColors checkboxColors4 = checkboxColors2;
                        CheckboxImpl(z4, toggleableState, PaddingKt.m837padding3ABfNKs(modifier4.then(companion2).then(companion), CheckboxDefaultPadding), checkboxColors4, composer2, ((i6 >> 9) & 14) | ((i6 << 3) & 112) | ((i6 >> 6) & 7168));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        checkboxColors3 = checkboxColors4;
                        modifier3 = modifier4;
                        z3 = z4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        checkboxColors3 = checkboxColors2;
                    }
                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TriStateCheckbox$lambda$3;
                                TriStateCheckbox$lambda$3 = CheckboxKt.TriStateCheckbox$lambda$3(ToggleableState.this, function0, modifier3, z3, mutableInteractionSource5, checkboxColors3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return TriStateCheckbox$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) != 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i) != 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            final MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        final MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CheckboxImpl(boolean z, final ToggleableState toggleableState, Modifier modifier, final CheckboxColors checkboxColors, Composer composer, final int i) {
        int i2;
        boolean z2;
        Modifier modifier2;
        Transition transition;
        float f;
        Float f2;
        String str;
        int i3;
        float f3;
        int i4;
        int i5;
        float f4;
        int i6;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        Composer startRestartGroup = composer.startRestartGroup(-2118895727);
        ComposerKt.sourceInformation(startRestartGroup, "C(CheckboxImpl)N(enabled,value,modifier,colors)257@10849L23,259@10921L499,276@11488L514,291@12024L32,292@12086L21,293@12135L24,294@12190L27,295@12300L510,295@12222L588:Checkbox.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(toggleableState.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(checkboxColors) ? 2048 : 1024;
        }
        int i7 = i2;
        if (!startRestartGroup.shouldExecute((i7 & 1171) != 1170, i7 & 1)) {
            z2 = z;
            modifier2 = modifier;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2118895727, i7, -1, "androidx.compose.material.CheckboxImpl (Checkbox.kt:256)");
            }
            int i8 = i7 >> 3;
            int i9 = i8 & 14;
            Transition updateTransition = TransitionKt.updateTransition(toggleableState, (String) null, startRestartGroup, i9, 2);
            CheckboxKt$CheckboxImpl$checkDrawFraction$2 checkboxKt$CheckboxImpl$checkDrawFraction$2 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, int i10) {
                    SpringSpec snap;
                    composer2.startReplaceGroup(-1707702900);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1707702900, i10, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:261)");
                    }
                    if (segment.getInitialState() == ToggleableState.Off) {
                        snap = AnimationSpecKt.tween$default(100, 0, null, 6, null);
                    } else {
                        snap = segment.getTargetState() == ToggleableState.Off ? AnimationSpecKt.snap(100) : AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return snap;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
            ToggleableState toggleableState2 = (ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceGroup(-1798345588);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
                transition = updateTransition;
                ComposerKt.traceEventStart(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:268)");
            } else {
                transition = updateTransition;
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[toggleableState2.ordinal()];
            float f5 = 0.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    f = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    Float valueOf = Float.valueOf(f);
                    ToggleableState toggleableState3 = (ToggleableState) transition.getTargetState();
                    startRestartGroup.startReplaceGroup(-1798345588);
                    ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#jmzs0o");
                    if (!ComposerKt.isTraceInProgress()) {
                        f2 = valueOf;
                        str = "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli";
                        ComposerKt.traceEventStart(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:268)");
                    } else {
                        f2 = valueOf;
                        str = "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli";
                    }
                    i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState3.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            f3 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            Transition transition2 = transition;
                            final State createTransitionAnimation = TransitionKt.createTransitionAnimation(transition2, f2, Float.valueOf(f3), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke((CheckboxKt$CheckboxImpl$checkDrawFraction$2) transition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                                    return invoke(segment, composer2, num.intValue());
                                }

                                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, int i11) {
                                    TweenSpec snap;
                                    composer2.startReplaceGroup(1075283605);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1075283605, i11, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:278)");
                                    }
                                    if (segment.getInitialState() == ToggleableState.Off) {
                                        snap = AnimationSpecKt.snap$default(0, 1, null);
                                    } else {
                                        snap = segment.getTargetState() == ToggleableState.Off ? AnimationSpecKt.snap(100) : AnimationSpecKt.tween$default(100, 0, null, 6, null);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return snap;
                                }
                            };
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli");
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, str);
                            ToggleableState toggleableState4 = (ToggleableState) transition2.getCurrentState();
                            startRestartGroup.startReplaceGroup(-2098942571);
                            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#jmzs0o");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2098942571, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:285)");
                            }
                            i4 = WhenMappings.$EnumSwitchMapping$0[toggleableState4.ordinal()];
                            if (i4 != 1 || i4 == 2) {
                                i5 = 3;
                                f4 = 0.0f;
                            } else {
                                i5 = 3;
                                if (i4 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f4 = 1.0f;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            Float valueOf2 = Float.valueOf(f4);
                            ToggleableState toggleableState5 = (ToggleableState) transition2.getTargetState();
                            startRestartGroup.startReplaceGroup(-2098942571);
                            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#jmzs0o");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2098942571, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:285)");
                            }
                            i6 = WhenMappings.$EnumSwitchMapping$0[toggleableState5.ordinal()];
                            if (i6 != 1 && i6 != 2) {
                                if (i6 == i5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f5 = 1.0f;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceGroup();
                            final State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(transition2, valueOf2, Float.valueOf(f5), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.invoke((CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2) transition2.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -444252431, "CC(remember):Checkbox.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new CheckDrawingCache(null, null, null, 7, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final CheckDrawingCache checkDrawingCache = (CheckDrawingCache) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final State<Color> checkmarkColor = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i9 | ((i7 >> 6) & 112));
                            int i11 = (i8 & 896) | (i7 & WebSocketProtocol.PAYLOAD_SHORT);
                            z2 = z;
                            final State<Color> boxColor = checkboxColors.boxColor(z2, toggleableState, startRestartGroup, i11);
                            final State<Color> borderColor = checkboxColors.borderColor(z2, toggleableState, startRestartGroup, i11);
                            modifier2 = modifier;
                            Modifier m881requiredSize3ABfNKs = SizeKt.m881requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier2, Alignment.INSTANCE.getCenter(), false, 2, null), CheckboxSize);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -444243121, "CC(remember):Checkbox.kt#9igjgp");
                            changed = startRestartGroup.changed(boxColor) | startRestartGroup.changed(borderColor) | startRestartGroup.changed(checkmarkColor) | startRestartGroup.changed(createTransitionAnimation) | startRestartGroup.changed(createTransitionAnimation2);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function1() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit CheckboxImpl$lambda$13$lambda$12;
                                        CheckboxImpl$lambda$13$lambda$12 = CheckboxKt.CheckboxImpl$lambda$13$lambda$12(CheckDrawingCache.this, boxColor, borderColor, checkmarkColor, createTransitionAnimation, createTransitionAnimation2, (DrawScope) obj);
                                        return CheckboxImpl$lambda$13$lambda$12;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            CanvasKt.Canvas(m881requiredSize3ABfNKs, (Function1) rememberedValue2, startRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    f3 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Transition transition22 = transition;
                    final State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(transition22, f2, Float.valueOf(f3), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke((CheckboxKt$CheckboxImpl$checkDrawFraction$2) transition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$22 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                            return invoke(segment, composer2, num.intValue());
                        }

                        public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, int i112) {
                            TweenSpec snap;
                            composer2.startReplaceGroup(1075283605);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1075283605, i112, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:278)");
                            }
                            if (segment.getInitialState() == ToggleableState.Off) {
                                snap = AnimationSpecKt.snap$default(0, 1, null);
                            } else {
                                snap = segment.getTargetState() == ToggleableState.Off ? AnimationSpecKt.snap(100) : AnimationSpecKt.tween$default(100, 0, null, 6, null);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return snap;
                        }
                    };
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, str);
                    ToggleableState toggleableState42 = (ToggleableState) transition22.getCurrentState();
                    startRestartGroup.startReplaceGroup(-2098942571);
                    ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i4 = WhenMappings.$EnumSwitchMapping$0[toggleableState42.ordinal()];
                    if (i4 != 1) {
                    }
                    i5 = 3;
                    f4 = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Float valueOf22 = Float.valueOf(f4);
                    ToggleableState toggleableState52 = (ToggleableState) transition22.getTargetState();
                    startRestartGroup.startReplaceGroup(-2098942571);
                    ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i6 = WhenMappings.$EnumSwitchMapping$0[toggleableState52.ordinal()];
                    if (i6 != 1) {
                        if (i6 == i5) {
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    final State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(transition22, valueOf22, Float.valueOf(f5), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$22.invoke((CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2) transition22.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter22, "FloatAnimation", startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -444252431, "CC(remember):Checkbox.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final CheckDrawingCache checkDrawingCache2 = (CheckDrawingCache) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final State checkmarkColor2 = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i9 | ((i7 >> 6) & 112));
                    int i112 = (i8 & 896) | (i7 & WebSocketProtocol.PAYLOAD_SHORT);
                    z2 = z;
                    final State boxColor2 = checkboxColors.boxColor(z2, toggleableState, startRestartGroup, i112);
                    final State borderColor2 = checkboxColors.borderColor(z2, toggleableState, startRestartGroup, i112);
                    modifier2 = modifier;
                    Modifier m881requiredSize3ABfNKs2 = SizeKt.m881requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier2, Alignment.INSTANCE.getCenter(), false, 2, null), CheckboxSize);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -444243121, "CC(remember):Checkbox.kt#9igjgp");
                    changed = startRestartGroup.changed(boxColor2) | startRestartGroup.changed(borderColor2) | startRestartGroup.changed(checkmarkColor2) | startRestartGroup.changed(createTransitionAnimation3) | startRestartGroup.changed(createTransitionAnimation22);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new Function1() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit CheckboxImpl$lambda$13$lambda$12;
                            CheckboxImpl$lambda$13$lambda$12 = CheckboxKt.CheckboxImpl$lambda$13$lambda$12(CheckDrawingCache.this, boxColor2, borderColor2, checkmarkColor2, createTransitionAnimation3, createTransitionAnimation22, (DrawScope) obj);
                            return CheckboxImpl$lambda$13$lambda$12;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    CanvasKt.Canvas(m881requiredSize3ABfNKs2, (Function1) rememberedValue2, startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf3 = Float.valueOf(f);
            ToggleableState toggleableState32 = (ToggleableState) transition.getTargetState();
            startRestartGroup.startReplaceGroup(-1798345588);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#jmzs0o");
            if (!ComposerKt.isTraceInProgress()) {
            }
            i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState32.ordinal()];
            if (i3 != 1) {
            }
            f3 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Transition transition222 = transition;
            final State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(transition222, f2, Float.valueOf(f3), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke((CheckboxKt$CheckboxImpl$checkDrawFraction$2) transition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$222 = new Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Float> invoke(Transition.Segment<ToggleableState> segment, Composer composer2, int i1122) {
                    TweenSpec snap;
                    composer2.startReplaceGroup(1075283605);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1075283605, i1122, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:278)");
                    }
                    if (segment.getInitialState() == ToggleableState.Off) {
                        snap = AnimationSpecKt.snap$default(0, 1, null);
                    } else {
                        snap = segment.getTargetState() == ToggleableState.Off ? AnimationSpecKt.snap(100) : AnimationSpecKt.tween$default(100, 0, null, 6, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return snap;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1338768149, "CC(animateFloat)P(2)1924@81822L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, str);
            ToggleableState toggleableState422 = (ToggleableState) transition222.getCurrentState();
            startRestartGroup.startReplaceGroup(-2098942571);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$0[toggleableState422.ordinal()];
            if (i4 != 1) {
            }
            i5 = 3;
            f4 = 0.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            Float valueOf222 = Float.valueOf(f4);
            ToggleableState toggleableState522 = (ToggleableState) transition222.getTargetState();
            startRestartGroup.startReplaceGroup(-2098942571);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Checkbox.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
            }
            i6 = WhenMappings.$EnumSwitchMapping$0[toggleableState522.ordinal()];
            if (i6 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceGroup();
            final State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(transition222, valueOf222, Float.valueOf(f5), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$222.invoke((CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2) transition222.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter222, "FloatAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -444252431, "CC(remember):Checkbox.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final CheckDrawingCache checkDrawingCache22 = (CheckDrawingCache) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final State checkmarkColor22 = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i9 | ((i7 >> 6) & 112));
            int i1122 = (i8 & 896) | (i7 & WebSocketProtocol.PAYLOAD_SHORT);
            z2 = z;
            final State boxColor22 = checkboxColors.boxColor(z2, toggleableState, startRestartGroup, i1122);
            final State borderColor22 = checkboxColors.borderColor(z2, toggleableState, startRestartGroup, i1122);
            modifier2 = modifier;
            Modifier m881requiredSize3ABfNKs22 = SizeKt.m881requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier2, Alignment.INSTANCE.getCenter(), false, 2, null), CheckboxSize);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -444243121, "CC(remember):Checkbox.kt#9igjgp");
            changed = startRestartGroup.changed(boxColor22) | startRestartGroup.changed(borderColor22) | startRestartGroup.changed(checkmarkColor22) | startRestartGroup.changed(createTransitionAnimation32) | startRestartGroup.changed(createTransitionAnimation222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new Function1() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit CheckboxImpl$lambda$13$lambda$12;
                    CheckboxImpl$lambda$13$lambda$12 = CheckboxKt.CheckboxImpl$lambda$13$lambda$12(CheckDrawingCache.this, boxColor22, borderColor22, checkmarkColor22, createTransitionAnimation32, createTransitionAnimation222, (DrawScope) obj);
                    return CheckboxImpl$lambda$13$lambda$12;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(m881requiredSize3ABfNKs22, (Function1) rememberedValue2, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final boolean z3 = z2;
            final Modifier modifier3 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.CheckboxKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CheckboxImpl$lambda$14;
                    CheckboxImpl$lambda$14 = CheckboxKt.CheckboxImpl$lambda$14(z3, toggleableState, modifier3, checkboxColors, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CheckboxImpl$lambda$14;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckboxImpl$lambda$13$lambda$12(CheckDrawingCache checkDrawingCache, State state, State state2, State state3, State state4, State state5, DrawScope drawScope) {
        float floor = (float) Math.floor(drawScope.mo424toPx0680j_4(StrokeWidth));
        m1933drawBox1wkBAMs(drawScope, CheckboxImpl$lambda$10(state), CheckboxImpl$lambda$11(state2), drawScope.mo424toPx0680j_4(RadiusSize), floor);
        m1934drawCheck3IgeMak(drawScope, CheckboxImpl$lambda$9(state3), CheckboxImpl$lambda$5(state4), CheckboxImpl$lambda$7(state5), floor, checkDrawingCache);
        return Unit.INSTANCE;
    }

    /* renamed from: drawBox-1wkBAMs, reason: not valid java name */
    private static final void m1933drawBox1wkBAMs(DrawScope drawScope, long j, long j2, float f, float f2) {
        float f3 = f2 / 2.0f;
        Stroke stroke = new Stroke(f2, 0.0f, 0, 0, null, 30, null);
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo6236getSizeNHjbRc() >> 32));
        if (Color.m5658equalsimpl0(j, j2)) {
            DrawScope.m6232drawRoundRectuAw5IA$default(drawScope, j, 0L, Size.m5473constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L)), CornerRadius.m5367constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), Fill.INSTANCE, 0.0f, null, 0, 226, null);
            return;
        }
        long m5405constructorimpl = Offset.m5405constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        float f4 = intBitsToFloat - (2 * f2);
        long m5473constructorimpl = Size.m5473constructorimpl((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        float max = Math.max(0.0f, f - f2);
        DrawScope.m6232drawRoundRectuAw5IA$default(drawScope, j, m5405constructorimpl, m5473constructorimpl, CornerRadius.m5367constructorimpl((Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L)), Fill.INSTANCE, 0.0f, null, 0, 224, null);
        float f5 = f - f3;
        DrawScope.m6232drawRoundRectuAw5IA$default(drawScope, j2, Offset.m5405constructorimpl((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), Size.m5473constructorimpl((Float.floatToRawIntBits(r2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat - f2) << 32)), CornerRadius.m5367constructorimpl((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L)), stroke, 0.0f, null, 0, 224, null);
    }

    /* renamed from: drawCheck-3IgeMak, reason: not valid java name */
    private static final void m1934drawCheck3IgeMak(DrawScope drawScope, long j, float f, float f2, float f3, CheckDrawingCache checkDrawingCache) {
        Stroke stroke = new Stroke(f3, 0.0f, StrokeCap.INSTANCE.m6029getSquareKaPHkGw(), 0, null, 26, null);
        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo6236getSizeNHjbRc() >> 32));
        float lerp = MathHelpersKt.lerp(0.4f, 0.5f, f2);
        float lerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f2);
        float lerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f2);
        float lerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f2);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * intBitsToFloat, lerp3 * intBitsToFloat);
        checkDrawingCache.getCheckPath().lineTo(lerp * intBitsToFloat, lerp2 * intBitsToFloat);
        checkDrawingCache.getCheckPath().lineTo(0.8f * intBitsToFloat, intBitsToFloat * lerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f, checkDrawingCache.getPathToDraw(), true);
        DrawScope.m6226drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j, 0.0f, stroke, null, 0, 52, null);
    }

    private static final float CheckboxImpl$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float CheckboxImpl$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long CheckboxImpl$lambda$9(State<Color> state) {
        return state.getValue().m5667unboximpl();
    }

    private static final long CheckboxImpl$lambda$10(State<Color> state) {
        return state.getValue().m5667unboximpl();
    }

    private static final long CheckboxImpl$lambda$11(State<Color> state) {
        return state.getValue().m5667unboximpl();
    }

    static {
        float f = 2;
        CheckboxDefaultPadding = Dp.m8401constructorimpl(f);
        StrokeWidth = Dp.m8401constructorimpl(f);
        RadiusSize = Dp.m8401constructorimpl(f);
    }
}
