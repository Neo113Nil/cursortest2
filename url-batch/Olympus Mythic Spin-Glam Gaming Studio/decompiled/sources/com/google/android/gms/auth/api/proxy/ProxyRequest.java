package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
@ShowFirstParty
@KeepForSdkWithMembers
@SafeParcelable.Class(creator = "ProxyRequestCreator")
/* loaded from: classes12.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public final byte[] body;
    public final int httpMethod;
    public final long timeoutMillis;
    public final String url;
    final int zza;
    Bundle zzb;

    @NonNull
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new zza();
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int LAST_CODE = 7;

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
    @ShowFirstParty
    @KeepForSdkWithMembers
    public static class Builder {
    }

    ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.zza = i;
        this.url = str;
        this.httpMethod = i2;
        this.timeoutMillis = j;
        this.body = bArr;
        this.zzb = bundle;
    }

    public String toString() {
        return "ProxyRequest[ url: " + this.url + ", method: " + this.httpMethod + " ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.url, false);
        SafeParcelWriter.writeInt(parcel, 2, this.httpMethod);
        SafeParcelWriter.writeLong(parcel, 3, this.timeoutMillis);
        SafeParcelWriter.writeByteArray(parcel, 4, this.body, false);
        SafeParcelWriter.writeBundle(parcel, 5, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
