package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
public final class az implements ay {

    /* renamed from: a, reason: collision with root package name */
    private final Object f781a;

    private az(Object obj) {
        this.f781a = obj;
    }

    public static ay b(Object obj) {
        if (obj != null) {
            return new az(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final Object a() {
        return this.f781a;
    }
}
