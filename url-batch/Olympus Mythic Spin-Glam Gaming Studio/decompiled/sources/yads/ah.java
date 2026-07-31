package yads;

import android.app.ActivityManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class ah extends Lambda implements Function0 {
    public final /* synthetic */ fh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(fh fhVar) {
        super(0);
        this.b = fhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        try {
            Object systemService = this.b.a.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
                return (ActivityManager) systemService;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
