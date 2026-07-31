package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class u implements av {

    /* renamed from: a, reason: collision with root package name */
    private Context f762a;

    private u() {
        throw null;
    }

    /* synthetic */ u(t tVar) {
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        com.google.android.play.integrity.internal.ba.a(this.f762a, Context.class);
        return new w(this.f762a, null);
    }

    public final u a(Context context) {
        context.getClass();
        this.f762a = context;
        return this;
    }
}
