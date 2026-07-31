package io.intercom.android.sdk;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Intercom.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/IntercomContent;", "", "<init>", "()V", "HelpCenterCollections", "Article", "Carousel", "Survey", "Conversation", "Ticket", "Lio/intercom/android/sdk/IntercomContent$Article;", "Lio/intercom/android/sdk/IntercomContent$Carousel;", "Lio/intercom/android/sdk/IntercomContent$Conversation;", "Lio/intercom/android/sdk/IntercomContent$HelpCenterCollections;", "Lio/intercom/android/sdk/IntercomContent$Survey;", "Lio/intercom/android/sdk/IntercomContent$Ticket;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class IntercomContent {
    public static final int $stable = 0;

    public /* synthetic */ IntercomContent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: Intercom.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0004H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/IntercomContent$HelpCenterCollections;", "Lio/intercom/android/sdk/IntercomContent;", "ids", "", "", "<init>", "(Ljava/util/List;)V", "getIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HelpCenterCollections extends IntercomContent {
        public static final int $stable = 8;
        private final List<String> ids;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HelpCenterCollections copy$default(HelpCenterCollections helpCenterCollections, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = helpCenterCollections.ids;
            }
            return helpCenterCollections.copy(list);
        }

        public final List<String> component1() {
            return this.ids;
        }

        public final HelpCenterCollections copy(List<String> ids) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            return new HelpCenterCollections(ids);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HelpCenterCollections) && Intrinsics.areEqual(this.ids, ((HelpCenterCollections) other).ids);
        }

        public int hashCode() {
            return this.ids.hashCode();
        }

        public String toString() {
            return "HelpCenterCollections(ids=" + this.ids + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpCenterCollections(List<String> ids) {
            super(null);
            Intrinsics.checkNotNullParameter(ids, "ids");
            this.ids = ids;
        }

        public final List<String> getIds() {
            return this.ids;
        }
    }

    private IntercomContent() {
    }

    /* compiled from: Intercom.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/IntercomContent$Article;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Article extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        public static /* synthetic */ Article copy$default(Article article, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = article.id;
            }
            return article.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Article copy(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new Article(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Article) && Intrinsics.areEqual(this.id, ((Article) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "Article(id=" + this.id + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Article(String id) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: Intercom.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/IntercomContent$Carousel;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Carousel extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        public static /* synthetic */ Carousel copy$default(Carousel carousel, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = carousel.id;
            }
            return carousel.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Carousel copy(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new Carousel(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Carousel) && Intrinsics.areEqual(this.id, ((Carousel) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "Carousel(id=" + this.id + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Carousel(String id) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: Intercom.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/IntercomContent$Survey;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Survey extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        public static /* synthetic */ Survey copy$default(Survey survey, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = survey.id;
            }
            return survey.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Survey copy(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new Survey(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Survey) && Intrinsics.areEqual(this.id, ((Survey) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "Survey(id=" + this.id + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Survey(String id) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: Intercom.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/IntercomContent$Conversation;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Conversation extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conversation.id;
            }
            return conversation.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Conversation copy(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new Conversation(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Conversation) && Intrinsics.areEqual(this.id, ((Conversation) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "Conversation(id=" + this.id + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Conversation(String id) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: Intercom.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/IntercomContent$Ticket;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Ticket extends IntercomContent {
        public static final int $stable = 0;
        private final String id;

        public static /* synthetic */ Ticket copy$default(Ticket ticket, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ticket.id;
            }
            return ticket.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final Ticket copy(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new Ticket(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ticket) && Intrinsics.areEqual(this.id, ((Ticket) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "Ticket(id=" + this.id + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ticket(String id) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final String getId() {
            return this.id;
        }
    }
}
