package com.ogury.ad;

import android.content.Context;
import com.ogury.ad.common.OguryMediation;
import com.ogury.ad.internal.OguryListenerAdapter;
import com.ogury.ad.internal.c;
import com.ogury.ad.internal.c4;
import com.ogury.ad.internal.g9;
import com.ogury.ad.internal.j4;
import com.ogury.ad.internal.o0;
import com.ogury.ad.internal.p0;
import com.ogury.ad.internal.p8;
import com.ogury.ad.internal.x;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\rJ\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\rJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/ogury/ad/OguryRewardedAd;", "Lcom/ogury/ad/internal/p8;", "Landroid/content/Context;", "context", "", "adUnitId", "Lcom/ogury/ad/common/OguryMediation;", "oguryMediation", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/ogury/ad/common/OguryMediation;)V", "campaignId", "", "setCampaignId", "(Ljava/lang/String;)V", "creativeId", "setCreativeId", "dspCreativeId", "setDspCreativeId", "dspAwsRegion", "setDspAwsRegion", "", "isLoaded", "()Z", "Lcom/ogury/ad/OguryRewardedAdListener;", "rewardedAdListener", "setListener", "(Lcom/ogury/ad/OguryRewardedAdListener;)V", "adMarkup", "load", "show", "()V", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OguryRewardedAd implements p8 {
    public final c4 a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OguryRewardedAd(@NotNull Context context, @NotNull String adUnitId) {
        this(context, adUnitId, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public static /* synthetic */ void load$default(OguryRewardedAd oguryRewardedAd, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        oguryRewardedAd.load(str);
    }

    private final void setCampaignId(String campaignId) {
        c4 c4Var = this.a;
        c4Var.getClass();
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        c4Var.a.b = campaignId;
    }

    private final void setCreativeId(String creativeId) {
        c4 c4Var = this.a;
        c4Var.getClass();
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        c4Var.a.c = creativeId;
    }

    private final void setDspAwsRegion(String dspAwsRegion) {
        c4 c4Var = this.a;
        c4Var.getClass();
        Intrinsics.checkNotNullParameter(dspAwsRegion, "dspAwsRegion");
        c4Var.a.e = dspAwsRegion;
    }

    private final void setDspCreativeId(String dspCreativeId) {
        c4 c4Var = this.a;
        c4Var.getClass();
        Intrinsics.checkNotNullParameter(dspCreativeId, "dspCreativeId");
        c4Var.a.d = dspCreativeId;
    }

    public final boolean isLoaded() {
        o0 o0Var = this.a.e;
        return o0Var != null && o0Var.o;
    }

    public final void load() {
        load$default(this, null, 1, null);
    }

    public final void setListener(@Nullable OguryRewardedAdListener rewardedAdListener) {
        IntegrationLogger.d(LogTag.CALLBACKS, SourceTag.ADS, "[Rewarded] setListener() called");
        c4 c4Var = this.a;
        OguryListenerAdapter.Companion.getClass();
        Intrinsics.checkNotNullParameter(this, "ad");
        c4Var.a(rewardedAdListener != null ? new OguryListenerAdapter(this, rewardedAdListener) : null);
        this.a.g = new g9(rewardedAdListener, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r2.o == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void show() {
        IntegrationLogger.d(LogTag.CALLBACKS, SourceTag.ADS, "[Rewarded] show() called");
        c4 c4Var = this.a;
        j4 j4Var = j4.a;
        c4Var.getClass();
        j4 showAction = j4.a;
        Intrinsics.checkNotNullParameter(showAction, "showAction");
        o0 o0Var = c4Var.e;
        if (o0Var != null && o0Var.o) {
            o0Var.a(showAction);
            return;
        }
        p0 p0Var = c4Var.c;
        boolean z = o0Var != null;
        boolean z2 = z;
        OguryMediation oguryMediation = c4Var.d;
        Context context = p0Var.a;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        o0 o0Var2 = new o0(context, uuid, oguryMediation, p0Var.b, p0Var.c, z2);
        o0Var2.t = c4Var.f;
        o0Var2.v = c4Var.g;
        o0Var2.a(showAction);
    }

    public /* synthetic */ OguryRewardedAd(Context context, String str, OguryMediation oguryMediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? null : oguryMediation);
    }

    public final void load(@Nullable String adMarkup) {
        IntegrationLogger.d(LogTag.CALLBACKS, SourceTag.ADS, "[Rewarded] load() called");
        this.a.a(adMarkup);
    }

    public OguryRewardedAd(@NotNull Context context, @NotNull String adUnitId, @Nullable OguryMediation oguryMediation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.a = new c4(context, new c(adUnitId), x.e, oguryMediation);
    }
}
