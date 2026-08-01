package l1;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import m1.m;
import m1.n;
import p1.k;
import p1.o;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3181f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i) {
        super(str, true);
        this.f3180e = i;
        this.f3181f = obj;
    }

    @Override // l1.a
    public final long a() {
        switch (this.f3180e) {
            case 0:
                ((k) this.f3181f).a();
                return -1L;
            case 1:
                n nVar = (n) this.f3181f;
                long nanoTime = System.nanoTime();
                Iterator it = nVar.d.iterator();
                int i = 0;
                long j2 = Long.MIN_VALUE;
                m mVar = null;
                int i2 = 0;
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    X0.d.d(mVar2, "connection");
                    synchronized (mVar2) {
                        if (nVar.b(mVar2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j3 = nanoTime - mVar2.f3261q;
                            if (j3 > j2) {
                                mVar = mVar2;
                                j2 = j3;
                            }
                        }
                    }
                }
                long j4 = nVar.f3262a;
                if (j2 < j4 && i <= 5) {
                    if (i > 0) {
                        return j4 - j2;
                    }
                    if (i2 > 0) {
                        return j4;
                    }
                    return -1L;
                }
                X0.d.b(mVar);
                synchronized (mVar) {
                    if (!mVar.f3260p.isEmpty()) {
                        return 0L;
                    }
                    if (mVar.f3261q + j2 != nanoTime) {
                        return 0L;
                    }
                    mVar.f3254j = true;
                    nVar.d.remove(mVar);
                    Socket socket = mVar.d;
                    X0.d.b(socket);
                    j1.b.c(socket);
                    if (!nVar.d.isEmpty()) {
                        return 0L;
                    }
                    nVar.f3263b.a();
                    return 0L;
                }
            default:
                o oVar = (o) this.f3181f;
                oVar.getClass();
                try {
                    oVar.f3465w.j(2, 0, false);
                    return -1L;
                } catch (IOException e2) {
                    oVar.e(2, 2, e2);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, String str) {
        super(str, true);
        this.f3180e = 1;
        this.f3181f = nVar;
    }
}
