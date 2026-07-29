package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h30 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;
    public final String b;
    public final boolean c;

    public h30(String str, boolean z) {
        AbstractC1473m3.k(str);
        this.a = str;
        AbstractC1473m3.k("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = z;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h30)) {
            return false;
        }
        h30 h30Var = (h30) obj;
        return EB.o(this.a, h30Var.a) && EB.o(this.b, h30Var.b) && EB.o(null, null) && this.c == h30Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        AbstractC1473m3.n(null);
        throw null;
    }
}
