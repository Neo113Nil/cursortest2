package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f763a;
    private final com.google.android.play.integrity.internal.bb b;
    private final com.google.android.play.integrity.internal.bb c;
    private final com.google.android.play.integrity.internal.bb d;
    private final com.google.android.play.integrity.internal.bb e;
    private final com.google.android.play.integrity.internal.bb f;

    /* synthetic */ w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        com.google.android.play.integrity.internal.ay b = com.google.android.play.integrity.internal.az.b(context);
        this.f763a = b;
        bcVar = bb.f738a;
        com.google.android.play.integrity.internal.bb b2 = com.google.android.play.integrity.internal.ax.b(bcVar);
        this.b = b2;
        oVar = n.f759a;
        au auVar = new au(b, oVar);
        this.c = auVar;
        oVar2 = n.f759a;
        com.google.android.play.integrity.internal.bb b3 = com.google.android.play.integrity.internal.ax.b(new bp(b, b2, auVar, oVar2));
        this.d = b3;
        com.google.android.play.integrity.internal.bb b4 = com.google.android.play.integrity.internal.ax.b(new bu(b3));
        this.e = b4;
        this.f = com.google.android.play.integrity.internal.ax.b(new ba(b3, b4));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f.a();
    }
}
