package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.my.target.ads.MyTargetView;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.common.models.IAdLoadingError;
import com.my.target.lb;
import com.my.target.mediation.MediationAdapter;
import com.my.target.mediation.MediationStandardAdAdapter;
import com.my.target.mediation.MyTargetStandardAdAdapter;
import com.my.target.s5;
import com.my.target.tb;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class sb extends lb implements s5 {
    final MyTargetView k;
    s5.a l;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements MediationStandardAdAdapter.MediationStandardAdListener {
        private final kb a;

        a(kb kbVar) {
            this.a = kbVar;
        }

        @Override // com.my.target.mediation.MediationStandardAdAdapter.MediationStandardAdListener
        public void onClick(MediationStandardAdAdapter mediationStandardAdAdapter) {
            if (sb.this.d != mediationStandardAdAdapter) {
                return;
            }
            wh.b(this.a.h(), "click", 2);
            s5.a aVar = sb.this.l;
            if (aVar != null) {
                aVar.c();
            }
        }

        @Override // com.my.target.mediation.MediationStandardAdAdapter.MediationStandardAdListener
        public void onLoad(View view, MediationStandardAdAdapter mediationStandardAdAdapter) {
            if (sb.this.d != mediationStandardAdAdapter) {
                return;
            }
            mi.a("MediationStandardAdEngine: Data from " + this.a.b() + " ad network loaded successfully");
            sb.this.a(this.a, true);
            sb.this.a(view);
            s5.a aVar = sb.this.l;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.my.target.mediation.MediationStandardAdAdapter.MediationStandardAdListener
        public void onNoAd(IAdLoadingError iAdLoadingError, MediationStandardAdAdapter mediationStandardAdAdapter) {
            if (sb.this.d != mediationStandardAdAdapter) {
                return;
            }
            mi.a("MediationStandardAdEngine: No data from " + this.a.b() + " ad network - " + iAdLoadingError);
            sb.this.a(this.a, false);
        }

        @Override // com.my.target.mediation.MediationStandardAdAdapter.MediationStandardAdListener
        public void onShow(MediationStandardAdAdapter mediationStandardAdAdapter) {
            if (sb.this.d != mediationStandardAdAdapter) {
                return;
            }
            wh.b(this.a.h(), "show", 1);
            s5.a aVar = sb.this.l;
            if (aVar != null) {
                aVar.f();
            }
        }
    }

    private sb(MyTargetView myTargetView, jb jbVar, n nVar, tb.a aVar) {
        super(jbVar, nVar, aVar);
        this.k = myTargetView;
    }

    @Override // com.my.target.s5
    public void a(MyTargetView.AdSize adSize) {
    }

    @Override // com.my.target.s5
    public void destroy() {
        if (this.d == null) {
            mi.b("MediationStandardAdEngine: Error - can't destroy ad, adapter is not set");
            return;
        }
        this.k.removeAllViews();
        try {
            ((MediationStandardAdAdapter) this.d).destroy();
        } catch (Throwable th) {
            mi.b("MediationStandardAdEngine: Error - " + th);
        }
        this.d = null;
    }

    @Override // com.my.target.lb
    void h() {
        s5.a aVar = this.l;
        if (aVar != null) {
            aVar.a(q.v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.my.target.lb
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public MediationStandardAdAdapter i() {
        return new MyTargetStandardAdAdapter();
    }

    @Override // com.my.target.s5
    public void pause() {
    }

    @Override // com.my.target.s5
    public void prepare() {
        super.b(this.k.getContext());
    }

    @Override // com.my.target.s5
    public void resume() {
    }

    @Override // com.my.target.s5
    public void start() {
    }

    @Override // com.my.target.s5
    public void stop() {
    }

    public static sb a(MyTargetView myTargetView, jb jbVar, n nVar, tb.a aVar) {
        return new sb(myTargetView, jbVar, nVar, aVar);
    }

    @Override // com.my.target.s5
    public void a(s5.a aVar) {
        this.l = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.my.target.lb
    public void a(MediationStandardAdAdapter mediationStandardAdAdapter, kb kbVar, Context context) {
        lb.a a2 = lb.a.a(kbVar.e(), kbVar.d(), kbVar.c(), this.a.h().getAge(), this.a.h().getGender(), MyTargetPrivacy.currentPrivacy(), TextUtils.isEmpty(this.h) ? null : this.a.a(this.h));
        if (mediationStandardAdAdapter instanceof MyTargetStandardAdAdapter) {
            x g = kbVar.g();
            if (g instanceof nh) {
                ((MyTargetStandardAdAdapter) mediationStandardAdAdapter).a((nh) g);
            }
        }
        try {
            mediationStandardAdAdapter.load(a2, this.k.getSize(), new a(kbVar), context);
        } catch (Throwable th) {
            mi.b("MediationStandardAdEngine: Error - " + th);
        }
    }

    @Override // com.my.target.lb
    boolean a(MediationAdapter mediationAdapter) {
        return mediationAdapter instanceof MediationStandardAdAdapter;
    }

    void a(View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        view.setLayoutParams(layoutParams);
        this.k.removeAllViews();
        this.k.addView(view);
    }
}
