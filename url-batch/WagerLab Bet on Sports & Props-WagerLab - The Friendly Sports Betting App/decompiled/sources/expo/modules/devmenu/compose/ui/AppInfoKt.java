package expo.modules.devmenu.compose.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MenuKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import com.amazon.device.simplesignin.SimpleSignInService;
import com.composeunstyled.ButtonKt;
import expo.modules.devmenu.compose.DevMenuAction;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.primitives.AppIconKt;
import expo.modules.devmenu.compose.primitives.SpacerKt;
import expo.modules.devmenu.compose.primitives.TextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppInfo.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tj\u0002`\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"AppInfo", "", "appName", "", "modifier", "Landroidx/compose/ui/Modifier;", "runtimeVersion", "sdkVersion", "onAction", "Lkotlin/Function1;", "Lexpo/modules/devmenu/compose/DevMenuAction;", "Lexpo/modules/devmenu/compose/DevMenuActionHandler;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AppInfoPreview", "(Landroidx/compose/runtime/Composer;I)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppInfoKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppInfo$lambda$6(String str, Modifier modifier, String str2, String str3, Function1 function1, int i, int i2, Composer composer, int i3) {
        AppInfo(str, modifier, str2, str3, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppInfoPreview$lambda$8(int i, Composer composer, int i2) {
        AppInfoPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppInfo$lambda$1$lambda$0(DevMenuAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppInfo(final String appName, Modifier modifier, String str, String str2, Function1<? super DevMenuAction, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str3;
        int i5;
        String str4;
        int i6;
        Function1<? super DevMenuAction, Unit> function12;
        int i7;
        int hashCode;
        Composer m4976constructorimpl;
        int hashCode2;
        Composer m4976constructorimpl2;
        String str5;
        Modifier modifier3;
        final Function1<? super DevMenuAction, Unit> function13;
        int i8;
        int i9;
        float f;
        int i10;
        int i11;
        Object rememberedValue;
        final Modifier modifier4;
        final Function1<? super DevMenuAction, Unit> function14;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(appName, "appName");
        Composer startRestartGroup = composer.startRestartGroup(1132894364);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppInfo)P(!2,3,4)27@1086L2,29@1095L1265:AppInfo.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appName) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str3 = str;
                i3 |= startRestartGroup.changed(str3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str4 = str2;
                    i3 |= startRestartGroup.changed(str4) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function12 = function1;
                        i3 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                        i7 = i3;
                        if ((i7 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                            Modifier modifier5 = i12 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                str3 = null;
                            }
                            if (i5 != 0) {
                                str4 = null;
                            }
                            if (i6 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):AppInfo.kt#9igjgp");
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function1() { // from class: expo.modules.devmenu.compose.ui.AppInfoKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit AppInfo$lambda$1$lambda$0;
                                            AppInfo$lambda$1$lambda$0 = AppInfoKt.AppInfo$lambda$1$lambda$0((DevMenuAction) obj);
                                            return AppInfo$lambda$1$lambda$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceGroup();
                                function12 = (Function1) rememberedValue2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1132894364, i7, -1, "expo.modules.devmenu.compose.ui.AppInfo (AppInfo.kt:28)");
                            }
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier5);
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
                            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1273112983, "C34@1234L9,36@1268L7,36@1249L31,39@1355L7,38@1286L615,61@1907L38,64@1975L47,67@2069L12,68@2125L6,63@1951L405:AppInfo.kt#aaq0h9");
                            AppIconKt.m10816AppIconkHDZbjc(0.0f, startRestartGroup, 0, 1);
                            SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10808get3D9Ej5fM(), null, startRestartGroup, 0, 2);
                            Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10803get1D9Ej5fM());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                            m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                            Updater.m4983setimpl(m4976constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                            }
                            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242643744, "C43@1436L4,41@1382L109:AppInfo.kt#aaq0h9");
                            String str6 = str4;
                            str5 = str3;
                            TextKt.m10822NewTextnUFttAo(appName, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getLg(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777211, null), 0L, 0, false, 0, (Modifier) null, startRestartGroup, i7 & 14, 124);
                            if (str5 != null) {
                                startRestartGroup.startReplaceGroup(-1242510445);
                                ComposerKt.sourceInformation(startRestartGroup, "49@1622L4,50@1661L6,47@1537L155");
                                i9 = 0;
                                str3 = str5;
                                modifier3 = modifier5;
                                function13 = function12;
                                f = 0.0f;
                                i8 = i7;
                                i10 = 16384;
                                TextKt.m10822NewTextnUFttAo("Runtime version: " + str5, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMd(), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getText().getSecondary(), 0, false, 0, (Modifier) null, startRestartGroup, 0, MenuKt.InTransitionDuration);
                                startRestartGroup.endReplaceGroup();
                                str4 = str6;
                            } else {
                                str3 = str5;
                                modifier3 = modifier5;
                                function13 = function12;
                                i8 = i7;
                                i9 = 0;
                                f = 0.0f;
                                i10 = 16384;
                                if (str6 != null) {
                                    startRestartGroup.startReplaceGroup(-1242309317);
                                    ComposerKt.sourceInformation(startRestartGroup, "55@1817L4,56@1856L6,53@1740L147");
                                    str4 = str6;
                                    TextKt.m10822NewTextnUFttAo("SDK version: " + str4, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMd(), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getText().getSecondary(), 0, false, 0, (Modifier) null, startRestartGroup, 0, MenuKt.InTransitionDuration);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    str4 = str6;
                                    startRestartGroup.startReplaceGroup(-1242150752);
                                    startRestartGroup.endReplaceGroup();
                                }
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            SpacerKt.m10818SpacerorJrPs(f, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, i9, 1);
                            startRestartGroup.startReplaceGroup(5004770);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):AppInfo.kt#9igjgp");
                            i11 = (57344 & i8) != i10 ? i9 : 1;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (i11 == 0 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: expo.modules.devmenu.compose.ui.AppInfoKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit AppInfo$lambda$5$lambda$4$lambda$3;
                                        AppInfo$lambda$5$lambda$4$lambda$3 = AppInfoKt.AppInfo$lambda$5$lambda$4$lambda$3(Function1.this);
                                        return AppInfo$lambda$5$lambda$4$lambda$3;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, false, RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(NewAppTheme.INSTANCE.getBorderRadius(startRestartGroup, 6).m10766getFullD9Ej5fM()), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBackground().getElement(), 0L, null, 0L, 0.0f, SizeKt.m889size3ABfNKs(rowScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), Dp.m8401constructorimpl(36)), 0, null, null, null, null, ComposableSingletons$AppInfoKt.INSTANCE.m10849getLambda$1571584122$expo_dev_menu_release(), startRestartGroup, 0, 24576, 16114);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            function14 = function13;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            function14 = function12;
                        }
                        final String str7 = str3;
                        final String str8 = str4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.AppInfoKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit AppInfo$lambda$6;
                                    AppInfo$lambda$6 = AppInfoKt.AppInfo$lambda$6(appName, modifier4, str7, str8, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return AppInfo$lambda$6;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function12 = function1;
                    i7 = i3;
                    if ((i7 & 9363) == 9362) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier5);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl.getInserting()) {
                    }
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash3);
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1273112983, "C34@1234L9,36@1268L7,36@1249L31,39@1355L7,38@1286L615,61@1907L38,64@1975L47,67@2069L12,68@2125L6,63@1951L405:AppInfo.kt#aaq0h9");
                    AppIconKt.m10816AppIconkHDZbjc(0.0f, startRestartGroup, 0, 1);
                    SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10808get3D9Ej5fM(), null, startRestartGroup, 0, 2);
                    Arrangement.HorizontalOrVertical m696spacedBy0680j_42 = Arrangement.INSTANCE.m696spacedBy0680j_4(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10803get1D9Ej5fM());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_42, Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl2.getInserting()) {
                    }
                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                    m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash22);
                    Updater.m4983setimpl(m4976constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242643744, "C43@1436L4,41@1382L109:AppInfo.kt#aaq0h9");
                    String str62 = str4;
                    str5 = str3;
                    TextKt.m10822NewTextnUFttAo(appName, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getLg(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777211, null), 0L, 0, false, 0, (Modifier) null, startRestartGroup, i7 & 14, 124);
                    if (str5 != null) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SpacerKt.m10818SpacerorJrPs(f, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, i9, 1);
                    startRestartGroup.startReplaceGroup(5004770);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):AppInfo.kt#9igjgp");
                    if ((57344 & i8) != i10) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (i11 == 0) {
                    }
                    rememberedValue = new Function0() { // from class: expo.modules.devmenu.compose.ui.AppInfoKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit AppInfo$lambda$5$lambda$4$lambda$3;
                            AppInfo$lambda$5$lambda$4$lambda$3 = AppInfoKt.AppInfo$lambda$5$lambda$4$lambda$3(Function1.this);
                            return AppInfo$lambda$5$lambda$4$lambda$3;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, false, RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(NewAppTheme.INSTANCE.getBorderRadius(startRestartGroup, 6).m10766getFullD9Ej5fM()), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBackground().getElement(), 0L, null, 0L, 0.0f, SizeKt.m889size3ABfNKs(rowScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), Dp.m8401constructorimpl(36)), 0, null, null, null, null, ComposableSingletons$AppInfoKt.INSTANCE.m10849getLambda$1571584122$expo_dev_menu_release(), startRestartGroup, 0, 24576, 16114);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    function14 = function13;
                    final String str72 = str3;
                    final String str82 = str4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                str4 = str2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function12 = function1;
                i7 = i3;
                if ((i7 & 9363) == 9362) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(center22, centerVertically22, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier5);
                Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash32);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1273112983, "C34@1234L9,36@1268L7,36@1249L31,39@1355L7,38@1286L615,61@1907L38,64@1975L47,67@2069L12,68@2125L6,63@1951L405:AppInfo.kt#aaq0h9");
                AppIconKt.m10816AppIconkHDZbjc(0.0f, startRestartGroup, 0, 1);
                SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10808get3D9Ej5fM(), null, startRestartGroup, 0, 2);
                Arrangement.HorizontalOrVertical m696spacedBy0680j_422 = Arrangement.INSTANCE.m696spacedBy0680j_4(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10803get1D9Ej5fM());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier.Companion companion22 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_422, Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl2.getInserting()) {
                }
                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash222);
                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242643744, "C43@1436L4,41@1382L109:AppInfo.kt#aaq0h9");
                String str622 = str4;
                str5 = str3;
                TextKt.m10822NewTextnUFttAo(appName, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getLg(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777211, null), 0L, 0, false, 0, (Modifier) null, startRestartGroup, i7 & 14, 124);
                if (str5 != null) {
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                SpacerKt.m10818SpacerorJrPs(f, RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, i9, 1);
                startRestartGroup.startReplaceGroup(5004770);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):AppInfo.kt#9igjgp");
                if ((57344 & i8) != i10) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (i11 == 0) {
                }
                rememberedValue = new Function0() { // from class: expo.modules.devmenu.compose.ui.AppInfoKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AppInfo$lambda$5$lambda$4$lambda$3;
                        AppInfo$lambda$5$lambda$4$lambda$3 = AppInfoKt.AppInfo$lambda$5$lambda$4$lambda$3(Function1.this);
                        return AppInfo$lambda$5$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, false, RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(NewAppTheme.INSTANCE.getBorderRadius(startRestartGroup, 6).m10766getFullD9Ej5fM()), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBackground().getElement(), 0L, null, 0L, 0.0f, SizeKt.m889size3ABfNKs(rowScopeInstance22.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), Dp.m8401constructorimpl(36)), 0, null, null, null, null, ComposableSingletons$AppInfoKt.INSTANCE.m10849getLambda$1571584122$expo_dev_menu_release(), startRestartGroup, 0, 24576, 16114);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                function14 = function13;
                final String str722 = str3;
                final String str822 = str4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            str3 = str;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str4 = str2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function12 = function1;
            i7 = i3;
            if ((i7 & 9363) == 9362) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center222 = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(center222, centerVertically222, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier5);
            Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash322);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1273112983, "C34@1234L9,36@1268L7,36@1249L31,39@1355L7,38@1286L615,61@1907L38,64@1975L47,67@2069L12,68@2125L6,63@1951L405:AppInfo.kt#aaq0h9");
            AppIconKt.m10816AppIconkHDZbjc(0.0f, startRestartGroup, 0, 1);
            SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10808get3D9Ej5fM(), null, startRestartGroup, 0, 2);
            Arrangement.HorizontalOrVertical m696spacedBy0680j_4222 = Arrangement.INSTANCE.m696spacedBy0680j_4(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10803get1D9Ej5fM());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_4222, Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl2.getInserting()) {
            }
            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2222);
            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242643744, "C43@1436L4,41@1382L109:AppInfo.kt#aaq0h9");
            String str6222 = str4;
            str5 = str3;
            TextKt.m10822NewTextnUFttAo(appName, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getLg(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777211, null), 0L, 0, false, 0, (Modifier) null, startRestartGroup, i7 & 14, 124);
            if (str5 != null) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.m10818SpacerorJrPs(f, RowScope.weight$default(rowScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, i9, 1);
            startRestartGroup.startReplaceGroup(5004770);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):AppInfo.kt#9igjgp");
            if ((57344 & i8) != i10) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (i11 == 0) {
            }
            rememberedValue = new Function0() { // from class: expo.modules.devmenu.compose.ui.AppInfoKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit AppInfo$lambda$5$lambda$4$lambda$3;
                    AppInfo$lambda$5$lambda$4$lambda$3 = AppInfoKt.AppInfo$lambda$5$lambda$4$lambda$3(Function1.this);
                    return AppInfo$lambda$5$lambda$4$lambda$3;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, false, RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(NewAppTheme.INSTANCE.getBorderRadius(startRestartGroup, 6).m10766getFullD9Ej5fM()), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBackground().getElement(), 0L, null, 0L, 0.0f, SizeKt.m889size3ABfNKs(rowScopeInstance222.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), Dp.m8401constructorimpl(36)), 0, null, null, null, null, ComposableSingletons$AppInfoKt.INSTANCE.m10849getLambda$1571584122$expo_dev_menu_release(), startRestartGroup, 0, 24576, 16114);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            function14 = function13;
            final String str7222 = str3;
            final String str8222 = str4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str3 = str;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str4 = str2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function12 = function1;
        i7 = i3;
        if ((i7 & 9363) == 9362) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical center2222 = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(center2222, centerVertically2222, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier5);
        Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash3222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1273112983, "C34@1234L9,36@1268L7,36@1249L31,39@1355L7,38@1286L615,61@1907L38,64@1975L47,67@2069L12,68@2125L6,63@1951L405:AppInfo.kt#aaq0h9");
        AppIconKt.m10816AppIconkHDZbjc(0.0f, startRestartGroup, 0, 1);
        SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10808get3D9Ej5fM(), null, startRestartGroup, 0, 2);
        Arrangement.HorizontalOrVertical m696spacedBy0680j_42222 = Arrangement.INSTANCE.m696spacedBy0680j_4(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10803get1D9Ej5fM());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion2222 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_42222, Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl2, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl2.getInserting()) {
        }
        m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
        m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash22222);
        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1242643744, "C43@1436L4,41@1382L109:AppInfo.kt#aaq0h9");
        String str62222 = str4;
        str5 = str3;
        TextKt.m10822NewTextnUFttAo(appName, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getLg(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777211, null), 0L, 0, false, 0, (Modifier) null, startRestartGroup, i7 & 14, 124);
        if (str5 != null) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SpacerKt.m10818SpacerorJrPs(f, RowScope.weight$default(rowScopeInstance2222, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, i9, 1);
        startRestartGroup.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):AppInfo.kt#9igjgp");
        if ((57344 & i8) != i10) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (i11 == 0) {
        }
        rememberedValue = new Function0() { // from class: expo.modules.devmenu.compose.ui.AppInfoKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit AppInfo$lambda$5$lambda$4$lambda$3;
                AppInfo$lambda$5$lambda$4$lambda$3 = AppInfoKt.AppInfo$lambda$5$lambda$4$lambda$3(Function1.this);
                return AppInfo$lambda$5$lambda$4$lambda$3;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, false, RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(NewAppTheme.INSTANCE.getBorderRadius(startRestartGroup, 6).m10766getFullD9Ej5fM()), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBackground().getElement(), 0L, null, 0L, 0.0f, SizeKt.m889size3ABfNKs(rowScopeInstance2222.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), Dp.m8401constructorimpl(36)), 0, null, null, null, null, ComposableSingletons$AppInfoKt.INSTANCE.m10849getLambda$1571584122$expo_dev_menu_release(), startRestartGroup, 0, 24576, 16114);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        function14 = function13;
        final String str72222 = str3;
        final String str82222 = str4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppInfo$lambda$5$lambda$4$lambda$3(Function1 function1) {
        function1.invoke(DevMenuAction.Close.INSTANCE);
        return Unit.INSTANCE;
    }

    public static final void AppInfoPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1799540755);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppInfoPreview)84@2476L210:AppInfo.kt#aaq0h9");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1799540755, i, -1, "expo.modules.devmenu.compose.ui.AppInfoPreview (AppInfo.kt:83)");
            }
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 400737957, "C85@2489L73,90@2568L39,92@2613L69:AppInfo.kt#aaq0h9");
            AppInfo("Expo App", null, SimpleSignInService.SDK_VERSION, null, null, startRestartGroup, 390, 26);
            SpacerKt.m10818SpacerorJrPs(0.0f, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(30)), startRestartGroup, 48, 1);
            AppInfo("Expo App", null, null, SimpleSignInService.SDK_VERSION, null, startRestartGroup, 3078, 22);
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
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.AppInfoKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppInfoPreview$lambda$8;
                    AppInfoPreview$lambda$8 = AppInfoKt.AppInfoPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return AppInfoPreview$lambda$8;
                }
            });
        }
    }
}
