package b0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076a {

    /* renamed from: a, reason: collision with root package name */
    public final C0077b f1500a = new C0077b();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1501b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f1502c = new LinkedHashSet();
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
