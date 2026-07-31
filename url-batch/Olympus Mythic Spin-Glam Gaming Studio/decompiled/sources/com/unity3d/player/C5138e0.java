package com.unity3d.player;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.unity3d.player.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5138e0 extends ContentObserver {
    private InterfaceC5136d0 a;

    public C5138e0(Handler handler, InterfaceC5136d0 interfaceC5136d0) {
        super(handler);
        this.a = interfaceC5136d0;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        InterfaceC5136d0 interfaceC5136d0 = this.a;
        if (interfaceC5136d0 != null) {
            ((OrientationLockListener) interfaceC5136d0).b();
        }
    }
}
