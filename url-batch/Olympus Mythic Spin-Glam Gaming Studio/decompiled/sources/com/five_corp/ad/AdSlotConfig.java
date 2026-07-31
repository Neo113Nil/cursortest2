package com.five_corp.ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public class AdSlotConfig {
    public MediationInfo a = null;

    @NonNull
    public final String slotId;

    static {
        AdSlotConfig.class.toString();
    }

    public AdSlotConfig(@NonNull String str) {
        this.slotId = str;
    }

    @Nullable
    public MediationInfo getMediationInfo() {
        return this.a;
    }

    public void setMediationInfo(@NonNull String name, @NonNull String version) {
        String str = com.five_corp.ad.internal.s.a;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        if (com.five_corp.ad.internal.s.a(name) && com.five_corp.ad.internal.s.b(version)) {
            this.a = new MediationInfo(name, version);
        } else {
            this.a = null;
        }
    }
}
