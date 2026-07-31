package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* renamed from: com.unity3d.player.f0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C5140f0 {
    private Context a;
    private C5138e0 b;

    public C5140f0(Context context) {
        this.a = context;
    }

    public final void a() {
        if (this.b != null) {
            this.a.getContentResolver().unregisterContentObserver(this.b);
            this.b = null;
        }
    }

    public final void a(InterfaceC5136d0 interfaceC5136d0) {
        this.b = new C5138e0(new Handler(Looper.getMainLooper()), interfaceC5136d0);
        this.a.getContentResolver().registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, this.b);
    }
}
