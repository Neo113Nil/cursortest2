package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import o.AbstractC0106Dz;

@Keep
/* loaded from: classes.dex */
public class HiddenLifecycleReference {
    private final AbstractC0106Dz lifecycle;

    public HiddenLifecycleReference(AbstractC0106Dz abstractC0106Dz) {
        this.lifecycle = abstractC0106Dz;
    }

    public AbstractC0106Dz getLifecycle() {
        return this.lifecycle;
    }
}
