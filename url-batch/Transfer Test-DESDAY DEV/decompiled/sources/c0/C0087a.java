package c0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087a {

    /* renamed from: a, reason: collision with root package name */
    public final C0088b f1732a = new C0088b();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1733b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f1734c = new LinkedHashSet();
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
