package org.chromium.base;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class IAndroidInfo implements Parcelable {
    public static final Parcelable.Creator<IAndroidInfo> CREATOR = new Parcelable.Creator() { // from class: org.chromium.base.IAndroidInfo.1
        @Override // android.os.Parcelable.Creator
        public IAndroidInfo createFromParcel(Parcel parcel) {
            IAndroidInfo iAndroidInfo = new IAndroidInfo();
            iAndroidInfo.readFromParcel(parcel);
            return iAndroidInfo;
        }

        @Override // android.os.Parcelable.Creator
        public IAndroidInfo[] newArray(int i) {
            return new IAndroidInfo[i];
        }
    };
    public String abiName;
    public String androidBuildFp;
    public String androidBuildId;
    public String board;
    public String brand;
    public String buildType;
    public String codename;
    public String device;
    public String hardware;
    public String manufacturer;
    public String model;
    public String securityPatch;
    public String socManufacturer;
    public String versionIncremental;
    public boolean isDebugAndroid = false;
    public int sdkInt = 0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.abiName);
        parcel.writeString(this.androidBuildFp);
        parcel.writeString(this.androidBuildId);
        parcel.writeString(this.board);
        parcel.writeString(this.brand);
        parcel.writeString(this.buildType);
        parcel.writeString(this.codename);
        parcel.writeString(this.device);
        parcel.writeString(this.hardware);
        parcel.writeInt(this.isDebugAndroid ? 1 : 0);
        parcel.writeString(this.manufacturer);
        parcel.writeString(this.model);
        parcel.writeInt(this.sdkInt);
        parcel.writeString(this.securityPatch);
        parcel.writeString(this.socManufacturer);
        parcel.writeString(this.versionIncremental);
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
                this.abiName = parcel.readString();
                if (parcel.dataPosition() - dataPosition < readInt) {
                    this.androidBuildFp = parcel.readString();
                    if (parcel.dataPosition() - dataPosition < readInt) {
                        this.androidBuildId = parcel.readString();
                        if (parcel.dataPosition() - dataPosition < readInt) {
                            this.board = parcel.readString();
                            if (parcel.dataPosition() - dataPosition < readInt) {
                                this.brand = parcel.readString();
                                if (parcel.dataPosition() - dataPosition < readInt) {
                                    this.buildType = parcel.readString();
                                    if (parcel.dataPosition() - dataPosition < readInt) {
                                        this.codename = parcel.readString();
                                        if (parcel.dataPosition() - dataPosition < readInt) {
                                            this.device = parcel.readString();
                                            if (parcel.dataPosition() - dataPosition < readInt) {
                                                this.hardware = parcel.readString();
                                                if (parcel.dataPosition() - dataPosition < readInt) {
                                                    this.isDebugAndroid = parcel.readInt() != 0;
                                                    if (parcel.dataPosition() - dataPosition < readInt) {
                                                        this.manufacturer = parcel.readString();
                                                        if (parcel.dataPosition() - dataPosition < readInt) {
                                                            this.model = parcel.readString();
                                                            if (parcel.dataPosition() - dataPosition < readInt) {
                                                                this.sdkInt = parcel.readInt();
                                                                if (parcel.dataPosition() - dataPosition < readInt) {
                                                                    this.securityPatch = parcel.readString();
                                                                    if (parcel.dataPosition() - dataPosition < readInt) {
                                                                        this.socManufacturer = parcel.readString();
                                                                        if (parcel.dataPosition() - dataPosition < readInt) {
                                                                            this.versionIncremental = parcel.readString();
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
