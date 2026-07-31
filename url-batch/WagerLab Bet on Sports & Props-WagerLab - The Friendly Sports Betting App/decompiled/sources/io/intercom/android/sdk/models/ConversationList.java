package io.intercom.android.sdk.models;

import io.intercom.android.sdk.utilities.commons.CollectionUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public abstract class ConversationList {
    public abstract List<Conversation> getConversations();

    public abstract EmptyState getEmptyState();

    public abstract Set<String> getUnreadConversationIds();

    public abstract int getUnreadConversationsCount();

    public abstract boolean hasMorePages();

    public static ConversationList create(List<Conversation> list, Set<String> set, EmptyState emptyState, boolean z, int i) {
        return new AutoValue_ConversationList(list, set, i, emptyState, z);
    }

    public static final class Builder {
        List<Conversation> conversations;
        EmptyState empty_state;
        boolean more_pages_available;
        int total_count = 0;
        List<String> unread_conversation_ids;

        public ConversationList build() {
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.conversations));
            List<Conversation> list = this.conversations;
            if (list != null) {
                arrayList.addAll(list);
            }
            HashSet hashSet = new HashSet(CollectionUtils.capacityFor(this.unread_conversation_ids));
            List<String> list2 = this.unread_conversation_ids;
            if (list2 != null) {
                for (String str : list2) {
                    if (str != null) {
                        hashSet.add(str);
                    }
                }
            }
            EmptyState emptyState = this.empty_state;
            if (emptyState == null) {
                emptyState = EmptyState.INSTANCE.getNULL();
            }
            return ConversationList.create(arrayList, hashSet, emptyState, this.more_pages_available, this.total_count);
        }

        public Builder withConversations(List<Conversation> list) {
            this.conversations = list;
            return this;
        }

        public Builder withMorePagesAvailable(boolean z) {
            this.more_pages_available = z;
            return this;
        }

        public Builder withEmptyState(EmptyState emptyState) {
            this.empty_state = emptyState;
            return this;
        }

        public Builder withUnreadConversationsCount(int i) {
            this.total_count = i;
            return this;
        }

        public Builder withUnreadConversationIds(List<String> list) {
            this.unread_conversation_ids = list;
            return this;
        }
    }
}
