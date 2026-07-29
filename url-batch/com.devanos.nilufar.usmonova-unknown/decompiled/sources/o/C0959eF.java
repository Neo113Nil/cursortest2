package o;

import android.app.Notification;

/* renamed from: o.eF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959eF extends L {
    public CharSequence i;

    @Override // o.L
    public final void C0(C1334k c1334k) {
        new Notification.BigTextStyle((Notification.Builder) c1334k.j).setBigContentTitle(null).bigText(this.i);
    }

    @Override // o.L
    public final String D0() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
