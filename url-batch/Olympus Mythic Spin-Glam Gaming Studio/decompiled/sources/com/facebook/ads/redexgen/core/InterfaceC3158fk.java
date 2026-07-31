package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC3158fk {
    void A9d();

    boolean A9q();

    boolean A9r();

    boolean AAc();

    void AGr(boolean z, int i);

    void AK1(int i);

    void AK6(EnumC3105et enumC3105et, int i);

    void AKF(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC3105et getStartReason();

    EnumC3160fm getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC3161fn interfaceC3161fn);

    void setup(Uri uri);
}
