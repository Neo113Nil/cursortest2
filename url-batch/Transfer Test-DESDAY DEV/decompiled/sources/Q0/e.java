package Q0;

import A0.h;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f649a;

    public e(h hVar) {
        this.f649a = hVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        h hVar = this.f649a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (hVar.f30b) {
            throw null;
        }
    }
}
