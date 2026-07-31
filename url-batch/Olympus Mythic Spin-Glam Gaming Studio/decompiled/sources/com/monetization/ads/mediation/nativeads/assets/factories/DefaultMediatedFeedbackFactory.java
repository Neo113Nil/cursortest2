package com.monetization.ads.mediation.nativeads.assets.factories;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/monetization/ads/mediation/nativeads/assets/factories/DefaultMediatedFeedbackFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "resourceId", "Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;", "makeFeedback", "(Landroid/content/Context;I)Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdImage;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DefaultMediatedFeedbackFactory {
    @NotNull
    public final MediatedNativeAdImage makeFeedback(@NotNull Context context, int resourceId) {
        MediatedNativeAdImage.Builder height = new MediatedNativeAdImage.Builder("default_mediation_feedback_url").setWidth(68).setHeight(68);
        try {
            height.setDrawable(context.getDrawable(resourceId));
        } catch (Throwable unused) {
        }
        return height.build();
    }
}
