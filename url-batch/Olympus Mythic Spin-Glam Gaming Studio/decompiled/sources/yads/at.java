package yads;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class at extends fo {
    public final fb0 n;
    public final xb2 o;
    public long p;
    public zs q;
    public long r;

    public at() {
        super(6);
        this.n = new fb0(1);
        this.o = new xb2();
    }

    @Override // yads.fo
    public final int a(jw0 jw0Var) {
        return "application/x-camera-motion".equals(jw0Var.m) ? fo.a(4, 0, 0) : fo.a(0, 0, 0);
    }

    @Override // yads.fo
    public final String c() {
        return "CameraMotionRenderer";
    }

    @Override // yads.fo
    public final boolean e() {
        return d();
    }

    @Override // yads.fo
    public final boolean f() {
        return true;
    }

    @Override // yads.fo
    public final void g() {
        zs zsVar = this.q;
        if (zsVar != null) {
            zsVar.a();
        }
    }

    @Override // yads.fo, yads.hf2
    public final void a(int i, Object obj) {
        if (i == 8) {
            this.q = (zs) obj;
        }
    }

    @Override // yads.fo
    public final void a(jw0[] jw0VarArr, long j, long j2) {
        this.p = j2;
    }

    @Override // yads.fo
    public final void a(long j, boolean z) {
        this.r = Long.MIN_VALUE;
        zs zsVar = this.q;
        if (zsVar != null) {
            zsVar.a();
        }
    }

    @Override // yads.fo
    public final void a(long j, long j2) {
        while (!d() && this.r < 100000 + j) {
            this.n.b();
            kw0 kw0Var = this.c;
            float[] fArr = null;
            kw0Var.a = null;
            kw0Var.b = null;
            if (a(kw0Var, this.n, 0) != -4 || this.n.b(4)) {
                return;
            }
            fb0 fb0Var = this.n;
            this.r = fb0Var.f;
            if (this.q != null && !fb0Var.b(Integer.MIN_VALUE)) {
                this.n.c();
                ByteBuffer byteBuffer = this.n.d;
                int i = sb3.a;
                if (byteBuffer.remaining() == 16) {
                    xb2 xb2Var = this.o;
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    xb2Var.a = array;
                    xb2Var.c = limit;
                    xb2Var.b = 0;
                    this.o.e(byteBuffer.arrayOffset() + 4);
                    fArr = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr[i2] = Float.intBitsToFloat(this.o.c());
                    }
                }
                if (fArr != null) {
                    this.q.a(this.r - this.p, fArr);
                }
            }
        }
    }
}
