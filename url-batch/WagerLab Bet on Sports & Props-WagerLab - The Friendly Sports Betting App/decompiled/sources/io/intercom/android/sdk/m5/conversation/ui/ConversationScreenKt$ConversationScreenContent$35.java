package io.intercom.android.sdk.m5.conversation.ui;

import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.TeammateSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConversationScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class ConversationScreenKt$ConversationScreenContent$35 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ Function1<Block, Unit> $onGifClick;
    final /* synthetic */ Function1<String, Unit> $onGifSearchQueryChange;
    final /* synthetic */ Function1<List<? extends Uri>, Unit> $onMediaSelected;
    final /* synthetic */ MutableState<Boolean> $openBottomSheet;
    final /* synthetic */ Function1<String, Unit> $trackClickedInput;
    final /* synthetic */ ConversationUiState $uiState;

    /* JADX WARN: Multi-variable type inference failed */
    ConversationScreenKt$ConversationScreenContent$35(ConversationUiState conversationUiState, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function1<? super List<? extends Uri>, Unit> function13, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, Function1<? super Block, Unit> function14) {
        this.$uiState = conversationUiState;
        this.$trackClickedInput = function1;
        this.$onGifSearchQueryChange = function12;
        this.$onMediaSelected = function13;
        this.$coroutineScope = coroutineScope;
        this.$openBottomSheet = mutableState;
        this.$onGifClick = function14;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope ModalBottomSheet, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((i & 81) != 16 || !composer2.getSkipping()) {
            Modifier navigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
            ConversationUiState conversationUiState = this.$uiState;
            Function1<String, Unit> function1 = this.$trackClickedInput;
            Function1<String, Unit> function12 = this.$onGifSearchQueryChange;
            final Function1<List<? extends Uri>, Unit> function13 = this.$onMediaSelected;
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final MutableState<Boolean> mutableState = this.$openBottomSheet;
            final Function1<Block, Unit> function14 = this.$onGifClick;
            ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, navigationBarsPadding);
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
            composer2.startReplaceGroup(-554919247);
            if (conversationUiState instanceof ConversationUiState.Content) {
                ConversationUiState.Content content = (ConversationUiState.Content) conversationUiState;
                BottomSheetState bottomSheetState = content.getBottomSheetState();
                if (bottomSheetState instanceof BottomSheetState.MediaInput) {
                    composer2.startReplaceGroup(-22527620);
                    MediaInputSheetContentKt.MediaInputSheetContent(PaddingKt.m837padding3ABfNKs(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), Dp.m8401constructorimpl(16)), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$35$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$3$lambda$0;
                            invoke$lambda$3$lambda$0 = ConversationScreenKt$ConversationScreenContent$35.invoke$lambda$3$lambda$0(Function1.this, coroutineScope, mutableState, (List) obj);
                            return invoke$lambda$3$lambda$0;
                        }
                    }, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$35$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$3$lambda$1;
                            invoke$lambda$3$lambda$1 = ConversationScreenKt$ConversationScreenContent$35.invoke$lambda$3$lambda$1(CoroutineScope.this, mutableState);
                            return invoke$lambda$3$lambda$1;
                        }
                    }, function1, content.getBottomBarUiState().getInputTypeState(), composer2, 32774, 0);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                } else if (bottomSheetState instanceof BottomSheetState.TeammatePresence) {
                    composer2.startReplaceGroup(-21710491);
                    TeammateSheetContentKt.TeammateSheetContent(PaddingKt.m837padding3ABfNKs(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), Dp.m8401constructorimpl(16)), content.getTeamPresenceState().getSpecialNotice(), content.getTeamPresenceState().getExpandedTeamPresenceState(), composer2, 518, 0);
                    composer2.endReplaceGroup();
                } else if (bottomSheetState instanceof BottomSheetState.GifSearch) {
                    composer2.startReplaceGroup(-21184762);
                    GifGridKt.GifGrid(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), ((BottomSheetState.GifSearch) content.getBottomSheetState()).getGifs(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$35$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$3$lambda$2;
                            invoke$lambda$3$lambda$2 = ConversationScreenKt$ConversationScreenContent$35.invoke$lambda$3$lambda$2(Function1.this, coroutineScope, mutableState, (Block) obj);
                            return invoke$lambda$3$lambda$2;
                        }
                    }, function12, composer, 70, 0);
                    composer2 = composer;
                    composer2.endReplaceGroup();
                } else if (bottomSheetState instanceof BottomSheetState.InlineSources) {
                    composer2.startReplaceGroup(-20629862);
                    InlineSourcesSheetContentKt.InlineSourcesSheetContent(((BottomSheetState.InlineSources) content.getBottomSheetState()).getSelectedSources(), ((BottomSheetState.InlineSources) content.getBottomSheetState()).getSources(), SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), composer2, 456, 0);
                    composer2.endReplaceGroup();
                } else if (Intrinsics.areEqual(bottomSheetState, BottomSheetState.Empty.INSTANCE)) {
                    composer2.startReplaceGroup(-20236782);
                    composer2.endReplaceGroup();
                    ConversationScreenKt.ConversationScreenContent$hideBottomSheet(coroutineScope, mutableState);
                } else {
                    composer2.startReplaceGroup(-554917219);
                    composer2.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            return;
        }
        composer2.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$0(Function1 function1, CoroutineScope coroutineScope, MutableState openBottomSheet, List it) {
        Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
        Intrinsics.checkNotNullParameter(openBottomSheet, "$openBottomSheet");
        Intrinsics.checkNotNullParameter(it, "it");
        ConversationScreenKt.ConversationScreenContent$hideBottomSheet(coroutineScope, openBottomSheet);
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$1(CoroutineScope coroutineScope, MutableState openBottomSheet) {
        Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
        Intrinsics.checkNotNullParameter(openBottomSheet, "$openBottomSheet");
        ConversationScreenKt.ConversationScreenContent$hideBottomSheet(coroutineScope, openBottomSheet);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Function1 function1, CoroutineScope coroutineScope, MutableState openBottomSheet, Block it) {
        Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
        Intrinsics.checkNotNullParameter(openBottomSheet, "$openBottomSheet");
        Intrinsics.checkNotNullParameter(it, "it");
        ConversationScreenKt.ConversationScreenContent$hideBottomSheet(coroutineScope, openBottomSheet);
        function1.invoke(it);
        return Unit.INSTANCE;
    }
}
