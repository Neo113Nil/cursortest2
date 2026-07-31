package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "GeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes15.dex */
public class GeofencingRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzau();
    private final List zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static final class Builder {
        private final List zza = new ArrayList();
        private int zzb = 5;
        private String zzc = "";

        public Builder addGeofence(Geofence geofence) {
            Preconditions.checkNotNull(geofence, "geofence can't be null.");
            Preconditions.checkArgument(geofence instanceof com.google.android.gms.internal.location.zzbe, "Geofence must be created using Geofence.Builder.");
            this.zza.add((com.google.android.gms.internal.location.zzbe) geofence);
            return this;
        }

        public Builder addGeofences(List list) {
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Geofence geofence = (Geofence) it.next();
                    if (geofence != null) {
                        addGeofence(geofence);
                    }
                }
            }
            return this;
        }

        public GeofencingRequest build() {
            Preconditions.checkArgument(!this.zza.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.zza, this.zzb, this.zzc, null);
        }

        public Builder setInitialTrigger(int i) {
            this.zzb = i & 7;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface InitialTrigger {
    }

    GeofencingRequest(List list, int i, String str, String str2) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public int getInitialTrigger() {
        return this.zzb;
    }

    public String toString() {
        return "GeofencingRequest[geofences=" + this.zza + ", initialTrigger=" + this.zzb + ", tag=" + this.zzc + ", attributionTag=" + this.zzd + X3.j.e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
