package io.intercom.android.sdk.m5.navigation;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
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
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.survey.ui.questiontype.files.FileActionSheetKt;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTicketDestination.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class CreateTicketDestinationKt$createTicketDestination$4$2$2 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<AnswerClickData> $answerClickedData;
    final /* synthetic */ AnswerClickData $data;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ CreateTicketViewModel $viewModel;

    CreateTicketDestinationKt$createTicketDestination$4$2$2(AnswerClickData answerClickData, CreateTicketViewModel createTicketViewModel, CoroutineScope coroutineScope, MutableState<AnswerClickData> mutableState) {
        this.$data = answerClickData;
        this.$viewModel = createTicketViewModel;
        this.$scope = coroutineScope;
        this.$answerClickedData = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope ModalBottomSheet, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            Modifier navigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
            final AnswerClickData answerClickData = this.$data;
            final CreateTicketViewModel createTicketViewModel = this.$viewModel;
            final CoroutineScope coroutineScope = this.$scope;
            final MutableState<AnswerClickData> mutableState = this.$answerClickedData;
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, navigationBarsPadding);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer);
            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            FileActionSheetKt.FileActionSheet(answerClickData.getClickedItem(), new Function0() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$2$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$4$lambda$0;
                    invoke$lambda$4$lambda$0 = CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$4$lambda$0(CreateTicketViewModel.this, answerClickData, coroutineScope, mutableState);
                    return invoke$lambda$4$lambda$0;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$2$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$4$lambda$1;
                    invoke$lambda$4$lambda$1 = CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$4$lambda$1(CreateTicketViewModel.this, answerClickData, coroutineScope, mutableState);
                    return invoke$lambda$4$lambda$1;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$2$2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$4$lambda$2;
                    invoke$lambda$4$lambda$2 = CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$4$lambda$2(CreateTicketViewModel.this, answerClickData, coroutineScope, mutableState);
                    return invoke$lambda$4$lambda$2;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$2$2$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = CreateTicketDestinationKt$createTicketDestination$4$2$2.invoke$lambda$4$lambda$3(CoroutineScope.this, mutableState);
                    return invoke$lambda$4$lambda$3;
                }
            }, composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$0(CreateTicketViewModel viewModel, AnswerClickData data, CoroutineScope scope, MutableState answerClickedData) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(answerClickedData, "$answerClickedData");
        viewModel.onRetryFileClicked(data);
        CreateTicketDestinationKt$createTicketDestination$4.invoke$dismissSheet(scope, answerClickedData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$1(CreateTicketViewModel viewModel, AnswerClickData data, CoroutineScope scope, MutableState answerClickedData) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(answerClickedData, "$answerClickedData");
        viewModel.onDeleteFileClicked(data);
        CreateTicketDestinationKt$createTicketDestination$4.invoke$dismissSheet(scope, answerClickedData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$2(CreateTicketViewModel viewModel, AnswerClickData data, CoroutineScope scope, MutableState answerClickedData) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(answerClickedData, "$answerClickedData");
        viewModel.onDeleteFileClicked(data);
        CreateTicketDestinationKt$createTicketDestination$4.invoke$dismissSheet(scope, answerClickedData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(CoroutineScope scope, MutableState answerClickedData) {
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(answerClickedData, "$answerClickedData");
        CreateTicketDestinationKt$createTicketDestination$4.invoke$dismissSheet(scope, answerClickedData);
        return Unit.INSTANCE;
    }
}
