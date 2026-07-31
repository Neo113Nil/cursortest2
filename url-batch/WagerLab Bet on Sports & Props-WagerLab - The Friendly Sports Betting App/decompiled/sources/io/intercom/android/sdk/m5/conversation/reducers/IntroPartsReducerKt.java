package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.BotIntro;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntroPartsReducer.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001H\u0002¨\u0006\f"}, d2 = {"reduceIntroParts", "", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "clientState", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "botIntro", "Lio/intercom/android/sdk/models/BotIntro;", "timeProvider", "Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "reduceBotIntroParts", "introParts", "Lio/intercom/android/sdk/models/Part;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntroPartsReducerKt {
    public static final List<ContentRow> reduceIntroParts(ConversationClientState clientState, BotIntro botIntro, TimeProvider timeProvider) {
        Collection emptyList;
        List<Part.Builder> parts;
        Object obj;
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        Intrinsics.checkNotNullParameter(botIntro, "botIntro");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        List<List<Block.Builder>> blocks = botIntro.getBlocks();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(blocks, 10));
        Iterator<T> it = blocks.iterator();
        while (it.hasNext()) {
            Part build = new Part.Builder().withBlocks((List) it.next()).withParticipantIsAdmin(true).withCreatedAt(timeProvider.currentTimeMillis()).build();
            build.setParticipant(botIntro.getBuiltParticipant());
            arrayList.add(build);
        }
        Collection collection = (List) arrayList;
        OpenMessengerResponse openMessengerResponse = clientState.getOpenMessengerResponse();
        OpenMessengerResponse.NewConversationData newConversationData = openMessengerResponse != null ? openMessengerResponse.getNewConversationData() : null;
        if (newConversationData == null || (parts = newConversationData.getParts()) == null) {
            emptyList = CollectionsKt.emptyList();
        } else {
            List<Part.Builder> list = parts;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                Part build2 = ((Part.Builder) it2.next()).build();
                Iterator<T> it3 = newConversationData.getParticipants().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (Intrinsics.areEqual(((Participant.Builder) obj).build().getId(), build2.getParticipantId())) {
                        break;
                    }
                }
                Participant.Builder builder = (Participant.Builder) obj;
                Participant build3 = builder != null ? builder.build() : null;
                if (build3 != null) {
                    build2.setParticipant(build3);
                }
                arrayList2.add(build2);
            }
            emptyList = (List) arrayList2;
        }
        Collection collection2 = emptyList;
        if (!collection2.isEmpty()) {
            collection = collection2;
        }
        ArrayList arrayList3 = (List) collection;
        if (!arrayList3.isEmpty()) {
            return reduceBotIntroParts(clientState, arrayList3);
        }
        return CollectionsKt.emptyList();
    }

    private static final List<ContentRow> reduceBotIntroParts(ConversationClientState conversationClientState, List<? extends Part> list) {
        List createListBuilder = CollectionsKt.createListBuilder();
        boolean isEmpty = conversationClientState.getPendingMessages().isEmpty();
        List<? extends Part> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper((Part) obj, i == CollectionsKt.getLastIndex(list) && isEmpty, true, null, null, 24, null), ConversationPartsReducerKt.getGroupingPosition(list, i), null, false, false, 16, null));
            i = i2;
        }
        createListBuilder.addAll(arrayList);
        return CollectionsKt.build(createListBuilder);
    }
}
