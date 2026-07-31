package com.pubmatic.sdk.common.ui;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;

/* loaded from: classes3.dex */
public interface POBHtmlRendererListener {
    void onRenderProcessGone();

    void onViewClicked(@Nullable String str);

    void onViewRendered(@NonNull View view);

    void onViewRenderingFailed(@NonNull POBError pOBError);
}
