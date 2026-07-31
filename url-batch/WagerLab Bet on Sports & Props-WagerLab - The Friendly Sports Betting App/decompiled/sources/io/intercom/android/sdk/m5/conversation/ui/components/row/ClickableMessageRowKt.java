package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClickableMessageRow.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2.\u0010\u000e\u001a*\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002"}, d2 = {"ClickableMessageRow", "", "conversationPart", "Lio/intercom/android/sdk/models/Part;", "modifier", "Landroidx/compose/ui/Modifier;", "bottomMetadata", "Lio/intercom/android/sdk/m5/conversation/ui/components/row/BottomMetadata;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "onRetryMessageClicked", "Lkotlin/Function0;", "content", "Lkotlin/Function3;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "(Lio/intercom/android/sdk/models/Part;Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/conversation/ui/components/row/BottomMetadata;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;II)V", "intercom-sdk-base_release", "showTimestamp", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ClickableMessageRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableMessageRow$lambda$8(Part conversationPart, Modifier modifier, BottomMetadata bottomMetadata, Alignment.Horizontal horizontal, PaddingValues paddingValues, Function0 function0, Function5 content, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(conversationPart, "$conversationPart");
        Intrinsics.checkNotNullParameter(content, "$content");
        ClickableMessageRow(conversationPart, modifier, bottomMetadata, horizontal, paddingValues, function0, content, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ClickableMessageRow(final Part conversationPart, Modifier modifier, final BottomMetadata bottomMetadata, Alignment.Horizontal horizontal, PaddingValues paddingValues, Function0<Unit> function0, final Function5<? super ColumnScope, ? super Part, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        String attribution;
        Intrinsics.checkNotNullParameter(conversationPart, "conversationPart");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-932954058);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        Alignment.Horizontal start = (i2 & 8) != 0 ? Alignment.INSTANCE.getStart() : horizontal;
        PaddingValues m832PaddingValuesYgX7TsA$default = (i2 & 16) != 0 ? PaddingKt.m832PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues;
        Function0<Unit> function03 = (i2 & 32) != 0 ? null : function0;
        startRestartGroup.startReplaceGroup(1099059020);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<ClipboardManager> localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localClipboardManager);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final ClipboardManager clipboardManager = (ClipboardManager) consume;
        Function0 function04 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ClickableMessageRowKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit ClickableMessageRow$lambda$3;
                ClickableMessageRow$lambda$3 = ClickableMessageRowKt.ClickableMessageRow$lambda$3(ClipboardManager.this, conversationPart);
                return ClickableMessageRow$lambda$3;
            }
        };
        startRestartGroup.startReplaceGroup(1099065861);
        if (function03 == null) {
            startRestartGroup.startReplaceGroup(1099066636);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ClickableMessageRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ClickableMessageRow$lambda$5$lambda$4;
                        ClickableMessageRow$lambda$5$lambda$4 = ClickableMessageRowKt.ClickableMessageRow$lambda$5$lambda$4(MutableState.this);
                        return ClickableMessageRow$lambda$5$lambda$4;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            function02 = (Function0) rememberedValue2;
            startRestartGroup.endReplaceGroup();
        } else {
            function02 = function03;
        }
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
        Unit unit = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(1099071132);
        boolean changed = startRestartGroup.changed(function04) | startRestartGroup.changed(function02);
        ClickableMessageRowKt$ClickableMessageRow$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new ClickableMessageRowKt$ClickableMessageRow$1$1(function04, function02);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceGroup();
        Modifier padding = PaddingKt.padding(SuspendingPointerInputFilterKt.pointerInput(fillMaxWidth$default, unit, (PointerInputEventHandler) rememberedValue3), m832PaddingValuesYgX7TsA$default);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start, startRestartGroup, (((i >> 3) & 896) >> 3) & 112);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function0<Unit> function05 = function02;
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
        content.invoke(ColumnScopeInstance.INSTANCE, conversationPart, function05, startRestartGroup, Integer.valueOf(((i >> 9) & 7168) | 70));
        startRestartGroup.startReplaceGroup(-1990945499);
        if ((bottomMetadata != null && ClickableMessageRow$lambda$1(mutableState)) || (bottomMetadata != null && bottomMetadata.getAlwaysShow())) {
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, bottomMetadata.m11383getPaddingD9Ej5fM()), startRestartGroup, 0);
            String text = bottomMetadata.getText();
            startRestartGroup.startReplaceGroup(-1990935821);
            String str = "";
            if (BubbleMessageRowKt.shouldShowAttribution(conversationPart)) {
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Phrase from = Phrase.from((Context) consume2, R.string.intercom_gif_attribution);
                List<Block> blocks = conversationPart.getBlocks();
                Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
                Block block = (Block) CollectionsKt.firstOrNull((List) blocks);
                if (block != null && (attribution = block.getAttribution()) != null) {
                    str = attribution;
                }
                str = from.put("providername", str).format().toString();
            }
            startRestartGroup.endReplaceGroup();
            BubbleMessageRowKt.MessageMeta(null, text, str, true, startRestartGroup, 3072, 1);
            startRestartGroup = startRestartGroup;
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final Alignment.Horizontal horizontal2 = start;
            final PaddingValues paddingValues2 = m832PaddingValuesYgX7TsA$default;
            final Function0<Unit> function06 = function03;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ClickableMessageRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ClickableMessageRow$lambda$8;
                    ClickableMessageRow$lambda$8 = ClickableMessageRowKt.ClickableMessageRow$lambda$8(Part.this, modifier3, bottomMetadata, horizontal2, paddingValues2, function06, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ClickableMessageRow$lambda$8;
                }
            });
        }
    }

    private static final boolean ClickableMessageRow$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ClickableMessageRow$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableMessageRow$lambda$3(ClipboardManager clipboardManager, Part conversationPart) {
        Intrinsics.checkNotNullParameter(clipboardManager, "$clipboardManager");
        Intrinsics.checkNotNullParameter(conversationPart, "$conversationPart");
        clipboardManager.setText(BubbleMessageRowKt.getCopyText(conversationPart));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableMessageRow$lambda$5$lambda$4(MutableState showTimestamp$delegate) {
        Intrinsics.checkNotNullParameter(showTimestamp$delegate, "$showTimestamp$delegate");
        ClickableMessageRow$lambda$2(showTimestamp$delegate, !ClickableMessageRow$lambda$1(showTimestamp$delegate));
        return Unit.INSTANCE;
    }
}
