package io.bidmachine.analytics.internal.J;

/* loaded from: classes9.dex */
public interface b {
    static /* synthetic */ String a(b bVar, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return bVar.b(str, str2);
    }

    void a(String str, String str2);

    String b(String str, String str2);
}
