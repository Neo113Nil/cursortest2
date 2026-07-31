package com.ogury.ad;

import android.content.Context;
import com.ogury.ad.async.Single;
import com.ogury.ad.internal.b9;
import com.ogury.ad.internal.c9;
import com.ogury.ad.internal.d9;
import com.ogury.ad.internal.e9;
import com.ogury.ad.internal.ne;
import com.ogury.ad.internal.pf;
import com.ogury.ad.internal.q1;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ?\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JS\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/ogury/ad/OguryBidTokenProvider;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/ogury/ad/OguryBidTokenListener;", "oguryBidTokenListener", "", "getBidToken", "(Landroid/content/Context;Lcom/ogury/ad/OguryBidTokenListener;)V", "", "campaignId", "creativeId", "dspCreativeId", "dspAwsRegion", "(Landroid/content/Context;Lcom/ogury/ad/OguryBidTokenListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/ogury/ad/internal/ne;", "profigHandler", "Lcom/ogury/ad/internal/pf;", "getProfigAndSyncIfNeeded", "(Lcom/ogury/ad/internal/ne;)Lcom/ogury/ad/internal/pf;", "", "isProfigObsolete", "(Lcom/ogury/ad/internal/ne;)Z", "Lcom/ogury/ad/internal/q1;", "bidderTokenBodyBuilder", "getBidderTokenInternal$sdk_ads_prodRelease", "(Landroid/content/Context;Lcom/ogury/ad/OguryBidTokenListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ogury/ad/internal/ne;Lcom/ogury/ad/internal/q1;)V", "getBidderTokenInternal", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OguryBidTokenProvider {

    @NotNull
    public static final OguryBidTokenProvider INSTANCE = new OguryBidTokenProvider();

    private OguryBidTokenProvider() {
    }

    public static final void getBidToken(@NotNull Context context, @NotNull OguryBidTokenListener oguryBidTokenListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(oguryBidTokenListener, "oguryBidTokenListener");
        getBidderTokenInternal$sdk_ads_prodRelease$default(INSTANCE, context, oguryBidTokenListener, "", "", "", "", null, null, 192, null);
    }

    public static /* synthetic */ void getBidderTokenInternal$sdk_ads_prodRelease$default(OguryBidTokenProvider oguryBidTokenProvider, Context context, OguryBidTokenListener oguryBidTokenListener, String str, String str2, String str3, String str4, ne neVar, q1 q1Var, int i, Object obj) {
        oguryBidTokenProvider.getBidderTokenInternal$sdk_ads_prodRelease(context, oguryBidTokenListener, str, str2, str3, str4, (i & 64) != 0 ? ne.g.a(context) : neVar, (i & 128) != 0 ? new q1(context) : q1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pf getProfigAndSyncIfNeeded(ne profigHandler) {
        pf b = profigHandler.b();
        if (!isProfigObsolete(profigHandler)) {
            return b;
        }
        Logger.INSTANCE.d(LogTag.INTERNAL, SourceTag.ADS, "Configuration need to be synced");
        return profigHandler.a(true);
    }

    private final boolean isProfigObsolete(ne profigHandler) {
        return !profigHandler.b().a || profigHandler.a();
    }

    public final void getBidderTokenInternal$sdk_ads_prodRelease(@NotNull Context context, @NotNull OguryBidTokenListener oguryBidTokenListener, @NotNull String campaignId, @NotNull String creativeId, @NotNull String dspCreativeId, @NotNull String dspAwsRegion, @NotNull ne profigHandler, @NotNull q1 bidderTokenBodyBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(oguryBidTokenListener, "oguryBidTokenListener");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(dspCreativeId, "dspCreativeId");
        Intrinsics.checkNotNullParameter(dspAwsRegion, "dspAwsRegion");
        Intrinsics.checkNotNullParameter(profigHandler, "profigHandler");
        Intrinsics.checkNotNullParameter(bidderTokenBodyBuilder, "bidderTokenBodyBuilder");
        Single.INSTANCE.fromCallable(new b9(profigHandler)).doInBackground(new c9(bidderTokenBodyBuilder, campaignId, creativeId, dspCreativeId, dspAwsRegion, oguryBidTokenListener)).doOnError(new d9(bidderTokenBodyBuilder, campaignId, creativeId, dspCreativeId, dspAwsRegion, oguryBidTokenListener)).subscribe(new e9(oguryBidTokenListener));
    }

    private final void getBidToken(Context context, OguryBidTokenListener oguryBidTokenListener, String campaignId, String creativeId, String dspCreativeId, String dspAwsRegion) {
        getBidderTokenInternal$sdk_ads_prodRelease$default(this, context, oguryBidTokenListener, campaignId, creativeId, dspCreativeId, dspAwsRegion, null, null, 192, null);
    }
}
