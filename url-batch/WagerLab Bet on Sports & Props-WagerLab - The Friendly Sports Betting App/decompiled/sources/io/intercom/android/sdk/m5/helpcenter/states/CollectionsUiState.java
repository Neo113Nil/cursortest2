package io.intercom.android.sdk.m5.helpcenter.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionsUiState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState;", "", "Initial", "Loading", "Error", "Content", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Content;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Error;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Initial;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface CollectionsUiState {

    /* compiled from: CollectionsUiState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Initial;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Initial implements CollectionsUiState {
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
            return 1088616516;
        }

        public String toString() {
            return "Initial";
        }

        private Initial() {
        }
    }

    /* compiled from: CollectionsUiState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Loading;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading implements CollectionsUiState {
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
            return -523075012;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: CollectionsUiState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Error;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "<init>", "(Lio/intercom/android/sdk/m5/components/ErrorState;)V", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements CollectionsUiState {
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

    /* compiled from: CollectionsUiState.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0000J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState$Content;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState;", "collections", "", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow;", "<init>", "(Ljava/util/List;)V", "getCollections", "()Ljava/util/List;", "hasSendMessageRow", "", "copyWithSingleSendMessageRow", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "copyWithoutSendMessageRow", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content implements CollectionsUiState {
        public static final int $stable = 8;
        private final List<CollectionsRow> collections;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = content.collections;
            }
            return content.copy(list);
        }

        public final List<CollectionsRow> component1() {
            return this.collections;
        }

        public final Content copy(List<? extends CollectionsRow> collections) {
            Intrinsics.checkNotNullParameter(collections, "collections");
            return new Content(collections);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Content) && Intrinsics.areEqual(this.collections, ((Content) other).collections);
        }

        public int hashCode() {
            return this.collections.hashCode();
        }

        public String toString() {
            return "Content(collections=" + this.collections + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content(List<? extends CollectionsRow> collections) {
            Intrinsics.checkNotNullParameter(collections, "collections");
            this.collections = collections;
        }

        public final List<CollectionsRow> getCollections() {
            return this.collections;
        }

        public final boolean hasSendMessageRow() {
            List<CollectionsRow> list = this.collections;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((CollectionsRow) it.next()) instanceof CollectionsRow.SendMessageRow) {
                    return true;
                }
            }
            return false;
        }

        public final Content copyWithSingleSendMessageRow(ArticleViewState.TeamPresenceState teamPresenceState) {
            Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
            if (hasSendMessageRow()) {
                List<CollectionsRow> list = this.collections;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!(((CollectionsRow) obj) instanceof CollectionsRow.SendMessageRow)) {
                        arrayList.add(obj);
                    }
                }
                return copy(CollectionsKt.plus((Collection<? extends CollectionsRow.SendMessageRow>) arrayList, new CollectionsRow.SendMessageRow(teamPresenceState)));
            }
            return copy(CollectionsKt.plus((Collection<? extends CollectionsRow.SendMessageRow>) this.collections, new CollectionsRow.SendMessageRow(teamPresenceState)));
        }

        public final Content copyWithoutSendMessageRow() {
            List<CollectionsRow> list = this.collections;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((CollectionsRow) obj) instanceof CollectionsRow.SendMessageRow)) {
                    arrayList.add(obj);
                }
            }
            return copy(arrayList);
        }
    }
}
