package yads;

/* loaded from: classes15.dex */
public final class h23 implements cg1 {
    @Override // yads.cg1
    public final void a() {
        synchronized (i23.a) {
            Object obj = i23.b;
            synchronized (obj) {
                if (i23.c) {
                    return;
                }
                long a = i23.a();
                synchronized (obj) {
                    i23.d = a;
                    i23.c = true;
                }
            }
        }
    }

    @Override // yads.cg1
    public final void b() {
    }
}
