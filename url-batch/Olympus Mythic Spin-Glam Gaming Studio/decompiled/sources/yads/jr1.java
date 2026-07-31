package yads;

import android.content.Context;
import android.os.SystemClock;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.MediatedBidderTokenLoader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class jr1 {
    public final Executor a;
    public final lo1 b;
    public final gr1 c;
    public final fr1 d;
    public final zn1 e;

    public jr1(so1 so1Var) {
        mg1 mg1Var;
        mg1 mg1Var2 = mg1.e;
        if (mg1Var2 == null) {
            synchronized (mg1.d) {
                mg1Var = mg1.e;
                if (mg1Var == null) {
                    mg1Var = new mg1();
                    mg1.e = mg1Var;
                }
            }
            mg1Var2 = mg1Var;
        }
        Executor a = mg1Var2.a();
        lo1 lo1Var = new lo1(so1Var);
        gr1 gr1Var = new gr1();
        fr1 fr1Var = new fr1(so1Var);
        zn1 zn1Var = new zn1();
        this.a = a;
        this.b = lo1Var;
        this.c = gr1Var;
        this.d = fr1Var;
        this.e = zn1Var;
    }

    public final void a(final Context context, l03 l03Var, final er1 er1Var, final xo xoVar, final hr1 hr1Var) {
        yn1 yn1Var;
        String str;
        final com.monetization.ads.mediation.base.a a = this.b.a(context, er1Var, com.monetization.ads.mediation.base.a.class);
        if (a != null) {
            this.e.getClass();
            yn1Var = new yn1(a);
        } else {
            yn1Var = null;
        }
        if (!(a instanceof MediatedBidderTokenLoader)) {
            if (a == null) {
                hr1Var.a(null);
                return;
            } else {
                a(context, er1Var, yn1Var, "Can't create bidder token loader.", (Long) null, hr1Var);
                return;
            }
        }
        try {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final HashMap hashMap = new HashMap(er1Var.c);
            Map map = er1Var.h;
            if (map != null && (str = (String) map.get("app_id")) != null) {
                hashMap.put("app_id", str);
            }
            if (l03Var != null) {
                hashMap.put("width", String.valueOf(l03Var.getWidth()));
                hashMap.put("height", String.valueOf(l03Var.getHeight()));
            }
            final yn1 yn1Var2 = yn1Var;
            this.a.execute(new Runnable() { // from class: yads.jr1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    jr1.a(com.monetization.ads.mediation.base.a.this, context, hashMap, er1Var, this, yn1Var2, hr1Var, xoVar, elapsedRealtime);
                }
            });
        } catch (Throwable th) {
            a(context, er1Var, yn1Var, th.toString(), (Long) null, hr1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.monetization.ads.mediation.base.a aVar, Context context, HashMap hashMap, er1 er1Var, jr1 jr1Var, yn1 yn1Var, hr1 hr1Var, xo xoVar, long j) {
        ((MediatedBidderTokenLoader) aVar).loadBidderToken(context, hashMap, new ir1(er1Var, jr1Var, context, yn1Var, hr1Var, xoVar, j));
    }

    public final void a(Context context, er1 er1Var, yn1 yn1Var, String str, Long l, hr1 hr1Var) {
        MediatedAdapterInfo b;
        fr1 fr1Var = this.d;
        fr1Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("failure_reason", str);
        linkedHashMap.put("status", "error");
        if (l != null) {
            linkedHashMap.put("response_time", l);
        }
        if (yn1Var != null) {
            linkedHashMap.putAll(no1.a(yn1Var));
        }
        fr1Var.a.a(context, fo2.h, er1Var, (yn1Var == null || (b = yn1Var.b()) == null) ? null : b.getNetworkName(), linkedHashMap);
        hr1Var.a(null);
    }

    public static final void a(jr1 jr1Var, Context context, er1 er1Var, yn1 yn1Var, JSONObject jSONObject, hr1 hr1Var) {
        MediatedAdapterInfo b;
        fr1 fr1Var = jr1Var.d;
        fr1Var.getClass();
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("status", "success"));
        if (yn1Var != null) {
            mutableMapOf.putAll(no1.a(yn1Var));
        }
        fr1Var.a.a(context, fo2.h, er1Var, (yn1Var == null || (b = yn1Var.b()) == null) ? null : b.getNetworkName(), mutableMapOf);
        hr1Var.a(jSONObject);
    }
}
