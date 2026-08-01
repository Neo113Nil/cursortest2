package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;

/* loaded from: classes.dex */
public final class q extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f1702a;

    public q(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1702a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        g1.f.e((k) iInterface, "callback");
        g1.f.e(obj, "cookie");
        this.f1702a.f1670b.remove((Integer) obj);
    }
}
