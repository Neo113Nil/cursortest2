package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.m5.components.ErrorState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InboxErrorScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$InboxErrorScreenKt {
    public static final ComposableSingletons$InboxErrorScreenKt INSTANCE = new ComposableSingletons$InboxErrorScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f326lambda1 = ComposableLambdaKt.composableLambdaInstance(-2040574336, false, ComposableSingletons$InboxErrorScreenKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f327lambda2 = ComposableLambdaKt.composableLambdaInstance(-1022040758, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxErrorScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                InboxErrorScreenKt.InboxErrorScreen(new ErrorState.WithoutCTA(0, 0, null, 7, null), null, composer, 0, 2);
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11595getLambda1$intercom_sdk_base_release() {
        return f326lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11596getLambda2$intercom_sdk_base_release() {
        return f327lambda2;
    }
}
