package io.intercom.android.sdk.m5.helpcenter.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionDetailsUiState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState;", "", "Initial", "Loading", "Error", "Content", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Content;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Error;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Initial;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface CollectionDetailsUiState {

    /* compiled from: CollectionDetailsUiState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Initial;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Initial implements CollectionDetailsUiState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initial)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -545067083;
        }

        public String toString() {
            return "Initial";
        }

        private Initial() {
        }
    }

    /* compiled from: CollectionDetailsUiState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Loading;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading implements CollectionDetailsUiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2138208685;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: CollectionDetailsUiState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Error;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "<init>", "(Lio/intercom/android/sdk/m5/components/ErrorState;)V", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements CollectionDetailsUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, int i, Object obj) {
            if ((i & 1) != 0) {
                errorState = error.errorState;
            }
            return error.copy(errorState);
        }

        /* renamed from: component1, reason: from getter */
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final Error copy(ErrorState errorState) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            return new Error(errorState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.errorState, ((Error) other).errorState);
        }

        public int hashCode() {
            return this.errorState.hashCode();
        }

        public String toString() {
            return "Error(errorState=" + this.errorState + ')';
        }

        public Error(ErrorState errorState) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            this.errorState = errorState;
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }
    }

    /* compiled from: CollectionDetailsUiState.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0000J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003JQ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tHÇ\u0001J\u0013\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010'H×\u0003J\t\u0010(\u001a\u00020\u0007H×\u0001J\t\u0010)\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Content;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState;", "id", "", "title", "summary", "articlesCount", "", "authors", "", "Lio/intercom/android/sdk/helpcenter/sections/Author;", "collectionDetailsRows", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsRow;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getTitle", "getSummary", "getArticlesCount", "()I", "getAuthors", "()Ljava/util/List;", "getCollectionDetailsRows", "hasSendMessageRow", "", "copyWithSingleSendMessageRow", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "copyWithoutSendMessageRow", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content implements CollectionDetailsUiState {
        public static final int $stable = 8;
        private final int articlesCount;
        private final List<Author> authors;
        private final List<CollectionDetailsRow> collectionDetailsRows;
        private final String id;
        private final String summary;
        private final String title;

        public static /* synthetic */ Content copy$default(Content content, String str, String str2, String str3, int i, List list, List list2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = content.id;
            }
            if ((i2 & 2) != 0) {
                str2 = content.title;
            }
            if ((i2 & 4) != 0) {
                str3 = content.summary;
            }
            if ((i2 & 8) != 0) {
                i = content.articlesCount;
            }
            if ((i2 & 16) != 0) {
                list = content.authors;
            }
            if ((i2 & 32) != 0) {
                list2 = content.collectionDetailsRows;
            }
            List list3 = list;
            List list4 = list2;
            return content.copy(str, str2, str3, i, list3, list4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        /* renamed from: component4, reason: from getter */
        public final int getArticlesCount() {
            return this.articlesCount;
        }

        public final List<Author> component5() {
            return this.authors;
        }

        public final List<CollectionDetailsRow> component6() {
            return this.collectionDetailsRows;
        }

        public final Content copy(String id, String title, String summary, int articlesCount, List<Author> authors, List<? extends CollectionDetailsRow> collectionDetailsRows) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(authors, "authors");
            Intrinsics.checkNotNullParameter(collectionDetailsRows, "collectionDetailsRows");
            return new Content(id, title, summary, articlesCount, authors, collectionDetailsRows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.id, content.id) && Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.summary, content.summary) && this.articlesCount == content.articlesCount && Intrinsics.areEqual(this.authors, content.authors) && Intrinsics.areEqual(this.collectionDetailsRows, content.collectionDetailsRows);
        }

        public int hashCode() {
            return (((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.summary.hashCode()) * 31) + Integer.hashCode(this.articlesCount)) * 31) + this.authors.hashCode()) * 31) + this.collectionDetailsRows.hashCode();
        }

        public String toString() {
            return "Content(id=" + this.id + ", title=" + this.title + ", summary=" + this.summary + ", articlesCount=" + this.articlesCount + ", authors=" + this.authors + ", collectionDetailsRows=" + this.collectionDetailsRows + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content(String id, String title, String summary, int i, List<Author> authors, List<? extends CollectionDetailsRow> collectionDetailsRows) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(summary, "summary");
            Intrinsics.checkNotNullParameter(authors, "authors");
            Intrinsics.checkNotNullParameter(collectionDetailsRows, "collectionDetailsRows");
            this.id = id;
            this.title = title;
            this.summary = summary;
            this.articlesCount = i;
            this.authors = authors;
            this.collectionDetailsRows = collectionDetailsRows;
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final int getArticlesCount() {
            return this.articlesCount;
        }

        public final List<Author> getAuthors() {
            return this.authors;
        }

        public final List<CollectionDetailsRow> getCollectionDetailsRows() {
            return this.collectionDetailsRows;
        }

        public final boolean hasSendMessageRow() {
            List<CollectionDetailsRow> list = this.collectionDetailsRows;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((CollectionDetailsRow) it.next()) instanceof CollectionDetailsRow.SendMessageRow) {
                    return true;
                }
            }
            return false;
        }

        public final Content copyWithSingleSendMessageRow(ArticleViewState.TeamPresenceState teamPresenceState) {
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            if (hasSendMessageRow()) {
                List<CollectionDetailsRow> list = this.collectionDetailsRows;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!(((CollectionDetailsRow) obj) instanceof CollectionDetailsRow.SendMessageRow)) {
                        arrayList.add(obj);
                    }
                }
                return copy$default(this, null, null, null, 0, null, CollectionsKt.plus((Collection<? extends CollectionDetailsRow.SendMessageRow>) arrayList, new CollectionDetailsRow.SendMessageRow(teamPresenceState)), 31, null);
            }
            return copy$default(this, null, null, null, 0, null, CollectionsKt.plus((Collection<? extends CollectionDetailsRow.SendMessageRow>) this.collectionDetailsRows, new CollectionDetailsRow.SendMessageRow(teamPresenceState)), 31, null);
        }

        public final Content copyWithoutSendMessageRow() {
            List<CollectionDetailsRow> list = this.collectionDetailsRows;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionDetailsRow) obj) instanceof CollectionDetailsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy$default(this, null, null, null, 0, null, arrayList, 31, null);
        }
    }
}
