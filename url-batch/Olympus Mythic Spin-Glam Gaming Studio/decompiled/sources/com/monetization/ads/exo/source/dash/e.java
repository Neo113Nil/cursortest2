package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import yads.ag1;
import yads.cc2;
import yads.cg1;
import yads.e30;
import yads.ec2;
import yads.fg1;
import yads.gg1;
import yads.gh1;
import yads.h30;
import yads.r30;
import yads.rb3;
import yads.sb3;
import yads.sc2;
import yads.sm1;
import yads.u01;
import yads.wf1;
import yads.yl1;
import yads.zf1;

/* loaded from: classes4.dex */
public final class e implements zf1 {
    public final /* synthetic */ i b;

    public e(i iVar) {
        this.b = iVar;
    }

    @Override // yads.zf1
    public final void a(cg1 cg1Var, long j, long j2, boolean z) {
        ec2 ec2Var = (ec2) cg1Var;
        i iVar = this.b;
        iVar.getClass();
        long j3 = ec2Var.a;
        Uri uri = ec2Var.d.c;
        wf1 wf1Var = new wf1();
        iVar.n.getClass();
        sm1 sm1Var = iVar.q;
        sm1Var.a(wf1Var, new yl1(ec2Var.c, -1, null, 0, null, sm1Var.a(-9223372036854775807L), sm1Var.a(-9223372036854775807L)));
    }

    @Override // yads.zf1
    public final void a(cg1 cg1Var, long j, long j2) {
        long j3;
        ec2 ec2Var = (ec2) cg1Var;
        i iVar = this.b;
        iVar.getClass();
        long j4 = ec2Var.a;
        Uri uri = ec2Var.d.c;
        wf1 wf1Var = new wf1();
        iVar.n.getClass();
        sm1 sm1Var = iVar.q;
        sm1Var.b(wf1Var, new yl1(ec2Var.c, -1, null, 0, null, sm1Var.a(-9223372036854775807L), sm1Var.a(-9223372036854775807L)));
        e30 e30Var = (e30) ec2Var.f;
        e30 e30Var2 = iVar.H;
        int size = e30Var2 == null ? 0 : e30Var2.m.size();
        long j5 = ((sc2) e30Var.m.get(0)).b;
        int i = 0;
        while (i < size && ((sc2) iVar.H.m.get(i)).b < j5) {
            i++;
        }
        if (e30Var.d) {
            if (size - i > e30Var.m.size()) {
                gh1.d(DashMediaSource.DEFAULT_MEDIA_ID, "Loaded out of sync manifest");
            } else {
                long j6 = iVar.N;
                j3 = -9223372036854775807L;
                if (j6 != -9223372036854775807L && e30Var.h * 1000 <= j6) {
                    gh1.d(DashMediaSource.DEFAULT_MEDIA_ID, "Loaded stale dynamic manifest: " + e30Var.h + ", " + iVar.N);
                } else {
                    iVar.M = 0;
                }
            }
            int i2 = iVar.M;
            iVar.M = i2 + 1;
            if (i2 < iVar.n.a(ec2Var.c)) {
                iVar.D.postDelayed(iVar.v, Math.min((iVar.M - 1) * 1000, 5000));
                return;
            } else {
                iVar.C = new h30();
                return;
            }
        }
        j3 = -9223372036854775807L;
        iVar.H = e30Var;
        iVar.I = e30Var.d & iVar.I;
        iVar.J = j - j2;
        iVar.K = j;
        synchronized (iVar.t) {
            try {
                if (ec2Var.b.a == iVar.F) {
                    Uri uri2 = iVar.H.k;
                    if (uri2 == null) {
                        uri2 = ec2Var.d.c;
                    }
                    iVar.F = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (size == 0) {
            e30 e30Var3 = iVar.H;
            if (e30Var3.d) {
                rb3 rb3Var = e30Var3.i;
                if (rb3Var != null) {
                    String str = rb3Var.a;
                    if (!sb3.a(str, "urn:mpeg:dash:utc:direct:2014") && !sb3.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                        if (!sb3.a(str, "urn:mpeg:dash:utc:http-iso:2014") && !sb3.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                            if (!sb3.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !sb3.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                if (!sb3.a(str, "urn:mpeg:dash:utc:ntp:2014") && !sb3.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                    iVar.a(new IOException("Unsupported UTC timing scheme"));
                                    return;
                                } else {
                                    iVar.g();
                                    return;
                                }
                            }
                            ec2 ec2Var2 = new ec2(iVar.z, Uri.parse(rb3Var.b), 5, new h());
                            iVar.A.a(ec2Var2, new g(iVar), 1);
                            sm1 sm1Var2 = iVar.q;
                            sm1Var2.c(new wf1(ec2Var2.b), new yl1(ec2Var2.c, -1, null, 0, null, sm1Var2.a(j3), sm1Var2.a(j3)));
                            return;
                        }
                        ec2 ec2Var3 = new ec2(iVar.z, Uri.parse(rb3Var.b), 5, new d());
                        iVar.A.a(ec2Var3, new g(iVar), 1);
                        sm1 sm1Var3 = iVar.q;
                        sm1Var3.c(new wf1(ec2Var3.b), new yl1(ec2Var3.c, -1, null, 0, null, sm1Var3.a(j3), sm1Var3.a(j3)));
                        return;
                    }
                    try {
                        iVar.L = sb3.f(rb3Var.b) - iVar.K;
                        iVar.a(true);
                        return;
                    } catch (cc2 e) {
                        iVar.a(e);
                        return;
                    }
                }
                iVar.g();
                return;
            }
            iVar.a(true);
            return;
        }
        iVar.O += i;
        iVar.a(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    @Override // yads.zf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ag1 a(cg1 cg1Var, long j, long j2, IOException iOException, int i) {
        long j3;
        ag1 ag1Var;
        boolean z;
        ec2 ec2Var = (ec2) cg1Var;
        i iVar = this.b;
        iVar.getClass();
        long j4 = ec2Var.a;
        Uri uri = ec2Var.d.c;
        wf1 wf1Var = new wf1();
        iVar.n.getClass();
        if (!(iOException instanceof cc2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof u01) && !(iOException instanceof fg1)) {
            int i2 = r30.c;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof r30) || ((r30) th).b != 2008) {
                }
            }
            j3 = Math.min((i - 1) * 1000, 5000);
            if (j3 != -9223372036854775807L) {
                ag1Var = gg1.e;
            } else {
                ag1Var = new ag1(0, j3);
            }
            int i3 = ag1Var.a;
            z = i3 != 0 || i3 == 1;
            sm1 sm1Var = iVar.q;
            sm1Var.a(wf1Var, new yl1(ec2Var.c, -1, null, 0, null, sm1Var.a(-9223372036854775807L), sm1Var.a(-9223372036854775807L)), iOException, true ^ z);
            if (!z) {
                iVar.n.getClass();
            }
            return ag1Var;
        }
        j3 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
        }
        int i32 = ag1Var.a;
        if (i32 != 0) {
        }
        sm1 sm1Var2 = iVar.q;
        sm1Var2.a(wf1Var, new yl1(ec2Var.c, -1, null, 0, null, sm1Var2.a(-9223372036854775807L), sm1Var2.a(-9223372036854775807L)), iOException, true ^ z);
        if (!z) {
        }
        return ag1Var;
    }
}
