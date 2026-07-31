package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationHistoryCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationHistoryCardKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$ConversationHistoryCardKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ConversationHistoryCardKt$lambda2$1 INSTANCE = new ComposableSingletons$ConversationHistoryCardKt$lambda2$1();

    ComposableSingletons$ConversationHistoryCardKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            List createListBuilder = CollectionsKt.createListBuilder();
            int i2 = 0;
            while (i2 < 2) {
                boolean z = i2 == 0;
                Ticket ticket = new Ticket(null, null, "Export button not working", null, null, null, null, null, null, 0, null, null, null, null, 0L, 32763, null);
                LastParticipatingAdmin.Builder withAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
                Intrinsics.checkNotNullExpressionValue(withAvatar, "withAvatar(...)");
                createListBuilder.add(new Conversation("123", z, null, CollectionsKt.listOf(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, withAvatar, null, false, false, null, null, false, ticket, null, null, null, null, null, null, null, 1044436, null));
                i2++;
            }
            int i3 = 0;
            while (i3 < 2) {
                boolean z2 = i3 == 0;
                LastParticipatingAdmin.Builder withAvatar2 = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
                Intrinsics.checkNotNullExpressionValue(withAvatar2, "withAvatar(...)");
                createListBuilder.add(new Conversation("123", z2, null, CollectionsKt.listOf(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, withAvatar2, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048532, null));
                i3++;
            }
            Unit unit = Unit.INSTANCE;
            ConversationHistoryCardKt.ConversationHistoryCard(fillMaxWidth$default, "Your recent conversations", CollectionsKt.build(createListBuilder), new Function1() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationHistoryCardKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3;
                    invoke$lambda$3 = ComposableSingletons$ConversationHistoryCardKt$lambda2$1.invoke$lambda$3((Conversation) obj);
                    return invoke$lambda$3;
                }
            }, composer, 3638, 0);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(Conversation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
