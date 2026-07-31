package yads;

import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes15.dex */
public final class jq2 implements ReadOnlyProperty {
    public volatile Object a;
    public volatile boolean b;
    public final /* synthetic */ hf c;

    public jq2(hf hfVar) {
        this.c = hfVar;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty kProperty) {
        Object mo4828invoke;
        if (this.b) {
            return this.a;
        }
        hf hfVar = this.c;
        synchronized (this) {
            try {
                if (this.b) {
                    mo4828invoke = this.a;
                } else {
                    mo4828invoke = hfVar.mo4828invoke();
                    if (mo4828invoke != null) {
                        this.a = mo4828invoke;
                        this.b = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mo4828invoke;
    }
}
