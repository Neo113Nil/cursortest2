package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.Link;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: ExternalLinkCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$ExternalLinkCardKt {
    public static final ComposableSingletons$ExternalLinkCardKt INSTANCE = new ComposableSingletons$ExternalLinkCardKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f298lambda1 = ComposableLambdaKt.composableLambdaInstance(19664413, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$ExternalLinkCardKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ExternalLinkCardKt.ExternalLinkCard(new HomeCards.HomeExternalLinkData("External Links", HomeCardType.EXTERNAL_LINKS, CollectionsKt.listOf((Object[]) new Link[]{new Link("Ask the community", "https://stackoverflow.com/"), new Link("Knowledge base", "https://stackoverflow.com/")})), composer, 8);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11543getLambda1$intercom_sdk_base_release() {
        return f298lambda1;
    }
}
