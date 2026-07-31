package com.unity3d.player;

import android.content.Context;

/* loaded from: classes11.dex */
public class AudioVolumeHandler implements InterfaceC5159p {
    private C5161q a;

    AudioVolumeHandler(Context context) {
        C5161q c5161q = new C5161q(context);
        this.a = c5161q;
        c5161q.a(this);
    }

    public final void a() {
        this.a.a();
        this.a = null;
    }

    @Override // com.unity3d.player.InterfaceC5159p
    public final native void onAudioVolumeChanged(int i);
}
