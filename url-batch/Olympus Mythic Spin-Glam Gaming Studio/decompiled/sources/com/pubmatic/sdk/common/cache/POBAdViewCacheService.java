package com.pubmatic.sdk.common.cache;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityBackPressListener;
import com.pubmatic.sdk.common.ui.POBFullScreenActivityListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class POBAdViewCacheService {
    private Map a = Collections.synchronizedMap(new HashMap());

    public static class AdViewConfig {
        private View a;
        private POBFullScreenActivityListener b;
        private POBFullScreenActivityBackPressListener c;

        public AdViewConfig(@NonNull View view, @NonNull POBFullScreenActivityListener pOBFullScreenActivityListener) {
            this.a = view;
            this.b = pOBFullScreenActivityListener;
        }

        @NonNull
        public View getAdView() {
            return this.a;
        }

        @Nullable
        public POBFullScreenActivityBackPressListener getBackPressListener() {
            return this.c;
        }

        @NonNull
        public POBFullScreenActivityListener getEventListener() {
            return this.b;
        }

        public void setBackPressListener(@Nullable POBFullScreenActivityBackPressListener pOBFullScreenActivityBackPressListener) {
            this.c = pOBFullScreenActivityBackPressListener;
        }
    }

    @Nullable
    public AdViewConfig getStoredAdView(@NonNull Integer num) {
        return (AdViewConfig) this.a.get(num);
    }

    @Nullable
    public AdViewConfig popStoredAdView(@NonNull Integer num) {
        return (AdViewConfig) this.a.remove(num);
    }

    public void storeAdView(@NonNull Integer num, @NonNull AdViewConfig adViewConfig) {
        this.a.put(num, adViewConfig);
    }
}
