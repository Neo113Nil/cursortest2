package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.models.AiAnswerInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AnswerInfoDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$AnswerInfoDialogKt {
    public static final ComposableSingletons$AnswerInfoDialogKt INSTANCE = new ComposableSingletons$AnswerInfoDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f178lambda1 = ComposableLambdaKt.composableLambdaInstance(125395865, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$AnswerInfoDialogKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                AnswerInfoDialogKt.AnswerInfoDialog(new AiAnswerInfo("This answer was auto generated using AI. There’s a chance it may not be fully correct."), true, null, null, composer, 48, 12);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f179lambda2 = ComposableLambdaKt.composableLambdaInstance(-1572197681, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$AnswerInfoDialogKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                AnswerInfoDialogKt.AnswerInfoDialog(new AiAnswerInfo("This answer was auto generated using AI. There’s a chance it may not be fully correct."), false, null, null, composer, 48, 12);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11242getLambda1$intercom_sdk_base_release() {
        return f178lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11243getLambda2$intercom_sdk_base_release() {
        return f179lambda2;
    }
}
