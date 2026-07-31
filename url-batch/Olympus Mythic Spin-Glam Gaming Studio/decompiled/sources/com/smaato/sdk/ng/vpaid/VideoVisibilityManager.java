package com.smaato.sdk.ng.vpaid;

import java.util.ArrayList;

/* loaded from: classes13.dex */
public class VideoVisibilityManager {
    private static VideoVisibilityManager b;
    ArrayList<VideoVisibilityListener> a = new ArrayList<>();

    public enum VideoAdStatus {
        PAUSED,
        RESUMED
    }

    private VideoVisibilityManager() {
    }

    public static VideoVisibilityManager getInstance() {
        if (b == null) {
            b = new VideoVisibilityManager();
        }
        return b;
    }

    public void addCallback(VideoVisibilityListener videoVisibilityListener) {
        this.a.add(videoVisibilityListener);
    }

    public void removeCallback(VideoVisibilityListener videoVisibilityListener) {
        this.a.remove(videoVisibilityListener);
    }

    public void reportChange(VideoAdStatus videoAdStatus) {
        ArrayList<VideoVisibilityListener> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            VideoVisibilityListener videoVisibilityListener = arrayList.get(i);
            i++;
            VideoVisibilityListener videoVisibilityListener2 = videoVisibilityListener;
            if (videoAdStatus == VideoAdStatus.PAUSED) {
                videoVisibilityListener2.pauseAd();
            } else {
                videoVisibilityListener2.resumeAd();
            }
        }
    }
}
