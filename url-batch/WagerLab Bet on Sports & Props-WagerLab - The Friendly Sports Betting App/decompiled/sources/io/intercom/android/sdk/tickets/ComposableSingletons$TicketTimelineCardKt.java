package io.intercom.android.sdk.tickets;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: TicketTimelineCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$TicketTimelineCardKt {
    public static final ComposableSingletons$TicketTimelineCardKt INSTANCE = new ComposableSingletons$TicketTimelineCardKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f404lambda1 = ComposableLambdaKt.composableLambdaInstance(-762343961, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketTimelineCardKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                TicketTimelineCardKt.TicketTimelineCard(TicketTimelineCardState.m11898copyww6aTOc$default(TicketTimelineCardKt.getSampleTicketTimelineCardState(), null, null, null, TicketStatus.WaitingOnCustomer.getColor(), CollectionsKt.listOf((Object[]) new TicketTimelineCardState.ProgressSection[]{new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false)}), "Waiting on you", null, 71, null), BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null), composer, 8, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f405lambda2 = ComposableLambdaKt.composableLambdaInstance(-519340954, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketTimelineCardKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                TicketTimelineCardKt.TicketTimelineCard(TicketTimelineCardKt.getSampleTicketTimelineCardState(), BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null), composer, 8, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f406lambda3 = ComposableLambdaKt.composableLambdaInstance(1948582297, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketTimelineCardKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                TicketTimelineCardKt.TicketTimelineCard(TicketTimelineCardState.m11898copyww6aTOc$default(TicketTimelineCardKt.getSampleTicketTimelineCardState(), null, null, null, TicketStatus.Resolved.getColor(), CollectionsKt.listOf((Object[]) new TicketTimelineCardState.ProgressSection[]{new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(true, false)}), "Resolved", null, 71, null), BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null), composer, 8, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f407lambda4 = ComposableLambdaKt.composableLambdaInstance(1847313119, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketTimelineCardKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                TicketTimelineCardKt.TicketTimelineCard(TicketTimelineCardState.m11898copyww6aTOc$default(TicketTimelineCardKt.getSampleTicketTimelineCardState(), null, null, null, TicketStatus.InProgress.getColor(), CollectionsKt.listOf((Object[]) new TicketTimelineCardState.ProgressSection[]{new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false)}), null, null, 103, null), BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null), composer, 8, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11882getLambda1$intercom_sdk_base_release() {
        return f404lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11883getLambda2$intercom_sdk_base_release() {
        return f405lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11884getLambda3$intercom_sdk_base_release() {
        return f406lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11885getLambda4$intercom_sdk_base_release() {
        return f407lambda4;
    }
}
