package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.d1;
import com.my.tracker.obfuscated.z1;

/* loaded from: classes14.dex */
final class a2 implements z1 {
    private final d1 a;
    private final String b;

    private static final class a implements z1.a {
        private final d1 a;
        private final d1.f b;

        public a(d1 d1Var, d1.f fVar) {
            this.a = d1Var;
            this.b = fVar;
        }

        @Override // com.my.tracker.obfuscated.z1.a
        public long a() {
            return this.b.a();
        }

        @Override // com.my.tracker.obfuscated.z1.a
        public boolean b() {
            return this.b.b();
        }

        @Override // com.my.tracker.obfuscated.z1.a
        public long c() {
            return this.b.c();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
        }

        @Override // com.my.tracker.obfuscated.z1.a
        public z1.b d() {
            return new b(this.a.h(this.b.a()));
        }

        @Override // com.my.tracker.obfuscated.z1.a
        public String k() {
            return this.b.k();
        }
    }

    private static final class b implements z1.b {
        private final d1.g a;

        public b(d1.g gVar) {
            this.a = gVar;
        }

        @Override // com.my.tracker.obfuscated.z1.b
        public boolean b() {
            return this.a.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.my.tracker.obfuscated.z1.b
        public boolean f() {
            return this.a.o();
        }

        @Override // com.my.tracker.obfuscated.z1.b
        public long h() {
            return this.a.n();
        }

        @Override // com.my.tracker.obfuscated.z1.b
        public long j() {
            return this.a.m();
        }
    }

    a2(d1 d1Var, String str) {
        this.a = d1Var;
        this.b = str;
    }

    @Override // com.my.tracker.obfuscated.z1
    public z1.a a() {
        d1 d1Var = this.a;
        return new a(d1Var, d1Var.a(this.b));
    }
}
