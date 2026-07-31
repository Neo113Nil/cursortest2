package io.bidmachine;

import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.TargetingInfo;

/* loaded from: classes5.dex */
class v implements InitializationParams {
    private final TargetingInfo a;
    private final DataRestrictions b;

    v(TargetingParams targetingParams, DataRestrictions dataRestrictions) {
        this.a = new TargetingInfoImpl(targetingParams);
        this.b = dataRestrictions;
    }

    @Override // io.bidmachine.GeneralParams
    public DataRestrictions getDataRestrictions() {
        return this.b;
    }

    @Override // io.bidmachine.GeneralParams
    public TargetingInfo getTargetingInfo() {
        return this.a;
    }

    @Override // io.bidmachine.GeneralParams
    public boolean isTestMode() {
        return k.b().u();
    }
}
