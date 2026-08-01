package b0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075a {

    /* renamed from: a, reason: collision with root package name */
    public final C0076b f1502a = new C0076b();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1503b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f1504c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
