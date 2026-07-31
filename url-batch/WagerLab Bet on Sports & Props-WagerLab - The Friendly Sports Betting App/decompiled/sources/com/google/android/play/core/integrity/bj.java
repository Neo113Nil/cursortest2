package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class bj extends y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bk f744a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(bk bkVar, String str, long j) {
        super(str, j);
        this.f744a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    final Task b(Activity activity, Bundle bundle) {
        long j;
        j = this.f744a.e;
        bundle.putLong("cloud.prj", j);
        return this.f744a.c.c(activity, bundle);
    }
}
