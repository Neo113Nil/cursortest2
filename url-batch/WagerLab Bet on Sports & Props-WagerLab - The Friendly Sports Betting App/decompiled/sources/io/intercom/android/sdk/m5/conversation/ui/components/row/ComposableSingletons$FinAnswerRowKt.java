package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FinAnswerRow.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$FinAnswerRowKt {
    public static final ComposableSingletons$FinAnswerRowKt INSTANCE = new ComposableSingletons$FinAnswerRowKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f246lambda1 = ComposableLambdaKt.composableLambdaInstance(418249962, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$FinAnswerRowKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_info, composer, 0), StringResources_androidKt.stringResource(R.string.intercom_ai_answer_information, composer, 0), SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(14)), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), composer, 392, 0);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f247lambda2 = ComposableLambdaKt.composableLambdaInstance(-534585843, false, ComposableSingletons$FinAnswerRowKt$lambda2$1.INSTANCE);

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11407getLambda1$intercom_sdk_base_release() {
        return f246lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11408getLambda2$intercom_sdk_base_release() {
        return f247lambda2;
    }
}
