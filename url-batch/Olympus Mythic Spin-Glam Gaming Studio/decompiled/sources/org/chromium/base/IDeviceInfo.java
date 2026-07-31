package org.chromium.base;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class IDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<IDeviceInfo> CREATOR = new Parcelable.Creator() { // from class: org.chromium.base.IDeviceInfo.1
        @Override // android.os.Parcelable.Creator
        public IDeviceInfo createFromParcel(Parcel parcel) {
            IDeviceInfo iDeviceInfo = new IDeviceInfo();
            iDeviceInfo.readFromParcel(parcel);
            return iDeviceInfo;
        }

        @Override // android.os.Parcelable.Creator
        public IDeviceInfo[] newArray(int i) {
            return new IDeviceInfo[i];
        }
    };
    public String gmsVersionCode;
    public boolean isAutomotive = false;
    public boolean isDesktop = false;
    public boolean isFoldable = false;
    public boolean isTv = false;
    public int vulkanDeqpLevel = 0;
    public boolean isXr = false;
    public boolean wasLaunchedOnLargeDisplay = false;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.gmsVersionCode);
        parcel.writeInt(this.isAutomotive ? 1 : 0);
        parcel.writeInt(this.isDesktop ? 1 : 0);
        parcel.writeInt(this.isFoldable ? 1 : 0);
        parcel.writeInt(this.isTv ? 1 : 0);
        parcel.writeInt(this.vulkanDeqpLevel);
        parcel.writeInt(this.isXr ? 1 : 0);
        parcel.writeInt(this.wasLaunchedOnLargeDisplay ? 1 : 0);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }

    public final void readFromParcel(Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        int readInt = parcel.readInt();
        try {
            if (readInt < 4) {
                throw new BadParcelableException("Parcelable too small");
            }
            if (parcel.dataPosition() - dataPosition < readInt) {
                this.gmsVersionCode = parcel.readString();
                if (parcel.dataPosition() - dataPosition < readInt) {
                    this.isAutomotive = parcel.readInt() != 0;
                    if (parcel.dataPosition() - dataPosition < readInt) {
                        this.isDesktop = parcel.readInt() != 0;
                        if (parcel.dataPosition() - dataPosition < readInt) {
                            this.isFoldable = parcel.readInt() != 0;
                            if (parcel.dataPosition() - dataPosition < readInt) {
                                this.isTv = parcel.readInt() != 0;
                                if (parcel.dataPosition() - dataPosition < readInt) {
                                    this.vulkanDeqpLevel = parcel.readInt();
                                    if (parcel.dataPosition() - dataPosition < readInt) {
                                        this.isXr = parcel.readInt() != 0;
                                        if (parcel.dataPosition() - dataPosition < readInt) {
                                            this.wasLaunchedOnLargeDisplay = parcel.readInt() != 0;
                                            if (dataPosition > Integer.MAX_VALUE - readInt) {
                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                            }
                                            parcel.setDataPosition(dataPosition + readInt);
                                            return;
                                        }
                                        if (dataPosition > Integer.MAX_VALUE - readInt) {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                    } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            parcel.setDataPosition(dataPosition + readInt);
        } catch (Throwable th) {
            if (dataPosition > Integer.MAX_VALUE - readInt) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            parcel.setDataPosition(dataPosition + readInt);
            throw th;
        }
    }
}
