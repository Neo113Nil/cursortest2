package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTicketContentScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-5$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$CreateTicketContentScreenKt$lambda5$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CreateTicketContentScreenKt$lambda5$1 INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt$lambda5$1();

    ComposableSingletons$CreateTicketContentScreenKt$lambda5$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        List list;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            list = CreateTicketContentScreenKt.questions;
            List take = CollectionsKt.take(list, 4);
            ((QuestionState) CollectionsKt.first(take)).setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_email_error, null, 2, null));
            Unit unit = Unit.INSTANCE;
            CreateTicketContentScreenKt.CreateTicketContentScreen(null, new CreateTicketViewModel.CreateTicketFormUiState.Content("All form attribute types", take, false, false), new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-5$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit2;
                    unit2 = Unit.INSTANCE;
                    return unit2;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-5$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit2;
                    unit2 = Unit.INSTANCE;
                    return unit2;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-5$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3;
                    invoke$lambda$3 = ComposableSingletons$CreateTicketContentScreenKt$lambda5$1.invoke$lambda$3((String) obj);
                    return invoke$lambda$3;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-5$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$4;
                    invoke$lambda$4 = ComposableSingletons$CreateTicketContentScreenKt$lambda5$1.invoke$lambda$4((AnswerClickData) obj);
                    return invoke$lambda$4;
                }
            }, composer, 224704, 1);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4(AnswerClickData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
