package o;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class T20 implements Parcelable {
    public static final Parcelable.Creator<T20> CREATOR = new J1(18);
    public final Messenger h;

    public T20(IBinder iBinder) {
        this.h = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.h;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((T20) obj).h;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.h;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.h;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
