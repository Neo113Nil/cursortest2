package io.intercom.android.sdk.helpcenter.api;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterArticleSearchResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/helpcenter/api/HelpCenterArticleSearchResult;", "", "articleId", "", "title", "summary", "matchingSnippet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArticleId", "()Ljava/lang/String;", "getTitle", "getSummary", "getMatchingSnippet", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HelpCenterArticleSearchResult {
    public static final int $stable = 0;
    private final String articleId;
    private final String matchingSnippet;
    private final String summary;
    private final String title;

    public static /* synthetic */ HelpCenterArticleSearchResult copy$default(HelpCenterArticleSearchResult helpCenterArticleSearchResult, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helpCenterArticleSearchResult.articleId;
        }
        if ((i & 2) != 0) {
            str2 = helpCenterArticleSearchResult.title;
        }
        if ((i & 4) != 0) {
            str3 = helpCenterArticleSearchResult.summary;
        }
        if ((i & 8) != 0) {
            str4 = helpCenterArticleSearchResult.matchingSnippet;
        }
        return helpCenterArticleSearchResult.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getArticleId() {
        return this.articleId;
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
    public final String getMatchingSnippet() {
        return this.matchingSnippet;
    }

    public final HelpCenterArticleSearchResult copy(String articleId, String title, String summary, String matchingSnippet) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(matchingSnippet, "matchingSnippet");
        return new HelpCenterArticleSearchResult(articleId, title, summary, matchingSnippet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpCenterArticleSearchResult)) {
            return false;
        }
        HelpCenterArticleSearchResult helpCenterArticleSearchResult = (HelpCenterArticleSearchResult) other;
        return Intrinsics.areEqual(this.articleId, helpCenterArticleSearchResult.articleId) && Intrinsics.areEqual(this.title, helpCenterArticleSearchResult.title) && Intrinsics.areEqual(this.summary, helpCenterArticleSearchResult.summary) && Intrinsics.areEqual(this.matchingSnippet, helpCenterArticleSearchResult.matchingSnippet);
    }

    public int hashCode() {
        return (((((this.articleId.hashCode() * 31) + this.title.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.matchingSnippet.hashCode();
    }

    public String toString() {
        return "HelpCenterArticleSearchResult(articleId=" + this.articleId + ", title=" + this.title + ", summary=" + this.summary + ", matchingSnippet=" + this.matchingSnippet + ')';
    }

    public HelpCenterArticleSearchResult(String articleId, String title, String summary, String matchingSnippet) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(matchingSnippet, "matchingSnippet");
        this.articleId = articleId;
        this.title = title;
        this.summary = summary;
        this.matchingSnippet = matchingSnippet;
    }

    public /* synthetic */ HelpCenterArticleSearchResult(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getMatchingSnippet() {
        return this.matchingSnippet;
    }
}
