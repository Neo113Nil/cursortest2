package com.ogury.ad;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.ogury.ad.async.Single;
import com.ogury.ad.common.OguryMediation;
import com.ogury.ad.internal.OguryListenerAdapter;
import com.ogury.ad.internal.bb;
import com.ogury.ad.internal.bj;
import com.ogury.ad.internal.c;
import com.ogury.ad.internal.ca;
import com.ogury.ad.internal.g;
import com.ogury.ad.internal.j6;
import com.ogury.ad.internal.ka;
import com.ogury.ad.internal.kh;
import com.ogury.ad.internal.la;
import com.ogury.ad.internal.le;
import com.ogury.ad.internal.ma;
import com.ogury.ad.internal.n8;
import com.ogury.ad.internal.o0;
import com.ogury.ad.internal.oa;
import com.ogury.ad.internal.p0;
import com.ogury.ad.internal.p8;
import com.ogury.ad.internal.rf;
import com.ogury.ad.internal.sf;
import com.ogury.ad.internal.t6;
import com.ogury.ad.internal.xa;
import com.ogury.ad.internal.ya;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010#J\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010$J-\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010)J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,J!\u0010/\u001a\u00020\u000b2\u0012\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040-\"\u00020\u0004¢\u0006\u0004\b/\u00100J3\u00103\u001a\u00020\u000b2\"\u00102\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e010-\"\n\u0012\u0006\b\u0001\u0012\u00020\u001e01H\u0007¢\u0006\u0004\b3\u00104J!\u00105\u001a\u00020\u000b2\u0012\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040-\"\u00020\u0004¢\u0006\u0004\b5\u00100J3\u00108\u001a\u00020\u000b2\"\u00107\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u000206010-\"\n\u0012\u0006\b\u0001\u0012\u00020601H\u0007¢\u0006\u0004\b8\u00104J\u0015\u00109\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b9\u0010$¨\u0006:"}, d2 = {"Lcom/ogury/ad/OguryThumbnailAd;", "Lcom/ogury/ad/internal/p8;", "Landroid/content/Context;", "context", "", "adUnitId", "Lcom/ogury/ad/common/OguryMediation;", "oguryMediation", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/ogury/ad/common/OguryMediation;)V", "campaignId", "", "setCampaignId", "(Ljava/lang/String;)V", "creativeId", "setCreativeId", "dspCreativeId", "setDspCreativeId", "dspAwsRegion", "setDspAwsRegion", "Lcom/ogury/ad/OguryThumbnailAdListener;", "thumbnailAdListener", "setListener", "(Lcom/ogury/ad/OguryThumbnailAdListener;)V", "", "maxWidth", "maxHeight", "load", "(II)V", "()V", "Landroid/app/Activity;", "activity", "leftMargin", "topMargin", "show", "(Landroid/app/Activity;II)V", "(Landroid/app/Activity;)V", "Lcom/ogury/ad/OguryThumbnailGravity;", "gravity", "xMargin", "yMargin", "(Landroid/app/Activity;Lcom/ogury/ad/OguryThumbnailGravity;II)V", "", "isLoaded", "()Z", "", "packages", "setWhiteListPackages", "([Ljava/lang/String;)V", "Ljava/lang/Class;", "activities", "setBlackListActivities", "([Ljava/lang/Class;)V", "setWhiteListFragmentPackages", "", "fragments", "setBlackListFragments", "logWhiteListedActivities", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OguryThumbnailAd implements p8 {
    public final oa a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OguryThumbnailAd(@NotNull Context context, @NotNull String adUnitId) {
        this(context, adUnitId, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    private final void setCampaignId(String campaignId) {
        oa oaVar = this.a;
        oaVar.getClass();
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        p0 p0Var = oaVar.c;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        p0Var.b.b = campaignId;
    }

    private final void setCreativeId(String creativeId) {
        oa oaVar = this.a;
        oaVar.getClass();
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        p0 p0Var = oaVar.c;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        p0Var.b.c = creativeId;
    }

    private final void setDspAwsRegion(String dspAwsRegion) {
        oa oaVar = this.a;
        oaVar.getClass();
        Intrinsics.checkNotNullParameter(dspAwsRegion, "dspAwsRegion");
        p0 p0Var = oaVar.c;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(dspAwsRegion, "dspAwsRegion");
        p0Var.b.e = dspAwsRegion;
    }

    private final void setDspCreativeId(String dspCreativeId) {
        oa oaVar = this.a;
        oaVar.getClass();
        Intrinsics.checkNotNullParameter(dspCreativeId, "dspCreativeId");
        p0 p0Var = oaVar.c;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(dspCreativeId, "dspCreativeId");
        p0Var.b.d = dspCreativeId;
    }

    public final boolean isLoaded() {
        o0 o0Var = this.a.k;
        return o0Var != null && o0Var.o;
    }

    public final void load(int maxWidth, int maxHeight) {
        IntegrationLogger.d(LogTag.CALLBACKS, SourceTag.ADS, "[Thumbnail] load() called with maxWidth: " + maxWidth + " maxHeight: " + maxHeight);
        this.a.a(maxWidth, maxHeight);
    }

    public final void logWhiteListedActivities(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        oa oaVar = this.a;
        oaVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        le leVar = bj.a;
        rf publisherActivityFilter = oaVar.e;
        sf publisherFragmentFilter = oaVar.f;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(publisherActivityFilter, "publisherActivityFilter");
        Intrinsics.checkNotNullParameter(publisherFragmentFilter, "publisherFragmentFilter");
        Application application = activity.getApplication();
        Intrinsics.checkNotNull(application);
        g gVar = new g(application);
        xa a = new ya(publisherActivityFilter, publisherFragmentFilter, kh.a, bj.a).a(activity, gVar, new t6(new j6(application, gVar, n8.a, false)));
        if (a instanceof ca) {
            bj.a(activity, ((ca) a).c);
        } else {
            IntegrationLogger.i(LogTag.INTERNAL, SourceTag.ADS, "Cannot log whitelisted activities when using fragment filter");
        }
    }

    @SafeVarargs
    public final void setBlackListActivities(@NotNull Class<? extends Activity>... activities) {
        Intrinsics.checkNotNullParameter(activities, "activities");
        oa oaVar = this.a;
        oaVar.getClass();
        Intrinsics.checkNotNullParameter(activities, "activities");
        rf rfVar = oaVar.e;
        List list = ArraysKt.toList(activities);
        rfVar.getClass();
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        rfVar.b = list;
    }

    @SafeVarargs
    public final void setBlackListFragments(@NotNull Class<? extends Object>... fragments) {
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        oa oaVar = this.a;
        oaVar.getClass();
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        sf sfVar = oaVar.f;
        List asList = ArraysKt.asList(fragments);
        sfVar.getClass();
        Intrinsics.checkNotNullParameter(asList, "<set-?>");
        sfVar.b = asList;
    }

    public final void setListener(@Nullable OguryThumbnailAdListener thumbnailAdListener) {
        LogTag logTag = LogTag.CALLBACKS;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.d(logTag, sourceTag, "[Thumbnail] setListener() called");
        oa oaVar = this.a;
        OguryListenerAdapter.Companion.getClass();
        Intrinsics.checkNotNullParameter(this, "ad");
        OguryListenerAdapter oguryListenerAdapter = thumbnailAdListener != null ? new OguryListenerAdapter(this, thumbnailAdListener) : null;
        oaVar.getClass();
        LogTag logTag2 = LogTag.INTERNAL;
        IntegrationLogger.d(logTag2, sourceTag, "[Thumbnail] Registering to ad listener");
        if (oguryListenerAdapter == null) {
            IntegrationLogger.d(logTag2, sourceTag, "[Thumbnail] Ad listener is null");
        }
        oaVar.i = oguryListenerAdapter;
        o0 o0Var = oaVar.k;
        if (o0Var == null) {
            return;
        }
        o0Var.t = oguryListenerAdapter;
    }

    public final void setWhiteListFragmentPackages(@NotNull String... packages) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        oa oaVar = this.a;
        oaVar.getClass();
        Intrinsics.checkNotNullParameter(packages, "packages");
        sf sfVar = oaVar.f;
        List asList = ArraysKt.asList(packages);
        sfVar.getClass();
        Intrinsics.checkNotNullParameter(asList, "<set-?>");
        sfVar.a = asList;
    }

    public final void setWhiteListPackages(@NotNull String... packages) {
        Intrinsics.checkNotNullParameter(packages, "packages");
        oa oaVar = this.a;
        oaVar.getClass();
        Intrinsics.checkNotNullParameter(packages, "packages");
        rf rfVar = oaVar.e;
        List list = ArraysKt.toList(packages);
        rfVar.getClass();
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        rfVar.a = list;
    }

    public final void show(@NotNull Activity activity, int leftMargin, int topMargin) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IntegrationLogger.d(LogTag.CALLBACKS, SourceTag.ADS, "[Thumbnail] show() called with activity: " + activity.getClass().getName() + " leftMargin: " + leftMargin + " topMargin: " + topMargin);
        this.a.a(activity, new bb(OguryThumbnailGravity.TOP_LEFT.getValue(), leftMargin, topMargin));
    }

    public /* synthetic */ OguryThumbnailAd(Context context, String str, OguryMediation oguryMediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? null : oguryMediation);
    }

    public OguryThumbnailAd(@NotNull Context context, @NotNull String adUnitId, @Nullable OguryMediation oguryMediation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.a = new oa(applicationContext, new c(adUnitId), oguryMediation);
    }

    public final void load() {
        IntegrationLogger.d(LogTag.CALLBACKS, SourceTag.ADS, "[Thumbnail] load() called");
        oa oaVar = this.a;
        oaVar.getClass();
        Single.INSTANCE.fromCallable(new ka(oaVar)).subscribe(new la(oaVar));
    }

    public final void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IntegrationLogger.d(LogTag.CALLBACKS, SourceTag.ADS, "[Thumbnail] show() called with activity: " + activity.getClass().getName());
        oa oaVar = this.a;
        oaVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Single.INSTANCE.fromCallable(new ka(oaVar)).subscribe(new ma(oaVar, activity));
    }

    public final void show(@NotNull Activity activity, @NotNull OguryThumbnailGravity gravity, int xMargin, int yMargin) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        IntegrationLogger.d(LogTag.CALLBACKS, SourceTag.ADS, "[Thumbnail] show() called with activity: " + activity.getClass().getName() + " gravity: " + gravity.ordinal() + " xMargin: " + xMargin + " yMargin: " + yMargin);
        this.a.a(activity, new bb(gravity.getValue(), xMargin, yMargin));
    }
}
