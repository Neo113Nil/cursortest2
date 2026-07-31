package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class be extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f739a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f739a = context;
        this.b = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        TaskCompletionSource taskCompletionSource;
        Context context = this.f739a;
        taskCompletionSource = this.b.d;
        taskCompletionSource.trySetResult(Integer.valueOf(com.google.android.play.integrity.internal.ai.a(context)));
    }
}
