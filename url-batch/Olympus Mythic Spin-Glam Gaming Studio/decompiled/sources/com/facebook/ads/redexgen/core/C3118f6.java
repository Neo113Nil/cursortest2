package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3118f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C19953r A00;

    public C3118f6(C19953r c19953r) {
        this.A00 = c19953r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C2230Dl(this, i));
    }
}
