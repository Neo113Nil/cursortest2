package io.branch.coroutines;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import io.branch.data.InstallReferrerResult;
import io.branch.referral.BranchLogger;
import io.branch.referral.Defines;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InstallReferrers.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r\u001a\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\"\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r2\u0006\u0010\u0013\u001a\u00020\u0005H\u0002\u001a\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0001H\u0002\u001a\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"actualTimestamp", "", "installReferrer", "isCt", "fetchLatestInstallReferrer", "Lio/branch/data/InstallReferrerResult;", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGooglePlayStoreReferrerDetails", "getHuaweiAppGalleryReferrerDetails", "getLatestInstallTimeStamp", "allReferrers", "", "getLatestValidReferrerStore", "getMetaInstallReferrerDetails", "getSamsungGalaxyStoreReferrerDetails", "getXiaomiGetAppsReferrerDetails", "handleMetaInstallReferrer", "latestReferrer", "queryMetaInstallReferrers", "fbAppId", "queryProvider", "provider", "Branch-SDK_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstallReferrersKt {
    private static final String actualTimestamp = "actual_timestamp";
    private static final String installReferrer = "install_referrer";
    private static final String isCt = "is_ct";

    public static final Object getGooglePlayStoreReferrerDetails(Context context, Continuation<? super InstallReferrerResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new InstallReferrersKt$getGooglePlayStoreReferrerDetails$2(context, null), continuation);
    }

    public static final Object getHuaweiAppGalleryReferrerDetails(Context context, Continuation<? super InstallReferrerResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new InstallReferrersKt$getHuaweiAppGalleryReferrerDetails$2(context, null), continuation);
    }

    public static final Object getSamsungGalaxyStoreReferrerDetails(Context context, Continuation<? super InstallReferrerResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new InstallReferrersKt$getSamsungGalaxyStoreReferrerDetails$2(context, null), continuation);
    }

    public static final Object getXiaomiGetAppsReferrerDetails(Context context, Continuation<? super InstallReferrerResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new InstallReferrersKt$getXiaomiGetAppsReferrerDetails$2(context, null), continuation);
    }

    public static final Object getMetaInstallReferrerDetails(Context context, Continuation<? super InstallReferrerResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new InstallReferrersKt$getMetaInstallReferrerDetails$2(context, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstallReferrerResult queryMetaInstallReferrers(Context context, String str) {
        return getLatestInstallTimeStamp(CollectionsKt.mutableListOf(queryProvider(context, "content://com.facebook.katana.provider.InstallReferrerProvider/" + str), queryProvider(context, "content://com.instagram.contentprovider.InstallReferrerProvider/" + str), queryProvider(context, "content://com.facebook.lite.provider.InstallReferrerProvider/" + str)));
    }

    private static final InstallReferrerResult queryProvider(Context context, String str) {
        Cursor query = context.getContentResolver().query(Uri.parse(str), new String[]{installReferrer, isCt, actualTimestamp}, null, null, null);
        if (query == null) {
            return null;
        }
        Cursor cursor = query;
        try {
            Cursor cursor2 = cursor;
            if (!cursor2.moveToFirst()) {
                BranchLogger.d("getMetaInstallReferrerDetails - cursor is empty or null for provider " + str);
                CloseableKt.closeFinally(cursor, null);
                return null;
            }
            int columnIndex = cursor2.getColumnIndex(actualTimestamp);
            int columnIndex2 = cursor2.getColumnIndex(isCt);
            int columnIndex3 = cursor2.getColumnIndex(installReferrer);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                long j = cursor2.getLong(columnIndex);
                boolean z = cursor2.getInt(columnIndex2) == 1;
                String string = cursor2.getString(columnIndex3);
                try {
                    String decode = URLDecoder.decode(string, "UTF-8");
                    Intrinsics.checkNotNullExpressionValue(decode, "decode(installReferrerString, \"UTF-8\")");
                    String substringAfter = StringsKt.substringAfter(decode, "utm_content=", "");
                    if (substringAfter.length() == 0) {
                        BranchLogger.w("getMetaInstallReferrerDetails - utm_content is empty for provider " + str);
                        CloseableKt.closeFinally(cursor, null);
                        return null;
                    }
                    BranchLogger.i("getMetaInstallReferrerDetails - Got Meta Install Referrer as " + (z ? "click-through" : "view-through") + " from provider " + str + ": " + string);
                    try {
                        InstallReferrerResult installReferrerResult = new InstallReferrerResult(Defines.Jsonkey.Meta_Install_Referrer.getKey(), new JSONObject(substringAfter).getLong("t"), string, j, null, null, z);
                        CloseableKt.closeFinally(cursor, null);
                        return installReferrerResult;
                    } catch (JSONException e) {
                        BranchLogger.w("getMetaInstallReferrerDetails - JSONException in queryProvider: " + e);
                        CloseableKt.closeFinally(cursor, null);
                        return null;
                    }
                } catch (IllegalArgumentException e2) {
                    BranchLogger.w("getMetaInstallReferrerDetails - Error decoding URL: " + e2);
                    CloseableKt.closeFinally(cursor, null);
                    return null;
                }
            }
            BranchLogger.w("getMetaInstallReferrerDetails - Required column not found in cursor for provider " + str);
            CloseableKt.closeFinally(cursor, null);
            return null;
        } finally {
        }
    }

    public static final Object fetchLatestInstallReferrer(Context context, Continuation<? super InstallReferrerResult> continuation) {
        return SupervisorKt.supervisorScope(new InstallReferrersKt$fetchLatestInstallReferrer$2(context, null), continuation);
    }

    public static final InstallReferrerResult getLatestValidReferrerStore(List<InstallReferrerResult> allReferrers) {
        Intrinsics.checkNotNullParameter(allReferrers, "allReferrers");
        InstallReferrerResult latestInstallTimeStamp = getLatestInstallTimeStamp(allReferrers);
        List filterNotNull = CollectionsKt.filterNotNull(allReferrers);
        if ((filterNotNull instanceof Collection) && filterNotNull.isEmpty()) {
            return latestInstallTimeStamp;
        }
        Iterator it = filterNotNull.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((InstallReferrerResult) it.next()).getAppStore(), Defines.Jsonkey.Meta_Install_Referrer.getKey())) {
                Intrinsics.checkNotNull(latestInstallTimeStamp);
                return handleMetaInstallReferrer(allReferrers, latestInstallTimeStamp);
            }
        }
        return latestInstallTimeStamp;
    }

    public static final InstallReferrerResult getLatestInstallTimeStamp(List<InstallReferrerResult> allReferrers) {
        Object obj;
        Intrinsics.checkNotNullParameter(allReferrers, "allReferrers");
        Iterator it = CollectionsKt.filterNotNull(allReferrers).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long installBeginTimestampSeconds = ((InstallReferrerResult) next).getInstallBeginTimestampSeconds();
                do {
                    Object next2 = it.next();
                    long installBeginTimestampSeconds2 = ((InstallReferrerResult) next2).getInstallBeginTimestampSeconds();
                    if (installBeginTimestampSeconds < installBeginTimestampSeconds2) {
                        next = next2;
                        installBeginTimestampSeconds = installBeginTimestampSeconds2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (InstallReferrerResult) obj;
    }

    private static final InstallReferrerResult handleMetaInstallReferrer(List<InstallReferrerResult> list, InstallReferrerResult installReferrerResult) {
        Object obj;
        Object obj2;
        Object obj3;
        List<InstallReferrerResult> list2 = list;
        Iterator it = CollectionsKt.filterNotNull(list2).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.areEqual(((InstallReferrerResult) obj2).getAppStore(), Defines.Jsonkey.Meta_Install_Referrer.getKey())) {
                break;
            }
        }
        InstallReferrerResult installReferrerResult2 = (InstallReferrerResult) obj2;
        Intrinsics.checkNotNull(installReferrerResult2);
        if (installReferrerResult2.isClickThrough()) {
            return (Intrinsics.areEqual(installReferrerResult.getAppStore(), Defines.Jsonkey.Google_Play_Store.getKey()) && installReferrerResult.getReferrerClickTimestampSeconds() == installReferrerResult2.getReferrerClickTimestampSeconds()) ? installReferrerResult2 : installReferrerResult;
        }
        Iterator it2 = CollectionsKt.filterNotNull(list2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it2.next();
            if (Intrinsics.areEqual(((InstallReferrerResult) obj3).getAppStore(), Defines.Jsonkey.Google_Play_Store.getKey())) {
                break;
            }
        }
        InstallReferrerResult installReferrerResult3 = (InstallReferrerResult) obj3;
        if (installReferrerResult3 != null && installReferrerResult3.getReferrerClickTimestampSeconds() == 0) {
            return installReferrerResult2;
        }
        List filterNotNull = CollectionsKt.filterNotNull(list2);
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : filterNotNull) {
            if (!Intrinsics.areEqual(((InstallReferrerResult) obj4).getAppStore(), Defines.Jsonkey.Meta_Install_Referrer.getKey())) {
                arrayList.add(obj4);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            obj = it3.next();
            if (it3.hasNext()) {
                long installBeginTimestampSeconds = ((InstallReferrerResult) obj).getInstallBeginTimestampSeconds();
                do {
                    Object next = it3.next();
                    long installBeginTimestampSeconds2 = ((InstallReferrerResult) next).getInstallBeginTimestampSeconds();
                    if (installBeginTimestampSeconds < installBeginTimestampSeconds2) {
                        obj = next;
                        installBeginTimestampSeconds = installBeginTimestampSeconds2;
                    }
                } while (it3.hasNext());
            }
        }
        return (InstallReferrerResult) obj;
    }
}
