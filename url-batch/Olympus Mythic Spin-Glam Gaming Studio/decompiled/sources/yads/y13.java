package yads;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y13 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final yk e;
    public final q13 f;
    public final ArrayList g;

    public y13(String str, String str2, String str3, String str4, yk ykVar, q13 q13Var, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ykVar;
        this.f = q13Var;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y13)) {
            return false;
        }
        y13 y13Var = (y13) obj;
        return Intrinsics.areEqual(this.a, y13Var.a) && Intrinsics.areEqual(this.b, y13Var.b) && Intrinsics.areEqual(this.c, y13Var.c) && Intrinsics.areEqual(this.d, y13Var.d) && Intrinsics.areEqual(this.e, y13Var.e) && Intrinsics.areEqual(this.f, y13Var.f) && Intrinsics.areEqual(this.g, y13Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        yk ykVar = this.e;
        int hashCode5 = (hashCode4 + (ykVar == null ? 0 : ykVar.hashCode())) * 31;
        q13 q13Var = this.f;
        int hashCode6 = (hashCode5 + (q13Var == null ? 0 : q13Var.hashCode())) * 31;
        ArrayList arrayList = this.g;
        return hashCode6 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "SmartCenterSettings(colorWizButton=" + this.a + ", colorWizButtonText=" + this.b + ", colorWizBack=" + this.c + ", colorWizBackRight=" + this.d + ", backgroundColors=" + this.e + ", smartCenter=" + this.f + ", smartCenters=" + this.g + ")";
    }
}
