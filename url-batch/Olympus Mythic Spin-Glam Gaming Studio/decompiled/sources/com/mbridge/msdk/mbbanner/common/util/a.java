package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: BannerDelivery.java */
/* loaded from: classes13.dex */
public class a {
    private static final String c = "a";
    private final Handler a = new Handler(Looper.getMainLooper());
    private boolean b;

    /* compiled from: BannerDelivery.java */
    /* renamed from: com.mbridge.msdk.mbbanner.common.util.a$a, reason: collision with other inner class name */
    class RunnableC1431a implements Runnable {
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b a;
        final /* synthetic */ String b;
        final /* synthetic */ CampaignUnit c;

        RunnableC1431a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, CampaignUnit campaignUnit) {
            this.a = bVar;
            this.b = str;
            this.c = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.a;
            if (bVar != null) {
                bVar.a(this.b, this.c, a.this.b);
            }
        }
    }

    /* compiled from: BannerDelivery.java */
    class b implements Runnable {
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b a;
        final /* synthetic */ com.mbridge.msdk.foundation.error.b b;

        b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a != null) {
                this.b.a(a.this.b);
                this.a.a(this.b);
            }
        }
    }

    /* compiled from: BannerDelivery.java */
    class c implements Runnable {
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;

        c(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i) {
            this.a = bVar;
            this.b = str;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.a;
            if (bVar != null) {
                bVar.a(this.b, this.c, a.this.b);
            }
        }
    }

    /* compiled from: BannerDelivery.java */
    class d implements Runnable {
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b a;
        final /* synthetic */ com.mbridge.msdk.foundation.error.b b;

        d(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a != null) {
                this.b.a(a.this.b);
                this.a.b(this.b);
            }
        }
    }

    public void b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        q0.b(c, "postResourceFail unitId=" + bVar2);
        this.a.post(new d(bVar, bVar2));
    }

    public void a(boolean z) {
        this.b = z;
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, CampaignUnit campaignUnit, String str) {
        q0.b(c, "postCampaignSuccess unitId=" + str);
        this.a.post(new RunnableC1431a(bVar, str, campaignUnit));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        this.a.post(new b(bVar, bVar2));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i) {
        q0.b(c, "postResourceSuccess unitId=" + str);
        this.a.post(new c(bVar, str, i));
    }
}
