package com.unity3d.player;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.unity3d.player.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5157o extends ContentObserver {
    private final InterfaceC5159p a;
    private final AudioManager b;
    private final int c;
    private int d;

    public C5157o(Handler handler, AudioManager audioManager, InterfaceC5159p interfaceC5159p) {
        super(handler);
        this.b = audioManager;
        this.c = 3;
        this.a = interfaceC5159p;
        this.d = audioManager.getStreamVolume(3);
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        int streamVolume;
        AudioManager audioManager = this.b;
        if (audioManager == null || this.a == null || (streamVolume = audioManager.getStreamVolume(this.c)) == this.d) {
            return;
        }
        this.d = streamVolume;
        this.a.onAudioVolumeChanged(streamVolume);
    }
}
