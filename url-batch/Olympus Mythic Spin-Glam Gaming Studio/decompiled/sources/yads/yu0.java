package yads;

import android.util.SparseBooleanArray;

/* loaded from: classes6.dex */
public final class yu0 {
    public final SparseBooleanArray a = new SparseBooleanArray();
    public boolean b;

    public final yu0 a(int i) {
        if (this.b) {
            throw new IllegalStateException();
        }
        this.a.append(i, true);
        return this;
    }

    public final zu0 a() {
        if (!this.b) {
            this.b = true;
            return new zu0(this.a);
        }
        throw new IllegalStateException();
    }
}
