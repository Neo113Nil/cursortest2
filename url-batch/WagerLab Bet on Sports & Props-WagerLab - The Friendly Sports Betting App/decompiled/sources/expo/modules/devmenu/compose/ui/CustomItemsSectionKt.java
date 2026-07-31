package expo.modules.devmenu.compose.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.text.TextStyle;
import expo.modules.devmenu.compose.DevMenuState;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.primitives.SpacerKt;
import expo.modules.devmenu.compose.primitives.TextKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: CustomItemsSection.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"CustomItemsSection", "", "items", "", "Lexpo/modules/devmenu/compose/DevMenuState$CustomItem;", "onItemClick", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomItemsSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomItemsSection$lambda$4(List list, Function1 function1, int i, Composer composer, int i2) {
        CustomItemsSection(list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CustomItemsSection(final List<DevMenuState.CustomItem> items, final Function1<? super DevMenuState.CustomItem, Unit> onItemClick, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer startRestartGroup = composer.startRestartGroup(886071108);
        ComposerKt.sourceInformation(startRestartGroup, "C(CustomItemsSection)15@542L27,17@592L7,17@573L31,19@670L7,19@608L251:CustomItemsSection.kt#aaq0h9");
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(items) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onItemClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(886071108, i2, -1, "expo.modules.devmenu.compose.ui.CustomItemsSection (CustomItemsSection.kt:14)");
            }
            int i3 = 54;
            Section.INSTANCE.Header("CUSTOM MENU ITEMS", startRestartGroup, 54);
            boolean z = false;
            SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10808get3D9Ej5fM(), null, startRestartGroup, 0, 2);
            Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10807get2D9Ej5fM());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -725418940, "C:CustomItemsSection.kt#aaq0h9");
            startRestartGroup.startReplaceGroup(-2101610407);
            ComposerKt.sourceInformation(startRestartGroup, "*22@753L47,25@820L21,21@720L129");
            for (final DevMenuState.CustomItem customItem : items) {
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1716784153, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.CustomItemsSectionKt$CustomItemsSection$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ComposerKt.sourceInformation(composer2, "C23@765L25:CustomItemsSection.kt#aaq0h9");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1716784153, i4, -1, "expo.modules.devmenu.compose.ui.CustomItemsSection.<anonymous>.<anonymous>.<anonymous> (CustomItemsSection.kt:23)");
                        }
                        TextKt.m10822NewTextnUFttAo(DevMenuState.CustomItem.this.getName(), (TextStyle) null, 0L, 0, false, 0, (Modifier) null, composer2, 0, WebSocketProtocol.PAYLOAD_SHORT);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, i3);
                startRestartGroup.startReplaceGroup(-1633490746);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):CustomItemsSection.kt#9igjgp");
                boolean changed = startRestartGroup.changed(customItem) | ((i2 & 112) != 32 ? z : true);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: expo.modules.devmenu.compose.ui.CustomItemsSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit CustomItemsSection$lambda$3$lambda$2$lambda$1$lambda$0;
                            CustomItemsSection$lambda$3$lambda$2$lambda$1$lambda$0 = CustomItemsSectionKt.CustomItemsSection$lambda$3$lambda$2$lambda$1$lambda$0(Function1.this, customItem);
                            return CustomItemsSection$lambda$3$lambda$2$lambda$1$lambda$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                MenuButtonKt.m10864NewMenuButton0vH8DBg(null, null, rememberComposableLambda, null, false, false, 0.0f, (Function0) rememberedValue, startRestartGroup, 384, 123);
                i2 = i2;
                z = z;
                i3 = i3;
            }
            startRestartGroup.endReplaceGroup();
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
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.CustomItemsSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CustomItemsSection$lambda$4;
                    CustomItemsSection$lambda$4 = CustomItemsSectionKt.CustomItemsSection$lambda$4(items, onItemClick, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CustomItemsSection$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomItemsSection$lambda$3$lambda$2$lambda$1$lambda$0(Function1 function1, DevMenuState.CustomItem customItem) {
        function1.invoke(customItem);
        return Unit.INSTANCE;
    }
}
