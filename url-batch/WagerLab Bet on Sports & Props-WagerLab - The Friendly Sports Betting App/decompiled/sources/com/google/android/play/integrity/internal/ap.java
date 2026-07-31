package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class ap extends an {

    /* renamed from: a, reason: collision with root package name */
    private final ar f774a;

    ap(ar arVar, int i) {
        super(arVar.size(), i);
        this.f774a = arVar;
    }

    @Override // com.google.android.play.integrity.internal.an
    protected final Object a(int i) {
        return this.f774a.get(i);
    }
}
