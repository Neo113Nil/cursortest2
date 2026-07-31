package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.utils.URIExtensionsKt;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle;
import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;
import io.intercom.android.sdk.ui.component.MediaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadFileQuestion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class UploadFileQuestionKt$UploadFileQuestion$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Answer $answer;
    final /* synthetic */ Context $context;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<Answer, Unit> $onAnswer;
    final /* synthetic */ Function1<AnswerClickData, Unit> $onAnswerClick;
    final /* synthetic */ Function2<Composer, Integer, Unit> $questionHeader;
    final /* synthetic */ SurveyData.Step.Question.UploadFileQuestionModel $questionModel;

    /* JADX WARN: Multi-variable type inference failed */
    UploadFileQuestionKt$UploadFileQuestion$2(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Answer answer, SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel, Function1<? super AnswerClickData, Unit> function1, Function1<? super Answer, Unit> function12, Context context) {
        this.$modifier = modifier;
        this.$questionHeader = function2;
        this.$answer = answer;
        this.$questionModel = uploadFileQuestionModel;
        this.$onAnswerClick = function1;
        this.$onAnswer = function12;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            Modifier modifier = this.$modifier;
            Function2<Composer, Integer, Unit> function2 = this.$questionHeader;
            final Answer answer = this.$answer;
            final SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel = this.$questionModel;
            final Function1<AnswerClickData, Unit> function1 = this.$onAnswerClick;
            final Function1<Answer, Unit> function12 = this.$onAnswer;
            final Context context = this.$context;
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
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
            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            function2.invoke(composer, 0);
            float f = 8;
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer, 6);
            composer.startReplaceGroup(903574919);
            boolean z = answer instanceof Answer.MediaAnswer;
            if (z) {
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                FileAttachmentListKt.FileAttachmentList(mediaAnswer.getMediaItems(), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt$UploadFileQuestion$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$5$lambda$0;
                        invoke$lambda$5$lambda$0 = UploadFileQuestionKt$UploadFileQuestion$2.invoke$lambda$5$lambda$0(Function1.this, uploadFileQuestionModel, (Answer.MediaAnswer.MediaItem) obj);
                        return invoke$lambda$5$lambda$0;
                    }
                }, composer, 8);
                if (!mediaAnswer.getMediaItems().isEmpty()) {
                    SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer, 6);
                }
            }
            composer.endReplaceGroup();
            int size = z ? ((Answer.MediaAnswer) answer).getMediaItems().size() : 0;
            composer.startReplaceGroup(903602132);
            if (size < uploadFileQuestionModel.getMaxSelection()) {
                MediaPickerButtonKt.MediaPickerButton(uploadFileQuestionModel.getMaxSelection() - size, null, MediaType.All, uploadFileQuestionModel.getSupportedFileType(), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt$UploadFileQuestion$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$5$lambda$4;
                        invoke$lambda$5$lambda$4 = UploadFileQuestionKt$UploadFileQuestion$2.invoke$lambda$5$lambda$4(Answer.this, function12, context, (List) obj);
                        return invoke$lambda$5$lambda$4;
                    }
                }, new MediaPickerButtonCTAStyle.TextButton(StringResources_androidKt.stringResource(R.string.intercom_add, composer, 0)), null, ComposableLambdaKt.rememberComposableLambda(562613810, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt$UploadFileQuestion$2$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            AddFileButtonKt.AddFileButton(null, SurveyData.Step.Question.UploadFileQuestionModel.this.getMaxSelection() == 1 ? R.string.intercom_tickets_add_file : R.string.intercom_tickets_add_files, composer2, 0, 1);
                        }
                    }
                }, composer, 54), composer, (MediaPickerButtonCTAStyle.TextButton.$stable << 15) | 12587392, 66);
            }
            composer.endReplaceGroup();
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
    public static final Unit invoke$lambda$5$lambda$0(Function1 function1, SurveyData.Step.Question.UploadFileQuestionModel questionModel, Answer.MediaAnswer.MediaItem item) {
        Intrinsics.checkNotNullParameter(questionModel, "$questionModel");
        Intrinsics.checkNotNullParameter(item, "item");
        function1.invoke(new AnswerClickData(item, questionModel.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(Answer answer, Function1 onAnswer, Context context, List uris) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(uris, "uris");
        ArrayList arrayList = new ArrayList();
        Iterator it = uris.iterator();
        while (it.hasNext()) {
            MediaData.Media mediaData$default = URIExtensionsKt.getMediaData$default((Uri) it.next(), context, false, 2, null);
            if (mediaData$default != null) {
                arrayList.add(mediaData$default);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new Answer.MediaAnswer.MediaItem((MediaData.Media) it2.next()));
        }
        ArrayList arrayList4 = arrayList3;
        if (answer instanceof Answer.NoAnswer.InitialNoAnswer) {
            onAnswer.invoke(new Answer.MediaAnswer(arrayList4));
        } else {
            ArrayList arrayList5 = new ArrayList();
            Intrinsics.checkNotNull(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
            arrayList5.addAll(((Answer.MediaAnswer) answer).getMediaItems());
            arrayList5.addAll(arrayList4);
            onAnswer.invoke(new Answer.MediaAnswer(arrayList5));
        }
        return Unit.INSTANCE;
    }
}
