package io.bidmachine.nativead;

import androidx.annotation.Nullable;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import io.bidmachine.internal.C6016k;

/* loaded from: classes6.dex */
public interface NativeData extends NativePublicData {
    @Nullable
    LabelData getAdLabelData();

    @Nullable
    String getClickUrl();

    @Nullable
    C6016k getDisclaimerData();

    @Nullable
    PrivacySheetData getPrivacySheetData();

    @Nullable
    String getVideoAdm();

    @Nullable
    String getVideoUrl();
}
