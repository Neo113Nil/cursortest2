package yads;

import android.os.Handler;
import android.os.Message;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public final class cf2 implements Handler.Callback {
    public final ub0 b;
    public final com.monetization.ads.exo.source.dash.c c;
    public e30 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final TreeMap f = new TreeMap();
    public final Handler e = sb3.a(this);
    public final zm0 d = new zm0();

    public cf2(e30 e30Var, com.monetization.ads.exo.source.dash.c cVar, ub0 ub0Var) {
        this.g = e30Var;
        this.c = cVar;
        this.b = ub0Var;
    }

    public final boolean a(long j) {
        boolean z;
        e30 e30Var = this.g;
        if (!e30Var.d) {
            return false;
        }
        if (this.i) {
            return true;
        }
        Map.Entry ceilingEntry = this.f.ceilingEntry(Long.valueOf(e30Var.h));
        if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= j) {
            z = false;
        } else {
            long longValue = ((Long) ceilingEntry.getKey()).longValue();
            com.monetization.ads.exo.source.dash.i iVar = this.c.a;
            long j2 = iVar.N;
            if (j2 == -9223372036854775807L || j2 < longValue) {
                iVar.N = longValue;
            }
            z = true;
        }
        if (z && this.h) {
            this.i = true;
            this.h = false;
            com.monetization.ads.exo.source.dash.i iVar2 = this.c.a;
            iVar2.D.removeCallbacks(iVar2.w);
            iVar2.h();
        }
        return z;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        af2 af2Var = (af2) message.obj;
        long j = af2Var.a;
        long j2 = af2Var.b;
        Long l = (Long) this.f.get(Long.valueOf(j2));
        if (l == null) {
            this.f.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f.put(Long.valueOf(j2), Long.valueOf(j));
        }
        return true;
    }
}
