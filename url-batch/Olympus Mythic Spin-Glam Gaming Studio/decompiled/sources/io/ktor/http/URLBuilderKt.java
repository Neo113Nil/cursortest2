package io.ktor.http;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: URLBuilder.kt */
/* loaded from: classes11.dex */
public abstract class URLBuilderKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final Appendable appendTo(URLBuilder uRLBuilder, Appendable appendable) {
        appendable.append(uRLBuilder.getProtocol().getName());
        String name = uRLBuilder.getProtocol().getName();
        switch (name.hashCode()) {
            case -1081572750:
                if (name.equals("mailto")) {
                    appendMailto(appendable, getEncodedUserAndPassword(uRLBuilder), uRLBuilder.getHost());
                    return appendable;
                }
                break;
            case 114715:
                if (name.equals("tel")) {
                    appendPayload(appendable, uRLBuilder.getHost());
                    return appendable;
                }
                break;
            case 3076010:
                if (name.equals("data")) {
                    appendPayload(appendable, uRLBuilder.getHost());
                    return appendable;
                }
                break;
            case 3143036:
                if (name.equals("file")) {
                    appendFile(appendable, uRLBuilder.getHost(), getEncodedPath(uRLBuilder));
                    return appendable;
                }
                break;
            case 92611469:
                if (name.equals("about")) {
                    appendPayload(appendable, uRLBuilder.getHost());
                    return appendable;
                }
                break;
        }
        appendable.append("://");
        appendable.append(getAuthority(uRLBuilder));
        URLUtilsKt.appendUrlFullPath(appendable, getEncodedPath(uRLBuilder), uRLBuilder.getEncodedParameters(), uRLBuilder.getTrailingQuery());
        if (uRLBuilder.getEncodedFragment().length() > 0) {
            appendable.append('#');
            appendable.append(uRLBuilder.getEncodedFragment());
        }
        return appendable;
    }

    private static final void appendMailto(Appendable appendable, String str, String str2) {
        appendable.append(":");
        appendable.append(str);
        appendable.append(str2);
    }

    private static final void appendFile(Appendable appendable, String str, String str2) {
        appendable.append("://");
        appendable.append(str);
        if (!StringsKt.startsWith$default((CharSequence) str2, '/', false, 2, (Object) null)) {
            appendable.append('/');
        }
        appendable.append(str2);
    }

    private static final void appendPayload(Appendable appendable, String str) {
        appendable.append(":");
        appendable.append(str);
    }

    public static final String getEncodedUserAndPassword(URLBuilder uRLBuilder) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        StringBuilder sb = new StringBuilder();
        URLUtilsKt.appendUserAndPassword(sb, uRLBuilder.getEncodedUser(), uRLBuilder.getEncodedPassword());
        return sb.toString();
    }

    public static final String getAuthority(URLBuilder uRLBuilder) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(getEncodedUserAndPassword(uRLBuilder));
        sb.append(uRLBuilder.getHost());
        if (uRLBuilder.getPort() != 0 && uRLBuilder.getPort() != uRLBuilder.getProtocol().getDefaultPort()) {
            sb.append(":");
            sb.append(String.valueOf(uRLBuilder.getPort()));
        }
        return sb.toString();
    }

    public static final String getEncodedPath(URLBuilder uRLBuilder) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        return joinPath(uRLBuilder.getEncodedPathSegments());
    }

    public static final void setEncodedPath(URLBuilder uRLBuilder, String value) {
        List root_path;
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        if (StringsKt.isBlank(value)) {
            root_path = CollectionsKt.emptyList();
        } else {
            root_path = Intrinsics.areEqual(value, "/") ? URLParserKt.getROOT_PATH() : CollectionsKt.toMutableList((Collection) StringsKt.split$default((CharSequence) value, new char[]{'/'}, false, 0, 6, (Object) null));
        }
        uRLBuilder.setEncodedPathSegments(root_path);
    }

    private static final String joinPath(List list) {
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) CollectionsKt.first(list)).length() == 0 ? "/" : (String) CollectionsKt.first(list);
        }
        return CollectionsKt.joinToString$default(list, "/", null, null, 0, null, null, 62, null);
    }
}
