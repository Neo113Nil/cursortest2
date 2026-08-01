package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class qt implements Comparable, Parcelable {
    public static final Parcelable.Creator<qt> CREATOR = new i1(13);
    public final Calendar f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public String l;

    public qt(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a = x60.a(calendar);
        this.f = a;
        this.g = a.get(2);
        this.h = a.get(1);
        this.i = a.getMaximum(7);
        this.j = a.getActualMaximum(5);
        this.k = a.getTimeInMillis();
    }

    public static qt a(int i, int i2) {
        Calendar c = x60.c(null);
        c.set(1, i);
        c.set(2, i2);
        return new qt(c);
    }

    public static qt b(long j) {
        Calendar c = x60.c(null);
        c.setTimeInMillis(j);
        return new qt(c);
    }

    public final String c() {
        if (this.l == null) {
            long timeInMillis = this.f.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = x60.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.l = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.l;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f.compareTo(((qt) obj).f);
    }

    public final int d(qt qtVar) {
        if (this.f instanceof GregorianCalendar) {
            return (qtVar.g - this.g) + ((qtVar.h - this.h) * 12);
        }
        l8.l("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt)) {
            return false;
        }
        qt qtVar = (qt) obj;
        return this.g == qtVar.g && this.h == qtVar.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.h);
        parcel.writeInt(this.g);
    }
}
