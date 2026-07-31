package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.lb;
import com.my.target.mediation.MediationAdapter;
import com.my.target.mediation.MediationInterstitialAdAdapter;
import com.my.target.mediation.MyTargetInterstitialAdAdapter;
import com.my.target.p5;
import com.my.target.tb;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes9.dex */
public class mb extends lb implements p5 {
    final p5.a k;
    final p5.c l;
    private p5.b m;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements MediationInterstitialAdAdapter.MediationInterstitialAdListener {
        private final kb a;

        a(kb kbVar) {
            this.a = kbVar;
        }

        @Override // com.my.target.mediation.MediationInterstitialAdAdapter.MediationInterstitialAdListener
        public void onClick(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            if (mb.this.d != mediationInterstitialAdAdapter) {
                return;
            }
            wh.b(this.a.h(), "click", 2);
            mb.this.k.a((InterstitialAd.BannerInfo) null);
        }

        @Override // com.my.target.mediation.MediationInterstitialAdAdapter.MediationInterstitialAdListener
        public void onDismiss(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            mb mbVar = mb.this;
            if (mbVar.d != mediationInterstitialAdAdapter) {
                return;
            }
            mbVar.k.b();
        }

        @Override // com.my.target.mediation.MediationInterstitialAdAdapter.MediationInterstitialAdListener
        public void onDisplay(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            if (mb.this.d != mediationInterstitialAdAdapter) {
                return;
            }
            wh.b(this.a.h(), "show", 1);
            mb.this.k.e();
        }

        @Override // com.my.target.mediation.MediationInterstitialAdAdapter.MediationInterstitialAdListener
        public void onFailedToShow(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            mb mbVar = mb.this;
            if (mbVar.d != mediationInterstitialAdAdapter) {
                return;
            }
            mbVar.k.c();
        }

        @Override // com.my.target.mediation.MediationInterstitialAdAdapter.MediationInterstitialAdListener
        public void onLoad(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            if (mb.this.d != mediationInterstitialAdAdapter) {
                return;
            }
            mi.a("MediationInterstitialAdEngine$AdapterListener: Data from " + this.a.b() + " ad network loaded successfully");
            mb.this.a(this.a, true);
            mb.this.k.a();
        }

        @Override // com.my.target.mediation.MediationInterstitialAdAdapter.MediationInterstitialAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            if (mb.this.d != mediationInterstitialAdAdapter) {
                return;
            }
            mi.a("MediationInterstitialAdEngine$AdapterListener: No data from " + this.a.b() + " ad network - " + iAdLoadingError);
            mb.this.a(this.a, false);
        }

        @Override // com.my.target.mediation.MediationInterstitialAdAdapter.MediationInterstitialAdListener
        public void onVideoCompleted(MediationInterstitialAdAdapter mediationInterstitialAdAdapter) {
            mb mbVar = mb.this;
            if (mbVar.d != mediationInterstitialAdAdapter) {
                return;
            }
            mbVar.l.b(null);
            wh.b(this.a.h(), "reward", 999);
            p5.b m = mb.this.m();
            if (m != null) {
                m.a(Reward.getDefault());
            }
        }
    }

    private mb(jb jbVar, n nVar, tb.a aVar, p5.a aVar2, p5.c cVar) {
        super(jbVar, nVar, aVar);
        this.k = aVar2;
        this.l = cVar;
    }

    @Override // com.my.target.p5
    public void destroy() {
        MediationAdapter mediationAdapter = this.d;
        if (mediationAdapter == null) {
            mi.b("MediationInterstitialAdEngine: Error - can't destroy ad, adapter is not set");
            return;
        }
        try {
            ((MediationInterstitialAdAdapter) mediationAdapter).destroy();
        } catch (Throwable th) {
            mi.b("MediationInterstitialAdEngine: Error - " + th);
        }
        this.d = null;
    }

    @Override // com.my.target.p5
    public void dismiss() {
        MediationAdapter mediationAdapter = this.d;
        if (mediationAdapter == null) {
            mi.b("MediationInterstitialAdEngine: Error - can't dismiss ad, adapter is not set");
            return;
        }
        try {
            ((MediationInterstitialAdAdapter) mediationAdapter).dismiss();
        } catch (Throwable th) {
            mi.b("MediationInterstitialAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.lb
    void h() {
        this.k.a(q.v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.my.target.lb
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public MediationInterstitialAdAdapter i() {
        return new MyTargetInterstitialAdAdapter();
    }

    public p5.b m() {
        return this.m;
    }

    public static mb a(jb jbVar, n nVar, tb.a aVar, p5.a aVar2, p5.c cVar) {
        return new mb(jbVar, nVar, aVar, aVar2, cVar);
    }

    @Override // com.my.target.p5
    public void a(Context context) {
        MediationAdapter mediationAdapter = this.d;
        if (mediationAdapter == null) {
            this.k.c();
            mi.b("MediationInterstitialAdEngine: Error - can't show ad, adapter is not set");
            return;
        }
        try {
            ((MediationInterstitialAdAdapter) mediationAdapter).show(context);
        } catch (Throwable th) {
            this.k.c();
            mi.b("MediationInterstitialAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.p5
    public void a(p5.b bVar) {
        this.m = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.my.target.lb
    public void a(MediationInterstitialAdAdapter mediationInterstitialAdAdapter, kb kbVar, Context context) {
        lb.a a2 = lb.a.a(kbVar.e(), kbVar.d(), kbVar.c(), this.a.h().getAge(), this.a.h().getGender(), MyTargetPrivacy.currentPrivacy(), TextUtils.isEmpty(this.h) ? null : this.a.a(this.h));
        if (mediationInterstitialAdAdapter instanceof MyTargetInterstitialAdAdapter) {
            x g = kbVar.g();
            if (g instanceof i9) {
                ((MyTargetInterstitialAdAdapter) mediationInterstitialAdAdapter).a((i9) g);
            }
        }
        try {
            mediationInterstitialAdAdapter.load(a2, new a(kbVar), context);
        } catch (Throwable th) {
            mi.b("MediationInterstitialAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.lb
    boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationInterstitialAdAdapter;
    }
}
