package X0;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class f implements d, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f1015a;

    public f(int i) {
        this.f1015a = i;
    }

    @Override // X0.d
    public final int b() {
        return this.f1015a;
    }

    public final String toString() {
        i.f1018a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        e.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
