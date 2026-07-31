package yads;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class k1 extends Lambda implements Function1 {
    public static final k1 b = new k1();

    public k1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Activity activity = (Activity) ((WeakReference) obj).get();
        return Boolean.valueOf(activity == null || activity.isFinishing() || activity.isDestroyed());
    }
}
