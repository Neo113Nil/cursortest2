package com.pubmatic.sdk.nativead;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes14.dex */
public class POBNativeAdViewHandler implements View.OnClickListener {
    private View a;
    private POBNativeAdViewListener b;
    private boolean c = false;

    public void onAdViewAttachedToWindow() {
        POBNativeAdViewListener pOBNativeAdViewListener;
        if (this.c || (pOBNativeAdViewListener = this.b) == null) {
            return;
        }
        this.c = true;
        View view = this.a;
        if (view != null) {
            pOBNativeAdViewListener.onRecordImpression(view);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NonNull View view) {
        if (this.b == null || this.a == null) {
            return;
        }
        Object tag = view.getTag();
        if (tag instanceof Integer) {
            this.b.onAssetClicked(this.a, ((Integer) view.getTag()).intValue());
        } else if (!(tag instanceof String)) {
            this.b.onRecordClick(this.a);
        } else {
            this.b.onNonAssetClicked(this.a, (String) view.getTag());
        }
    }

    public void setAdView(@Nullable View view) {
        this.a = view;
    }

    public void setListener(@Nullable POBNativeAdViewListener pOBNativeAdViewListener) {
        this.b = pOBNativeAdViewListener;
    }
}
