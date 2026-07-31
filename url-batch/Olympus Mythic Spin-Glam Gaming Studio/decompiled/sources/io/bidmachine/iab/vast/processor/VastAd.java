package io.bidmachine.iab.vast.processor;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.tags.AdVerificationsExtensionTag;
import io.bidmachine.iab.vast.tags.AppodealExtensionTag;
import io.bidmachine.iab.vast.tags.CompanionTag;
import io.bidmachine.iab.vast.tags.LinearCreativeTag;
import io.bidmachine.iab.vast.tags.MediaFileTag;
import io.bidmachine.iab.vast.tags.VideoClicksTag;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class VastAd implements Parcelable {
    public static final Parcelable.Creator<VastAd> CREATOR = new a();
    private final LinearCreativeTag a;
    private final MediaFileTag b;
    private VastRequest c;
    private ArrayList d;
    private ArrayList e;
    private ArrayList f;
    private ArrayList g;
    private ArrayList h;
    private EnumMap i;
    private AppodealExtensionTag j;
    private List k = new ArrayList();

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public VastAd createFromParcel(Parcel parcel) {
            return new VastAd(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public VastAd[] newArray(int i) {
            return new VastAd[i];
        }
    }

    VastAd(LinearCreativeTag linearCreativeTag, MediaFileTag mediaFileTag) {
        this.a = linearCreativeTag;
        this.b = mediaFileTag;
    }

    void a(ArrayList arrayList) {
        this.g = arrayList;
    }

    void b(ArrayList arrayList) {
        this.d = arrayList;
    }

    void c(ArrayList arrayList) {
        this.f = arrayList;
    }

    void d(ArrayList arrayList) {
        this.e = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public String getAdParameters() {
        return this.a.getAdParameters();
    }

    @NonNull
    public List<AdVerificationsExtensionTag> getAdVerificationsExtensionList() {
        return this.k;
    }

    @Nullable
    public AppodealExtensionTag getAppodealExtension() {
        return this.j;
    }

    @Nullable
    public CompanionTag getBanner(@NonNull Context context) {
        ArrayList arrayList = this.d;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                CompanionTag companionTag = (CompanionTag) it.next();
                int width = companionTag.getWidth();
                int height = companionTag.getHeight();
                if (width > -1 && height > -1) {
                    if (Utils.isTablet(context) && width == 728 && height == 90) {
                        return companionTag;
                    }
                    if (!Utils.isTablet(context) && width == 320 && height == 50) {
                        return companionTag;
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public String getClickThroughUrl() {
        VideoClicksTag videoClicksTag = this.a.getVideoClicksTag();
        if (videoClicksTag != null) {
            return videoClicksTag.getClickThroughUrl();
        }
        return null;
    }

    @Nullable
    public List<String> getClickTrackingUrlList() {
        return this.g;
    }

    @Nullable
    public CompanionTag getCompanion(int i, int i2) {
        ArrayList arrayList = this.d;
        if (arrayList != null && !arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                CompanionTag companionTag = (CompanionTag) it.next();
                int width = companionTag.getWidth();
                int height = companionTag.getHeight();
                if (width > -1 && height > -1) {
                    float max = Math.max(width, height) / Math.min(width, height);
                    if (Math.min(width, height) >= 250 && max <= 2.5d && companionTag.hasCreative()) {
                        hashMap.put(Float.valueOf(width / height), companionTag);
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                float f = i / i2;
                Set keySet = hashMap.keySet();
                float floatValue = ((Float) keySet.iterator().next()).floatValue();
                Iterator it2 = keySet.iterator();
                while (it2.hasNext()) {
                    float floatValue2 = ((Float) it2.next()).floatValue();
                    if (Math.abs(floatValue - f) > Math.abs(floatValue2 - f)) {
                        floatValue = floatValue2;
                    }
                }
                return (CompanionTag) hashMap.get(Float.valueOf(floatValue));
            }
            a(VastSpecError.GENERAL_COMPANION);
        }
        return null;
    }

    @Nullable
    public Float getDurationSec() {
        return this.a.getDurationSec();
    }

    @Nullable
    public List<String> getErrorUrlList() {
        return this.f;
    }

    @Nullable
    public List<String> getImpressionUrlList() {
        return this.e;
    }

    @NonNull
    public MediaFileTag getPickedMediaFileTag() {
        return this.b;
    }

    public int getSkipOffsetSec() {
        return this.a.getSkipOffsetSec();
    }

    @Nullable
    public Map<TrackingEvent, List<String>> getTrackingEventListMap() {
        return this.i;
    }

    @Nullable
    public ArrayList<String> getWrapperCompanionClickTrackingUrlList() {
        return this.h;
    }

    public void setAdVerificationsExtensionList(@NonNull List<AdVerificationsExtensionTag> list) {
        this.k = list;
    }

    public void setVastRequest(@Nullable VastRequest vastRequest) {
        this.c = vastRequest;
    }

    public void setWrapperCompanionClickTrackingUrlList(@Nullable ArrayList<String> arrayList) {
        this.h = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.d);
        parcel.writeStringList(this.e);
        parcel.writeStringList(this.f);
        parcel.writeStringList(this.g);
        parcel.writeStringList(this.h);
        parcel.writeSerializable(this.i);
        parcel.writeSerializable(this.j);
        parcel.writeList(this.k);
    }

    void a(EnumMap enumMap) {
        this.i = enumMap;
    }

    void a(AppodealExtensionTag appodealExtensionTag) {
        this.j = appodealExtensionTag;
    }

    void a(VastSpecError vastSpecError) {
        VastRequest vastRequest = this.c;
        if (vastRequest != null) {
            vastRequest.sendVastSpecError(vastSpecError);
        }
    }

    protected VastAd(Parcel parcel) {
        this.a = (LinearCreativeTag) parcel.readSerializable();
        this.b = (MediaFileTag) parcel.readSerializable();
        this.d = (ArrayList) parcel.readSerializable();
        this.e = parcel.createStringArrayList();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createStringArrayList();
        this.i = (EnumMap) parcel.readSerializable();
        this.j = (AppodealExtensionTag) parcel.readSerializable();
        parcel.readList(this.k, AdVerificationsExtensionTag.class.getClassLoader());
    }
}
