package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes5.dex */
public abstract class dn implements zj {
    public xj b;
    public xj c;
    public xj d;
    public xj e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public dn() {
        ByteBuffer byteBuffer = zj.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        xj xjVar = xj.e;
        this.d = xjVar;
        this.e = xjVar;
        this.b = xjVar;
        this.c = xjVar;
    }

    @Override // yads.zj
    public final xj a(xj xjVar) {
        this.d = xjVar;
        this.e = b(xjVar);
        return isActive() ? this.e : xj.e;
    }

    public abstract xj b(xj xjVar);

    @Override // yads.zj
    public final void b() {
        this.h = true;
        f();
    }

    @Override // yads.zj
    public boolean c() {
        return this.h && this.g == zj.a;
    }

    @Override // yads.zj
    public final void d() {
        flush();
        this.f = zj.a;
        xj xjVar = xj.e;
        this.d = xjVar;
        this.e = xjVar;
        this.b = xjVar;
        this.c = xjVar;
        g();
    }

    public void e() {
    }

    public void f() {
    }

    @Override // yads.zj
    public final void flush() {
        this.g = zj.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        e();
    }

    public void g() {
    }

    @Override // yads.zj
    public boolean isActive() {
        return this.e != xj.e;
    }

    @Override // yads.zj
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = zj.a;
        return byteBuffer;
    }

    public final ByteBuffer a(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }
}
