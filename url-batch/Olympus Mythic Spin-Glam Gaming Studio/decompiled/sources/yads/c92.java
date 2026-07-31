package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes15.dex */
public final class c92 extends BroadcastReceiver {
    public final /* synthetic */ d92 a;

    public c92(d92 d92Var) {
        this.a = d92Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int b = d92.b(context);
        if (sb3.a < 31 || b != 5) {
            this.a.a(b);
        } else {
            a92.a(context, this.a);
        }
    }
}
