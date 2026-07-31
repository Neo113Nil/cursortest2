package io.intercom.android.sdk.survey.ui.questiontype.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ShortTextQuestion.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$ShortTextQuestionKt {
    public static final ComposableSingletons$ShortTextQuestionKt INSTANCE = new ComposableSingletons$ShortTextQuestionKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f381lambda1 = ComposableLambdaKt.composableLambdaInstance(-1979985443, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$ShortTextQuestionKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f382lambda2 = ComposableLambdaKt.composableLambdaInstance(-1983134889, false, ComposableSingletons$ShortTextQuestionKt$lambda2$1.INSTANCE);

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f383lambda3 = ComposableLambdaKt.composableLambdaInstance(85406650, false, ComposableSingletons$ShortTextQuestionKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f384lambda4 = ComposableLambdaKt.composableLambdaInstance(-172731134, false, ComposableSingletons$ShortTextQuestionKt$lambda4$1.INSTANCE);

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f385lambda5 = ComposableLambdaKt.composableLambdaInstance(34656827, false, ComposableSingletons$ShortTextQuestionKt$lambda5$1.INSTANCE);

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11846getLambda1$intercom_sdk_base_release() {
        return f381lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11847getLambda2$intercom_sdk_base_release() {
        return f382lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11848getLambda3$intercom_sdk_base_release() {
        return f383lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11849getLambda4$intercom_sdk_base_release() {
        return f384lambda4;
    }

    /* renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11850getLambda5$intercom_sdk_base_release() {
        return f385lambda5;
    }
}
