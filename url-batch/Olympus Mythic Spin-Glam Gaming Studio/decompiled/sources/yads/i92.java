package yads;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class i92 {
    public final j92 a;

    public i92(j92 j92Var) {
        this.a = j92Var;
    }

    public final Bitmap a(String str) {
        return (Bitmap) this.a.get(str);
    }

    public final void a(String str, Bitmap bitmap) {
        this.a.put(str, bitmap);
    }
}
