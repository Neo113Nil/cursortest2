package com.ogury.ad;

import com.ogury.ad.internal.c3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ogury/ad/OguryAdRequests;", "", "()V", "AD_CONTENT_THRESHOLD_G", "", "AD_CONTENT_THRESHOLD_MA", "AD_CONTENT_THRESHOLD_PG", "AD_CONTENT_THRESHOLD_T", "AD_CONTENT_THRESHOLD_UNSPECIFIED", "getAdContentThreshold", "setAdContentThreshold", "", "adConsentThreshold", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OguryAdRequests {

    @NotNull
    public static final String AD_CONTENT_THRESHOLD_G = "G";

    @NotNull
    public static final String AD_CONTENT_THRESHOLD_MA = "MA";

    @NotNull
    public static final String AD_CONTENT_THRESHOLD_PG = "PG";

    @NotNull
    public static final String AD_CONTENT_THRESHOLD_T = "T";

    @NotNull
    public static final String AD_CONTENT_THRESHOLD_UNSPECIFIED = "";

    @NotNull
    public static final OguryAdRequests INSTANCE = new OguryAdRequests();

    private OguryAdRequests() {
    }

    @NotNull
    public static final String getAdContentThreshold() {
        return c3.b();
    }

    public static final void setAdContentThreshold(@NotNull String adConsentThreshold) {
        Intrinsics.checkNotNullParameter(adConsentThreshold, "adConsentThreshold");
        c3 c3Var = c3.a;
        Intrinsics.checkNotNullParameter("AD_CONTENT_THRESHOLD", "key");
        if (adConsentThreshold != null) {
            c3.b.putString("AD_CONTENT_THRESHOLD", adConsentThreshold);
        } else {
            Intrinsics.checkNotNullParameter("AD_CONTENT_THRESHOLD", "configurationKey");
            c3.b.remove("AD_CONTENT_THRESHOLD");
        }
    }
}
