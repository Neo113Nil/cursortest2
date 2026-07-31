package com.ogury.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public final class b implements ServiceConnection {
    public final LinkedBlockingQueue a = new LinkedBlockingQueue(1);
    public boolean b;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        try {
            this.a.put(service);
        } catch (InterruptedException e) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.CORE, e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
