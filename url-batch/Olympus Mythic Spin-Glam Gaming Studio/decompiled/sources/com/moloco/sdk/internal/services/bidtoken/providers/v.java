package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes6.dex */
public final class v implements j<MolocoPrivacy.PrivacySettings> {
    public static final int e = 8;

    @NotNull
    public final com.moloco.sdk.internal.services.bidtoken.u b;

    @NotNull
    public final String c;

    @NotNull
    public MolocoPrivacy.PrivacySettings d;

    public v(@NotNull com.moloco.sdk.internal.services.bidtoken.u privacyProvider) {
        Intrinsics.checkNotNullParameter(privacyProvider, "privacyProvider");
        this.b = privacyProvider;
        this.c = "PrivacyStateSignalProvider";
        this.d = privacyProvider.getPrivacy();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.d = this.b.getPrivacy();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean areEqual = Intrinsics.areEqual(this.d, this.b.getPrivacy());
        boolean z = !areEqual;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.c, !areEqual ? "[CBT] privacy updated" : "[CBT] privacy didn't change", false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return this.c;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public MolocoPrivacy.PrivacySettings d() {
        return this.d;
    }
}
