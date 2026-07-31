package com.yandex.mobile.ads.common;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.pu3;
import yads.vh3;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/mobile/ads/common/VideoController;", "", "Lyads/vh3;", "videoEventController", "<init>", "(Lyads/vh3;)V", "Lcom/yandex/mobile/ads/common/VideoEventListener;", "videoEventListener", "", "setVideoEventListener", "(Lcom/yandex/mobile/ads/common/VideoEventListener;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@MainThread
/* loaded from: classes3.dex */
public final class VideoController {
    private final vh3 a;

    public VideoController(@NotNull vh3 vh3Var) {
        this.a = vh3Var;
    }

    public final void setVideoEventListener(@Nullable VideoEventListener videoEventListener) {
        if (videoEventListener != null) {
            this.a.b = new pu3(videoEventListener);
        } else {
            this.a.b = null;
        }
    }
}
