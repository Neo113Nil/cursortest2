package expo.modules.devmenu.compose.ui;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.composeunstyled.ButtonKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.primitives.DividerKt;
import expo.modules.devmenu.compose.primitives.SpacerKt;
import expo.modules.devmenu.compose.primitives.TextKt;
import expo.modules.devmenu.compose.utils.ClipboardKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SystemSection.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0003¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"SystemSection", "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "", "runtimeVersion", "fullDataProvider", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CopyButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Info", "label", "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SystemSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CopyButton$lambda$4(Function0 function0, int i, Composer composer, int i2) {
        CopyButton(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Info$lambda$6(String str, String str2, int i, Composer composer, int i2) {
        Info(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SystemSection$lambda$1(String str, String str2, Function0 function0, int i, int i2, Composer composer, int i3) {
        SystemSection(str, str2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SystemSection(String str, String str2, final Function0<String> fullDataProvider, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        final String str5;
        int hashCode;
        Composer m4976constructorimpl;
        final String str6;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(fullDataProvider, "fullDataProvider");
        Composer startRestartGroup = composer.startRestartGroup(-1644155755);
        ComposerKt.sourceInformation(startRestartGroup, "C(SystemSection)P(!1,2)24@906L307:SystemSection.kt#aaq0h9");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            str3 = str;
        } else if ((i & 6) == 0) {
            str3 = str;
            i3 = (startRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str4 = str2;
            i3 |= startRestartGroup.changed(str4) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(fullDataProvider) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !startRestartGroup.getSkipping()) {
                str5 = i5 == 0 ? null : str3;
                String str7 = i6 == 0 ? null : str4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1644155755, i4, -1, "expo.modules.devmenu.compose.ui.SystemSection (SystemSection.kt:23)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -154492510, "C25@927L16,27@968L7,27@949L31,29@986L27,31@1019L36,33@1061L27,35@1094L48,37@1148L27,39@1181L28:SystemSection.kt#aaq0h9");
                Section.INSTANCE.Header("System", startRestartGroup, 54);
                SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10808get3D9Ej5fM(), null, startRestartGroup, 0, 2);
                float f = (float) 0.5d;
                DividerKt.m10817DividerkbKKJSQ(Dp.m8401constructorimpl(f), 0L, startRestartGroup, 6, 2);
                Info("Version", str5 != null ? "N/A" : str5, startRestartGroup, 6);
                DividerKt.m10817DividerkbKKJSQ(Dp.m8401constructorimpl(f), 0L, startRestartGroup, 6, 2);
                Info("Runtime version", str7 != null ? str7 : "N/A", startRestartGroup, 6);
                DividerKt.m10817DividerkbKKJSQ(Dp.m8401constructorimpl(f), 0L, startRestartGroup, 6, 2);
                CopyButton(fullDataProvider, startRestartGroup, (i4 >> 6) & 14);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str6 = str7;
            } else {
                startRestartGroup.skipToGroupEnd();
                str5 = str3;
                str6 = str4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.SystemSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SystemSection$lambda$1;
                        SystemSection$lambda$1 = SystemSectionKt.SystemSection$lambda$1(str5, str6, fullDataProvider, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SystemSection$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        str4 = str2;
        if ((i2 & 4) == 0) {
        }
        i4 = i3;
        if ((i4 & 147) == 146) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -154492510, "C25@927L16,27@968L7,27@949L31,29@986L27,31@1019L36,33@1061L27,35@1094L48,37@1148L27,39@1181L28:SystemSection.kt#aaq0h9");
        Section.INSTANCE.Header("System", startRestartGroup, 54);
        SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10808get3D9Ej5fM(), null, startRestartGroup, 0, 2);
        float f2 = (float) 0.5d;
        DividerKt.m10817DividerkbKKJSQ(Dp.m8401constructorimpl(f2), 0L, startRestartGroup, 6, 2);
        Info("Version", str5 != null ? "N/A" : str5, startRestartGroup, 6);
        DividerKt.m10817DividerkbKKJSQ(Dp.m8401constructorimpl(f2), 0L, startRestartGroup, 6, 2);
        Info("Runtime version", str7 != null ? str7 : "N/A", startRestartGroup, 6);
        DividerKt.m10817DividerkbKKJSQ(Dp.m8401constructorimpl(f2), 0L, startRestartGroup, 6, 2);
        CopyButton(fullDataProvider, startRestartGroup, (i4 >> 6) & 14);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        str6 = str7;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void CopyButton(final Function0<String> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1125979432);
        ComposerKt.sourceInformation(startRestartGroup, "C(CopyButton)45@1315L7,47@1347L125,46@1325L561:SystemSection.kt#aaq0h9");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1125979432, i2, -1, "expo.modules.devmenu.compose.ui.CopyButton (SystemSection.kt:44)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            startRestartGroup.startReplaceGroup(-1633490746);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):SystemSection.kt#9igjgp");
            boolean changedInstance = ((i2 & 14) == 4) | startRestartGroup.changedInstance(context);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: expo.modules.devmenu.compose.ui.SystemSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit CopyButton$lambda$3$lambda$2;
                        CopyButton$lambda$3$lambda$2 = SystemSectionKt.CopyButton$lambda$3$lambda$2(context, function0);
                        return CopyButton$lambda$3$lambda$2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            ButtonKt.m9489ButtonY0X4mI((Function0) rememberedValue, false, null, 0L, 0L, null, 0L, 0.0f, null, 0, null, null, null, null, ComposableSingletons$SystemSectionKt.INSTANCE.m10852getLambda$767922662$expo_dev_menu_release(), composer2, 0, 24576, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.SystemSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CopyButton$lambda$4;
                    CopyButton$lambda$4 = SystemSectionKt.CopyButton$lambda$4(Function0.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CopyButton$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CopyButton$lambda$3$lambda$2(Context context, Function0 function0) {
        ClipboardKt.copyToClipboard(context, "Application Info", (String) function0.invoke());
        return Unit.INSTANCE;
    }

    private static final void Info(String str, String str2, Composer composer, final int i) {
        int i2;
        final String str3;
        final String str4;
        Composer startRestartGroup = composer.startRestartGroup(1990398349);
        ComposerKt.sourceInformation(startRestartGroup, "C(Info)77@1953L317:SystemSection.kt#aaq0h9");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1990398349, i3, -1, "expo.modules.devmenu.compose.ui.Info (SystemSection.kt:76)");
            }
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Modifier m839paddingVpY3zN4$default = PaddingKt.m839paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m8401constructorimpl(12), 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
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
            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -985076617, "C85@2159L6,83@2111L75,89@2239L6,87@2191L75:SystemSection.kt#aaq0h9");
            TextKt.m10822NewTextnUFttAo(str, (TextStyle) null, NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getText().getSecondary(), 0, false, 0, (Modifier) null, startRestartGroup, i3 & 14, 122);
            str3 = str;
            str4 = str2;
            TextKt.m10822NewTextnUFttAo(str4, (TextStyle) null, NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getText().getSecondary(), 0, false, 0, (Modifier) null, startRestartGroup, (i3 >> 3) & 14, 122);
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
            str3 = str;
            str4 = str2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.SystemSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Info$lambda$6;
                    Info$lambda$6 = SystemSectionKt.Info$lambda$6(str3, str4, i, (Composer) obj, ((Integer) obj2).intValue());
                    return Info$lambda$6;
                }
            });
        }
    }
}
