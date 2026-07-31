package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class at {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.bd f731a;
    private final com.google.android.play.integrity.internal.bd b;

    at(com.google.android.play.integrity.internal.bd bdVar, com.google.android.play.integrity.internal.bd bdVar2) {
        this.f731a = bdVar;
        this.b = bdVar2;
    }

    final as a(Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        Context context = (Context) this.f731a.a();
        context.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        aeVar.getClass();
        return new as(context, kVar, activity, taskCompletionSource, aeVar);
    }
}
