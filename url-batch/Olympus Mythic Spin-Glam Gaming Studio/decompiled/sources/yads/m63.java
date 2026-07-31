package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class m63 extends fo implements Handler.Callback {
    public int A;
    public long B;
    public final Handler n;
    public final un0 o;
    public final f53 p;
    public final kw0 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public jw0 v;
    public d53 w;
    public g53 x;
    public h53 y;
    public h53 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m63(un0 un0Var, Looper looper) {
        super(3);
        f53 f53Var = f53.a;
        this.o = un0Var;
        this.n = looper == null ? null : sb3.a(looper, (Handler.Callback) this);
        this.p = f53Var;
        this.q = new kw0();
        this.B = -9223372036854775807L;
    }

    @Override // yads.fo
    public final int a(jw0 jw0Var) {
        this.p.getClass();
        String str = jw0Var.m;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || MimeTypes.TEXT_EXOPLAYER_CUES.equals(str)) {
            return fo.a(jw0Var.F == 0 ? 4 : 2, 0, 0);
        }
        return vt1.e(jw0Var.m) ? fo.a(1, 0, 0) : fo.a(0, 0, 0);
    }

    @Override // yads.fo
    public final String c() {
        return "TextRenderer";
    }

    @Override // yads.fo
    public final boolean e() {
        return this.s;
    }

    @Override // yads.fo
    public final boolean f() {
        return true;
    }

    @Override // yads.fo
    public final void g() {
        this.v = null;
        this.B = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        Handler handler = this.n;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.o.a(emptyList);
            this.o.a(new u20(emptyList));
        }
        o();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List list = (List) message.obj;
        this.o.a(list);
        this.o.a(new u20(list));
        return true;
    }

    public final long l() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        this.y.getClass();
        if (this.A >= this.y.a()) {
            return Long.MAX_VALUE;
        }
        return this.y.a(this.A);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0097, code lost:
    
        if (r1.equals("application/pgs") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        d53 ll0Var;
        char c = 1;
        this.t = true;
        f53 f53Var = this.p;
        jw0 jw0Var = this.v;
        jw0Var.getClass();
        f53Var.getClass();
        String str = jw0Var.m;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248334819:
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1201784583:
                    if (str.equals(MimeTypes.TEXT_EXOPLAYER_CUES)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c = 11;
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
                    ll0Var = new ll0(jw0Var.o);
                    break;
                case 1:
                    ll0Var = new xc2();
                    break;
                case 2:
                    ll0Var = new zv1();
                    break;
                case 3:
                    ll0Var = new so3();
                    break;
                case 4:
                    ll0Var = new la3(jw0Var.o);
                    break;
                case 5:
                    ll0Var = new l33(jw0Var.o);
                    break;
                case 6:
                case '\b':
                    ll0Var = new gt(jw0Var.E, str);
                    break;
                case 7:
                    ll0Var = new cp0();
                    break;
                case '\t':
                    ll0Var = new lt(jw0Var.E, jw0Var.o);
                    break;
                case '\n':
                    ll0Var = new a53();
                    break;
                case 11:
                    ll0Var = new fa3();
                    break;
            }
            this.w = ll0Var;
            return;
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
    }

    public final void n() {
        this.x = null;
        this.A = -1;
        h53 h53Var = this.y;
        if (h53Var != null) {
            h53Var.b();
            this.y = null;
        }
        h53 h53Var2 = this.z;
        if (h53Var2 != null) {
            h53Var2.b();
            this.z = null;
        }
    }

    public final void o() {
        n();
        d53 d53Var = this.w;
        d53Var.getClass();
        d53Var.release();
        this.w = null;
        this.u = 0;
    }

    @Override // yads.fo
    public final void a(long j, long j2) {
        boolean z;
        if (this.l) {
            long j3 = this.B;
            if (j3 != -9223372036854775807L && j >= j3) {
                n();
                this.s = true;
            }
        }
        if (this.s) {
            return;
        }
        if (this.z == null) {
            d53 d53Var = this.w;
            d53Var.getClass();
            d53Var.a(j);
            try {
                d53 d53Var2 = this.w;
                d53Var2.getClass();
                this.z = d53Var2.a();
            } catch (e53 e) {
                gh1.b("TextRenderer", gh1.a("Subtitle decoding failed. streamFormat=" + this.v, e));
                List emptyList = Collections.emptyList();
                Handler handler = this.n;
                if (handler != null) {
                    handler.obtainMessage(0, emptyList).sendToTarget();
                } else {
                    this.o.a(emptyList);
                    this.o.a(new u20(emptyList));
                }
                o();
                m();
                return;
            }
        }
        if (this.g != 2) {
            return;
        }
        if (this.y != null) {
            long l = l();
            z = false;
            while (l <= j) {
                this.A++;
                l = l();
                z = true;
            }
        } else {
            z = false;
        }
        h53 h53Var = this.z;
        if (h53Var != null) {
            if (h53Var.b(4)) {
                if (!z && l() == Long.MAX_VALUE) {
                    if (this.u == 2) {
                        o();
                        m();
                    } else {
                        n();
                        this.s = true;
                    }
                }
            } else if (h53Var.c <= j) {
                h53 h53Var2 = this.y;
                if (h53Var2 != null) {
                    h53Var2.b();
                }
                this.A = h53Var.a(j);
                this.y = h53Var;
                this.z = null;
                z = true;
            }
        }
        if (z) {
            this.y.getClass();
            List b = this.y.b(j);
            Handler handler2 = this.n;
            if (handler2 != null) {
                handler2.obtainMessage(0, b).sendToTarget();
            } else {
                this.o.a(b);
                this.o.a(new u20(b));
            }
        }
        if (this.u == 2) {
            return;
        }
        while (!this.r) {
            try {
                g53 g53Var = this.x;
                if (g53Var == null) {
                    d53 d53Var3 = this.w;
                    d53Var3.getClass();
                    g53Var = (g53) d53Var3.b();
                    if (g53Var == null) {
                        return;
                    } else {
                        this.x = g53Var;
                    }
                }
                if (this.u == 1) {
                    g53Var.b = 4;
                    d53 d53Var4 = this.w;
                    d53Var4.getClass();
                    d53Var4.a(g53Var);
                    this.x = null;
                    this.u = 2;
                    return;
                }
                int a = a(this.q, g53Var, 0);
                if (a == -4) {
                    if (g53Var.b(4)) {
                        this.r = true;
                        this.t = false;
                    } else {
                        jw0 jw0Var = this.q.b;
                        if (jw0Var == null) {
                            return;
                        }
                        g53Var.i = jw0Var.q;
                        g53Var.c();
                        this.t &= !g53Var.b(1);
                    }
                    if (!this.t) {
                        d53 d53Var5 = this.w;
                        d53Var5.getClass();
                        d53Var5.a(g53Var);
                        this.x = null;
                    }
                } else if (a == -3) {
                    return;
                }
            } catch (e53 e2) {
                gh1.b("TextRenderer", gh1.a("Subtitle decoding failed. streamFormat=" + this.v, e2));
                List emptyList2 = Collections.emptyList();
                Handler handler3 = this.n;
                if (handler3 != null) {
                    handler3.obtainMessage(0, emptyList2).sendToTarget();
                } else {
                    this.o.a(emptyList2);
                    this.o.a(new u20(emptyList2));
                }
                o();
                m();
                return;
            }
        }
    }

    @Override // yads.fo
    public final void a(jw0[] jw0VarArr, long j, long j2) {
        this.v = jw0VarArr[0];
        if (this.w != null) {
            this.u = 1;
        } else {
            m();
        }
    }

    @Override // yads.fo
    public final void a(long j, boolean z) {
        List emptyList = Collections.emptyList();
        Handler handler = this.n;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.o.a(emptyList);
            this.o.a(new u20(emptyList));
        }
        this.r = false;
        this.s = false;
        this.B = -9223372036854775807L;
        if (this.u != 0) {
            o();
            m();
        } else {
            n();
            d53 d53Var = this.w;
            d53Var.getClass();
            d53Var.flush();
        }
    }
}
