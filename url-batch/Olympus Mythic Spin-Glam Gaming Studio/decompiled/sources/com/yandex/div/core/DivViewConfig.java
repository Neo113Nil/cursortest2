package com.yandex.div.core;

import androidx.annotation.Px;
import com.yandex.div.core.annotations.PublicApi;

@PublicApi
/* loaded from: classes5.dex */
public interface DivViewConfig {
    public static final DivViewConfig DEFAULT = new DivViewConfig() { // from class: com.yandex.div.core.DivViewConfig$$ExternalSyntheticLambda0
        @Override // com.yandex.div.core.DivViewConfig
        public final boolean isContextMenuEnabled() {
            boolean lambda$static$0;
            lambda$static$0 = DivViewConfig.lambda$static$0();
            return lambda$static$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0() {
        return true;
    }

    @Px
    default int getLogCardScrollSignificantThreshold() {
        return 0;
    }

    boolean isContextMenuEnabled();
}
