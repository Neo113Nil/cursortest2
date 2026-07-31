package io.intercom.android.sdk.survey.ui.questiontype.choice;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtherOption.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$OtherOptionKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$OtherOptionKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$OtherOptionKt$lambda1$1 INSTANCE = new ComposableSingletons$OtherOptionKt$lambda1$1();

    ComposableSingletons$OtherOptionKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            OtherOptionKt.m11794OtherOptionYCJL08c(true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), "none", new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$OtherOptionKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$OtherOptionKt$lambda-1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1;
                    invoke$lambda$1 = ComposableSingletons$OtherOptionKt$lambda1$1.invoke$lambda$1((String) obj);
                    return invoke$lambda$1;
                }
            }, 0L, 0.0f, 0L, null, 0L, composer, 28038, 992);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
