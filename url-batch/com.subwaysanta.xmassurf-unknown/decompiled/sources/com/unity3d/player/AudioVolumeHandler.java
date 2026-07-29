package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.unity3d.player.a.C0109h;
import com.unity3d.player.a.C0111j;
import com.unity3d.player.a.InterfaceC0110i;

/* loaded from: classes.dex */
public class AudioVolumeHandler implements InterfaceC0110i {
    public C0111j a;

    @Override // com.unity3d.player.a.InterfaceC0110i
    public final native void onAudioVolumeChanged(int i);

    public AudioVolumeHandler(Context context) {
        C0111j c0111j = new C0111j(context);
        this.a = c0111j;
        c0111j.c = new C0109h(new Handler(Looper.getMainLooper()), c0111j.b, this);
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c0111j.c);
    }
}
