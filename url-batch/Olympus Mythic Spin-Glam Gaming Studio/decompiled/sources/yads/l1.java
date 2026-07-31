package yads;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class l1 extends Lambda implements Function1 {
    public static final l1 b = new l1();

    public l1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Activity activity = (Activity) ((WeakReference) obj).get();
        return Boolean.valueOf(activity == null || activity.isFinishing() || activity.isDestroyed());
    }
}
