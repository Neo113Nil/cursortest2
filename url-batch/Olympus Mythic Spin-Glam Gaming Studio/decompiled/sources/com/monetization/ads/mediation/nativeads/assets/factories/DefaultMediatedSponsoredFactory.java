package com.monetization.ads.mediation.nativeads.assets.factories;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/monetization/ads/mediation/nativeads/assets/factories/DefaultMediatedSponsoredFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "resourceId", "", "makeSponsored", "(Landroid/content/Context;I)Ljava/lang/String;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultMediatedSponsoredFactory {
    @NotNull
    public final String makeSponsored(@NotNull Context context, int resourceId) {
        try {
            return context.getString(resourceId);
        } catch (Throwable unused) {
            return "Advertisement";
        }
    }
}
