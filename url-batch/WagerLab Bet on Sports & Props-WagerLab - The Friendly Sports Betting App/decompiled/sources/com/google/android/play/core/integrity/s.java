package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bb f761a;
    private final com.google.android.play.integrity.internal.bb b;
    private final com.google.android.play.integrity.internal.bb c;
    private final com.google.android.play.integrity.internal.bb d;
    private final com.google.android.play.integrity.internal.bb e;

    /* synthetic */ s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        com.google.android.play.integrity.internal.ay b = com.google.android.play.integrity.internal.az.b(context);
        this.f761a = b;
        adVar = ac.f718a;
        com.google.android.play.integrity.internal.bb b2 = com.google.android.play.integrity.internal.ax.b(adVar);
        this.b = b2;
        mVar = l.f756a;
        au auVar = new au(b, mVar);
        this.c = auVar;
        mVar2 = l.f756a;
        com.google.android.play.integrity.internal.bb b3 = com.google.android.play.integrity.internal.ax.b(new al(b, b2, auVar, mVar2));
        this.d = b3;
        this.e = com.google.android.play.integrity.internal.ax.b(new ab(b3));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.e.a();
    }
}
