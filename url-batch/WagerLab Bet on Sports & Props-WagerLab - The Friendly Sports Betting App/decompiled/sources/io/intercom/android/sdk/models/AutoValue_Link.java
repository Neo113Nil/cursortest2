package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;

/* loaded from: classes8.dex */
final class AutoValue_Link extends Link {
    private final List<Block> blocks;
    private final Card card;
    private final long createdAt;
    private final String id;
    private final ReactionReply reactionReply;
    private final long updatedAt;

    AutoValue_Link(String str, Card card, List<Block> list, ReactionReply reactionReply, long j, long j2) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        if (card == null) {
            throw new NullPointerException("Null card");
        }
        this.card = card;
        if (list == null) {
            throw new NullPointerException("Null blocks");
        }
        this.blocks = list;
        if (reactionReply == null) {
            throw new NullPointerException("Null reactionReply");
        }
        this.reactionReply = reactionReply;
        this.createdAt = j;
        this.updatedAt = j2;
    }

    @Override // io.intercom.android.sdk.models.Link
    public String getId() {
        return this.id;
    }

    @Override // io.intercom.android.sdk.models.Link
    public Card getCard() {
        return this.card;
    }

    @Override // io.intercom.android.sdk.models.Link
    public List<Block> getBlocks() {
        return this.blocks;
    }

    @Override // io.intercom.android.sdk.models.Link
    public ReactionReply getReactionReply() {
        return this.reactionReply;
    }

    @Override // io.intercom.android.sdk.models.Link
    public long getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.intercom.android.sdk.models.Link
    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public String toString() {
        return "Link{id=" + this.id + ", card=" + this.card + ", blocks=" + this.blocks + ", reactionReply=" + this.reactionReply + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Link) {
            Link link = (Link) obj;
            if (this.id.equals(link.getId()) && this.card.equals(link.getCard()) && this.blocks.equals(link.getBlocks()) && this.reactionReply.equals(link.getReactionReply()) && this.createdAt == link.getCreatedAt() && this.updatedAt == link.getUpdatedAt()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.card.hashCode()) * 1000003) ^ this.blocks.hashCode()) * 1000003) ^ this.reactionReply.hashCode()) * 1000003;
        long j = this.createdAt;
        long j2 = this.updatedAt;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }
}
