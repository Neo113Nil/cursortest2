package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.d1;
import com.my.tracker.obfuscated.x1;

/* loaded from: classes8.dex */
final class y1 implements x1 {
    private final d1 a;

    private static final class a implements x1.a {
        private final d1 a;
        private final d1.c b;

        public a(d1 d1Var, d1.c cVar) {
            this.a = d1Var;
            this.b = cVar;
        }

        @Override // com.my.tracker.obfuscated.x1.a
        public boolean b() {
            return this.b.b();
        }

        @Override // com.my.tracker.obfuscated.x1.a
        public long c() {
            return this.b.c();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
        }

        @Override // com.my.tracker.obfuscated.x1.a
        public x1.b d() {
            return new b(this.a.e(this.b.a()));
        }

        @Override // com.my.tracker.obfuscated.x1.a
        public long g() {
            return this.b.g();
        }

        @Override // com.my.tracker.obfuscated.x1.a
        public byte[] l() {
            return this.b.l();
        }
    }

    private static final class b implements x1.b {
        private final d1.d a;

        public b(d1.d dVar) {
            this.a = dVar;
        }

        @Override // com.my.tracker.obfuscated.x1.b
        public boolean b() {
            return this.a.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.my.tracker.obfuscated.x1.b
        public long e() {
            return this.a.e();
        }
    }

    public y1(d1 d1Var) {
        this.a = d1Var;
    }

    @Override // com.my.tracker.obfuscated.x1
    public x1.a a() {
        d1 d1Var = this.a;
        return new a(d1Var, d1Var.i());
    }
}
