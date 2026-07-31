package io.intercom.android.sdk.m5.notification;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: InAppNotificationCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$InAppNotificationCardKt {
    public static final ComposableSingletons$InAppNotificationCardKt INSTANCE = new ComposableSingletons$InAppNotificationCardKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f336lambda1 = ComposableLambdaKt.composableLambdaInstance(-690804227, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$InAppNotificationCardKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                InAppNotificationCardKt.InAppNotificationCard(new Conversation(null, false, CollectionsKt.listOf(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), CollectionsKt.listOf(new Part.Builder().withSummary("Hello There")), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048563, null), null, composer, 8, 2);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f337lambda2 = ComposableLambdaKt.composableLambdaInstance(779369617, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$InAppNotificationCardKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                InAppNotificationCardKt.InAppNotificationCard(new Conversation(null, false, CollectionsKt.listOf(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), CollectionsKt.listOf(new Part.Builder().withSummary("Hello There")), null, null, null, false, false, null, null, false, new Ticket(null, null, "Feature request", null, null, null, new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, null, false, 0L, 28, null), null, null, 0, null, null, null, null, 0L, 32699, null), null, null, null, null, null, null, null, 1044467, null), null, composer, 8, 2);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11655getLambda1$intercom_sdk_base_release() {
        return f336lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11656getLambda2$intercom_sdk_base_release() {
        return f337lambda2;
    }
}
