package expo.modules.devmenu.compose.ui;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material.MenuKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.primitives.TextKt;
import expo.modules.devmenu.compose.utils.ClipboardKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BundlerInfo.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"BundlerInfo", "", "bundlerIp", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "BundlerInfoPreview", "(Landroidx/compose/runtime/Composer;I)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BundlerInfoKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BundlerInfo$lambda$2(String str, int i, Composer composer, int i2) {
        BundlerInfo(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BundlerInfoPreview$lambda$3(int i, Composer composer, int i2) {
        BundlerInfoPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BundlerInfo(final String bundlerIp, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(bundlerIp, "bundlerIp");
        Composer startRestartGroup = composer.startRestartGroup(431776860);
        ComposerKt.sourceInformation(startRestartGroup, "C(BundlerInfo)17@623L7,20@663L469,45@1278L111,19@634L759:BundlerInfo.kt#aaq0h9");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(bundlerIp) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(431776860, i2, -1, "expo.modules.devmenu.compose.ui.BundlerInfo (BundlerInfo.kt:16)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1023634464, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.BundlerInfoKt$BundlerInfo$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposerKt.sourceInformation(composer2, "C22@742L7,21@671L455:BundlerInfo.kt#aaq0h9");
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1023634464, i3, -1, "expo.modules.devmenu.compose.ui.BundlerInfo.<anonymous> (BundlerInfo.kt:21)");
                    }
                    Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(NewAppTheme.INSTANCE.getSpacing(composer2, 6).m10803get1D9Ej5fM());
                    String str = bundlerIp;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
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
                    Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                    }
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -689856288, "C26@839L6,27@891L4,24@773L197,33@1039L4,31@979L139:BundlerInfo.kt#aaq0h9");
                    TextKt.m10822NewTextnUFttAo("Connected to:", TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(composer2, 6).getSm(), 0L, 0L, FontWeight.INSTANCE.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777211, null), NewAppTheme.INSTANCE.getColors(composer2, 6).getText().getTertiary(), 0, false, 0, (Modifier) null, composer2, 6, MenuKt.InTransitionDuration);
                    TextKt.m10822NewTextnUFttAo(str, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(composer2, 6).getMd(), 0L, 0L, FontWeight.INSTANCE.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777211, null), 0L, 0, false, 0, (Modifier) null, composer2, 0, 124);
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
            }, startRestartGroup, 54);
            Function2<Composer, Integer, Unit> lambda$1718281471$expo_dev_menu_release = ComposableSingletons$BundlerInfoKt.INSTANCE.getLambda$1718281471$expo_dev_menu_release();
            startRestartGroup.startReplaceGroup(-1633490746);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):BundlerInfo.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(context) | ((i2 & 14) == 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: expo.modules.devmenu.compose.ui.BundlerInfoKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BundlerInfo$lambda$1$lambda$0;
                        BundlerInfo$lambda$1$lambda$0 = BundlerInfoKt.BundlerInfo$lambda$1$lambda$0(context, bundlerIp);
                        return BundlerInfo$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            MenuButtonKt.m10864NewMenuButton0vH8DBg(null, null, rememberComposableLambda, lambda$1718281471$expo_dev_menu_release, false, false, 0.0f, (Function0) rememberedValue, startRestartGroup, 3456, 115);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.BundlerInfoKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BundlerInfo$lambda$2;
                    BundlerInfo$lambda$2 = BundlerInfoKt.BundlerInfo$lambda$2(bundlerIp, i, (Composer) obj, ((Integer) obj2).intValue());
                    return BundlerInfo$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BundlerInfo$lambda$1$lambda$0(Context context, String str) {
        ClipboardKt.copyToClipboard(context, "Bundler URL", str);
        return Unit.INSTANCE;
    }

    public static final void BundlerInfoPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1098425995);
        ComposerKt.sourceInformation(startRestartGroup, "C(BundlerInfoPreview)60@1466L55:BundlerInfo.kt#aaq0h9");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1098425995, i, -1, "expo.modules.devmenu.compose.ui.BundlerInfoPreview (BundlerInfo.kt:59)");
            }
            BundlerInfo("http://10.0.2.2:8081", startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.BundlerInfoKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BundlerInfoPreview$lambda$3;
                    BundlerInfoPreview$lambda$3 = BundlerInfoKt.BundlerInfoPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BundlerInfoPreview$lambda$3;
                }
            });
        }
    }
}
