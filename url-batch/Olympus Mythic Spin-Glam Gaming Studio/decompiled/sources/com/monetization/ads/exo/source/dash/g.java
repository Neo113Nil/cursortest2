package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import java.io.IOException;
import yads.ag1;
import yads.cg1;
import yads.ec2;
import yads.gg1;
import yads.sm1;
import yads.wf1;
import yads.yl1;
import yads.zf1;

/* loaded from: classes4.dex */
public final class g implements zf1 {
    public final /* synthetic */ i b;

    public g(i iVar) {
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
        ec2 ec2Var = (ec2) cg1Var;
        i iVar = this.b;
        iVar.getClass();
        long j3 = ec2Var.a;
        Uri uri = ec2Var.d.c;
        wf1 wf1Var = new wf1();
        iVar.n.getClass();
        sm1 sm1Var = iVar.q;
        sm1Var.b(wf1Var, new yl1(ec2Var.c, -1, null, 0, null, sm1Var.a(-9223372036854775807L), sm1Var.a(-9223372036854775807L)));
        iVar.L = ((Long) ec2Var.f).longValue() - j;
        iVar.a(true);
    }

    @Override // yads.zf1
    public final ag1 a(cg1 cg1Var, long j, long j2, IOException iOException, int i) {
        ec2 ec2Var = (ec2) cg1Var;
        i iVar = this.b;
        sm1 sm1Var = iVar.q;
        long j3 = ec2Var.a;
        Uri uri = ec2Var.d.c;
        sm1Var.a(new wf1(), new yl1(ec2Var.c, -1, null, 0, null, sm1Var.a(-9223372036854775807L), sm1Var.a(-9223372036854775807L)), iOException, true);
        iVar.n.getClass();
        iVar.a(iOException);
        return gg1.d;
    }
}
