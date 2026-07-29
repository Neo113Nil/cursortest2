package o;

import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public final class DF {
    public final C1334k a = new C1334k(7);
    public final Y1 b = new Y1(12);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final C1574nc e = new C1574nc(19);
    public final boolean f = true;
    public final HO g;
    public final boolean h;
    public final boolean i;
    public final HO j;
    public final HO k;
    public final HO l;
    public final SocketFactory m;
    public final List n;

    /* renamed from: o, reason: collision with root package name */
    public final List f28o;
    public final CF p;
    public final C2099va q;
    public int r;
    public int s;
    public int t;

    public DF() {
        HO ho = HO.l;
        this.g = ho;
        this.h = true;
        this.i = true;
        this.j = HO.n;
        this.k = HO.r;
        this.l = ho;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC0048Bt.m(socketFactory, "getDefault()");
        this.m = socketFactory;
        this.n = EF.H;
        this.f28o = EF.G;
        this.p = CF.a;
        this.q = C2099va.c;
        this.r = 10000;
        this.s = 10000;
        this.t = 10000;
    }
}
