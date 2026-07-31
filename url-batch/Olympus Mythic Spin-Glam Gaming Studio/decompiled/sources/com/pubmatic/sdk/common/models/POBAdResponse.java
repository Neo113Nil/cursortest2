package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdFormat;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class POBAdResponse<T extends POBAdDescriptor> implements POBBidsProvider {
    private List a;
    private Integer b;
    private List c;
    private POBAdDescriptor d;
    private POBAdDescriptor e;
    private int f;
    private JSONObject g;
    private boolean h;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[POBAdFormat.values().length];
            a = iArr;
            try {
                iArr[POBAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[POBAdFormat.BANNER_AND_MREC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[POBAdFormat.MREC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[POBAdFormat.APP_OPEN_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[POBAdFormat.INTERSTITIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[POBAdFormat.REWARDEDAD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[POBAdFormat.NATIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* synthetic */ POBAdResponse(a aVar) {
        this();
    }

    @NonNull
    public static <T extends POBAdDescriptor> POBAdResponse<T> defaultResponse() {
        POBAdResponse<T> pOBAdResponse = new POBAdResponse<>();
        ((POBAdResponse) pOBAdResponse).a = new ArrayList();
        ((POBAdResponse) pOBAdResponse).f = 30;
        return pOBAdResponse;
    }

    @Nullable
    public POBAdDescriptor getBid(@Nullable String str) {
        if (POBUtils.isNullOrEmpty(str)) {
            return null;
        }
        for (POBAdDescriptor pOBAdDescriptor : this.a) {
            if (str.equals(pOBAdDescriptor.getId())) {
                return pOBAdDescriptor;
            }
        }
        return null;
    }

    @NonNull
    public List<T> getBids() {
        return this.a;
    }

    @Nullable
    public JSONObject getCustomData() {
        return this.g;
    }

    @Override // com.pubmatic.sdk.common.base.POBBidsProvider
    @Nullable
    public Integer getNbrCode() {
        return this.b;
    }

    @Nullable
    public T getNextHighestDynamicBid() {
        return (T) this.e;
    }

    public int getRefreshInterval() {
        return this.f;
    }

    @Nullable
    public List<T> getServerSidePartnerBids() {
        return this.c;
    }

    @Override // com.pubmatic.sdk.common.base.POBBidsProvider
    @Nullable
    public Map<String, String> getTargetingInfo() {
        Map<String, String> targetingInfo;
        Map<String, String> targetingInfo2;
        HashMap hashMap = new HashMap();
        if (this.h) {
            for (T t : getBids()) {
                if (t != null && (targetingInfo2 = t.getTargetingInfo()) != null) {
                    try {
                        hashMap.putAll(targetingInfo2);
                    } catch (ClassCastException | IllegalArgumentException | NullPointerException | UnsupportedOperationException unused) {
                        POBLog.error("POBAdResponse", "Failed to add targeting info", new Object[0]);
                    }
                }
            }
        } else {
            POBAdDescriptor pOBAdDescriptor = this.d;
            if (pOBAdDescriptor != null && (targetingInfo = pOBAdDescriptor.getTargetingInfo()) != null) {
                hashMap.putAll(targetingInfo);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    @Nullable
    public T getWinningBid() {
        return (T) this.d;
    }

    public boolean isSendAllBidsEnabled() {
        return this.h;
    }

    public static class Builder<T extends POBAdDescriptor> {
        private List a;
        private Integer b;
        private List c;
        private POBAdDescriptor d;
        private POBAdDescriptor e;
        private int f;
        private JSONObject g;
        private boolean h;

        public Builder(@NonNull List<T> list) {
            this.a = list;
        }

        private List a(List list, POBAdFormat pOBAdFormat) {
            POBAdDescriptor buildWithRefreshAndExpiryTimeout;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                POBAdDescriptor pOBAdDescriptor = (POBAdDescriptor) it.next();
                if (pOBAdDescriptor != null && (buildWithRefreshAndExpiryTimeout = pOBAdDescriptor.buildWithRefreshAndExpiryTimeout(this.f, a(pOBAdDescriptor, pOBAdFormat))) != null) {
                    arrayList.add(buildWithRefreshAndExpiryTimeout);
                }
            }
            list.clear();
            list.addAll(arrayList);
            return list;
        }

        @NonNull
        public POBAdResponse<T> build() {
            POBAdResponse<T> pOBAdResponse = new POBAdResponse<>(null);
            ((POBAdResponse) pOBAdResponse).a = this.a;
            ((POBAdResponse) pOBAdResponse).b = this.b;
            ((POBAdResponse) pOBAdResponse).c = this.c;
            ((POBAdResponse) pOBAdResponse).d = this.d;
            ((POBAdResponse) pOBAdResponse).f = this.f;
            ((POBAdResponse) pOBAdResponse).g = this.g;
            ((POBAdResponse) pOBAdResponse).h = this.h;
            ((POBAdResponse) pOBAdResponse).e = this.e;
            return pOBAdResponse;
        }

        public Builder<T> setNbrCode(@Nullable Integer num) {
            this.b = num;
            return this;
        }

        @NonNull
        public Builder<T> setNextHighestDynamicBid(@Nullable T t) {
            this.e = t;
            return this;
        }

        public Builder<T> setRefreshInterval(int i) {
            this.f = i;
            return this;
        }

        public Builder<T> setSendAllBidsState(boolean z) {
            this.h = z;
            return this;
        }

        public Builder<T> setServerSidePartnerBids(List<T> list) {
            this.c = list;
            return this;
        }

        public Builder<T> setWinningBid(@Nullable T t) {
            this.d = t;
            return this;
        }

        public Builder<T> updateWinningBid(@NonNull T t) {
            if (this.a.remove(t)) {
                this.a.add(t);
            }
            List list = this.c;
            if (list != null && list.remove(t)) {
                this.c.add(t);
            }
            this.d = t;
            return this;
        }

        public Builder<T> updateWithRefreshIntervalAndExpiryTimeout(@NonNull POBAdFormat pOBAdFormat) {
            List list = this.c;
            if (list != null) {
                a(list, pOBAdFormat);
            }
            a(this.a, pOBAdFormat);
            POBAdDescriptor pOBAdDescriptor = this.d;
            if (pOBAdDescriptor != null) {
                this.d = pOBAdDescriptor.buildWithRefreshAndExpiryTimeout(this.f, a(pOBAdDescriptor, pOBAdFormat));
            }
            return this;
        }

        public Builder(@NonNull POBAdResponse<T> pOBAdResponse) {
            this.a = ((POBAdResponse) pOBAdResponse).a;
            this.b = ((POBAdResponse) pOBAdResponse).b;
            this.c = ((POBAdResponse) pOBAdResponse).c;
            this.d = ((POBAdResponse) pOBAdResponse).d;
            this.f = ((POBAdResponse) pOBAdResponse).f;
            this.g = ((POBAdResponse) pOBAdResponse).g;
            this.h = ((POBAdResponse) pOBAdResponse).h;
            this.e = ((POBAdResponse) pOBAdResponse).e;
        }

        public Builder(@NonNull JSONObject jSONObject) {
            this.a = new ArrayList();
            this.g = jSONObject;
        }

        private int a(POBAdDescriptor pOBAdDescriptor, POBAdFormat pOBAdFormat) {
            int i = a.a[pOBAdFormat.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (pOBAdDescriptor.isVideo()) {
                    return 3600000;
                }
                return POBCommonConstants.BANNER_BID_EXPIRE_TIME_IN_MILLIS;
            }
            if (i != 4) {
                return 3600000;
            }
            return POBCommonConstants.APP_OPEN_AD_BID_EXPIRE_TIME_IN_MILLIS;
        }
    }

    private POBAdResponse() {
        this.a = new ArrayList();
    }
}
