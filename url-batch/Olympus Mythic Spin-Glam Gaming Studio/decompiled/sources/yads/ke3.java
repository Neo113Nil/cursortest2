package yads;

/* loaded from: classes14.dex */
public abstract class ke3 {
    public static le3 a() {
        return new le3("Internal error. Failed to parse response");
    }

    public static le3 b() {
        return new le3("Server temporarily unavailable. Please, try again later.");
    }

    public static le3 a(em0 em0Var) {
        String message = em0Var.getMessage();
        if (message == null) {
            message = "Ad request completed successfully, but there are no ads available.";
        }
        return new le3(message);
    }

    public static le3 b(String str) {
        return new le3(str);
    }

    public static le3 a(String str) {
        if (str == null) {
            str = "Ad request failed with network error";
        }
        return new le3(str);
    }
}
