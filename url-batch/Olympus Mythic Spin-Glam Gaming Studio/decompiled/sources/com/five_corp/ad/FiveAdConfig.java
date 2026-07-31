package com.five_corp.ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public class FiveAdConfig {
    public final String appId;

    @Nullable
    public FiveAdAgeRating fiveAdAgeRating;

    @Nullable
    public NeedChildDirectedTreatment needChildDirectedTreatment;

    @Nullable
    @Deprecated
    public NeedGdprNonPersonalizedAdsTreatment needGdprNonPersonalizedAdsTreatment;
    public boolean isTest = false;
    public int a = 1;

    public FiveAdConfig(@NonNull String str) {
        this.appId = str;
    }

    public FiveAdConfig deepCopy() {
        FiveAdConfig fiveAdConfig = new FiveAdConfig(this.appId);
        fiveAdConfig.isTest = this.isTest;
        fiveAdConfig.needGdprNonPersonalizedAdsTreatment = getNeedGdprNonPersonalizedAdsTreatment();
        fiveAdConfig.needChildDirectedTreatment = getNeedChildDirectedTreatment();
        fiveAdConfig.fiveAdAgeRating = getFiveAdAgeRating();
        fiveAdConfig.a = this.a;
        return fiveAdConfig;
    }

    public void enableSoundByDefault(boolean z) {
        this.a = z ? 2 : 3;
    }

    @NonNull
    public FiveAdAgeRating getFiveAdAgeRating() {
        FiveAdAgeRating fiveAdAgeRating = this.fiveAdAgeRating;
        return fiveAdAgeRating == null ? FiveAdAgeRating.UNSPECIFIED : fiveAdAgeRating;
    }

    @NonNull
    public NeedChildDirectedTreatment getNeedChildDirectedTreatment() {
        NeedChildDirectedTreatment needChildDirectedTreatment = this.needChildDirectedTreatment;
        return needChildDirectedTreatment == null ? NeedChildDirectedTreatment.UNSPECIFIED : needChildDirectedTreatment;
    }

    @NonNull
    @Deprecated
    public NeedGdprNonPersonalizedAdsTreatment getNeedGdprNonPersonalizedAdsTreatment() {
        NeedGdprNonPersonalizedAdsTreatment needGdprNonPersonalizedAdsTreatment = this.needGdprNonPersonalizedAdsTreatment;
        return needGdprNonPersonalizedAdsTreatment == null ? NeedGdprNonPersonalizedAdsTreatment.UNSPECIFIED : needGdprNonPersonalizedAdsTreatment;
    }
}
