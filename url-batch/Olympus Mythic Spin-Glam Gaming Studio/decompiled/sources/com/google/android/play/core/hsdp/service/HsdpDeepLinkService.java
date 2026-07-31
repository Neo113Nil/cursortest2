package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes15.dex */
public interface HsdpDeepLinkService {

    /* compiled from: com.google.android.play:hsdp@@2.0.1 */
    public interface HsdpDeepLinkServiceListener {
        void onAffordanceEnded();

        void onAffordanceStarted();

        void onDeepLinkStarted();

        void onDismissed(Bundle bundle);

        void onError(Bundle bundle);

        void onShown(Bundle bundle);
    }

    /* compiled from: com.google.android.play:hsdp@@2.0.1 */
    public interface HsdpPrewarmListener {
        void onCompleted(Bundle bundle);

        void onError(Bundle bundle);
    }

    void endSession(String str);

    void open(String str, String str2, HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener, Map map, boolean z);

    void prewarm(List list, HsdpPrewarmListener hsdpPrewarmListener);
}
