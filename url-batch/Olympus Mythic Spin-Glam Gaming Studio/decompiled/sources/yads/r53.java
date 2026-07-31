package yads;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class r53 {
    public Message a;

    public final void a() {
        this.a = null;
        ArrayList arrayList = s53.b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
