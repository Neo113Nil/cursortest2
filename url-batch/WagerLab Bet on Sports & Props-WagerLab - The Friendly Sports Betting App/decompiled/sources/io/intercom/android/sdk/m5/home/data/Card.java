package io.intercom.android.sdk.m5.home.data;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeV2Response.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001f\u001a\u00020 H×\u0001J\t\u0010!\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/m5/home/data/Card;", "", "action", "Lio/intercom/android/sdk/m5/home/data/Action;", "cardTitle", "", "spaceItems", "", "Lio/intercom/android/sdk/m5/home/data/SpaceItem;", "suggestedArticles", "Lio/intercom/android/sdk/m5/home/data/SuggestedArticle;", "type", "<init>", "(Lio/intercom/android/sdk/m5/home/data/Action;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAction", "()Lio/intercom/android/sdk/m5/home/data/Action;", "getCardTitle", "()Ljava/lang/String;", "getSpaceItems", "()Ljava/util/List;", "getSuggestedArticles", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Card {
    public static final int $stable = 8;

    @SerializedName("action")
    private final Action action;

    @SerializedName("card_title")
    private final String cardTitle;

    @SerializedName("space_items")
    private final List<SpaceItem> spaceItems;

    @SerializedName("suggested_articles")
    private final List<SuggestedArticle> suggestedArticles;

    @SerializedName("type")
    private final String type;

    public static /* synthetic */ Card copy$default(Card card, Action action, String str, List list, List list2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            action = card.action;
        }
        if ((i & 2) != 0) {
            str = card.cardTitle;
        }
        if ((i & 4) != 0) {
            list = card.spaceItems;
        }
        if ((i & 8) != 0) {
            list2 = card.suggestedArticles;
        }
        if ((i & 16) != 0) {
            str2 = card.type;
        }
        String str3 = str2;
        List list3 = list;
        return card.copy(action, str, list3, list2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final List<SpaceItem> component3() {
        return this.spaceItems;
    }

    public final List<SuggestedArticle> component4() {
        return this.suggestedArticles;
    }

    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Card copy(Action action, String cardTitle, List<SpaceItem> spaceItems, List<SuggestedArticle> suggestedArticles, String type) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(spaceItems, "spaceItems");
        Intrinsics.checkNotNullParameter(suggestedArticles, "suggestedArticles");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Card(action, cardTitle, spaceItems, suggestedArticles, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card)) {
            return false;
        }
        Card card = (Card) other;
        return Intrinsics.areEqual(this.action, card.action) && Intrinsics.areEqual(this.cardTitle, card.cardTitle) && Intrinsics.areEqual(this.spaceItems, card.spaceItems) && Intrinsics.areEqual(this.suggestedArticles, card.suggestedArticles) && Intrinsics.areEqual(this.type, card.type);
    }

    public int hashCode() {
        return (((((((this.action.hashCode() * 31) + this.cardTitle.hashCode()) * 31) + this.spaceItems.hashCode()) * 31) + this.suggestedArticles.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "Card(action=" + this.action + ", cardTitle=" + this.cardTitle + ", spaceItems=" + this.spaceItems + ", suggestedArticles=" + this.suggestedArticles + ", type=" + this.type + ')';
    }

    public Card(Action action, String cardTitle, List<SpaceItem> spaceItems, List<SuggestedArticle> suggestedArticles, String type) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(spaceItems, "spaceItems");
        Intrinsics.checkNotNullParameter(suggestedArticles, "suggestedArticles");
        Intrinsics.checkNotNullParameter(type, "type");
        this.action = action;
        this.cardTitle = cardTitle;
        this.spaceItems = spaceItems;
        this.suggestedArticles = suggestedArticles;
        this.type = type;
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final List<SpaceItem> getSpaceItems() {
        return this.spaceItems;
    }

    public final List<SuggestedArticle> getSuggestedArticles() {
        return this.suggestedArticles;
    }

    public final String getType() {
        return this.type;
    }
}
