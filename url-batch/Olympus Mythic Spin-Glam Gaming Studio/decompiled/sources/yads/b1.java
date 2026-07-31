package yads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b1 implements j1, fq2 {
    public final c1 a;
    public WeakReference b;
    public String c;

    public b1(c1 c1Var) {
        this.a = c1Var;
    }

    public final void a(Activity activity, Bundle bundle) {
        String string;
        Objects.toString(activity);
        boolean z = ob1.a;
        if (bundle == null || (string = bundle.getString("monetization_ads_activity_id")) == null || !Intrinsics.areEqual(string, this.c)) {
            return;
        }
        this.a.b();
    }

    @Override // yads.j1
    public final void b(Activity activity) {
        Objects.toString(activity);
        boolean z = ob1.a;
        bu2 a = uw2.a().a(activity);
        boolean z2 = false;
        boolean z3 = a != null && a.G0();
        Intent intent = activity.getIntent();
        if (intent != null && intent.getBooleanExtra("monetization_ads_activity_click", false)) {
            z2 = true;
        }
        WeakReference weakReference = this.b;
        if ((weakReference == null || !Intrinsics.areEqual(activity, (Activity) weakReference.get()) || z3) && (!z3 || z2)) {
            return;
        }
        this.a.b();
    }

    @Override // yads.j1
    public final void a(Activity activity) {
        Objects.toString(activity);
        boolean z = ob1.a;
        if (this.b == null) {
            this.b = new WeakReference(activity);
        }
    }

    public final void b(Activity activity, Bundle bundle) {
        WeakReference weakReference;
        Objects.toString(activity);
        boolean z = ob1.a;
        if (bundle == null || (weakReference = this.b) == null || !Intrinsics.areEqual(activity, (Activity) weakReference.get())) {
            return;
        }
        String uuid = UUID.randomUUID().toString();
        this.c = uuid;
        bundle.putString("monetization_ads_activity_id", uuid);
    }
}
