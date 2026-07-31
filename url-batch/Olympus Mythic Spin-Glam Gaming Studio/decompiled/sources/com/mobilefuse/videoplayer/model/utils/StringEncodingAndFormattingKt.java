package com.mobilefuse.videoplayer.model.utils;

import android.text.TextUtils;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.videoplayer.model.EnumWithValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringEncodingAndFormatting.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0002\u0010\n\u001a\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u000e\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\b¨\u0006\u000e"}, d2 = {"encodeUriComponent", "", "value", "collection", "", "enumCollectionToString", "Lcom/mobilefuse/videoplayer/model/EnumWithValue;", "formattedTimeToMillis", "", "formattedTime", "(Ljava/lang/String;)Ljava/lang/Long;", "getIso8601Timestamp", "millisToFormattedTime", "millis", "mobilefuse-video-player_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes4.dex */
public final class StringEncodingAndFormattingKt {
    @NotNull
    public static final String encodeUriComponent(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            String encode = URLEncoder.encode(value, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(encode, "URLEncoder.encode(value, \"UTF-8\")");
            return new Regex("%7E").replace(new Regex("%29").replace(new Regex("%28").replace(new Regex("%27").replace(new Regex("%21").replace(new Regex("\\+").replace(encode, "%20"), "!"), "'"), "("), ")"), "~");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return value;
        }
    }

    @NotNull
    public static final String encodeUriComponent(@NotNull Collection<String> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(encodeUriComponent((String) it.next()));
        }
        String join = TextUtils.join(StringUtils.COMMA, arrayList);
        Intrinsics.checkNotNullExpressionValue(join, "TextUtils.join(\",\", encodedItems)");
        return join;
    }

    @NotNull
    public static final String enumCollectionToString(@NotNull Collection<? extends EnumWithValue<?>> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumWithValue) it.next()).getStringValue());
        }
        String join = TextUtils.join(StringUtils.COMMA, arrayList);
        Intrinsics.checkNotNullExpressionValue(join, "TextUtils.join(\",\", values)");
        return join;
    }

    @NotNull
    public static final String getIso8601Timestamp() {
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(Date())");
        return format;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0009, B:5:0x0023, B:9:0x002c, B:11:0x005d, B:12:0x0063, B:13:0x0087, B:15:0x008d, B:17:0x0099, B:21:0x00a3, B:28:0x00a8, B:30:0x00be, B:31:0x00c6, B:33:0x00cc, B:35:0x00fe, B:47:0x0039, B:49:0x003f, B:51:0x004b, B:53:0x0051), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0009, B:5:0x0023, B:9:0x002c, B:11:0x005d, B:12:0x0063, B:13:0x0087, B:15:0x008d, B:17:0x0099, B:21:0x00a3, B:28:0x00a8, B:30:0x00be, B:31:0x00c6, B:33:0x00cc, B:35:0x00fe, B:47:0x0039, B:49:0x003f, B:51:0x004b, B:53:0x0051), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0009, B:5:0x0023, B:9:0x002c, B:11:0x005d, B:12:0x0063, B:13:0x0087, B:15:0x008d, B:17:0x0099, B:21:0x00a3, B:28:0x00a8, B:30:0x00be, B:31:0x00c6, B:33:0x00cc, B:35:0x00fe, B:47:0x0039, B:49:0x003f, B:51:0x004b, B:53:0x0051), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Long formattedTimeToMillis(@NotNull String formattedTime) {
        Either errorResult;
        List split$default;
        String str;
        int i;
        ArrayList arrayList;
        Iterator it;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(formattedTime, "formattedTime");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        Object obj = null;
        try {
            split$default = StringsKt.split$default((CharSequence) formattedTime, new String[]{"."}, false, 2, 2, (Object) null);
            str = (String) CollectionsKt.getOrNull(split$default, 1);
        } catch (Throwable th) {
            if (StringEncodingAndFormattingKt$formattedTimeToMillis$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (str != null) {
            int length = str.length();
            if (length != 1) {
                if (length == 2) {
                    Integer intOrNull = StringsKt.toIntOrNull(str);
                    if (intOrNull != null) {
                        valueOf = Integer.valueOf(intOrNull.intValue() * 10);
                    }
                    valueOf = null;
                } else {
                    valueOf = StringsKt.toIntOrNull(StringsKt.take(str, 3));
                }
                if (valueOf != null) {
                    i = valueOf.intValue();
                    List split$default2 = StringsKt.split$default((CharSequence) split$default.get(0), new String[]{":"}, false, 0, 6, (Object) null);
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default2, 10));
                    it = split$default2.iterator();
                    while (it.hasNext()) {
                        Integer intOrNull2 = StringsKt.toIntOrNull((String) it.next());
                        if (intOrNull2 != null) {
                            if (intOrNull2.intValue() < 0) {
                                intOrNull2 = null;
                            }
                            if (intOrNull2 != null) {
                                arrayList.add(intOrNull2);
                            }
                        }
                        return null;
                    }
                    Pair pair = TuplesKt.to(0L, 1L);
                    if (!arrayList.isEmpty()) {
                        ListIterator listIterator = arrayList.listIterator(arrayList.size());
                        while (listIterator.hasPrevious()) {
                            int intValue = ((Number) listIterator.previous()).intValue();
                            long longValue = ((Number) pair.component1()).longValue();
                            long longValue2 = ((Number) pair.component2()).longValue();
                            pair = TuplesKt.to(Long.valueOf(longValue + (intValue * longValue2)), Long.valueOf(longValue2 * 60));
                        }
                    }
                    errorResult = new SuccessResult(Long.valueOf((((Number) pair.getFirst()).longValue() * 1000) + i));
                    if (!(errorResult instanceof ErrorResult)) {
                    } else {
                        if (!(errorResult instanceof SuccessResult)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj = ((SuccessResult) errorResult).getValue();
                    }
                    return (Long) obj;
                }
            } else {
                Integer intOrNull3 = StringsKt.toIntOrNull(str);
                if (intOrNull3 != null) {
                    valueOf = Integer.valueOf(intOrNull3.intValue() * 100);
                    if (valueOf != null) {
                    }
                }
                valueOf = null;
                if (valueOf != null) {
                }
            }
        }
        i = 0;
        List split$default22 = StringsKt.split$default((CharSequence) split$default.get(0), new String[]{":"}, false, 0, 6, (Object) null);
        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default22, 10));
        it = split$default22.iterator();
        while (it.hasNext()) {
        }
        Pair pair2 = TuplesKt.to(0L, 1L);
        if (!arrayList.isEmpty()) {
        }
        errorResult = new SuccessResult(Long.valueOf((((Number) pair2.getFirst()).longValue() * 1000) + i));
        if (!(errorResult instanceof ErrorResult)) {
        }
        return (Long) obj;
    }

    @NotNull
    public static final String millisToFormattedTime(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(Long.valueOf(j));
        Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(millis)");
        return format;
    }
}
