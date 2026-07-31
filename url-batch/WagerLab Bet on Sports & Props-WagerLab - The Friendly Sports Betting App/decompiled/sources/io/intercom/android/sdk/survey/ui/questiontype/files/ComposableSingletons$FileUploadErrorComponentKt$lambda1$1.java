package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: FileUploadErrorComponent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileUploadErrorComponentKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$FileUploadErrorComponentKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$FileUploadErrorComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$FileUploadErrorComponentKt$lambda1$1();

    ComposableSingletons$FileUploadErrorComponentKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            FileUploadErrorComponentKt.FileUploadErrorComponent("Error", new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(CollectionsKt.listOf(new StringProvider.StringRes(R.string.intercom_upload_failed, null, 2, null))), new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileUploadErrorComponentKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileUploadErrorComponentKt$lambda-1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 3462);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
