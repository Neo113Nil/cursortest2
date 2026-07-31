package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5616qa implements Parcelable {

    @NotNull
    public static final C5589pa CREATOR = new C5589pa();
    public final Boolean a;
    public final IdentifierStatus b;
    public final String c;

    public C5616qa(Boolean bool, IdentifierStatus identifierStatus, String str) {
        this.a = bool;
        this.b = identifierStatus;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5616qa)) {
            return false;
        }
        C5616qa c5616qa = (C5616qa) obj;
        return Intrinsics.areEqual(this.a, c5616qa.a) && this.b == c5616qa.b && Intrinsics.areEqual(this.c, c5616qa.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturesInternal(sslPinning=" + this.a + ", status=" + this.b + ", errorExplanation=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeString(this.b.getValue());
        parcel.writeString(this.c);
    }

    public C5616qa() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }
}
