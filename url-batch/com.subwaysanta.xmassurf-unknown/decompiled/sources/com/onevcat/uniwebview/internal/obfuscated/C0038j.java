package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038j {
    public final AbstractC0050m a;
    public String b;
    public final boolean c;

    public C0038j(AbstractC0050m downloadType, String fileName, boolean z) {
        Intrinsics.checkNotNullParameter(downloadType, "downloadType");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.a = downloadType;
        this.b = fileName;
        this.c = z;
    }

    public final String a() {
        AbstractC0050m abstractC0050m = this.a;
        if (abstractC0050m instanceof C0046l) {
            return ((C0046l) abstractC0050m).a;
        }
        if (abstractC0050m instanceof C0042k) {
            return ((C0042k) abstractC0050m).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0038j)) {
            return false;
        }
        C0038j c0038j = (C0038j) obj;
        return Intrinsics.areEqual(this.a, c0038j.a) && Intrinsics.areEqual(this.b, c0038j.b) && this.c == c0038j.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DownloadTask(downloadType=" + this.a + ", fileName=" + this.b + ", shouldSendEvent=" + this.c + ')';
    }
}
