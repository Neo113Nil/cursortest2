package com.revenuecat.purchases.ads.events.types;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AdRevenuePrecision.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", InAppPurchaseConstants.METHOD_TO_STRING, "toString-impl", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes7.dex */
public final class AdRevenuePrecision {
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXACT = m10567constructorimpl("exact");
    private static final String PUBLISHER_DEFINED = m10567constructorimpl("publisher_defined");
    private static final String ESTIMATED = m10567constructorimpl("estimated");
    private static final String UNKNOWN = m10567constructorimpl("unknown");

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdRevenuePrecision m10566boximpl(String str) {
        return new AdRevenuePrecision(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m10567constructorimpl(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10568equalsimpl(String str, Object obj) {
        return (obj instanceof AdRevenuePrecision) && Intrinsics.areEqual(str, ((AdRevenuePrecision) obj).getValue());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10569equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10570hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10571toStringimpl(String str) {
        return "AdRevenuePrecision(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m10568equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m10570hashCodeimpl(this.value);
    }

    public String toString() {
        return m10571toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ String getValue() {
        return this.value;
    }

    /* compiled from: AdRevenuePrecision.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision$Companion;", "", "()V", "ESTIMATED", "Lcom/revenuecat/purchases/ads/events/types/AdRevenuePrecision;", "getESTIMATED-rAcPn4k", "()Ljava/lang/String;", "Ljava/lang/String;", "EXACT", "getEXACT-rAcPn4k", "PUBLISHER_DEFINED", "getPUBLISHER_DEFINED-rAcPn4k", "UNKNOWN", "getUNKNOWN-rAcPn4k", "fromString", "value", "", "fromString-QAIqrgA", "(Ljava/lang/String;)Ljava/lang/String;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getEXACT-rAcPn4k, reason: not valid java name */
        public final String m10575getEXACTrAcPn4k() {
            return AdRevenuePrecision.EXACT;
        }

        /* renamed from: getPUBLISHER_DEFINED-rAcPn4k, reason: not valid java name */
        public final String m10576getPUBLISHER_DEFINEDrAcPn4k() {
            return AdRevenuePrecision.PUBLISHER_DEFINED;
        }

        /* renamed from: getESTIMATED-rAcPn4k, reason: not valid java name */
        public final String m10574getESTIMATEDrAcPn4k() {
            return AdRevenuePrecision.ESTIMATED;
        }

        /* renamed from: getUNKNOWN-rAcPn4k, reason: not valid java name */
        public final String m10577getUNKNOWNrAcPn4k() {
            return AdRevenuePrecision.UNKNOWN;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        /* renamed from: fromString-QAIqrgA, reason: not valid java name */
        public final String m10573fromStringQAIqrgA(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            String lowerCase = value.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String obj = StringsKt.trim((CharSequence) lowerCase).toString();
            switch (obj.hashCode()) {
                case -623607748:
                    if (obj.equals("estimated")) {
                        return m10574getESTIMATEDrAcPn4k();
                    }
                    break;
                case -284840886:
                    if (obj.equals("unknown")) {
                        return m10577getUNKNOWNrAcPn4k();
                    }
                    break;
                case 96946943:
                    if (obj.equals("exact")) {
                        return m10575getEXACTrAcPn4k();
                    }
                    break;
                case 655944390:
                    if (obj.equals("publisher_defined")) {
                        return m10576getPUBLISHER_DEFINEDrAcPn4k();
                    }
                    break;
            }
            return AdRevenuePrecision.m10567constructorimpl(value);
        }
    }

    private /* synthetic */ AdRevenuePrecision(String str) {
        this.value = str;
    }
}
