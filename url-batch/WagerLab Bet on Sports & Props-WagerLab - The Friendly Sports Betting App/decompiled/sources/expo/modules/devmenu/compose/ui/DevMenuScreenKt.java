package expo.modules.devmenu.compose.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.profileinstaller.ProfileVerifier;
import com.amazon.device.simplesignin.SimpleSignInService;
import expo.modules.devmenu.DevToolsSettings;
import expo.modules.devmenu.compose.DevMenuAction;
import expo.modules.devmenu.compose.DevMenuState;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.primitives.SpacerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevMenuScreen.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rj\u0002`\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"DevMenuScreen", "", "appInfo", "Lexpo/modules/devmenu/compose/DevMenuState$AppInfo;", "devToolsSettings", "Lexpo/modules/devmenu/DevToolsSettings;", "customItems", "", "Lexpo/modules/devmenu/compose/DevMenuState$CustomItem;", "shouldShowOnboarding", "", "showFab", "onAction", "Lkotlin/Function1;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "Lexpo/modules/devmenu/compose/DevMenuActionHandler;", "(Lexpo/modules/devmenu/compose/DevMenuState$AppInfo;Lexpo/modules/devmenu/DevToolsSettings;Ljava/util/List;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "DevMenuScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevMenuScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevMenuScreen$lambda$16(DevMenuState.AppInfo appInfo, DevToolsSettings devToolsSettings, List list, boolean z, boolean z2, Function1 function1, int i, int i2, Composer composer, int i3) {
        DevMenuScreen(appInfo, devToolsSettings, list, z, z2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevMenuScreen$lambda$4(DevMenuState.AppInfo appInfo, DevToolsSettings devToolsSettings, List list, boolean z, boolean z2, Function1 function1, int i, int i2, Composer composer, int i3) {
        DevMenuScreen(appInfo, devToolsSettings, list, z, z2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevMenuScreenPreview$lambda$18(int i, Composer composer, int i2) {
        DevMenuScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevMenuScreen$lambda$1$lambda$0(DevMenuAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DevMenuScreen(final DevMenuState.AppInfo appInfo, final DevToolsSettings devToolsSettings, List<DevMenuState.CustomItem> list, boolean z, boolean z2, Function1<? super DevMenuAction, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        List<DevMenuState.CustomItem> list2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        Function1<? super DevMenuAction, Unit> function12;
        final Function1<? super DevMenuAction, Unit> function13;
        DevToolsSettings devToolsSettings2;
        final DevMenuState.AppInfo appInfo2;
        final boolean z5;
        Composer composer2;
        final boolean z6;
        final Function1<? super DevMenuAction, Unit> function14;
        final List<DevMenuState.CustomItem> list3;
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(devToolsSettings, "devToolsSettings");
        Composer startRestartGroup = composer.startRestartGroup(595496624);
        ComposerKt.sourceInformation(startRestartGroup, "C(DevMenuScreen)P(!1,2!1,4,5)27@1113L2,38@1278L1368:DevMenuScreen.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(devToolsSettings) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            list2 = list;
            i3 |= startRestartGroup.changedInstance(list2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function12 = function1;
                    } else {
                        function12 = function1;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                        }
                    }
                    if ((i3 & 74899) == 74898 || !startRestartGroup.getSkipping()) {
                        List<DevMenuState.CustomItem> emptyList = i7 == 0 ? CollectionsKt.emptyList() : list2;
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if (i5 != 0) {
                            z4 = false;
                        }
                        if (i6 == 0) {
                            startRestartGroup.startReplaceGroup(1849434622);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):DevMenuScreen.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function1() { // from class: expo.modules.devmenu.compose.ui.DevMenuScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit DevMenuScreen$lambda$1$lambda$0;
                                        DevMenuScreen$lambda$1$lambda$0 = DevMenuScreenKt.DevMenuScreen$lambda$1$lambda$0((DevMenuAction) obj);
                                        return DevMenuScreen$lambda$1$lambda$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function13 = (Function1) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                        } else {
                            function13 = function12;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(595496624, i3, -1, "expo.modules.devmenu.compose.ui.DevMenuScreen (DevMenuScreen.kt:28)");
                        }
                        startRestartGroup.startReplaceGroup(1041614248);
                        ComposerKt.sourceInformation(startRestartGroup, "31@1195L58,30@1154L105");
                        if (!z3) {
                            startRestartGroup.startReplaceGroup(5004770);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):DevMenuScreen.kt#9igjgp");
                            boolean z7 = (458752 & i3) == 131072;
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (z7 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function0() { // from class: expo.modules.devmenu.compose.ui.DevMenuScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit DevMenuScreen$lambda$3$lambda$2;
                                        DevMenuScreen$lambda$3$lambda$2 = DevMenuScreenKt.DevMenuScreen$lambda$3$lambda$2(Function1.this);
                                        return DevMenuScreen$lambda$3$lambda$2;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceGroup();
                            OnboardingKt.Onboarding((Function0) rememberedValue2, startRestartGroup, 0, 0);
                            startRestartGroup.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                final List<DevMenuState.CustomItem> list4 = emptyList;
                                final boolean z8 = z3;
                                final boolean z9 = z4;
                                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.DevMenuScreenKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit DevMenuScreen$lambda$4;
                                        DevMenuScreen$lambda$4 = DevMenuScreenKt.DevMenuScreen$lambda$4(DevMenuState.AppInfo.this, devToolsSettings, list4, z8, z9, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return DevMenuScreen$lambda$4;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        devToolsSettings2 = devToolsSettings;
                        List<DevMenuState.CustomItem> list5 = emptyList;
                        final Function1<? super DevMenuAction, Unit> function15 = function13;
                        boolean z10 = z4;
                        boolean z11 = z3;
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                        Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                        }
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1800957474, "C39@1291L40,41@1356L7,41@1337L31,44@1442L7,43@1374L622,62@2021L7,62@2002L31,75@2314L49,77@2424L7,77@2369L145,84@2616L20,81@2520L122:DevMenuScreen.kt#aaq0h9");
                        BundlerInfoKt.BundlerInfo(appInfo.getHostUrl(), startRestartGroup, 0);
                        SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10807get2D9Ej5fM(), null, startRestartGroup, 0, 2);
                        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10807get2D9Ej5fM());
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, centerVertically, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                        Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                            m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                        }
                        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1320126522, "C51@1711L34,47@1523L230,58@1948L34,54@1761L229:DevMenuScreen.kt#aaq0h9");
                        Function2<Composer, Integer, Unit> m10851getLambda$586806337$expo_dev_menu_release = ComposableSingletons$DevMenuScreenKt.INSTANCE.m10851getLambda$586806337$expo_dev_menu_release();
                        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        startRestartGroup.startReplaceGroup(5004770);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):DevMenuScreen.kt#9igjgp");
                        int i8 = i3 & 458752;
                        boolean z12 = i8 == 131072;
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z12 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function0() { // from class: expo.modules.devmenu.compose.ui.DevMenuScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit DevMenuScreen$lambda$15$lambda$9$lambda$6$lambda$5;
                                    DevMenuScreen$lambda$15$lambda$9$lambda$6$lambda$5 = DevMenuScreenKt.DevMenuScreen$lambda$15$lambda$9$lambda$6$lambda$5(Function1.this);
                                    return DevMenuScreen$lambda$15$lambda$9$lambda$6$lambda$5;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceGroup();
                        int i9 = i3;
                        QuickActionKt.QuickAction("Reload", m10851getLambda$586806337$expo_dev_menu_release, weight$default, (Function0) rememberedValue3, startRestartGroup, 54, 0);
                        Function2<Composer, Integer, Unit> m10850getLambda$1901712984$expo_dev_menu_release = ComposableSingletons$DevMenuScreenKt.INSTANCE.m10850getLambda$1901712984$expo_dev_menu_release();
                        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        startRestartGroup.startReplaceGroup(5004770);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):DevMenuScreen.kt#9igjgp");
                        boolean z13 = i8 == 131072;
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (z13 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function0() { // from class: expo.modules.devmenu.compose.ui.DevMenuScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit DevMenuScreen$lambda$15$lambda$9$lambda$8$lambda$7;
                                    DevMenuScreen$lambda$15$lambda$9$lambda$8$lambda$7 = DevMenuScreenKt.DevMenuScreen$lambda$15$lambda$9$lambda$8$lambda$7(Function1.this);
                                    return DevMenuScreen$lambda$15$lambda$9$lambda$8$lambda$7;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        startRestartGroup.endReplaceGroup();
                        QuickActionKt.QuickAction("Go home", m10850getLambda$1901712984$expo_dev_menu_release, weight$default2, (Function0) rememberedValue4, startRestartGroup, 54, 0);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10810get5D9Ej5fM(), null, startRestartGroup, 0, 2);
                        startRestartGroup.startReplaceGroup(-1327355065);
                        ComposerKt.sourceInformation(startRestartGroup, "67@2148L107,65@2077L186,72@2290L7,72@2271L31");
                        if (!list5.isEmpty()) {
                            startRestartGroup.startReplaceGroup(5004770);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):DevMenuScreen.kt#9igjgp");
                            boolean z14 = i8 == 131072;
                            Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (z14 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new Function1() { // from class: expo.modules.devmenu.compose.ui.DevMenuScreenKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit DevMenuScreen$lambda$15$lambda$11$lambda$10;
                                        DevMenuScreen$lambda$15$lambda$11$lambda$10 = DevMenuScreenKt.DevMenuScreen$lambda$15$lambda$11$lambda$10(Function1.this, (DevMenuState.CustomItem) obj);
                                        return DevMenuScreen$lambda$15$lambda$11$lambda$10;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            startRestartGroup.endReplaceGroup();
                            CustomItemsSectionKt.CustomItemsSection(list5, (Function1) rememberedValue5, startRestartGroup, (i9 >> 6) & 14);
                            SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10810get5D9Ej5fM(), null, startRestartGroup, 0, 2);
                        }
                        startRestartGroup.endReplaceGroup();
                        ToolsSectionKt.ToolsSection(function15, devToolsSettings2, z10, startRestartGroup, ((i9 >> 15) & 14) | (i9 & 112) | ((i9 >> 6) & 896));
                        Modifier m839paddingVpY3zN4$default = PaddingKt.m839paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10811get6D9Ej5fM(), 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m839paddingVpY3zN4$default);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor3);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m4976constructorimpl3 = Updater.m4976constructorimpl(startRestartGroup);
                        Updater.m4983setimpl(m4976constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                            m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                            m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                        }
                        Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 804205137, "C78@2446L62:DevMenuScreen.kt#aaq0h9");
                        WarningKt.Warning("Debugging not working? Try manually reloading first", startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        String appVersion = appInfo.getAppVersion();
                        String runtimeVersion = appInfo.getRuntimeVersion();
                        startRestartGroup.startReplaceGroup(5004770);
                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):DevMenuScreen.kt#9igjgp");
                        boolean z15 = (i9 & 14) == 4;
                        Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (z15 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            appInfo2 = appInfo;
                            rememberedValue6 = new Function0() { // from class: expo.modules.devmenu.compose.ui.DevMenuScreenKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String json;
                                    json = DevMenuState.AppInfo.this.toJson();
                                    return json;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        } else {
                            appInfo2 = appInfo;
                        }
                        startRestartGroup.endReplaceGroup();
                        SystemSectionKt.SystemSection(appVersion, runtimeVersion, (Function0) rememberedValue6, startRestartGroup, 0, 0);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z10;
                        composer2 = startRestartGroup;
                        z6 = z11;
                        function14 = function15;
                        list3 = list5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        devToolsSettings2 = devToolsSettings;
                        composer2 = startRestartGroup;
                        list3 = list2;
                        function14 = function12;
                        z6 = z3;
                        z5 = z4;
                        appInfo2 = appInfo;
                    }
                    ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        final DevMenuState.AppInfo appInfo3 = appInfo2;
                        final DevToolsSettings devToolsSettings3 = devToolsSettings2;
                        endRestartGroup2.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.DevMenuScreenKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DevMenuScreen$lambda$16;
                                DevMenuScreen$lambda$16 = DevMenuScreenKt.DevMenuScreen$lambda$16(DevMenuState.AppInfo.this, devToolsSettings3, list3, z6, z5, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return DevMenuScreen$lambda$16;
                            }
                        });
                        return;
                    }
                    return;
                }
                z4 = z2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if ((i3 & 74899) == 74898) {
                }
                if (i7 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(1041614248);
                ComposerKt.sourceInformation(startRestartGroup, "31@1195L58,30@1154L105");
                if (!z3) {
                }
            }
            z3 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            if (i7 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1041614248);
            ComposerKt.sourceInformation(startRestartGroup, "31@1195L58,30@1154L105");
            if (!z3) {
            }
        }
        list2 = list;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        if (i7 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1041614248);
        ComposerKt.sourceInformation(startRestartGroup, "31@1195L58,30@1154L105");
        if (!z3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevMenuScreen$lambda$3$lambda$2(Function1 function1) {
        function1.invoke(DevMenuAction.FinishOnboarding.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevMenuScreen$lambda$15$lambda$9$lambda$6$lambda$5(Function1 function1) {
        function1.invoke(DevMenuAction.Reload.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevMenuScreen$lambda$15$lambda$9$lambda$8$lambda$7(Function1 function1) {
        function1.invoke(DevMenuAction.GoHome.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DevMenuScreen$lambda$15$lambda$11$lambda$10(Function1 function1, DevMenuState.CustomItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        function1.invoke(new DevMenuAction.TriggerCustomCallback(item.getName(), item.getShouldCollapse()));
        return Unit.INSTANCE;
    }

    public static final void DevMenuScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2078574031);
        ComposerKt.sourceInformation(startRestartGroup, "C(DevMenuScreenPreview)94@2784L6,95@2851L7,92@2726L370:DevMenuScreen.kt#aaq0h9");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2078574031, i, -1, "expo.modules.devmenu.compose.ui.DevMenuScreenPreview (DevMenuScreen.kt:91)");
            }
            Modifier m839paddingVpY3zN4$default = PaddingKt.m839paddingVpY3zN4$default(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBackground().getDefault(), null, 2, null), NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10809get4D9Ej5fM(), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m839paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 776212830, "C97@2874L218:DevMenuScreen.kt#aaq0h9");
            DevMenuScreen(new DevMenuState.AppInfo("Expo App", "http://localhost:19006", null, SimpleSignInService.SDK_VERSION, null, null, 52, null), new DevToolsSettings(false, false, false, 7, null), null, false, false, null, startRestartGroup, 0, 60);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.DevMenuScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DevMenuScreenPreview$lambda$18;
                    DevMenuScreenPreview$lambda$18 = DevMenuScreenKt.DevMenuScreenPreview$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                    return DevMenuScreenPreview$lambda$18;
                }
            });
        }
    }
}
