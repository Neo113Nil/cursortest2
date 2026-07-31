package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTicketContentScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$CreateTicketContentScreenKt {
    public static final ComposableSingletons$CreateTicketContentScreenKt INSTANCE = new ComposableSingletons$CreateTicketContentScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f410lambda1 = ComposableLambdaKt.composableLambdaInstance(-1125060472, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketContentScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_cancel, composer, 0), null, 0L, null, 0L, null, FontWeight.INSTANCE.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04Point5(), composer, 1572864, 0, 131006);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f411lambda2 = ComposableLambdaKt.composableLambdaInstance(458285887, false, ComposableSingletons$CreateTicketContentScreenKt$lambda2$1.INSTANCE);

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f412lambda3 = ComposableLambdaKt.composableLambdaInstance(-426521688, false, ComposableSingletons$CreateTicketContentScreenKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f413lambda4 = ComposableLambdaKt.composableLambdaInstance(125945436, false, ComposableSingletons$CreateTicketContentScreenKt$lambda4$1.INSTANCE);

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f414lambda5 = ComposableLambdaKt.composableLambdaInstance(-259524439, false, ComposableSingletons$CreateTicketContentScreenKt$lambda5$1.INSTANCE);

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11908getLambda1$intercom_sdk_base_release() {
        return f410lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11909getLambda2$intercom_sdk_base_release() {
        return f411lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11910getLambda3$intercom_sdk_base_release() {
        return f412lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11911getLambda4$intercom_sdk_base_release() {
        return f413lambda4;
    }

    /* renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11912getLambda5$intercom_sdk_base_release() {
        return f414lambda5;
    }
}
