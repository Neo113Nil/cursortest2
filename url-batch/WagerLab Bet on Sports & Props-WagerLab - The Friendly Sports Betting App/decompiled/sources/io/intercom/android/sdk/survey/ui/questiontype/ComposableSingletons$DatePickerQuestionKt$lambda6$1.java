package io.intercom.android.sdk.survey.ui.questiontype;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DatePickerQuestion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.ComposableSingletons$DatePickerQuestionKt$lambda-6$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$DatePickerQuestionKt$lambda6$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$DatePickerQuestionKt$lambda6$1 INSTANCE = new ComposableSingletons$DatePickerQuestionKt$lambda6$1();

    ComposableSingletons$DatePickerQuestionKt$lambda6$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            DatePickerQuestionKt.DatePickerQuestion(null, new SurveyData.Step.Question.DatePickerQuestionModel("123", CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Choose date")), true), null, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.ComposableSingletons$DatePickerQuestionKt$lambda-6$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableSingletons$DatePickerQuestionKt$lambda6$1.invoke$lambda$0((Answer) obj);
                    return invoke$lambda$0;
                }
            }, null, composer, 3072, 21);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Answer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
