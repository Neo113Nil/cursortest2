package io.intercom.android.sdk.survey.ui.questiontype.files;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.media3.common.MimeTypes;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileAttachmentList.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileAttachmentListKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$FileAttachmentListKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$FileAttachmentListKt$lambda1$1 INSTANCE = new ComposableSingletons$FileAttachmentListKt$lambda1$1();

    ComposableSingletons$FileAttachmentListKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            Uri EMPTY = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            FileAttachmentListKt.FileAttachmentList(CollectionsKt.listOf(new Answer.MediaAnswer.MediaItem(new MediaData.Media.Image(MimeTypes.IMAGE_PNG, 0, 0, 0L, "google.png", EMPTY, null, 64, null))), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$FileAttachmentListKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableSingletons$FileAttachmentListKt$lambda1$1.invoke$lambda$0((Answer.MediaAnswer.MediaItem) obj);
                    return invoke$lambda$0;
                }
            }, composer, 48);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Answer.MediaAnswer.MediaItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
