package com.facebook.ads.internal.exoplayer2.thirdparty.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.meta.analytics.dsp.uinode.FL;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TrackGroupArray implements Parcelable {
    public static String[] A03 = {"CPEwG9kX5jD", "BuT4NFhECA4LIoxcibTyV2rTxW8D7NsJ", "VLvhUNyYrf820yvuRBkPHRPWgKLlpjnS", "oxeVMxvuq0fQP8O4UP99i7KUs83wljn7", "ullnJTMWkmSfBc1cpn0n9HDTgALaYzbW", "uWsPmZUlFuxS4B4B7078xNnndmjfetpu", "kBzYEJnvMy4hYPMlsmjxFp4F3Gjj42", "O4Dh4XK1VBS6gYYO8yxgdHKR7TJnBRof"};
    public static final TrackGroupArray A04 = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new FL();
    public int A00;
    public final int A01;
    public final TrackGroup[] A02;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new TrackGroup[readInt];
        for (int i = 0; i < i; i++) {
            this.A02[i] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.A02 = trackGroupArr;
        this.A01 = trackGroupArr.length;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A00(TrackGroup trackGroup) {
        for (int i = 0; i < i; i++) {
            if (this.A02[i] == trackGroup) {
                return i;
            }
        }
        if (A03[6].length() != 30) {
            throw new RuntimeException();
        }
        A03[0] = "RV";
        return -1;
    }

    public final TrackGroup A01(int i) {
        return this.A02[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        return this.A01 == trackGroupArray.A01 && Arrays.equals(this.A02, trackGroupArray.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = Arrays.hashCode(this.A02);
        }
        return this.A00;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0008 */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        for (int i2 = 0; i2 < i; i2++) {
            parcel.writeParcelable(this.A02[i2], 0);
        }
    }
}
