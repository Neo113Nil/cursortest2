package io.ktor.http.cio.internals;

/* compiled from: CharArrayPoolJvm.kt */
/* loaded from: classes5.dex */
public abstract class CharArrayPoolJvmKt {
    public static final boolean isPoolingDisabled() {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        if (property != null) {
            return Boolean.parseBoolean(property);
        }
        return false;
    }
}
