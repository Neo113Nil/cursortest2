package com.five_corp.ad.internal.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import android.widget.FrameLayout;
import androidx.core.widget.TextViewCompat;
import androidx.media3.common.MediaItem;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class v extends u implements com.five_corp.ad.internal.movie.a {
    public final Object i;
    public int j;
    public final com.five_corp.ad.internal.movie.exoplayer.a k;
    public boolean l;
    public boolean m;
    public final com.five_corp.ad.internal.ad.f n;
    public final com.five_corp.ad.internal.ad.f o;

    public v(Context context, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.f fVar, com.five_corp.ad.internal.hub.ad_instance.e eVar) {
        super(context, hVar, fVar, eVar);
        com.five_corp.ad.internal.movie.exoplayer.a aVar;
        System.identityHashCode(this);
        this.i = new Object();
        this.l = true;
        this.m = false;
        C3848h c3848h = this.c;
        com.five_corp.ad.internal.cache.p pVar = hVar.f;
        com.five_corp.ad.internal.cache.n nVar = (com.five_corp.ad.internal.cache.n) pVar.a.get(hVar.a.h);
        TextureView textureView = new TextureView(context);
        E e = new E(context, this, c3848h, hVar.g, hVar.a.j, textureView, eVar);
        int ordinal = hVar.h.ordinal();
        if (ordinal == 1) {
            aVar = new com.five_corp.ad.internal.movie.exoplayer.a(new com.five_corp.ad.internal.movie.exoplayer.l(context, textureView, e, MediaItem.fromUri(hVar.a.h.a), hVar.a.e), this);
        } else {
            if (ordinal != 2) {
                throw new RuntimeException("Unreachable only for compiler.");
            }
            com.five_corp.ad.internal.storage.a aVar2 = nVar.c;
            com.five_corp.ad.internal.storage.b bVar = aVar2.a;
            String str = aVar2.b;
            bVar.getClass();
            aVar = new com.five_corp.ad.internal.movie.exoplayer.a(new com.five_corp.ad.internal.movie.exoplayer.l(context, textureView, e, MediaItem.fromUri(new File(bVar.a, str).getAbsolutePath()), hVar.a.e), this);
        }
        this.k = aVar;
        this.j = 2;
        com.five_corp.ad.internal.ad.c cVar = hVar.a.C;
        if (cVar == null || cVar.a != 2) {
            return;
        }
        com.five_corp.ad.internal.ad.f fVar2 = new com.five_corp.ad.internal.ad.f(getContext());
        this.n = fVar2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        fVar2.setLayoutParams(layoutParams);
        fVar2.setGravity(17);
        fVar2.setTextColor(-16777216);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(fVar2, 1);
        addView(fVar2);
        com.five_corp.ad.internal.ad.f fVar3 = new com.five_corp.ad.internal.ad.f(getContext());
        this.o = fVar3;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        fVar3.setLayoutParams(layoutParams2);
        fVar3.setGravity(17);
        fVar2.setTextColor(-16777216);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(fVar3, 1);
        addView(fVar3);
    }

    @Override // com.five_corp.ad.internal.view.u
    public final void a(boolean z) {
        if (this.l == z) {
            return;
        }
        this.l = z;
        this.k.b(z);
    }

    @Override // com.five_corp.ad.internal.view.u
    public final boolean b() {
        return this.j == 5;
    }

    @Override // com.five_corp.ad.internal.view.u
    public final void c() {
        this.k.m();
    }

    @Override // com.five_corp.ad.internal.view.u
    public final void d() {
        this.k.n();
    }

    @Override // com.five_corp.ad.internal.view.u, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("com.five_corp.ad", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.five_corp.ad.internal.view.u
    public final void e() {
        int i = this.j;
        if (i == 1 || i == 2) {
            return;
        }
        this.j = 2;
        this.m = false;
        this.k.a();
    }

    @Override // com.five_corp.ad.internal.view.u
    public final void f() {
        synchronized (this.i) {
            this.m = !this.m;
        }
    }

    @Override // com.five_corp.ad.internal.view.u
    public int getCurrentPositionMs() {
        return this.k.a.b();
    }

    @Override // com.five_corp.ad.internal.movie.a
    public final void a() {
        int i = this.j;
        if (i == 1 || i == 5) {
            return;
        }
        this.j = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    @Override // com.five_corp.ad.internal.view.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.five_corp.ad.internal.viewability.c cVar) {
        long j;
        boolean z = cVar.a(this.b.a.v) && !this.m;
        if (!z && this.j == 3) {
            this.k.l();
        } else if (z && this.j == 4) {
            this.k.o();
        }
        if (this.j == 3) {
            com.five_corp.ad.f fVar = this.d;
            int currentPositionMs = getCurrentPositionMs();
            long j2 = currentPositionMs;
            Iterator it = fVar.t.a.iterator();
            while (it.hasNext()) {
                com.five_corp.ad.internal.beacon.e eVar = (com.five_corp.ad.internal.beacon.e) it.next();
                if (!eVar.f) {
                    com.five_corp.ad.internal.ad.beacon.a aVar = eVar.b;
                    if (aVar.a == 1) {
                        if (aVar.b != 3) {
                            if (eVar.e) {
                                long j3 = eVar.c;
                                if (j2 >= j3) {
                                    eVar.d += j2 - j3;
                                    j = eVar.d;
                                    if (j >= aVar.c) {
                                        eVar.f = true;
                                        eVar.g.a(j, aVar);
                                    }
                                    eVar.c = j2;
                                }
                            }
                            eVar.e = true;
                            j = eVar.d;
                            if (j >= aVar.c) {
                            }
                            eVar.c = j2;
                        } else if (j2 >= aVar.c) {
                            eVar.f = true;
                            eVar.g.a(j2, aVar);
                        }
                    }
                }
            }
            com.five_corp.ad.internal.layouter.i iVar = fVar.x;
            com.five_corp.ad.internal.layouter.g gVar = iVar.b;
            iVar.a(com.five_corp.ad.internal.layouter.g.a(currentPositionMs, gVar.c, gVar.e, gVar.f, gVar.g));
        }
        com.five_corp.ad.internal.ad.f fVar2 = this.n;
        if (fVar2 != null) {
            fVar2.setText(cVar.a());
        }
        com.five_corp.ad.internal.ad.f fVar3 = this.o;
        if (fVar3 != null) {
            fVar3.setText(cVar.a());
        }
    }
}
