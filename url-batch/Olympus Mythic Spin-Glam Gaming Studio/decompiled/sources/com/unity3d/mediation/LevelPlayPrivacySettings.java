package com.unity3d.mediation;

import com.ironsource.C4789nb;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class LevelPlayPrivacySettings {

    @NotNull
    public static final LevelPlayPrivacySettings INSTANCE = new LevelPlayPrivacySettings();

    private LevelPlayPrivacySettings() {
    }

    public static final void setCCPA(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setCCPA() value: " + z);
        C4789nb.d.a().a(z);
    }

    public static final void setCOPPA(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setCOPPA() value: " + z);
        C4789nb.d.a().b(z);
    }

    public static final void setGDPRConsents(@NotNull Map<String, Boolean> networkConsents) {
        Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        IronLog.API.info("LevelPlayPrivacySettings.setGDPRConsents() networkConsents: " + networkConsents);
        C4789nb.d.a().a(networkConsents);
    }
}
