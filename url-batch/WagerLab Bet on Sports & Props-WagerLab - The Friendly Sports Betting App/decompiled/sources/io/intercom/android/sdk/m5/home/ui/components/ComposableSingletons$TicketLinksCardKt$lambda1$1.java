package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.TicketLink;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketLinksCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$TicketLinksCardKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$TicketLinksCardKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$TicketLinksCardKt$lambda1$1 INSTANCE = new ComposableSingletons$TicketLinksCardKt$lambda1$1();

    ComposableSingletons$TicketLinksCardKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            TicketLinksCardKt.TicketLinksCard(new HomeCards.HomeTicketLinksData("Create a ticket", HomeCardType.TICKET_LINKS, CollectionsKt.listOf((Object[]) new TicketLink[]{new TicketLink(1, "Billing issue", "", 0, TicketType.INSTANCE.getNULL()), new TicketLink(2, "Bug", "", 1, TicketType.INSTANCE.getNULL())})), new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$TicketLinksCardKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableSingletons$TicketLinksCardKt$lambda1$1.invoke$lambda$0((TicketType) obj);
                    return invoke$lambda$0;
                }
            }, composer, 56);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(TicketType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
