package A1;

import B1.n;
import E1.m;
import E1.q;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f29e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i) {
        super(str, true);
        this.f29e = i;
        this.f30f = obj;
    }

    @Override // A1.a
    public final long a() {
        switch (this.f29e) {
            case 0:
                ((m) this.f30f).c();
                return -1L;
            case 1:
                n nVar = (n) this.f30f;
                long nanoTime = System.nanoTime();
                Iterator it = nVar.d.iterator();
                int i = 0;
                long j2 = Long.MIN_VALUE;
                B1.m mVar = null;
                int i2 = 0;
                while (it.hasNext()) {
                    B1.m mVar2 = (B1.m) it.next();
                    i1.f.d(mVar2, "connection");
                    synchronized (mVar2) {
                        if (nVar.b(mVar2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j3 = nanoTime - mVar2.f216q;
                            if (j3 > j2) {
                                mVar = mVar2;
                                j2 = j3;
                            }
                        }
                    }
                }
                long j4 = nVar.f217a;
                if (j2 < j4 && i <= 5) {
                    if (i > 0) {
                        return j4 - j2;
                    }
                    if (i2 > 0) {
                        return j4;
                    }
                    return -1L;
                }
                i1.f.b(mVar);
                synchronized (mVar) {
                    if (!mVar.f215p.isEmpty()) {
                        return 0L;
                    }
                    if (mVar.f216q + j2 != nanoTime) {
                        return 0L;
                    }
                    mVar.f209j = true;
                    nVar.d.remove(mVar);
                    Socket socket = mVar.d;
                    i1.f.b(socket);
                    y1.b.c(socket);
                    if (!nVar.d.isEmpty()) {
                        return 0L;
                    }
                    nVar.f218b.a();
                    return 0L;
                }
            default:
                q qVar = (q) this.f30f;
                qVar.getClass();
                try {
                    qVar.f357w.D(2, 0, false);
                    return -1L;
                } catch (IOException e2) {
                    qVar.a(2, 2, e2);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, String str) {
        super(str, true);
        this.f29e = 1;
        this.f30f = nVar;
    }
}
