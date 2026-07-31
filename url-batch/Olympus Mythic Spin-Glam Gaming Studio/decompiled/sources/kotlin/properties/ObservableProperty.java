package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ObservableProperty.kt */
/* loaded from: classes6.dex */
public abstract class ObservableProperty implements ReadWriteProperty {
    private Object value;

    protected abstract void afterChange(KProperty kProperty, Object obj, Object obj2);

    protected boolean beforeChange(@NotNull KProperty<?> property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    public ObservableProperty(Object obj) {
        this.value = obj;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public Object getValue(@Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> property, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj3 = this.value;
        if (beforeChange(property, obj3, obj2)) {
            this.value = obj2;
            afterChange(property, obj3, obj2);
        }
    }

    @NotNull
    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
