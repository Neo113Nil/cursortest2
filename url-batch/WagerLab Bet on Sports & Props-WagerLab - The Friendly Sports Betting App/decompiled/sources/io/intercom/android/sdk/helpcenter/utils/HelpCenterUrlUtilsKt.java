package io.intercom.android.sdk.helpcenter.utils;

import android.content.Context;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HelpCenterUrlUtils.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0001\u001a \u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u001a&\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0002¨\u0006\u0016"}, d2 = {"isHelpCenterArticleUrl", "", "url", "", "helpCenterUrls", "", "isHelpCenterCollectionUrl", "extractIdFromLastSegment", "lastSegment", "openArticle", "", "context", "Landroid/content/Context;", "articleId", "place", "shouldHideReactions", "openCollection", "collectionId", "openCollections", "collectionIds", "", "isHelpCenterUrl", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HelpCenterUrlUtilsKt {
    public static final void openArticle(Context context, String articleId, String place) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(place, "place");
        openArticle$default(context, articleId, place, false, 8, null);
    }

    public static final boolean isHelpCenterArticleUrl(String url, Set<String> helpCenterUrls) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(helpCenterUrls, "helpCenterUrls");
        return isHelpCenterUrl(url, helpCenterUrls) && StringsKt.contains$default((CharSequence) url, (CharSequence) "/articles/", false, 2, (Object) null);
    }

    public static final boolean isHelpCenterCollectionUrl(String url, Set<String> helpCenterUrls) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(helpCenterUrls, "helpCenterUrls");
        return isHelpCenterUrl(url, helpCenterUrls) && StringsKt.contains$default((CharSequence) url, (CharSequence) "/collections/", false, 2, (Object) null);
    }

    public static final String extractIdFromLastSegment(String lastSegment) {
        Intrinsics.checkNotNullParameter(lastSegment, "lastSegment");
        List split$default = StringsKt.split$default((CharSequence) lastSegment, new String[]{"-"}, false, 0, 6, (Object) null);
        if (!split$default.isEmpty()) {
            return (String) split$default.get(0);
        }
        return "";
    }

    public static /* synthetic */ void openArticle$default(Context context, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        openArticle(context, str, str2, z);
    }

    public static final void openArticle(Context context, String articleId, String place, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(place, "place");
        context.startActivity(IntercomArticleActivity.INSTANCE.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(articleId, place, false, z, 4, null)));
    }

    public static final void openCollection(Context context, String collectionId, String place) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(place, "place");
        IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollection(context, collectionId, place);
    }

    public static final void openCollections(Context context, List<String> collectionIds, String place) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
        Intrinsics.checkNotNullParameter(place, "place");
        if (collectionIds.size() == 1) {
            IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollection(context, (String) CollectionsKt.first((List) collectionIds), place);
        } else {
            IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(context, collectionIds, place);
        }
    }

    private static final boolean isHelpCenterUrl(String str, Set<String> set) {
        Set<String> set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            if (StringsKt.startsWith$default(str, (String) it.next(), false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }
}
