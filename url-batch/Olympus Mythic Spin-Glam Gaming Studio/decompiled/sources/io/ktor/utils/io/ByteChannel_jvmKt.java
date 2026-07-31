package io.ktor.utils.io;

/* compiled from: ByteChannel.jvm.kt */
/* loaded from: classes5.dex */
public abstract class ByteChannel_jvmKt {
    public static final boolean getDEVELOPMENT_MODE() {
        String property = System.getProperty("io.ktor.development");
        return property != null && Boolean.parseBoolean(property);
    }
}
