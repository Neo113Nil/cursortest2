package com.mbridge.msdk.video.module.listener.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: DefaultImageLoaderListener.java */
/* loaded from: classes5.dex */
public class e implements com.mbridge.msdk.foundation.same.image.c {
    protected ImageView a;
    private CampaignEx b;
    private String c;

    /* compiled from: DefaultImageLoaderListener.java */
    class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.n a = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                if (e.this.b == null) {
                    q0.a("ImageLoaderListener", "campaign is null");
                    return;
                }
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                nVar.j("2000044");
                nVar.c(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
                nVar.b(e.this.b.getId());
                nVar.i(e.this.b.getImageUrl());
                nVar.n(e.this.b.getRequestId());
                nVar.o(e.this.b.getRequestIdNotice());
                nVar.u(e.this.c);
                nVar.m(this.a);
                a.a(nVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public e(ImageView imageView) {
        this.a = imageView;
    }

    @Override // com.mbridge.msdk.foundation.same.image.c
    public void onFailedLoad(String str, String str2) {
        a aVar = new a(str);
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
        q0.b("ImageLoaderListener", "desc:" + str);
    }

    @Override // com.mbridge.msdk.foundation.same.image.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        try {
            if (bitmap == null) {
                q0.b("ImageLoaderListener", "bitmap=null");
            } else {
                if (this.a == null || bitmap.isRecycled()) {
                    return;
                }
                this.a.setImageBitmap(bitmap);
                this.a.setVisibility(0);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    public e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.a = imageView;
        this.b = campaignEx;
        this.c = str;
    }
}
