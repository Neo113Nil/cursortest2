package kotlinx.serialization.json.internal;

import org.jetbrains.annotations.NotNull;

/* compiled from: JsonStreams.kt */
/* loaded from: classes3.dex */
public interface InternalJsonWriter {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    void write(String str);

    void writeChar(char c);

    void writeLong(long j);

    void writeQuoted(String str);

    /* compiled from: JsonStreams.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
