package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.TargetingInfo;
import io.bidmachine.unified.UnifiedAdRequestParams;

/* loaded from: classes6.dex */
public class UnifiedAdRequestParamsImpl<AdRequestParametersType extends AdRequestParameters> implements UnifiedAdRequestParams {

    @NonNull
    private final AdRequestParametersType adRequestParameters;

    @NonNull
    private final DataRestrictions dataRestrictions;

    @NonNull
    private final TargetingInfo targetingInfo;

    protected UnifiedAdRequestParamsImpl(@NonNull AdRequestParametersType adrequestparameterstype, @NonNull TargetingInfo targetingInfo, @NonNull DataRestrictions dataRestrictions) {
        this.adRequestParameters = adrequestparameterstype;
        this.targetingInfo = targetingInfo;
        this.dataRestrictions = dataRestrictions;
    }

    @Override // io.bidmachine.unified.UnifiedAdRequestParams, io.bidmachine.unified.UnifiedFullscreenAdRequestParams
    @NonNull
    public AdRequestParametersType getAdRequestParameters() {
        return this.adRequestParameters;
    }

    @Override // io.bidmachine.GeneralParams
    @NonNull
    public DataRestrictions getDataRestrictions() {
        return this.dataRestrictions;
    }

    @Override // io.bidmachine.GeneralParams
    @NonNull
    public TargetingInfo getTargetingInfo() {
        return this.targetingInfo;
    }

    @Override // io.bidmachine.GeneralParams
    public boolean isTestMode() {
        return k.b().u();
    }
}
