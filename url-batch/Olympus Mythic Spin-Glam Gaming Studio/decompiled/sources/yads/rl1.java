package yads;

import android.net.Uri;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.List;

/* loaded from: classes10.dex */
public final class rl1 {
    public final Uri a;
    public final List b;
    public final String c;
    public final l41 d;

    public rl1(Uri uri, pl1 pl1Var, List list, String str, l41 l41Var) {
        this.a = uri;
        this.b = list;
        this.c = str;
        this.d = l41Var;
        h41 f = l41.f();
        if (l41Var.size() <= 0) {
            f.a();
        } else {
            MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(l41Var.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl1)) {
            return false;
        }
        rl1 rl1Var = (rl1) obj;
        return this.a.equals(rl1Var.a) && sb3.a((Object) null, (Object) null) && sb3.a((Object) null, (Object) null) && sb3.a((Object) null, (Object) null) && this.b.equals(rl1Var.b) && sb3.a(this.c, rl1Var.c) && this.d.equals(rl1Var.d) && sb3.a((Object) null, (Object) null);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 923521)) * 31;
        String str = this.c;
        return (this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
    }
}
