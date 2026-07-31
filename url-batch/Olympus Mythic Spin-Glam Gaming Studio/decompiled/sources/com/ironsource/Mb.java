package com.ironsource;

import android.os.Debug;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class Mb {
    private final int a;
    private final int b;
    private final int c;

    public interface a {

        /* renamed from: com.ironsource.Mb$a$a, reason: collision with other inner class name */
        public static final class C0348a implements a {
            @Override // com.ironsource.Mb.a
            @NotNull
            public Mb get() {
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                int i = memoryInfo.dalvikPss;
                int i2 = memoryInfo.nativePss;
                return new Mb(i, i2, Math.max(0, (memoryInfo.getTotalPss() - i2) - i));
            }
        }

        @NotNull
        Mb get();
    }

    public Mb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mb)) {
            return false;
        }
        Mb mb = (Mb) obj;
        return this.a == mb.a && this.b == mb.b && this.c == mb.c;
    }

    public final int f() {
        return this.c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    @NotNull
    public String toString() {
        return "MemoryInfo(javaHeapKb=" + this.a + ", nativeHeapKb=" + this.b + ", sharedOtherKb=" + this.c + ")";
    }

    @NotNull
    public final Mb a(int i, int i2, int i3) {
        return new Mb(i, i2, i3);
    }

    public static /* synthetic */ Mb a(Mb mb, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mb.a;
        }
        if ((i4 & 2) != 0) {
            i2 = mb.b;
        }
        if ((i4 & 4) != 0) {
            i3 = mb.c;
        }
        return mb.a(i, i2, i3);
    }
}
