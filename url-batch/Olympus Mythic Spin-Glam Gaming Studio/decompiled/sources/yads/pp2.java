package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class pp2 extends BroadcastReceiver {
    public final /* synthetic */ sp2 a;

    public pp2(sp2 sp2Var) {
        this.a = sp2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.a.a();
    }
}
