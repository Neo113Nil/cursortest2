package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes4.dex */
public final class si extends Handler {
    public final /* synthetic */ ui a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(ui uiVar, Looper looper) {
        super(looper);
        this.a = uiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.a.a(message);
    }
}
