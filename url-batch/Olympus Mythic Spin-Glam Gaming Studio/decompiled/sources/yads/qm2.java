package yads;

import java.lang.ref.WeakReference;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class qm2 implements ReadWriteProperty {
    public WeakReference a;

    public qm2(Object obj) {
        this.a = new WeakReference(obj);
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty kProperty) {
        return this.a.get();
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final void setValue(Object obj, KProperty kProperty, Object obj2) {
        this.a = new WeakReference(obj2);
    }
}
