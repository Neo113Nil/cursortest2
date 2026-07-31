package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
public final class ax implements bb {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f780a = new Object();
    private volatile bb b;
    private volatile Object c = f780a;

    private ax(bb bbVar) {
        this.b = bbVar;
    }

    public static bb b(bb bbVar) {
        return bbVar instanceof ax ? bbVar : new ax(bbVar);
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final Object a() {
        Object obj;
        Object obj2 = this.c;
        Object obj3 = f780a;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.c;
            if (obj == obj3) {
                obj = this.b.a();
                Object obj4 = this.c;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.c = obj;
                this.b = null;
            }
        }
        return obj;
    }
}
