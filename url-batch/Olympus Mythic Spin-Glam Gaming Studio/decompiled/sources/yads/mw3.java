package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes11.dex */
public final class mw3 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        nw3 nw3Var;
        boolean z;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            nw3Var = nw3.d;
            z = true;
            nw3Var.a(true, nw3Var.c);
        } else {
            if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                return;
            }
            nw3Var = nw3.d;
            z = false;
            nw3Var.a(false, nw3Var.c);
        }
        nw3Var.b = z;
    }
}
