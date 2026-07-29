package o;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.yi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2305yi implements Executor {
    public static final EnumC2305yi h;
    public static final /* synthetic */ EnumC2305yi[] i;

    static {
        EnumC2305yi enumC2305yi = new EnumC2305yi("INSTANCE", 0);
        h = enumC2305yi;
        i = new EnumC2305yi[]{enumC2305yi};
    }

    public static EnumC2305yi valueOf(String str) {
        return (EnumC2305yi) Enum.valueOf(EnumC2305yi.class, str);
    }

    public static EnumC2305yi[] values() {
        return (EnumC2305yi[]) i.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
