package com.moloco.sdk.internal.services.bidtoken;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettings;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes5.dex */
public final class t implements u {
    public static final int b = 8;

    @NotNull
    public final InternalMolocoPrivacySettings a;

    public t(@NotNull InternalMolocoPrivacySettings internalMolocoPrivacySettings) {
        Intrinsics.checkNotNullParameter(internalMolocoPrivacySettings, "internalMolocoPrivacySettings");
        this.a = internalMolocoPrivacySettings;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.u
    @NotNull
    public MolocoPrivacy.PrivacySettings getPrivacy() {
        return this.a.getUpdatedPrivacySettings(MolocoPrivacy.INSTANCE.getPrivacySettings());
    }
}
