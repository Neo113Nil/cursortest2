package androidx.compose.material;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: SwipeToDismiss.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0081\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110\u00052\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\u0017\u001a\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\"\u0010\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"rememberDismissState", "Landroidx/compose/material/DismissState;", "initialValue", "Landroidx/compose/material/DismissValue;", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DismissState;", "SwipeToDismiss", "", "state", "modifier", "Landroidx/compose/ui/Modifier;", "directions", "", "Landroidx/compose/material/DismissDirection;", "dismissThresholds", "Landroidx/compose/material/ThresholdConfig;", AppStateModule.APP_STATE_BACKGROUND, "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "dismissContent", "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "getDismissDirection", "from", "to", "DISMISS_THRESHOLD", "Landroidx/compose/ui/unit/Dp;", "F", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissKt {
    private static final float DISMISS_THRESHOLD = Dp.m8401constructorimpl(56);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeToDismiss$lambda$6(DismissState dismissState, Modifier modifier, Set set, Function1 function1, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        SwipeToDismiss(dismissState, modifier, set, function1, function3, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberDismissState$lambda$1$lambda$0(DismissValue dismissValue) {
        return true;
    }

    public static final DismissState rememberDismissState(final DismissValue dismissValue, final Function1<? super DismissValue, Boolean> function1, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1753522702, "C(rememberDismissState)N(initialValue,confirmStateChange)134@5287L8,136@5391L62,136@5326L127:SwipeToDismiss.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            dismissValue = DismissValue.Default;
        }
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -1508131558, "CC(remember):SwipeToDismiss.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean rememberDismissState$lambda$1$lambda$0;
                        rememberDismissState$lambda$1$lambda$0 = SwipeToDismissKt.rememberDismissState$lambda$1$lambda$0((DismissValue) obj);
                        return Boolean.valueOf(rememberDismissState$lambda$1$lambda$0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (Function1) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1753522702, i, -1, "androidx.compose.material.rememberDismissState (SwipeToDismiss.kt:135)");
        }
        Object[] objArr = new Object[0];
        Saver<DismissState, DismissValue> Saver = DismissState.INSTANCE.Saver(function1);
        ComposerKt.sourceInformationMarkerStart(composer, -1508128176, "CC(remember):SwipeToDismiss.kt#9igjgp");
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(dismissValue.ordinal())) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(function1)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DismissState rememberDismissState$lambda$3$lambda$2;
                    rememberDismissState$lambda$3$lambda$2 = SwipeToDismissKt.rememberDismissState$lambda$3$lambda$2(DismissValue.this, function1);
                    return rememberDismissState$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DismissState dismissState = (DismissState) RememberSaveableKt.m5103rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return dismissState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DismissState rememberDismissState$lambda$3$lambda$2(DismissValue dismissValue, Function1 function1) {
        return new DismissState(dismissValue, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FixedThreshold SwipeToDismiss$lambda$5$lambda$4(DismissDirection dismissDirection) {
        return new FixedThreshold(DISMISS_THRESHOLD, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeToDismiss(final DismissState dismissState, Modifier modifier, Set<? extends DismissDirection> set, Function1<? super DismissDirection, ? extends ThresholdConfig> function1, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        DismissState dismissState2;
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Function1<? super DismissDirection, ? extends ThresholdConfig> function12;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final Set<? extends DismissDirection> set2;
        final Modifier modifier3;
        final Function1<? super DismissDirection, ? extends ThresholdConfig> function13;
        ScopeUpdateScope endRestartGroup;
        Function1<? super DismissDirection, ? extends ThresholdConfig> function14;
        Composer startRestartGroup = composer.startRestartGroup(-9746411);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwipeToDismiss)N(state,modifier,directions,dismissThresholds,background,dismissContent)160@6423L49,166@6613L1519,166@6584L1548:SwipeToDismiss.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            dismissState2 = dismissState;
        } else if ((i & 6) == 0) {
            dismissState2 = dismissState;
            i3 = (startRestartGroup.changed(dismissState2) ? 4 : 2) | i;
        } else {
            dismissState2 = dismissState;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(set) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function33 = function3;
                        i3 |= startRestartGroup.changedInstance(function33) ? 16384 : 8192;
                        if ((i2 & 32) != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                set2 = set;
                                modifier3 = modifier2;
                                function13 = function12;
                            } else {
                                Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                                Set<? extends DismissDirection> of = i4 != 0 ? SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.EndToStart, DismissDirection.StartToEnd}) : set;
                                if (i5 != 0) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -776357210, "CC(remember):SwipeToDismiss.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Function1() { // from class: androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                FixedThreshold SwipeToDismiss$lambda$5$lambda$4;
                                                SwipeToDismiss$lambda$5$lambda$4 = SwipeToDismissKt.SwipeToDismiss$lambda$5$lambda$4((DismissDirection) obj);
                                                return SwipeToDismiss$lambda$5$lambda$4;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    function14 = (Function1) rememberedValue;
                                } else {
                                    function14 = function12;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-9746411, i3, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                                }
                                Set<? extends DismissDirection> set3 = of;
                                BoxWithConstraintsKt.BoxWithConstraints(modifier4, null, false, ComposableLambdaKt.rememberComposableLambda(-1281726977, true, new SwipeToDismissKt$SwipeToDismiss$2(of, function14, dismissState2, function33, function32), startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                set2 = set3;
                                modifier3 = modifier4;
                                function13 = function14;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit SwipeToDismiss$lambda$6;
                                        SwipeToDismiss$lambda$6 = SwipeToDismissKt.SwipeToDismiss$lambda$6(DismissState.this, modifier3, set2, function13, function3, function32, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return SwipeToDismiss$lambda$6;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function33 = function3;
                    if ((i2 & 32) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function12 = function1;
                if ((i2 & 16) == 0) {
                }
                function33 = function3;
                if ((i2 & 32) != 0) {
                }
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function12 = function1;
            if ((i2 & 16) == 0) {
            }
            function33 = function3;
            if ((i2 & 32) != 0) {
            }
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function12 = function1;
        if ((i2 & 16) == 0) {
        }
        function33 = function3;
        if ((i2 & 32) != 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DismissDirection getDismissDirection(DismissValue dismissValue, DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.Default) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.Default && dismissValue2 == DismissValue.DismissedToEnd) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.Default && dismissValue2 == DismissValue.DismissedToStart) {
            return DismissDirection.EndToStart;
        }
        if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == DismissValue.Default) {
            return DismissDirection.StartToEnd;
        }
        if (dismissValue == DismissValue.DismissedToStart && dismissValue2 == DismissValue.Default) {
            return DismissDirection.EndToStart;
        }
        return null;
    }
}
