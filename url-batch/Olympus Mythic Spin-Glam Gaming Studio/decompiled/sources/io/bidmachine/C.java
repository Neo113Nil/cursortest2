package io.bidmachine;

import android.content.Context;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.BoolValue;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.core.TimeManager;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.sdk.ContextualData;
import io.bidmachine.protobuf.sdk.Session;
import io.bidmachine.utils.time.DateUtils;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
final class C {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdsType.values().length];
            a = iArr;
            try {
                iArr[AdsType.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AdsType.Interstitial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AdsType.Rewarded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AdsType.Native.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    C() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Session.Context.Builder builder, Object obj) {
        if (obj instanceof Boolean) {
            builder.setIaa(BoolValue.of(((Boolean) obj).booleanValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(ContextualData.ImpressionData.Builder builder, Object obj) {
        builder.setImcurl(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(ContextualData.ImpressionData.Builder builder, Object obj) {
        builder.setClcurl(obj.toString());
    }

    void a(Context context, RequestTokenPayload.Builder builder, String str, AdsType adsType) {
        Session.Builder a2 = a(context, str, adsType);
        if (a2 != null) {
            builder.setSession(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(ContextualData.ImpressionData.Builder builder, Object obj) {
        builder.setAgency(obj.toString());
    }

    void a(Context context, Context.User.Builder builder, String str, AdsType adsType) {
        Session.Builder a2 = a(context, str, adsType);
        if (a2 != null) {
            builder.addExtProto(Any.pack(a2.build()));
        }
    }

    private Session.Builder a(android.content.Context context, String str, AdsType adsType) {
        try {
            final Session.Builder sessionId = Session.newBuilder().setSessionId(str);
            Session.Context.Builder a2 = a(context, adsType);
            Objects.requireNonNull(sessionId);
            Utils.ifNotNull(a2, new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda8
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    Session.Builder.this.setContext((Session.Context.Builder) obj);
                }
            });
            return sessionId;
        } catch (Throwable unused) {
            return null;
        }
    }

    private Session.Context.Builder a(android.content.Context context, AdsType adsType) {
        try {
            Date date = new Date(n.C(context));
            SessionManager sessionManager = SessionManager.get();
            final Session.Context.Builder retention = Session.Context.newBuilder().setSessionduration(sessionManager.getSessionDurationSec()).setLastSessionDuration(sessionManager.getLastSessionDurationSec()).setSc(SessionManager.get().getSessionCount()).setRetention(DateUtils.daysBetween(date, new Date(TimeManager.currentTimeMillis())));
            for (Map.Entry<String, Map<String, Object>> entry : BidMachineAnalytics.getImpData(a(adsType)).entrySet()) {
                Map<String, Object> value = entry.getValue();
                if (!value.isEmpty()) {
                    ContextualData.Builder a2 = a(adsType, entry.getKey(), value);
                    Objects.requireNonNull(retention);
                    Utils.ifNotNull(a2, new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda11
                        @Override // io.bidmachine.Executable
                        public final void execute(Object obj) {
                            Session.Context.Builder.this.addData((ContextualData.Builder) obj);
                        }
                    });
                }
            }
            Utils.ifNotNull(BidMachineAnalytics.getProperty("iap"), new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda12
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    C.a(Session.Context.Builder.this, obj);
                }
            });
            Utils.ifNotNull(BidMachineAnalytics.getProperty("iaa"), new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda13
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    C.b(Session.Context.Builder.this, obj);
                }
            });
            return retention;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Session.Context.Builder builder, Object obj) {
        if (obj instanceof Boolean) {
            builder.setIap(BoolValue.of(((Boolean) obj).booleanValue()));
        }
    }

    private ContextualData.Builder a(AdsType adsType, String str, Map map) {
        try {
            final ContextualData.Builder mediatorName = ContextualData.newBuilder().setMediatorName(str);
            Utils.ifNotNull(adsType, new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda9
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    C.a(ContextualData.Builder.this, (AdsType) obj);
                }
            });
            ContextualData.ImpressionData.Builder a2 = a(map);
            Objects.requireNonNull(mediatorName);
            Utils.ifNotNull(a2, new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda10
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ContextualData.Builder.this.setData((ContextualData.ImpressionData.Builder) obj);
                }
            });
            return mediatorName;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ContextualData.Builder builder, AdsType adsType) {
        builder.setPlacement(adsType.getName());
    }

    private ContextualData.ImpressionData.Builder a(Map map) {
        try {
            final ContextualData.ImpressionData.Builder newBuilder = ContextualData.ImpressionData.newBuilder();
            Integer convertToIntOrDefault = Utils.convertToIntOrDefault(map.get("imimd"), null);
            Objects.requireNonNull(newBuilder);
            Utils.ifNotNull(convertToIntOrDefault, new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ContextualData.ImpressionData.Builder.this.setImimd(((Integer) obj).intValue());
                }
            });
            Utils.ifNotNull(Utils.convertToIntOrDefault(map.get("imd"), null), new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda1
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ContextualData.ImpressionData.Builder.this.setImd(((Integer) obj).intValue());
                }
            });
            Utils.ifNotNull(Utils.convertToFloatOrDefault(map.get("imwp"), null), new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda2
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ContextualData.ImpressionData.Builder.this.setImwp(((Float) obj).floatValue());
                }
            });
            Utils.ifNotNull(Utils.convertToFloatOrDefault(map.get("wp"), null), new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda3
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ContextualData.ImpressionData.Builder.this.setWp(((Float) obj).floatValue());
                }
            });
            Utils.ifNotNull(map.get("imagency"), new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda4
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    C.a(ContextualData.ImpressionData.Builder.this, obj);
                }
            });
            Utils.ifNotNull(map.get("agency"), new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda5
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    C.b(ContextualData.ImpressionData.Builder.this, obj);
                }
            });
            Utils.ifNotNull(map.get("imcurl"), new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda6
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    C.c(ContextualData.ImpressionData.Builder.this, obj);
                }
            });
            Utils.ifNotNull(map.get("clcurl"), new Executable() { // from class: io.bidmachine.C$$ExternalSyntheticLambda7
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    C.d(ContextualData.ImpressionData.Builder.this, obj);
                }
            });
            return newBuilder;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(ContextualData.ImpressionData.Builder builder, Object obj) {
        builder.setImagency(obj.toString());
    }

    private int a(AdsType adsType) {
        if (adsType == null) {
            return 0;
        }
        int i = a.a[adsType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }
}
