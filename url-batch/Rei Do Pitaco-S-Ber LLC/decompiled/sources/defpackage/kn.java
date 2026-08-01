package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class kn extends k40 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kn(int i, Object obj, String str) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.k40
    public final long a() {
        int i = 0;
        switch (this.e) {
            case 0:
                mn mnVar = (mn) this.f;
                mnVar.getClass();
                try {
                    mnVar.B.r(2, 0, false);
                } catch (IOException e) {
                    mnVar.m(2, 2, e);
                }
                return -1L;
            case 1:
                xx xxVar = (xx) this.f;
                long nanoTime = System.nanoTime();
                Iterator it = xxVar.d.iterator();
                long j = Long.MIN_VALUE;
                wx wxVar = null;
                int i2 = 0;
                while (it.hasNext()) {
                    wx wxVar2 = (wx) it.next();
                    wxVar2.getClass();
                    synchronized (wxVar2) {
                        if (xxVar.b(wxVar2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = nanoTime - wxVar2.q;
                            if (j2 > j) {
                                wxVar = wxVar2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = xxVar.a;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                wxVar.getClass();
                synchronized (wxVar) {
                    if (!wxVar.p.isEmpty()) {
                        return 0L;
                    }
                    if (wxVar.q + j != nanoTime) {
                        return 0L;
                    }
                    wxVar.j = true;
                    xxVar.d.remove(wxVar);
                    Socket socket = wxVar.d;
                    socket.getClass();
                    z60.c(socket);
                    if (!xxVar.d.isEmpty()) {
                        return 0L;
                    }
                    xxVar.b.a();
                    return 0L;
                }
            default:
                ((dl) this.f).a();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(xx xxVar, String str) {
        super(str, true);
        this.e = 1;
        this.f = xxVar;
    }
}
