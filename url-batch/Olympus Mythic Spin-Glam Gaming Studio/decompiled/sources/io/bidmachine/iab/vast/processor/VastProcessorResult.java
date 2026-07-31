package io.bidmachine.iab.vast.processor;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.VastUrlProcessorRegistry;
import io.bidmachine.iab.vast.tags.AdContentTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class VastProcessorResult {
    private VastAd b;
    private VastSpecError c;
    private final List a = new ArrayList();
    private boolean d = true;

    List a() {
        return this.a;
    }

    boolean b() {
        return this.d;
    }

    @Nullable
    public VastAd getVastAd() {
        return this.b;
    }

    @Nullable
    public VastSpecError getVastSpecError() {
        return this.c;
    }

    public boolean hasVastAd() {
        return this.b != null;
    }

    void a(VastSpecError vastSpecError) {
        this.c = vastSpecError;
    }

    void a(VastAd vastAd) {
        this.b = vastAd;
    }

    void a(boolean z) {
        this.d = z;
    }

    void a(AdContentTag adContentTag, VastSpecError vastSpecError) {
        a(vastSpecError);
        Bundle bundle = new Bundle();
        bundle.putInt(VastRequest.PARAMS_ERROR_CODE, vastSpecError.getCode());
        List<String> errorUrlList = adContentTag.getErrorUrlList();
        if (errorUrlList == null || errorUrlList.isEmpty()) {
            return;
        }
        Iterator<String> it = errorUrlList.iterator();
        while (it.hasNext()) {
            String processUrl = VastUrlProcessorRegistry.processUrl(it.next(), bundle);
            if (!TextUtils.isEmpty(processUrl)) {
                this.a.add(processUrl);
            }
        }
    }
}
