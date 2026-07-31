package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Looper;
import android.util.Log;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.X3;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes5.dex */
public final class g {
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h b;
    public final f c;
    public final l d;
    public final CopyOnWriteArraySet e;
    public final w f;
    public final v g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public x m;
    public Object n;
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h o;
    public s p;
    public i q;
    public int r;
    public long s;

    public g(a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, c cVar) {
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + z.e + X3.j.e);
        if (aVarArr.length <= 0) {
            throw new IllegalStateException();
        }
        this.a = dVar;
        this.i = false;
        this.j = 1;
        this.e = new CopyOnWriteArraySet();
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h(new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[aVarArr.length]);
        this.b = hVar;
        this.m = x.a;
        this.f = new w();
        this.g = new v();
        int i = com.fyber.inneractive.sdk.player.exoplayer2.source.z.d;
        this.o = hVar;
        this.p = s.d;
        f fVar = new f(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.c = fVar;
        i iVar = new i(0, 0L);
        this.q = iVar;
        this.d = new l(aVarArr, dVar, cVar, this.i, fVar, iVar, this);
    }

    public final void a(boolean z) {
        if (this.i != z) {
            this.i = z;
            this.d.f.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a(this.j, z);
            }
        }
    }

    public final void a(int i, long j) {
        if (i >= 0 && (this.m.c() || i < this.m.b())) {
            this.k++;
            this.r = i;
            if (!this.m.c()) {
                this.m.a(i, this.f, 0L);
                long j2 = j == -9223372036854775807L ? this.f.e : j;
                w wVar = this.f;
                int i2 = wVar.c;
                long j3 = wVar.g;
                int i3 = b.a;
                long j4 = (j2 == -9223372036854775807L ? -9223372036854775807L : j2 * 1000) + j3;
                long j5 = this.m.a(i2, this.g, false).d;
                while (j5 != -9223372036854775807L && j4 >= j5 && i2 < this.f.d) {
                    j4 -= j5;
                    i2++;
                    j5 = this.m.a(i2, this.g, false).d;
                }
            }
            if (j == -9223372036854775807L) {
                this.s = 0L;
                this.d.f.obtainMessage(3, new j(this.m, i, -9223372036854775807L)).sendToTarget();
                return;
            }
            this.s = j;
            l lVar = this.d;
            x xVar = this.m;
            int i4 = b.a;
            lVar.f.obtainMessage(3, new j(xVar, i, j != -9223372036854775807L ? j * 1000 : -9223372036854775807L)).sendToTarget();
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).getClass();
            }
            return;
        }
        throw new q();
    }

    public final void a(e... eVarArr) {
        l lVar = this.d;
        if (lVar.q) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            lVar.f.obtainMessage(11, eVarArr).sendToTarget();
        }
    }

    public final int a() {
        if (!this.m.c() && this.k <= 0) {
            return this.m.a(this.q.a, this.g, false).c;
        }
        return this.r;
    }
}
