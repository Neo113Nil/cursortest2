package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class kt1 extends fo implements Handler.Callback {
    public final it1 n;
    public final un0 o;
    public final Handler p;
    public final jt1 q;
    public sz2 r;
    public boolean s;
    public boolean t;
    public long u;
    public long v;
    public ht1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt1(un0 un0Var, Looper looper) {
        super(5);
        it1 it1Var = it1.a;
        this.o = un0Var;
        this.p = looper == null ? null : sb3.a(looper, (Handler.Callback) this);
        this.n = it1Var;
        this.q = new jt1();
        this.v = -9223372036854775807L;
    }

    public final void a(ht1 ht1Var, ArrayList arrayList) {
        String str;
        sz2 efVar;
        int i = 0;
        while (true) {
            gt1[] gt1VarArr = ht1Var.b;
            if (i >= gt1VarArr.length) {
                return;
            }
            jw0 a = gt1VarArr[i].a();
            if (a != null) {
                this.n.getClass();
                String str2 = a.m;
                if ("application/id3".equals(str2) || "application/x-emsg".equals(str2) || "application/x-scte35".equals(str2) || "application/x-icy".equals(str2) || "application/vnd.dvb.ait".equals(str2)) {
                    this.n.getClass();
                    str = a.m;
                    if (str != null) {
                        switch (str) {
                            case "application/vnd.dvb.ait":
                                efVar = new ef();
                                break;
                            case "application/x-icy":
                                efVar = new r11();
                                break;
                            case "application/id3":
                                efVar = new y11();
                                break;
                            case "application/x-emsg":
                                efVar = new zm0();
                                break;
                            case "application/x-scte35":
                                efVar = new v23();
                                break;
                        }
                        byte[] b = ht1Var.b[i].b();
                        b.getClass();
                        this.q.b();
                        this.q.c(b.length);
                        this.q.d.put(b);
                        this.q.c();
                        ht1 a2 = efVar.a(this.q);
                        if (a2 != null) {
                            a(a2, arrayList);
                        }
                        i++;
                    }
                }
            }
            arrayList.add(ht1Var.b[i]);
            i++;
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
    }

    @Override // yads.fo
    public final String c() {
        return "MetadataRenderer";
    }

    @Override // yads.fo
    public final boolean e() {
        return this.t;
    }

    @Override // yads.fo
    public final boolean f() {
        return true;
    }

    @Override // yads.fo
    public final void g() {
        this.w = null;
        this.v = -9223372036854775807L;
        this.r = null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.o.a((ht1) message.obj);
        return true;
    }

    @Override // yads.fo
    public final int a(jw0 jw0Var) {
        this.n.getClass();
        String str = jw0Var.m;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return fo.a(0, 0, 0);
        }
        return fo.a(jw0Var.F == 0 ? 4 : 2, 0, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r1.equals("application/vnd.dvb.ait") == false) goto L6;
     */
    @Override // yads.fo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(jw0[] jw0VarArr, long j, long j2) {
        sz2 efVar;
        it1 it1Var = this.n;
        char c = 0;
        jw0 jw0Var = jw0VarArr[0];
        it1Var.getClass();
        String str = jw0Var.m;
        if (str != null) {
            switch (str.hashCode()) {
                case -1354451219:
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    efVar = new ef();
                    break;
                case 1:
                    efVar = new r11();
                    break;
                case 2:
                    efVar = new y11();
                    break;
                case 3:
                    efVar = new zm0();
                    break;
                case 4:
                    efVar = new v23();
                    break;
            }
            this.r = efVar;
            return;
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
    }

    @Override // yads.fo
    public final void a(long j, boolean z) {
        this.w = null;
        this.v = -9223372036854775807L;
        this.s = false;
        this.t = false;
    }

    @Override // yads.fo
    public final void a(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.s && this.w == null) {
                this.q.b();
                kw0 kw0Var = this.c;
                kw0Var.a = null;
                kw0Var.b = null;
                int a = a(kw0Var, this.q, 0);
                if (a == -4) {
                    if (this.q.b(4)) {
                        this.s = true;
                    } else {
                        jt1 jt1Var = this.q;
                        jt1Var.i = this.u;
                        jt1Var.c();
                        sz2 sz2Var = this.r;
                        int i = sb3.a;
                        ht1 a2 = sz2Var.a(this.q);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.b.length);
                            a(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.w = new ht1(arrayList);
                                this.v = this.q.f;
                            }
                        }
                    }
                } else if (a == -5) {
                    jw0 jw0Var = kw0Var.b;
                    jw0Var.getClass();
                    this.u = jw0Var.q;
                }
            }
            ht1 ht1Var = this.w;
            if (ht1Var == null || this.v > j) {
                z = false;
            } else {
                Handler handler = this.p;
                if (handler != null) {
                    handler.obtainMessage(0, ht1Var).sendToTarget();
                } else {
                    this.o.a(ht1Var);
                }
                this.w = null;
                this.v = -9223372036854775807L;
                z = true;
            }
            if (this.s && this.w == null) {
                this.t = true;
            }
        }
    }
}
