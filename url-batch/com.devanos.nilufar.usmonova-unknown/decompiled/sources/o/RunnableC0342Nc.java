package o;

import android.content.Intent;
import android.content.IntentSender;

/* renamed from: o.Nc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0342Nc implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ RunnableC0342Nc(int i, int i2, Object obj, Object obj2) {
        this.h = i2;
        this.i = obj;
        this.j = i;
        this.k = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.h) {
            case 0:
                C0368Oc c0368Oc = (C0368Oc) this.i;
                Object obj = ((M1) this.k).h;
                String str = (String) c0368Oc.a.get(Integer.valueOf(this.j));
                if (str != null) {
                    R1 r1 = (R1) c0368Oc.e.get(str);
                    if ((r1 != null ? r1.a : null) != null) {
                        L1 l1 = r1.a;
                        if (c0368Oc.d.remove(str)) {
                            l1.a(obj);
                            break;
                        }
                    } else {
                        c0368Oc.g.remove(str);
                        c0368Oc.f.put(str, obj);
                        break;
                    }
                }
                break;
            case 1:
                C0368Oc c0368Oc2 = (C0368Oc) this.i;
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.k;
                AbstractC0048Bt.n(c0368Oc2, "this$0");
                AbstractC0048Bt.n(sendIntentException, "$e");
                c0368Oc2.a(this.j, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
            default:
                ((C1646oi) this.i).b.j(this.j, this.k);
                break;
        }
    }
}
