package com.google.android.play.core.hsdp.service;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes15.dex */
public final class HsdpLoadingPanelContainer extends FrameLayout {
    private Runnable zza;

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Runnable runnable = this.zza;
        if (runnable != null) {
            removeCallbacks(runnable);
            post(this.zza);
        }
    }

    public void setOnConfigurationChangedListener(@NonNull Runnable runnable) {
        this.zza = runnable;
    }

    public HsdpLoadingPanelContainer(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
