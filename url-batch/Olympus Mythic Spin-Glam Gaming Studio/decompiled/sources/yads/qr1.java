package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Serializable
/* loaded from: classes5.dex */
public final class qr1 {

    @NotNull
    public static final mr1 Companion = new mr1();
    public static final Lazy[] e = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, lr1.b)};
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public qr1(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, kr1.b);
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr1)) {
            return false;
        }
        qr1 qr1Var = (qr1) obj;
        return Intrinsics.areEqual(this.a, qr1Var.a) && Intrinsics.areEqual(this.b, qr1Var.b) && Intrinsics.areEqual(this.c, qr1Var.c) && Intrinsics.areEqual(this.d, qr1Var.d);
    }

    public final int hashCode() {
        int a = c4.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MediationNetworkData(name=" + this.a + ", id=" + this.b + ", version=" + this.c + ", adapters=" + this.d + ")";
    }

    public qr1(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }
}
