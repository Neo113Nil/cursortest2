package com.ogury.core.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ogury/core/internal/GppConsentConstants;", "", "()V", "CONSENT_KEYS", "", "", "getCONSENT_KEYS", "()Ljava/util/List;", "GPP_CONSENT_KEY", "GPP_CONSENT_SID_KEY", "IABTCF_CONSENT_KEY", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GppConsentConstants {

    @NotNull
    public static final String GPP_CONSENT_KEY = "IABGPP_HDR_GppString";

    @NotNull
    public static final String GPP_CONSENT_SID_KEY = "IABGPP_GppSID";

    @NotNull
    public static final String IABTCF_CONSENT_KEY = "IABTCF_TCString";

    @NotNull
    public static final GppConsentConstants INSTANCE = new GppConsentConstants();

    @NotNull
    private static final List<String> CONSENT_KEYS = CollectionsKt.listOf((Object[]) new String[]{"IABGPP_HDR_GppString", "IABGPP_GppSID", "IABTCF_TCString"});

    private GppConsentConstants() {
    }

    @NotNull
    public final List<String> getCONSENT_KEYS() {
        return CONSENT_KEYS;
    }
}
