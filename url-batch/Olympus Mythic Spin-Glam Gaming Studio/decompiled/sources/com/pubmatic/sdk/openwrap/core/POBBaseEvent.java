package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import com.pubmatic.sdk.common.log.POBLogConstants;

@MainThread
/* loaded from: classes6.dex */
public abstract class POBBaseEvent {
    public abstract void destroy();

    public abstract void requestAd(@Nullable POBBid pOBBid);

    @NonNull
    protected POBError prepareErrorFromResponse(@Nullable POBBidsProvider pOBBidsProvider) {
        String str;
        if (pOBBidsProvider == null || pOBBidsProvider.getNbrCode() == null) {
            str = "No ads available";
        } else {
            str = POBLogConstants.MSG_NBR_ERROR_MESSAGE + pOBBidsProvider.getNbrCode();
        }
        return new POBError(1002, str);
    }
}
