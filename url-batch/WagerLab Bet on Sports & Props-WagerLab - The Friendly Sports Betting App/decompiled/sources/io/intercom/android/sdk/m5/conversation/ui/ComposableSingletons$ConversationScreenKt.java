package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$ConversationScreenKt {
    public static final ComposableSingletons$ConversationScreenKt INSTANCE = new ComposableSingletons$ConversationScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<SnackbarData, Composer, Integer, Unit> f177lambda1 = ComposableLambdaKt.composableLambdaInstance(-394269711, false, new Function3<SnackbarData, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.ComposableSingletons$ConversationScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(SnackbarData it, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 14) == 0) {
                i2 = i | (composer.changed(it) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) != 18 || !composer.getSkipping()) {
                SnackbarKt.m3395SnackbarsDKtq54(it, null, false, IntercomTheme.INSTANCE.getShapes(composer, IntercomTheme.$stable).getSmall(), 0L, 0L, ColorExtensionsKt.m12240getAccessibleColorOnDarkBackground8_81llA(IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12147getAction0d7_KjU()), 0L, 0L, composer, i2 & 14, 438);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function3<SnackbarData, Composer, Integer, Unit> m11216getLambda1$intercom_sdk_base_release() {
        return f177lambda1;
    }
}
