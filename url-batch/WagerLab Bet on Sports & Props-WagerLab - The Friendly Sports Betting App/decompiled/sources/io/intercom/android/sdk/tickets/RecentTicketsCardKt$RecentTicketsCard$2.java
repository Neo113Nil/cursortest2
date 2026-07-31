package io.intercom.android.sdk.tickets;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import io.intercom.android.sdk.tickets.list.ui.TicketRowKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecentTicketsCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class RecentTicketsCardKt$RecentTicketsCard$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<String, Unit> $onClick;
    final /* synthetic */ List<Ticket> $tickets;

    /* JADX WARN: Multi-variable type inference failed */
    RecentTicketsCardKt$RecentTicketsCard$2(List<Ticket> list, Function1<? super String, Unit> function1) {
        this.$tickets = list;
        this.$onClick = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            List<Ticket> list = this.$tickets;
            final Function1<String, Unit> function1 = this.$onClick;
            for (final Ticket ticket : list) {
                Modifier m303clickableoSLSa3U$default = ClickableKt.m303clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.tickets.RecentTicketsCardKt$RecentTicketsCard$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = RecentTicketsCardKt$RecentTicketsCard$2.invoke$lambda$1$lambda$0(Function1.this, ticket);
                        return invoke$lambda$1$lambda$0;
                    }
                }, 15, null);
                PaddingValues m831PaddingValuesYgX7TsA = PaddingKt.m831PaddingValuesYgX7TsA(Dp.m8401constructorimpl(20), Dp.m8401constructorimpl(8));
                TicketRowData reduceTicketRowData = TicketRowReducerKt.reduceTicketRowData(ticket);
                Boolean isRead = ticket.isRead();
                TicketRowKt.TicketRow(m303clickableoSLSa3U$default, reduceTicketRowData, m831PaddingValuesYgX7TsA, (isRead == null || isRead.booleanValue()) ? false : true, composer, 0, 0);
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, Ticket it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        function1.invoke(it.getId());
        return Unit.INSTANCE;
    }
}
