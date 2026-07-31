package com.five_corp.ad.internal.adselector;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.five_corp.ad.FiveAdErrorCode;
import com.five_corp.ad.internal.ad_check.e;
import com.five_corp.ad.internal.beacon.c;
import com.five_corp.ad.internal.context.d;
import com.five_corp.ad.internal.context.f;
import com.five_corp.ad.internal.context.g;
import com.five_corp.ad.internal.context.h;
import com.five_corp.ad.internal.context.i;
import com.five_corp.ad.internal.context.p;
import com.five_corp.ad.internal.context.q;
import com.five_corp.ad.internal.context.r;
import com.five_corp.ad.internal.context.s;
import com.five_corp.ad.internal.l;
import com.five_corp.ad.internal.m;
import com.five_corp.ad.internal.u;
import com.five_corp.ad.internal.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class a {
    public final d a;
    public final v b;
    public final r c;
    public final com.five_corp.ad.internal.hub.global.b d;
    public final Handler e = new Handler(Looper.getMainLooper());

    static {
        a.class.toString();
    }

    public a(d dVar, v vVar, r rVar, com.five_corp.ad.internal.time.a aVar, com.five_corp.ad.internal.hub.global.b bVar) {
        this.a = dVar;
        this.b = vVar;
        this.c = rVar;
        this.d = bVar;
    }

    public final void a(List list, i iVar, b bVar) {
        if (!list.isEmpty()) {
            a(((e) list.get(0)).a, iVar, bVar);
            return;
        }
        m mVar = m.e0;
        g gVar = iVar.b.a;
        this.d.a(new com.five_corp.ad.internal.logger.b(5, gVar, null, "DetailedErrorCode: AD_CHECK_ERROR_WIN_AD_LIST_EMPTY, information: null, exception: " + Log.getStackTraceString(null) + ", cause: null"));
        bVar.a(mVar.b);
    }

    public final void b(final List list, final i iVar, final b bVar) {
        this.e.post(new Runnable() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(list, iVar, bVar);
            }
        });
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(final f fVar, final s sVar, final com.five_corp.ad.internal.soundstate.a aVar, final b bVar) {
        this.e.post(new Runnable() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(fVar, sVar, aVar, bVar);
            }
        });
    }

    public final void a(g gVar, com.five_corp.ad.internal.soundstate.a aVar, b bVar, l lVar) {
        this.d.b(new c(null, gVar, lVar, aVar, 0L, null, null));
        bVar.a(lVar.a.b);
    }

    public final void a(i iVar, b bVar, com.five_corp.ad.internal.ad_check.a aVar) {
        int a = com.five_corp.ad.e.a(aVar.a);
        if (a == 0) {
            bVar.a(FiveAdErrorCode.NO_AD);
            return;
        }
        if (a == 1) {
            bVar.a(FiveAdErrorCode.SUPPRESSED);
        } else {
            if (a != 2) {
                return;
            }
            ArrayList arrayList = aVar.b;
            Objects.requireNonNull(arrayList);
            b(arrayList, iVar, bVar);
        }
    }

    public final void a(s sVar, b bVar, l lVar) {
        this.d.a(new com.five_corp.ad.internal.logger.b(5, sVar.a, null, lVar.a()));
        bVar.a(lVar.a.b);
    }

    public final void a(f fVar, final s sVar, com.five_corp.ad.internal.soundstate.a aVar, final b bVar) {
        if (fVar == f.NATIVE && !sVar.c.c) {
            g gVar = sVar.a;
            m mVar = m.G5;
            this.d.b(new c(null, gVar, new l(mVar, null, null), aVar, 0L, null, null));
            bVar.a(mVar.b);
            return;
        }
        final i iVar = new i(fVar, sVar, aVar, System.currentTimeMillis());
        new Thread(new u(this.b, iVar, new com.five_corp.ad.internal.ad_check.b() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda7
            @Override // com.five_corp.ad.internal.ad_check.b
            public final void a(l lVar) {
                a.this.a(sVar, bVar, lVar);
            }
        }, new com.five_corp.ad.internal.ad_check.c() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda6
            @Override // com.five_corp.ad.internal.ad_check.c
            public final void a(com.five_corp.ad.internal.ad_check.a aVar2) {
                a.this.a(iVar, bVar, aVar2);
            }
        })).start();
    }

    public final void a(i iVar, b bVar, l lVar) {
        this.d.b(new c(null, iVar.b.a, lVar, iVar.c, 0L, null, null));
        bVar.a(lVar.a.b);
    }

    public final void a(final g gVar, final f fVar, final com.five_corp.ad.internal.soundstate.a aVar, final b bVar) {
        r rVar = this.c;
        long currentTimeMillis = System.currentTimeMillis();
        rVar.a(new q() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda2
            @Override // com.five_corp.ad.internal.context.q
            public final void a(l lVar) {
                a.this.a(gVar, aVar, bVar, lVar);
            }
        }, gVar, new p() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda1
            @Override // com.five_corp.ad.internal.context.p
            public final void a(s sVar) {
                a.this.a(fVar, aVar, bVar, sVar);
            }
        }, currentTimeMillis, 10000L);
    }

    public final void a(com.five_corp.ad.internal.ad.a aVar, final i iVar, final b bVar) {
        d dVar = this.a;
        s sVar = iVar.b;
        f fVar = iVar.a;
        Objects.requireNonNull(bVar);
        dVar.a(aVar, null, sVar, fVar, new com.five_corp.ad.internal.context.b() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda3
            @Override // com.five_corp.ad.internal.context.b
            public final void a(h hVar) {
                b.this.a(hVar);
            }
        }, new com.five_corp.ad.internal.context.c() { // from class: com.five_corp.ad.internal.adselector.a$$ExternalSyntheticLambda4
            @Override // com.five_corp.ad.internal.context.c
            public final void a(l lVar) {
                a.this.a(iVar, bVar, lVar);
            }
        });
    }
}
