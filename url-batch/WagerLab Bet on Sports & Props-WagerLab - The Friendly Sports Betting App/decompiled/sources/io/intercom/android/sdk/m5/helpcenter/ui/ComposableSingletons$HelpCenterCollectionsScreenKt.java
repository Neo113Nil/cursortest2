package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterCollectionsScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$HelpCenterCollectionsScreenKt {
    public static final ComposableSingletons$HelpCenterCollectionsScreenKt INSTANCE = new ComposableSingletons$HelpCenterCollectionsScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f270lambda1 = ComposableLambdaKt.composableLambdaInstance(-1194363873, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionsScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(null, composer, 0, 1);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f271lambda2 = ComposableLambdaKt.composableLambdaInstance(493330652, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionsScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 14) == 0) {
                i |= composer.changed(item) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                HelpCenterEmptyScreenKt.HelpCenterEmptyScreen(LazyItemScope.fillParentMaxHeight$default(item, Modifier.INSTANCE, 0.0f, 1, null), composer, 0, 0);
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m11475getLambda1$intercom_sdk_base_release() {
        return f270lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m11476getLambda2$intercom_sdk_base_release() {
        return f271lambda2;
    }
}
