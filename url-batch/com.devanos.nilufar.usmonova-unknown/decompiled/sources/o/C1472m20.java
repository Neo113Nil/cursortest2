package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: o.m20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1472m20 extends BroadcastReceiver {
    public Context a;
    public final KX b;

    public C1472m20(KX kx) {
        this.b = kx;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.b.i;
            throw null;
        }
    }
}
