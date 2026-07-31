package com.google.android.play.core.integrity;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
public final class au implements com.google.android.play.integrity.internal.ay {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f732a;
    private final com.google.android.play.integrity.internal.bd b;

    public au(com.google.android.play.integrity.internal.bd bdVar, com.google.android.play.integrity.internal.bd bdVar2) {
        this.f732a = bdVar;
        this.b = bdVar2;
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final at a() {
        return new at(this.f732a, this.b);
    }
}
