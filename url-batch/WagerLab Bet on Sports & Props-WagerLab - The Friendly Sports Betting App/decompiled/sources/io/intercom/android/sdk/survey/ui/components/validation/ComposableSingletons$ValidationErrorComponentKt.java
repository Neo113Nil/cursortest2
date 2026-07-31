package io.intercom.android.sdk.survey.ui.components.validation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ValidationErrorComponent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$ValidationErrorComponentKt {
    public static final ComposableSingletons$ValidationErrorComponentKt INSTANCE = new ComposableSingletons$ValidationErrorComponentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f347lambda1 = ComposableLambdaKt.composableLambdaInstance(39859331, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.validation.ComposableSingletons$ValidationErrorComponentKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ValidationErrorComponentKt.m11762ValidationErrorComponentFNF3uiM(null, new ValidationError.ValidationStringError(R.string.intercom_inbox_error_state_title, null, 2, null), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12162getError0d7_KjU(), composer, 64, 1);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11761getLambda1$intercom_sdk_base_release() {
        return f347lambda1;
    }
}
