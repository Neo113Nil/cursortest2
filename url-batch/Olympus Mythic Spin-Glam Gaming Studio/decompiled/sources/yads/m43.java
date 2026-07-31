package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes4.dex */
public final class m43 extends BroadcastReceiver {
    public final /* synthetic */ n43 a;

    public m43(n43 n43Var) {
        this.a = n43Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final n43 n43Var = this.a;
        n43Var.b.post(new Runnable() { // from class: yads.m43$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                n43.this.c();
            }
        });
    }
}
