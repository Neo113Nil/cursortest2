package g0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RemoteCallbackListC0145e extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2372a;

    public RemoteCallbackListC0145e(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2372a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        X0.d.e((InterfaceC0142b) iInterface, "callback");
        X0.d.e(obj, "cookie");
        this.f2372a.f1497b.remove((Integer) obj);
    }
}
