package yads;

import android.content.Context;
import android.os.SystemClock;
import com.monetization.ads.mediation.banner.MediatedBannerSize;
import com.monetization.ads.mediation.base.MediatedBidderTokenLoadListener;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class ir1 implements MediatedBidderTokenLoadListener {
    public final /* synthetic */ er1 a;
    public final /* synthetic */ jr1 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ yn1 d;
    public final /* synthetic */ hr1 e;
    public final /* synthetic */ xo f;
    public final /* synthetic */ long g;

    public ir1(er1 er1Var, jr1 jr1Var, Context context, yn1 yn1Var, hr1 hr1Var, xo xoVar, long j) {
        this.a = er1Var;
        this.b = jr1Var;
        this.c = context;
        this.d = yn1Var;
        this.e = hr1Var;
        this.f = xoVar;
        this.g = j;
    }

    @Override // com.monetization.ads.mediation.base.MediatedBidderTokenLoadListener
    public final void onBidderTokenFailedToLoad(String str) {
        this.b.a(this.c, this.a, this.d, str, (Long) null, this.e);
    }

    @Override // com.monetization.ads.mediation.base.MediatedBidderTokenLoadListener
    public final void onBidderTokenLoaded(String str, MediatedBannerSize mediatedBannerSize) {
        gr1 gr1Var;
        if (str.length() == 0) {
            this.b.a(this.c, this.a, this.d, this.a.c() + " provided empty token", (Long) null, this.e);
            return;
        }
        if (this.f.a()) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.g;
            this.b.a(this.c, this.a, this.d, this.a.c() + " didn't provide bidder token after timeout", Long.valueOf(elapsedRealtime), this.e);
            return;
        }
        gr1Var = this.b.c;
        er1 er1Var = this.a;
        gr1Var.getClass();
        JSONObject a = gr1.a(er1Var, str, mediatedBannerSize);
        if (a == null) {
            this.b.a(this.c, this.a, this.d, "Can't create bidding data json object for network.", (Long) null, this.e);
        } else {
            jr1.a(this.b, this.c, this.a, this.d, a, this.e);
        }
    }
}
