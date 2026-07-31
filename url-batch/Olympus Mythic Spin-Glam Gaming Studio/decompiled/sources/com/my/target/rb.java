package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.lb;
import com.my.target.mediation.MediationAdapter;
import com.my.target.mediation.MediationRewardedAdAdapter;
import com.my.target.mediation.MyTargetRewardedAdAdapter;
import com.my.target.p5;
import com.my.target.tb;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class rb extends lb implements p5 {
    final p5.a k;
    private p5.b l;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements MediationRewardedAdAdapter.MediationRewardedAdListener {
        private final kb a;

        a(kb kbVar) {
            this.a = kbVar;
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onClick(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            if (rb.this.d != mediationRewardedAdAdapter) {
                return;
            }
            wh.b(this.a.h(), "click", 2);
            rb.this.k.a((InterstitialAd.BannerInfo) null);
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onDismiss(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            rb rbVar = rb.this;
            if (rbVar.d != mediationRewardedAdAdapter) {
                return;
            }
            rbVar.k.b();
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onDisplay(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            if (rb.this.d != mediationRewardedAdAdapter) {
                return;
            }
            wh.b(this.a.h(), "show", 1);
            rb.this.k.e();
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onFailedToShow(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            rb rbVar = rb.this;
            if (rbVar.d != mediationRewardedAdAdapter) {
                return;
            }
            rbVar.k.c();
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onLoad(MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            if (rb.this.d != mediationRewardedAdAdapter) {
                return;
            }
            mi.a("MediationRewardedAdEngine$AdapterListener: Data from " + this.a.b() + " ad network loaded successfully");
            rb.this.a(this.a, true);
            rb.this.k.a();
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            if (rb.this.d != mediationRewardedAdAdapter) {
                return;
            }
            mi.a("MediationRewardedAdEngine$AdapterListener: No data from " + this.a.b() + " ad network - " + iAdLoadingError);
            rb.this.a(this.a, false);
        }

        @Override // com.my.target.mediation.MediationRewardedAdAdapter.MediationRewardedAdListener
        public void onReward(Reward reward, MediationRewardedAdAdapter mediationRewardedAdAdapter) {
            if (rb.this.d != mediationRewardedAdAdapter) {
                return;
            }
            wh.b(this.a.h(), "reward", 999);
            p5.b m = rb.this.m();
            if (m != null) {
                m.a(reward);
            }
        }
    }

    private rb(jb jbVar, n nVar, tb.a aVar, p5.a aVar2) {
        super(jbVar, nVar, aVar);
        this.k = aVar2;
    }

    @Override // com.my.target.p5
    public void destroy() {
        MediationAdapter mediationAdapter = this.d;
        if (mediationAdapter == null) {
            mi.b("MediationRewardedAdEngine: Error - can't destroy ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) mediationAdapter).destroy();
        } catch (Throwable th) {
            mi.b("MediationRewardedAdEngine: Error - " + th);
        }
        this.d = null;
    }

    @Override // com.my.target.p5
    public void dismiss() {
        MediationAdapter mediationAdapter = this.d;
        if (mediationAdapter == null) {
            mi.b("MediationRewardedAdEngine: Error - can't dismiss ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) mediationAdapter).dismiss();
        } catch (Throwable th) {
            mi.b("MediationRewardedAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.lb
    void h() {
        this.k.a(q.v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.my.target.lb
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public MediationRewardedAdAdapter i() {
        return new MyTargetRewardedAdAdapter();
    }

    public p5.b m() {
        return this.l;
    }

    public static rb a(jb jbVar, n nVar, tb.a aVar, p5.a aVar2) {
        return new rb(jbVar, nVar, aVar, aVar2);
    }

    @Override // com.my.target.p5
    public void a(Context context) {
        MediationAdapter mediationAdapter = this.d;
        if (mediationAdapter == null) {
            this.k.c();
            mi.b("MediationRewardedAdEngine: Error - can't show ad, adapter is not set");
            return;
        }
        try {
            ((MediationRewardedAdAdapter) mediationAdapter).show(context);
        } catch (Throwable th) {
            this.k.c();
            mi.b("MediationRewardedAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.p5
    public void a(p5.b bVar) {
        this.l = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.my.target.lb
    public void a(MediationRewardedAdAdapter mediationRewardedAdAdapter, kb kbVar, Context context) {
        lb.a a2 = lb.a.a(kbVar.e(), kbVar.d(), kbVar.c(), this.a.h().getAge(), this.a.h().getGender(), MyTargetPrivacy.currentPrivacy(), TextUtils.isEmpty(this.h) ? null : this.a.a(this.h));
        if (mediationRewardedAdAdapter instanceof MyTargetRewardedAdAdapter) {
            x g = kbVar.g();
            if (g instanceof i9) {
                ((MyTargetRewardedAdAdapter) mediationRewardedAdAdapter).a((i9) g);
            }
        }
        try {
            mediationRewardedAdAdapter.load(a2, new a(kbVar), context);
        } catch (Throwable th) {
            mi.b("MediationRewardedAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.lb
    boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationRewardedAdAdapter;
    }
}
