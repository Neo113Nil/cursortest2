package androidx.room;

import X0.d;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import g0.BinderC0144d;
import g0.RemoteCallbackListC0145e;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f1496a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1497b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final RemoteCallbackListC0145e f1498c = new RemoteCallbackListC0145e(this);
    public final BinderC0144d d = new BinderC0144d(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        d.e(intent, "intent");
        return this.d;
    }
}
