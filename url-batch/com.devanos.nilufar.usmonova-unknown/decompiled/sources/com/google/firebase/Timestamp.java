package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import java.time.Instant;
import java.util.Date;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC1305jX;
import o.AbstractC1888sN;
import o.AbstractC1973tg;
import o.AbstractC2188wx;
import o.C1619oH;
import o.InterfaceC2114vp;
import o.UJ;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001+B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006,"}, d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "", "seconds", "", "nanoseconds", "<init>", "(JI)V", "Ljava/util/Date;", "date", "(Ljava/util/Date;)V", "Ljava/time/Instant;", "time", "(Ljava/time/Instant;)V", "toDate", "()Ljava/util/Date;", "toInstant", "()Ljava/time/Instant;", "other", "compareTo", "(Lcom/google/firebase/Timestamp;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lo/bY;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getSeconds", "()J", "I", "getNanoseconds", "Companion", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    private final int nanoseconds;
    private final long seconds;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp createFromParcel(Parcel source) {
            AbstractC0048Bt.n(source, Constants.ScionAnalytics.PARAM_SOURCE);
            return new Timestamp(source.readLong(), source.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp[] newArray(int size) {
            return new Timestamp[size];
        }
    };

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/Timestamp$Companion;", "", "<init>", "()V", "Ljava/util/Date;", "Lo/oH;", "", "", "toPreciseTime", "(Ljava/util/Date;)Lo/oH;", "seconds", "nanoseconds", "Lo/bY;", "validateRange", "(JI)V", "Lcom/google/firebase/Timestamp;", "now", "()Lcom/google/firebase/Timestamp;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1973tg abstractC1973tg) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C1619oH toPreciseTime(Date date) {
            long j = 1000;
            long time = date.getTime() / j;
            int time2 = (int) ((date.getTime() % j) * 1000000);
            return time2 < 0 ? new C1619oH(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : new C1619oH(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long seconds, int nanoseconds) {
            if (nanoseconds < 0 || nanoseconds >= 1000000000) {
                throw new IllegalArgumentException(AbstractC2188wx.g(nanoseconds, "Timestamp nanoseconds out of range: ").toString());
            }
            if (-62135596800L > seconds || seconds >= 253402300800L) {
                throw new IllegalArgumentException(AbstractC1888sN.i("Timestamp seconds out of range: ", seconds).toString());
            }
        }

        public final Timestamp now() {
            return new Timestamp(new Date());
        }

        private Companion() {
        }
    }

    public Timestamp(long j, int i) {
        INSTANCE.validateRange(j, i);
        this.seconds = j;
        this.nanoseconds = i;
    }

    public static final Timestamp now() {
        return INSTANCE.now();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof Timestamp) && compareTo((Timestamp) other) == 0;
        }
        return true;
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j = this.seconds;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.nanoseconds;
    }

    public final Date toDate() {
        return new Date((this.seconds * 1000) + (this.nanoseconds / 1000000));
    }

    public final Instant toInstant() {
        Instant ofEpochSecond;
        ofEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        AbstractC0048Bt.m(ofEpochSecond, "ofEpochSecond(seconds, nanoseconds.toLong())");
        return ofEpochSecond;
    }

    public String toString() {
        return "Timestamp(seconds=" + this.seconds + ", nanoseconds=" + this.nanoseconds + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        AbstractC0048Bt.n(dest, "dest");
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }

    @Override // java.lang.Comparable
    public int compareTo(Timestamp other) {
        AbstractC0048Bt.n(other, "other");
        InterfaceC2114vp[] interfaceC2114vpArr = {new UJ() { // from class: com.google.firebase.Timestamp$compareTo$1
            @Override // o.UJ, o.InterfaceC0596Ww
            public Object get(Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new UJ() { // from class: com.google.firebase.Timestamp$compareTo$2
            @Override // o.UJ, o.InterfaceC0596Ww
            public Object get(Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        }};
        for (int i = 0; i < 2; i++) {
            InterfaceC2114vp interfaceC2114vp = interfaceC2114vpArr[i];
            int l = AbstractC1305jX.l((Comparable) interfaceC2114vp.invoke(this), (Comparable) interfaceC2114vp.invoke(other));
            if (l != 0) {
                return l;
            }
        }
        return 0;
    }

    public Timestamp(Date date) {
        AbstractC0048Bt.n(date, "date");
        Companion companion = INSTANCE;
        C1619oH preciseTime = companion.toPreciseTime(date);
        long longValue = ((Number) preciseTime.h).longValue();
        int intValue = ((Number) preciseTime.i).intValue();
        companion.validateRange(longValue, intValue);
        this.seconds = longValue;
        this.nanoseconds = intValue;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Timestamp(Instant instant) {
        this(r0, r3);
        long epochSecond;
        int nano;
        AbstractC0048Bt.n(instant, "time");
        epochSecond = instant.getEpochSecond();
        nano = instant.getNano();
    }
}
