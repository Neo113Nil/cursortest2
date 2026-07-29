package o;

import java.util.ArrayList;
import java.util.UUID;

/* renamed from: o.rD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1812rD {
    public final C1347k9 a;
    public NB b;
    public final ArrayList c;

    public C1812rD() {
        String uuid = UUID.randomUUID().toString();
        AbstractC0048Bt.m(uuid, "randomUUID().toString()");
        C1347k9 c1347k9 = C1347k9.k;
        this.a = C1097gL.d0(uuid);
        this.b = C1944tD.e;
        this.c = new ArrayList();
    }
}
