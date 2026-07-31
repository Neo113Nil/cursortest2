package expo.modules.devmenu.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.composables.core.ModalBottomSheetState;
import com.composables.core.SheetDetent;
import expo.modules.devmenu.compose.DevMenuAction;
import expo.modules.devmenu.compose.DevMenuState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DevMenuBottomSheet.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"DevMenuBottomSheet", "", "state", "Lexpo/modules/devmenu/compose/DevMenuState;", "onAction", "Lkotlin/Function1;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "Lexpo/modules/devmenu/compose/DevMenuActionHandler;", "(Lexpo/modules/devmenu/compose/DevMenuState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevMenuBottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevMenuBottomSheet$lambda$2(DevMenuState devMenuState, Function1 function1, int i, int i2, Composer composer, int i3) {
        DevMenuBottomSheet(devMenuState, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevMenuBottomSheet$lambda$9(DevMenuState devMenuState, Function1 function1, int i, int i2, Composer composer, int i3) {
        DevMenuBottomSheet(devMenuState, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevMenuBottomSheet$lambda$1$lambda$0(DevMenuAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DevMenuBottomSheet(final DevMenuState state, Function1<? super DevMenuAction, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super DevMenuAction, Unit> function12;
        final Function1<? super DevMenuAction, Unit> function13;
        final DevMenuState.AppInfo appInfo;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(-1709905553);
        ComposerKt.sourceInformation(startRestartGroup, "C(DevMenuBottomSheet)P(1)14@527L2,18@631L90,21@747L26,23@800L233,23@777L256,34@1081L446,53@1598L215,61@1828L190,69@2023L264,51@1531L756:DevMenuBottomSheet.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                if (i4 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):DevMenuBottomSheet.kt#9igjgp");
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: expo.modules.devmenu.compose.ui.DevMenuBottomSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit DevMenuBottomSheet$lambda$1$lambda$0;
                                DevMenuBottomSheet$lambda$1$lambda$0 = DevMenuBottomSheetKt.DevMenuBottomSheet$lambda$1$lambda$0((DevMenuAction) obj);
                                return DevMenuBottomSheet$lambda$1$lambda$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    function13 = (Function1) rememberedValue;
                } else {
                    function13 = function12;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1709905553, i3, -1, "expo.modules.devmenu.compose.ui.DevMenuBottomSheet (DevMenuBottomSheet.kt:15)");
                }
                appInfo = state.getAppInfo();
                if (appInfo != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.DevMenuBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DevMenuBottomSheet$lambda$2;
                                DevMenuBottomSheet$lambda$2 = DevMenuBottomSheetKt.DevMenuBottomSheet$lambda$2(DevMenuState.this, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return DevMenuBottomSheet$lambda$2;
                            }
                        });
                        return;
                    }
                    return;
                }
                final boolean isOpen = state.isOpen();
                boolean isOnboardingFinished = state.isOnboardingFinished();
                startRestartGroup.startReplaceGroup(5004770);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):DevMenuBottomSheet.kt#9igjgp");
                boolean changed = startRestartGroup.changed(isOnboardingFinished);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!state.isOnboardingFinished()), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final MutableState mutableState = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                int i5 = i3;
                final ModalBottomSheetState rememberBottomSheetState = BottomSheetScaffoldKt.rememberBottomSheetState(startRestartGroup, 0);
                Boolean valueOf = Boolean.valueOf(isOpen);
                startRestartGroup.startReplaceGroup(-1746271574);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):DevMenuBottomSheet.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(isOpen) | startRestartGroup.changedInstance(rememberBottomSheetState) | startRestartGroup.changed(mutableState);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function2) new DevMenuBottomSheetKt$DevMenuBottomSheet$2$1(isOpen, rememberBottomSheetState, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(1849434622);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):DevMenuBottomSheet.kt#9igjgp");
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function1() { // from class: expo.modules.devmenu.compose.ui.DevMenuBottomSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit DevMenuBottomSheet$lambda$6$lambda$5;
                            DevMenuBottomSheet$lambda$6$lambda$5 = DevMenuBottomSheetKt.DevMenuBottomSheet$lambda$6$lambda$5(ModalBottomSheetState.this, function13, (DevMenuAction) obj);
                            return DevMenuBottomSheet$lambda$6$lambda$5;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final Function1 function14 = (Function1) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1746271574);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):DevMenuBottomSheet.kt#9igjgp");
                boolean changed3 = ((i5 & 112) == 32) | startRestartGroup.changed(isOpen) | startRestartGroup.changed(mutableState);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function0() { // from class: expo.modules.devmenu.compose.ui.DevMenuBottomSheetKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit DevMenuBottomSheet$lambda$8$lambda$7;
                            DevMenuBottomSheet$lambda$8$lambda$7 = DevMenuBottomSheetKt.DevMenuBottomSheet$lambda$8$lambda$7(isOpen, mutableState, function13);
                            return DevMenuBottomSheet$lambda$8$lambda$7;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceGroup();
                BottomSheetScaffoldKt.BottomSheetScaffold(rememberBottomSheetState, (Function0) rememberedValue5, ComposableLambdaKt.rememberComposableLambda(-1563155636, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.DevMenuBottomSheetKt$DevMenuBottomSheet$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        ComposerKt.sourceInformation(composer2, "C62@1836L176:DevMenuBottomSheet.kt#aaq0h9");
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1563155636, i6, -1, "expo.modules.devmenu.compose.ui.DevMenuBottomSheet.<anonymous> (DevMenuBottomSheet.kt:62)");
                        }
                        AppInfoKt.AppInfo(DevMenuState.AppInfo.this.getAppName(), null, DevMenuState.AppInfo.this.getRuntimeVersion(), DevMenuState.AppInfo.this.getSdkVersion(), function14, composer2, 24576, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(789633195, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.DevMenuBottomSheetKt$DevMenuBottomSheet$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        ComposerKt.sourceInformation(composer2, "C70@2029L254:DevMenuBottomSheet.kt#aaq0h9");
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(789633195, i6, -1, "expo.modules.devmenu.compose.ui.DevMenuBottomSheet.<anonymous> (DevMenuBottomSheet.kt:70)");
                        }
                        DevMenuScreenKt.DevMenuScreen(DevMenuState.AppInfo.this, state.getDevToolsSettings(), state.getCustomItems(), mutableState.getValue().booleanValue(), state.getShowFab(), function14, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, ModalBottomSheetState.$stable | 3456, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                function13 = function12;
            }
            ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
            if (endRestartGroup2 != null) {
                endRestartGroup2.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.DevMenuBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DevMenuBottomSheet$lambda$9;
                        DevMenuBottomSheet$lambda$9 = DevMenuBottomSheetKt.DevMenuBottomSheet$lambda$9(DevMenuState.this, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return DevMenuBottomSheet$lambda$9;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i3 & 19) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        appInfo = state.getAppInfo();
        if (appInfo != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevMenuBottomSheet$lambda$6$lambda$5(ModalBottomSheetState modalBottomSheetState, Function1 function1, DevMenuAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        boolean shouldCloseMenu = action.getShouldCloseMenu();
        if (Intrinsics.areEqual(action, DevMenuAction.Close.INSTANCE)) {
            modalBottomSheetState.setTargetDetent(SheetDetent.INSTANCE.getHidden());
            return Unit.INSTANCE;
        }
        function1.invoke(action);
        if (shouldCloseMenu) {
            modalBottomSheetState.setTargetDetent(SheetDetent.INSTANCE.getHidden());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevMenuBottomSheet$lambda$8$lambda$7(boolean z, MutableState mutableState, Function1 function1) {
        if (z) {
            mutableState.setValue(false);
            function1.invoke(DevMenuAction.Close.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
