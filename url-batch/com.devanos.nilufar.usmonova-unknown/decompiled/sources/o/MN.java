package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class MN implements Runnable {
    public final /* synthetic */ int h = 0;
    public Object i;
    public Object j;
    public Object k;

    public /* synthetic */ MN() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i;
        p30 b;
        switch (this.h) {
            case 0:
                try {
                    obj = ((CallableC0732ao) this.i).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.k).post(new RunnableC1996u1(7, (C0798bo) this.j, obj, false));
                return;
            default:
                C0419Qb c0419Qb = (C0419Qb) this.j;
                Intent intent = c0419Qb.h;
                String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    b = DY.i(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = c0419Qb.h;
                    String stringExtra2 = intent2.getStringExtra(Constants.MessagePayloadKeys.MSGID);
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
                    }
                    bundle.putString(Constants.MessagePayloadKeys.MSGID, stringExtra2);
                    Intent intent3 = c0419Qb.h;
                    Integer valueOf = intent3.hasExtra(Constants.MessagePayloadKeys.PRODUCT_ID) ? Integer.valueOf(intent3.getIntExtra(Constants.MessagePayloadKeys.PRODUCT_ID, 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt(Constants.MessagePayloadKeys.PRODUCT_ID, valueOf.intValue());
                    }
                    Context context = (Context) this.i;
                    bundle.putBoolean("supports_message_handled", true);
                    n30 a = n30.a(context);
                    synchronized (a) {
                        i = a.a;
                        a.a = i + 1;
                    }
                    b = a.b(new l30(i, 2, bundle, 0));
                }
                b.a(ExecutorC2239xi.j, new J20((CountDownLatch) this.k));
                return;
        }
    }

    public /* synthetic */ MN(Context context, C0419Qb c0419Qb, CountDownLatch countDownLatch) {
        this.i = context;
        this.j = c0419Qb;
        this.k = countDownLatch;
    }
}
