package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.font.FontWeight;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ui.components.QuestionHeaderComponentKt;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.ErrorMessageLayoutKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadFileQuestionHeader.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"UploadFileQuestionHeader", "", "questionState", "Lio/intercom/android/sdk/survey/QuestionState;", "questionFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "questionFontSize", "Landroidx/compose/ui/unit/TextUnit;", "UploadFileQuestionHeader-INMd_9Y", "(Lio/intercom/android/sdk/survey/QuestionState;Landroidx/compose/ui/text/font/FontWeight;JLandroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UploadFileQuestionHeaderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UploadFileQuestionHeader_INMd_9Y$lambda$2(QuestionState questionState, FontWeight questionFontWeight, long j, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(questionState, "$questionState");
        Intrinsics.checkNotNullParameter(questionFontWeight, "$questionFontWeight");
        m11830UploadFileQuestionHeaderINMd_9Y(questionState, questionFontWeight, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r0 != null) goto L21;
     */
    /* renamed from: UploadFileQuestionHeader-INMd_9Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11830UploadFileQuestionHeaderINMd_9Y(final QuestionState questionState, final FontWeight questionFontWeight, final long j, Composer composer, final int i) {
        final List<StringProvider.StringRes> emptyList;
        List<Answer.MediaAnswer.MediaItem> mediaItems;
        Intrinsics.checkNotNullParameter(questionState, "questionState");
        Intrinsics.checkNotNullParameter(questionFontWeight, "questionFontWeight");
        Composer startRestartGroup = composer.startRestartGroup(43160084);
        Answer answer = questionState.getAnswer();
        Object obj = null;
        Answer.MediaAnswer mediaAnswer = answer instanceof Answer.MediaAnswer ? (Answer.MediaAnswer) answer : null;
        if (mediaAnswer != null && (mediaItems = mediaAnswer.getMediaItems()) != null) {
            Iterator<T> it = mediaItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((Answer.MediaAnswer.MediaItem) next).getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                    obj = next;
                    break;
                }
            }
            Answer.MediaAnswer.MediaItem mediaItem = (Answer.MediaAnswer.MediaItem) obj;
            if (mediaItem != null) {
                Answer.MediaAnswer.FileUploadStatus uploadStatus = mediaItem.getUploadStatus();
                Intrinsics.checkNotNull(uploadStatus, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error");
                emptyList = ((Answer.MediaAnswer.FileUploadStatus.Error) uploadStatus).getError().getErrorMessages();
            }
        }
        emptyList = CollectionsKt.emptyList();
        int i2 = i << 9;
        QuestionHeaderComponentKt.m11754QuestionHeadern1tc1qA(questionState.getQuestionModel().getTitle(), questionState.getQuestionModel().getDescription(), questionState.getQuestionModel().getIsRequired(), questionState.getValidationError(), questionFontWeight, j, ComposableLambdaKt.rememberComposableLambda(1052404026, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt$UploadFileQuestionHeader$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    ErrorMessageLayoutKt.ErrorMessageLayout(null, emptyList, composer2, 64, 1);
                }
            }
        }, startRestartGroup, 54), null, startRestartGroup, (StringProvider.$stable << 3) | 1572872 | (57344 & i2) | (i2 & 458752), 128);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit UploadFileQuestionHeader_INMd_9Y$lambda$2;
                    UploadFileQuestionHeader_INMd_9Y$lambda$2 = UploadFileQuestionHeaderKt.UploadFileQuestionHeader_INMd_9Y$lambda$2(QuestionState.this, questionFontWeight, j, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return UploadFileQuestionHeader_INMd_9Y$lambda$2;
                }
            });
        }
    }
}
