package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;

/* loaded from: classes.dex */
public final class q extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2080a;

    public q(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2080a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        i1.f.e((k) iInterface, "callback");
        i1.f.e(obj, "cookie");
        this.f2080a.f2049b.remove((Integer) obj);
    }
}
