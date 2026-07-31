package com.my.target;

import com.my.target.yh;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes10.dex */
final class zh implements yh {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class a implements yh.a {
        private a() {
        }

        @Override // com.my.target.yh.a
        public bi a() {
            throw new Exception("Cannot read data from empty iterator");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // com.my.target.yh.a
        public boolean moveToNext() {
            return false;
        }
    }

    zh() {
    }

    @Override // com.my.target.yh
    public void a(long j) {
    }

    @Override // com.my.target.yh
    public void a(String str, long j, long j2, vh vhVar) {
    }

    @Override // com.my.target.yh
    public void b(long j) {
    }

    @Override // com.my.target.yh
    public yh.a a() {
        return new a();
    }
}
