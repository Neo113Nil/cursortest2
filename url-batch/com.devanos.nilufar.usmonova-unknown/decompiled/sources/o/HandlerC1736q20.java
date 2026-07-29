package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: o.q20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1736q20 extends E20 {
    public final Context a;
    public final /* synthetic */ C0305Lq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1736q20(C0305Lq c0305Lq, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = c0305Lq;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = AbstractC0330Mq.a;
        C0305Lq c0305Lq = this.b;
        Context context = this.a;
        int b = c0305Lq.b(context, i2);
        int i3 = AbstractC0434Qq.c;
        if (b == 1 || b == 2 || b == 3 || b == 9) {
            Intent a = c0305Lq.a(b, context, "n");
            c0305Lq.f(context, b, a == null ? null : PendingIntent.getActivity(context, 0, a, 201326592));
        }
    }
}
