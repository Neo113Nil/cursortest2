package io.intercom.android.sdk.tickets;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.exifinterface.media.ExifInterface;
import io.ably.lib.transport.Defaults;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Ticket;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecentTicketsCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.ComposableSingletons$RecentTicketsCardKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$RecentTicketsCardKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$RecentTicketsCardKt$lambda1$1 INSTANCE = new ComposableSingletons$RecentTicketsCardKt$lambda1$1();

    ComposableSingletons$RecentTicketsCardKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            RecentTicketsCardKt.RecentTicketsCard(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "Recent tickets", CollectionsKt.listOf((Object[]) new Ticket[]{new Ticket("1", "1200", "This is a ticket title", null, null, null, new Ticket.Status("Waiting on you", "waiting_on_customer", null, false, 0L, 28, null), null, null, 0, null, null, null, false, 0L, 24504, null), new Ticket(ExifInterface.GPS_MEASUREMENT_2D, "1201", "Bug", null, null, null, new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, null, false, 0L, 28, null), null, null, 0, null, null, null, true, 0L, 24504, null), new Ticket(ExifInterface.GPS_MEASUREMENT_3D, "1202", "Feature Request", null, null, null, new Ticket.Status("In progress", "in_progress", null, false, 0L, 28, null), null, null, 0, null, null, null, true, 0L, 24504, null), new Ticket(Defaults.ABLY_PROTOCOL_VERSION, "1204", "Unresolvable", null, null, null, new Ticket.Status("Resolved", "resolved", null, false, 0L, 28, null), null, null, 0, null, null, null, false, 0L, 24504, null)}), new Function1() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$RecentTicketsCardKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableSingletons$RecentTicketsCardKt$lambda1$1.invoke$lambda$0((String) obj);
                    return invoke$lambda$0;
                }
            }, composer, 3638, 0);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
