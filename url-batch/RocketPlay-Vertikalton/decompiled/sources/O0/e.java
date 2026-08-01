package O0;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A1.d f914a;

    public e(A1.d dVar) {
        this.f914a = dVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        A1.d dVar = this.f914a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (dVar.f38b) {
            throw null;
        }
    }
}
