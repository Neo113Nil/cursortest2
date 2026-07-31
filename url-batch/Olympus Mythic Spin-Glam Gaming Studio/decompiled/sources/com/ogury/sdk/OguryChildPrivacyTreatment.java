package com.ogury.sdk;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-d03ac3f9e324b82242ed8abc94e35cfcf54ca1b7c6df624f1ee1a6ff838e9b84 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ogury/sdk/OguryChildPrivacyTreatment;", "", "()V", "CHILD_UNDER_COPPA_TREATMENT_FALSE", "", "CHILD_UNDER_COPPA_TREATMENT_TRUE", "UNDER_AGE_OF_GDPR_CONSENT_TREATMENT_FALSE", "UNDER_AGE_OF_GDPR_CONSENT_TREATMENT_TRUE", "UNSPECIFIED", "sdk-wrapper_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OguryChildPrivacyTreatment {
    public static final int CHILD_UNDER_COPPA_TREATMENT_FALSE = 1;
    public static final int CHILD_UNDER_COPPA_TREATMENT_TRUE = 2;

    @NotNull
    public static final OguryChildPrivacyTreatment INSTANCE = new OguryChildPrivacyTreatment();
    public static final int UNDER_AGE_OF_GDPR_CONSENT_TREATMENT_FALSE = 4;
    public static final int UNDER_AGE_OF_GDPR_CONSENT_TREATMENT_TRUE = 8;
    public static final int UNSPECIFIED = 0;

    private OguryChildPrivacyTreatment() {
    }
}
