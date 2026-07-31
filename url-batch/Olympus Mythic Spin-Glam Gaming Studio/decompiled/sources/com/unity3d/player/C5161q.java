package com.unity3d.player;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* renamed from: com.unity3d.player.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5161q {
    private final Context a;
    private final AudioManager b;
    private C5157o c;

    public C5161q(Context context) {
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
    }

    public final void a() {
        if (this.c != null) {
            this.a.getContentResolver().unregisterContentObserver(this.c);
            this.c = null;
        }
    }

    public final void a(InterfaceC5159p interfaceC5159p) {
        this.c = new C5157o(new Handler(Looper.getMainLooper()), this.b, interfaceC5159p);
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.c);
    }
}
