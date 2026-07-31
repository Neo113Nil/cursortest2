package yads;

import android.util.SparseBooleanArray;

/* loaded from: classes12.dex */
public final class zu0 {
    public final SparseBooleanArray a;

    public zu0(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        oh.a(i, this.a.size());
        return this.a.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu0)) {
            return false;
        }
        zu0 zu0Var = (zu0) obj;
        if (sb3.a >= 24) {
            return this.a.equals(zu0Var.a);
        }
        if (this.a.size() != zu0Var.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (a(i) != zu0Var.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (sb3.a >= 24) {
            return this.a.hashCode();
        }
        int size = this.a.size();
        for (int i = 0; i < this.a.size(); i++) {
            size = (size * 31) + a(i);
        }
        return size;
    }
}
