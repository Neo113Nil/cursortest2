package com.unity3d.ads;

import androidx.annotation.RestrictTo;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;

@Deprecated
/* loaded from: classes3.dex */
public class UnityAdsLoadOptions extends UnityAdsBaseOptions {
    private String AD_MARKUP = "adMarkup";

    @RestrictTo
    public LoadConfigurationInternal loadConfiguration = null;

    public void setAdMarkup(String str) {
        set(this.AD_MARKUP, str);
    }
}
