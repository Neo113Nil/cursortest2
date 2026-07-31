package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageList.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageListKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$MessageListKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$MessageListKt$lambda3$1 INSTANCE = new ComposableSingletons$MessageListKt$lambda3$1();

    ComposableSingletons$MessageListKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.add(new ContentRow.SpecialNoticeRow("Our response times are slower than usual. We’re working hard to get to your message"));
            MessageListKt.MessageList(null, CollectionsKt.build(createListBuilder), null, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageListKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1;
                    invoke$lambda$1 = ComposableSingletons$MessageListKt$lambda3$1.invoke$lambda$1((ReplyOption) obj);
                    return invoke$lambda$1;
                }
            }, null, null, null, null, null, false, null, null, false, null, composer, 24640, 0, 32749);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(ReplyOption it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
