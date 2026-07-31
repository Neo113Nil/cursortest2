package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FailedMessage;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageList.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class MessageListKt$MessageList$14$1$renderMessageRow$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ContentRow $item;
    final /* synthetic */ Function1<TicketType, Unit> $onCreateTicket;
    final /* synthetic */ Function1<PendingMessage.FailedImageUploadData, Unit> $onRetryImageClicked;
    final /* synthetic */ Function1<Part, Unit> $onRetryMessageClicked;
    final /* synthetic */ Function1<AttributeData, Unit> $onSubmitAttribute;

    /* JADX WARN: Multi-variable type inference failed */
    MessageListKt$MessageList$14$1$renderMessageRow$1(ContentRow contentRow, Function1<? super AttributeData, Unit> function1, Function1<? super PendingMessage.FailedImageUploadData, Unit> function12, Function1<? super TicketType, Unit> function13, Function1<? super Part, Unit> function14) {
        this.$item = contentRow;
        this.$onSubmitAttribute = function1;
        this.$onRetryImageClicked = function12;
        this.$onCreateTicket = function13;
        this.$onRetryMessageClicked = function14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            FailedMessage failedMessage = null;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Part part = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getPart();
            String hourOfDay = TimeFormatterExtKt.toHourOfDay(((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getPart().getCreatedAt());
            List<String> failedAttributeIdentifiers = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getFailedAttributeIdentifiers();
            List<String> loadingAttributeIdentifiers = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().getLoadingAttributeIdentifiers();
            GroupingPosition groupingPosition = ((ContentRow.BubbleMessageRow) this.$item).getGroupingPosition();
            boolean isAdminOrAltParticipant = ((ContentRow.BubbleMessageRow) this.$item).getPartWrapper().isAdminOrAltParticipant();
            PendingMessage.FailedImageUploadData failedImageUploadData = ((ContentRow.BubbleMessageRow) this.$item).getFailedImageUploadData();
            composer.startReplaceGroup(-1874254196);
            if (((ContentRow.BubbleMessageRow) this.$item).isFailed()) {
                String stringResource = StringResources_androidKt.stringResource(R.string.intercom_failed_delivery, composer, 0);
                final Function1<Part, Unit> function1 = this.$onRetryMessageClicked;
                final ContentRow contentRow = this.$item;
                failedMessage = new FailedMessage(stringResource, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$14$1$renderMessageRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$0;
                        invoke$lambda$0 = MessageListKt$MessageList$14$1$renderMessageRow$1.invoke$lambda$0(Function1.this, contentRow);
                        return invoke$lambda$0;
                    }
                });
            }
            composer.endReplaceGroup();
            BubbleMessageRowKt.BubbleMessageRow(part, groupingPosition, isAdminOrAltParticipant, fillMaxWidth$default, hourOfDay, this.$onSubmitAttribute, failedAttributeIdentifiers, loadingAttributeIdentifiers, this.$onRetryImageClicked, failedImageUploadData, failedMessage, this.$onCreateTicket, composer, 18877448, 0, 0);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Function1 function1, ContentRow item) {
        Intrinsics.checkNotNullParameter(item, "$item");
        function1.invoke(((ContentRow.BubbleMessageRow) item).getPartWrapper().getPart());
        return Unit.INSTANCE;
    }
}
