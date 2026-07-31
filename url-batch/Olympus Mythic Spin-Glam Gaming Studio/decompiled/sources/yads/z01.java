package yads;

/* loaded from: classes5.dex */
public abstract class z01 {
    public static l83 a(int i, String str) {
        l83 l83Var;
        if (400 <= i && i < 500) {
            m83 m83Var = m83.f;
            if (str == null) {
                str = "Client error (HTTP " + i + ")";
            }
            l83Var = new l83(m83Var, "client_error", str, Integer.valueOf(i));
        } else if (500 > i || i >= 600) {
            m83 m83Var2 = m83.j;
            if (str == null) {
                str = "Unknown HTTP code: " + i;
            }
            l83Var = new l83(m83Var2, "unknown_http_code", str, Integer.valueOf(i));
        } else {
            m83 m83Var3 = m83.e;
            if (str == null) {
                str = "Server error (HTTP " + i + ")";
            }
            l83Var = new l83(m83Var3, "server_error", str, Integer.valueOf(i));
        }
        return l83Var;
    }
}
