package yads;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class nu extends Lambda implements Function1 {
    public static final nu b = new nu();

    public nu() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object parent = ((View) obj).getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
