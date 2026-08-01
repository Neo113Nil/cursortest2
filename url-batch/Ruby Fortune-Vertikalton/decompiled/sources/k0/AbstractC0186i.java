package k0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: k0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0186i {
    public static <T, V> ObjectAnimator a(T t2, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t2, property, (TypeConverter) null, path);
    }
}
